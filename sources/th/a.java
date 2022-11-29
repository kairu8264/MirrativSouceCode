package th;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import rh.t;

/* loaded from: classes3.dex */
public final class a extends di.a {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void h1(t tVar) throws RemoteException {
        Parcel i02 = i0();
        di.c.b(i02, tVar);
        z0(1, i02);
    }
}
