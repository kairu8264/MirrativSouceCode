package ai;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class kv extends l2 implements lv {
    public kv() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String c10 = c();
            parcel2.writeNoException();
            parcel2.writeString(c10);
        } else if (i10 == 2) {
            String a10 = a();
            parcel2.writeNoException();
            parcel2.writeString(a10);
        } else if (i10 != 3) {
            return false;
        } else {
            List<js> f10 = f();
            parcel2.writeNoException();
            parcel2.writeTypedList(f10);
        }
        return true;
    }
}
