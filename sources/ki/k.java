package ki;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class k extends a {
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    public final void z0(j jVar, byte[] bArr, String str) throws RemoteException {
        Parcel i02 = i0();
        f.b(i02, jVar);
        i02.writeByteArray(bArr);
        i02.writeString(str);
        s0(7, i02);
    }
}
