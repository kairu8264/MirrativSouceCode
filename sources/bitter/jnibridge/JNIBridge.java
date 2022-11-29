package bitter.jnibridge;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public class JNIBridge {

    /* loaded from: classes.dex */
    public static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private Object f18471a = new Object[0];

        /* renamed from: b  reason: collision with root package name */
        private long f18472b;

        /* renamed from: c  reason: collision with root package name */
        private Constructor f18473c;

        public a(long j10) {
            this.f18472b = j10;
            try {
                Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                this.f18473c = declaredConstructor;
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError unused) {
                this.f18473c = null;
            } catch (NoSuchMethodException unused2) {
                this.f18473c = null;
            }
        }

        private Object a(Object obj, Method method, Object[] objArr) {
            if (objArr == null) {
                objArr = new Object[0];
            }
            Class<?> declaringClass = method.getDeclaringClass();
            return ((MethodHandles.Lookup) this.f18473c.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
        }

        public final void a() {
            synchronized (this.f18471a) {
                this.f18472b = 0L;
            }
        }

        public final void finalize() {
            synchronized (this.f18471a) {
                long j10 = this.f18472b;
                if (j10 == 0) {
                    return;
                }
                JNIBridge.delete(j10);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            synchronized (this.f18471a) {
                long j10 = this.f18472b;
                if (j10 == 0) {
                    return null;
                }
                try {
                    return JNIBridge.invoke(j10, method.getDeclaringClass(), method, objArr);
                } catch (NoSuchMethodError e10) {
                    if (this.f18473c == null) {
                        System.err.println("JNIBridge error: Java interface default methods are only supported since Android Oreo");
                        throw e10;
                    } else if ((method.getModifiers() & 1024) == 0) {
                        return a(obj, method, objArr);
                    } else {
                        throw e10;
                    }
                }
            }
        }
    }

    public static native void delete(long j10);

    public static void disableInterfaceProxy(Object obj) {
        if (obj != null) {
            ((a) Proxy.getInvocationHandler(obj)).a();
        }
    }

    public static native Object invoke(long j10, Class cls, Method method, Object[] objArr);

    public static Object newInterfaceProxy(long j10, Class[] clsArr) {
        return Proxy.newProxyInstance(JNIBridge.class.getClassLoader(), clsArr, new a(j10));
    }
}
