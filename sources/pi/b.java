package pi;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class b {
    public b(Context context) {
    }

    public static final boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
