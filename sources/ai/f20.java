package ai;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class f20 extends l2 implements g20 {
    public f20() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        d20 b20Var;
        switch (i10) {
            case 2:
                String c10 = c();
                parcel2.writeNoException();
                parcel2.writeString(c10);
                return true;
            case 3:
                List a10 = a();
                parcel2.writeNoException();
                parcel2.writeList(a10);
                return true;
            case 4:
                String f10 = f();
                parcel2.writeNoException();
                parcel2.writeString(f10);
                return true;
            case 5:
                m00 e10 = e();
                parcel2.writeNoException();
                m2.f(parcel2, e10);
                return true;
            case 6:
                String h10 = h();
                parcel2.writeNoException();
                parcel2.writeString(h10);
                return true;
            case 7:
                String g10 = g();
                parcel2.writeNoException();
                parcel2.writeString(g10);
                return true;
            case 8:
                double i12 = i();
                parcel2.writeNoException();
                parcel2.writeDouble(i12);
                return true;
            case 9:
                String j10 = j();
                parcel2.writeNoException();
                parcel2.writeString(j10);
                return true;
            case 10:
                String k10 = k();
                parcel2.writeNoException();
                parcel2.writeString(k10);
                return true;
            case 11:
                pv n10 = n();
                parcel2.writeNoException();
                m2.f(parcel2, n10);
                return true;
            case 12:
                String o10 = o();
                parcel2.writeNoException();
                parcel2.writeString(o10);
                return true;
            case 13:
                p();
                parcel2.writeNoException();
                return true;
            case 14:
                e00 l10 = l();
                parcel2.writeNoException();
                m2.f(parcel2, l10);
                return true;
            case 15:
                o5((Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                boolean Y4 = Y4((Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                m2.b(parcel2, Y4);
                return true;
            case 17:
                J4((Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                yh.a r10 = r();
                parcel2.writeNoException();
                m2.f(parcel2, r10);
                return true;
            case 19:
                yh.a C = C();
                parcel2.writeNoException();
                m2.f(parcel2, C);
                return true;
            case 20:
                Bundle J = J();
                parcel2.writeNoException();
                m2.e(parcel2, J);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    b20Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    if (queryLocalInterface instanceof d20) {
                        b20Var = (d20) queryLocalInterface;
                    } else {
                        b20Var = new b20(readStrongBinder);
                    }
                }
                T0(b20Var);
                parcel2.writeNoException();
                return true;
            case 22:
                z();
                parcel2.writeNoException();
                return true;
            case 23:
                List u10 = u();
                parcel2.writeNoException();
                parcel2.writeList(u10);
                return true;
            case 24:
                boolean y10 = y();
                parcel2.writeNoException();
                m2.b(parcel2, y10);
                return true;
            case 25:
                O5(xu.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                T4(uu.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 27:
                K();
                parcel2.writeNoException();
                return true;
            case 28:
                M();
                parcel2.writeNoException();
                return true;
            case 29:
                j00 D = D();
                parcel2.writeNoException();
                m2.f(parcel2, D);
                return true;
            case 30:
                boolean I = I();
                parcel2.writeNoException();
                m2.b(parcel2, I);
                return true;
            case 31:
                lv G = G();
                parcel2.writeNoException();
                m2.f(parcel2, G);
                return true;
            case 32:
                P5(hv.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
