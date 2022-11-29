package ai;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class nh2 implements r62<ty0> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7331a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f7332b;

    /* renamed from: c  reason: collision with root package name */
    public final or0 f7333c;

    /* renamed from: d  reason: collision with root package name */
    public final b62 f7334d;

    /* renamed from: e  reason: collision with root package name */
    public final f62 f7335e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f7336f;

    /* renamed from: g  reason: collision with root package name */
    public ky f7337g;

    /* renamed from: h  reason: collision with root package name */
    public final l71 f7338h;

    /* renamed from: i  reason: collision with root package name */
    public final wl2 f7339i;

    /* renamed from: j  reason: collision with root package name */
    public s43<ty0> f7340j;

    public nh2(Context context, Executor executor, fs fsVar, or0 or0Var, b62 b62Var, f62 f62Var, wl2 wl2Var) {
        this.f7331a = context;
        this.f7332b = executor;
        this.f7333c = or0Var;
        this.f7334d = b62Var;
        this.f7335e = f62Var;
        this.f7339i = wl2Var;
        this.f7338h = or0Var.k();
        this.f7336f = new FrameLayout(context);
        wl2Var.I(fsVar);
    }

    @Override // ai.r62
    public final boolean a(as asVar, String str, p62 p62Var, q62<? super ty0> q62Var) throws RemoteException {
        rz0 zza;
        if (str == null) {
            uj0.c("Ad unit ID should not be null for banner ad.");
            this.f7332b.execute(new Runnable(this) { // from class: ai.jh2

                /* renamed from: w  reason: collision with root package name */
                public final nh2 f5797w;

                {
                    this.f5797w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f5797w.o();
                }
            });
            return false;
        } else if (zzb()) {
            return false;
        } else {
            if (((Boolean) ft.c().c(ox.f8067p6)).booleanValue() && asVar.B) {
                this.f7333c.C().c(true);
            }
            wl2 wl2Var = this.f7339i;
            wl2Var.L(str);
            wl2Var.G(asVar);
            yl2 l10 = wl2Var.l();
            if (hz.f5046c.e().booleanValue() && this.f7339i.K().G) {
                b62 b62Var = this.f7334d;
                if (b62Var != null) {
                    b62Var.z(tm2.d(7, null, null));
                }
                return false;
            }
            if (((Boolean) ft.c().c(ox.O5)).booleanValue()) {
                qz0 n10 = this.f7333c.n();
                e41 e41Var = new e41();
                e41Var.e(this.f7331a);
                e41Var.f(l10);
                n10.h(e41Var.h());
                ka1 ka1Var = new ka1();
                ka1Var.b(this.f7334d, this.f7332b);
                ka1Var.w(this.f7334d, this.f7332b);
                n10.g(ka1Var.c());
                n10.p(new h42(this.f7337g));
                n10.i(new we1(zg1.f12979h, null));
                n10.j(new o01(this.f7338h));
                n10.f(new qy0(this.f7336f));
                zza = n10.zza();
            } else {
                qz0 n11 = this.f7333c.n();
                e41 e41Var2 = new e41();
                e41Var2.e(this.f7331a);
                e41Var2.f(l10);
                n11.h(e41Var2.h());
                ka1 ka1Var2 = new ka1();
                ka1Var2.b(this.f7334d, this.f7332b);
                ka1Var2.x(this.f7334d, this.f7332b);
                ka1Var2.x(this.f7335e, this.f7332b);
                ka1Var2.y(this.f7334d, this.f7332b);
                ka1Var2.z(this.f7334d, this.f7332b);
                ka1Var2.s(this.f7334d, this.f7332b);
                ka1Var2.t(this.f7334d, this.f7332b);
                ka1Var2.u(this.f7334d, this.f7332b);
                ka1Var2.w(this.f7334d, this.f7332b);
                ka1Var2.C(this.f7334d, this.f7332b);
                n11.g(ka1Var2.c());
                n11.p(new h42(this.f7337g));
                n11.i(new we1(zg1.f12979h, null));
                n11.j(new o01(this.f7338h));
                n11.f(new qy0(this.f7336f));
                zza = n11.zza();
            }
            y11<ty0> b10 = zza.b();
            s43<ty0> d10 = b10.d(b10.c());
            this.f7340j = d10;
            j43.p(d10, new mh2(this, q62Var, zza), this.f7332b);
            return true;
        }
    }

    public final ViewGroup h() {
        return this.f7336f;
    }

    public final void i(ky kyVar) {
        this.f7337g = kyVar;
    }

    public final void j(jt jtVar) {
        this.f7335e.a(jtVar);
    }

    public final wl2 k() {
        return this.f7339i;
    }

    public final boolean l() {
        ViewParent parent = this.f7336f.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            wg.t.d();
            return yg.d2.z(view, view.getContext());
        }
        return false;
    }

    public final void m(m71 m71Var) {
        this.f7338h.y0(m71Var, this.f7332b);
    }

    public final void n() {
        this.f7338h.S0(60);
    }

    public final /* synthetic */ void o() {
        this.f7334d.z(tm2.d(6, null, null));
    }

    @Override // ai.r62
    public final boolean zzb() {
        s43<ty0> s43Var = this.f7340j;
        return (s43Var == null || s43Var.isDone()) ? false : true;
    }
}
