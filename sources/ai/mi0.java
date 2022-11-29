package ai;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class mi0 extends l2 implements ni0 {
    public mi0() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static ni0 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        if (queryLocalInterface instanceof ni0) {
            return (ni0) queryLocalInterface;
        }
        return new li0(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        ki0 ki0Var = null;
        switch (i10) {
            case 1:
                yh.a s02 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                ri0 ri0Var = (ri0) m2.c(parcel, ri0.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    if (queryLocalInterface instanceof ki0) {
                        ki0Var = (ki0) queryLocalInterface;
                    } else {
                        ki0Var = new ii0(readStrongBinder);
                    }
                }
                f5(s02, ri0Var, ki0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                zzf(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                parcel2.writeNoException();
                m2.f(parcel2, null);
                return true;
            case 4:
                a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                parcel2.writeNoException();
                m2.f(parcel2, null);
                return true;
            case 5:
                R3(parcel.createTypedArrayList(Uri.CREATOR), a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), gd0.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                C3(parcel.createTypedArrayList(Uri.CREATOR), a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), gd0.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                s4((kd0) m2.c(parcel, kd0.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                e0(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
