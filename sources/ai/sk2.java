package ai;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class sk2 implements r62<cm1> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9855a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f9856b;

    /* renamed from: c  reason: collision with root package name */
    public final or0 f9857c;

    /* renamed from: d  reason: collision with root package name */
    public final ik2 f9858d;

    /* renamed from: e  reason: collision with root package name */
    public final ti2<hm1, cm1> f9859e;

    /* renamed from: f  reason: collision with root package name */
    public final tl2 f9860f;

    /* renamed from: g  reason: collision with root package name */
    public final wl2 f9861g;

    /* renamed from: h  reason: collision with root package name */
    public s43<cm1> f9862h;

    public sk2(Context context, Executor executor, or0 or0Var, ti2<hm1, cm1> ti2Var, ik2 ik2Var, wl2 wl2Var, tl2 tl2Var) {
        this.f9855a = context;
        this.f9856b = executor;
        this.f9857c = or0Var;
        this.f9859e = ti2Var;
        this.f9858d = ik2Var;
        this.f9861g = wl2Var;
        this.f9860f = tl2Var;
    }

    @Override // ai.r62
    public final boolean a(as asVar, String str, p62 p62Var, q62<? super cm1> q62Var) throws RemoteException {
        gf0 gf0Var = new gf0(asVar, str);
        if (gf0Var.f4408x == null) {
            uj0.c("Ad unit ID should not be null for rewarded video ad.");
            this.f9856b.execute(new Runnable(this) { // from class: ai.lk2

                /* renamed from: w  reason: collision with root package name */
                public final sk2 f6599w;

                {
                    this.f6599w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f6599w.f();
                }
            });
        } else {
            s43<cm1> s43Var = this.f9862h;
            if (s43Var == null || s43Var.isDone()) {
                om2.b(this.f9855a, gf0Var.f4407w.B);
                if (((Boolean) ft.c().c(ox.f8067p6)).booleanValue() && gf0Var.f4407w.B) {
                    this.f9857c.C().c(true);
                }
                wl2 wl2Var = this.f9861g;
                wl2Var.L(gf0Var.f4408x);
                wl2Var.I(fs.S());
                wl2Var.G(gf0Var.f4407w);
                yl2 l10 = wl2Var.l();
                rk2 rk2Var = new rk2(null);
                rk2Var.f9484a = l10;
                rk2Var.f9485b = null;
                s43<cm1> a10 = this.f9859e.a(new ui2(rk2Var, null), new si2(this) { // from class: ai.mk2

                    /* renamed from: a  reason: collision with root package name */
                    public final sk2 f6964a;

                    {
                        this.f6964a = this;
                    }

                    @Override // ai.si2
                    public final c41 a(ri2 ri2Var) {
                        return this.f6964a.g(ri2Var);
                    }
                }, null);
                this.f9862h = a10;
                j43.p(a10, new pk2(this, q62Var, rk2Var), this.f9856b);
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void f() {
        this.f9858d.z(tm2.d(6, null, null));
    }

    public final void h(int i10) {
        this.f9861g.O().b(i10);
    }

    /* renamed from: i */
    public final gm1 g(ri2 ri2Var) {
        gm1 v10 = this.f9857c.v();
        e41 e41Var = new e41();
        e41Var.e(this.f9855a);
        e41Var.f(((rk2) ri2Var).f9484a);
        e41Var.i(this.f9860f);
        v10.n(e41Var.h());
        v10.q(new ka1().c());
        return v10;
    }

    @Override // ai.r62
    public final boolean zzb() {
        throw null;
    }
}
