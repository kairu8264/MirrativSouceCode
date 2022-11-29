package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class o62 {

    /* renamed from: a  reason: collision with root package name */
    public final zg1 f7669a;

    /* renamed from: b  reason: collision with root package name */
    public final b62 f7670b;

    /* renamed from: c  reason: collision with root package name */
    public final y41 f7671c;

    public o62(zg1 zg1Var, nq2 nq2Var) {
        this.f7669a = zg1Var;
        final b62 b62Var = new b62(nq2Var);
        this.f7670b = b62Var;
        final x50 e10 = zg1Var.e();
        this.f7671c = new y41(b62Var, e10) { // from class: ai.n62

            /* renamed from: w  reason: collision with root package name */
            public final b62 f7211w;

            /* renamed from: x  reason: collision with root package name */
            public final x50 f7212x;

            {
                this.f7211w = b62Var;
                this.f7212x = e10;
            }

            @Override // ai.y41
            public final void z(sr srVar) {
                b62 b62Var2 = this.f7211w;
                x50 x50Var = this.f7212x;
                b62Var2.z(srVar);
                if (x50Var != null) {
                    try {
                        x50Var.B(srVar);
                    } catch (RemoteException e11) {
                        uj0.i("#007 Could not call remote method.", e11);
                    }
                }
                if (x50Var != null) {
                    try {
                        x50Var.E(srVar.f9916w);
                    } catch (RemoteException e12) {
                        uj0.i("#007 Could not call remote method.", e12);
                    }
                }
            }
        };
    }

    public final void a(nt ntVar) {
        this.f7670b.y(ntVar);
    }

    public final we1 b() {
        return new we1(this.f7669a, this.f7670b.c());
    }

    public final b62 c() {
        return this.f7670b;
    }

    public final k61 d() {
        return this.f7670b;
    }

    public final y41 e() {
        return this.f7671c;
    }
}
