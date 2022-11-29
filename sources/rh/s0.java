package rh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class s0 extends fi.b implements k {
    public s0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // fi.b
    public final boolean i0(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            U1(parcel.readInt(), parcel.readStrongBinder(), (Bundle) fi.c.a(parcel, Bundle.CREATOR));
        } else if (i10 == 2) {
            A0(parcel.readInt(), (Bundle) fi.c.a(parcel, Bundle.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            N4(parcel.readInt(), parcel.readStrongBinder(), (g1) fi.c.a(parcel, g1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
