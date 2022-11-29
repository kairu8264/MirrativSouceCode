package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class kt extends k2 implements nt {
    public kt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // ai.nt
    public final void F(int i10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(i10);
        z0(2, i02);
    }

    @Override // ai.nt
    public final void Z(sr srVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, srVar);
        z0(8, i02);
    }

    @Override // ai.nt
    public final void a() throws RemoteException {
        z0(4, i0());
    }

    @Override // ai.nt
    public final void c() throws RemoteException {
        z0(3, i0());
    }

    @Override // ai.nt
    public final void e() throws RemoteException {
        z0(6, i0());
    }

    @Override // ai.nt
    public final void f() throws RemoteException {
        z0(5, i0());
    }

    @Override // ai.nt
    public final void h() throws RemoteException {
        z0(7, i0());
    }

    @Override // ai.nt
    public final void zzb() throws RemoteException {
        z0(1, i0());
    }
}
