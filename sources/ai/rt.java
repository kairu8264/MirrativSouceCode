package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class rt extends k2 implements tt {
    public rt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // ai.tt
    public final void S1(as asVar) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, asVar);
        z0(1, i02);
    }
}
