package ai;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class l00 extends l2 implements m00 {
    public l00() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static m00 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        if (queryLocalInterface instanceof m00) {
            return (m00) queryLocalInterface;
        }
        return new k00(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            yh.a zzb = zzb();
            parcel2.writeNoException();
            m2.f(parcel2, zzb);
        } else if (i10 == 2) {
            Uri b10 = b();
            parcel2.writeNoException();
            m2.e(parcel2, b10);
        } else if (i10 == 3) {
            double d10 = d();
            parcel2.writeNoException();
            parcel2.writeDouble(d10);
        } else if (i10 == 4) {
            int c10 = c();
            parcel2.writeNoException();
            parcel2.writeInt(c10);
        } else if (i10 != 5) {
            return false;
        } else {
            int a10 = a();
            parcel2.writeNoException();
            parcel2.writeInt(a10);
        }
        return true;
    }
}
