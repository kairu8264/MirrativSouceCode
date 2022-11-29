package hi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class k1 extends p0 implements l1 {
    public k1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // hi.p0
    public final boolean i0(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            M0(parcel.readString(), parcel.readString(), (Bundle) q0.a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i10 != 2) {
            return false;
        } else {
            int d10 = d();
            parcel2.writeNoException();
            parcel2.writeInt(d10);
        }
        return true;
    }
}
