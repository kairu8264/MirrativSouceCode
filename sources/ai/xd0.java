package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class xd0 extends k2 implements ae0 {
    public xd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // ai.ae0
    public final void E4(ie0 ie0Var, ee0 ee0Var) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, ie0Var);
        m2.f(i02, ee0Var);
        z0(5, i02);
    }

    @Override // ai.ae0
    public final void G3(ie0 ie0Var, ee0 ee0Var) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, ie0Var);
        m2.f(i02, ee0Var);
        z0(4, i02);
    }

    @Override // ai.ae0
    public final void Z2(String str, ee0 ee0Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        m2.f(i02, ee0Var);
        z0(7, i02);
    }

    @Override // ai.ae0
    public final void m4(ie0 ie0Var, ee0 ee0Var) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, ie0Var);
        m2.f(i02, ee0Var);
        z0(6, i02);
    }
}
