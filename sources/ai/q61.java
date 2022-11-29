package ai;

import android.os.Bundle;
import java.util.Set;

/* loaded from: classes3.dex */
public final class q61 extends ja1<qt2> implements q20 {

    /* renamed from: x  reason: collision with root package name */
    public final Bundle f8839x;

    public q61(Set<gc1<qt2>> set) {
        super(set);
        this.f8839x = new Bundle();
    }

    @Override // ai.q20
    public final synchronized void B(String str, Bundle bundle) {
        this.f8839x.putAll(bundle);
        C0(p61.f8320a);
    }

    public final synchronized Bundle S0() {
        return new Bundle(this.f8839x);
    }
}
