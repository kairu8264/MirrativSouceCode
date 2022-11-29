package dk;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class q0 extends g0 {
    public q0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void E0(Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        i0.b(i02, bundle);
        s0(4, i02);
    }

    public final void g0(Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        i0.b(i02, bundle);
        s0(3, i02);
    }

    public final void w3(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel i02 = i0();
        i0.b(i02, bundle);
        i0.b(i02, bundle2);
        s0(2, i02);
    }
}
