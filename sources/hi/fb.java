package hi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class fb {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f35761a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f35762b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f35763c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f35764d;

    /* renamed from: e  reason: collision with root package name */
    public static final eb f35765e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f35766f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f35767g;

    /* renamed from: h  reason: collision with root package name */
    public static final long f35768h;

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f35769i;

    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013b  */
    static {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hi.fb.<clinit>():void");
    }

    public static boolean A(Class<?> cls) {
        int i10 = g7.f35783a;
        try {
            Class<?> cls2 = f35762b;
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

    public static boolean B(Object obj, long j10) {
        return f35765e.g(obj, j10);
    }

    public static boolean C() {
        return f35767g;
    }

    public static boolean D() {
        return f35766f;
    }

    public static int E(Class<?> cls) {
        if (f35767g) {
            return f35765e.h(cls);
        }
        return -1;
    }

    public static int a(Class<?> cls) {
        if (f35767g) {
            return f35765e.i(cls);
        }
        return -1;
    }

    public static Field b() {
        int i10 = g7.f35783a;
        Field c10 = c(Buffer.class, "effectiveDirectAddress");
        if (c10 == null) {
            Field c11 = c(Buffer.class, "address");
            if (c11 == null || c11.getType() != Long.TYPE) {
                return null;
            }
            return c11;
        }
        return c10;
    }

    public static Field c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        eb ebVar = f35765e;
        int j12 = ebVar.j(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        ebVar.n(obj, j11, ((255 & b10) << i10) | (j12 & (~(255 << i10))));
    }

    public static void e(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        eb ebVar = f35765e;
        int i10 = (((int) j10) & 3) << 3;
        ebVar.n(obj, j11, ((255 & b10) << i10) | (ebVar.j(obj, j11) & (~(255 << i10))));
    }

    public static double f(Object obj, long j10) {
        return f35765e.a(obj, j10);
    }

    public static float g(Object obj, long j10) {
        return f35765e.b(obj, j10);
    }

    public static int h(Object obj, long j10) {
        return f35765e.j(obj, j10);
    }

    public static long i(Object obj, long j10) {
        return f35765e.k(obj, j10);
    }

    public static <T> T j(Class<T> cls) {
        try {
            return (T) f35761a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object k(Object obj, long j10) {
        return f35765e.m(obj, j10);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new bb());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void m(Throwable th2) {
        Logger.getLogger(fb.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    public static void r(Object obj, long j10, boolean z10) {
        f35765e.c(obj, j10, z10);
    }

    public static void s(byte[] bArr, long j10, byte b10) {
        f35765e.d(bArr, f35768h + j10, b10);
    }

    public static void t(Object obj, long j10, double d10) {
        f35765e.e(obj, j10, d10);
    }

    public static void u(Object obj, long j10, float f10) {
        f35765e.f(obj, j10, f10);
    }

    public static void v(Object obj, long j10, int i10) {
        f35765e.n(obj, j10, i10);
    }

    public static void w(Object obj, long j10, long j11) {
        f35765e.o(obj, j10, j11);
    }

    public static void x(Object obj, long j10, Object obj2) {
        f35765e.p(obj, j10, obj2);
    }

    public static /* synthetic */ boolean y(Object obj, long j10) {
        return ((byte) ((f35765e.j(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f35765e.j(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
