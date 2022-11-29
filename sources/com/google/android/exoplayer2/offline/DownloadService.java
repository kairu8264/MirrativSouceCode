package com.google.android.exoplayer2.offline;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class DownloadService extends Service {
    public static final String ACTION_ADD_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
    public static final String ACTION_PAUSE_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final String ACTION_REMOVE_ALL_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final String ACTION_REMOVE_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    private static final String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
    public static final String ACTION_RESUME_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final String ACTION_SET_REQUIREMENTS = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final String ACTION_SET_STOP_REASON = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON";
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
    public static final String KEY_CONTENT_ID = "content_id";
    public static final String KEY_DOWNLOAD_REQUEST = "download_request";
    public static final String KEY_FOREGROUND = "foreground";
    public static final String KEY_REQUIREMENTS = "requirements";
    public static final String KEY_STOP_REASON = "stop_reason";
    private static final String TAG = "DownloadService";
    private static final HashMap<Class<? extends DownloadService>, DownloadManagerHelper> downloadManagerHelpers = new HashMap<>();
    private final int channelDescriptionResourceId;
    private final String channelId;
    private final int channelNameResourceId;
    private DownloadManager downloadManager;
    private final ForegroundNotificationUpdater foregroundNotificationUpdater;
    private boolean isDestroyed;
    private boolean isStopped;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;

    /* loaded from: classes3.dex */
    public static final class DownloadManagerHelper implements DownloadManager.Listener {
        private final Context context;
        private final DownloadManager downloadManager;
        private DownloadService downloadService;
        private final boolean foregroundAllowed;
        private final Scheduler scheduler;
        private final Class<? extends DownloadService> serviceClass;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$attachService$0(DownloadService downloadService) {
            downloadService.notifyDownloads(this.downloadManager.getCurrentDownloads());
        }

        private void restartService() {
            if (this.foregroundAllowed) {
                Util.startForegroundService(this.context, DownloadService.getIntent(this.context, this.serviceClass, DownloadService.ACTION_RESTART));
                return;
            }
            try {
                this.context.startService(DownloadService.getIntent(this.context, this.serviceClass, DownloadService.ACTION_INIT));
            } catch (IllegalStateException unused) {
                Log.w(DownloadService.TAG, "Failed to restart DownloadService (process is idle).");
            }
        }

        private boolean serviceMayNeedRestart() {
            DownloadService downloadService = this.downloadService;
            return downloadService == null || downloadService.isStopped();
        }

        private void updateScheduler() {
            if (this.scheduler == null) {
                return;
            }
            if (this.downloadManager.isWaitingForRequirements()) {
                String packageName = this.context.getPackageName();
                if (this.scheduler.schedule(this.downloadManager.getRequirements(), packageName, DownloadService.ACTION_RESTART)) {
                    return;
                }
                Log.e(DownloadService.TAG, "Scheduling downloads failed.");
                return;
            }
            this.scheduler.cancel();
        }

        public void attachService(final DownloadService downloadService) {
            Assertions.checkState(this.downloadService == null);
            this.downloadService = downloadService;
            if (this.downloadManager.isInitialized()) {
                Util.createHandlerForCurrentOrMainLooper().postAtFrontOfQueue(new Runnable() { // from class: com.google.android.exoplayer2.offline.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        DownloadService.DownloadManagerHelper.this.lambda$attachService$0(downloadService);
                    }
                });
            }
        }

        public void detachService(DownloadService downloadService) {
            Assertions.checkState(this.downloadService == downloadService);
            this.downloadService = null;
            if (this.scheduler == null || this.downloadManager.isWaitingForRequirements()) {
                return;
            }
            this.scheduler.cancel();
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc) {
            DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.notifyDownloadChanged(download);
            }
            if (serviceMayNeedRestart() && DownloadService.needsStartedService(download.state)) {
                Log.w(DownloadService.TAG, "DownloadService wasn't running. Restarting.");
                restartService();
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onDownloadRemoved(DownloadManager downloadManager, Download download) {
            DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.notifyDownloadRemoved(download);
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onIdle(DownloadManager downloadManager) {
            DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.stop();
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onInitialized(DownloadManager downloadManager) {
            DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.notifyDownloads(downloadManager.getCurrentDownloads());
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z10) {
            if (!z10 && !downloadManager.getDownloadsPaused() && serviceMayNeedRestart()) {
                List<Download> currentDownloads = downloadManager.getCurrentDownloads();
                int i10 = 0;
                while (true) {
                    if (i10 >= currentDownloads.size()) {
                        break;
                    } else if (currentDownloads.get(i10).state == 0) {
                        restartService();
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            updateScheduler();
        }

        private DownloadManagerHelper(Context context, DownloadManager downloadManager, boolean z10, Scheduler scheduler, Class<? extends DownloadService> cls) {
            this.context = context;
            this.downloadManager = downloadManager;
            this.foregroundAllowed = z10;
            this.scheduler = scheduler;
            this.serviceClass = cls;
            downloadManager.addListener(this);
            updateScheduler();
        }
    }

    /* loaded from: classes3.dex */
    public final class ForegroundNotificationUpdater {
        private final Handler handler = new Handler(Looper.getMainLooper());
        private boolean notificationDisplayed;
        private final int notificationId;
        private boolean periodicUpdatesStarted;
        private final long updateInterval;

        public ForegroundNotificationUpdater(int i10, long j10) {
            this.notificationId = i10;
            this.updateInterval = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void update() {
            List<Download> currentDownloads = ((DownloadManager) Assertions.checkNotNull(DownloadService.this.downloadManager)).getCurrentDownloads();
            DownloadService downloadService = DownloadService.this;
            downloadService.startForeground(this.notificationId, downloadService.getForegroundNotification(currentDownloads));
            this.notificationDisplayed = true;
            if (this.periodicUpdatesStarted) {
                this.handler.removeCallbacksAndMessages(null);
                this.handler.postDelayed(new Runnable() { // from class: com.google.android.exoplayer2.offline.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        DownloadService.ForegroundNotificationUpdater.this.update();
                    }
                }, this.updateInterval);
            }
        }

        public void invalidate() {
            if (this.notificationDisplayed) {
                update();
            }
        }

        public void showNotificationIfNotAlready() {
            if (this.notificationDisplayed) {
                return;
            }
            update();
        }

        public void startPeriodicUpdates() {
            this.periodicUpdatesStarted = true;
            update();
        }

        public void stopPeriodicUpdates() {
            this.periodicUpdatesStarted = false;
            this.handler.removeCallbacksAndMessages(null);
        }
    }

    public DownloadService(int i10) {
        this(i10, 1000L);
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z10) {
        return buildAddDownloadIntent(context, cls, downloadRequest, 0, z10);
    }

    public static Intent buildPauseDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return getIntent(context, cls, ACTION_PAUSE_DOWNLOADS, z10);
    }

    public static Intent buildRemoveAllDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return getIntent(context, cls, ACTION_REMOVE_ALL_DOWNLOADS, z10);
    }

    public static Intent buildRemoveDownloadIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z10) {
        return getIntent(context, cls, ACTION_REMOVE_DOWNLOAD, z10).putExtra(KEY_CONTENT_ID, str);
    }

    public static Intent buildResumeDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return getIntent(context, cls, ACTION_RESUME_DOWNLOADS, z10);
    }

    public static Intent buildSetRequirementsIntent(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z10) {
        return getIntent(context, cls, ACTION_SET_REQUIREMENTS, z10).putExtra(KEY_REQUIREMENTS, requirements);
    }

    public static Intent buildSetStopReasonIntent(Context context, Class<? extends DownloadService> cls, String str, int i10, boolean z10) {
        return getIntent(context, cls, ACTION_SET_STOP_REASON, z10).putExtra(KEY_CONTENT_ID, str).putExtra(KEY_STOP_REASON, i10);
    }

    private static Intent getIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z10) {
        return getIntent(context, cls, str).putExtra(KEY_FOREGROUND, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isStopped() {
        return this.isStopped;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean needsStartedService(int i10) {
        return i10 == 2 || i10 == 5 || i10 == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloadChanged(Download download) {
        onDownloadChanged(download);
        if (this.foregroundNotificationUpdater != null) {
            if (needsStartedService(download.state)) {
                this.foregroundNotificationUpdater.startPeriodicUpdates();
            } else {
                this.foregroundNotificationUpdater.invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloadRemoved(Download download) {
        onDownloadRemoved(download);
        ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater != null) {
            foregroundNotificationUpdater.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloads(List<Download> list) {
        if (this.foregroundNotificationUpdater != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (needsStartedService(list.get(i10).state)) {
                    this.foregroundNotificationUpdater.startPeriodicUpdates();
                    return;
                }
            }
        }
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z10) {
        startService(context, buildAddDownloadIntent(context, cls, downloadRequest, z10), z10);
    }

    public static void sendPauseDownloads(Context context, Class<? extends DownloadService> cls, boolean z10) {
        startService(context, buildPauseDownloadsIntent(context, cls, z10), z10);
    }

    public static void sendRemoveAllDownloads(Context context, Class<? extends DownloadService> cls, boolean z10) {
        startService(context, buildRemoveAllDownloadsIntent(context, cls, z10), z10);
    }

    public static void sendRemoveDownload(Context context, Class<? extends DownloadService> cls, String str, boolean z10) {
        startService(context, buildRemoveDownloadIntent(context, cls, str, z10), z10);
    }

    public static void sendResumeDownloads(Context context, Class<? extends DownloadService> cls, boolean z10) {
        startService(context, buildResumeDownloadsIntent(context, cls, z10), z10);
    }

    public static void sendSetRequirements(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z10) {
        startService(context, buildSetRequirementsIntent(context, cls, requirements, z10), z10);
    }

    public static void sendSetStopReason(Context context, Class<? extends DownloadService> cls, String str, int i10, boolean z10) {
        startService(context, buildSetStopReasonIntent(context, cls, str, i10, z10), z10);
    }

    public static void start(Context context, Class<? extends DownloadService> cls) {
        context.startService(getIntent(context, cls, ACTION_INIT));
    }

    public static void startForeground(Context context, Class<? extends DownloadService> cls) {
        Util.startForegroundService(context, getIntent(context, cls, ACTION_INIT, true));
    }

    private static void startService(Context context, Intent intent, boolean z10) {
        if (z10) {
            Util.startForegroundService(context, intent);
        } else {
            context.startService(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stop() {
        ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater != null) {
            foregroundNotificationUpdater.stopPeriodicUpdates();
        }
        if (Util.SDK_INT < 28 && this.taskRemoved) {
            stopSelf();
            this.isStopped = true;
            return;
        }
        this.isStopped |= stopSelfResult(this.lastStartId);
    }

    public abstract DownloadManager getDownloadManager();

    public abstract Notification getForegroundNotification(List<Download> list);

    public abstract Scheduler getScheduler();

    public final void invalidateForegroundNotification() {
        ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater == null || this.isDestroyed) {
            return;
        }
        foregroundNotificationUpdater.invalidate();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public void onCreate() {
        String str = this.channelId;
        if (str != null) {
            NotificationUtil.createNotificationChannel(this, str, this.channelNameResourceId, this.channelDescriptionResourceId, 2);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends DownloadService>, DownloadManagerHelper> hashMap = downloadManagerHelpers;
        DownloadManagerHelper downloadManagerHelper = (DownloadManagerHelper) hashMap.get(cls);
        if (downloadManagerHelper != null) {
            this.downloadManager = downloadManagerHelper.downloadManager;
        } else {
            boolean z10 = this.foregroundNotificationUpdater != null;
            Scheduler scheduler = z10 ? getScheduler() : null;
            DownloadManager downloadManager = getDownloadManager();
            this.downloadManager = downloadManager;
            downloadManager.resumeDownloads();
            downloadManagerHelper = new DownloadManagerHelper(getApplicationContext(), this.downloadManager, z10, scheduler, cls);
            hashMap.put(cls, downloadManagerHelper);
        }
        downloadManagerHelper.attachService(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.isDestroyed = true;
        ((DownloadManagerHelper) Assertions.checkNotNull(downloadManagerHelpers.get(getClass()))).detachService(this);
        ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater != null) {
            foregroundNotificationUpdater.stopPeriodicUpdates();
        }
    }

    @Deprecated
    public void onDownloadChanged(Download download) {
    }

    @Deprecated
    public void onDownloadRemoved(Download download) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        String str;
        ForegroundNotificationUpdater foregroundNotificationUpdater;
        this.lastStartId = i11;
        this.taskRemoved = false;
        String str2 = null;
        if (intent != null) {
            str2 = intent.getAction();
            str = intent.getStringExtra(KEY_CONTENT_ID);
            this.startedInForeground |= intent.getBooleanExtra(KEY_FOREGROUND, false) || ACTION_RESTART.equals(str2);
        } else {
            str = null;
        }
        if (str2 == null) {
            str2 = ACTION_INIT;
        }
        DownloadManager downloadManager = (DownloadManager) Assertions.checkNotNull(this.downloadManager);
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -1931239035:
                if (str2.equals(ACTION_ADD_DOWNLOAD)) {
                    c10 = 0;
                    break;
                }
                break;
            case -932047176:
                if (str2.equals(ACTION_RESUME_DOWNLOADS)) {
                    c10 = 1;
                    break;
                }
                break;
            case -871181424:
                if (str2.equals(ACTION_RESTART)) {
                    c10 = 2;
                    break;
                }
                break;
            case -650547439:
                if (str2.equals(ACTION_REMOVE_ALL_DOWNLOADS)) {
                    c10 = 3;
                    break;
                }
                break;
            case -119057172:
                if (str2.equals(ACTION_SET_REQUIREMENTS)) {
                    c10 = 4;
                    break;
                }
                break;
            case 191112771:
                if (str2.equals(ACTION_PAUSE_DOWNLOADS)) {
                    c10 = 5;
                    break;
                }
                break;
            case 671523141:
                if (str2.equals(ACTION_SET_STOP_REASON)) {
                    c10 = 6;
                    break;
                }
                break;
            case 1015676687:
                if (str2.equals(ACTION_INIT)) {
                    c10 = 7;
                    break;
                }
                break;
            case 1547520644:
                if (str2.equals(ACTION_REMOVE_DOWNLOAD)) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                DownloadRequest downloadRequest = (DownloadRequest) ((Intent) Assertions.checkNotNull(intent)).getParcelableExtra(KEY_DOWNLOAD_REQUEST);
                if (downloadRequest == null) {
                    Log.e(TAG, "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                } else {
                    downloadManager.addDownload(downloadRequest, intent.getIntExtra(KEY_STOP_REASON, 0));
                    break;
                }
            case 1:
                downloadManager.resumeDownloads();
                break;
            case 2:
            case 7:
                break;
            case 3:
                downloadManager.removeAllDownloads();
                break;
            case 4:
                Requirements requirements = (Requirements) ((Intent) Assertions.checkNotNull(intent)).getParcelableExtra(KEY_REQUIREMENTS);
                if (requirements == null) {
                    Log.e(TAG, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                } else {
                    Scheduler scheduler = getScheduler();
                    if (scheduler != null) {
                        Requirements supportedRequirements = scheduler.getSupportedRequirements(requirements);
                        if (!supportedRequirements.equals(requirements)) {
                            Log.w(TAG, "Ignoring requirements not supported by the Scheduler: " + (requirements.getRequirements() ^ supportedRequirements.getRequirements()));
                            requirements = supportedRequirements;
                        }
                    }
                    downloadManager.setRequirements(requirements);
                    break;
                }
            case 5:
                downloadManager.pauseDownloads();
                break;
            case 6:
                if (!((Intent) Assertions.checkNotNull(intent)).hasExtra(KEY_STOP_REASON)) {
                    Log.e(TAG, "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    downloadManager.setStopReason(str, intent.getIntExtra(KEY_STOP_REASON, 0));
                    break;
                }
            case '\b':
                if (str == null) {
                    Log.e(TAG, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                } else {
                    downloadManager.removeDownload(str);
                    break;
                }
            default:
                Log.e(TAG, "Ignored unrecognized action: " + str2);
                break;
        }
        if (Util.SDK_INT >= 26 && this.startedInForeground && (foregroundNotificationUpdater = this.foregroundNotificationUpdater) != null) {
            foregroundNotificationUpdater.showNotificationIfNotAlready();
        }
        this.isStopped = false;
        if (downloadManager.isIdle()) {
            stop();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.taskRemoved = true;
    }

    public DownloadService(int i10, long j10) {
        this(i10, j10, null, 0, 0);
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i10, boolean z10) {
        return getIntent(context, cls, ACTION_ADD_DOWNLOAD, z10).putExtra(KEY_DOWNLOAD_REQUEST, downloadRequest).putExtra(KEY_STOP_REASON, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent getIntent(Context context, Class<? extends DownloadService> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    @Deprecated
    public DownloadService(int i10, long j10, String str, int i11) {
        this(i10, j10, str, i11, 0);
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i10, boolean z10) {
        startService(context, buildAddDownloadIntent(context, cls, downloadRequest, i10, z10), z10);
    }

    public DownloadService(int i10, long j10, String str, int i11, int i12) {
        if (i10 == 0) {
            this.foregroundNotificationUpdater = null;
            this.channelId = null;
            this.channelNameResourceId = 0;
            this.channelDescriptionResourceId = 0;
            return;
        }
        this.foregroundNotificationUpdater = new ForegroundNotificationUpdater(i10, j10);
        this.channelId = str;
        this.channelNameResourceId = i11;
        this.channelDescriptionResourceId = i12;
    }
}
