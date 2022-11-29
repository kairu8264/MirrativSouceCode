package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class xt extends k2 {
    public xt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder M1(yh.a aVar, String str, z80 z80Var, int i10) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        i02.writeString(str);
        m2.f(i02, z80Var);
        i02.writeInt(213806000);
        Parcel s02 = s0(1, i02);
        IBinder readStrongBinder = s02.readStrongBinder();
        s02.recycle();
        return readStrongBinder;
    }
}
