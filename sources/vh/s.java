package vh;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes3.dex */
public final class s {
    public static boolean a(Context context, int i10) {
        if (b(context, i10, "com.google.android.gms")) {
            try {
                return nh.h.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
                return false;
            }
        }
        return false;
    }

    @TargetApi(19)
    public static boolean b(Context context, int i10, String str) {
        return xh.c.a(context).h(i10, str);
    }
}
