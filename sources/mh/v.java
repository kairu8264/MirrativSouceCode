package mh;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class v extends u<Bundle> {
    public v(int i10, int i11, Bundle bundle) {
        super(i10, 1, bundle);
    }

    @Override // mh.u
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // mh.u
    public final boolean b() {
        return false;
    }
}
