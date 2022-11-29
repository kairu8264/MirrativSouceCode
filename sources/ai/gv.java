package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class gv extends k2 implements iv {
    public gv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // ai.iv
    public final void d4(hs hsVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, hsVar);
        z0(1, i02);
    }
}
