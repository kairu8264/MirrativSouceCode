package ai;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public final class k00 extends k2 implements m00 {
    public k00(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // ai.m00
    public final int a() throws RemoteException {
        Parcel s02 = s0(5, i0());
        int readInt = s02.readInt();
        s02.recycle();
        return readInt;
    }

    @Override // ai.m00
    public final Uri b() throws RemoteException {
        Parcel s02 = s0(2, i0());
        Uri uri = (Uri) m2.c(s02, Uri.CREATOR);
        s02.recycle();
        return uri;
    }

    @Override // ai.m00
    public final int c() throws RemoteException {
        Parcel s02 = s0(4, i0());
        int readInt = s02.readInt();
        s02.recycle();
        return readInt;
    }

    @Override // ai.m00
    public final double d() throws RemoteException {
        Parcel s02 = s0(3, i0());
        double readDouble = s02.readDouble();
        s02.recycle();
        return readDouble;
    }

    @Override // ai.m00
    public final yh.a zzb() throws RemoteException {
        Parcel s02 = s0(1, i0());
        yh.a s03 = a.AbstractBinderC1060a.s0(s02.readStrongBinder());
        s02.recycle();
        return s03;
    }
}
