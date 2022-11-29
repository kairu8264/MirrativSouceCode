package ai;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class cu extends k2 implements eu {
    public cu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    @Override // ai.eu
    public final void c() throws RemoteException {
        z0(1, i0());
    }
}
