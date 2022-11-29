package ai;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class ii0 extends k2 implements ki0 {
    public ii0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // ai.ki0
    public final void j1(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        m2.d(i02, bundle);
        z0(3, i02);
    }

    @Override // ai.ki0
    public final void t(String str) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        z0(2, i02);
    }
}
