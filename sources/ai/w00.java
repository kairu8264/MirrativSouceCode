package ai;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class w00 extends l2 implements x00 {
    public w00() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                yh.a zzb = zzb();
                parcel2.writeNoException();
                m2.f(parcel2, zzb);
                return true;
            case 3:
                String b10 = b();
                parcel2.writeNoException();
                parcel2.writeString(b10);
                return true;
            case 4:
                List d10 = d();
                parcel2.writeNoException();
                parcel2.writeList(d10);
                return true;
            case 5:
                String c10 = c();
                parcel2.writeNoException();
                parcel2.writeString(c10);
                return true;
            case 6:
                m00 a10 = a();
                parcel2.writeNoException();
                m2.f(parcel2, a10);
                return true;
            case 7:
                String f10 = f();
                parcel2.writeNoException();
                parcel2.writeString(f10);
                return true;
            case 8:
                double e10 = e();
                parcel2.writeNoException();
                parcel2.writeDouble(e10);
                return true;
            case 9:
                String h10 = h();
                parcel2.writeNoException();
                parcel2.writeString(h10);
                return true;
            case 10:
                String g10 = g();
                parcel2.writeNoException();
                parcel2.writeString(g10);
                return true;
            case 11:
                Bundle i12 = i();
                parcel2.writeNoException();
                m2.e(parcel2, i12);
                return true;
            case 12:
                j();
                parcel2.writeNoException();
                return true;
            case 13:
                pv k10 = k();
                parcel2.writeNoException();
                m2.f(parcel2, k10);
                return true;
            case 14:
                T((Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                boolean l02 = l0((Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                m2.b(parcel2, l02);
                return true;
            case 16:
                j0((Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                e00 l10 = l();
                parcel2.writeNoException();
                m2.f(parcel2, l10);
                return true;
            case 18:
                yh.a w10 = w();
                parcel2.writeNoException();
                m2.f(parcel2, w10);
                return true;
            case 19:
                String q10 = q();
                parcel2.writeNoException();
                parcel2.writeString(q10);
                return true;
            default:
                return false;
        }
    }
}
