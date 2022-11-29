package ai;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ec2 implements xc2<fc2> {

    /* renamed from: a  reason: collision with root package name */
    public final String f3605a;

    /* renamed from: b  reason: collision with root package name */
    public final t43 f3606b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f3607c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f3608d;

    /* renamed from: e  reason: collision with root package name */
    public final yl2 f3609e;

    /* renamed from: f  reason: collision with root package name */
    public final or0 f3610f;

    public ec2(t43 t43Var, ScheduledExecutorService scheduledExecutorService, String str, Context context, yl2 yl2Var, or0 or0Var) {
        this.f3606b = t43Var;
        this.f3607c = scheduledExecutorService;
        this.f3605a = str;
        this.f3608d = context;
        this.f3609e = yl2Var;
        this.f3610f = or0Var;
    }

    public final /* bridge */ /* synthetic */ s43 a() {
        String str = this.f3605a;
        if (((Boolean) ft.c().c(ox.f8050n5)).booleanValue()) {
            str = rg.b.UNKNOWN.name();
        }
        eh.p x10 = this.f3610f.x();
        e41 e41Var = new e41();
        e41Var.e(this.f3608d);
        wl2 wl2Var = new wl2();
        wl2Var.L("adUnitId");
        wl2Var.G(this.f3609e.f12650d);
        wl2Var.I(new fs());
        e41Var.f(wl2Var.l());
        x10.d(e41Var.h());
        eh.h0 h0Var = new eh.h0();
        h0Var.b(str);
        x10.a(h0Var.c());
        new ka1();
        return j43.f(j43.j((z33) j43.h(z33.E(x10.zza().a()), ((Long) ft.c().c(ox.f8058o5)).longValue(), TimeUnit.MILLISECONDS, this.f3607c), cc2.f2786a, this.f3606b), Exception.class, dc2.f3202a, this.f3606b);
    }

    @Override // ai.xc2
    public final s43<fc2> zza() {
        if (((Boolean) ft.c().c(ox.f8042m5)).booleanValue() && !"adUnitId".equals(this.f3609e.f12652f)) {
            return j43.e(new o33(this) { // from class: ai.bc2

                /* renamed from: a  reason: collision with root package name */
                public final ec2 f2290a;

                {
                    this.f2290a = this;
                }

                @Override // ai.o33
                public final s43 zza() {
                    return this.f2290a.a();
                }
            }, this.f3606b);
        }
        return this.f3606b.h(ac2.f1810a);
    }
}
