package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zd0 extends l2 implements ae0 {
    public zd0() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        ee0 ee0Var = null;
        if (i10 == 1) {
            td0 td0Var = (td0) m2.c(parcel, td0.CREATOR);
            parcel2.writeNoException();
            m2.e(parcel2, null);
        } else if (i10 == 2) {
            td0 td0Var2 = (td0) m2.c(parcel, td0.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof be0) {
                    be0 be0Var = (be0) queryLocalInterface;
                } else {
                    new be0(readStrongBinder);
                }
            }
            parcel2.writeNoException();
        } else if (i10 == 4) {
            ie0 ie0Var = (ie0) m2.c(parcel, ie0.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface2 instanceof ee0) {
                    ee0Var = (ee0) queryLocalInterface2;
                } else {
                    ee0Var = new ce0(readStrongBinder2);
                }
            }
            G3(ie0Var, ee0Var);
            parcel2.writeNoException();
        } else if (i10 == 5) {
            ie0 ie0Var2 = (ie0) m2.c(parcel, ie0.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface3 instanceof ee0) {
                    ee0Var = (ee0) queryLocalInterface3;
                } else {
                    ee0Var = new ce0(readStrongBinder3);
                }
            }
            E4(ie0Var2, ee0Var);
            parcel2.writeNoException();
        } else if (i10 == 6) {
            ie0 ie0Var3 = (ie0) m2.c(parcel, ie0.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface4 instanceof ee0) {
                    ee0Var = (ee0) queryLocalInterface4;
                } else {
                    ee0Var = new ce0(readStrongBinder4);
                }
            }
            m4(ie0Var3, ee0Var);
            parcel2.writeNoException();
        } else if (i10 != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface5 instanceof ee0) {
                    ee0Var = (ee0) queryLocalInterface5;
                } else {
                    ee0Var = new ce0(readStrongBinder5);
                }
            }
            Z2(readString, ee0Var);
            parcel2.writeNoException();
        }
        return true;
    }
}
