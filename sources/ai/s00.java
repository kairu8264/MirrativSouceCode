package ai;

import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class s00 extends l2 implements t00 {
    public s00() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            S(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
        } else if (i10 == 2) {
            b();
        } else if (i10 != 3) {
            return false;
        } else {
            U(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
