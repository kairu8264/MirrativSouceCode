package ze;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.hardware.display.VirtualDisplay;
import android.media.MediaFormat;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.view.Choreographer;
import android.view.Surface;
import bf.a;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.Referer;
import com.dena.showroom.flvplayback.Closeable;
import com.dena.showroom.flvplayback.SampleSource;
import com.dena.showroom.flvplayback.impl.publish.VideoEncoderSetting;
import com.dena.showroom.flvplayback.impl.util.Loopers;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import jo.e0;
import of.e;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class k implements SampleSource, Closeable, Choreographer.FrameCallback {

    /* renamed from: e0  reason: collision with root package name */
    public static final b f63136e0 = new b(null);

    /* renamed from: f0  reason: collision with root package name */
    public static final int f63137f0 = 8;
    public final Handler A;
    public int B;
    public int C;
    public Size D;
    public int E;
    public SurfaceTexture F;
    public Surface G;
    public d H;
    public long I;
    public VirtualDisplay J;
    public final VideoEncoderSetting K;
    public long L;
    public Surface M;
    public float N;
    public bf.c O;
    public int P;
    public final float[] Q;
    public final HandlerThread R;
    public final Handler S;
    public bf.a T;
    public a.b U;
    public int V;
    public Choreographer W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public a f63138a0;

    /* renamed from: b0  reason: collision with root package name */
    public final o f63139b0;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f63140c0;

    /* renamed from: d0  reason: collision with root package name */
    public final boolean f63141d0;

    /* renamed from: w  reason: collision with root package name */
    public final Context f63142w;

    /* renamed from: x  reason: collision with root package name */
    public MediaProjection f63143x;

    /* renamed from: y  reason: collision with root package name */
    public final WeakHashMap<n, Void> f63144y;

    /* renamed from: z  reason: collision with root package name */
    public final ReentrantReadWriteLock f63145z;

    /* loaded from: classes2.dex */
    public interface a {
        void a(k kVar, Throwable th2);
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public k(Context context, Looper looper, MediaProjection mediaProjection, VideoEncoderSetting videoEncoderSetting, int i10, boolean z10) {
        jo.p.h(context, "mContext");
        jo.p.h(looper, "looper");
        jo.p.h(videoEncoderSetting, MRLog.PAYLOAD_KEY_SETTING);
        this.f63142w = context;
        this.f63143x = mediaProjection;
        this.f63144y = new WeakHashMap<>();
        this.f63145z = new ReentrantReadWriteLock();
        this.A = new Handler(looper);
        this.D = new Size(1, 1);
        this.E = 160;
        this.K = videoEncoderSetting;
        this.L = 33L;
        this.N = 1.0f;
        this.Q = new float[16];
        this.f63139b0 = new o();
        this.L = 1000 / videoEncoderSetting.getFps();
        this.f63140c0 = i10 > 0;
        this.f63141d0 = z10;
        HandlerThread handlerThread = new HandlerThread("RenderThread");
        this.R = handlerThread;
        handlerThread.start();
        this.S = new Handler(handlerThread.getLooper());
        h0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, android.util.Size] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, android.util.Size] */
    public static final void C(k kVar, e0 e0Var, e0 e0Var2, Size size) {
        jo.p.h(kVar, "this$0");
        jo.p.h(e0Var, "$iSize");
        jo.p.h(e0Var2, "$oSize");
        jo.p.h(size, "$dSize");
        if (kVar.H == null) {
            return;
        }
        e0Var.f38136w = new Size(kVar.B, kVar.C);
        ?? size2 = new Size(kVar.K.getResolution().getWidth(), kVar.K.getResolution().getHeight());
        e0Var2.f38136w = size2;
        d dVar = kVar.H;
        if (dVar != 0) {
            Size size3 = (Size) size2;
            dVar.c((Size) e0Var.f38136w, size2, size);
        }
        VirtualDisplay virtualDisplay = kVar.J;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        kVar.J = null;
        kVar.Y();
    }

    public static final void F(k kVar, Exception exc) {
        jo.p.h(kVar, "this$0");
        jo.p.h(exc, "$e");
        a aVar = kVar.f63138a0;
        if (aVar != null) {
            aVar.a(kVar, exc);
        }
    }

    public static final void S(k kVar) {
        jo.p.h(kVar, "this$0");
        kVar.U();
    }

    public static final void c0(k kVar) {
        jo.p.h(kVar, "this$0");
        Choreographer choreographer = Choreographer.getInstance();
        kVar.W = choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(kVar);
        }
    }

    public static final void q(k kVar) {
        jo.p.h(kVar, "this$0");
        kVar.G();
    }

    public static final void z(final k kVar, final e0 e0Var, final e0 e0Var2, final Size size) {
        jo.p.h(kVar, "this$0");
        jo.p.h(e0Var, "$iSize");
        jo.p.h(e0Var2, "$oSize");
        jo.p.h(size, "$dSize");
        try {
            Choreographer choreographer = kVar.W;
            if (choreographer != null) {
                choreographer.removeFrameCallback(kVar);
            }
            SurfaceTexture surfaceTexture = kVar.F;
            if (surfaceTexture != null) {
                surfaceTexture.setOnFrameAvailableListener(null, null);
            }
            SurfaceTexture surfaceTexture2 = kVar.F;
            if (surfaceTexture2 != null) {
                surfaceTexture2.release();
            }
            Surface surface = kVar.G;
            if (surface != null) {
                surface.release();
            }
            SurfaceTexture surfaceTexture3 = new SurfaceTexture(kVar.P);
            surfaceTexture3.setDefaultBufferSize(kVar.D.getWidth(), kVar.D.getHeight());
            kVar.F = surfaceTexture3;
            kVar.G = new Surface(kVar.F);
            Choreographer choreographer2 = kVar.W;
            if (choreographer2 != null) {
                choreographer2.postFrameCallback(kVar);
            }
        } catch (Throwable th2) {
            Log.e("MediaProjectionSource", MRLog.PAYLOAD_KEY_ERROR, th2);
        }
        Loopers.postAndWait(kVar.A, new Runnable() { // from class: ze.j
            @Override // java.lang.Runnable
            public final void run() {
                k.C(k.this, e0Var, e0Var2, size);
            }
        });
    }

    @SuppressLint({"NewApi"})
    public final void E(SurfaceTexture surfaceTexture) {
        if (this.X || this.Y || surfaceTexture.isReleased()) {
            return;
        }
        this.Z = true;
        if (X()) {
            try {
                surfaceTexture.updateTexImage();
                surfaceTexture.getTransformMatrix(this.Q);
                this.V = 0;
            } catch (Exception e10) {
                g9.a.c(e10);
                int i10 = this.V + 1;
                this.V = i10;
                if (i10 > 5) {
                    g9.a.c(new RuntimeException("Couldn't recover texture update failure"));
                    this.A.post(new Runnable() { // from class: ze.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            k.F(k.this, e10);
                        }
                    });
                }
            }
            I();
        }
        Choreographer choreographer = this.W;
        if (choreographer != null) {
            choreographer.postFrameCallback(this);
        }
    }

    public final void G() {
        bf.c cVar = this.O;
        if (cVar != null) {
            cVar.release();
        }
        this.O = null;
        Surface surface = this.G;
        if (surface != null) {
            surface.release();
        }
        this.G = null;
        SurfaceTexture surfaceTexture = this.F;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.F = null;
        a.b bVar = this.U;
        if (bVar != null) {
            bVar.b();
        }
        this.U = null;
        bf.a aVar = this.T;
        if (aVar != null) {
            aVar.n();
        }
        this.T = null;
    }

    public final void I() {
        this.I = System.currentTimeMillis();
        if (this.X || this.Y) {
            return;
        }
        a.b bVar = this.U;
        if (bVar != null) {
            bVar.a();
        }
        bf.c cVar = this.O;
        if (cVar != null) {
            if (o()) {
                return;
            }
            d dVar = this.H;
            if (dVar != null) {
                dVar.d(cVar, this.Q);
            }
        }
        a.b bVar2 = this.U;
        if (bVar2 != null) {
            bVar2.d();
        }
    }

    public final void K(float f10) {
        this.N = f10;
        if (this.f63144y == null) {
            return;
        }
        ReentrantReadWriteLock.ReadLock readLock = this.f63145z.readLock();
        jo.p.g(readLock, "connectionsLock.readLock()");
        readLock.lock();
        try {
            for (n nVar : this.f63144y.keySet()) {
                nVar.d(this.N);
            }
        } finally {
            readLock.unlock();
        }
    }

    public final void L(a aVar) {
        this.f63138a0 = aVar;
    }

    public final void N(long j10) {
        this.L = j10;
    }

    public final void O(boolean z10) {
        this.f63139b0.b(z10);
    }

    public final void P() {
        Loopers.postAndWait(this.S, new Runnable() { // from class: ze.g
            @Override // java.lang.Runnable
            public final void run() {
                k.S(k.this);
            }
        });
    }

    public final void U() {
        bf.c bVar;
        a.b bVar2 = null;
        bf.a aVar = new bf.a(null, false);
        this.T = aVar;
        a.b h10 = aVar.h(this.M);
        if (h10 != null) {
            h10.a();
            bVar2 = h10;
        }
        this.U = bVar2;
        if (this.f63141d0) {
            bVar = new bf.d();
        } else {
            bVar = new bf.b();
        }
        this.O = bVar;
        this.P = bVar.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.P);
        surfaceTexture.setDefaultBufferSize(this.D.getWidth(), this.D.getHeight());
        this.F = surfaceTexture;
        this.G = new Surface(this.F);
        this.H = c.f63116a.a();
        Size size = new Size(this.B, this.C);
        Size size2 = new Size(this.K.getResolution().getWidth(), this.K.getResolution().getHeight());
        Size size3 = new Size(this.B, this.C);
        d dVar = this.H;
        if (dVar != null) {
            dVar.a(this.P, size, size2, size3, this.f63141d0);
        }
    }

    public final boolean X() {
        return !this.X && !this.Y && this.Z && System.currentTimeMillis() - this.I >= this.L - ((long) 15);
    }

    public final void Y() {
        try {
            MediaProjection mediaProjection = this.f63143x;
            this.J = mediaProjection != null ? mediaProjection.createVirtualDisplay(TtmlNode.TEXT_EMPHASIS_AUTO, this.D.getWidth(), this.D.getHeight(), this.E, 16, this.G, null, null) : null;
            this.S.post(new Runnable() { // from class: ze.e
                @Override // java.lang.Runnable
                public final void run() {
                    k.c0(k.this);
                }
            });
        } catch (SecurityException e10) {
            a aVar = this.f63138a0;
            if (aVar != null) {
                aVar.a(this, e10);
            }
        }
    }

    @Override // com.dena.showroom.flvplayback.Closeable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        p(null);
    }

    public final void d0() {
    }

    public final JSONObject d1() {
        Iterator<n> it = this.f63144y.keySet().iterator();
        if (it.hasNext()) {
            return it.next().d1();
        }
        return new JSONObject();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        SurfaceTexture surfaceTexture = this.F;
        if (surfaceTexture != null) {
            E(surfaceTexture);
        }
    }

    public final void h0() {
        e.a c10 = of.e.c(this.f63142w);
        this.B = c10.d();
        this.C = c10.b();
        this.E = c10.a();
        if (this.f63141d0) {
            Size c11 = c.f63116a.c(c10.d(), c10.b(), this.K.getResolution().getWidth(), this.K.getResolution().getHeight());
            this.B = c11.getWidth();
            this.C = c11.getHeight();
            this.D = new Size(c11.getWidth(), c11.getHeight());
        } else if (this.f63140c0) {
            int b10 = c.f63116a.b(this.B, this.C, this.K.getResolution().getWidth(), this.K.getResolution().getHeight());
            this.D = new Size(b10, b10);
        } else {
            int b11 = c.f63116a.b(this.K.getResolution().getWidth(), this.K.getResolution().getHeight(), this.K.getResolution().getWidth(), this.K.getResolution().getHeight());
            this.D = new Size(b11, b11);
        }
    }

    public final float j() {
        return this.N;
    }

    public final long n() {
        return this.L;
    }

    public final boolean o() {
        return this.f63139b0.a();
    }

    @Override // com.dena.showroom.flvplayback.SampleSource
    public SampleSource.Connection open(SampleSource.Sink sink, double d10) {
        jo.p.h(sink, "sink");
        if (this.X || this.Y) {
            return null;
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(MimeTypes.VIDEO_H264, this.K.getResolution().getWidth(), this.K.getResolution().getHeight());
        jo.p.g(createVideoFormat, "createVideoFormat(\n     …solution.height\n        )");
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", (int) (this.K.getBps() * d10));
        createVideoFormat.setInteger("frame-rate", this.K.getFps());
        createVideoFormat.setInteger("i-frame-interval", this.K.getKeyframeInterval());
        createVideoFormat.setInteger(Referer.PROFILE, 1);
        createVideoFormat.setInteger("level", 512);
        Looper looper = this.A.getLooper();
        jo.p.g(looper, "handler.looper");
        n nVar = new n(this, looper, sink, createVideoFormat, (1000 / this.K.getFps()) / 2, d10);
        nVar.v(0);
        ReentrantReadWriteLock.WriteLock writeLock = this.f63145z.writeLock();
        jo.p.g(writeLock, "connectionsLock.writeLock()");
        writeLock.lock();
        try {
            WeakHashMap<n, Void> weakHashMap = this.f63144y;
            if (weakHashMap != null) {
                weakHashMap.put(nVar, null);
            }
            writeLock.unlock();
            this.M = nVar.j();
            P();
            Y();
            return nVar;
        } catch (Throwable th2) {
            writeLock.unlock();
            throw th2;
        }
    }

    public final void p(Throwable th2) {
        if (this.X) {
            return;
        }
        this.Y = true;
        MediaProjection mediaProjection = this.f63143x;
        if (mediaProjection != null) {
            mediaProjection.stop();
        }
        this.f63143x = null;
        Choreographer choreographer = this.W;
        if (choreographer != null) {
            choreographer.removeFrameCallback(this);
        }
        this.W = null;
        this.S.removeCallbacksAndMessages(null);
        Loopers.postAndWait(this.S, new Runnable() { // from class: ze.f
            @Override // java.lang.Runnable
            public final void run() {
                k.q(k.this);
            }
        });
        this.R.quit();
        this.A.removeCallbacksAndMessages(null);
        this.X = true;
        ReentrantReadWriteLock.ReadLock readLock = this.f63145z.readLock();
        jo.p.g(readLock, "connectionsLock.readLock()");
        readLock.lock();
        try {
            for (n nVar : this.f63144y.keySet()) {
                nVar.n(th2);
            }
            readLock.unlock();
            a aVar = this.f63138a0;
            if (aVar != null && th2 != null && aVar != null) {
                aVar.a(this, th2);
            }
            this.Y = false;
        } catch (Throwable th3) {
            readLock.unlock();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, android.util.Size] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, android.util.Size] */
    public final void v(Configuration configuration) {
        if (this.X || this.Y) {
            return;
        }
        h0();
        final e0 e0Var = new e0();
        final e0 e0Var2 = new e0();
        final Size size = new Size(this.B, this.C);
        if (this.f63141d0) {
            this.S.post(new Runnable() { // from class: ze.i
                @Override // java.lang.Runnable
                public final void run() {
                    k.z(k.this, e0Var, e0Var2, size);
                }
            });
        } else if (this.H != null) {
            e0Var.f38136w = new Size(this.B, this.C);
            ?? size2 = new Size(this.K.getResolution().getWidth(), this.K.getResolution().getHeight());
            e0Var2.f38136w = size2;
            d dVar = this.H;
            if (dVar != 0) {
                Size size3 = (Size) size2;
                dVar.c((Size) e0Var.f38136w, size2, size);
            }
        }
    }
}
