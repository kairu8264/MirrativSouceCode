package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class v10 extends k2 implements x10 {
    public v10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // ai.x10
    public final void l1(g20 g20Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, g20Var);
        z0(1, i02);
    }
}
