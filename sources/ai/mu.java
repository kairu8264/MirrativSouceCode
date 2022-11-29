package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class mu extends k2 implements pu {
    public mu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // ai.pu
    public final void a() throws RemoteException {
        z0(5, i0());
    }

    @Override // ai.pu
    public final void b() throws RemoteException {
        z0(2, i0());
    }

    @Override // ai.pu
    public final void c() throws RemoteException {
        z0(4, i0());
    }

    @Override // ai.pu
    public final void d() throws RemoteException {
        z0(3, i0());
    }

    @Override // ai.pu
    public final void j2(sr srVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, srVar);
        z0(1, i02);
    }
}
