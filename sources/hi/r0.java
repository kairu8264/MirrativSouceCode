package hi;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class r0 extends o0 implements t0 {
    public r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // hi.t0
    public final Bundle g0(Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        q0.d(i02, bundle);
        Parcel s02 = s0(1, i02);
        Bundle bundle2 = (Bundle) q0.a(s02, Bundle.CREATOR);
        s02.recycle();
        return bundle2;
    }
}
