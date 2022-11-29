package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class yv2 extends k2 {
    public yv2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    public final void B4(yh.a aVar, String str, String str2) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        i02.writeString(str);
        i02.writeString(null);
        z0(8, i02);
    }

    public final void M1(int[] iArr) throws RemoteException {
        Parcel i02 = i0();
        i02.writeIntArray(null);
        z0(4, i02);
    }

    public final void c() throws RemoteException {
        z0(3, i0());
    }

    public final void c0(int i10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(i10);
        z0(6, i02);
    }

    public final void f4(byte[] bArr) throws RemoteException {
        Parcel i02 = i0();
        i02.writeByteArray(bArr);
        z0(5, i02);
    }

    public final void q0(int i10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(i10);
        z0(7, i02);
    }
}
