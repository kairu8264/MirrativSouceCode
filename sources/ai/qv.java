package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class qv extends k2 implements sv {
    public qv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // ai.sv
    public final void a() throws RemoteException {
        z0(2, i0());
    }

    @Override // ai.sv
    public final void c() throws RemoteException {
        z0(1, i0());
    }

    @Override // ai.sv
    public final void e() throws RemoteException {
        z0(4, i0());
    }

    @Override // ai.sv
    public final void f() throws RemoteException {
        z0(3, i0());
    }

    @Override // ai.sv
    public final void k2(boolean z10) throws RemoteException {
        Parcel i02 = i0();
        m2.b(i02, z10);
        z0(5, i02);
    }
}
