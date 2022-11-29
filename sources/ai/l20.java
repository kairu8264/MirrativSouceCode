package ai;

import tg.f;

/* loaded from: classes3.dex */
public final class l20 extends m10 {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ n20 f6464w;

    public /* synthetic */ l20(n20 n20Var, k20 k20Var) {
        this.f6464w = n20Var;
    }

    @Override // ai.n10
    public final void n3(d10 d10Var, String str) {
        tg.f f10;
        if (this.f6464w.f7157b == null) {
            return;
        }
        f.a aVar = this.f6464w.f7157b;
        f10 = this.f6464w.f(d10Var);
        aVar.c(f10, str);
    }
}
