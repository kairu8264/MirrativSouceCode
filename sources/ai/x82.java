package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class x82 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final double f11885a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11886b;

    public x82(double d10, boolean z10) {
        this.f11885a = d10;
        this.f11886b = z10;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle a10 = km2.a(bundle2, "device");
        bundle2.putBundle("device", a10);
        Bundle a11 = km2.a(a10, "battery");
        a10.putBundle("battery", a11);
        a11.putBoolean("is_charging", this.f11886b);
        a11.putDouble("battery_level", this.f11885a);
    }
}
