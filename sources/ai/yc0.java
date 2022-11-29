package ai;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class yc0 extends l2 implements zc0 {
    public static zc0 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if (queryLocalInterface instanceof zc0) {
            return (zc0) queryLocalInterface;
        }
        return new xc0(iBinder);
    }
}
