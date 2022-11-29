package ai;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

@TargetApi(16)
/* loaded from: classes3.dex */
public final class vm0 extends kl0 implements TextureView.SurfaceTextureListener, tl0 {
    public final boolean A;
    public final dm0 B;
    public jl0 C;
    public Surface D;
    public ul0 E;
    public String F;
    public String[] G;
    public boolean H;
    public int I;
    public bm0 J;
    public final boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;

    /* renamed from: y  reason: collision with root package name */
    public final em0 f11125y;

    /* renamed from: z  reason: collision with root package name */
    public final fm0 f11126z;

    public vm0(Context context, fm0 fm0Var, em0 em0Var, boolean z10, boolean z11, dm0 dm0Var) {
        super(context);
        this.I = 1;
        this.A = z11;
        this.f11125y = em0Var;
        this.f11126z = fm0Var;
        this.K = z10;
        this.B = dm0Var;
        setSurfaceTextureListener(this);
        fm0Var.a(this);
    }

    public static String Y(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + length + String.valueOf(message).length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(canonicalName);
        sb2.append(":");
        sb2.append(message);
        return sb2.toString();
    }

    @Override // ai.kl0
    public final void A(int i10) {
        ul0 ul0Var = this.E;
        if (ul0Var != null) {
            ul0Var.G(i10);
        }
    }

    @Override // ai.kl0
    public final void B(int i10) {
        ul0 ul0Var = this.E;
        if (ul0Var != null) {
            ul0Var.H(i10);
        }
    }

    @Override // ai.kl0
    public final void C(int i10) {
        ul0 ul0Var = this.E;
        if (ul0Var != null) {
            ul0Var.a0(i10);
        }
    }

    public final ul0 D() {
        if (this.B.f3347m) {
            return new hp0(this.f11125y.getContext(), this.B, this.f11125y);
        }
        return new mn0(this.f11125y.getContext(), this.B, this.f11125y);
    }

    public final String E() {
        return wg.t.d().P(this.f11125y.getContext(), this.f11125y.m().f13013w);
    }

    public final /* synthetic */ void F() {
        jl0 jl0Var = this.C;
        if (jl0Var != null) {
            jl0Var.i();
        }
    }

