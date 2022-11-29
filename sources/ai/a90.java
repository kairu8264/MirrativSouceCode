package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import yh.a;

/* loaded from: classes3.dex */
public final class a90 extends k2 implements c90 {
    public a90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // ai.c90
    public final void A2(yh.a aVar, as asVar, String str, String str2, f90 f90Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.d(i02, asVar);
        i02.writeString(str);
        i02.writeString(str2);
        m2.f(i02, f90Var);
        z0(7, i02);
    }

    @Override // ai.c90
    public final void C2(yh.a aVar, fs fsVar, as asVar, String str, String str2, f90 f90Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.d(i02, fsVar);
        m2.d(i02, asVar);
        i02.writeString(str);
        i02.writeString(str2);
        m2.f(i02, f90Var);
        z0(35, i02);
    }

    @Override // ai.c90
    public final k90 D0() throws RemoteException {
        k90 k90Var;
        Parcel s02 = s0(15, i0());
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            k90Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof k90) {
                k90Var = (k90) queryLocalInterface;
            } else {
                k90Var = new k90(readStrongBinder);
            }
        }
        s02.recycle();
        return k90Var;
    }

    @Override // ai.c90
    public final lb0 G() throws RemoteException {
        Parcel s02 = s0(33, i0());
        lb0 lb0Var = (lb0) m2.c(s02, lb0.CREATOR);
        s02.recycle();
        return lb0Var;
    }

    @Override // ai.c90
    public final void J1(boolean z10) throws RemoteException {
        Parcel i02 = i0();
        m2.b(i02, z10);
        z0(25, i02);
    }

    @Override // ai.c90
    public final boolean N() throws RemoteException {
        Parcel s02 = s0(22, i0());
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }

    @Override // ai.c90
    public final pv O() throws RemoteException {
        Parcel s02 = s0(26, i0());
        pv R5 = ov.R5(s02.readStrongBinder());
        s02.recycle();
        return R5;
    }

    @Override // ai.c90
    public final lb0 Q() throws RemoteException {
        Parcel s02 = s0(34, i0());
        lb0 lb0Var = (lb0) m2.c(s02, lb0.CREATOR);
        s02.recycle();
        return lb0Var;
    }

    @Override // ai.c90
    public final void Q1(yh.a aVar, as asVar, String str, String str2, f90 f90Var, a00 a00Var, List<String> list) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.d(i02, asVar);
        i02.writeString(str);
        i02.writeString(str2);
        m2.f(i02, f90Var);
        m2.d(i02, a00Var);
        i02.writeStringList(list);
        z0(14, i02);
    }

    @Override // ai.c90
    public final void V2(yh.a aVar, kf0 kf0Var, List<String> list) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.f(i02, kf0Var);
        i02.writeStringList(list);
        z0(23, i02);
    }

    @Override // ai.c90
    public final i90 W() throws RemoteException {
        i90 g90Var;
        Parcel s02 = s0(36, i0());
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            g90Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            if (queryLocalInterface instanceof i90) {
                g90Var = (i90) queryLocalInterface;
            } else {
                g90Var = new g90(readStrongBinder);
            }
        }
        s02.recycle();
        return g90Var;
    }

    @Override // ai.c90
    public final void Z4(yh.a aVar, as asVar, String str, f90 f90Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.d(i02, asVar);
        i02.writeString(str);
        m2.f(i02, f90Var);
        z0(32, i02);
    }

    @Override // ai.c90
    public final yh.a a() throws RemoteException {
        Parcel s02 = s0(2, i0());
        yh.a s03 = a.AbstractBinderC1060a.s0(s02.readStrongBinder());
        s02.recycle();
        return s03;
    }

    @Override // ai.c90
    public final l90 d0() throws RemoteException {
        l90 l90Var;
        Parcel s02 = s0(16, i0());
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            l90Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof l90) {
                l90Var = (l90) queryLocalInterface;
            } else {
                l90Var = new l90(readStrongBinder);
            }
        }
        s02.recycle();
        return l90Var;
    }

    @Override // ai.c90
    public final void d5(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(37, i02);
    }

    @Override // ai.c90
    public final void e() throws RemoteException {
        z0(4, i0());
    }

    @Override // ai.c90
    public final void h() throws RemoteException {
        z0(5, i0());
    }

    @Override // ai.c90
    public final void i2(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(30, i02);
    }

    @Override // ai.c90
    public final void i4(yh.a aVar, as asVar, String str, kf0 kf0Var, String str2) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.d(i02, asVar);
        i02.writeString(null);
        m2.f(i02, kf0Var);
        i02.writeString(str2);
        z0(10, i02);
    }

    @Override // ai.c90
    public final void j() throws RemoteException {
        z0(8, i0());
    }

    @Override // ai.c90
    public final void k() throws RemoteException {
        z0(9, i0());
    }

    @Override // ai.c90
    public final boolean l() throws RemoteException {
        Parcel s02 = s0(13, i0());
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }

    @Override // ai.c90
    public final void m3(as asVar, String str) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, asVar);
        i02.writeString(str);
        z0(11, i02);
    }

    @Override // ai.c90
    public final void p() throws RemoteException {
        z0(12, i0());
    }

    @Override // ai.c90
    public final void s3(yh.a aVar, fs fsVar, as asVar, String str, String str2, f90 f90Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.d(i02, fsVar);
        m2.d(i02, asVar);
        i02.writeString(str);
        i02.writeString(str2);
        m2.f(i02, f90Var);
        z0(6, i02);
    }

    @Override // ai.c90
    public final void t0(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(21, i02);
    }

    @Override // ai.c90
    public final void u3(yh.a aVar, as asVar, String str, f90 f90Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.d(i02, asVar);
        i02.writeString(str);
        m2.f(i02, f90Var);
        z0(28, i02);
    }

    @Override // ai.c90
    public final void w4(yh.a aVar, h50 h50Var, List<l50> list) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.f(i02, h50Var);
        i02.writeTypedList(list);
        z0(31, i02);
    }

    @Override // ai.c90
    public final o90 x() throws RemoteException {
        o90 m90Var;
        Parcel s02 = s0(27, i0());
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            m90Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof o90) {
                m90Var = (o90) queryLocalInterface;
            } else {
                m90Var = new m90(readStrongBinder);
            }
        }
        s02.recycle();
        return m90Var;
    }
}
