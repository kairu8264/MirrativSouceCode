package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class j40 extends k2 implements l40 {
    public j40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // ai.l40
    public final void t(String str) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        z0(1, i02);
    }
}
