package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class nf0 extends k2 implements pf0 {
    public nf0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // ai.pf0
    public final int a() throws RemoteException {
        Parcel s02 = s0(2, i0());
        int readInt = s02.readInt();
        s02.recycle();
        return readInt;
    }

    @Override // ai.pf0
    public final String c() throws RemoteException {
        Parcel s02 = s0(1, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }
}
