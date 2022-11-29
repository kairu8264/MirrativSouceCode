package zo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import wn.l;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final int f63301a = f(Throwable.class, -1);

    /* renamed from: b  reason: collision with root package name */
    public static final j f63302b;

    /* loaded from: classes4.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return zn.a.c(Integer.valueOf(((Constructor) t11).getParameterTypes().length), Integer.valueOf(((Constructor) t10).getParameterTypes().length));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends jo.q implements io.l {

        /* renamed from: w  reason: collision with root package name */
        public static final b f63303w = new b();

        public b() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Void invoke(Throwable th2) {
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends jo.q implements io.l<Throwable, Throwable> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Constructor f63304w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f63304w = constructor;
        }

        @Override // io.l
        /* renamed from: a */
        public final Throwable invoke(Throwable th2) {
            Object a10;
            Object newInstance;
            try {
                l.a aVar = wn.l.f59224w;
                newInstance = this.f63304w.newInstance(th2.getMessage(), th2);
            } catch (Throwable th3) {
                l.a aVar2 = wn.l.f59224w;
                a10 = wn.l.a(wn.m.a(th3));
            }
            if (newInstance != null) {
                a10 = wn.l.a((Throwable) newInstance);
                if (wn.l.c(a10)) {
                    a10 = null;
                }
                return (Throwable) a10;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends jo.q implements io.l<Throwable, Throwable> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Constructor f63305w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f63305w = constructor;
        }

        @Override // io.l
        /* renamed from: a */
        public final Throwable invoke(Throwable th2) {
            Object a10;
            Object newInstance;
            try {
                l.a aVar = wn.l.f59224w;
                newInstance = this.f63305w.newInstance(th2);
            } catch (Throwable th3) {
                l.a aVar2 = wn.l.f59224w;
                a10 = wn.l.a(wn.m.a(th3));
            }
            if (newInstance != null) {
                a10 = wn.l.a((Throwable) newInstance);
                if (wn.l.c(a10)) {
                    a10 = null;
                }
                return (Throwable) a10;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends jo.q implements io.l<Throwable, Throwable> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Constructor f63306w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Constructor constructor) {
            super(1);
            this.f63306w = constructor;
        }

        @Override // io.l
        /* renamed from: a */
        public final Throwable invoke(Throwable th2) {
            Object a10;
            Object newInstance;
            try {
                l.a aVar = wn.l.f59224w;
                newInstance = this.f63306w.newInstance(th2.getMessage());
            } catch (Throwable th3) {
                l.a aVar2 = wn.l.f59224w;
                a10 = wn.l.a(wn.m.a(th3));
            }
            if (newInstance != null) {
                Throwable th4 = (Throwable) newInstance;
                th4.initCause(th2);
                a10 = wn.l.a(th4);
                if (wn.l.c(a10)) {
                    a10 = null;
                }
                return (Throwable) a10;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends jo.q implements io.l<Throwable, Throwable> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Constructor f63307w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Constructor constructor) {
            super(1);
            this.f63307w = constructor;
        }

        @Override // io.l
        /* renamed from: a */
        public final Throwable invoke(Throwable th2) {
            Object a10;
            Object newInstance;
            try {
                l.a aVar = wn.l.f59224w;
                newInstance = this.f63307w.newInstance(new Object[0]);
            } catch (Throwable th3) {
                l.a aVar2 = wn.l.f59224w;
                a10 = wn.l.a(wn.m.a(th3));
            }
            if (newInstance != null) {
                Throwable th4 = (Throwable) newInstance;
                th4.initCause(th2);
                a10 = wn.l.a(th4);
                if (wn.l.c(a10)) {
                    a10 = null;
                }
                return (Throwable) a10;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    static {
        j jVar;
        try {
            jVar = o.a() ? s0.f63326a : zo.e.f63284a;
        } catch (Throwable unused) {
            jVar = s0.f63326a;
        }
        f63302b = jVar;
    }

    public static final <E extends Throwable> io.l<Throwable, Throwable> b(Class<E> cls) {
        b bVar = b.f63303w;
        if (f63301a != f(cls, 0)) {
            return bVar;
        }
        for (Constructor constructor : xn.o.Z(cls.getConstructors(), new a())) {
            io.l<Throwable, Throwable> c10 = c(constructor);
            if (c10 != null) {
                return c10;
            }
        }
        return bVar;
    }

    public static final io.l<Throwable, Throwable> c(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2 && jo.p.c(parameterTypes[0], String.class) && jo.p.c(parameterTypes[1], Throwable.class)) {
                    return new c(constructor);
                }
                return null;
            }
            Class<?> cls = parameterTypes[0];
            if (jo.p.c(cls, Throwable.class)) {
                return new d(constructor);
            }
            if (jo.p.c(cls, String.class)) {
                return new e(constructor);
            }
            return null;
        }
        return new f(constructor);
    }

    public static final int d(Class<?> cls, int i10) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                Field field = declaredFields[i11];
                i11++;
                if (!Modifier.isStatic(field.getModifiers())) {
                    i12++;
                }
            }
            i10 += i12;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i10;
    }

    public static /* synthetic */ int e(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return d(cls, i10);
    }

    public static final int f(Class<?> cls, int i10) {
        Integer a10;
        ho.a.c(cls);
        try {
            l.a aVar = wn.l.f59224w;
            a10 = wn.l.a(Integer.valueOf(e(cls, 0, 1, null)));
        } catch (Throwable th2) {
            l.a aVar2 = wn.l.f59224w;
            a10 = wn.l.a(wn.m.a(th2));
        }
        Integer valueOf = Integer.valueOf(i10);
        if (wn.l.c(a10)) {
            a10 = valueOf;
        }
        return ((Number) a10).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E g(E e10) {
        Object a10;
        if (e10 instanceof uo.i0) {
            try {
                l.a aVar = wn.l.f59224w;
                a10 = wn.l.a(((uo.i0) e10).a());
            } catch (Throwable th2) {
                l.a aVar2 = wn.l.f59224w;
                a10 = wn.l.a(wn.m.a(th2));
            }
            if (wn.l.c(a10)) {
                a10 = null;
            }
            return (E) a10;
        }
        return (E) f63302b.a(e10.getClass()).invoke(e10);
    }
}
