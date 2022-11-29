package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class j50 extends l2 implements k50 {
    public j50() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static k50 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        if (queryLocalInterface instanceof k50) {
            return (k50) queryLocalInterface;
        }
        return new i50(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            y2(parcel.createTypedArrayList(d50.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
