package ai;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class u40 extends l2 implements v40 {
    public u40() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            y3((ParcelFileDescriptor) m2.c(parcel, ParcelFileDescriptor.CREATOR));
            return true;
        }
        return false;
    }
}
