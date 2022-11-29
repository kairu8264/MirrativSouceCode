package hi;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class n2 extends k1 {

    /* renamed from: w  reason: collision with root package name */
    public final pi.d6 f35861w;

    public n2(pi.d6 d6Var) {
        this.f35861w = d6Var;
    }

    @Override // hi.l1
    public final void M0(String str, String str2, Bundle bundle, long j10) {
        this.f35861w.a(str, str2, bundle, j10);
    }

    @Override // hi.l1
    public final int d() {
        return System.identityHashCode(this.f35861w);
    }
}
