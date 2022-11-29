package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import yh.a;

/* loaded from: classes3.dex */
public abstract class qu extends l2 implements ru {
    public qu() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        cv avVar;
        switch (i10) {
            case 1:
                c();
                parcel2.writeNoException();
                return true;
            case 2:
                n1(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                R(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                p0(m2.a(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                F5(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                N5(parcel.readString(), a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                float i12 = i();
                parcel2.writeNoException();
                parcel2.writeFloat(i12);
                return true;
            case 8:
                boolean j10 = j();
                parcel2.writeNoException();
                m2.b(parcel2, j10);
                return true;
            case 9:
                String k10 = k();
                parcel2.writeNoException();
                parcel2.writeString(k10);
                return true;
            case 10:
                o0(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                L3(y80.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                J0(j50.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                List<d50> l10 = l();
                parcel2.writeNoException();
                parcel2.writeTypedList(l10);
                return true;
            case 14:
                P2((pw) m2.c(parcel, pw.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                q();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    avVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    if (queryLocalInterface instanceof cv) {
                        avVar = (cv) queryLocalInterface;
                    } else {
                        avVar = new av(readStrongBinder);
                    }
                }
                v1(avVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
