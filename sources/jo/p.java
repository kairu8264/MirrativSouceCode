package jo;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* loaded from: classes4.dex */
public class p {
    public static boolean a(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    public static boolean b(Float f10, Float f11) {
        if (f10 == null) {
            if (f11 == null) {
                return true;
            }
        } else if (f11 != null && f10.floatValue() == f11.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m(new IllegalStateException(str + " must not be null")));
    }

    public static void e(Object obj) {
        if (obj == null) {
            p();
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            q(str);
        }
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m(new NullPointerException(str + " must not be null")));
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            t(str);
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            s(str);
        }
    }

    public static int j(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int k(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }

    public static String l(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + TopicConstant.SEPARATOR + methodName + ", parameter " + str;
    }

    public static <T extends Throwable> T m(T t10) {
        return (T) n(t10, p.class.getName());
    }

    public static <T extends Throwable> T n(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    public static String o(String str, Object obj) {
        return str + obj;
    }

    public static void p() {
        throw ((NullPointerException) m(new NullPointerException()));
    }

    public static void q(String str) {
        throw ((NullPointerException) m(new NullPointerException(str)));
    }

    public static void r() {
        throw ((KotlinNullPointerException) m(new KotlinNullPointerException()));
    }

    public static void s(String str) {
        throw ((IllegalArgumentException) m(new IllegalArgumentException(l(str))));
    }

    public static void t(String str) {
        throw ((NullPointerException) m(new NullPointerException(l(str))));
    }

    public static void u(String str) {
        throw ((UninitializedPropertyAccessException) m(new UninitializedPropertyAccessException(str)));
    }

    public static void v(String str) {
        u("lateinit property " + str + " has not been initialized");
    }
}
