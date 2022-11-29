package vh;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public class q {
    @Deprecated
    public static void a(Context context, SharedPreferences.Editor editor, String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
