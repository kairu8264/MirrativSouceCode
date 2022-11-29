package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class if0 extends k2 implements kf0 {
    public if0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // ai.kf0
    public final void L(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(1, i02);
    }

    @Override // ai.kf0
    public final void L4(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(11, i02);
    }

    @Override // ai.kf0
    public final void N2(yh.a aVar, lf0 lf0Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.d(i02, lf0Var);
        z0(7, i02);
    }

    @Override // ai.kf0
    public final void P(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(3, i02);
    }

    @Override // ai.kf0
    public final void S4(yh.a aVar, int i10) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        i02.writeInt(i10);
        z0(9, i02);
    }

    @Override // ai.kf0
    public final void X(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(5, i02);
    }

    @Override // ai.kf0
    public final void e0(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(6, i02);
    }

    @Override // ai.kf0
    public final void k3(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(4, i02);
    }

    @Override // ai.kf0
    public final void z4(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(8, i02);
    }
}
