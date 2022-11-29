package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public final class g90 extends k2 implements i90 {
    public g90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // ai.i90
    public final boolean a() throws RemoteException {
        Parcel s02 = s0(2, i0());
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }

    @Override // ai.i90
    public final yh.a c() throws RemoteException {
        Parcel s02 = s0(1, i0());
        yh.a s03 = a.AbstractBinderC1060a.s0(s02.readStrongBinder());
        s02.recycle();
        return s03;
    }
}
