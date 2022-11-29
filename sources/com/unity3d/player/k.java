package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.MediaController;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class k extends FrameLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, MediaController.MediaPlayerControl {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f28535a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Context f28536b;

    /* renamed from: c  reason: collision with root package name */
    private final SurfaceView f28537c;

    /* renamed from: d  reason: collision with root package name */
    private final SurfaceHolder f28538d;

    /* renamed from: e  reason: collision with root package name */
    private final String f28539e;

    /* renamed from: f  reason: collision with root package name */
    private final int f28540f;

    /* renamed from: g  reason: collision with root package name */
    private final int f28541g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f28542h;

    /* renamed from: i  reason: collision with root package name */
    private final long f28543i;

    /* renamed from: j  reason: collision with root package name */
    private final long f28544j;

    /* renamed from: k  reason: collision with root package name */
    private final FrameLayout f28545k;

    /* renamed from: l  reason: collision with root package name */
    private final Display f28546l;

    /* renamed from: m  reason: collision with root package name */
    private int f28547m;

    /* renamed from: n  reason: collision with root package name */
    private int f28548n;

    /* renamed from: o  reason: collision with root package name */
    private int f28549o;

    /* renamed from: p  reason: collision with root package name */
    private int f28550p;

    /* renamed from: q  reason: collision with root package name */
    private MediaPlayer f28551q;

    /* renamed from: r  reason: collision with root package name */
    private MediaController f28552r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f28553s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f28554t;

    /* renamed from: u  reason: collision with root package name */
    private int f28555u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f28556v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f28557w;

    /* renamed from: x  reason: collision with root package name */
    private a f28558x;

    /* renamed from: y  reason: collision with root package name */
    private b f28559y;

    /* renamed from: z  reason: collision with root package name */
    private volatile int f28560z;

    /* loaded from: classes4.dex */
    public interface a {
        void a(int i10);
    }

    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private k f28562b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f28563c = false;

        public b(k kVar) {
            this.f28562b = kVar;
        }

        public final void a() {
            this.f28563c = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Thread.sleep(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.f28563c) {
                return;
            }
            if (k.f28535a) {
                k.b("Stopping the video player due to timeout.");
            }
            this.f28562b.CancelOnPrepare();
        }
    }

    public k(Context context, String str, int i10, int i11, int i12, boolean z10, long j10, long j11, a aVar) {
        super(context);
        this.f28553s = false;
        this.f28554t = false;
        this.f28555u = 0;
        this.f28556v = false;
        this.f28557w = false;
        this.f28560z = 0;
        this.f28558x = aVar;
        this.f28536b = context;
        this.f28545k = this;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f28537c = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        this.f28538d = holder;
        holder.addCallback(this);
        setBackgroundColor(i10);
        addView(surfaceView);
        this.f28546l = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.f28539e = str;
        this.f28540f = i11;
        this.f28541g = i12;
        this.f28542h = z10;
        this.f28543i = j10;
        this.f28544j = j11;
        if (f28535a) {
            b("fileName: " + str);
        }
        if (f28535a) {
            b("backgroundColor: " + i10);
        }
        if (f28535a) {
            b("controlMode: " + i11);
        }
        if (f28535a) {
            b("scalingMode: " + i12);
        }
        if (f28535a) {
            b("isURL: " + z10);
        }
        if (f28535a) {
            b("videoOffset: " + j10);
        }
        if (f28535a) {
            b("videoLength: " + j11);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private void a(int i10) {
        this.f28560z = i10;
        a aVar = this.f28558x;
        if (aVar != null) {
            aVar.a(this.f28560z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str) {
        Log.i("Video", "VideoPlayer: " + str);
    }

    private void c() {
        FileInputStream fileInputStream;
        MediaPlayer mediaPlayer = this.f28551q;
        if (mediaPlayer != null) {
            mediaPlayer.setDisplay(this.f28538d);
            if (this.f28556v) {
                return;
            }
            if (f28535a) {
                b("Resuming playback");
            }
            this.f28551q.start();
            return;
        }
        a(0);
        doCleanUp();
        try {
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.f28551q = mediaPlayer2;
            if (this.f28542h) {
                mediaPlayer2.setDataSource(this.f28536b, Uri.parse(this.f28539e));
            } else {
                if (this.f28544j != 0) {
                    fileInputStream = new FileInputStream(this.f28539e);
                    this.f28551q.setDataSource(fileInputStream.getFD(), this.f28543i, this.f28544j);
                } else {
                    try {
                        AssetFileDescriptor openFd = getResources().getAssets().openFd(this.f28539e);
                        this.f28551q.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                        openFd.close();
                    } catch (IOException unused) {
                        fileInputStream = new FileInputStream(this.f28539e);
                        this.f28551q.setDataSource(fileInputStream.getFD());
                    }
                }
                fileInputStream.close();
            }
            this.f28551q.setDisplay(this.f28538d);
            this.f28551q.setScreenOnWhilePlaying(true);
            this.f28551q.setOnBufferingUpdateListener(this);
            this.f28551q.setOnCompletionListener(this);
            this.f28551q.setOnPreparedListener(this);
            this.f28551q.setOnVideoSizeChangedListener(this);
            this.f28551q.setAudioStreamType(3);
            this.f28551q.prepareAsync();
            this.f28559y = new b(this);
            new Thread(this.f28559y).start();
        } catch (Exception e10) {
            if (f28535a) {
                b("error: " + e10.getMessage() + e10);
            }
            a(2);
        }
    }

    private void d() {
        if (isPlaying()) {
            return;
        }
        a(1);
        if (f28535a) {
            b("startVideoPlayback");
        }
        updateVideoLayout();
        if (this.f28556v) {
            return;
        }
        start();
    }

    public final void CancelOnPrepare() {
        a(2);
    }

    public final boolean a() {
        return this.f28556v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    public final void destroyPlayer() {
        if (f28535a) {
            b("destroyPlayer");
        }
        if (!this.f28556v) {
            pause();
        }
        doCleanUp();
    }

    public final void doCleanUp() {
        b bVar = this.f28559y;
        if (bVar != null) {
            bVar.a();
            this.f28559y = null;
        }
        MediaPlayer mediaPlayer = this.f28551q;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f28551q = null;
        }
        this.f28549o = 0;
        this.f28550p = 0;
        this.f28554t = false;
        this.f28553s = false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        MediaPlayer mediaPlayer = this.f28551q;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getAudioSessionId();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        if (this.f28542h) {
            return this.f28555u;
        }
        return 100;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.f28551q;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        MediaPlayer mediaPlayer = this.f28551q;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        boolean z10 = this.f28554t && this.f28553s;
        MediaPlayer mediaPlayer = this.f28551q;
        return mediaPlayer == null ? !z10 : mediaPlayer.isPlaying() || !z10;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        if (f28535a) {
            b("onBufferingUpdate percent:" + i10);
        }
        this.f28555u = i10;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (f28535a) {
            b("onCompletion called");
        }
        destroyPlayer();
        a(3);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 && (this.f28540f != 2 || i10 == 0 || keyEvent.isSystem())) {
            MediaController mediaController = this.f28552r;
            return mediaController != null ? mediaController.onKeyDown(i10, keyEvent) : super.onKeyDown(i10, keyEvent);
        }
        destroyPlayer();
        a(3);
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (f28535a) {
            b("onPrepared called");
        }
        b bVar = this.f28559y;
        if (bVar != null) {
            bVar.a();
            this.f28559y = null;
        }
        int i10 = this.f28540f;
        if (i10 == 0 || i10 == 1) {
            MediaController mediaController = new MediaController(this.f28536b);
            this.f28552r = mediaController;
            mediaController.setMediaPlayer(this);
            this.f28552r.setAnchorView(this);
            this.f28552r.setEnabled(true);
            Context context = this.f28536b;
            if (context instanceof Activity) {
                this.f28552r.setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
            }
            this.f28552r.show();
        }
        this.f28554t = true;
        if (this.f28553s) {
            d();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f28540f != 2 || action != 0) {
            MediaController mediaController = this.f28552r;
            return mediaController != null ? mediaController.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
        }
        destroyPlayer();
        a(3);
        return true;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        if (f28535a) {
            b("onVideoSizeChanged called " + i10 + "x" + i11);
        }
        if (i10 != 0 && i11 != 0) {
            this.f28553s = true;
            this.f28549o = i10;
            this.f28550p = i11;
            if (this.f28554t) {
                d();
            }
        } else if (f28535a) {
            b("invalid video width(" + i10 + ") or height(" + i11 + ")");
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        MediaPlayer mediaPlayer = this.f28551q;
        if (mediaPlayer == null) {
            return;
        }
        if (this.f28557w) {
            mediaPlayer.pause();
        }
        this.f28556v = true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i10) {
        MediaPlayer mediaPlayer = this.f28551q;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.seekTo(i10);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (f28535a) {
            b("Start");
        }
        MediaPlayer mediaPlayer = this.f28551q;
        if (mediaPlayer == null) {
            return;
        }
        if (this.f28557w) {
            mediaPlayer.start();
        }
        this.f28556v = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        if (f28535a) {
            b("surfaceChanged called " + i10 + " " + i11 + "x" + i12);
        }
        if (this.f28547m == i11 && this.f28548n == i12) {
            return;
        }
        this.f28547m = i11;
        this.f28548n = i12;
        if (this.f28557w) {
            updateVideoLayout();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (f28535a) {
            b("surfaceCreated called");
        }
        this.f28557w = true;
        c();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (f28535a) {
            b("surfaceDestroyed called");
        }
        this.f28557w = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r5 <= r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        r1 = (int) (r0 / r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        r0 = (int) (r1 * r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r5 >= r3) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateVideoLayout() {
        /*
            r8 = this;
            boolean r0 = com.unity3d.player.k.f28535a
            if (r0 == 0) goto L9
            java.lang.String r0 = "updateVideoLayout"
            b(r0)
        L9:
            android.media.MediaPlayer r0 = r8.f28551q
            if (r0 != 0) goto Le
            return
        Le:
            int r0 = r8.f28547m
            if (r0 == 0) goto L16
            int r0 = r8.f28548n
            if (r0 != 0) goto L34
        L16:
            android.content.Context r0 = r8.f28536b
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r0 = r1.widthPixels
            r8.f28547m = r0
            int r0 = r1.heightPixels
            r8.f28548n = r0
        L34:
            int r0 = r8.f28547m
            int r1 = r8.f28548n
            boolean r2 = r8.f28553s
            if (r2 == 0) goto L64
            int r2 = r8.f28549o
            float r3 = (float) r2
            int r4 = r8.f28550p
            float r5 = (float) r4
            float r3 = r3 / r5
            float r5 = (float) r0
            float r6 = (float) r1
            float r5 = r5 / r6
            int r6 = r8.f28541g
            r7 = 1
            if (r6 != r7) goto L57
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L53
        L4f:
            float r1 = (float) r0
            float r1 = r1 / r3
            int r1 = (int) r1
            goto L6d
        L53:
            float r0 = (float) r1
            float r0 = r0 * r3
            int r0 = (int) r0
            goto L6d
        L57:
            r7 = 2
            if (r6 != r7) goto L5f
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L4f
        L5f:
            if (r6 != 0) goto L6d
            r0 = r2
            r1 = r4
            goto L6d
        L64:
            boolean r2 = com.unity3d.player.k.f28535a
            if (r2 == 0) goto L6d
            java.lang.String r2 = "updateVideoLayout: Video size is not known yet"
            b(r2)
        L6d:
            int r2 = r8.f28547m
            if (r2 != r0) goto L75
            int r2 = r8.f28548n
            if (r2 == r1) goto La0
        L75:
            boolean r2 = com.unity3d.player.k.f28535a
            if (r2 == 0) goto L92
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "frameWidth = "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = "; frameHeight = "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            b(r2)
        L92:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 17
            r2.<init>(r0, r1, r3)
            android.widget.FrameLayout r0 = r8.f28545k
            android.view.SurfaceView r1 = r8.f28537c
            r0.updateViewLayout(r1, r2)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.k.updateVideoLayout():void");
    }
}
