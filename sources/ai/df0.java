package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class df0 extends k2 implements ff0 {
    public df0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // ai.ff0
    public final void a() throws RemoteException {
        z0(2, i0());
    }

    @Override // ai.ff0
    public final void b2(ye0 ye0Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, ye0Var);
        z0(5, i02);
    }

    @Override // ai.ff0
    public final void c() throws RemoteException {
        z0(1, i0());
    }

    @Override // ai.ff0
    public final void e() throws RemoteException {
        z0(4, i0());
    }

    @Override // ai.ff0
    public final void f() throws RemoteException {
        z0(3, i0());
    }

    @Override // ai.ff0
    public final void f0(int i10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(i10);
        z0(7, i02);
    }

    @Override // ai.ff0
    public final void g() throws RemoteException {
        z0(6, i0());
    }

    @Override // ai.ff0
    public final void j() throws RemoteException {
        z0(8, i0());
    }
}
