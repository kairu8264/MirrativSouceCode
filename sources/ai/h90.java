package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class h90 extends l2 implements i90 {
    public h90() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static i90 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        if (queryLocalInterface instanceof i90) {
            return (i90) queryLocalInterface;
        }
        return new g90(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            yh.a c10 = c();
            parcel2.writeNoException();
            m2.f(parcel2, c10);
        } else if (i10 != 2) {
            return false;
        } else {
            boolean a10 = a();
            parcel2.writeNoException();
            m2.b(parcel2, a10);
        }
        return true;
    }
}
