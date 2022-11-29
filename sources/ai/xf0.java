package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class xf0 extends k2 implements zf0 {
    public xf0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // ai.zf0
    public final void B(sr srVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, srVar);
        z0(3, i02);
    }

    @Override // ai.zf0
    public final void E(int i10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(i10);
        z0(2, i02);
    }

    @Override // ai.zf0
    public final void c() throws RemoteException {
        z0(1, i0());
    }
}
