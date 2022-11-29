package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public final class yt extends k2 implements au {
    public yt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // ai.au
    public final pv B0() throws RemoteException {
        pv nvVar;
        Parcel s02 = s0(26, i0());
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            nvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            if (queryLocalInterface instanceof pv) {
                nvVar = (pv) queryLocalInterface;
            } else {
                nvVar = new nv(readStrongBinder);
            }
        }
        s02.recycle();
        return nvVar;
    }

    @Override // ai.au
    public final void E3(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(44, i02);
    }

    @Override // ai.au
    public final void N1(pu puVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, puVar);
        z0(45, i02);
    }

    @Override // ai.au
    public final String O() throws RemoteException {
        Parcel s02 = s0(31, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.au
    public final void T3(uw uwVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, uwVar);
        z0(29, i02);
    }

    @Override // ai.au
    public final void V1(jt jtVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, jtVar);
        z0(20, i02);
    }

    @Override // ai.au
    public final void V3(as asVar, qt qtVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, asVar);
        m2.f(i02, qtVar);
        z0(43, i02);
    }

    @Override // ai.au
    public final boolean e4(as asVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, asVar);
        Parcel s02 = s0(4, i02);
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }

    @Override // ai.au
    public final void g() throws RemoteException {
        z0(2, i0());
    }

    @Override // ai.au
    public final yh.a h() throws RemoteException {
        Parcel s02 = s0(1, i0());
        yh.a s03 = a.AbstractBinderC1060a.s0(s02.readStrongBinder());
        s02.recycle();
        return s03;
    }

    @Override // ai.au
    public final void k() throws RemoteException {
        z0(5, i0());
    }

    @Override // ai.au
    public final void l5(iv ivVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, ivVar);
        z0(42, i02);
    }

    @Override // ai.au
    public final void n() throws RemoteException {
        z0(6, i0());
    }

    @Override // ai.au
    public final void n0(boolean z10) throws RemoteException {
        Parcel i02 = i0();
        m2.b(i02, z10);
        z0(34, i02);
    }

    @Override // ai.au
    public final void q1(nt ntVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, ntVar);
        z0(7, i02);
    }

    @Override // ai.au
    public final fs r() throws RemoteException {
        Parcel s02 = s0(12, i0());
        fs fsVar = (fs) m2.c(s02, fs.CREATOR);
        s02.recycle();
        return fsVar;
    }

    @Override // ai.au
    public final void s2(hu huVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, huVar);
        z0(8, i02);
    }

    @Override // ai.au
    public final void t2(boolean z10) throws RemoteException {
        Parcel i02 = i0();
        m2.b(i02, z10);
        z0(22, i02);
    }

    @Override // ai.au
    public final lv y() throws RemoteException {
        lv jvVar;
        Parcel s02 = s0(41, i0());
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            jvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof lv) {
                jvVar = (lv) queryLocalInterface;
            } else {
                jvVar = new jv(readStrongBinder);
            }
        }
        s02.recycle();
        return jvVar;
    }

    @Override // ai.au
    public final void z3(fs fsVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, fsVar);
        z0(13, i02);
    }
}
