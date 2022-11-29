package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class af0 extends k2 {
    public af0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void M1(ye0 ye0Var, String str, String str2) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, ye0Var);
        i02.writeString(str);
        i02.writeString(str2);
        z0(2, i02);
    }
}
