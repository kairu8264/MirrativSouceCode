package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class of0 extends l2 implements pf0 {
    public of0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static pf0 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        if (queryLocalInterface instanceof pf0) {
            return (pf0) queryLocalInterface;
        }
        return new nf0(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String c10 = c();
            parcel2.writeNoException();
            parcel2.writeString(c10);
        } else if (i10 != 2) {
            return false;
        } else {
            int a10 = a();
            parcel2.writeNoException();
            parcel2.writeInt(a10);
        }
        return true;
    }
}
