package ai;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class de0 extends l2 implements ee0 {
    public de0() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            c5((ParcelFileDescriptor) m2.c(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            j5((yg.d0) m2.c(parcel, yg.d0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
