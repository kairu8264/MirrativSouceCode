package ai;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class jf0 extends l2 implements kf0 {
    public jf0() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static kf0 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof kf0) {
            return (kf0) queryLocalInterface;
        }
        return new if0(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                L(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                break;
            case 2:
                u0(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                P(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                break;
            case 4:
                k3(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                break;
            case 5:
                X(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                break;
            case 6:
                e0(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                break;
            case 7:
                N2(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), (lf0) m2.c(parcel, lf0.CREATOR));
                break;
            case 8:
                z4(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                break;
            case 9:
                S4(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                h0(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                break;
            case 11:
                L4(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                break;
            case 12:
                Bundle bundle = (Bundle) m2.c(parcel, Bundle.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
