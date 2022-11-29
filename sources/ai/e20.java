package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import yh.a;

/* loaded from: classes3.dex */
public final class e20 extends k2 implements g20 {
    public e20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // ai.g20
    public final yh.a C() throws RemoteException {
        Parcel s02 = s0(19, i0());
        yh.a s03 = a.AbstractBinderC1060a.s0(s02.readStrongBinder());
        s02.recycle();
        return s03;
    }

    @Override // ai.g20
    public final List a() throws RemoteException {
        Parcel s02 = s0(3, i0());
        ArrayList g10 = m2.g(s02);
        s02.recycle();
        return g10;
    }

    @Override // ai.g20
    public final String c() throws RemoteException {
        Parcel s02 = s0(2, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.g20
    public final m00 e() throws RemoteException {
        m00 k00Var;
        Parcel s02 = s0(5, i0());
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            k00Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof m00) {
                k00Var = (m00) queryLocalInterface;
            } else {
                k00Var = new k00(readStrongBinder);
            }
        }
        s02.recycle();
        return k00Var;
    }

    @Override // ai.g20
    public final String f() throws RemoteException {
        Parcel s02 = s0(4, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.g20
    public final String g() throws RemoteException {
        Parcel s02 = s0(7, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.g20
    public final String h() throws RemoteException {
        Parcel s02 = s0(6, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.g20
    public final double i() throws RemoteException {
        Parcel s02 = s0(8, i0());
        double readDouble = s02.readDouble();
        s02.recycle();
        return readDouble;
    }

    @Override // ai.g20
    public final String j() throws RemoteException {
        Parcel s02 = s0(9, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.g20
    public final String k() throws RemoteException {
        Parcel s02 = s0(10, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.g20
    public final e00 l() throws RemoteException {
        e00 c00Var;
        Parcel s02 = s0(14, i0());
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            c00Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof e00) {
                c00Var = (e00) queryLocalInterface;
            } else {
                c00Var = new c00(readStrongBinder);
            }
        }
        s02.recycle();
        return c00Var;
    }

    @Override // ai.g20
    public final pv n() throws RemoteException {
        Parcel s02 = s0(11, i0());
        pv R5 = ov.R5(s02.readStrongBinder());
        s02.recycle();
        return R5;
    }

    @Override // ai.g20
    public final List u() throws RemoteException {
        Parcel s02 = s0(23, i0());
        ArrayList g10 = m2.g(s02);
        s02.recycle();
        return g10;
    }
}
