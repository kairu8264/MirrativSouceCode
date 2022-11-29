package pi;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class y9 implements ha {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ba f48392a;

    public y9(ba baVar) {
        this.f48392a = baVar;
    }

    @Override // pi.ha
    public final void a(String str, String str2, Bundle bundle) {
        b5 b5Var;
        b5 b5Var2;
        if (!TextUtils.isEmpty(str)) {
            this.f48392a.a().y(new x9(this, str, "_err", bundle));
            return;
        }
        b5Var = this.f48392a.f47665l;
        if (b5Var != null) {
            b5Var2 = this.f48392a.f47665l;
            b5Var2.r().p().b("AppId not known when logging event", "_err");
        }
    }
}
