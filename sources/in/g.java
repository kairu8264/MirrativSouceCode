package in;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes4.dex */
public class g {
    public static boolean a(Context context, Intent intent) {
        return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
