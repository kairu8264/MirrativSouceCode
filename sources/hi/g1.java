package hi;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class g1 extends o0 implements i1 {
    public g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // hi.i1
    public final void g0(Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        q0.d(i02, bundle);
        z0(1, i02);
    }
}
