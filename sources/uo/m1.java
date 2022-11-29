package uo;

/* loaded from: classes4.dex */
public abstract class m1 extends k0 {

    /* renamed from: x  reason: collision with root package name */
    public long f56062x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f56063y;

    /* renamed from: z  reason: collision with root package name */
    public zo.a<e1<?>> f56064z;

    public static /* synthetic */ void i0(m1 m1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        m1Var.h0(z10);
    }

    public static /* synthetic */ void r0(m1 m1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        m1Var.q0(z10);
    }

    public long A0() {
        return !B0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean B0() {
        e1<?> d10;
        zo.a<e1<?>> aVar = this.f56064z;
        if (aVar == null || (d10 = aVar.d()) == null) {
            return false;
        }
        d10.run();
        return true;
    }

    public boolean D0() {
        return false;
    }

    @Override // uo.k0
    public final k0 d0(int i10) {
        zo.r.a(i10);
        return this;
    }

    public final void h0(boolean z10) {
        long k02 = this.f56062x - k0(z10);
        this.f56062x = k02;
        if (k02 > 0) {
            return;
        }
        if (u0.a()) {
            if (!(this.f56062x == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f56063y) {
            shutdown();
        }
    }

    public final long k0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public final void l0(e1<?> e1Var) {
        zo.a<e1<?>> aVar = this.f56064z;
        if (aVar == null) {
            aVar = new zo.a<>();
            this.f56064z = aVar;
        }
        aVar.a(e1Var);
    }

    public long p0() {
        zo.a<e1<?>> aVar = this.f56064z;
        return (aVar == null || aVar.c()) ? Long.MAX_VALUE : 0L;
    }

    public final void q0(boolean z10) {
        this.f56062x += k0(z10);
        if (z10) {
            return;
        }
        this.f56063y = true;
    }

    public void shutdown() {
    }

    public final boolean w0() {
        return this.f56062x >= k0(true);
    }

    public final boolean x0() {
        zo.a<e1<?>> aVar = this.f56064z;
        if (aVar == null) {
            return true;
        }
        return aVar.c();
    }
}
