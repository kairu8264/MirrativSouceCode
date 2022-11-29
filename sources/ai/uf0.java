package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class uf0 extends l2 implements vf0 {
    public uf0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        pf0 nf0Var;
        switch (i10) {
            case 1:
                c();
                break;
            case 2:
                a();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    nf0Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    if (queryLocalInterface instanceof pf0) {
                        nf0Var = (pf0) queryLocalInterface;
                    } else {
                        nf0Var = new nf0(readStrongBinder);
                    }
                }
                G2(nf0Var);
                break;
            case 4:
                c0(parcel.readInt());
                break;
            case 5:
                Q4((sr) m2.c(parcel, sr.CREATOR));
                break;
            case 6:
                g();
                break;
            case 7:
                i();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
