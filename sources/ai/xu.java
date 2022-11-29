package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class xu extends l2 implements yu {
    public xu() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static yu R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (queryLocalInterface instanceof yu) {
            return (yu) queryLocalInterface;
        }
        return new wu(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String c10 = c();
            parcel2.writeNoException();
            parcel2.writeString(c10);
        } else if (i10 != 2) {
            return false;
        } else {
            String a10 = a();
            parcel2.writeNoException();
            parcel2.writeString(a10);
        }
        return true;
    }
}
