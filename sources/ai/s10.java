package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class s10 extends k2 implements u10 {
    public s10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // ai.u10
    public final void O4(au auVar, yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, auVar);
        m2.f(i02, aVar);
        z0(1, i02);
    }
}
