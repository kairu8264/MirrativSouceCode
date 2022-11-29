package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class b20 extends k2 implements d20 {
    public b20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // ai.d20
    public final void H(String str) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        z0(1, i02);
    }

    @Override // ai.d20
    public final void a() throws RemoteException {
        z0(2, i0());
    }
}
