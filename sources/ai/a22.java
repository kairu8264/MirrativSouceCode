package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class a22 extends x12<id1> {

    /* renamed from: a  reason: collision with root package name */
    public final or0 f1692a;

    /* renamed from: b  reason: collision with root package name */
    public final e41 f1693b;

    /* renamed from: c  reason: collision with root package name */
    public final h42 f1694c;

    /* renamed from: d  reason: collision with root package name */
    public final ma1 f1695d;

    public a22(or0 or0Var, e41 e41Var, h42 h42Var, ma1 ma1Var) {
        this.f1692a = or0Var;
        this.f1693b = e41Var;
        this.f1694c = h42Var;
        this.f1695d = ma1Var;
    }

    @Override // ai.x12
    public final s43<id1> c(yl2 yl2Var, Bundle bundle) {
        fe1 s10 = this.f1692a.s();
        e41 e41Var = this.f1693b;
        e41Var.f(yl2Var);
        e41Var.g(bundle);
        s10.d(e41Var.h());
        s10.s(this.f1695d);
        s10.l(this.f1694c);
        y11<id1> b10 = s10.zza().b();
        return b10.d(b10.c());
    }
}
