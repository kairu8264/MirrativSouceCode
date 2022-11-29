package pi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class f3 extends hi.p0 implements g3 {
    public f3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // hi.p0
    public final boolean i0(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                r1((u) hi.q0.a(parcel, u.CREATOR), (na) hi.q0.a(parcel, na.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                R4((ea) hi.q0.a(parcel, ea.CREATOR), (na) hi.q0.a(parcel, na.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                C5((na) hi.q0.a(parcel, na.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                v4((u) hi.q0.a(parcel, u.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                p3((na) hi.q0.a(parcel, na.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<ea> f12 = f1((na) hi.q0.a(parcel, na.CREATOR), hi.q0.f(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(f12);
                return true;
            case 9:
                byte[] j42 = j4((u) hi.q0.a(parcel, u.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(j42);
                return true;
            case 10:
                Z1(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String m22 = m2((na) hi.q0.a(parcel, na.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(m22);
                return true;
            case 12:
                T2((c) hi.q0.a(parcel, c.CREATOR), (na) hi.q0.a(parcel, na.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                C4((c) hi.q0.a(parcel, c.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<ea> Z0 = Z0(parcel.readString(), parcel.readString(), hi.q0.f(parcel), (na) hi.q0.a(parcel, na.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(Z0);
                return true;
            case 15:
                List<ea> H3 = H3(parcel.readString(), parcel.readString(), parcel.readString(), hi.q0.f(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(H3);
                return true;
            case 16:
                List<c> x32 = x3(parcel.readString(), parcel.readString(), (na) hi.q0.a(parcel, na.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(x32);
                return true;
            case 17:
                List<c> W3 = W3(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(W3);
                return true;
            case 18:
                i5((na) hi.q0.a(parcel, na.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                J2((Bundle) hi.q0.a(parcel, Bundle.CREATOR), (na) hi.q0.a(parcel, na.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                n4((na) hi.q0.a(parcel, na.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
