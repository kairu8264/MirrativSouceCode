package ai;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class rv extends l2 implements sv {
    public rv() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            c();
        } else if (i10 == 2) {
            a();
        } else if (i10 == 3) {
            f();
        } else if (i10 == 4) {
            e();
        } else if (i10 != 5) {
            return false;
        } else {
            k2(m2.a(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
