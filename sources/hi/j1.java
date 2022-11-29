package hi;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class j1 extends o0 implements l1 {
    public j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // hi.l1
    public final void M0(String str, String str2, Bundle bundle, long j10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        q0.d(i02, bundle);
        i02.writeLong(j10);
        z0(1, i02);
    }

    @Override // hi.l1
    public final int d() throws RemoteException {
        Parcel s02 = s0(2, i0());
        int readInt = s02.readInt();
        s02.recycle();
        return readInt;
    }
}
