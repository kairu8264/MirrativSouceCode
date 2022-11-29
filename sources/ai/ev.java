package ai;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class ev extends l2 implements fv {
    public static fv R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        if (queryLocalInterface instanceof fv) {
            return (fv) queryLocalInterface;
        }
        return new dv(iBinder);
    }
}
