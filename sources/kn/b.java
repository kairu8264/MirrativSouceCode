package kn;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes4.dex */
public class b {
    public static String a(Context context) {
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 > 0) {
            return context.getResources().getResourcePackageName(i10);
        }
        return context.getPackageName();
    }

    public static int b(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, a(context));
    }

    public static String c(Context context, String str, String str2) {
        Resources resources;
        int b10;
        return (context == null || (resources = context.getResources()) == null || (b10 = b(context, str, "string")) <= 0) ? str2 : resources.getString(b10);
    }
}
