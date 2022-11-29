package ci;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class g extends a {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void z0(ih.d dVar, f fVar) throws RemoteException {
        Parcel i02 = i0();
        c.b(i02, dVar);
        c.c(i02, fVar);
        s0(1, i02);
    }
}
