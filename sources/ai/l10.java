package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class l10 extends k2 implements n10 {
    public l10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // ai.n10
    public final void n3(d10 d10Var, String str) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, d10Var);
        i02.writeString(str);
        z0(1, i02);
    }
}
