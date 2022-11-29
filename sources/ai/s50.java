package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class s50 extends k2 implements u50 {
    public s50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // ai.u50
    public final void E(int i10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(i10);
        z0(2, i02);
    }

    @Override // ai.u50
    public final void c() throws RemoteException {
        z0(1, i0());
    }
}
