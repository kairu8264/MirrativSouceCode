package kk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class o {
    @NullableDecl

    /* renamed from: a  reason: collision with root package name */
    public static final Object f38859a;
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    public static final Method f38860b;
    @NullableDecl

    /* renamed from: c  reason: collision with root package name */
    public static final Method f38861c;

    static {
        Object b10 = b();
        f38859a = b10;
        f38860b = b10 == null ? null : a();
        f38861c = b10 != null ? d() : null;
    }

    @NullableDecl
    public static Method a() {
        return c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @NullableDecl
    public static Object b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    public static Method c(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    public static Method d() {
        try {
            Method c10 = c("getStackTraceDepth", Throwable.class);
            if (c10 == null) {
                return null;
            }
            c10.invoke(b(), new Throwable());
            return c10;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static void e(Throwable th2) {
        j.i(th2);
        if (!(th2 instanceof RuntimeException)) {
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            return;
        }
        throw ((RuntimeException) th2);
    }
}
