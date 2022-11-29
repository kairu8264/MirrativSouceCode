package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class v12 extends x12<b11> {

    /* renamed from: a  reason: collision with root package name */
    public final or0 f10916a;

    /* renamed from: b  reason: collision with root package name */
    public final we1 f10917b;

    /* renamed from: c  reason: collision with root package name */
    public final e41 f10918c;

    /* renamed from: d  reason: collision with root package name */
    public final ma1 f10919d;

    public v12(or0 or0Var, we1 we1Var, e41 e41Var, ma1 ma1Var) {
        this.f10916a = or0Var;
        this.f10917b = we1Var;
        this.f10918c = e41Var;
        this.f10919d = ma1Var;
    }

    @Override // ai.x12
    public final s43<b11> c(yl2 yl2Var, Bundle bundle) {
        bf1 u10 = this.f10916a.u();
        e41 e41Var = this.f10918c;
        e41Var.f(yl2Var);
        e41Var.g(bundle);
        u10.r(e41Var.h());
        u10.t(this.f10919d);
        u10.k(this.f10917b);
        u10.e(new qy0(null));
        y11<b11> a10 = u10.zza().a();
        return a10.d(a10.c());
    }
}
