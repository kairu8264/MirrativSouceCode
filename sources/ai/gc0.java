package ai;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class gc0 extends l2 implements hc0 {
    public static hc0 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        if (queryLocalInterface instanceof hc0) {
            return (hc0) queryLocalInterface;
        }
        return new fc0(iBinder);
    }
}
