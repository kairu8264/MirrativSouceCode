package rh;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public final class t1 extends fi.a implements v1 {
    public t1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // rh.v1
    public final int b() throws RemoteException {
        Parcel i02 = i0(2, s0());
        int readInt = i02.readInt();
        i02.recycle();
        return readInt;
    }

    @Override // rh.v1
    public final yh.a d() throws RemoteException {
        Parcel i02 = i0(1, s0());
        yh.a s02 = a.AbstractBinderC1060a.s0(i02.readStrongBinder());
        i02.recycle();
        return s02;
    }
}
