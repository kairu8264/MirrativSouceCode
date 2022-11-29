package ai;

import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class la0 extends l2 implements ma0 {
    public la0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            L(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
        } else if (i10 == 2) {
            s(parcel.readString());
        } else if (i10 == 3) {
            B((sr) m2.c(parcel, sr.CREATOR));
        } else if (i10 != 4) {
            return false;
        } else {
            X3(h90.R5(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
