package ti;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class g extends di.a {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void h1(j jVar, f fVar) throws RemoteException {
        Parcel i02 = i0();
        di.c.b(i02, jVar);
        di.c.c(i02, fVar);
        s0(12, i02);
    }
}
