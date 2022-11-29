package hi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class h1 extends p0 implements i1 {
    public h1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // hi.p0
    public final boolean i0(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            g0((Bundle) q0.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
