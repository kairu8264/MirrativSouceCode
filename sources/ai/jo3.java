package ai;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class jo3 implements lp3, gm2 {

    /* renamed from: w  reason: collision with root package name */
    public final Object f5875w;

    /* renamed from: x  reason: collision with root package name */
    public kp3 f5876x;

    /* renamed from: y  reason: collision with root package name */
    public hl2 f5877y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ lo3 f5878z;

    public jo3(lo3 lo3Var, Object obj) {
        this.f5878z = lo3Var;
        this.f5876x = lo3Var.t(null);
        this.f5877y = lo3Var.w(null);
        this.f5875w = obj;
    }

    @Override // ai.lp3
    public final void a(int i10, bp3 bp3Var, so3 so3Var, yo3 yo3Var) {
        if (c(i10, bp3Var)) {
            this.f5876x.e(so3Var, yo3Var);
        }
    }

    @Override // ai.lp3
    public final void b(int i10, bp3 bp3Var, so3 so3Var, yo3 yo3Var) {
        if (c(i10, bp3Var)) {
            this.f5876x.i(so3Var, yo3Var);
        }
    }

    public final boolean c(int i10, bp3 bp3Var) {
        bp3 bp3Var2;
        if (bp3Var != null) {
            bp3Var2 = this.f5878z.B(this.f5875w, bp3Var);
            if (bp3Var2 == null) {
                return false;
            }
        } else {
            bp3Var2 = null;
        }
        kp3 kp3Var = this.f5876x;
        if (kp3Var.f6306a != i10 || !sb.H(kp3Var.f6307b, bp3Var2)) {
            this.f5876x = this.f5878z.v(i10, bp3Var2, 0L);
        }
        hl2 hl2Var = this.f5877y;
        if (hl2Var.f4895a == i10 && sb.H(hl2Var.f4896b, bp3Var2)) {
            return true;
        }
        this.f5877y = this.f5878z.x(i10, bp3Var2);
        return true;
    }

    @Override // ai.lp3
    public final void f(int i10, bp3 bp3Var, so3 so3Var, yo3 yo3Var) {
        if (c(i10, bp3Var)) {
            this.f5876x.g(so3Var, yo3Var);
        }
    }

    @Override // ai.lp3
    public final void l(int i10, bp3 bp3Var, so3 so3Var, yo3 yo3Var, IOException iOException, boolean z10) {
        if (c(i10, bp3Var)) {
            this.f5876x.k(so3Var, yo3Var, iOException, z10);
        }
    }

    @Override // ai.lp3
    public final void v(int i10, bp3 bp3Var, yo3 yo3Var) {
        if (c(i10, bp3Var)) {
            this.f5876x.m(yo3Var);
        }
    }
}
