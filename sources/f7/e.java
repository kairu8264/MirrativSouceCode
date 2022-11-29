package f7;

import android.view.Choreographer;

/* loaded from: classes.dex */
public class e extends a implements Choreographer.FrameCallback {
    public s6.d F;

    /* renamed from: y  reason: collision with root package name */
    public float f31815y = 1.0f;

    /* renamed from: z  reason: collision with root package name */
    public boolean f31816z = false;
    public long A = 0;
    public float B = 0.0f;
    public int C = 0;
    public float D = -2.14748365E9f;
    public float E = 2.14748365E9f;
    public boolean G = false;

    public void A(float f10) {
        if (this.B == f10) {
            return;
        }
        this.B = g.c(f10, o(), n());
        this.A = 0L;
        g();
    }

    public void B(float f10) {
        C(this.D, f10);
    }

    public void C(float f10, float f11) {
        if (f10 <= f11) {
            s6.d dVar = this.F;
            float p10 = dVar == null ? -3.4028235E38f : dVar.p();
            s6.d dVar2 = this.F;
            float f12 = dVar2 == null ? Float.MAX_VALUE : dVar2.f();
            float c10 = g.c(f10, p10, f12);
            float c11 = g.c(f11, p10, f12);
            if (c10 == this.D && c11 == this.E) {
                return;
            }
            this.D = c10;
            this.E = c11;
            A((int) g.c(this.B, c10, c11));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public void D(int i10) {
        C(i10, (int) this.E);
    }

    public void E(float f10) {
        this.f31815y = f10;
    }

    public final void F() {
        if (this.F == null) {
            return;
        }
        float f10 = this.B;
        if (f10 < this.D || f10 > this.E) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.D), Float.valueOf(this.E), Float.valueOf(this.B)));
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        b();
        v();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        u();
        if (this.F == null || !isRunning()) {
            return;
        }
        s6.c.a("LottieValueAnimator#doFrame");
        long j11 = this.A;
        float m10 = ((float) (j11 != 0 ? j10 - j11 : 0L)) / m();
        float f10 = this.B;
        if (r()) {
            m10 = -m10;
        }
        float f11 = f10 + m10;
        this.B = f11;
        boolean z10 = !g.e(f11, o(), n());
        this.B = g.c(this.B, o(), n());
        this.A = j10;
        g();
        if (z10) {
            if (getRepeatCount() != -1 && this.C >= getRepeatCount()) {
                this.B = this.f31815y < 0.0f ? o() : n();
                v();
                c(r());
            } else {
                e();
                this.C++;
                if (getRepeatMode() == 2) {
                    this.f31816z = !this.f31816z;
                    y();
                } else {
                    this.B = r() ? n() : o();
                }
                this.A = j10;
            }
        }
        F();
        s6.c.b("LottieValueAnimator#doFrame");
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float o10;
        float n10;
        float o11;
        if (this.F == null) {
            return 0.0f;
        }
        if (r()) {
            o10 = n() - this.B;
            n10 = n();
            o11 = o();
        } else {
            o10 = this.B - o();
            n10 = n();
            o11 = o();
        }
        return o10 / (n10 - o11);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(k());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        s6.d dVar = this.F;
        if (dVar == null) {
            return 0L;
        }
        return dVar.d();
    }

    public void h() {
        this.F = null;
        this.D = -2.14748365E9f;
        this.E = 2.14748365E9f;
    }

    public void i() {
        v();
        c(r());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.G;
    }

    public float k() {
        s6.d dVar = this.F;
        if (dVar == null) {
            return 0.0f;
        }
        return (this.B - dVar.p()) / (this.F.f() - this.F.p());
    }

    public float l() {
        return this.B;
    }

    public final float m() {
        s6.d dVar = this.F;
        if (dVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / dVar.i()) / Math.abs(this.f31815y);
    }

    public float n() {
        s6.d dVar = this.F;
        if (dVar == null) {
            return 0.0f;
        }
        float f10 = this.E;
        return f10 == 2.14748365E9f ? dVar.f() : f10;
    }

    public float o() {
        s6.d dVar = this.F;
        if (dVar == null) {
            return 0.0f;
        }
        float f10 = this.D;
        return f10 == -2.14748365E9f ? dVar.p() : f10;
    }

    public float q() {
        return this.f31815y;
    }

    public final boolean r() {
        return q() < 0.0f;
    }

    public void s() {
        v();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f31816z) {
            return;
        }
        this.f31816z = false;
        y();
    }

    public void t() {
        this.G = true;
        f(r());
        A((int) (r() ? n() : o()));
        this.A = 0L;
        this.C = 0;
        u();
    }

    public void u() {
        if (isRunning()) {
            w(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void v() {
        w(true);
    }

    public void w(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.G = false;
        }
    }

    public void x() {
        this.G = true;
        u();
        this.A = 0L;
        if (r() && l() == o()) {
            this.B = n();
        } else if (r() || l() != n()) {
        } else {
            this.B = o();
        }
    }

    public void y() {
        E(-q());
    }

    public void z(s6.d dVar) {
        boolean z10 = this.F == null;
        this.F = dVar;
        if (z10) {
            C((int) Math.max(this.D, dVar.p()), (int) Math.min(this.E, dVar.f()));
        } else {
            C((int) dVar.p(), (int) dVar.f());
        }
        float f10 = this.B;
        this.B = 0.0f;
        A((int) f10);
        g();
    }
}
