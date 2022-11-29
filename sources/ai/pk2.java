package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class pk2 implements e43<cm1> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q62 f8450a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ rk2 f8451b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ sk2 f8452c;

    public pk2(sk2 sk2Var, q62 q62Var, rk2 rk2Var) {
        this.f8452c = sk2Var;
        this.f8450a = q62Var;
        this.f8451b = rk2Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        ti2 ti2Var;
        final sr h10;
        ik2 ik2Var;
        gm1 g10;
        Executor executor;
        ti2Var = this.f8452c.f9859e;
        hm1 hm1Var = (hm1) ti2Var.d();
        if (hm1Var == null) {
            h10 = tm2.b(th2, null);
        } else {
            h10 = hm1Var.q().h(th2);
        }
        synchronized (this.f8452c) {
            if (hm1Var != null) {
                hm1Var.a().z(h10);
                executor = this.f8452c.f9856b;
                executor.execute(new Runnable(this, h10) { // from class: ai.ok2

                    /* renamed from: w  reason: collision with root package name */
                    public final pk2 f7842w;

                    /* renamed from: x  reason: collision with root package name */
                    public final sr f7843x;

                    {
                        this.f7842w = this;
                        this.f7843x = h10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ik2 ik2Var2;
                        pk2 pk2Var = this.f7842w;
                        sr srVar = this.f7843x;
                        ik2Var2 = pk2Var.f8452c.f9858d;
                        ik2Var2.z(srVar);
                    }
                });
            } else {
                ik2Var = this.f8452c.f9858d;
                ik2Var.z(h10);
                g10 = this.f8452c.g(this.f8451b);
                g10.zza().q().e().p();
            }
            om2.a(h10.f9916w, th2, "RewardedAdLoader.onFailure");
            this.f8450a.zza();
        }
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(cm1 cm1Var) {
        ik2 ik2Var;
        Executor executor;
        ik2 ik2Var2;
        ik2 ik2Var3;
        cm1 cm1Var2 = cm1Var;
        synchronized (this.f8452c) {
            f91 f10 = cm1Var2.f();
            ik2Var = this.f8452c.f9858d;
            f10.d(ik2Var);
            this.f8450a.b(cm1Var2);
            executor = this.f8452c.f9856b;
            ik2Var2 = this.f8452c.f9858d;
            ik2Var2.getClass();
            executor.execute(nk2.a(ik2Var2));
            ik2Var3 = this.f8452c.f9858d;
            ik2Var3.t();
        }
    }
}
