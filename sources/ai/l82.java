package ai;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class l82 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final String f6496a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6497b;

    public l82(String str, int i10) {
        this.f6496a = str;
        this.f6497b = i10;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (TextUtils.isEmpty(this.f6496a) || this.f6497b == -1) {
            return;
        }
        Bundle a10 = km2.a(bundle2, "pii");
        bundle2.putBundle("pii", a10);
        a10.putString("pvid", this.f6496a);
        a10.putInt("pvid_s", this.f6497b);
    }
}
