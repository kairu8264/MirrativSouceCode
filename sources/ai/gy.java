package ai;

import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class gy extends l2 implements hy {
    public gy() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
        } else if (i10 == 2) {
            String b10 = b();
            parcel2.writeNoException();
            parcel2.writeString(b10);
        } else if (i10 == 3) {
            U(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i10 == 4) {
            c();
            parcel2.writeNoException();
        } else if (i10 != 5) {
            return false;
        } else {
            a();
            parcel2.writeNoException();
        }
        return true;
    }
}
