package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public final class i50 extends k2 implements k50 {
    public i50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // ai.k50
    public final void y2(List<d50> list) throws RemoteException {
        Parcel i02 = i0();
        i02.writeTypedList(list);
        z0(1, i02);
    }
}
