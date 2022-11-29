package ai;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class gd0 extends l2 implements hd0 {
    public static hd0 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        if (queryLocalInterface instanceof hd0) {
            return (hd0) queryLocalInterface;
        }
        return new fd0(iBinder);
    }
}
