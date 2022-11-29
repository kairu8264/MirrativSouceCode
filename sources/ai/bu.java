package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class bu extends k2 {
    public bu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder M1(yh.a aVar, fs fsVar, String str, z80 z80Var, int i10, int i11) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.d(i02, fsVar);
        i02.writeString(str);
        m2.f(i02, z80Var);
        i02.writeInt(213806000);
        i02.writeInt(i11);
        Parcel s02 = s0(2, i02);
        IBinder readStrongBinder = s02.readStrongBinder();
        s02.recycle();
        return readStrongBinder;
    }
}
