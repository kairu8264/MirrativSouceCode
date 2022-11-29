package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class li0 extends k2 implements ni0 {
    public li0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // ai.ni0
    public final void f5(yh.a aVar, ri0 ri0Var, ki0 ki0Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.d(i02, ri0Var);
        m2.f(i02, ki0Var);
        z0(1, i02);
    }
}
