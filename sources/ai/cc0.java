package ai;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class cc0 extends k2 implements ec0 {
    public cc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // ai.ec0
    public final void I0(Intent intent) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, intent);
        z0(1, i02);
    }

    @Override // ai.ec0
    public final void I2(yh.a aVar, String str, String str2) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        i02.writeString(str);
        i02.writeString(str2);
        z0(2, i02);
    }

    @Override // ai.ec0
    public final void f() throws RemoteException {
        z0(3, i0());
    }
}
