package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class d90 extends k2 implements f90 {
    public d90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // ai.f90
    public final void A4(sr srVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, srVar);
        z0(24, i02);
    }

    @Override // ai.f90
    public final void C0(String str) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        z0(21, i02);
    }

    @Override // ai.f90
    public final void G4(lf0 lf0Var) throws RemoteException {
        throw null;
    }

    @Override // ai.f90
    public final void K4(d10 d10Var, String str) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, d10Var);
        i02.writeString(str);
        z0(10, i02);
    }

    @Override // ai.f90
    public final void M5(int i10, String str) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(i10);
        i02.writeString(str);
        z0(22, i02);
    }

    @Override // ai.f90
    public final void O0(pf0 pf0Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, pf0Var);
        z0(16, i02);
    }

    @Override // ai.f90
    public final void O2(String str, String str2) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        z0(9, i02);
    }

    @Override // ai.f90
    public final void Y(int i10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(i10);
        z0(3, i02);
    }

    @Override // ai.f90
    public final void a() throws RemoteException {
        z0(2, i0());
    }

    @Override // ai.f90
    public final void c() throws RemoteException {
        z0(1, i0());
    }

    @Override // ai.f90
    public final void c4(sr srVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, srVar);
        z0(23, i02);
    }

    @Override // ai.f90
    public final void e() throws RemoteException {
        z0(4, i0());
    }

    @Override // ai.f90
    public final void g() throws RemoteException {
        z0(6, i0());
    }

    @Override // ai.f90
    public final void h() throws RemoteException {
        z0(5, i0());
    }

    @Override // ai.f90
    public final void i() throws RemoteException {
        z0(8, i0());
    }

    @Override // ai.f90
    public final void l() throws RemoteException {
        z0(15, i0());
    }

    @Override // ai.f90
    public final void m() throws RemoteException {
        z0(18, i0());
    }

    @Override // ai.f90
    public final void m0(int i10) throws RemoteException {
        throw null;
    }

    @Override // ai.f90
    public final void n() throws RemoteException {
        z0(11, i0());
    }

    @Override // ai.f90
    public final void o() throws RemoteException {
        z0(13, i0());
    }

    @Override // ai.f90
    public final void r() throws RemoteException {
        z0(20, i0());
    }
}
