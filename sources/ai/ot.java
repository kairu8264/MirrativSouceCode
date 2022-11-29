package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class ot extends k2 implements qt {
    public ot(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // ai.qt
    public final void B2(sr srVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, srVar);
        z0(2, i02);
    }

    @Override // ai.qt
    public final void zzb() throws RemoteException {
        z0(1, i0());
    }
}
