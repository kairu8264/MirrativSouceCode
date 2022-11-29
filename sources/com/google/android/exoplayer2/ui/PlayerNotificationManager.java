package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import b3.j;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.google.android.exoplayer2.PlaybackPreparer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class PlayerNotificationManager {
    private static final String ACTION_DISMISS = "com.google.android.exoplayer.dismiss";
    public static final String ACTION_FAST_FORWARD = "com.google.android.exoplayer.ffwd";
    public static final String ACTION_NEXT = "com.google.android.exoplayer.next";
    public static final String ACTION_PAUSE = "com.google.android.exoplayer.pause";
    public static final String ACTION_PLAY = "com.google.android.exoplayer.play";
    public static final String ACTION_PREVIOUS = "com.google.android.exoplayer.prev";
    public static final String ACTION_REWIND = "com.google.android.exoplayer.rewind";
    public static final String ACTION_STOP = "com.google.android.exoplayer.stop";
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 0;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 1;
    private static int instanceIdCounter;
    private int badgeIconType;
    private j.e builder;
    private List<j.a> builderActions;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    private ControlDispatcher controlDispatcher;
    private int currentNotificationTag;
    private final CustomActionReceiver customActionReceiver;
    private final Map<String, j.a> customActions;
    private int defaults;
    private final PendingIntent dismissPendingIntent;
    private final int instanceId;
    private final IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;
    private MediaSessionCompat.Token mediaSessionToken;
    private final NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;
    private NotificationListener notificationListener;
    private final b3.m notificationManager;
    private final Map<String, j.a> playbackActions;
    private PlaybackPreparer playbackPreparer;
    private Player player;
    private final Player.EventListener playerListener;
    private int priority;
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useNextAction;
    private boolean useNextActionInCompactView;
    private boolean usePlayPauseActions;
    private boolean usePreviousAction;
    private boolean usePreviousActionInCompactView;
    private boolean useStopAction;
    private int visibility;
    private final Timeline.Window window;

    /* loaded from: classes3.dex */
    public final class BitmapCallback {
        private final int notificationTag;

        public void onBitmap(Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.postUpdateNotificationBitmap(bitmap, this.notificationTag);
            }
        }

        private BitmapCallback(int i10) {
            this.notificationTag = i10;
        }
    }

    /* loaded from: classes3.dex */
    public interface CustomActionReceiver {
        Map<String, j.a> createCustomActions(Context context, int i10);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    /* loaded from: classes3.dex */
    public interface MediaDescriptionAdapter {
        PendingIntent createCurrentContentIntent(Player player);

        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);

        default CharSequence getCurrentSubText(Player player) {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        private NotificationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Player player = PlayerNotificationManager.this.player;
            if (player != null && PlayerNotificationManager.this.isNotificationStarted && intent.getIntExtra(PlayerNotificationManager.EXTRA_INSTANCE_ID, PlayerNotificationManager.this.instanceId) == PlayerNotificationManager.this.instanceId) {
                String action = intent.getAction();
                if (PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    if (player.getPlaybackState() == 1) {
                        if (PlayerNotificationManager.this.playbackPreparer != null) {
                            PlayerNotificationManager.this.playbackPreparer.preparePlayback();
                        } else {
                            PlayerNotificationManager.this.controlDispatcher.dispatchPrepare(player);
                        }
                    } else if (player.getPlaybackState() == 4) {
                        PlayerNotificationManager.this.controlDispatcher.dispatchSeekTo(player, player.getCurrentWindowIndex(), C.TIME_UNSET);
                    }
                    PlayerNotificationManager.this.controlDispatcher.dispatchSetPlayWhenReady(player, true);
                } else if (PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchSetPlayWhenReady(player, false);
                } else if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchPrevious(player);
                } else if (PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchRewind(player);
                } else if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchFastForward(player);
                } else if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchNext(player);
                } else if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchStop(player, true);
                } else if (PlayerNotificationManager.ACTION_DISMISS.equals(action)) {
                    PlayerNotificationManager.this.stopNotification(true);
                } else if (action == null || PlayerNotificationManager.this.customActionReceiver == null || !PlayerNotificationManager.this.customActions.containsKey(action)) {
                } else {
                    PlayerNotificationManager.this.customActionReceiver.onCustomAction(player, action, intent);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface NotificationListener {
        @Deprecated
        default void onNotificationCancelled(int i10) {
        }

        default void onNotificationCancelled(int i10, boolean z10) {
        }

        default void onNotificationPosted(int i10, Notification notification, boolean z10) {
        }

        @Deprecated
        default void onNotificationStarted(int i10, Notification notification) {
        }
    }

    /* loaded from: classes3.dex */
    public class PlayerListener implements Player.EventListener {
        private PlayerListener() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(5, 6, 8, 0, 13, 12, 9, 10)) {
                PlayerNotificationManager.this.postStartOrUpdateNotification();
            }
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Priority {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Visibility {
    }

    public PlayerNotificationManager(Context context, String str, int i10, MediaDescriptionAdapter mediaDescriptionAdapter) {
        this(context, str, i10, mediaDescriptionAdapter, null, null);
    }

    private static PendingIntent createBroadcastIntent(String str, Context context, int i10) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(EXTRA_INSTANCE_ID, i10);
        return PendingIntent.getBroadcast(context, i10, intent, 134217728);
    }

    private static Map<String, j.a> createPlaybackActions(Context context, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION_PLAY, new j.a(R.drawable.exo_notification_play, context.getString(R.string.exo_controls_play_description), createBroadcastIntent(ACTION_PLAY, context, i10)));
        hashMap.put(ACTION_PAUSE, new j.a(R.drawable.exo_notification_pause, context.getString(R.string.exo_controls_pause_description), createBroadcastIntent(ACTION_PAUSE, context, i10)));
        hashMap.put(ACTION_STOP, new j.a(R.drawable.exo_notification_stop, context.getString(R.string.exo_controls_stop_description), createBroadcastIntent(ACTION_STOP, context, i10)));
        hashMap.put(ACTION_REWIND, new j.a(R.drawable.exo_notification_rewind, context.getString(R.string.exo_controls_rewind_description), createBroadcastIntent(ACTION_REWIND, context, i10)));
        hashMap.put(ACTION_FAST_FORWARD, new j.a(R.drawable.exo_notification_fastforward, context.getString(R.string.exo_controls_fastforward_description), createBroadcastIntent(ACTION_FAST_FORWARD, context, i10)));
        hashMap.put(ACTION_PREVIOUS, new j.a(R.drawable.exo_notification_previous, context.getString(R.string.exo_controls_previous_description), createBroadcastIntent(ACTION_PREVIOUS, context, i10)));
        hashMap.put(ACTION_NEXT, new j.a(R.drawable.exo_notification_next, context.getString(R.string.exo_controls_next_description), createBroadcastIntent(ACTION_NEXT, context, i10)));
        return hashMap;
    }

    @Deprecated
    public static PlayerNotificationManager createWithNotificationChannel(Context context, String str, int i10, int i11, MediaDescriptionAdapter mediaDescriptionAdapter) {
        return createWithNotificationChannel(context, str, i10, 0, i11, mediaDescriptionAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            Player player = this.player;
            if (player != null) {
                startOrUpdateNotification(player, null);
            }
        } else if (i10 != 1) {
            return false;
        } else {
            Player player2 = this.player;
            if (player2 != null && this.isNotificationStarted && this.currentNotificationTag == message.arg1) {
                startOrUpdateNotification(player2, (Bitmap) message.obj);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postStartOrUpdateNotification() {
        if (this.mainHandler.hasMessages(0)) {
            return;
        }
        this.mainHandler.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postUpdateNotificationBitmap(Bitmap bitmap, int i10) {
        this.mainHandler.obtainMessage(1, i10, -1, bitmap).sendToTarget();
    }

    private static void setLargeIcon(j.e eVar, Bitmap bitmap) {
        eVar.v(bitmap);
    }

    private boolean shouldShowPauseButton(Player player) {
        return (player.getPlaybackState() == 4 || player.getPlaybackState() == 1 || !player.getPlayWhenReady()) ? false : true;
    }

    private void startOrUpdateNotification(Player player, Bitmap bitmap) {
        boolean ongoing = getOngoing(player);
        j.e createNotification = createNotification(player, this.builder, ongoing, bitmap);
        this.builder = createNotification;
        boolean z10 = false;
        if (createNotification == null) {
            stopNotification(false);
            return;
        }
        Notification c10 = createNotification.c();
        this.notificationManager.f(this.notificationId, c10);
        if (!this.isNotificationStarted) {
            this.context.registerReceiver(this.notificationBroadcastReceiver, this.intentFilter);
            NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationStarted(this.notificationId, c10);
            }
        }
        NotificationListener notificationListener2 = this.notificationListener;
        if (notificationListener2 != null) {
            int i10 = this.notificationId;
            if (ongoing || !this.isNotificationStarted) {
                z10 = true;
            }
            notificationListener2.onNotificationPosted(i10, c10, z10);
        }
        this.isNotificationStarted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNotification(boolean z10) {
        if (this.isNotificationStarted) {
            this.isNotificationStarted = false;
            this.mainHandler.removeMessages(0);
            this.notificationManager.b(this.notificationId);
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.notificationId, z10);
                this.notificationListener.onNotificationCancelled(this.notificationId);
            }
        }
    }

    public j.e createNotification(Player player, j.e eVar, boolean z10, Bitmap bitmap) {
        j.a aVar;
        if (player.getPlaybackState() == 1 && player.getCurrentTimeline().isEmpty()) {
            this.builderActions = null;
            return null;
        }
        List<String> actions = getActions(player);
        ArrayList arrayList = new ArrayList(actions.size());
        for (int i10 = 0; i10 < actions.size(); i10++) {
            String str = actions.get(i10);
            if (this.playbackActions.containsKey(str)) {
                aVar = this.playbackActions.get(str);
            } else {
                aVar = this.customActions.get(str);
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        if (eVar == null || !arrayList.equals(this.builderActions)) {
            eVar = new j.e(this.context, this.channelId);
            this.builderActions = arrayList;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                eVar.b((j.a) arrayList.get(i11));
            }
        }
        q4.a aVar2 = new q4.a();
        MediaSessionCompat.Token token = this.mediaSessionToken;
        if (token != null) {
            aVar2.t(token);
        }
        aVar2.u(getActionIndicesForCompactView(actions, player));
        aVar2.v(!z10);
        aVar2.s(this.dismissPendingIntent);
        eVar.F(aVar2);
        eVar.t(this.dismissPendingIntent);
        eVar.k(this.badgeIconType).z(z10).m(this.color).n(this.colorized).D(this.smallIconResourceId).K(this.visibility).A(this.priority).s(this.defaults);
        if (Util.SDK_INT >= 21 && this.useChronometer && player.isPlaying() && !player.isPlayingAd() && !player.isCurrentWindowDynamic() && player.getPlaybackParameters().speed == 1.0f) {
            eVar.L(System.currentTimeMillis() - player.getContentPosition()).C(true).I(true);
        } else {
            eVar.C(false).I(false);
        }
        eVar.r(this.mediaDescriptionAdapter.getCurrentContentTitle(player));
        eVar.q(this.mediaDescriptionAdapter.getCurrentContentText(player));
        eVar.G(this.mediaDescriptionAdapter.getCurrentSubText(player));
        if (bitmap == null) {
            MediaDescriptionAdapter mediaDescriptionAdapter = this.mediaDescriptionAdapter;
            int i12 = this.currentNotificationTag + 1;
            this.currentNotificationTag = i12;
            bitmap = mediaDescriptionAdapter.getCurrentLargeIcon(player, new BitmapCallback(i12));
        }
        setLargeIcon(eVar, bitmap);
        eVar.p(this.mediaDescriptionAdapter.createCurrentContentIntent(player));
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int[] getActionIndicesForCompactView(java.util.List<java.lang.String> r7, com.google.android.exoplayer2.Player r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com.google.android.exoplayer.pause"
            int r0 = r7.indexOf(r0)
            java.lang.String r1 = "com.google.android.exoplayer.play"
            int r1 = r7.indexOf(r1)
            boolean r2 = r6.usePreviousActionInCompactView
            r3 = -1
            if (r2 == 0) goto L18
            java.lang.String r2 = "com.google.android.exoplayer.prev"
            int r2 = r7.indexOf(r2)
            goto L19
        L18:
            r2 = r3
        L19:
            boolean r4 = r6.useNextActionInCompactView
            if (r4 == 0) goto L24
            java.lang.String r4 = "com.google.android.exoplayer.next"
            int r7 = r7.indexOf(r4)
            goto L25
        L24:
            r7 = r3
        L25:
            r4 = 3
            int[] r4 = new int[r4]
            r5 = 0
            if (r2 == r3) goto L2e
            r4[r5] = r2
            r5 = 1
        L2e:
            boolean r8 = r6.shouldShowPauseButton(r8)
            if (r0 == r3) goto L3c
            if (r8 == 0) goto L3c
            int r8 = r5 + 1
            r4[r5] = r0
        L3a:
            r5 = r8
            goto L45
        L3c:
            if (r1 == r3) goto L45
            if (r8 != 0) goto L45
            int r8 = r5 + 1
            r4[r5] = r1
            goto L3a
        L45:
            if (r7 == r3) goto L4c
            int r8 = r5 + 1
            r4[r5] = r7
            r5 = r8
        L4c:
            int[] r7 = java.util.Arrays.copyOf(r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerNotificationManager.getActionIndicesForCompactView(java.util.List, com.google.android.exoplayer2.Player):int[]");
    }

    public List<String> getActions(Player player) {
        boolean z10;
        boolean z11;
        boolean z12;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty() || player.isPlayingAd()) {
            z10 = false;
            z11 = false;
            z12 = false;
        } else {
            currentTimeline.getWindow(player.getCurrentWindowIndex(), this.window);
            Timeline.Window window = this.window;
            boolean z13 = window.isSeekable;
            boolean z14 = z13 || !window.isLive() || player.hasPrevious();
            z12 = z13 && this.controlDispatcher.isRewindEnabled();
            z11 = z13 && this.controlDispatcher.isFastForwardEnabled();
            r2 = z14;
            z10 = (this.window.isLive() && this.window.isDynamic) || player.hasNext();
        }
        ArrayList arrayList = new ArrayList();
        if (this.usePreviousAction && r2) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (z12) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.usePlayPauseActions) {
            if (shouldShowPauseButton(player)) {
                arrayList.add(ACTION_PAUSE);
            } else {
                arrayList.add(ACTION_PLAY);
            }
        }
        if (z11) {
            arrayList.add(ACTION_FAST_FORWARD);
        }
        if (this.useNextAction && z10) {
            arrayList.add(ACTION_NEXT);
        }
        CustomActionReceiver customActionReceiver = this.customActionReceiver;
        if (customActionReceiver != null) {
            arrayList.addAll(customActionReceiver.getCustomActions(player));
        }
        if (this.useStopAction) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    public boolean getOngoing(Player player) {
        int playbackState = player.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && player.getPlayWhenReady();
    }

    public void invalidate() {
        if (this.isNotificationStarted) {
            postStartOrUpdateNotification();
        }
    }

    public final void setBadgeIconType(int i10) {
        if (this.badgeIconType == i10) {
            return;
        }
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        this.badgeIconType = i10;
        invalidate();
    }

    public final void setColor(int i10) {
        if (this.color != i10) {
            this.color = i10;
            invalidate();
        }
    }

    public final void setColorized(boolean z10) {
        if (this.colorized != z10) {
            this.colorized = z10;
            invalidate();
        }
    }

    public final void setControlDispatcher(ControlDispatcher controlDispatcher) {
        if (this.controlDispatcher != controlDispatcher) {
            this.controlDispatcher = controlDispatcher;
            invalidate();
        }
    }

    public final void setDefaults(int i10) {
        if (this.defaults != i10) {
            this.defaults = i10;
            invalidate();
        }
    }

    @Deprecated
    public final void setFastForwardIncrementMs(long j10) {
        ControlDispatcher controlDispatcher = this.controlDispatcher;
        if (controlDispatcher instanceof DefaultControlDispatcher) {
            ((DefaultControlDispatcher) controlDispatcher).setFastForwardIncrementMs(j10);
            invalidate();
        }
    }

    public final void setMediaSessionToken(MediaSessionCompat.Token token) {
        if (Util.areEqual(this.mediaSessionToken, token)) {
            return;
        }
        this.mediaSessionToken = token;
        invalidate();
    }

    @Deprecated
    public final void setNotificationListener(NotificationListener notificationListener) {
        this.notificationListener = notificationListener;
    }

    @Deprecated
    public void setPlaybackPreparer(PlaybackPreparer playbackPreparer) {
        this.playbackPreparer = playbackPreparer;
    }

    public final void setPlayer(Player player) {
        boolean z10 = true;
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.playerListener);
            if (player == null) {
                stopNotification(false);
            }
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.playerListener);
            postStartOrUpdateNotification();
        }
    }

    public final void setPriority(int i10) {
        if (this.priority == i10) {
            return;
        }
        if (i10 != -2 && i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        this.priority = i10;
        invalidate();
    }

    @Deprecated
    public final void setRewindIncrementMs(long j10) {
        ControlDispatcher controlDispatcher = this.controlDispatcher;
        if (controlDispatcher instanceof DefaultControlDispatcher) {
            ((DefaultControlDispatcher) controlDispatcher).setRewindIncrementMs(j10);
            invalidate();
        }
    }

    public final void setSmallIcon(int i10) {
        if (this.smallIconResourceId != i10) {
            this.smallIconResourceId = i10;
            invalidate();
        }
    }

    public final void setUseChronometer(boolean z10) {
        if (this.useChronometer != z10) {
            this.useChronometer = z10;
            invalidate();
        }
    }

    @Deprecated
    public final void setUseNavigationActions(boolean z10) {
        setUseNextAction(z10);
        setUsePreviousAction(z10);
    }

    @Deprecated
    public final void setUseNavigationActionsInCompactView(boolean z10) {
        setUseNextActionInCompactView(z10);
        setUsePreviousActionInCompactView(z10);
    }

    public void setUseNextAction(boolean z10) {
        if (this.useNextAction != z10) {
            this.useNextAction = z10;
            invalidate();
        }
    }

    public void setUseNextActionInCompactView(boolean z10) {
        if (this.useNextActionInCompactView != z10) {
            this.useNextActionInCompactView = z10;
            invalidate();
        }
    }

    public final void setUsePlayPauseActions(boolean z10) {
        if (this.usePlayPauseActions != z10) {
            this.usePlayPauseActions = z10;
            invalidate();
        }
    }

    public void setUsePreviousAction(boolean z10) {
        if (this.usePreviousAction != z10) {
            this.usePreviousAction = z10;
            invalidate();
        }
    }

    public void setUsePreviousActionInCompactView(boolean z10) {
        if (this.usePreviousActionInCompactView != z10) {
            this.usePreviousActionInCompactView = z10;
            invalidate();
        }
    }

    public final void setUseStopAction(boolean z10) {
        if (this.useStopAction == z10) {
            return;
        }
        this.useStopAction = z10;
        invalidate();
    }

    public final void setVisibility(int i10) {
        if (this.visibility == i10) {
            return;
        }
        if (i10 != -1 && i10 != 0 && i10 != 1) {
            throw new IllegalStateException();
        }
        this.visibility = i10;
        invalidate();
    }

    public PlayerNotificationManager(Context context, String str, int i10, MediaDescriptionAdapter mediaDescriptionAdapter, NotificationListener notificationListener) {
        this(context, str, i10, mediaDescriptionAdapter, notificationListener, null);
    }

    public static PlayerNotificationManager createWithNotificationChannel(Context context, String str, int i10, int i11, int i12, MediaDescriptionAdapter mediaDescriptionAdapter) {
        NotificationUtil.createNotificationChannel(context, str, i10, i11, 2);
        return new PlayerNotificationManager(context, str, i12, mediaDescriptionAdapter);
    }

    public PlayerNotificationManager(Context context, String str, int i10, MediaDescriptionAdapter mediaDescriptionAdapter, CustomActionReceiver customActionReceiver) {
        this(context, str, i10, mediaDescriptionAdapter, null, customActionReceiver);
    }

    public PlayerNotificationManager(Context context, String str, int i10, MediaDescriptionAdapter mediaDescriptionAdapter, NotificationListener notificationListener, CustomActionReceiver customActionReceiver) {
        Map<String, j.a> emptyMap;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.channelId = str;
        this.notificationId = i10;
        this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        this.notificationListener = notificationListener;
        this.customActionReceiver = customActionReceiver;
        this.controlDispatcher = new DefaultControlDispatcher();
        this.window = new Timeline.Window();
        int i11 = instanceIdCounter;
        instanceIdCounter = i11 + 1;
        this.instanceId = i11;
        this.mainHandler = Util.createHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.exoplayer2.ui.e
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean handleMessage;
                handleMessage = PlayerNotificationManager.this.handleMessage(message);
                return handleMessage;
            }
        });
        this.notificationManager = b3.m.d(applicationContext);
        this.playerListener = new PlayerListener();
        this.notificationBroadcastReceiver = new NotificationBroadcastReceiver();
        this.intentFilter = new IntentFilter();
        this.usePreviousAction = true;
        this.useNextAction = true;
        this.usePlayPauseActions = true;
        this.colorized = true;
        this.useChronometer = true;
        this.color = 0;
        this.smallIconResourceId = R.drawable.exo_notification_small_icon;
        this.defaults = 0;
        this.priority = -1;
        this.badgeIconType = 1;
        this.visibility = 1;
        Map<String, j.a> createPlaybackActions = createPlaybackActions(applicationContext, i11);
        this.playbackActions = createPlaybackActions;
        for (String str2 : createPlaybackActions.keySet()) {
            this.intentFilter.addAction(str2);
        }
        if (customActionReceiver != null) {
            emptyMap = customActionReceiver.createCustomActions(applicationContext, this.instanceId);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.customActions = emptyMap;
        for (String str3 : emptyMap.keySet()) {
            this.intentFilter.addAction(str3);
        }
        this.dismissPendingIntent = createBroadcastIntent(ACTION_DISMISS, applicationContext, this.instanceId);
        this.intentFilter.addAction(ACTION_DISMISS);
    }

    @Deprecated
    public static PlayerNotificationManager createWithNotificationChannel(Context context, String str, int i10, int i11, MediaDescriptionAdapter mediaDescriptionAdapter, NotificationListener notificationListener) {
        return createWithNotificationChannel(context, str, i10, 0, i11, mediaDescriptionAdapter, notificationListener);
    }

    public static PlayerNotificationManager createWithNotificationChannel(Context context, String str, int i10, int i11, int i12, MediaDescriptionAdapter mediaDescriptionAdapter, NotificationListener notificationListener) {
        NotificationUtil.createNotificationChannel(context, str, i10, i11, 2);
        return new PlayerNotificationManager(context, str, i12, mediaDescriptionAdapter, notificationListener);
    }
}
