package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public final class a10 extends k2 implements d10 {
    public a10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // ai.d10
    public final String e() throws RemoteException {
        Parcel s02 = s0(4, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.d10
    public final boolean h0(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        Parcel s02 = s0(10, i02);
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }

    @Override // ai.d10
    public final yh.a k() throws RemoteException {
        Parcel s02 = s0(9, i0());
        yh.a s03 = a.AbstractBinderC1060a.s0(s02.readStrongBinder());
        s02.recycle();
        return s03;
    }
}
