package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class mm extends k2 implements om {
    public mm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // ai.om
    public final void F(int i10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(i10);
        z0(2, i02);
    }

    @Override // ai.om
    public final void K5(lm lmVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, lmVar);
        z0(1, i02);
    }

    @Override // ai.om
    public final void Z(sr srVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, srVar);
        z0(3, i02);
    }
}
