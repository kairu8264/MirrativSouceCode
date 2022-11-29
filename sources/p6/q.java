package p6;

import android.content.Context;
import android.provider.Settings;

/* loaded from: classes.dex */
public class q {
    public static String a(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
