package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class w40 extends k2 {
    public w40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void M1(p40 p40Var, v40 v40Var) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, p40Var);
        m2.f(i02, v40Var);
        h1(2, i02);
    }
}
