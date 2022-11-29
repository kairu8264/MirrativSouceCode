package ai;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class hj2 implements r62<id1> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4867a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f4868b;

    /* renamed from: c  reason: collision with root package name */
    public final or0 f4869c;

    /* renamed from: d  reason: collision with root package name */
    public final b62 f4870d;

    /* renamed from: e  reason: collision with root package name */
    public final ik2 f4871e;

    /* renamed from: f  reason: collision with root package name */
    public ky f4872f;

    /* renamed from: g  reason: collision with root package name */
    public final wl2 f4873g;

    /* renamed from: h  reason: collision with root package name */
    public s43<id1> f4874h;

    public hj2(Context context, Executor executor, or0 or0Var, b62 b62Var, ik2 ik2Var, wl2 wl2Var) {
        this.f4867a = context;
        this.f4868b = executor;
        this.f4869c = or0Var;
        this.f4870d = b62Var;
        this.f4873g = wl2Var;
        this.f4871e = ik2Var;
    }

    @Override // ai.r62
    public final boolean a(as asVar, String str, p62 p62Var, q62<? super id1> q62Var) {
        ge1 zza;
        if (str == null) {
            uj0.c("Ad unit ID should not be null for interstitial ad.");
            this.f4868b.execute(new Runnable(this) { // from class: ai.bj2

                /* renamed from: w  reason: collision with root package name */
                public final hj2 f2373w;

                {
                    this.f2373w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f2373w.g();
                }
            });
            return false;
        } else if (zzb()) {
            return false;
        } else {
            if (((Boolean) ft.c().c(ox.f8067p6)).booleanValue() && asVar.B) {
                this.f4869c.C().c(true);
            }
            fs fsVar = ((aj2) p62Var).f1886a;
            wl2 wl2Var = this.f4873g;
            wl2Var.L(str);
            wl2Var.I(fsVar);
            wl2Var.G(asVar);
            yl2 l10 = wl2Var.l();
            if (((Boolean) ft.c().c(ox.Q5)).booleanValue()) {
                fe1 s10 = this.f4869c.s();
                e41 e41Var = new e41();
                e41Var.e(this.f4867a);
                e41Var.f(l10);
                s10.d(e41Var.h());
                ka1 ka1Var = new ka1();
                ka1Var.b(this.f4870d, this.f4868b);
                ka1Var.w(this.f4870d, this.f4868b);
                s10.s(ka1Var.c());
                s10.l(new h42(this.f4872f));
                zza = s10.zza();
            } else {
                ka1 ka1Var2 = new ka1();
                ik2 ik2Var = this.f4871e;
                if (ik2Var != null) {
                    ka1Var2.s(ik2Var, this.f4868b);
                    ka1Var2.t(this.f4871e, this.f4868b);
                    ka1Var2.u(this.f4871e, this.f4868b);
                }
                fe1 s11 = this.f4869c.s();
                e41 e41Var2 = new e41();
                e41Var2.e(this.f4867a);
                e41Var2.f(l10);
                s11.d(e41Var2.h());
                ka1Var2.b(this.f4870d, this.f4868b);
                ka1Var2.s(this.f4870d, this.f4868b);
                ka1Var2.t(this.f4870d, this.f4868b);
                ka1Var2.u(this.f4870d, this.f4868b);
                ka1Var2.x(this.f4870d, this.f4868b);
                ka1Var2.y(this.f4870d, this.f4868b);
                ka1Var2.w(this.f4870d, this.f4868b);
                ka1Var2.C(this.f4870d, this.f4868b);
                ka1Var2.v(this.f4870d, this.f4868b);
                s11.s(ka1Var2.c());
                s11.l(new h42(this.f4872f));
                zza = s11.zza();
            }
            y11<id1> b10 = zza.b();
            s43<id1> d10 = b10.d(b10.c());
            this.f4874h = d10;
            j43.p(d10, new gj2(this, q62Var, zza), this.f4868b);
            return true;
        }
    }

    public final void f(ky kyVar) {
        this.f4872f = kyVar;
    }

    public final /* synthetic */ void g() {
        this.f4870d.z(tm2.d(6, null, null));
    }

    @Override // ai.r62
    public final boolean zzb() {
        s43<id1> s43Var = this.f4874h;
        return (s43Var == null || s43Var.isDone()) ? false : true;
    }
}
