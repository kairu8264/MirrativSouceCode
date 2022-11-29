package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class ut extends k2 implements wt {
    public ut(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // ai.wt
    public final void E5(a00 a00Var) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, a00Var);
        z0(6, i02);
    }

    @Override // ai.wt
    public final void N0(String str, q10 q10Var, n10 n10Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        m2.f(i02, q10Var);
        m2.f(i02, n10Var);
        z0(5, i02);
    }

    @Override // ai.wt
    public final void P4(x10 x10Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, x10Var);
        z0(10, i02);
    }

    @Override // ai.wt
    public final void Q3(nt ntVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, ntVar);
        z0(2, i02);
    }

    @Override // ai.wt
    public final tt c() throws RemoteException {
        tt rtVar;
        Parcel s02 = s0(1, i0());
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            rtVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof tt) {
                rtVar = (tt) queryLocalInterface;
            } else {
                rtVar = new rt(readStrongBinder);
            }
        }
        s02.recycle();
        return rtVar;
    }
}
