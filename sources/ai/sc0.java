package ai;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class sc0 extends l2 implements tc0 {
    public static tc0 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof tc0) {
            return (tc0) queryLocalInterface;
        }
        return new rc0(iBinder);
    }
}
