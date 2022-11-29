package ai;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class wa0 extends k2 implements ya0 {
    public wa0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // ai.ya0
    public final void A3(String str, String str2, as asVar, yh.a aVar, va0 va0Var, f90 f90Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        m2.d(i02, asVar);
        m2.f(i02, aVar);
        m2.f(i02, va0Var);
        m2.f(i02, f90Var);
        z0(16, i02);
    }

    @Override // ai.ya0
    public final void R2(String str, String str2, as asVar, yh.a aVar, sa0 sa0Var, f90 f90Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        m2.d(i02, asVar);
        m2.f(i02, aVar);
        m2.f(i02, sa0Var);
        m2.f(i02, f90Var);
        z0(18, i02);
    }

    @Override // ai.ya0
    public final void U3(String str, String str2, as asVar, yh.a aVar, pa0 pa0Var, f90 f90Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        m2.d(i02, asVar);
        m2.f(i02, aVar);
        m2.f(i02, pa0Var);
        m2.f(i02, f90Var);
        z0(14, i02);
    }

    @Override // ai.ya0
    public final void W4(String str, String str2, as asVar, yh.a aVar, ma0 ma0Var, f90 f90Var, fs fsVar) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        m2.d(i02, asVar);
        m2.f(i02, aVar);
        m2.f(i02, ma0Var);
        m2.f(i02, f90Var);
        m2.d(i02, fsVar);
        z0(13, i02);
    }

    @Override // ai.ya0
    public final void X1(yh.a aVar, String str, Bundle bundle, Bundle bundle2, fs fsVar, bb0 bb0Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        i02.writeString(str);
        m2.d(i02, bundle);
        m2.d(i02, bundle2);
        m2.d(i02, fsVar);
        m2.f(i02, bb0Var);
        z0(1, i02);
    }

    @Override // ai.ya0
    public final lb0 a() throws RemoteException {
        Parcel s02 = s0(2, i0());
        lb0 lb0Var = (lb0) m2.c(s02, lb0.CREATOR);
        s02.recycle();
        return lb0Var;
    }

    @Override // ai.ya0
    public final void d3(String str, String str2, as asVar, yh.a aVar, ma0 ma0Var, f90 f90Var, fs fsVar) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        m2.d(i02, asVar);
        m2.f(i02, aVar);
        m2.f(i02, ma0Var);
        m2.f(i02, f90Var);
        m2.d(i02, fsVar);
        z0(21, i02);
    }

    @Override // ai.ya0
    public final pv e() throws RemoteException {
        Parcel s02 = s0(5, i0());
        pv R5 = ov.R5(s02.readStrongBinder());
        s02.recycle();
        return R5;
    }

    @Override // ai.ya0
    public final lb0 f() throws RemoteException {
        Parcel s02 = s0(3, i0());
        lb0 lb0Var = (lb0) m2.c(s02, lb0.CREATOR);
        s02.recycle();
        return lb0Var;
    }

    @Override // ai.ya0
    public final boolean h4(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        Parcel s02 = s0(17, i02);
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }

    @Override // ai.ya0
    public final void h5(String str, String str2, as asVar, yh.a aVar, va0 va0Var, f90 f90Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        m2.d(i02, asVar);
        m2.f(i02, aVar);
        m2.f(i02, va0Var);
        m2.f(i02, f90Var);
        z0(20, i02);
    }

    @Override // ai.ya0
    public final void r0(String str) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        z0(19, i02);
    }

    @Override // ai.ya0
    public final void w5(String str, String str2, as asVar, yh.a aVar, sa0 sa0Var, f90 f90Var, a00 a00Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        m2.d(i02, asVar);
        m2.f(i02, aVar);
        m2.f(i02, sa0Var);
        m2.f(i02, f90Var);
        m2.d(i02, a00Var);
        z0(22, i02);
    }

    @Override // ai.ya0
    public final boolean y0(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        Parcel s02 = s0(15, i02);
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }
}
