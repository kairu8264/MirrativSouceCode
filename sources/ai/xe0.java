package ai;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class xe0 extends l2 implements ye0 {
    public xe0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
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
