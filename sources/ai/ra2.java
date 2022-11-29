package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class ra2 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final el2 f9383a;

    public ra2(el2 el2Var) {
        this.f9383a = el2Var;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        el2 el2Var = this.f9383a;
        if (el2Var != null) {
            bundle2.putBoolean("render_in_browser", el2Var.b());
            bundle2.putBoolean("disable_ml", this.f9383a.c());
        }
    }
}
