package ai;

import android.util.Log;

/* loaded from: classes3.dex */
public class uj0 {

    /* renamed from: a  reason: collision with root package name */
    public static final vx2 f10721a = vx2.c(4000);

    public static void a(String str) {
        if (j(3)) {
            if (str != null && str.length() > 4000) {
                boolean z10 = true;
                for (String str2 : f10721a.d(str)) {
                    if (z10) {
                        Log.d("Ads", str2);
                    } else {
                        Log.d("Ads-cont", str2);
                    }
                    z10 = false;
                }
                return;
            }
            Log.d("Ads", str);
        }
    }

    public static void b(String str, Throwable th2) {
        if (j(3)) {
            Log.d("Ads", str, th2);
        }
    }

    public static void c(String str) {
        if (j(6)) {
            if (str != null && str.length() > 4000) {
                boolean z10 = true;
                for (String str2 : f10721a.d(str)) {
                    if (z10) {
                        Log.e("Ads", str2);
                    } else {
                        Log.e("Ads-cont", str2);
                    }
                    z10 = false;
                }
                return;
            }
            Log.e("Ads", str);
        }
    }

    public static void d(String str, Throwable th2) {
        if (j(6)) {
            Log.e("Ads", str, th2);
        }
    }

    public static void e(String str) {
        if (j(4)) {
            if (str != null && str.length() > 4000) {
                boolean z10 = true;
                for (String str2 : f10721a.d(str)) {
                    if (z10) {
                        Log.i("Ads", str2);
                    } else {
                        Log.i("Ads-cont", str2);
                    }
                    z10 = false;
                }
                return;
            }
            Log.i("Ads", str);
        }
    }

    public static void f(String str) {
        if (j(5)) {
            if (str != null && str.length() > 4000) {
                boolean z10 = true;
                for (String str2 : f10721a.d(str)) {
                    if (z10) {
                        Log.w("Ads", str2);
                    } else {
                        Log.w("Ads-cont", str2);
                    }
                    z10 = false;
                }
                return;
            }
            Log.w("Ads", str);
        }
    }

    public static void g(String str, Throwable th2) {
        if (j(5)) {
            Log.w("Ads", str, th2);
        }
    }

    public static String h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            int lineNumber = stackTrace[3].getLineNumber();
            StringBuilder sb2 = new StringBuilder(str.length() + 13);
            sb2.append(str);
            sb2.append(" @");
            sb2.append(lineNumber);
            return sb2.toString();
        }
        return str;
    }

    public static void i(String str, Throwable th2) {
        if (j(5)) {
            if (th2 != null) {
                g(h(str), th2);
            } else {
                f(h(str));
            }
        }
    }

    public static boolean j(int i10) {
        return i10 >= 5 || Log.isLoggable("Ads", i10);
    }
}
