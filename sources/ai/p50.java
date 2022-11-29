package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class p50 extends l2 implements r50 {
    public p50() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        u50 s50Var;
        if (i10 == 3) {
            pv zzb = zzb();
            parcel2.writeNoException();
            m2.f(parcel2, zzb);
            return true;
        } else if (i10 == 4) {
            b();
            parcel2.writeNoException();
            return true;
        } else if (i10 != 5) {
            if (i10 == 6) {
                L(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i10 != 7) {
                return false;
            } else {
                j00 a10 = a();
                parcel2.writeNoException();
                m2.f(parcel2, a10);
                return true;
            }
        } else {
            yh.a s02 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                s50Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                if (queryLocalInterface instanceof u50) {
                    s50Var = (u50) queryLocalInterface;
                } else {
                    s50Var = new s50(readStrongBinder);
                }
            }
            W0(s02, s50Var);
            parcel2.writeNoException();
            return true;
        }
    }
}
