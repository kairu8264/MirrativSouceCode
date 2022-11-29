package ai;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import yh.a;

/* loaded from: classes3.dex */
public final class m90 extends k2 implements o90 {
    public m90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // ai.o90
    public final void C() throws RemoteException {
        z0(19, i0());
    }

    @Override // ai.o90
    public final float O() throws RemoteException {
        Parcel s02 = s0(25, i0());
        float readFloat = s02.readFloat();
        s02.recycle();
        return readFloat;
    }

    @Override // ai.o90
    public final List a() throws RemoteException {
        Parcel s02 = s0(3, i0());
        ArrayList g10 = m2.g(s02);
        s02.recycle();
        return g10;
    }

    @Override // ai.o90
    public final String c() throws RemoteException {
        Parcel s02 = s0(2, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.o90
    public final m00 e() throws RemoteException {
        Parcel s02 = s0(5, i0());
        m00 R5 = l00.R5(s02.readStrongBinder());
        s02.recycle();
        return R5;
    }

    @Override // ai.o90
    public final String f() throws RemoteException {
        Parcel s02 = s0(4, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.o90
    public final String g() throws RemoteException {
        Parcel s02 = s0(7, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.o90
    public final String h() throws RemoteException {
        Parcel s02 = s0(6, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.o90
    public final double i() throws RemoteException {
        Parcel s02 = s0(8, i0());
        double readDouble = s02.readDouble();
        s02.recycle();
        return readDouble;
    }

    @Override // ai.o90
    public final String j() throws RemoteException {
        Parcel s02 = s0(9, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.o90
    public final String k() throws RemoteException {
        Parcel s02 = s0(10, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.o90
    public final yh.a l() throws RemoteException {
        Parcel s02 = s0(14, i0());
        yh.a s03 = a.AbstractBinderC1060a.s0(s02.readStrongBinder());
        s02.recycle();
        return s03;
    }

    @Override // ai.o90
    public final void l3(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(22, i02);
    }

    @Override // ai.o90
    public final void l4(yh.a aVar, yh.a aVar2, yh.a aVar3) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.f(i02, aVar2);
        m2.f(i02, aVar3);
        z0(21, i02);
    }

    @Override // ai.o90
    public final boolean m() throws RemoteException {
        Parcel s02 = s0(17, i0());
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }

    @Override // ai.o90
    public final pv n() throws RemoteException {
        Parcel s02 = s0(11, i0());
        pv R5 = ov.R5(s02.readStrongBinder());
        s02.recycle();
        return R5;
    }

    @Override // ai.o90
    public final e00 o() throws RemoteException {
        Parcel s02 = s0(12, i0());
        e00 R5 = d00.R5(s02.readStrongBinder());
        s02.recycle();
        return R5;
    }

    @Override // ai.o90
    public final yh.a p() throws RemoteException {
        Parcel s02 = s0(13, i0());
        yh.a s03 = a.AbstractBinderC1060a.s0(s02.readStrongBinder());
        s02.recycle();
        return s03;
    }

    @Override // ai.o90
    public final Bundle q() throws RemoteException {
        Parcel s02 = s0(16, i0());
        Bundle bundle = (Bundle) m2.c(s02, Bundle.CREATOR);
        s02.recycle();
        return bundle;
    }

    @Override // ai.o90
    public final boolean r() throws RemoteException {
        Parcel s02 = s0(18, i0());
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }

    @Override // ai.o90
    public final void t0(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(20, i02);
    }

    @Override // ai.o90
    public final float u() throws RemoteException {
        Parcel s02 = s0(23, i0());
        float readFloat = s02.readFloat();
        s02.recycle();
        return readFloat;
    }

    @Override // ai.o90
    public final yh.a w() throws RemoteException {
        Parcel s02 = s0(15, i0());
        yh.a s03 = a.AbstractBinderC1060a.s0(s02.readStrongBinder());
        s02.recycle();
        return s03;
    }

    @Override // ai.o90
    public final float y() throws RemoteException {
        Parcel s02 = s0(24, i0());
        float readFloat = s02.readFloat();
        s02.recycle();
        return readFloat;
    }
}
