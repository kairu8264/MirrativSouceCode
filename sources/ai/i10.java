package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class i10 extends k2 implements k10 {
    public i10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // ai.k10
    public final void a4(z00 z00Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, z00Var);
        z0(1, i02);
    }
}
