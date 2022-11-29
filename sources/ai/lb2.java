package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class lb2 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f6511a;

    public lb2(Bundle bundle) {
        this.f6511a = bundle;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundle3 = this.f6511a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
    }
}
