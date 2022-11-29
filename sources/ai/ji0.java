package ai;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class ji0 extends l2 implements ki0 {
    public ji0() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            parcel.readString();
            parcel.readString();
        } else if (i10 == 2) {
            t(parcel.readString());
        } else if (i10 != 3) {
            return false;
        } else {
            j1(parcel.readString(), parcel.readString(), (Bundle) m2.c(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
