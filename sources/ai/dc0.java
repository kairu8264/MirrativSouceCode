package ai;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class dc0 extends l2 implements ec0 {
    public dc0() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static ec0 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        if (queryLocalInterface instanceof ec0) {
            return (ec0) queryLocalInterface;
        }
        return new cc0(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            I0((Intent) m2.c(parcel, Intent.CREATOR));
        } else if (i10 == 2) {
            I2(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
        } else if (i10 != 3) {
            return false;
        } else {
            f();
        }
        parcel2.writeNoException();
        return true;
    }
}
