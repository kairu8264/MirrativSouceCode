package ai;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class it extends l2 implements jt {
    public it() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzb();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
