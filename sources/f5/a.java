package f5;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f31808a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f31809b;

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            b.a(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            b.b();
        }
    }

    public static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    public static boolean d() {
        try {
            if (f31809b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return e();
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f31809b == null) {
                    f31808a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    f31809b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean) f31809b.invoke(null, Long.valueOf(f31808a))).booleanValue();
            } catch (Exception e10) {
                c("isTagEnabled", e10);
            }
        }
        return false;
    }
}
