package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class v50 extends k2 implements x50 {
    public v50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // ai.x50
    public final void B(sr srVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, srVar);
        z0(3, i02);
    }

    @Override // ai.x50
    public final void E(int i10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(i10);
        z0(2, i02);
    }

    @Override // ai.x50
    public final void t1(r50 r50Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, r50Var);
        z0(1, i02);
    }
}
