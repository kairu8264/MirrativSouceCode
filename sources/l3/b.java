package l3;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class b {
    public static Handler a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
