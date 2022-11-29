package ai;

import ai.ay0;
import ai.c41;
import ai.u01;
import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class ig2<AppOpenAd extends u01, AppOpenRequestComponent extends ay0<AppOpenAd>, AppOpenRequestComponentBuilder extends c41<AppOpenRequestComponent>> implements r62<AppOpenAd> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5216a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f5217b;

    /* renamed from: c  reason: collision with root package name */
    public final or0 f5218c;

    /* renamed from: d  reason: collision with root package name */
    public final yg2 f5219d;

    /* renamed from: e  reason: collision with root package name */
    public final ti2<AppOpenRequestComponent, AppOpenAd> f5220e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f5221f;

    /* renamed from: g  reason: collision with root package name */
    public final wl2 f5222g;

    /* renamed from: h  reason: collision with root package name */
    public s43<AppOpenAd> f5223h;

    public ig2(Context context, Executor executor, or0 or0Var, ti2<AppOpenRequestComponent, AppOpenAd> ti2Var, yg2 yg2Var, wl2 wl2Var) {
        this.f5216a = context;
        this.f5217b = executor;
        this.f5218c = or0Var;
        this.f5220e = ti2Var;
        this.f5219d = yg2Var;
        this.f5222g = wl2Var;
        this.f5221f = new FrameLayout(context);
    }

    @Override // ai.r62
    public final synchronized boolean a(as asVar, String str, p62 p62Var, q62<? super AppOpenAd> q62Var) throws RemoteException {
        rh.p.d("loadAd must be called on the main UI thread.");
        if (str == null) {
            uj0.c("Ad unit ID should not be null for app open ad.");
            this.f5217b.execute(new Runnable(this) { // from class: ai.bg2

                /* renamed from: w  reason: collision with root package name */
                public final ig2 f2340w;

                {
                    this.f2340w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f2340w.i();
                }
            });
            return false;
        } else if (this.f5223h != null) {
            return false;
        } else {
            om2.b(this.f5216a, asVar.B);
            if (((Boolean) ft.c().c(ox.f8067p6)).booleanValue() && asVar.B) {
                this.f5218c.C().c(true);
            }
            wl2 wl2Var = this.f5222g;
            wl2Var.L(str);
            wl2Var.I(fs.U());
            wl2Var.G(asVar);
            yl2 l10 = wl2Var.l();
            gg2 gg2Var = new gg2(null);
            gg2Var.f4432a = l10;
            s43<AppOpenAd> a10 = this.f5220e.a(new ui2(gg2Var, null), new si2(this) { // from class: ai.dg2

                /* renamed from: a  reason: collision with root package name */
                public final ig2 f3283a;

                {
                    this.f3283a = this;
                }

                @Override // ai.si2
                public final c41 a(ri2 ri2Var) {
                    return this.f3283a.j(ri2Var);
                }
            }, null);
            this.f5223h = a10;
            j43.p(a10, new fg2(this, q62Var, gg2Var), this.f5217b);
            return true;
        }
    }

    public abstract AppOpenRequestComponentBuilder b(qy0 qy0Var, g41 g41Var, ma1 ma1Var);

    public final void h(ls lsVar) {
        this.f5222g.f(lsVar);
    }

    public final /* synthetic */ void i() {
        this.f5219d.z(tm2.d(6, null, null));
    }

    /* renamed from: k */
    public final synchronized AppOpenRequestComponentBuilder j(ri2 ri2Var) {
        gg2 gg2Var = (gg2) ri2Var;
        if (((Boolean) ft.c().c(ox.P5)).booleanValue()) {
            qy0 qy0Var = new qy0(this.f5221f);
            e41 e41Var = new e41();
            e41Var.e(this.f5216a);
            e41Var.f(gg2Var.f4432a);
            g41 h10 = e41Var.h();
            ka1 ka1Var = new ka1();
            ka1Var.v(this.f5219d, this.f5217b);
            ka1Var.y(this.f5219d, this.f5217b);
            return b(qy0Var, h10, ka1Var.c());
        }
        yg2 a10 = yg2.a(this.f5219d);
        ka1 ka1Var2 = new ka1();
        ka1Var2.u(a10, this.f5217b);
        ka1Var2.A(a10, this.f5217b);
        ka1Var2.B(a10, this.f5217b);
        ka1Var2.C(a10, this.f5217b);
        ka1Var2.v(a10, this.f5217b);
        ka1Var2.y(a10, this.f5217b);
        ka1Var2.a(a10);
        qy0 qy0Var2 = new qy0(this.f5221f);
        e41 e41Var2 = new e41();
        e41Var2.e(this.f5216a);
        e41Var2.f(gg2Var.f4432a);
        return b(qy0Var2, e41Var2.h(), ka1Var2.c());
    }

    @Override // ai.r62
    public final boolean zzb() {
        s43<AppOpenAd> s43Var = this.f5223h;
        return (s43Var == null || s43Var.isDone()) ? false : true;
    }
}
