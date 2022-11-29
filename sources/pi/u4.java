package pi;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes3.dex */
public final class u4 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(nh.i.f43556a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final String b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier != 0) {
            try {
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        return resources.getString(identifier);
    }
}
