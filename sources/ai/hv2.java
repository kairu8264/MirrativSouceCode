package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class hv2 extends k2 {
    public hv2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final pv2 B4(mv2 mv2Var) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, mv2Var);
        Parcel s02 = s0(3, i02);
        pv2 pv2Var = (pv2) m2.c(s02, pv2.CREATOR);
        s02.recycle();
        return pv2Var;
    }

    public final fv2 M1(dv2 dv2Var) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, dv2Var);
        Parcel s02 = s0(1, i02);
        fv2 fv2Var = (fv2) m2.c(s02, fv2.CREATOR);
        s02.recycle();
        return fv2Var;
    }

    public final void f4(av2 av2Var) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, av2Var);
        z0(2, i02);
    }
}
