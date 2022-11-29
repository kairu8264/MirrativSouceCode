package ai;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class e90 extends l2 implements f90 {
    public e90() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static f90 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof f90) {
            return (f90) queryLocalInterface;
        }
        return new d90(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                c();
                break;
            case 2:
                a();
                break;
            case 3:
                Y(parcel.readInt());
                break;
            case 4:
                e();
                break;
            case 5:
                h();
                break;
            case 6:
                g();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof j90) {
                        j90 j90Var = (j90) queryLocalInterface;
                        break;
                    } else {
                        new j90(readStrongBinder);
                        break;
                    }
                }
                break;
            case 8:
                i();
                break;
            case 9:
                O2(parcel.readString(), parcel.readString());
                break;
            case 10:
                c10.R5(parcel.readStrongBinder());
                parcel.readString();
                break;
            case 11:
                n();
                break;
            case 12:
                parcel.readString();
                break;
            case 13:
                o();
                break;
            case 14:
                G4((lf0) m2.c(parcel, lf0.CREATOR));
                break;
            case 15:
                l();
                break;
            case 16:
                O0(of0.R5(parcel.readStrongBinder()));
                break;
            case 17:
                m0(parcel.readInt());
                break;
            case 18:
                m();
                break;
            case 19:
                Bundle bundle = (Bundle) m2.c(parcel, Bundle.CREATOR);
                break;
            case 20:
                r();
                break;
            case 21:
                C0(parcel.readString());
                break;
            case 22:
                M5(parcel.readInt(), parcel.readString());
                break;
            case 23:
                c4((sr) m2.c(parcel, sr.CREATOR));
                break;
            case 24:
                A4((sr) m2.c(parcel, sr.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
