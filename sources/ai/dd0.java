package ai;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class dd0 extends l2 implements ed0 {
    public static ed0 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        if (queryLocalInterface instanceof ed0) {
            return (ed0) queryLocalInterface;
        }
        return new cd0(iBinder);
    }
}
