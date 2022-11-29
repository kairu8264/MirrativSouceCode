package ai;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import yh.a;

/* loaded from: classes3.dex */
public final class l90 extends k2 {
    public l90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final pv B4() throws RemoteException {
        Parcel s02 = s0(16, i0());
        pv R5 = ov.R5(s02.readStrongBinder());
        s02.recycle();
        return R5;
    }

    public final yh.a C() throws RemoteException {
        Parcel s02 = s0(21, i0());
        yh.a s03 = a.AbstractBinderC1060a.s0(s02.readStrongBinder());
        s02.recycle();
        return s03;
    }

    public final void D5(yh.a aVar, yh.a aVar2, yh.a aVar3) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.f(i02, aVar2);
        m2.f(i02, aVar3);
        z0(22, i02);
    }

    public final void M1(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(10, i02);
    }

    public final List a() throws RemoteException {
        Parcel s02 = s0(3, i0());
        ArrayList g10 = m2.g(s02);
        s02.recycle();
        return g10;
    }

    public final String c() throws RemoteException {
        Parcel s02 = s0(2, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    public final m00 e() throws RemoteException {
        Parcel s02 = s0(5, i0());
        m00 R5 = l00.R5(s02.readStrongBinder());
        s02.recycle();
        return R5;
    }

    public final String f() throws RemoteException {
        Parcel s02 = s0(4, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    public final Bundle f4() throws RemoteException {
        Parcel s02 = s0(13, i0());
        Bundle bundle = (Bundle) m2.c(s02, Bundle.CREATOR);
        s02.recycle();
        return bundle;
    }

    public final String g() throws RemoteException {
        Parcel s02 = s0(7, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    public final String h() throws RemoteException {
        Parcel s02 = s0(6, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    public final void i() throws RemoteException {
        z0(8, i0());
    }

    public final e00 k5() throws RemoteException {
        Parcel s02 = s0(19, i0());
        e00 R5 = d00.R5(s02.readStrongBinder());
        s02.recycle();
        return R5;
    }

    public final boolean n() throws RemoteException {
        Parcel s02 = s0(11, i0());
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }

    public final boolean o() throws RemoteException {
        Parcel s02 = s0(12, i0());
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }

    public final void p5(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(14, i02);
    }

    public final yh.a r() throws RemoteException {
        Parcel s02 = s0(20, i0());
        yh.a s03 = a.AbstractBinderC1060a.s0(s02.readStrongBinder());
        s02.recycle();
        return s03;
    }

    public final yh.a w() throws RemoteException {
        Parcel s02 = s0(15, i0());
        yh.a s03 = a.AbstractBinderC1060a.s0(s02.readStrongBinder());
        s02.recycle();
        return s03;
    }

    public final void z4(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(9, i02);
    }
}
