package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class rc0 extends k2 implements tc0 {
    public rc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // ai.tc0
    public final IBinder L(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        Parcel s02 = s0(1, i02);
        IBinder readStrongBinder = s02.readStrongBinder();
        s02.recycle();
        return readStrongBinder;
    }
}
