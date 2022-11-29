package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class na2 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f7248a;

    public na2(Bundle bundle) {
        this.f7248a = bundle;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle a10 = km2.a(bundle2, "device");
        a10.putBundle("android_mem_info", this.f7248a);
        bundle2.putBundle("device", a10);
    }
}
