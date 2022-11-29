package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class x80 extends k2 implements z80 {
    public x80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // ai.z80
    public final boolean A(String str) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        Parcel s02 = s0(2, i02);
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }

    @Override // ai.z80
    public final ya0 s(String str) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        Parcel s02 = s0(3, i02);
        ya0 R5 = xa0.R5(s02.readStrongBinder());
        s02.recycle();
        return R5;
    }

    @Override // ai.z80
    public final c90 t(String str) throws RemoteException {
        c90 a90Var;
        Parcel i02 = i0();
        i02.writeString(str);
        Parcel s02 = s0(1, i02);
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            a90Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (queryLocalInterface instanceof c90) {
                a90Var = (c90) queryLocalInterface;
            } else {
                a90Var = new a90(readStrongBinder);
            }
        }
        s02.recycle();
        return a90Var;
    }

    @Override // ai.z80
    public final boolean x4(String str) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        Parcel s02 = s0(4, i02);
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }
}
