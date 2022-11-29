package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class ub extends k2 implements wb {
    public ub(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // ai.wb
    public final void a() throws RemoteException {
        z0(3, i0());
    }

    @Override // ai.wb
    public final void a2(int[] iArr) throws RemoteException {
        Parcel i02 = i0();
        i02.writeIntArray(null);
        z0(4, i02);
    }

    @Override // ai.wb
    public final void b4(yh.a aVar, String str) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        i02.writeString("GMA_SDK");
        z0(2, i02);
    }

    @Override // ai.wb
    public final void p2(byte[] bArr) throws RemoteException {
        Parcel i02 = i0();
        i02.writeByteArray(bArr);
        z0(5, i02);
    }

    @Override // ai.wb
    public final void q0(int i10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(0);
        z0(6, i02);
    }

    @Override // ai.wb
    public final void w2(int i10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(i10);
        z0(7, i02);
    }
}
