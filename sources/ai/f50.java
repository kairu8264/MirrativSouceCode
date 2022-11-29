package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class f50 extends k2 implements h50 {
    public f50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // ai.h50
    public final void s(String str) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        z0(3, i02);
    }
}
