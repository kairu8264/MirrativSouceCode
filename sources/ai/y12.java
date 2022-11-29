package ai;

import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class y12 extends x12<ty0> {

    /* renamed from: a  reason: collision with root package name */
    public final or0 f12403a;

    /* renamed from: b  reason: collision with root package name */
    public final e41 f12404b;

    /* renamed from: c  reason: collision with root package name */
    public final h42 f12405c;

    /* renamed from: d  reason: collision with root package name */
    public final ma1 f12406d;

    /* renamed from: e  reason: collision with root package name */
    public final we1 f12407e;

    /* renamed from: f  reason: collision with root package name */
    public final l71 f12408f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewGroup f12409g;

    public y12(or0 or0Var, e41 e41Var, h42 h42Var, ma1 ma1Var, we1 we1Var, l71 l71Var, ViewGroup viewGroup) {
        this.f12403a = or0Var;
        this.f12404b = e41Var;
        this.f12405c = h42Var;
        this.f12406d = ma1Var;
        this.f12407e = we1Var;
        this.f12408f = l71Var;
        this.f12409g = viewGroup;
    }

    @Override // ai.x12
    public final s43<ty0> c(yl2 yl2Var, Bundle bundle) {
        qz0 n10 = this.f12403a.n();
        e41 e41Var = this.f12404b;
        e41Var.f(yl2Var);
        e41Var.g(bundle);
        n10.h(e41Var.h());
        n10.g(this.f12406d);
        n10.p(this.f12405c);
        n10.i(this.f12407e);
        n10.j(new o01(this.f12408f));
        n10.f(new qy0(this.f12409g));
        y11<ty0> b10 = n10.zza().b();
        return b10.d(b10.c());
    }
}
