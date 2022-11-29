package ai;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class z62 implements r62<u01> {

    /* renamed from: a  reason: collision with root package name */
    public final wl2 f12894a;

    /* renamed from: b  reason: collision with root package name */
    public final or0 f12895b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f12896c;

    /* renamed from: d  reason: collision with root package name */
    public final o62 f12897d;

    /* renamed from: e  reason: collision with root package name */
    public i11 f12898e;

    public z62(or0 or0Var, Context context, o62 o62Var, wl2 wl2Var) {
        this.f12895b = or0Var;
        this.f12896c = context;
        this.f12897d = o62Var;
        this.f12894a = wl2Var;
        wl2Var.j(o62Var.c());
    }

    @Override // ai.r62
    public final boolean a(as asVar, String str, p62 p62Var, q62<? super u01> q62Var) throws RemoteException {
        wg.t.d();
        if (yg.d2.k(this.f12896c) && asVar.O == null) {
            uj0.c("Failed to load the ad because app ID is missing.");
            this.f12895b.h().execute(new Runnable(this) { // from class: ai.u62

                /* renamed from: w  reason: collision with root package name */
                public final z62 f10616w;

                {
                    this.f10616w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f10616w.e();
                }
            });
            return false;
        } else if (str == null) {
            uj0.c("Ad unit ID should not be null for NativeAdLoader.");
            this.f12895b.h().execute(new Runnable(this) { // from class: ai.v62

                /* renamed from: w  reason: collision with root package name */
                public final z62 f10986w;

                {
                    this.f10986w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f10986w.d();
                }
            });
            return false;
        } else {
            om2.b(this.f12896c, asVar.B);
            if (((Boolean) ft.c().c(ox.f8067p6)).booleanValue() && asVar.B) {
                this.f12895b.C().c(true);
            }
            int i10 = ((s62) p62Var).f9752a;
            wl2 wl2Var = this.f12894a;
            wl2Var.G(asVar);
            wl2Var.b(i10);
            yl2 l10 = wl2Var.l();
            if (l10.f12660n != null) {
                this.f12897d.c().A(l10.f12660n);
            }
            bf1 u10 = this.f12895b.u();
            e41 e41Var = new e41();
            e41Var.e(this.f12896c);
            e41Var.f(l10);
            u10.r(e41Var.h());
            ka1 ka1Var = new ka1();
            ka1Var.w(this.f12897d.c(), this.f12895b.h());
            u10.t(ka1Var.c());
            u10.k(this.f12897d.b());
            u10.e(new qy0(null));
            cf1 zza = u10.zza();
            this.f12895b.B().a(1);
            t43 t43Var = hk0.f4878a;
            zn3.b(t43Var);
            ScheduledExecutorService i11 = this.f12895b.i();
            y11<b11> a10 = zza.a();
            i11 i11Var = new i11(t43Var, i11, a10.d(a10.c()));
            this.f12898e = i11Var;
            i11Var.a(new y62(this, q62Var, zza));
            return true;
        }
    }

    public final /* synthetic */ void d() {
        this.f12897d.e().z(tm2.d(6, null, null));
    }

    public final /* synthetic */ void e() {
        this.f12897d.e().z(tm2.d(4, null, null));
    }

    @Override // ai.r62
    public final boolean zzb() {
        i11 i11Var = this.f12898e;
        return i11Var != null && i11Var.c();
    }
}
