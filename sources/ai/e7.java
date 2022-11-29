package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzafr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class e7 extends v2 {
    public float A;
    public boolean B;
    public List C;
    public boolean D;
    public boolean E;
    public f3 F;
    public s54 G;

    /* renamed from: b */
    public final u6[] f3549b;

    /* renamed from: c */
    public final x9 f3550c;

    /* renamed from: d */
    public final Context f3551d;

    /* renamed from: e */
    public final f4 f3552e;

    /* renamed from: f */
    public final b7 f3553f;

    /* renamed from: g */
    public final c7 f3554g;

    /* renamed from: h */
    public final CopyOnWriteArraySet<k6> f3555h;

    /* renamed from: i */
    public final o11 f3556i;

    /* renamed from: j */
    public final q2 f3557j;

    /* renamed from: k */
    public final u2 f3558k;

    /* renamed from: l */
    public final j7 f3559l;

    /* renamed from: m */
    public final r7 f3560m;

    /* renamed from: n */
    public final s7 f3561n;

    /* renamed from: o */
    public v4 f3562o;

    /* renamed from: p */
    public v4 f3563p;

    /* renamed from: q */
    public AudioTrack f3564q;

    /* renamed from: r */
    public Object f3565r;

    /* renamed from: s */
    public Surface f3566s;

    /* renamed from: t */
    public int f3567t;

    /* renamed from: u */
    public int f3568u;

    /* renamed from: v */
    public int f3569v;

    /* renamed from: w */
    public on f3570w;

    /* renamed from: x */
    public on f3571x;

    /* renamed from: y */
    public int f3572y;

    /* renamed from: z */
    public lc3 f3573z;

    public e7(a7 a7Var) {
        e7 e7Var;
        Context context;
        o11 o11Var;
        lc3 lc3Var;
        b7 b7Var;
        c7 c7Var;
        Handler handler;
        Looper looper;
        x6 x6Var;
        f4 f4Var;
        ur3 ur3Var;
        mp3 mp3Var;
        x4 x4Var;
        ds3 ds3Var;
        y6 y6Var;
        a3 a3Var;
        v9 v9Var;
        Looper looper2;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        Context context6;
        x9 x9Var = new x9(v9.f11007a);
        this.f3550c = x9Var;
        try {
            context = a7Var.f1759a;
            Context applicationContext = context.getApplicationContext();
            this.f3551d = applicationContext;
            o11Var = a7Var.f1766h;
            this.f3556i = o11Var;
            lc3Var = a7Var.f1768j;
            this.f3573z = lc3Var;
            this.f3567t = 1;
            this.B = false;
            b7Var = new b7(this, null);
            this.f3553f = b7Var;
            c7Var = new c7(null);
            this.f3554g = c7Var;
            this.f3555h = new CopyOnWriteArraySet<>();
            looper = a7Var.f1767i;
            handler = new Handler(looper);
            x6Var = a7Var.f1760b;
            u6[] a10 = x6Var.a(handler, b7Var, b7Var, b7Var, b7Var);
            this.f3549b = a10;
            this.A = 1.0f;
            if (sb.f9778a < 21) {
                AudioTrack audioTrack = this.f3564q;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f3564q.release();
                    this.f3564q = null;
                }
                if (this.f3564q == null) {
                    this.f3564q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f3572y = this.f3564q.getAudioSessionId();
            } else {
                this.f3572y = y2.c(applicationContext);
            }
            this.C = Collections.emptyList();
            this.D = true;
            g6 g6Var = new g6();
            int[] iArr = new int[8];
            iArr[0] = 20;
            iArr[1] = 21;
            iArr[2] = 22;
            iArr[3] = 23;
            try {
                iArr[4] = 24;
                iArr[5] = 25;
                iArr[6] = 26;
                iArr[7] = 27;
                g6Var.c(iArr);
                h6 e10 = g6Var.e();
                ur3Var = a7Var.f1762d;
                mp3Var = a7Var.f1763e;
                x4Var = a7Var.f1764f;
                ds3Var = a7Var.f1765g;
                y6Var = a7Var.f1769k;
                a3Var = a7Var.f1771m;
                v9Var = a7Var.f1761c;
                looper2 = a7Var.f1767i;
                f4Var = new f4(a10, ur3Var, mp3Var, x4Var, ds3Var, o11Var, true, y6Var, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, 15000L, a3Var, 500L, false, v9Var, looper2, this, e10, null);
                e7Var = this;
            } catch (Throwable th2) {
                th = th2;
                e7Var = this;
            }
        } catch (Throwable th3) {
            th = th3;
            e7Var = this;
        }
        try {
            e7Var.f3552e = f4Var;
            f4Var.z(b7Var);
            f4Var.A(b7Var);
            context2 = a7Var.f1759a;
            e7Var.f3557j = new q2(context2, handler, b7Var);
            context3 = a7Var.f1759a;
            e7Var.f3558k = new u2(context3, handler, b7Var);
            sb.H(null, null);
            context4 = a7Var.f1759a;
            j7 j7Var = new j7(context4, handler, b7Var);
            e7Var.f3559l = j7Var;
            int i10 = e7Var.f3573z.f6519a;
            j7Var.b(3);
            context5 = a7Var.f1759a;
            e7Var.f3560m = new r7(context5);
            context6 = a7Var.f1759a;
            e7Var.f3561n = new s7(context6);
            e7Var.F = T(j7Var);
            e7Var.G = s54.f9735e;
            e7Var.S(1, 10, Integer.valueOf(e7Var.f3572y));
            e7Var.S(2, 10, Integer.valueOf(e7Var.f3572y));
            e7Var.S(1, 3, e7Var.f3573z);
            e7Var.S(2, 4, Integer.valueOf(e7Var.f3567t));
            e7Var.S(2, 5, 0);
            e7Var.S(1, 9, Boolean.valueOf(e7Var.B));
            e7Var.S(2, 7, c7Var);
            e7Var.S(6, 8, c7Var);
            x9Var.a();
        } catch (Throwable th4) {
            th = th4;
            e7Var.f3550c.a();
            throw th;
        }
    }

    public static /* synthetic */ void B(e7 e7Var) {
        e7Var.f3556i.n(e7Var.B);
        Iterator<k6> it = e7Var.f3555h.iterator();
        while (it.hasNext()) {
            it.next().n(e7Var.B);
        }
    }

    public static /* synthetic */ void F(e7 e7Var) {
        int h10 = e7Var.h();
        if (h10 == 2 || h10 == 3) {
            e7Var.R();
            e7Var.f3552e.v();
            e7Var.l();
            e7Var.l();
        }
    }

    public static /* synthetic */ f3 G(j7 j7Var) {
        return T(j7Var);
    }

    public static f3 T(j7 j7Var) {
        return new f3(0, j7Var.c(), j7Var.d());
    }

    public static int U(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    public static /* synthetic */ CopyOnWriteArraySet V(e7 e7Var) {
        return e7Var.f3555h;
    }

    public static /* synthetic */ o11 W(e7 e7Var) {
        return e7Var.f3556i;
    }

    public static /* synthetic */ j7 X(e7 e7Var) {
        return e7Var.f3559l;
    }

    public static /* synthetic */ v4 Y(e7 e7Var, v4 v4Var) {
        e7Var.f3562o = v4Var;
        return v4Var;
    }

    public static /* synthetic */ v4 Z(e7 e7Var, v4 v4Var) {
        e7Var.f3563p = v4Var;
        return v4Var;
    }

    public static /* synthetic */ Object a0(e7 e7Var) {
        return e7Var.f3565r;
    }

    public static /* synthetic */ on b0(e7 e7Var, on onVar) {
        e7Var.f3570w = onVar;
        return onVar;
    }

    public static /* synthetic */ on c0(e7 e7Var, on onVar) {
        e7Var.f3571x = onVar;
        return onVar;
    }

    public static /* synthetic */ boolean d0(e7 e7Var) {
        return e7Var.B;
    }

    public static /* synthetic */ boolean e0(e7 e7Var, boolean z10) {
        e7Var.B = z10;
        return z10;
    }

    public static /* synthetic */ f3 f0(e7 e7Var) {
        return e7Var.F;
    }

    public static /* synthetic */ f3 g0(e7 e7Var, f3 f3Var) {
        e7Var.F = f3Var;
        return f3Var;
    }

    public static /* synthetic */ s54 h0(e7 e7Var, s54 s54Var) {
        e7Var.G = s54Var;
        return s54Var;
    }

    public static /* synthetic */ void v(e7 e7Var, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        e7Var.I(surface);
        e7Var.f3566s = surface;
    }

    public static /* synthetic */ void w(e7 e7Var, Object obj) {
        e7Var.I(null);
    }

    public static /* synthetic */ void z(e7 e7Var, int i10, int i11) {
        e7Var.J(i10, i11);
    }

    @Override // ai.o6
    public final int C() {
        R();
        return this.f3552e.C();
    }

    @Override // ai.o6
    public final q7 D() {
        R();
        return this.f3552e.D();
    }

    public final void I(Object obj) {
        boolean z10;
        ArrayList<r6> arrayList = new ArrayList();
        u6[] u6VarArr = this.f3549b;
        int length = u6VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= 2) {
                break;
            }
            u6 u6Var = u6VarArr[i10];
            if (u6Var.U() == 2) {
                r6 L = this.f3552e.L(u6Var);
                L.b(1);
                L.d(obj);
                L.g();
                arrayList.add(L);
            }
            i10++;
        }
        Object obj2 = this.f3565r;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                for (r6 r6Var : arrayList) {
                    r6Var.j(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.f3565r;
            Surface surface = this.f3566s;
            if (obj3 == surface) {
                surface.release();
                this.f3566s = null;
            }
        }
        this.f3565r = obj;
        if (z10) {
            this.f3552e.I(false, zzaeg.c(new zzafr(3), AnalyticsListener.EVENT_LOAD_ERROR));
        }
    }

    public final void J(int i10, int i11) {
        if (i10 == this.f3568u && i11 == this.f3569v) {
            return;
        }
        this.f3568u = i10;
        this.f3569v = i11;
        this.f3556i.p(i10, i11);
        Iterator<k6> it = this.f3555h.iterator();
        while (it.hasNext()) {
            it.next().p(i10, i11);
        }
    }

    @Override // ai.o6
    public final long K() {
        R();
        return this.f3552e.K();
    }

    public final void L() {
        S(1, 2, Float.valueOf(this.A * this.f3558k.a()));
    }

    public final void M(boolean z10, int i10, int i11) {
        int i12 = 1;
        boolean z11 = z10 && i10 != -1;
        if (!z11 || i10 == 1) {
            i12 = 0;
        }
        this.f3552e.G(z11, i12, i11);
    }

    @Override // ai.o6
    public final long N() {
        R();
        return this.f3552e.N();
    }

    @Override // ai.o6
    public final int O() {
        R();
        return this.f3552e.O();
    }

    @Override // ai.o6
    public final void P(int i10, long j10) {
        R();
        this.f3556i.S();
        this.f3552e.P(i10, j10);
    }

    @Override // ai.o6
    @Deprecated
    public final void Q(boolean z10) {
        R();
        this.f3558k.b(l(), 1);
        this.f3552e.I(false, null);
        this.C = Collections.emptyList();
    }

    public final void R() {
        this.f3550c.d();
        if (Thread.currentThread() != this.f3552e.w().getThread()) {
            String a02 = sb.a0("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f3552e.w().getThread().getName());
            if (!this.D) {
                oa.a("SimpleExoPlayer", a02, this.E ? null : new IllegalStateException());
                this.E = true;
                return;
            }
            throw new IllegalStateException(a02);
        }
    }

    public final void S(int i10, int i11, Object obj) {
        u6[] u6VarArr = this.f3549b;
        int length = u6VarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            u6 u6Var = u6VarArr[i12];
            if (u6Var.U() == i10) {
                r6 L = this.f3552e.L(u6Var);
                L.b(i11);
                L.d(obj);
                L.g();
            }
        }
    }

    public final void e(float f10) {
        R();
        float e02 = sb.e0(f10, 0.0f, 1.0f);
        if (this.A == e02) {
            return;
        }
        this.A = e02;
        L();
        this.f3556i.z(e02);
        Iterator<k6> it = this.f3555h.iterator();
        while (it.hasNext()) {
            it.next().z(e02);
        }
    }

    public final void f(r31 r31Var) {
        this.f3556i.H(r31Var);
    }

    public final void g(r31 r31Var) {
        this.f3556i.O(r31Var);
    }

    public final int h() {
        R();
        return this.f3552e.B();
    }

    public final void i() {
        R();
        boolean l10 = l();
        int b10 = this.f3558k.b(l10, 2);
        M(l10, b10, U(l10, b10));
        this.f3552e.E();
    }

    public final void i0(Surface surface) {
        R();
        I(surface);
        int i10 = surface == null ? 0 : -1;
        J(i10, i10);
    }

    public final void j(dp3 dp3Var) {
        R();
        this.f3552e.F(Collections.singletonList(dp3Var), true);
    }

    public final void k(boolean z10) {
        R();
        int b10 = this.f3558k.b(z10, h());
        M(z10, b10, U(z10, b10));
    }

    public final boolean l() {
        R();
        return this.f3552e.H();
    }

    public final void m() {
        AudioTrack audioTrack;
        R();
        if (sb.f9778a < 21 && (audioTrack = this.f3564q) != null) {
            audioTrack.release();
            this.f3564q = null;
        }
        this.f3559l.e();
        this.f3558k.c();
        this.f3552e.J();
        this.f3556i.Q();
        Surface surface = this.f3566s;
        if (surface != null) {
            surface.release();
            this.f3566s = null;
        }
        this.C = Collections.emptyList();
    }

    @Override // ai.o6
    public final int n() {
        R();
        return 0;
    }

    @Override // ai.o6
    public final boolean o() {
        R();
        return false;
    }

    public final int p() {
        R();
        this.f3552e.e();
        return 2;
    }

    public final long q() {
        R();
        return this.f3552e.M();
    }

    @Override // ai.o6
    public final int r() {
        R();
        return this.f3552e.r();
    }

    public final long s() {
        R();
        return this.f3552e.R();
    }

    @Deprecated
    public final void t(boolean z10) {
        this.D = false;
    }

    @Override // ai.o6
    public final long u() {
        R();
        return this.f3552e.u();
    }

    @Override // ai.o6
    public final int x() {
        R();
        return this.f3552e.x();
    }

    @Override // ai.o6
    public final boolean y() {
        R();
        return this.f3552e.y();
    }
}
