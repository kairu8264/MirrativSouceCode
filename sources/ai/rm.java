package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class rm extends k2 implements sm {
    public rm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // ai.sm
    public final void a() throws RemoteException {
        z0(4, i0());
    }

    @Override // ai.sm
    public final void b() throws RemoteException {
        z0(1, i0());
    }

    @Override // ai.sm
    public final void d() throws RemoteException {
        z0(2, i0());
    }

    @Override // ai.sm
    public final void f() throws RemoteException {
        z0(5, i0());
    }

    @Override // ai.sm
    public final void x0(sr srVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, srVar);
        z0(3, i02);
    }
}
