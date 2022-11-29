package ai;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class st extends l2 implements tt {
    public st() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            S1((as) m2.c(parcel, as.CREATOR));
            parcel2.writeNoException();
        } else if (i10 == 2) {
            String a10 = a();
            parcel2.writeNoException();
            parcel2.writeString(a10);
        } else if (i10 == 3) {
            boolean f10 = f();
            parcel2.writeNoException();
            m2.b(parcel2, f10);
        } else if (i10 == 4) {
            String e10 = e();
            parcel2.writeNoException();
            parcel2.writeString(e10);
        } else if (i10 != 5) {
            return false;
        } else {
            x1((as) m2.c(parcel, as.CREATOR), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
