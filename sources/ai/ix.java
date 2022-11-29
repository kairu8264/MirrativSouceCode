package ai;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class ix {
    public static final SharedPreferences a(Context context) {
        return context.getSharedPreferences("google_ads_flags", 0);
    }
}
