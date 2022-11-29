package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class d00 extends l2 implements e00 {
    public d00() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static e00 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        if (queryLocalInterface instanceof e00) {
            return (e00) queryLocalInterface;
        }
        return new c00(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
            return true;
        } else if (i10 != 3) {
            return false;
        } else {
            List<m00> b10 = b();
            parcel2.writeNoException();
            parcel2.writeList(b10);
            return true;
        }
    }
}
