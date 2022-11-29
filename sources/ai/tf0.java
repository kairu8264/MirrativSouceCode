package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class tf0 extends k2 implements vf0 {
    public tf0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // ai.vf0
    public final void G2(pf0 pf0Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, pf0Var);
        z0(3, i02);
    }

    @Override // ai.vf0
    public final void Q4(sr srVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, srVar);
        z0(5, i02);
    }

    @Override // ai.vf0
    public final void a() throws RemoteException {
        z0(2, i0());
    }

    @Override // ai.vf0
    public final void c() throws RemoteException {
        z0(1, i0());
    }

    @Override // ai.vf0
    public final void c0(int i10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(i10);
        z0(4, i02);
    }

    @Override // ai.vf0
    public final void g() throws RemoteException {
        z0(6, i0());
    }

    @Override // ai.vf0
    public final void i() throws RemoteException {
        z0(7, i0());
    }
}
