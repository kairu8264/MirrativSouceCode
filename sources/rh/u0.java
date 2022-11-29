package rh;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class u0 extends fi.a implements w0 {
    public u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // rh.w0
    public final boolean f() throws RemoteException {
        Parcel i02 = i0(7, s0());
        boolean e10 = fi.c.e(i02);
        i02.recycle();
        return e10;
    }

    @Override // rh.w0
    public final boolean g2(nh.c0 c0Var, yh.a aVar) throws RemoteException {
        Parcel s02 = s0();
        fi.c.c(s02, c0Var);
        fi.c.d(s02, aVar);
        Parcel i02 = i0(5, s02);
        boolean e10 = fi.c.e(i02);
        i02.recycle();
        return e10;
    }

    @Override // rh.w0
    public final nh.a0 g4(nh.x xVar) throws RemoteException {
        Parcel s02 = s0();
        fi.c.c(s02, xVar);
        Parcel i02 = i0(6, s02);
        nh.a0 a0Var = (nh.a0) fi.c.a(i02, nh.a0.CREATOR);
        i02.recycle();
        return a0Var;
    }
}
