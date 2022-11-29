package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class o10 extends k2 implements q10 {
    public o10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // ai.q10
    public final void k1(d10 d10Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, d10Var);
        z0(1, i02);
    }
}
