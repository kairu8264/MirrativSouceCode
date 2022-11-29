package fn;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f32060a = B();

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f32061b = fn.a.b();

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f32062c = m(Long.TYPE);

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f32063d = m(Integer.TYPE);

    /* renamed from: e  reason: collision with root package name */
    public static final e f32064e = z();

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f32065f = Q();

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f32066g = P();

    /* renamed from: h  reason: collision with root package name */
    public static final long f32067h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f32068i;

    /* renamed from: j  reason: collision with root package name */
    public static final long f32069j;

    /* renamed from: k  reason: collision with root package name */
    public static final long f32070k;

    /* renamed from: l  reason: collision with root package name */
    public static final long f32071l;

    /* renamed from: m  reason: collision with root package name */
    public static final long f32072m;

    /* renamed from: n  reason: collision with root package name */
    public static final long f32073n;

    /* renamed from: o  reason: collision with root package name */
    public static final long f32074o;

    /* renamed from: p  reason: collision with root package name */
    public static final long f32075p;

    /* renamed from: q  reason: collision with root package name */
    public static final long f32076q;

    /* renamed from: r  reason: collision with root package name */
    public static final long f32077r;

    /* renamed from: s  reason: collision with root package name */
    public static final long f32078s;

    /* renamed from: t  reason: collision with root package name */
    public static final long f32079t;

    /* renamed from: u  reason: collision with root package name */
    public static final long f32080u;

    /* renamed from: v  reason: collision with root package name */
    public static final int f32081v;

    /* renamed from: w  reason: collision with root package name */
    public static final boolean f32082w;

    /* loaded from: classes4.dex */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Unsafe run() throws Exception {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // fn.b0.e
        public boolean c(Object obj, long j10) {
            return b0.f32082w ? b0.q(obj, j10) : b0.r(obj, j10);
        }

        @Override // fn.b0.e
        public byte d(Object obj, long j10) {
            return b0.f32082w ? b0.t(obj, j10) : b0.u(obj, j10);
        }

        @Override // fn.b0.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // fn.b0.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // fn.b0.e
        public void k(Object obj, long j10, boolean z10) {
            if (b0.f32082w) {
                b0.F(obj, j10, z10);
            } else {
                b0.G(obj, j10, z10);
            }
        }

        @Override // fn.b0.e
        public void l(Object obj, long j10, byte b10) {
            if (b0.f32082w) {
                b0.I(obj, j10, b10);
            } else {
                b0.J(obj, j10, b10);
            }
        }

        @Override // fn.b0.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // fn.b0.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // fn.b0.e
        public boolean c(Object obj, long j10) {
            return b0.f32082w ? b0.q(obj, j10) : b0.r(obj, j10);
        }

        @Override // fn.b0.e
        public byte d(Object obj, long j10) {
            return b0.f32082w ? b0.t(obj, j10) : b0.u(obj, j10);
        }

        @Override // fn.b0.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // fn.b0.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // fn.b0.e
        public void k(Object obj, long j10, boolean z10) {
            if (b0.f32082w) {
                b0.F(obj, j10, z10);
            } else {
                b0.G(obj, j10, z10);
            }
        }

        @Override // fn.b0.e
        public void l(Object obj, long j10, byte b10) {
            if (b0.f32082w) {
                b0.I(obj, j10, b10);
            } else {
                b0.J(obj, j10, b10);
            }
        }

        @Override // fn.b0.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // fn.b0.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // fn.b0.e
        public boolean c(Object obj, long j10) {
            return this.f32083a.getBoolean(obj, j10);
        }

        @Override // fn.b0.e
        public byte d(Object obj, long j10) {
            return this.f32083a.getByte(obj, j10);
        }

        @Override // fn.b0.e
        public double e(Object obj, long j10) {
            return this.f32083a.getDouble(obj, j10);
        }

        @Override // fn.b0.e
        public float f(Object obj, long j10) {
            return this.f32083a.getFloat(obj, j10);
        }

        @Override // fn.b0.e
        public void k(Object obj, long j10, boolean z10) {
            this.f32083a.putBoolean(obj, j10, z10);
        }

        @Override // fn.b0.e
        public void l(Object obj, long j10, byte b10) {
            this.f32083a.putByte(obj, j10, b10);
        }

        @Override // fn.b0.e
        public void m(Object obj, long j10, double d10) {
            this.f32083a.putDouble(obj, j10, d10);
        }

        @Override // fn.b0.e
        public void n(Object obj, long j10, float f10) {
            this.f32083a.putFloat(obj, j10, f10);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public Unsafe f32083a;

        public e(Unsafe unsafe) {
            this.f32083a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f32083a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f32083a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f32083a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f32083a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f32083a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f32083a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f32083a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f32083a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f32083a.putObject(obj, j10, obj2);
        }
    }

    static {
        long j10 = j(byte[].class);
        f32067h = j10;
        f32068i = j(boolean[].class);
        f32069j = k(boolean[].class);
        f32070k = j(int[].class);
        f32071l = k(int[].class);
        f32072m = j(long[].class);
        f32073n = k(long[].class);
        f32074o = j(float[].class);
        f32075p = k(float[].class);
        f32076q = j(double[].class);
        f32077r = k(double[].class);
        f32078s = j(Object[].class);
        f32079t = k(Object[].class);
        f32080u = o(l());
        f32081v = (int) (7 & j10);
        f32082w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object A(Object obj, long j10) {
        return f32064e.i(obj, j10);
    }

    public static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean C() {
        return f32066g;
    }

    public static boolean D() {
        return f32065f;
    }

    public static void E(Object obj, long j10, boolean z10) {
        f32064e.k(obj, j10, z10);
    }

    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void H(byte[] bArr, long j10, byte b10) {
        f32064e.l(bArr, f32067h + j10, b10);
    }

    public static void I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int x10 = x(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (x10 & (~(255 << i10))));
    }

    public static void J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (x(obj, j11) & (~(255 << i10))));
    }

    public static void K(Object obj, long j10, double d10) {
        f32064e.m(obj, j10, d10);
    }

    public static void L(Object obj, long j10, float f10) {
        f32064e.n(obj, j10, f10);
    }

    public static void M(Object obj, long j10, int i10) {
        f32064e.o(obj, j10, i10);
    }

    public static void N(Object obj, long j10, long j11) {
        f32064e.p(obj, j10, j11);
    }

    public static void O(Object obj, long j10, Object obj2) {
        f32064e.q(obj, j10, obj2);
    }

    public static boolean P() {
        Unsafe unsafe = f32060a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (fn.a.c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            Logger logger = Logger.getLogger(b0.class.getName());
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    public static boolean Q() {
        Unsafe unsafe = f32060a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (l() == null) {
                return false;
            }
            if (fn.a.c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th2) {
            Logger logger = Logger.getLogger(b0.class.getName());
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    public static <T> T i(Class<T> cls) {
        try {
            return (T) f32060a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int j(Class<?> cls) {
        if (f32066g) {
            return f32064e.a(cls);
        }
        return -1;
    }

    public static int k(Class<?> cls) {
        if (f32066g) {
            return f32064e.b(cls);
        }
        return -1;
    }

    public static Field l() {
        Field n10;
        if (!fn.a.c() || (n10 = n(Buffer.class, "effectiveDirectAddress")) == null) {
            Field n11 = n(Buffer.class, "address");
            if (n11 == null || n11.getType() != Long.TYPE) {
                return null;
            }
            return n11;
        }
        return n10;
    }

    public static boolean m(Class<?> cls) {
        if (fn.a.c()) {
            try {
                Class<?> cls2 = f32061b;
                Class<?> cls3 = Boolean.TYPE;
                cls2.getMethod("peekLong", cls, cls3);
                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
                Class<?> cls4 = Integer.TYPE;
                cls2.getMethod("pokeInt", cls, cls4, cls3);
                cls2.getMethod("peekInt", cls, cls3);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    public static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f32064e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    public static boolean p(Object obj, long j10) {
        return f32064e.c(obj, j10);
    }

    public static boolean q(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    public static boolean r(Object obj, long j10) {
        return u(obj, j10) != 0;
    }

    public static byte s(byte[] bArr, long j10) {
        return f32064e.d(bArr, f32067h + j10);
    }

    public static byte t(Object obj, long j10) {
        return (byte) ((x(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte u(Object obj, long j10) {
        return (byte) ((x(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static double v(Object obj, long j10) {
        return f32064e.e(obj, j10);
    }

    public static float w(Object obj, long j10) {
        return f32064e.f(obj, j10);
    }

    public static int x(Object obj, long j10) {
        return f32064e.g(obj, j10);
    }

    public static long y(Object obj, long j10) {
        return f32064e.h(obj, j10);
    }

    public static e z() {
        Unsafe unsafe = f32060a;
        if (unsafe == null) {
            return null;
        }
        if (fn.a.c()) {
            if (f32062c) {
                return new c(unsafe);
            }
            if (f32063d) {
                return new b(unsafe);
            }
            return null;
        }
        return new d(unsafe);
    }
}
