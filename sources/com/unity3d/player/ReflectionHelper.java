package com.unity3d.player;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ReflectionHelper {
    public static boolean LOG = false;
    public static final boolean LOGV = false;

    /* renamed from: a  reason: collision with root package name */
    private static a[] f28360a = new a[4096];

    /* renamed from: b  reason: collision with root package name */
    private static long f28361b;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public volatile Member f28367a;

        /* renamed from: b  reason: collision with root package name */
        private final Class f28368b;

        /* renamed from: c  reason: collision with root package name */
        private final String f28369c;

        /* renamed from: d  reason: collision with root package name */
        private final String f28370d;

        /* renamed from: e  reason: collision with root package name */
        private final int f28371e;

        public a(Class cls, String str, String str2) {
            this.f28368b = cls;
            this.f28369c = str;
            this.f28370d = str2;
            this.f28371e = ((((cls.hashCode() + 527) * 31) + str.hashCode()) * 31) + str2.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f28371e == aVar.f28371e && this.f28370d.equals(aVar.f28370d) && this.f28369c.equals(aVar.f28369c) && this.f28368b.equals(aVar.f28368b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f28371e;
        }
    }

    /* loaded from: classes4.dex */
    public interface b extends InvocationHandler {
        void a(long j10, boolean z10);
    }

    private static float a(Class cls, Class cls2) {
        if (cls.equals(cls2)) {
            return 1.0f;
        }
        if (cls.isPrimitive() || cls2.isPrimitive()) {
            return 0.0f;
        }
        try {
            if (cls.asSubclass(cls2) != null) {
                return 0.5f;
            }
        } catch (ClassCastException unused) {
        }
        try {
            return cls2.asSubclass(cls) != null ? 0.1f : 0.0f;
        } catch (ClassCastException unused2) {
            return 0.0f;
        }
    }

    private static float a(Class cls, Class[] clsArr, Class[] clsArr2) {
        if (clsArr2.length == 0) {
            return 0.1f;
        }
        int i10 = 0;
        if ((clsArr == null ? 0 : clsArr.length) + 1 != clsArr2.length) {
            return 0.0f;
        }
        float f10 = 1.0f;
        if (clsArr != null) {
            int length = clsArr.length;
            float f11 = 1.0f;
            int i11 = 0;
            while (i10 < length) {
                f11 *= a(clsArr[i10], clsArr2[i11]);
                i10++;
                i11++;
            }
            f10 = f11;
        }
        return f10 * a(cls, clsArr2[clsArr2.length - 1]);
    }

    private static Class a(String str, int[] iArr) {
        while (iArr[0] < str.length()) {
            int i10 = iArr[0];
            iArr[0] = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt != '(' && charAt != ')') {
                if (charAt == 'L') {
                    int indexOf = str.indexOf(59, iArr[0]);
                    if (indexOf != -1) {
                        String substring = str.substring(iArr[0], indexOf);
                        iArr[0] = indexOf + 1;
                        try {
                            return Class.forName(substring.replace('/', '.'));
                        } catch (ClassNotFoundException unused) {
                            return null;
                        }
                    }
                    return null;
                } else if (charAt == 'Z') {
                    return Boolean.TYPE;
                } else {
                    if (charAt == 'I') {
                        return Integer.TYPE;
                    }
                    if (charAt == 'F') {
                        return Float.TYPE;
                    }
                    if (charAt == 'V') {
                        return Void.TYPE;
                    }
                    if (charAt == 'B') {
                        return Byte.TYPE;
                    }
                    if (charAt == 'C') {
                        return Character.TYPE;
                    }
                    if (charAt == 'S') {
                        return Short.TYPE;
                    }
                    if (charAt == 'J') {
                        return Long.TYPE;
                    }
                    if (charAt == 'D') {
                        return Double.TYPE;
                    }
                    if (charAt == '[') {
                        return Array.newInstance(a(str, iArr), 0).getClass();
                    }
                    d.Log(5, "! parseType; " + charAt + " is not known!");
                    return null;
                }
            }
        }
        return null;
    }

    private static synchronized void a(a aVar, Member member) {
        synchronized (ReflectionHelper.class) {
            aVar.f28367a = member;
            f28360a[aVar.hashCode() & (f28360a.length - 1)] = aVar;
        }
    }

    private static synchronized boolean a(a aVar) {
        synchronized (ReflectionHelper.class) {
            a aVar2 = f28360a[aVar.hashCode() & (f28360a.length - 1)];
            if (aVar.equals(aVar2)) {
                aVar.f28367a = aVar2.f28367a;
                return true;
            }
            return false;
        }
    }

    private static Class[] a(String str) {
        Class a10;
        int i10 = 0;
        int[] iArr = {0};
        ArrayList arrayList = new ArrayList();
        while (iArr[0] < str.length() && (a10 = a(str, iArr)) != null) {
            arrayList.add(a10);
        }
        Class[] clsArr = new Class[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            clsArr[i10] = (Class) it.next();
            i10++;
        }
        return clsArr;
    }

    public static void endUnityLaunch() {
        f28361b++;
    }

    public static Constructor getConstructorID(Class cls, String str) {
        Constructor<?>[] constructors;
        Constructor<?> constructor;
        a aVar = new a(cls, "", str);
        if (a(aVar)) {
            constructor = (Constructor) aVar.f28367a;
        } else {
            Class[] a10 = a(str);
            float f10 = 0.0f;
            Constructor<?> constructor2 = null;
            for (Constructor<?> constructor3 : cls.getConstructors()) {
                float a11 = a(Void.TYPE, constructor3.getParameterTypes(), a10);
                if (a11 > f10) {
                    constructor2 = constructor3;
                    if (a11 == 1.0f) {
                        break;
                    }
                    f10 = a11;
                }
            }
            a(aVar, constructor2);
            constructor = constructor2;
        }
        if (constructor != null) {
            return constructor;
        }
        throw new NoSuchMethodError("<init>" + str + " in class " + cls.getName());
    }

    public static Field getFieldID(Class cls, String str, String str2, boolean z10) {
        Field field;
        Class cls2 = cls;
        a aVar = new a(cls2, str, str2);
        if (a(aVar)) {
            field = (Field) aVar.f28367a;
        } else {
            Class[] a10 = a(str2);
            float f10 = 0.0f;
            Field field2 = null;
            while (cls2 != null) {
                Field[] declaredFields = cls2.getDeclaredFields();
                int length = declaredFields.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    Field field3 = declaredFields[i10];
                    if (z10 == Modifier.isStatic(field3.getModifiers()) && field3.getName().compareTo(str) == 0) {
                        float a11 = a(field3.getType(), (Class[]) null, a10);
                        if (a11 > f10) {
                            field2 = field3;
                            if (a11 == 1.0f) {
                                f10 = a11;
                                break;
                            }
                            f10 = a11;
                        } else {
                            continue;
                        }
                    }
                    i10++;
                }
                if (f10 == 1.0f || cls2.isPrimitive() || cls2.isInterface() || cls2.equals(Object.class) || cls2.equals(Void.TYPE)) {
                    break;
                }
                cls2 = cls2.getSuperclass();
            }
            a(aVar, field2);
            field = field2;
        }
        if (field == null) {
            Object[] objArr = new Object[4];
            objArr[0] = z10 ? "static" : "non-static";
            objArr[1] = str;
            objArr[2] = str2;
            objArr[3] = cls2.getName();
            throw new NoSuchFieldError(String.format("no %s field with name='%s' signature='%s' in class L%s;", objArr));
        }
        return field;
    }

    public static String getFieldSignature(Field field) {
        Class<?> type = field.getType();
        if (type.isPrimitive()) {
            String name = type.getName();
            return "boolean".equals(name) ? "Z" : "byte".equals(name) ? "B" : "char".equals(name) ? "C" : "double".equals(name) ? "D" : "float".equals(name) ? "F" : "int".equals(name) ? "I" : "long".equals(name) ? "J" : "short".equals(name) ? "S" : name;
        } else if (type.isArray()) {
            return type.getName().replace('.', '/');
        } else {
            return "L" + type.getName().replace('.', '/') + ";";
        }
    }

    public static Method getMethodID(Class cls, String str, String str2, boolean z10) {
        Method method;
        a aVar = new a(cls, str, str2);
        if (a(aVar)) {
            method = (Method) aVar.f28367a;
        } else {
            Class[] a10 = a(str2);
            float f10 = 0.0f;
            Method method2 = null;
            while (cls != null) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    Method method3 = declaredMethods[i10];
                    if (z10 == Modifier.isStatic(method3.getModifiers()) && method3.getName().compareTo(str) == 0) {
                        float a11 = a(method3.getReturnType(), method3.getParameterTypes(), a10);
                        if (a11 > f10) {
                            method2 = method3;
                            if (a11 == 1.0f) {
                                f10 = a11;
                                break;
                            }
                            f10 = a11;
                        } else {
                            continue;
                        }
                    }
                    i10++;
                }
                if (f10 == 1.0f || cls.isPrimitive() || cls.isInterface() || cls.equals(Object.class) || cls.equals(Void.TYPE)) {
                    break;
                }
                cls = cls.getSuperclass();
            }
            a(aVar, method2);
            method = method2;
        }
        if (method == null) {
            Object[] objArr = new Object[4];
            objArr[0] = z10 ? "static" : "non-static";
            objArr[1] = str;
            objArr[2] = str2;
            objArr[3] = cls.getName();
            throw new NoSuchMethodError(String.format("no %s method with name='%s' signature='%s' in class L%s;", objArr));
        }
        return method;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyFinalize(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native Object nativeProxyInvoke(long j10, String str, Object[] objArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyLogJNIInvokeException(long j10);

    public static Object newProxyInstance(long j10, Class cls) {
        return newProxyInstance(j10, new Class[]{cls});
    }

    public static Object newProxyInstance(final long j10, final Class[] clsArr) {
        return Proxy.newProxyInstance(ReflectionHelper.class.getClassLoader(), clsArr, new b() { // from class: com.unity3d.player.ReflectionHelper.1

            /* renamed from: c  reason: collision with root package name */
            private long f28364c = ReflectionHelper.f28361b;

            /* renamed from: d  reason: collision with root package name */
            private long f28365d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f28366e;

            private Object a(Object obj, Method method, Object[] objArr) {
                if (objArr == null) {
                    try {
                        objArr = new Object[0];
                    } catch (NoClassDefFoundError unused) {
                        d.Log(6, String.format("Java interface default methods are only supported since Android Oreo", new Object[0]));
                        ReflectionHelper.nativeProxyLogJNIInvokeException(this.f28365d);
                        return null;
                    }
                }
                Class<?> declaringClass = method.getDeclaringClass();
                Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
                return ((MethodHandles.Lookup) declaredConstructor.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
            }

            @Override // com.unity3d.player.ReflectionHelper.b
            public final void a(long j11, boolean z10) {
                this.f28365d = j11;
                this.f28366e = z10;
            }

            public final void finalize() {
                try {
                    if (this.f28364c == ReflectionHelper.f28361b) {
                        ReflectionHelper.nativeProxyFinalize(j10);
                    }
                } finally {
                    super.finalize();
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
                if (r6 != 0) goto L13;
             */
            @Override // java.lang.reflect.InvocationHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) {
                /*
                    r5 = this;
                    long r0 = r5.f28364c
                    long r2 = com.unity3d.player.ReflectionHelper.a()
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r0 == 0) goto L12
                    r6 = 6
                    java.lang.String r7 = "Scripting proxy object was destroyed, because Unity player was unloaded."
                    com.unity3d.player.d.Log(r6, r7)
                    r6 = 0
                    return r6
                L12:
                    r0 = 0
                    r5.f28365d = r0
                    r2 = 0
                    r5.f28366e = r2
                    long r2 = r1
                    java.lang.String r4 = r7.getName()
                    java.lang.Object r2 = com.unity3d.player.ReflectionHelper.a(r2, r4, r8)
                    boolean r3 = r5.f28366e
                    if (r3 == 0) goto L37
                    int r0 = r7.getModifiers()
                    r0 = r0 & 1024(0x400, float:1.435E-42)
                    if (r0 != 0) goto L34
                    java.lang.Object r6 = r5.a(r6, r7, r8)
                    return r6
                L34:
                    long r6 = r5.f28365d
                    goto L3d
                L37:
                    long r6 = r5.f28365d
                    int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                    if (r8 == 0) goto L40
                L3d:
                    com.unity3d.player.ReflectionHelper.a(r6)
                L40:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.ReflectionHelper.AnonymousClass1.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
            }
        });
    }

    public static void setNativeExceptionOnProxy(Object obj, long j10, boolean z10) {
        ((b) Proxy.getInvocationHandler(obj)).a(j10, z10);
    }
}
