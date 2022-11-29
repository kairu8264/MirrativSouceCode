package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class c00 extends k2 implements e00 {
    public c00(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // ai.e00
    public final List<m00> b() throws RemoteException {
        Parcel s02 = s0(3, i0());
        ArrayList g10 = m2.g(s02);
        s02.recycle();
        return g10;
    }

    @Override // ai.e00
    public final String zzb() throws RemoteException {
        Parcel s02 = s0(2, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }
}
