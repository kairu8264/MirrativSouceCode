package mh;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzq;

/* loaded from: classes3.dex */
public final class t extends u<Void> {
    public t(int i10, int i11, Bundle bundle) {
        super(i10, 2, bundle);
    }

    @Override // mh.u
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new zzq(4, "Invalid response to one way request", null));
        }
    }

    @Override // mh.u
    public final boolean b() {
        return true;
    }
}
