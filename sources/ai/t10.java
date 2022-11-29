package ai;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class t10 extends l2 implements u10 {
    public static u10 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        if (queryLocalInterface instanceof u10) {
            return (u10) queryLocalInterface;
        }
        return new s10(iBinder);
    }
}