    public final /* synthetic */ void G(String str) {
        jl0 jl0Var = this.C;
        if (jl0Var != null) {
            jl0Var.a("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void H(boolean z10, long j10) {
        this.f11125y.y0(z10, j10);
    }

    public final /* synthetic */ void I(int i10) {
        jl0 jl0Var = this.C;
        if (jl0Var != null) {
            jl0Var.onWindowVisibilityChanged(i10);
        }
    }

    public final /* synthetic */ void J() {
        jl0 jl0Var = this.C;
        if (jl0Var != null) {
            jl0Var.e();
        }
    }

    public final /* synthetic */ void K(int i10, int i11) {
        jl0 jl0Var = this.C;
        if (jl0Var != null) {
            jl0Var.g(i10, i11);
        }
    }

    public final /* synthetic */ void L() {
        jl0 jl0Var = this.C;
        if (jl0Var != null) {
            jl0Var.zza();
        }
    }

    public final /* synthetic */ void M() {
        jl0 jl0Var = this.C;
        if (jl0Var != null) {
            jl0Var.d();
        }
    }

    public final /* synthetic */ void N() {
        jl0 jl0Var = this.C;
        if (jl0Var != null) {
            jl0Var.b();
        }
    }

    public final /* synthetic */ void O(String str) {
        jl0 jl0Var = this.C;
        if (jl0Var != null) {
            jl0Var.f("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void P() {
        jl0 jl0Var = this.C;
        if (jl0Var != null) {
            jl0Var.c();
        }
    }

    public final /* synthetic */ void Q() {
        jl0 jl0Var = this.C;
        if (jl0Var != null) {
            jl0Var.zzb();
        }
    }

    public final boolean R() {
        ul0 ul0Var = this.E;
        return (ul0Var == null || !ul0Var.B() || this.H) ? false : true;
    }

    public final boolean S() {
        return R() && this.I != 1;
    }

    public final void T(boolean z10) {
        if ((this.E != null && !z10) || this.F == null || this.D == null) {
            return;
        }
        if (z10) {
            if (R()) {
                this.E.Y();
                U();
            } else {
                uj0.f("No valid ExoPlayerAdapter exists when switch source.");
                return;
            }
        }
        if (this.F.startsWith("cache:")) {
            fo0 C0 = this.f11125y.C0(this.F);
            if (C0 instanceof oo0) {
                ul0 u10 = ((oo0) C0).u();
                this.E = u10;
                if (!u10.B()) {
                    uj0.f("Precached video player has been released.");
                    return;
                }
            } else if (C0 instanceof lo0) {
                lo0 lo0Var = (lo0) C0;
                String E = E();
                ByteBuffer w10 = lo0Var.w();
                boolean v10 = lo0Var.v();
                String u11 = lo0Var.u();
                if (u11 == null) {
                    uj0.f("Stream cache URL is null.");
                    return;
                }
                ul0 D = D();
                this.E = D;
                D.T(new Uri[]{Uri.parse(u11)}, E, w10, v10);
            } else {
                String valueOf = String.valueOf(this.F);
                uj0.f(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                return;
            }
        } else {
            this.E = D();
            String E2 = E();
            Uri[] uriArr = new Uri[this.G.length];
            int i10 = 0;
            while (true) {
                String[] strArr = this.G;
                if (i10 >= strArr.length) {
                    break;
                }
                uriArr[i10] = Uri.parse(strArr[i10]);
                i10++;
            }
            this.E.S(uriArr, E2);
        }
        this.E.U(this);
        V(this.D, false);
        if (this.E.B()) {
            int C = this.E.C();
            this.I = C;
            if (C == 3) {
                X();
            }
        }
    }

    public final void U() {
        if (this.E != null) {
            V(null, true);
            ul0 ul0Var = this.E;
            if (ul0Var != null) {
                ul0Var.U(null);
                this.E.V();
                this.E = null;
            }
            this.I = 1;
            this.H = false;
            this.L = false;
            this.M = false;
        }
    }

    public final void V(Surface surface, boolean z10) {
        ul0 ul0Var = this.E;
        if (ul0Var != null) {
            try {
                ul0Var.W(surface, z10);
                return;
            } catch (IOException e10) {
                uj0.g("", e10);
                return;
            }
        }
        uj0.f("Trying to set surface before player is initialized.");
    }

    public final void W(float f10, boolean z10) {
        ul0 ul0Var = this.E;
        if (ul0Var != null) {
            try {
                ul0Var.X(f10, z10);
                return;
            } catch (IOException e10) {
                uj0.g("", e10);
                return;
            }
        }
        uj0.f("Trying to set volume before player is initialized.");
    }

    public final void X() {
        if (this.L) {
            return;
        }
        this.L = true;
        yg.d2.f61866i.post(new Runnable(this) { // from class: ai.jm0

            /* renamed from: w  reason: collision with root package name */
            public final vm0 f5840w;

            {
                this.f5840w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5840w.Q();
            }
        });
        m();
        this.f11126z.b();
        if (this.M) {
            l();
        }
    }

    public final void Z() {
        a0(this.N, this.O);
    }

    @Override // ai.tl0
    public final void a(int i10) {
        if (this.I != i10) {
            this.I = i10;
            if (i10 == 3) {
                X();
            } else if (i10 != 4) {
            } else {
                if (this.B.f3335a) {
                    c0();
                }
                this.f11126z.f();
                this.f6275x.e();
                yg.d2.f61866i.post(new Runnable(this) { // from class: ai.mm0

                    /* renamed from: w  reason: collision with root package name */
                    public final vm0 f6975w;

                    {
                        this.f6975w = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6975w.P();
                    }
                });
            }
        }
    }

    public final void a0(int i10, int i11) {
        float f10 = i11 > 0 ? i10 / i11 : 1.0f;
        if (this.R != f10) {
            this.R = f10;
            requestLayout();
        }
    }

    @Override // ai.tl0
    public final void b(final boolean z10, final long j10) {
        if (this.f11125y != null) {
            hk0.f4882e.execute(new Runnable(this, z10, j10) { // from class: ai.um0

                /* renamed from: w  reason: collision with root package name */
                public final vm0 f10753w;

                /* renamed from: x  reason: collision with root package name */
                public final boolean f10754x;

                /* renamed from: y  reason: collision with root package name */
                public final long f10755y;

                {
                    this.f10753w = this;
                    this.f10754x = z10;
                    this.f10755y = j10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f10753w.H(this.f10754x, this.f10755y);
                }
            });
        }
    }

    public final void b0() {
        ul0 ul0Var = this.E;
        if (ul0Var != null) {
            ul0Var.N(true);
        }
    }

    @Override // ai.tl0
    public final void c(String str, Exception exc) {
        String str2;
        final String Y = Y("onLoadException", exc);
        if (Y.length() != 0) {
            str2 = "ExoPlayerAdapter exception: ".concat(Y);
        } else {
            str2 = new String("ExoPlayerAdapter exception: ");
        }
        uj0.f(str2);
        wg.t.h().l(exc, "AdExoPlayerView.onException");
        yg.d2.f61866i.post(new Runnable(this, Y) { // from class: ai.km0

            /* renamed from: w  reason: collision with root package name */
            public final vm0 f6285w;

            /* renamed from: x  reason: collision with root package name */
            public final String f6286x;

            {
                this.f6285w = this;
                this.f6286x = Y;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6285w.G(this.f6286x);
            }
        });
    }

    public final void c0() {
        ul0 ul0Var = this.E;
        if (ul0Var != null) {
            ul0Var.N(false);
        }
    }

    @Override // ai.tl0
    public final void d(int i10, int i11) {
        this.N = i10;
        this.O = i11;
        Z();
    }

    @Override // ai.tl0
    public final void e(String str, Exception exc) {
        String str2;
        final String Y = Y(str, exc);
        if (Y.length() != 0) {
            str2 = "ExoPlayerAdapter error: ".concat(Y);
        } else {
            str2 = new String("ExoPlayerAdapter error: ");
        }
        uj0.f(str2);
        this.H = true;
        if (this.B.f3335a) {
            c0();
        }
        yg.d2.f61866i.post(new Runnable(this, Y) { // from class: ai.nm0

            /* renamed from: w  reason: collision with root package name */
            public final vm0 f7404w;

            /* renamed from: x  reason: collision with root package name */
            public final String f7405x;

            {
                this.f7404w = this;
                this.f7405x = Y;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7404w.O(this.f7405x);
            }
        });
        wg.t.h().l(exc, "AdExoPlayerView.onError");
    }

    @Override // ai.kl0
    public final void f(int i10) {
        ul0 ul0Var = this.E;
        if (ul0Var != null) {
            ul0Var.b0(i10);
        }
    }

    @Override // ai.kl0
    public final void g(int i10) {
        ul0 ul0Var = this.E;
        if (ul0Var != null) {
            ul0Var.c0(i10);
        }
    }

    @Override // ai.kl0
    public final String h() {
        String str = true != this.K ? "" : " spherical";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // ai.kl0
    public final void i(jl0 jl0Var) {
        this.C = jl0Var;
    }

    @Override // ai.kl0
    public final void j(String str) {
        if (str != null) {
            z(str, null);
        }
    }

    @Override // ai.kl0
    public final void k() {
        if (R()) {
            this.E.Y();
            U();
        }
        this.f11126z.f();
        this.f6275x.e();
        this.f11126z.c();
    }

    @Override // ai.kl0
    public final void l() {
        if (!S()) {
            this.M = true;
            return;
        }
        if (this.B.f3335a) {
            b0();
        }
        this.E.F(true);
        this.f11126z.e();
        this.f6275x.d();
        this.f6274w.a();
        yg.d2.f61866i.post(new Runnable(this) { // from class: ai.om0

            /* renamed from: w  reason: collision with root package name */
            public final vm0 f7853w;

            {
                this.f7853w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7853w.N();
            }
        });
    }

    @Override // ai.kl0, ai.hm0
    public final void m() {
        W(this.f6275x.c(), false);
    }

    @Override // ai.kl0
    public final void n() {
        if (S()) {
            if (this.B.f3335a) {
                c0();
            }
            this.E.F(false);
            this.f11126z.f();
            this.f6275x.e();
            yg.d2.f61866i.post(new Runnable(this) { // from class: ai.pm0

                /* renamed from: w  reason: collision with root package name */
                public final vm0 f8474w;

                {
                    this.f8474w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f8474w.M();
                }
            });
        }
    }

    @Override // ai.kl0
    public final int o() {
        if (S()) {
            return (int) this.E.I();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.R;
        if (f10 != 0.0f && this.J == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        bm0 bm0Var = this.J;
        if (bm0Var != null) {
            bm0Var.b(measuredWidth, measuredHeight);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i13 = this.P;
            if (((i13 > 0 && i13 != measuredWidth) || ((i12 = this.Q) > 0 && i12 != measuredHeight)) && this.A && R() && this.E.D() > 0 && !this.E.E()) {
                W(0.0f, true);
                this.E.F(true);
                long D = this.E.D();
                long currentTimeMillis = wg.t.k().currentTimeMillis();
                while (R() && this.E.D() == D && wg.t.k().currentTimeMillis() - currentTimeMillis <= 250) {
                }
                this.E.F(false);
                m();
            }
            this.P = measuredWidth;
            this.Q = measuredHeight;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.K) {
            bm0 bm0Var = new bm0(getContext());
            this.J = bm0Var;
            bm0Var.a(surfaceTexture, i10, i11);
            this.J.start();
            SurfaceTexture d10 = this.J.d();
            if (d10 != null) {
                surfaceTexture = d10;
            } else {
                this.J.c();
                this.J = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.D = surface;
        if (this.E == null) {
            T(false);
        } else {
            V(surface, true);
            if (!this.B.f3335a) {
                b0();
            }
        }
        if (this.N != 0 && this.O != 0) {
            Z();
        } else {
            a0(i10, i11);
        }
        yg.d2.f61866i.post(new Runnable(this) { // from class: ai.qm0

            /* renamed from: w  reason: collision with root package name */
            public final vm0 f9006w;

            {
                this.f9006w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9006w.L();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        n();
        bm0 bm0Var = this.J;
        if (bm0Var != null) {
            bm0Var.c();
            this.J = null;
        }
        if (this.E != null) {
            c0();
            Surface surface = this.D;
            if (surface != null) {
                surface.release();
            }
            this.D = null;
            V(null, true);
        }
        yg.d2.f61866i.post(new Runnable(this) { // from class: ai.sm0

            /* renamed from: w  reason: collision with root package name */
            public final vm0 f9878w;

            {
                this.f9878w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9878w.J();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i10, final int i11) {
        bm0 bm0Var = this.J;
        if (bm0Var != null) {
            bm0Var.b(i10, i11);
        }
        yg.d2.f61866i.post(new Runnable(this, i10, i11) { // from class: ai.rm0

            /* renamed from: w  reason: collision with root package name */
            public final vm0 f9499w;

            /* renamed from: x  reason: collision with root package name */
            public final int f9500x;

            /* renamed from: y  reason: collision with root package name */
            public final int f9501y;

            {
                this.f9499w = this;
                this.f9500x = i10;
                this.f9501y = i11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9499w.K(this.f9500x, this.f9501y);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f11126z.d(this);
        this.f6274w.b(surfaceTexture, this.C);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i10) {
        StringBuilder sb2 = new StringBuilder(57);
        sb2.append("AdExoPlayerView3 window visibility changed to ");
        sb2.append(i10);
        yg.p1.k(sb2.toString());
        yg.d2.f61866i.post(new Runnable(this, i10) { // from class: ai.tm0

            /* renamed from: w  reason: collision with root package name */
            public final vm0 f10352w;

            /* renamed from: x  reason: collision with root package name */
            public final int f10353x;

            {
                this.f10352w = this;
                this.f10353x = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10352w.I(this.f10353x);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // ai.kl0
    public final int p() {
        if (S()) {
            return (int) this.E.D();
        }
        return 0;
    }

    @Override // ai.kl0
    public final void q(int i10) {
        if (S()) {
            this.E.Z(i10);
        }
    }

    @Override // ai.kl0
    public final void r(float f10, float f11) {
        bm0 bm0Var = this.J;
        if (bm0Var != null) {
            bm0Var.e(f10, f11);
        }
    }

    @Override // ai.kl0
    public final int s() {
        return this.N;
    }

    @Override // ai.kl0
    public final int t() {
        return this.O;
    }

    @Override // ai.kl0
    public final long u() {
        ul0 ul0Var = this.E;
        if (ul0Var != null) {
            return ul0Var.J();
        }
        return -1L;
    }

    @Override // ai.kl0
    public final long v() {
        ul0 ul0Var = this.E;
        if (ul0Var != null) {
            return ul0Var.K();
        }
        return -1L;
    }

    @Override // ai.kl0
    public final long w() {
        ul0 ul0Var = this.E;
        if (ul0Var != null) {
            return ul0Var.L();
        }
        return -1L;
    }

    @Override // ai.tl0
    public final void x() {
        yg.d2.f61866i.post(new Runnable(this) { // from class: ai.lm0

            /* renamed from: w  reason: collision with root package name */
            public final vm0 f6617w;

            {
                this.f6617w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6617w.F();
            }
        });
    }

    @Override // ai.kl0
    public final int y() {
        ul0 ul0Var = this.E;
        if (ul0Var != null) {
            return ul0Var.M();
        }
        return -1;
    }

    @Override // ai.kl0
    public final void z(String str, String[] strArr) {
        if (str == null) {
            return;
        }
        boolean z10 = true;
        if (strArr == null) {
            this.G = new String[]{str};
        } else {
            this.G = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.F;
        if (!this.B.f3348n || str2 == null || str.equals(str2) || this.I != 4) {
            z10 = false;
        }
        this.F = str;
        T(z10);
    }
}
