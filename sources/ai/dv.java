package ai;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class dv extends k2 implements fv {
    public dv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    @Override // ai.fv
    public final void c() throws RemoteException {
        z0(1, i0());
    }
}
