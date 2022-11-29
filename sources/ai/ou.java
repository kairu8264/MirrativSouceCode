package ai;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class ou extends l2 implements pu {
    public ou() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            j2((sr) m2.c(parcel, sr.CREATOR));
        } else if (i10 == 2) {
            b();
        } else if (i10 == 3) {
            d();
        } else if (i10 == 4) {
            c();
        } else if (i10 != 5) {
            return false;
        } else {
            a();
        }
        parcel2.writeNoException();
        return true;
    }
}
