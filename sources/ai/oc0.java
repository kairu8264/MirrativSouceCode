package ai;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class oc0 extends k2 implements qc0 {
    public oc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // ai.qc0
    public final void a() throws RemoteException {
        z0(14, i0());
    }

    @Override // ai.qc0
    public final void a0(Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, bundle);
        z0(1, i02);
    }

    @Override // ai.qc0
    public final void c() throws RemoteException {
        z0(10, i0());
    }

    @Override // ai.qc0
    public final boolean f() throws RemoteException {
        Parcel s02 = s0(11, i0());
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }

    @Override // ai.qc0
    public final void g() throws RemoteException {
        z0(3, i0());
    }

    @Override // ai.qc0
    public final void h() throws RemoteException {
        z0(2, i0());
    }

    @Override // ai.qc0
    public final void h0(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(13, i02);
    }

    @Override // ai.qc0
    public final void i() throws RemoteException {
        z0(4, i0());
    }

    @Override // ai.qc0
    public final void j() throws RemoteException {
        z0(5, i0());
    }

    @Override // ai.qc0
    public final void l() throws RemoteException {
        z0(8, i0());
    }

    @Override // ai.qc0
    public final void l0(Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, bundle);
        Parcel s02 = s0(6, i02);
        if (s02.readInt() != 0) {
            bundle.readFromParcel(s02);
        }
        s02.recycle();
    }

    @Override // ai.qc0
    public final void p() throws RemoteException {
        z0(7, i0());
    }

    @Override // ai.qc0
    public final void p1(int i10, int i11, Intent intent) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(i10);
        i02.writeInt(i11);
        m2.d(i02, intent);
        z0(12, i02);
    }

    @Override // ai.qc0
    public final void q() throws RemoteException {
        z0(9, i0());
    }
}
