package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class f10 extends k2 implements h10 {
    public f10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // ai.h10
    public final void t3(x00 x00Var) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, x00Var);
        z0(1, i02);
    }
}
