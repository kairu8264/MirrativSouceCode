package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class m92 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final String f6837a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6838b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f6839c;

    public /* synthetic */ m92(String str, String str2, Bundle bundle, n92 n92Var) {
        this.f6837a = str;
        this.f6838b = str2;
        this.f6839c = bundle;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("consent_string", this.f6837a);
        bundle2.putString("fc_consent", this.f6838b);
        bundle2.putBundle("iab_consent_info", this.f6839c);
    }
}
