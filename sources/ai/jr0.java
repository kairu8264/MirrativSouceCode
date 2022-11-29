package ai;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;
import yh.a;

/* loaded from: classes3.dex */
public abstract class jr0 extends l2 implements kr0 {
    public jr0() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                F0((Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle E0 = E0((Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                m2.e(parcel2, E0);
                return true;
            case 3:
                S0(parcel.readString(), parcel.readString(), (Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                E2(parcel.readString(), parcel.readString(), a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map v22 = v2(parcel.readString(), parcel.readString(), m2.a(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(v22);
                return true;
            case 6:
                int R = R(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(R);
                return true;
            case 7:
                a0((Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                t4(parcel.readString(), parcel.readString(), (Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List f22 = f2(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(f22);
                return true;
            case 10:
                String i12 = i();
                parcel2.writeNoException();
                parcel2.writeString(i12);
                return true;
            case 11:
                String j10 = j();
                parcel2.writeNoException();
                parcel2.writeString(j10);
                return true;
            case 12:
                long k10 = k();
                parcel2.writeNoException();
                parcel2.writeLong(k10);
                return true;
            case 13:
                o0(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                r0(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                H4(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                String w10 = w();
                parcel2.writeNoException();
                parcel2.writeString(w10);
                return true;
            case 17:
                String q10 = q();
                parcel2.writeNoException();
                parcel2.writeString(q10);
                return true;
            case 18:
                String m10 = m();
                parcel2.writeNoException();
                parcel2.writeString(m10);
                return true;
            case 19:
                j0((Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
