package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class fu extends k2 implements hu {
    public fu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // ai.hu
    public final void B5(String str, String str2) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        z0(1, i02);
    }
}
