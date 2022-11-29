package zm;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes4.dex */
public abstract class m {

    /* loaded from: classes4.dex */
    public class a extends m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Method f63263a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f63264b;

        public a(Method method, Object obj) {
            this.f63263a = method;
            this.f63264b = obj;
        }

        @Override // zm.m
        public <T> T c(Class<T> cls) throws Exception {
            m.a(cls);
            return (T) this.f63263a.invoke(this.f63264b, cls);
        }
    }

    /* loaded from: classes4.dex */
    public class b extends m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Method f63265a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f63266b;

        public b(Method method, int i10) {
            this.f63265a = method;
            this.f63266b = i10;
        }

        @Override // zm.m
        public <T> T c(Class<T> cls) throws Exception {
            m.a(cls);
            return (T) this.f63265a.invoke(null, cls, Integer.valueOf(this.f63266b));
        }
    }

    /* loaded from: classes4.dex */
    public class c extends m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Method f63267a;

        public c(Method method) {
            this.f63267a = method;
        }

        @Override // zm.m
        public <T> T c(Class<T> cls) throws Exception {
            m.a(cls);
            return (T) this.f63267a.invoke(null, cls, Object.class);
        }
    }

    /* loaded from: classes4.dex */
    public class d extends m {
        @Override // zm.m
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    public static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (Modifier.isAbstract(modifiers)) {
                throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
            }
            return;
        }
        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
    }

    public static m b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new d();
            }
        }
    }

    public abstract <T> T c(Class<T> cls) throws Exception;
}
