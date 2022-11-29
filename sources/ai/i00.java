package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class i00 extends l2 implements j00 {
    public i00() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        r10 r10Var;
        switch (i10) {
            case 2:
                float c10 = c();
                parcel2.writeNoException();
                parcel2.writeFloat(c10);
                return true;
            case 3:
                zzf(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                yh.a f10 = f();
                parcel2.writeNoException();
                m2.f(parcel2, f10);
                return true;
            case 5:
                float e10 = e();
                parcel2.writeNoException();
                parcel2.writeFloat(e10);
                return true;
            case 6:
                float h10 = h();
                parcel2.writeNoException();
                parcel2.writeFloat(h10);
                return true;
            case 7:
                pv g10 = g();
                parcel2.writeNoException();
                m2.f(parcel2, g10);
                return true;
            case 8:
                boolean i12 = i();
                parcel2.writeNoException();
                m2.b(parcel2, i12);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    r10Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    if (queryLocalInterface instanceof r10) {
                        r10Var = (r10) queryLocalInterface;
                    } else {
                        r10Var = new r10(readStrongBinder);
                    }
                }
                z2(r10Var);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
