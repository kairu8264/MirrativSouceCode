package ai;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class ht extends k2 implements jt {
    public ht(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // ai.jt
    public final void zzb() throws RemoteException {
        z0(1, i0());
    }
}
