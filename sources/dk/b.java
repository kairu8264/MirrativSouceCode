package dk;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class b extends h0 implements c {
    public static c s0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new a(iBinder);
    }
}
