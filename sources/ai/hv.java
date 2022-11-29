package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class hv extends l2 implements iv {
    public hv() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static iv R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        if (queryLocalInterface instanceof iv) {
            return (iv) queryLocalInterface;
        }
        return new gv(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            d4((hs) m2.c(parcel, hs.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
