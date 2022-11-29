package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class fc0 extends k2 implements hc0 {
    public fc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // ai.hc0
    public final ec0 w0(yh.a aVar, z80 z80Var, int i10) throws RemoteException {
        ec0 cc0Var;
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.f(i02, z80Var);
        i02.writeInt(213806000);
        Parcel s02 = s0(1, i02);
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            cc0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof ec0) {
                cc0Var = (ec0) queryLocalInterface;
            } else {
                cc0Var = new cc0(readStrongBinder);
            }
        }
        s02.recycle();
        return cc0Var;
    }
}
