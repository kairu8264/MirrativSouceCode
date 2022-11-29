package yg;

import ai.m2;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class t0 extends ai.k2 implements v0 {
    public t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // yg.v0
    public final boolean zze(yh.a aVar, String str, String str2) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        i02.writeString(str);
        i02.writeString(str2);
        Parcel s02 = s0(1, i02);
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }

    @Override // yg.v0
    public final void zzf(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(2, i02);
    }
}
