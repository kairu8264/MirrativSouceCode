package ai;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class tu extends k2 implements vu {
    public tu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    @Override // ai.vu
    public final void c() throws RemoteException {
        z0(1, i0());
    }
}
