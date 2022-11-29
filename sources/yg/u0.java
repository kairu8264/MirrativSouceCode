package yg;

import ai.l2;
import ai.m2;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class u0 extends l2 implements v0 {
    public u0() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            boolean zze = zze(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            m2.b(parcel2, zze);
        } else if (i10 != 2) {
            return false;
        } else {
            zzf(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        return true;
    }
}
