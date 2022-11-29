package ai;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class yf0 extends l2 implements zf0 {
    public yf0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            c();
        } else if (i10 == 2) {
            E(parcel.readInt());
        } else if (i10 != 3) {
            return false;
        } else {
            B((sr) m2.c(parcel, sr.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
