package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public final class h00 extends k2 implements j00 {
    public h00(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // ai.j00
    public final yh.a f() throws RemoteException {
        Parcel s02 = s0(4, i0());
        yh.a s03 = a.AbstractBinderC1060a.s0(s02.readStrongBinder());
        s02.recycle();
        return s03;
    }
}
