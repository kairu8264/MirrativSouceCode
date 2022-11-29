package s3;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import o3.c0;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    public static final int N = ViewConfiguration.getTapTimeout();
    public int C;
    public int D;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;

    /* renamed from: y  reason: collision with root package name */
    public final View f51991y;

    /* renamed from: z  reason: collision with root package name */
    public Runnable f51992z;

    /* renamed from: w  reason: collision with root package name */
    public final C0793a f51989w = new C0793a();

    /* renamed from: x  reason: collision with root package name */
    public final Interpolator f51990x = new AccelerateInterpolator();
    public float[] A = {0.0f, 0.0f};
    public float[] B = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] E = {0.0f, 0.0f};
    public float[] F = {0.0f, 0.0f};
    public float[] G = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: s3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0793a {

        /* renamed from: a  reason: collision with root package name */
        public int f51993a;

        /* renamed from: b  reason: collision with root package name */
        public int f51994b;

        /* renamed from: c  reason: collision with root package name */
        public float f51995c;

        /* renamed from: d  reason: collision with root package name */
        public float f51996d;

        /* renamed from: j  reason: collision with root package name */
        public float f52002j;

        /* renamed from: k  reason: collision with root package name */
        public int f52003k;

        /* renamed from: e  reason: collision with root package name */
        public long f51997e = Long.MIN_VALUE;

        /* renamed from: i  reason: collision with root package name */
        public long f52001i = -1;

        /* renamed from: f  reason: collision with root package name */
        public long f51998f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f51999g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f52000h = 0;

        public void a() {
            if (this.f51998f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g10 = g(e(currentAnimationTimeMillis));
                this.f51998f = currentAnimationTimeMillis;
                float f10 = ((float) (currentAnimationTimeMillis - this.f51998f)) * g10;
                this.f51999g = (int) (this.f51995c * f10);
                this.f52000h = (int) (f10 * this.f51996d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f51999g;
        }

        public int c() {
            return this.f52000h;
        }

        public int d() {
            float f10 = this.f51995c;
            return (int) (f10 / Math.abs(f10));
        }

        public final float e(long j10) {
            long j11 = this.f51997e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f52001i;
            if (j12 >= 0 && j10 >= j12) {
                float f10 = this.f52002j;
                return (1.0f - f10) + (f10 * a.f(((float) (j10 - j12)) / this.f52003k, 0.0f, 1.0f));
            }
            return a.f(((float) (j10 - j11)) / this.f51993a, 0.0f, 1.0f) * 0.5f;
        }

        public int f() {
            float f10 = this.f51996d;
            return (int) (f10 / Math.abs(f10));
        }

        public final float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public boolean h() {
            return this.f52001i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f52001i + ((long) this.f52003k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f52003k = a.h((int) (currentAnimationTimeMillis - this.f51997e), 0, this.f51994b);
            this.f52002j = e(currentAnimationTimeMillis);
            this.f52001i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f51994b = i10;
        }

        public void k(int i10) {
            this.f51993a = i10;
        }

        public void l(float f10, float f11) {
            this.f51995c = f10;
            this.f51996d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f51997e = currentAnimationTimeMillis;
            this.f52001i = -1L;
            this.f51998f = currentAnimationTimeMillis;
            this.f52002j = 0.5f;
            this.f51999g = 0;
            this.f52000h = 0;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.K) {
                if (aVar.I) {
                    aVar.I = false;
                    aVar.f51989w.m();
                }
                C0793a c0793a = a.this.f51989w;
                if (!c0793a.h() && a.this.C()) {
                    a aVar2 = a.this;
                    if (aVar2.J) {
                        aVar2.J = false;
                        aVar2.c();
                    }
                    c0793a.a();
                    a.this.r(c0793a.b(), c0793a.c());
                    c0.j0(a.this.f51991y, this);
                    return;
                }
                a.this.K = false;
            }
        }
    }

    public a(View view) {
        this.f51991y = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        w(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        x(f12, f12);
        t(1);
        v(Float.MAX_VALUE, Float.MAX_VALUE);
        A(0.2f, 0.2f);
        B(1.0f, 1.0f);
        s(N);
        z(500);
        y(500);
    }

    public static float f(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    public static int h(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    public a A(float f10, float f11) {
        float[] fArr = this.A;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a B(float f10, float f11) {
        float[] fArr = this.E;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public boolean C() {
        C0793a c0793a = this.f51989w;
        int f10 = c0793a.f();
        int d10 = c0793a.d();
        return (f10 != 0 && b(f10)) || (d10 != 0 && a(d10));
    }

    public final void D() {
        int i10;
        if (this.f51992z == null) {
            this.f51992z = new b();
        }
        this.K = true;
        this.I = true;
        if (!this.H && (i10 = this.D) > 0) {
            c0.k0(this.f51991y, this.f51992z, i10);
        } else {
            this.f51992z.run();
        }
        this.H = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f51991y.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final float d(int i10, float f10, float f11, float f12) {
        float m10 = m(this.A[i10], f11, this.B[i10], f10);
        int i11 = (m10 > 0.0f ? 1 : (m10 == 0.0f ? 0 : -1));
        if (i11 == 0) {
            return 0.0f;
        }
        float f13 = this.E[i10];
        float f14 = this.F[i10];
        float f15 = this.G[i10];
        float f16 = f13 * f12;
        if (i11 > 0) {
            return f(m10 * f16, f14, f15);
        }
        return -f((-m10) * f16, f14, f15);
    }

    public final float k(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.C;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.K && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final float m(float f10, float f11, float f12, float f13) {
        float interpolation;
        float f14 = f(f10 * f11, 0.0f, f12);
        float k10 = k(f11 - f13, f14) - k(f13, f14);
        if (k10 < 0.0f) {
            interpolation = -this.f51990x.getInterpolation(-k10);
        } else if (k10 <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f51990x.getInterpolation(k10);
        }
        return f(interpolation, -1.0f, 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.L
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.q()
            goto L58
        L1a:
            r5.J = r2
            r5.H = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f51991y
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f51991y
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            s3.a$a r7 = r5.f51989w
            r7.l(r0, r6)
            boolean r6 = r5.K
            if (r6 != 0) goto L58
            boolean r6 = r5.C()
            if (r6 == 0) goto L58
            r5.D()
        L58:
            boolean r6 = r5.M
            if (r6 == 0) goto L61
            boolean r6 = r5.K
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void q() {
        if (this.I) {
            this.K = false;
        } else {
            this.f51989w.i();
        }
    }

    public abstract void r(int i10, int i11);

    public a s(int i10) {
        this.D = i10;
        return this;
    }

    public a t(int i10) {
        this.C = i10;
        return this;
    }

    public a u(boolean z10) {
        if (this.L && !z10) {
            q();
        }
        this.L = z10;
        return this;
    }

    public a v(float f10, float f11) {
        float[] fArr = this.B;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a w(float f10, float f11) {
        float[] fArr = this.G;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a x(float f10, float f11) {
        float[] fArr = this.F;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a y(int i10) {
        this.f51989w.j(i10);
        return this;
    }

    public a z(int i10) {
        this.f51989w.k(i10);
        return this;
    }
}
