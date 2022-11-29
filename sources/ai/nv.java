package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class nv extends k2 implements pv {
    public nv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // ai.pv
    public final float g() throws RemoteException {
        throw null;
    }

    @Override // ai.pv
    public final float i() throws RemoteException {
        throw null;
    }

    @Override // ai.pv
    public final float k() throws RemoteException {
        throw null;
    }

    @Override // ai.pv
    public final void n5(sv svVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, svVar);
        z0(8, i02);
    }

    @Override // ai.pv
    public final sv o() throws RemoteException {
        sv qvVar;
        Parcel s02 = s0(11, i0());
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            qvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            if (queryLocalInterface instanceof sv) {
                qvVar = (sv) queryLocalInterface;
            } else {
                qvVar = new qv(readStrongBinder);
            }
        }
        s02.recycle();
        return qvVar;
    }
}
