package ji;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class c extends f implements d {
    public static d i0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new b(iBinder);
    }
}
