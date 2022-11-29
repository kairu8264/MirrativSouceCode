package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class o00 extends l2 implements p00 {
    public o00() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        j00 h00Var;
        switch (i10) {
            case 1:
                L2(parcel.readString(), a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                yh.a A = A(parcel.readString());
                parcel2.writeNoException();
                m2.f(parcel2, A);
                return true;
            case 3:
                U(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                c();
                parcel2.writeNoException();
                return true;
            case 5:
                a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 6:
                P(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                G1(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    h00Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    if (queryLocalInterface instanceof j00) {
                        h00Var = (j00) queryLocalInterface;
                    } else {
                        h00Var = new h00(readStrongBinder);
                    }
                }
                b3(h00Var);
                parcel2.writeNoException();
                return true;
            case 9:
                y1(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
