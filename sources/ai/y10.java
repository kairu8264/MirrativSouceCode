package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class y10 extends k2 implements a20 {
    public y10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // ai.a20
    public final boolean S(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        Parcel s02 = s0(2, i02);
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }
}
