package ai;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class mr0 extends l2 implements nr0 {
    public static nr0 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        if (queryLocalInterface instanceof nr0) {
            return (nr0) queryLocalInterface;
        }
        return new lr0(iBinder);
    }
}
