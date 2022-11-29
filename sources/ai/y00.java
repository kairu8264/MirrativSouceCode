package ai;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class y00 extends l2 implements z00 {
    public y00() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
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
                String e10 = e();
                parcel2.writeNoException();
                parcel2.writeString(e10);
                return true;
            case 9:
                Bundle h10 = h();
                parcel2.writeNoException();
                m2.e(parcel2, h10);
                return true;
            case 10:
                g();
                parcel2.writeNoException();
                return true;
            case 11:
                pv i12 = i();
                parcel2.writeNoException();
                m2.f(parcel2, i12);
                return true;
            case 12:
                c2((Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean T1 = T1((Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                m2.b(parcel2, T1);
                return true;
            case 14:
                T((Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                e00 o10 = o();
                parcel2.writeNoException();
                m2.f(parcel2, o10);
                return true;
            case 16:
                yh.a p10 = p();
                parcel2.writeNoException();
                m2.f(parcel2, p10);
                return true;
            case 17:
                String l10 = l();
                parcel2.writeNoException();
                parcel2.writeString(l10);
                return true;
            default:
                return false;
        }
    }
}
