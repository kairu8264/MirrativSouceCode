package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class dn extends k2 {
    public dn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long B4(bn bnVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, bnVar);
        Parcel s02 = s0(3, i02);
        long readLong = s02.readLong();
        s02.recycle();
        return readLong;
    }

    public final ym M1(bn bnVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, bnVar);
        Parcel s02 = s0(1, i02);
        ym ymVar = (ym) m2.c(s02, ym.CREATOR);
        s02.recycle();
        return ymVar;
    }

    public final ym f4(bn bnVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, bnVar);
        Parcel s02 = s0(2, i02);
        ym ymVar = (ym) m2.c(s02, ym.CREATOR);
        s02.recycle();
        return ymVar;
    }
}
