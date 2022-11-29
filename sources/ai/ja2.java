package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class ja2 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final String f5674a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5675b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5676c;

    public ja2(String str, boolean z10, boolean z11) {
        this.f5674a = str;
        this.f5675b = z10;
        this.f5676c = z11;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!this.f5674a.isEmpty()) {
            bundle2.putString("inspector_extras", this.f5674a);
        }
        bundle2.putInt("test_mode", this.f5675b ? 1 : 0);
        bundle2.putInt("linked_device", this.f5676c ? 1 : 0);
    }
}
