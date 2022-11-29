package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class fg2 implements e43 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q62 f4019a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ gg2 f4020b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ig2 f4021c;

    public fg2(ig2 ig2Var, q62 q62Var, gg2 gg2Var) {
        this.f4021c = ig2Var;
        this.f4019a = q62Var;
        this.f4020b = gg2Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        ti2 ti2Var;
        final sr h10;
        yg2 yg2Var;
        c41 j10;
        Executor executor;
        ti2Var = this.f4021c.f5220e;
        ay0 ay0Var = (ay0) ti2Var.d();
        if (ay0Var == null) {
            h10 = tm2.b(th2, null);
        } else {
            h10 = ay0Var.q().h(th2);
        }
        synchronized (this.f4021c) {
            this.f4021c.f5223h = null;
            if (ay0Var != null) {
                ay0Var.C().z(h10);
                if (((Boolean) ft.c().c(ox.P5)).booleanValue()) {
                    executor = this.f4021c.f5217b;
                    executor.execute(new Runnable(this, h10) { // from class: ai.eg2

                        /* renamed from: w  reason: collision with root package name */
                        public final fg2 f3660w;

                        /* renamed from: x  reason: collision with root package name */
                        public final sr f3661x;

                        {
                            this.f3660w = this;
                            this.f3661x = h10;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            yg2 yg2Var2;
                            fg2 fg2Var = this.f3660w;
                            sr srVar = this.f3661x;
                            yg2Var2 = fg2Var.f4021c.f5219d;
                            yg2Var2.z(srVar);
                        }
                    });
                }
            } else {
                yg2Var = this.f4021c.f5219d;
                yg2Var.z(h10);
                j10 = this.f4021c.j(this.f4020b);
                ((ay0) j10.a()).q().e().p();
            }
            om2.a(h10.f9916w, th2, "AppOpenAdLoader.onFailure");
            this.f4019a.zza();
        }
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        yg2 yg2Var;
        u01 u01Var = (u01) obj;
        synchronized (this.f4021c) {
            this.f4021c.f5223h = null;
            if (((Boolean) ft.c().c(ox.P5)).booleanValue()) {
                f91 f10 = u01Var.f();
                yg2Var = this.f4021c.f5219d;
                f10.c(yg2Var);
            }
            this.f4019a.b(u01Var);
        }
    }
}
