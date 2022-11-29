package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class DownloadManager {
    public static final int DEFAULT_MAX_PARALLEL_DOWNLOADS = 3;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    public static final Requirements DEFAULT_REQUIREMENTS = new Requirements(1);
    private static final int MSG_ADD_DOWNLOAD = 6;
    private static final int MSG_CONTENT_LENGTH_CHANGED = 10;
    private static final int MSG_DOWNLOAD_UPDATE = 2;
    private static final int MSG_INITIALIZE = 0;
    private static final int MSG_INITIALIZED = 0;
    private static final int MSG_PROCESSED = 1;
    private static final int MSG_RELEASE = 12;
    private static final int MSG_REMOVE_ALL_DOWNLOADS = 8;
    private static final int MSG_REMOVE_DOWNLOAD = 7;
    private static final int MSG_SET_DOWNLOADS_PAUSED = 1;
    private static final int MSG_SET_MAX_PARALLEL_DOWNLOADS = 4;
    private static final int MSG_SET_MIN_RETRY_COUNT = 5;
    private static final int MSG_SET_NOT_MET_REQUIREMENTS = 2;
    private static final int MSG_SET_STOP_REASON = 3;
    private static final int MSG_TASK_STOPPED = 9;
    private static final int MSG_UPDATE_PROGRESS = 11;
    private static final String TAG = "DownloadManager";
    private int activeTaskCount;
    private final Handler applicationHandler;
    private final Context context;
    private final WritableDownloadIndex downloadIndex;
    private List<Download> downloads;
    private boolean downloadsPaused;
    private boolean initialized;
    private final InternalHandler internalHandler;
    private final CopyOnWriteArraySet<Listener> listeners;
    private int maxParallelDownloads;
    private int minRetryCount;
    private int notMetRequirements;
    private int pendingMessages;
    private final RequirementsWatcher.Listener requirementsListener;
    private RequirementsWatcher requirementsWatcher;
    private boolean waitingForRequirements;

    /* loaded from: classes3.dex */
    public static final class DownloadUpdate {
        public final Download download;
        public final List<Download> downloads;
        public final Exception finalException;
        public final boolean isRemove;

        public DownloadUpdate(Download download, boolean z10, List<Download> list, Exception exc) {
            this.download = download;
            this.isRemove = z10;
            this.downloads = list;
            this.finalException = exc;
        }
    }

    /* loaded from: classes3.dex */
    public interface Listener {
        default void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc) {
        }

        default void onDownloadRemoved(DownloadManager downloadManager, Download download) {
        }

        default void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z10) {
        }

        default void onIdle(DownloadManager downloadManager) {
        }

        default void onInitialized(DownloadManager downloadManager) {
        }

        default void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i10) {
        }

        default void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z10) {
        }
    }

    /* loaded from: classes3.dex */
    public static class Task extends Thread implements Downloader.ProgressListener {
        private long contentLength;
        private final DownloadProgress downloadProgress;
        private final Downloader downloader;
        private Exception finalException;
        private volatile InternalHandler internalHandler;
        private volatile boolean isCanceled;
        private final boolean isRemove;
        private final int minRetryCount;
        private final DownloadRequest request;

        private static int getRetryDelayMillis(int i10) {
            return Math.min((i10 - 1) * 1000, 5000);
        }

        public void cancel(boolean z10) {
            if (z10) {
                this.internalHandler = null;
            }
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            this.downloader.cancel();
            interrupt();
        }

        @Override // com.google.android.exoplayer2.offline.Downloader.ProgressListener
        public void onProgress(long j10, long j11, float f10) {
            this.downloadProgress.bytesDownloaded = j11;
            this.downloadProgress.percentDownloaded = f10;
            if (j10 != this.contentLength) {
                this.contentLength = j10;
                InternalHandler internalHandler = this.internalHandler;
                if (internalHandler != null) {
                    internalHandler.obtainMessage(10, (int) (j10 >> 32), (int) j10, this).sendToTarget();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.isRemove) {
                    this.downloader.remove();
                } else {
                    long j10 = -1;
                    int i10 = 0;
                    while (!this.isCanceled) {
                        try {
                            this.downloader.download(this);
                            break;
                        } catch (IOException e10) {
                            if (!this.isCanceled) {
                                long j11 = this.downloadProgress.bytesDownloaded;
                                if (j11 != j10) {
                                    i10 = 0;
                                    j10 = j11;
                                }
                                i10++;
                                if (i10 <= this.minRetryCount) {
                                    Thread.sleep(getRetryDelayMillis(i10));
                                } else {
                                    throw e10;
                                }
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e11) {
                this.finalException = e11;
            }
            InternalHandler internalHandler = this.internalHandler;
            if (internalHandler != null) {
                internalHandler.obtainMessage(9, this).sendToTarget();
            }
        }

        private Task(DownloadRequest downloadRequest, Downloader downloader, DownloadProgress downloadProgress, boolean z10, int i10, InternalHandler internalHandler) {
            this.request = downloadRequest;
            this.downloader = downloader;
            this.downloadProgress = downloadProgress;
            this.isRemove = z10;
            this.minRetryCount = i10;
            this.internalHandler = internalHandler;
            this.contentLength = -1L;
        }
    }

    @Deprecated
    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory factory) {
        this(context, databaseProvider, cache, factory, a.f26900w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMainMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            onInitialized((List) message.obj);
        } else if (i10 == 1) {
            onMessageProcessed(message.arg1, message.arg2);
        } else if (i10 == 2) {
            onDownloadUpdate((DownloadUpdate) message.obj);
        } else {
            throw new IllegalStateException();
        }
        return true;
    }

    public static Download mergeRequest(Download download, DownloadRequest downloadRequest, int i10, long j10) {
        int i11;
        int i12 = download.state;
        long j11 = (i12 == 5 || download.isTerminalState()) ? j10 : download.startTimeMs;
        if (i12 == 5 || i12 == 7) {
            i11 = 7;
        } else {
            i11 = i10 != 0 ? 1 : 0;
        }
        return new Download(download.request.copyWithMergedRequest(downloadRequest), i11, j11, j10, -1L, i10, 0);
    }

    private void notifyWaitingForRequirementsChanged() {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onWaitingForRequirementsChanged(this, this.waitingForRequirements);
        }
    }

    private void onDownloadUpdate(DownloadUpdate downloadUpdate) {
        this.downloads = Collections.unmodifiableList(downloadUpdate.downloads);
        Download download = downloadUpdate.download;
        boolean updateWaitingForRequirements = updateWaitingForRequirements();
        if (downloadUpdate.isRemove) {
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onDownloadRemoved(this, download);
            }
        } else {
            Iterator<Listener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                it2.next().onDownloadChanged(this, download, downloadUpdate.finalException);
            }
        }
        if (updateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void onInitialized(List<Download> list) {
        this.initialized = true;
        this.downloads = Collections.unmodifiableList(list);
        boolean updateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onInitialized(this);
        }
        if (updateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void onMessageProcessed(int i10, int i11) {
        this.pendingMessages -= i10;
        this.activeTaskCount = i11;
        if (isIdle()) {
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onIdle(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i10) {
        Requirements requirements = requirementsWatcher.getRequirements();
        if (this.notMetRequirements != i10) {
            this.notMetRequirements = i10;
            this.pendingMessages++;
            this.internalHandler.obtainMessage(2, i10, 0).sendToTarget();
        }
        boolean updateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRequirementsStateChanged(this, requirements, i10);
        }
        if (updateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void setDownloadsPaused(boolean z10) {
        if (this.downloadsPaused == z10) {
            return;
        }
        this.downloadsPaused = z10;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
        boolean updateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDownloadsPausedChanged(this, z10);
        }
        if (updateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private boolean updateWaitingForRequirements() {
        boolean z10;
        if (!this.downloadsPaused && this.notMetRequirements != 0) {
            for (int i10 = 0; i10 < this.downloads.size(); i10++) {
                if (this.downloads.get(i10).state == 0) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        boolean z11 = this.waitingForRequirements != z10;
        this.waitingForRequirements = z10;
        return z11;
    }

    public void addDownload(DownloadRequest downloadRequest) {
        addDownload(downloadRequest, 0);
    }

    public void addListener(Listener listener) {
        Assertions.checkNotNull(listener);
        this.listeners.add(listener);
    }

    public Looper getApplicationLooper() {
        return this.applicationHandler.getLooper();
    }

    public List<Download> getCurrentDownloads() {
        return this.downloads;
    }

    public DownloadIndex getDownloadIndex() {
        return this.downloadIndex;
    }

    public boolean getDownloadsPaused() {
        return this.downloadsPaused;
    }

    public int getMaxParallelDownloads() {
        return this.maxParallelDownloads;
    }

    public int getMinRetryCount() {
        return this.minRetryCount;
    }

    public int getNotMetRequirements() {
        return this.notMetRequirements;
    }

    public Requirements getRequirements() {
        return this.requirementsWatcher.getRequirements();
    }

    public boolean isIdle() {
        return this.activeTaskCount == 0 && this.pendingMessages == 0;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public boolean isWaitingForRequirements() {
        return this.waitingForRequirements;
    }

    public void pauseDownloads() {
        setDownloadsPaused(true);
    }

    public void release() {
        synchronized (this.internalHandler) {
            InternalHandler internalHandler = this.internalHandler;
            if (internalHandler.released) {
                return;
            }
            internalHandler.sendEmptyMessage(12);
            boolean z10 = false;
            while (true) {
                InternalHandler internalHandler2 = this.internalHandler;
                if (internalHandler2.released) {
                    break;
                }
                try {
                    internalHandler2.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            this.applicationHandler.removeCallbacksAndMessages(null);
            this.downloads = Collections.emptyList();
            this.pendingMessages = 0;
            this.activeTaskCount = 0;
            this.initialized = false;
            this.notMetRequirements = 0;
            this.waitingForRequirements = false;
        }
    }

    public void removeAllDownloads() {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(8).sendToTarget();
    }

    public void removeDownload(String str) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(7, str).sendToTarget();
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public void resumeDownloads() {
        setDownloadsPaused(false);
    }

    public void setMaxParallelDownloads(int i10) {
        Assertions.checkArgument(i10 > 0);
        if (this.maxParallelDownloads == i10) {
            return;
        }
        this.maxParallelDownloads = i10;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(4, i10, 0).sendToTarget();
    }

    public void setMinRetryCount(int i10) {
        Assertions.checkArgument(i10 >= 0);
        if (this.minRetryCount == i10) {
            return;
        }
        this.minRetryCount = i10;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(5, i10, 0).sendToTarget();
    }

    public void setRequirements(Requirements requirements) {
        if (requirements.equals(this.requirementsWatcher.getRequirements())) {
            return;
        }
        this.requirementsWatcher.stop();
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(this.context, this.requirementsListener, requirements);
        this.requirementsWatcher = requirementsWatcher;
        onRequirementsStateChanged(this.requirementsWatcher, requirementsWatcher.start());
    }

    public void setStopReason(String str, int i10) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(3, i10, 0, str).sendToTarget();
    }

    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory factory, Executor executor) {
        this(context, new DefaultDownloadIndex(databaseProvider), new DefaultDownloaderFactory(new CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(factory), executor));
    }

    public void addDownload(DownloadRequest downloadRequest, int i10) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(6, i10, 0, downloadRequest).sendToTarget();
    }

    public DownloadManager(Context context, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory) {
        this.context = context.getApplicationContext();
        this.downloadIndex = writableDownloadIndex;
        this.maxParallelDownloads = 3;
        this.minRetryCount = 5;
        this.downloadsPaused = true;
        this.downloads = Collections.emptyList();
        this.listeners = new CopyOnWriteArraySet<>();
        Handler createHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper(new Handler.Callback() { // from class: com.google.android.exoplayer2.offline.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean handleMainMessage;
                handleMainMessage = DownloadManager.this.handleMainMessage(message);
                return handleMainMessage;
            }
        });
        this.applicationHandler = createHandlerForCurrentOrMainLooper;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        InternalHandler internalHandler = new InternalHandler(handlerThread, writableDownloadIndex, downloaderFactory, createHandlerForCurrentOrMainLooper, this.maxParallelDownloads, this.minRetryCount, this.downloadsPaused);
        this.internalHandler = internalHandler;
        RequirementsWatcher.Listener listener = new RequirementsWatcher.Listener() { // from class: com.google.android.exoplayer2.offline.j
            @Override // com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener
            public final void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i10) {
                DownloadManager.this.onRequirementsStateChanged(requirementsWatcher, i10);
            }
        };
        this.requirementsListener = listener;
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(context, listener, DEFAULT_REQUIREMENTS);
        this.requirementsWatcher = requirementsWatcher;
        int start = requirementsWatcher.start();
        this.notMetRequirements = start;
        this.pendingMessages = 1;
        internalHandler.obtainMessage(0, start, 0).sendToTarget();
    }

    /* loaded from: classes3.dex */
    public static final class InternalHandler extends Handler {
        private static final int UPDATE_PROGRESS_INTERVAL_MS = 5000;
        private int activeDownloadTaskCount;
        private final HashMap<String, Task> activeTasks;
        private final WritableDownloadIndex downloadIndex;
        private final DownloaderFactory downloaderFactory;
        private final ArrayList<Download> downloads;
        private boolean downloadsPaused;
        private final Handler mainHandler;
        private int maxParallelDownloads;
        private int minRetryCount;
        private int notMetRequirements;
        public boolean released;
        private final HandlerThread thread;

        public InternalHandler(HandlerThread handlerThread, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory, Handler handler, int i10, int i11, boolean z10) {
            super(handlerThread.getLooper());
            this.thread = handlerThread;
            this.downloadIndex = writableDownloadIndex;
            this.downloaderFactory = downloaderFactory;
            this.mainHandler = handler;
            this.maxParallelDownloads = i10;
            this.minRetryCount = i11;
            this.downloadsPaused = z10;
            this.downloads = new ArrayList<>();
            this.activeTasks = new HashMap<>();
        }

        private void addDownload(DownloadRequest downloadRequest, int i10) {
            Download download = getDownload(downloadRequest.f26898id, true);
            long currentTimeMillis = System.currentTimeMillis();
            if (download != null) {
                putDownload(DownloadManager.mergeRequest(download, downloadRequest, i10, currentTimeMillis));
            } else {
                putDownload(new Download(downloadRequest, i10 == 0 ? 0 : 1, currentTimeMillis, currentTimeMillis, -1L, i10, 0));
            }
            syncTasks();
        }

        private boolean canDownloadsRun() {
            return !this.downloadsPaused && this.notMetRequirements == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareStartTimes(Download download, Download download2) {
            return Util.compareLong(download.startTimeMs, download2.startTimeMs);
        }

        private static Download copyDownloadWithState(Download download, int i10, int i11) {
            return new Download(download.request, i10, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i11, 0, download.progress);
        }

        private Download getDownload(String str, boolean z10) {
            int downloadIndex = getDownloadIndex(str);
            if (downloadIndex != -1) {
                return this.downloads.get(downloadIndex);
            }
            if (z10) {
                try {
                    return this.downloadIndex.getDownload(str);
                } catch (IOException e10) {
                    Log.e(DownloadManager.TAG, "Failed to load download: " + str, e10);
                    return null;
                }
            }
            return null;
        }

        private int getDownloadIndex(String str) {
            for (int i10 = 0; i10 < this.downloads.size(); i10++) {
                if (this.downloads.get(i10).request.f26898id.equals(str)) {
                    return i10;
                }
            }
            return -1;
        }

        private void initialize(int i10) {
            this.notMetRequirements = i10;
            DownloadCursor downloadCursor = null;
            try {
                try {
                    this.downloadIndex.setDownloadingStatesToQueued();
                    downloadCursor = this.downloadIndex.getDownloads(0, 1, 2, 5, 7);
                    while (downloadCursor.moveToNext()) {
                        this.downloads.add(downloadCursor.getDownload());
                    }
                } catch (IOException e10) {
                    Log.e(DownloadManager.TAG, "Failed to load index.", e10);
                    this.downloads.clear();
                }
                Util.closeQuietly(downloadCursor);
                this.mainHandler.obtainMessage(0, new ArrayList(this.downloads)).sendToTarget();
                syncTasks();
            } catch (Throwable th2) {
                Util.closeQuietly(downloadCursor);
                throw th2;
            }
        }

        private void onContentLengthChanged(Task task, long j10) {
            Download download = (Download) Assertions.checkNotNull(getDownload(task.request.f26898id, false));
            if (j10 == download.contentLength || j10 == -1) {
                return;
            }
            putDownload(new Download(download.request, download.state, download.startTimeMs, System.currentTimeMillis(), j10, download.stopReason, download.failureReason, download.progress));
        }

        private void onDownloadTaskStopped(Download download, Exception exc) {
            Download download2 = new Download(download.request, exc == null ? 3 : 4, download.startTimeMs, System.currentTimeMillis(), download.contentLength, download.stopReason, exc == null ? 0 : 1, download.progress);
            this.downloads.remove(getDownloadIndex(download2.request.f26898id));
            try {
                this.downloadIndex.putDownload(download2);
            } catch (IOException e10) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e10);
            }
            this.mainHandler.obtainMessage(2, new DownloadUpdate(download2, false, new ArrayList(this.downloads), exc)).sendToTarget();
        }

        private void onRemoveTaskStopped(Download download) {
            if (download.state == 7) {
                int i10 = download.stopReason;
                putDownloadWithState(download, i10 == 0 ? 0 : 1, i10);
                syncTasks();
                return;
            }
            this.downloads.remove(getDownloadIndex(download.request.f26898id));
            try {
                this.downloadIndex.removeDownload(download.request.f26898id);
            } catch (IOException unused) {
                Log.e(DownloadManager.TAG, "Failed to remove from database");
            }
            this.mainHandler.obtainMessage(2, new DownloadUpdate(download, true, new ArrayList(this.downloads), null)).sendToTarget();
        }

        private void onTaskStopped(Task task) {
            String str = task.request.f26898id;
            this.activeTasks.remove(str);
            boolean z10 = task.isRemove;
            if (!z10) {
                int i10 = this.activeDownloadTaskCount - 1;
                this.activeDownloadTaskCount = i10;
                if (i10 == 0) {
                    removeMessages(11);
                }
            }
            if (!task.isCanceled) {
                Exception exc = task.finalException;
                if (exc != null) {
                    Log.e(DownloadManager.TAG, "Task failed: " + task.request + ", " + z10, exc);
                }
                Download download = (Download) Assertions.checkNotNull(getDownload(str, false));
                int i11 = download.state;
                if (i11 == 2) {
                    Assertions.checkState(!z10);
                    onDownloadTaskStopped(download, exc);
                } else if (i11 != 5 && i11 != 7) {
                    throw new IllegalStateException();
                } else {
                    Assertions.checkState(z10);
                    onRemoveTaskStopped(download);
                }
                syncTasks();
                return;
            }
            syncTasks();
        }

        private Download putDownload(Download download) {
            int i10 = download.state;
            Assertions.checkState((i10 == 3 || i10 == 4) ? false : true);
            int downloadIndex = getDownloadIndex(download.request.f26898id);
            if (downloadIndex == -1) {
                this.downloads.add(download);
                Collections.sort(this.downloads, k.f26912w);
            } else {
                boolean z10 = download.startTimeMs != this.downloads.get(downloadIndex).startTimeMs;
                this.downloads.set(downloadIndex, download);
                if (z10) {
                    Collections.sort(this.downloads, k.f26912w);
                }
            }
            try {
                this.downloadIndex.putDownload(download);
            } catch (IOException e10) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e10);
            }
            this.mainHandler.obtainMessage(2, new DownloadUpdate(download, false, new ArrayList(this.downloads), null)).sendToTarget();
            return download;
        }

        private Download putDownloadWithState(Download download, int i10, int i11) {
            Assertions.checkState((i10 == 3 || i10 == 4) ? false : true);
            return putDownload(copyDownloadWithState(download, i10, i11));
        }

        private void release() {
            for (Task task : this.activeTasks.values()) {
                task.cancel(true);
            }
            try {
                this.downloadIndex.setDownloadingStatesToQueued();
            } catch (IOException e10) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e10);
            }
            this.downloads.clear();
            this.thread.quit();
            synchronized (this) {
                this.released = true;
                notifyAll();
            }
        }

        private void removeAllDownloads() {
            ArrayList arrayList = new ArrayList();
            try {
                DownloadCursor downloads = this.downloadIndex.getDownloads(3, 4);
                while (downloads.moveToNext()) {
                    arrayList.add(downloads.getDownload());
                }
                downloads.close();
            } catch (IOException unused) {
                Log.e(DownloadManager.TAG, "Failed to load downloads.");
            }
            for (int i10 = 0; i10 < this.downloads.size(); i10++) {
                ArrayList<Download> arrayList2 = this.downloads;
                arrayList2.set(i10, copyDownloadWithState(arrayList2.get(i10), 5, 0));
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.downloads.add(copyDownloadWithState((Download) arrayList.get(i11), 5, 0));
            }
            Collections.sort(this.downloads, k.f26912w);
            try {
                this.downloadIndex.setStatesToRemoving();
            } catch (IOException e10) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e10);
            }
            ArrayList arrayList3 = new ArrayList(this.downloads);
            for (int i12 = 0; i12 < this.downloads.size(); i12++) {
                this.mainHandler.obtainMessage(2, new DownloadUpdate(this.downloads.get(i12), false, arrayList3, null)).sendToTarget();
            }
            syncTasks();
        }

        private void removeDownload(String str) {
            Download download = getDownload(str, true);
            if (download == null) {
                Log.e(DownloadManager.TAG, "Failed to remove nonexistent download: " + str);
                return;
            }
            putDownloadWithState(download, 5, 0);
            syncTasks();
        }

        private void setDownloadsPaused(boolean z10) {
            this.downloadsPaused = z10;
            syncTasks();
        }

        private void setMaxParallelDownloads(int i10) {
            this.maxParallelDownloads = i10;
            syncTasks();
        }

        private void setMinRetryCount(int i10) {
            this.minRetryCount = i10;
        }

        private void setNotMetRequirements(int i10) {
            this.notMetRequirements = i10;
            syncTasks();
        }

        private void setStopReason(String str, int i10) {
            if (str == null) {
                for (int i11 = 0; i11 < this.downloads.size(); i11++) {
                    setStopReason(this.downloads.get(i11), i10);
                }
                try {
                    this.downloadIndex.setStopReason(i10);
                } catch (IOException e10) {
                    Log.e(DownloadManager.TAG, "Failed to set manual stop reason", e10);
                }
            } else {
                Download download = getDownload(str, false);
                if (download != null) {
                    setStopReason(download, i10);
                } else {
                    try {
                        this.downloadIndex.setStopReason(str, i10);
                    } catch (IOException e11) {
                        Log.e(DownloadManager.TAG, "Failed to set manual stop reason: " + str, e11);
                    }
                }
            }
            syncTasks();
        }

        private void syncDownloadingDownload(Task task, Download download, int i10) {
            Assertions.checkState(!task.isRemove);
            if (!canDownloadsRun() || i10 >= this.maxParallelDownloads) {
                putDownloadWithState(download, 0, 0);
                task.cancel(false);
            }
        }

        private Task syncQueuedDownload(Task task, Download download) {
            if (task != null) {
                Assertions.checkState(!task.isRemove);
                task.cancel(false);
                return task;
            } else if (!canDownloadsRun() || this.activeDownloadTaskCount >= this.maxParallelDownloads) {
                return null;
            } else {
                Download putDownloadWithState = putDownloadWithState(download, 2, 0);
                Task task2 = new Task(putDownloadWithState.request, this.downloaderFactory.createDownloader(putDownloadWithState.request), putDownloadWithState.progress, false, this.minRetryCount, this);
                this.activeTasks.put(putDownloadWithState.request.f26898id, task2);
                int i10 = this.activeDownloadTaskCount;
                this.activeDownloadTaskCount = i10 + 1;
                if (i10 == 0) {
                    sendEmptyMessageDelayed(11, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                }
                task2.start();
                return task2;
            }
        }

        private void syncRemovingDownload(Task task, Download download) {
            if (task != null) {
                if (task.isRemove) {
                    return;
                }
                task.cancel(false);
                return;
            }
            Task task2 = new Task(download.request, this.downloaderFactory.createDownloader(download.request), download.progress, true, this.minRetryCount, this);
            this.activeTasks.put(download.request.f26898id, task2);
            task2.start();
        }

        private void syncStoppedDownload(Task task) {
            if (task != null) {
                Assertions.checkState(!task.isRemove);
                task.cancel(false);
            }
        }

        private void syncTasks() {
            int i10 = 0;
            for (int i11 = 0; i11 < this.downloads.size(); i11++) {
                Download download = this.downloads.get(i11);
                Task task = this.activeTasks.get(download.request.f26898id);
                int i12 = download.state;
                if (i12 == 0) {
                    task = syncQueuedDownload(task, download);
                } else if (i12 == 1) {
                    syncStoppedDownload(task);
                } else if (i12 == 2) {
                    Assertions.checkNotNull(task);
                    syncDownloadingDownload(task, download, i10);
                } else if (i12 != 5 && i12 != 7) {
                    throw new IllegalStateException();
                } else {
                    syncRemovingDownload(task, download);
                }
                if (task != null && !task.isRemove) {
                    i10++;
                }
            }
        }

        private void updateProgress() {
            for (int i10 = 0; i10 < this.downloads.size(); i10++) {
                Download download = this.downloads.get(i10);
                if (download.state == 2) {
                    try {
                        this.downloadIndex.putDownload(download);
                    } catch (IOException e10) {
                        Log.e(DownloadManager.TAG, "Failed to update index.", e10);
                    }
                }
            }
            sendEmptyMessageDelayed(11, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = 0;
            switch (message.what) {
                case 0:
                    initialize(message.arg1);
                    i10 = 1;
                    break;
                case 1:
                    setDownloadsPaused(message.arg1 != 0);
                    i10 = 1;
                    break;
                case 2:
                    setNotMetRequirements(message.arg1);
                    i10 = 1;
                    break;
                case 3:
                    setStopReason((String) message.obj, message.arg1);
                    i10 = 1;
                    break;
                case 4:
                    setMaxParallelDownloads(message.arg1);
                    i10 = 1;
                    break;
                case 5:
                    setMinRetryCount(message.arg1);
                    i10 = 1;
                    break;
                case 6:
                    addDownload((DownloadRequest) message.obj, message.arg1);
                    i10 = 1;
                    break;
                case 7:
                    removeDownload((String) message.obj);
                    i10 = 1;
                    break;
                case 8:
                    removeAllDownloads();
                    i10 = 1;
                    break;
                case 9:
                    onTaskStopped((Task) message.obj);
                    break;
                case 10:
                    onContentLengthChanged((Task) message.obj, Util.toLong(message.arg1, message.arg2));
                    return;
                case 11:
                    updateProgress();
                    return;
                case 12:
                    release();
                    return;
                default:
                    throw new IllegalStateException();
            }
            this.mainHandler.obtainMessage(1, i10, this.activeTasks.size()).sendToTarget();
        }

        private void setStopReason(Download download, int i10) {
            if (i10 == 0) {
                if (download.state == 1) {
                    putDownloadWithState(download, 0, 0);
                }
            } else if (i10 != download.stopReason) {
                int i11 = download.state;
                if (i11 == 0 || i11 == 2) {
                    i11 = 1;
                }
                putDownload(new Download(download.request, i11, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i10, 0, download.progress));
            }
        }
    }
}
