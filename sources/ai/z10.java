package ai;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class z10 extends l2 implements a20 {
    public static a20 R5(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        if (queryLocalInterface instanceof a20) {
            return (a20) queryLocalInterface;
        }
        return new y10(iBinder);
    }
}
