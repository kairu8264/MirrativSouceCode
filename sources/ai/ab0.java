package ai;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class ab0 extends l2 implements bb0 {
    public ab0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            H(parcel.readString());
        } else if (i10 == 2) {
            s(parcel.readString());
        } else if (i10 != 3) {
            return false;
        } else {
            B((sr) m2.c(parcel, sr.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
