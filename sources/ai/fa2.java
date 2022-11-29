package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class fa2 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f3979a;

    public fa2(Boolean bool) {
        this.f3979a = bool;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        Boolean bool = this.f3979a;
        if (bool != null) {
            bundle2.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
