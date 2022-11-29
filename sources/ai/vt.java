package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class vt extends l2 implements wt {
    public vt() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        nt ntVar = null;
        lu luVar = null;
        switch (i10) {
            case 1:
                tt c10 = c();
                parcel2.writeNoException();
                m2.f(parcel2, c10);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof nt) {
                        ntVar = (nt) queryLocalInterface;
                    } else {
                        ntVar = new kt(readStrongBinder);
                    }
                }
                Q3(ntVar);
                parcel2.writeNoException();
                return true;
            case 3:
                W2(g10.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                y4(j10.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                N0(parcel.readString(), p10.R5(parcel.readStrongBinder()), m10.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                E5((a00) m2.c(parcel, a00.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface2 instanceof lu) {
                        luVar = (lu) queryLocalInterface2;
                    } else {
                        luVar = new lu(readStrongBinder2);
                    }
                }
                S3(luVar);
                parcel2.writeNoException();
                return true;
            case 8:
                a3(t10.R5(parcel.readStrongBinder()), (fs) m2.c(parcel, fs.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                R1((tg.g) m2.c(parcel, tg.g.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                P4(w10.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                F1((n50) m2.c(parcel, n50.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                a1(w50.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                D3((tg.a) m2.c(parcel, tg.a.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
