package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class c22 extends x12<cm1> {

    /* renamed from: a  reason: collision with root package name */
    public final or0 f2673a;

    /* renamed from: b  reason: collision with root package name */
    public final e41 f2674b;

    /* renamed from: c  reason: collision with root package name */
    public final ma1 f2675c;

    public c22(or0 or0Var, e41 e41Var, ma1 ma1Var) {
        this.f2673a = or0Var;
        this.f2674b = e41Var;
        this.f2675c = ma1Var;
    }

    @Override // ai.x12
    public final s43<cm1> c(yl2 yl2Var, Bundle bundle) {
        gm1 v10 = this.f2673a.v();
        e41 e41Var = this.f2674b;
        e41Var.f(yl2Var);
        e41Var.g(bundle);
        v10.n(e41Var.h());
        v10.q(this.f2675c);
        y11<cm1> q10 = v10.zza().q();
        return q10.d(q10.c());
    }
}
