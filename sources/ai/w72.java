package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class w72 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f11504a;

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.f11504a.isEmpty()) {
            return;
        }
        bundle2.putBundle("installed_adapter_data", this.f11504a);
    }
}
