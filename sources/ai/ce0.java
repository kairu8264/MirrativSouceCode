package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class ce0 extends k2 implements ee0 {
    public ce0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // ai.ee0
    public final void c5(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, parcelFileDescriptor);
        z0(1, i02);
    }

    @Override // ai.ee0
    public final void j5(yg.d0 d0Var) throws RemoteException {
        Parcel i02 = i0();
        m2.d(i02, d0Var);
        z0(2, i02);
    }
}
