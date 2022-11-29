package ai;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
/* loaded from: classes3.dex */
public final class il0 extends kl0 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    public static final Map<Integer, String> Q;
    public final boolean A;
    public int B;
    public int C;
    public MediaPlayer D;
    public Uri E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public bm0 K;
    public final boolean L;
    public int M;
    public jl0 N;
    public boolean O;
    public Integer P;

    /* renamed from: y  reason: collision with root package name */
    public final em0 f5277y;

    /* renamed from: z  reason: collision with root package name */
    public final fm0 f5278z;

    static {
        HashMap hashMap = new HashMap();
        Q = hashMap;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 17) {
            hashMap.put(-1004, "MEDIA_ERROR_IO");
            hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
            hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
            hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (i10 >= 19) {
            hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public il0(Context context, em0 em0Var, boolean z10, boolean z11, dm0 dm0Var, fm0 fm0Var) {
        super(context);
        this.B = 0;
        this.C = 0;
        this.O = false;
        this.P = null;
        setSurfaceTextureListener(this);
        this.f5277y = em0Var;
        this.f5278z = fm0Var;
        this.L = z10;
        this.A = z11;
        fm0Var.a(this);
    }

    public static /* synthetic */ void L(il0 il0Var, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        MediaFormat format;
        if (!((Boolean) ft.c().c(ox.f8030l1)).booleanValue() || il0Var.f5277y == null || mediaPlayer == null || Build.VERSION.SDK_INT < 19 || (trackInfo = mediaPlayer.getTrackInfo()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
            if (trackInfo2 != null) {
                int trackType = trackInfo2.getTrackType();
                if (trackType == 1) {
                    MediaFormat format2 = trackInfo2.getFormat();
                    if (format2 != null) {
                        if (format2.containsKey("frame-rate")) {
                            try {
                                hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                            } catch (ClassCastException unused) {
                                hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                            }
                        }
                        if (format2.containsKey("bitrate")) {
                            Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                            il0Var.P = valueOf;
                            hashMap.put("bitRate", String.valueOf(valueOf));
                        }
                        if (format2.containsKey("width") && format2.containsKey("height")) {
                            int integer = format2.getInteger("width");
                            int integer2 = format2.getInteger("height");
                            StringBuilder sb2 = new StringBuilder(23);
                            sb2.append(integer);
                            sb2.append("x");
                            sb2.append(integer2);
                            hashMap.put("resolution", sb2.toString());
                        }
                        if (format2.containsKey("mime")) {
                            hashMap.put("videoMime", format2.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                            hashMap.put("videoCodec", format2.getString("codecs-string"));
                        }
                    }
                } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                    if (format.containsKey("mime")) {
                        hashMap.put("audioMime", format.getString("mime"));
                    }
                    if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                        hashMap.put("audioCodec", format.getString("codecs-string"));
                    }
                }
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        il0Var.f5277y.j0("onMetadataEvent", hashMap);
    }

    public final void D() {
        if (this.A && F() && this.D.getCurrentPosition() > 0 && this.C != 3) {
            yg.p1.k("AdMediaPlayerView nudging MediaPlayer");
            G(0.0f);
            this.D.start();
            int currentPosition = this.D.getCurrentPosition();
            long currentTimeMillis = wg.t.k().currentTimeMillis();
            while (F() && this.D.getCurrentPosition() == currentPosition && wg.t.k().currentTimeMillis() - currentTimeMillis <= 250) {
            }
            this.D.pause();
            m();
        }
    }

    public final void E(boolean z10) {
        yg.p1.k("AdMediaPlayerView release");
        bm0 bm0Var = this.K;
        if (bm0Var != null) {
            bm0Var.c();
            this.K = null;
        }
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.D.release();
            this.D = null;
            H(0);
            if (z10) {
                this.C = 0;
            }
        }
    }

    public final boolean F() {
        int i10;
        return (this.D == null || (i10 = this.B) == -1 || i10 == 0 || i10 == 1) ? false : true;
    }

    public final void G(float f10) {
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer == null) {
            uj0.f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            return;
        }
        try {
            mediaPlayer.setVolume(f10, f10);
        } catch (IllegalStateException unused) {
        }
    }

    public final void H(int i10) {
        if (i10 == 3) {
            this.f5278z.e();
            this.f6275x.d();
        } else if (this.B == 3) {
            this.f5278z.f();
            this.f6275x.e();
        }
        this.B = i10;
    }

    public final /* synthetic */ void M(int i10) {
        jl0 jl0Var = this.N;
        if (jl0Var != null) {
            jl0Var.onWindowVisibilityChanged(i10);
        }
    }

    @Override // ai.kl0
    public final String h() {
        String str = true != this.L ? "" : " spherical";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // ai.kl0
    public final void i(jl0 jl0Var) {
        this.N = jl0Var;
    }

    @Override // ai.kl0
    public final void j(String str) {
        Uri parse = Uri.parse(str);
        bn p10 = bn.p(parse);
        if (p10 == null || p10.f2404w != null) {
            if (p10 != null) {
                parse = Uri.parse(p10.f2404w);
            }
            this.E = parse;
            this.M = 0;
            x();
            requestLayout();
            invalidate();
        }
    }

    @Override // ai.kl0
    public final void k() {
        yg.p1.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.D.release();
            this.D = null;
            H(0);
            this.C = 0;
        }
        this.f5278z.c();
    }

    @Override // ai.kl0
    public final void l() {
        yg.p1.k("AdMediaPlayerView play");
        if (F()) {
            this.D.start();
            H(3);
            this.f6274w.a();
            yg.d2.f61866i.post(new gl0(this));
        }
        this.C = 3;
    }

    @Override // ai.kl0, ai.hm0
    public final void m() {
        G(this.f6275x.c());
    }

    @Override // ai.kl0
    public final void n() {
        yg.p1.k("AdMediaPlayerView pause");
        if (F() && this.D.isPlaying()) {
            this.D.pause();
            H(4);
            yg.d2.f61866i.post(new hl0(this));
        }
        this.C = 4;
    }

    @Override // ai.kl0
    public final int o() {
        if (F()) {
            return this.D.getDuration();
        }
        return -1;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.H = i10;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        yg.p1.k("AdMediaPlayerView completion");
        H(5);
        this.C = 5;
        yg.d2.f61866i.post(new al0(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        Map<Integer, String> map = Q;
        String str = map.get(Integer.valueOf(i10));
        String str2 = map.get(Integer.valueOf(i11));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb2.append("AdMediaPlayerView MediaPlayer error: ");
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        uj0.f(sb2.toString());
        H(-1);
        this.C = -1;
        yg.d2.f61866i.post(new cl0(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        Map<Integer, String> map = Q;
        String str = map.get(Integer.valueOf(i10));
        String str2 = map.get(Integer.valueOf(i11));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb2.append("AdMediaPlayerView MediaPlayer info: ");
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        yg.p1.k(sb2.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
        if (r1 > r6) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.F
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.G
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.F
            if (r2 <= 0) goto L7a
            int r2 = r5.G
            if (r2 <= 0) goto L7a
            ai.bm0 r2 = r5.K
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L42
            if (r1 != r2) goto L41
            int r0 = r5.F
            int r1 = r0 * r7
            int r2 = r5.G
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
            goto L52
        L41:
            r0 = r2
        L42:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.G
            int r0 = r0 * r6
            int r2 = r5.F
            int r0 = r0 / r2
            if (r1 != r3) goto L51
            if (r0 <= r7) goto L51
            goto L60
        L51:
            r1 = r0
        L52:
            r0 = r6
            goto L7a
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.F
            int r1 = r1 * r7
            int r2 = r5.G
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.F
            int r4 = r5.G
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L52
        L7a:
            r5.setMeasuredDimension(r0, r1)
            ai.bm0 r6 = r5.K
            if (r6 == 0) goto L84
            r6.b(r0, r1)
        L84:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 16
            if (r6 != r7) goto L9d
            int r6 = r5.I
            if (r6 <= 0) goto L90
            if (r6 != r0) goto L96
        L90:
            int r6 = r5.J
            if (r6 <= 0) goto L99
            if (r6 == r1) goto L99
        L96:
            r5.D()
        L99:
            r5.I = r0
            r5.J = r1
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.il0.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        yg.p1.k("AdMediaPlayerView prepared");
        H(2);
        this.f5278z.b();
        yg.d2.f61866i.post(new zk0(this, mediaPlayer));
        this.F = mediaPlayer.getVideoWidth();
        this.G = mediaPlayer.getVideoHeight();
        int i10 = this.M;
        if (i10 != 0) {
            q(i10);
        }
        D();
        int i11 = this.F;
        int i12 = this.G;
        StringBuilder sb2 = new StringBuilder(62);
        sb2.append("AdMediaPlayerView stream dimensions: ");
        sb2.append(i11);
        sb2.append(" x ");
        sb2.append(i12);
        uj0.e(sb2.toString());
        if (this.C == 3) {
            l();
        }
        m();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        yg.p1.k("AdMediaPlayerView surface created");
        x();
        yg.d2.f61866i.post(new dl0(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        yg.p1.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer != null && this.M == 0) {
            this.M = mediaPlayer.getCurrentPosition();
        }
        bm0 bm0Var = this.K;
        if (bm0Var != null) {
            bm0Var.c();
        }
        yg.d2.f61866i.post(new fl0(this));
        E(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        yg.p1.k("AdMediaPlayerView surface changed");
        int i12 = this.C;
        boolean z10 = false;
        if (this.F == i10 && this.G == i11) {
            z10 = true;
        }
        if (this.D != null && i12 == 3 && z10) {
            int i13 = this.M;
            if (i13 != 0) {
                q(i13);
            }
            l();
        }
        bm0 bm0Var = this.K;
        if (bm0Var != null) {
            bm0Var.b(i10, i11);
        }
        yg.d2.f61866i.post(new el0(this, i10, i11));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f5278z.d(this);
        this.f6274w.b(surfaceTexture, this.N);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(57);
        sb2.append("AdMediaPlayerView size changed: ");
        sb2.append(i10);
        sb2.append(" x ");
        sb2.append(i11);
        yg.p1.k(sb2.toString());
        this.F = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.G = videoHeight;
        if (this.F == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i10) {
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("AdMediaPlayerView window visibility changed to ");
        sb2.append(i10);
        yg.p1.k(sb2.toString());
        yg.d2.f61866i.post(new Runnable(this, i10) { // from class: ai.yk0

            /* renamed from: w  reason: collision with root package name */
            public final il0 f12640w;

            /* renamed from: x  reason: collision with root package name */
            public final int f12641x;

            {
                this.f12640w = this;
                this.f12641x = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12640w.M(this.f12641x);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // ai.kl0
    public final int p() {
        if (F()) {
            return this.D.getCurrentPosition();
        }
        return 0;
    }

    @Override // ai.kl0
    public final void q(int i10) {
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("AdMediaPlayerView seek ");
        sb2.append(i10);
        yg.p1.k(sb2.toString());
        if (!F()) {
            this.M = i10;
            return;
        }
        this.D.seekTo(i10);
        this.M = 0;
    }

    @Override // ai.kl0
    public final void r(float f10, float f11) {
        bm0 bm0Var = this.K;
        if (bm0Var != null) {
            bm0Var.e(f10, f11);
        }
    }

    @Override // ai.kl0
    public final int s() {
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // ai.kl0
    public final int t() {
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // android.view.View
    public final String toString() {
        String name = il0.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb2.append(name);
        sb2.append("@");
        sb2.append(hexString);
        return sb2.toString();
    }

    @Override // ai.kl0
    public final long u() {
        if (this.P != null) {
            return (w() * this.H) / 100;
        }
        return -1L;
    }

    @Override // ai.kl0
    public final long v() {
        return 0L;
    }

    @Override // ai.kl0
    public final long w() {
        if (this.P != null) {
            return o() * this.P.intValue();
        }
        return -1L;
    }

    public final void x() {
        yg.p1.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.E == null || surfaceTexture == null) {
            return;
        }
        E(false);
        try {
            wg.t.t();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.D = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.D.setOnCompletionListener(this);
            this.D.setOnErrorListener(this);
            this.D.setOnInfoListener(this);
            this.D.setOnPreparedListener(this);
            this.D.setOnVideoSizeChangedListener(this);
            this.H = 0;
            if (this.L) {
                bm0 bm0Var = new bm0(getContext());
                this.K = bm0Var;
                bm0Var.a(surfaceTexture, getWidth(), getHeight());
                this.K.start();
                SurfaceTexture d10 = this.K.d();
                if (d10 != null) {
                    surfaceTexture = d10;
                } else {
                    this.K.c();
                    this.K = null;
                }
            }
            this.D.setDataSource(getContext(), this.E);
            wg.t.u();
            this.D.setSurface(new Surface(surfaceTexture));
            this.D.setAudioStreamType(3);
            this.D.setScreenOnWhilePlaying(true);
            this.D.prepareAsync();
            H(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e10) {
            uj0.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.E)), e10);
            onError(this.D, 1, 0);
        }
    }

    @Override // ai.kl0
    public final int y() {
        if (Build.VERSION.SDK_INT < 26 || !F()) {
            return -1;
        }
        return this.D.getMetrics().getInt("android.media.mediaplayer.dropped");
    }
}
