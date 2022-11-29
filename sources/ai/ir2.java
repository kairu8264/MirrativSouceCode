package ai;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class ir2 extends l2 implements jr2 {
    public static jr2 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        if (queryLocalInterface instanceof jr2) {
            return (jr2) queryLocalInterface;
        }
        return new hr2(iBinder);
    }
}
