package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class lr0 extends k2 implements nr0 {
    public lr0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // ai.nr0
    public final void M2(yh.a aVar, kr0 kr0Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.f(i02, kr0Var);
        z0(2, i02);
    }
}
