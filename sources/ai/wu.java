package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class wu extends k2 implements yu {
    public wu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // ai.yu
    public final String a() throws RemoteException {
        Parcel s02 = s0(2, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.yu
    public final String c() throws RemoteException {
        Parcel s02 = s0(1, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }
}
