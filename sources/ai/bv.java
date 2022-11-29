package ai;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class bv extends l2 implements cv {
    public bv() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            x0((sr) m2.c(parcel, sr.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
