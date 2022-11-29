package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class qf0 extends k2 implements sf0 {
    public qf0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // ai.sf0
    public final void S(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(5, i02);
    }

    @Override // ai.sf0
    public final void o4(vf0 vf0Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, vf0Var);
        z0(2, i02);
    }

    @Override // ai.sf0
    public final void t5(as asVar, zf0 zf0Var) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, asVar);
        m2.f(i02, zf0Var);
        z0(1, i02);
    }
}
