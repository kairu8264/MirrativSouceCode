package ai;

import android.util.Log;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class f44 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3945a = "Volley";

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f3946b = Log.isLoggable(f3945a, 2);

    /* renamed from: c  reason: collision with root package name */
    public static final String f3947c = f44.class.getName();

    public static void a(String str, Object... objArr) {
        if (f3946b) {
            Log.v(f3945a, e(str, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        Log.d(f3945a, e(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f3945a, e(str, objArr));
    }

    public static void d(Throwable th2, String str, Object... objArr) {
        Log.e(f3945a, e(str, objArr), th2);
    }

    public static String e(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i10].getClassName().equals(f3947c)) {
                String className = stackTrace[i10].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i10].getMethodName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb2.append(substring2);
                sb2.append(TopicConstant.SEPARATOR);
                sb2.append(methodName);
                str2 = sb2.toString();
                break;
            } else {
                i10++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, format);
    }
}
