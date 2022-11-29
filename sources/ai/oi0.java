package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class oi0 extends k2 implements qi0 {
    public oi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // ai.qi0
    public final ni0 w0(yh.a aVar, z80 z80Var, int i10) throws RemoteException {
        ni0 li0Var;
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.f(i02, z80Var);
        i02.writeInt(213806000);
        Parcel s02 = s0(2, i02);
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            li0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof ni0) {
                li0Var = (ni0) queryLocalInterface;
            } else {
                li0Var = new li0(readStrongBinder);
            }
        }
        s02.recycle();
        return li0Var;
    }
}
