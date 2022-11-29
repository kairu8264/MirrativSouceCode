package ai;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class pt extends l2 implements qt {
    public pt() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzb();
        } else if (i10 != 2) {
            return false;
        } else {
            B2((sr) m2.c(parcel, sr.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
