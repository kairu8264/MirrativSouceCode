package ai;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class zx2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f13245a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f13246b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f13247c;

    static {
        Object c10 = c();
        f13245a = c10;
        f13246b = c10 == null ? null : e("getStackTraceElement", Throwable.class, Integer.TYPE);
        f13247c = c10 != null ? d(c10) : null;
    }

    public static void a(Throwable th2) {
        if (!(th2 instanceof RuntimeException)) {
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            return;
        }
        throw ((RuntimeException) th2);
    }

    public static String b(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        ug3.c(th2, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static Object c() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Object obj) {
        try {
            Method e10 = e("getStackTraceDepth", Throwable.class);
            if (e10 == null) {
                return null;
            }
            e10.invoke(obj, new Throwable());
            return e10;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Method e(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }
}
