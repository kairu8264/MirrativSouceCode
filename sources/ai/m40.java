package ai;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class m40 extends l2 implements n40 {
    public m40() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            H(parcel.readString());
        } else if (i10 != 2) {
            return false;
        } else {
            a();
        }
        parcel2.writeNoException();
        return true;
    }
}
