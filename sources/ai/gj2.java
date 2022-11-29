package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class gj2 implements e43<id1> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q62 f4485a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ge1 f4486b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ hj2 f4487c;

    public gj2(hj2 hj2Var, q62 q62Var, ge1 ge1Var) {
        this.f4487c = hj2Var;
        this.f4485a = q62Var;
        this.f4486b = ge1Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        Executor executor;
        Executor executor2;
        final sr h10 = this.f4486b.b().h(th2);
        synchronized (this.f4487c) {
            this.f4487c.f4874h = null;
            this.f4486b.a().z(h10);
            if (((Boolean) ft.c().c(ox.Q5)).booleanValue()) {
                executor = this.f4487c.f4868b;
                executor.execute(new Runnable(this, h10) { // from class: ai.ej2

                    /* renamed from: w  reason: collision with root package name */
                    public final gj2 f3683w;

                    /* renamed from: x  reason: collision with root package name */
                    public final sr f3684x;

                    {
                        this.f3683w = this;
                        this.f3684x = h10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        b62 b62Var;
                        gj2 gj2Var = this.f3683w;
                        sr srVar = this.f3684x;
                        b62Var = gj2Var.f4487c.f4870d;
                        b62Var.z(srVar);
                    }
                });
                executor2 = this.f4487c.f4868b;
                executor2.execute(new Runnable(this, h10) { // from class: ai.fj2

                    /* renamed from: w  reason: collision with root package name */
                    public final gj2 f4060w;

                    /* renamed from: x  reason: collision with root package name */
                    public final sr f4061x;

                    {
                        this.f4060w = this;
                        this.f4061x = h10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ik2 ik2Var;
                        gj2 gj2Var = this.f4060w;
                        sr srVar = this.f4061x;
                        ik2Var = gj2Var.f4487c.f4871e;
                        ik2Var.z(srVar);
                    }
                });
            }
            om2.a(h10.f9916w, th2, "InterstitialAdLoader.onFailure");
            this.f4485a.zza();
        }
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(id1 id1Var) {
        Executor executor;
        Executor executor2;
        b62 b62Var;
        ik2 ik2Var;
        id1 id1Var2 = id1Var;
        synchronized (this.f4487c) {
            this.f4487c.f4874h = null;
            gx<Boolean> gxVar = ox.Q5;
            if (((Boolean) ft.c().c(gxVar)).booleanValue()) {
                f91 f10 = id1Var2.f();
                b62Var = this.f4487c.f4870d;
                f10.a(b62Var);
                ik2Var = this.f4487c.f4871e;
                f10.d(ik2Var);
            }
            this.f4485a.b(id1Var2);
            if (((Boolean) ft.c().c(gxVar)).booleanValue()) {
                executor = this.f4487c.f4868b;
                executor.execute(new Runnable(this) { // from class: ai.cj2

                    /* renamed from: w  reason: collision with root package name */
                    public final gj2 f2847w;

                    {
                        this.f2847w = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        b62 b62Var2;
                        b62Var2 = this.f2847w.f4487c.f4870d;
                        b62Var2.a();
                    }
                });
                executor2 = this.f4487c.f4868b;
                executor2.execute(new Runnable(this) { // from class: ai.dj2

                    /* renamed from: w  reason: collision with root package name */
                    public final gj2 f3318w;

                    {
                        this.f3318w = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ik2 ik2Var2;
                        ik2Var2 = this.f3318w.f4487c.f4871e;
                        ik2Var2.a();
                    }
                });
            }
        }
    }
}
