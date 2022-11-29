package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class y80 extends l2 implements z80 {
    public y80() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static z80 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof z80) {
            return (z80) queryLocalInterface;
        }
        return new x80(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            c90 t10 = t(parcel.readString());
            parcel2.writeNoException();
            m2.f(parcel2, t10);
        } else if (i10 == 2) {
            boolean A = A(parcel.readString());
            parcel2.writeNoException();
            m2.b(parcel2, A);
        } else if (i10 == 3) {
            ya0 s10 = s(parcel.readString());
            parcel2.writeNoException();
            m2.f(parcel2, s10);
        } else if (i10 != 4) {
            return false;
        } else {
            boolean x42 = x4(parcel.readString());
            parcel2.writeNoException();
            m2.b(parcel2, x42);
        }
        return true;
    }
}
