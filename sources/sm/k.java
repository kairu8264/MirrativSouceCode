package sm;

import android.content.Context;
import android.content.pm.PackageManager;
import ep.v;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f52761a;

    public static void a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(Context context) {
        Boolean bool = f52761a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f52761a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            lm.a e11 = lm.a.e();
            e11.a("No perf logcat meta data found " + e10.getMessage());
            return false;
        }
    }

    public static int c(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static String d(String str) {
        v m10 = v.m(str);
        return m10 != null ? m10.k().z("").l("").p(null).f(null).toString() : str;
    }

    public static String e(String str, int i10) {
        int lastIndexOf;
        if (str.length() <= i10) {
            return str;
        }
        if (str.charAt(i10) == '/') {
            return str.substring(0, i10);
        }
        v m10 = v.m(str);
        if (m10 == null) {
            return str.substring(0, i10);
        }
        if (m10.d().lastIndexOf(47) >= 0 && (lastIndexOf = str.lastIndexOf(47, i10 - 1)) >= 0) {
            return str.substring(0, lastIndexOf);
        }
        return str.substring(0, i10);
    }
}
