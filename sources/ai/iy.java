package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class iy extends k2 implements ky {
    public iy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // ai.ky
    public final void M4(hy hyVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, hyVar);
        z0(1, i02);
    }
}
