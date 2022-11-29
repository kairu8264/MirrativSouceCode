package rh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class u1 extends fi.b implements v1 {
    public u1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static v1 s0(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof v1 ? (v1) queryLocalInterface : new t1(iBinder);
    }

    @Override // fi.b
    public final boolean i0(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            yh.a d10 = d();
            parcel2.writeNoException();
            fi.c.d(parcel2, d10);
        } else if (i10 != 2) {
            return false;
        } else {
            int b10 = b();
            parcel2.writeNoException();
            parcel2.writeInt(b10);
        }
        return true;
    }
}
