package bi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class d extends a implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // bi.f
    public final String b() throws RemoteException {
        Parcel s02 = s0(1, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // bi.f
    public final boolean d() throws RemoteException {
        Parcel s02 = s0(6, i0());
        boolean b10 = c.b(s02);
        s02.recycle();
        return b10;
    }

    @Override // bi.f
    public final boolean k0(boolean z10) throws RemoteException {
        Parcel i02 = i0();
        c.a(i02, true);
        Parcel s02 = s0(2, i02);
        boolean b10 = c.b(s02);
        s02.recycle();
        return b10;
    }
}
