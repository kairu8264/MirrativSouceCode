package ai;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class fc2 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final String f3991a;

    public fc2(String str) {
        this.f3991a = str;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (TextUtils.isEmpty(this.f3991a)) {
            return;
        }
        bundle2.putString("query_info", this.f3991a);
    }
}
