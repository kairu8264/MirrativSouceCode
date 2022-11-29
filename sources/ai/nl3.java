package ai;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class nl3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f7394a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f7395b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f7396c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f7397d;

    /* renamed from: e  reason: collision with root package name */
    public static final ml3 f7398e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f7399f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f7400g;

    /* renamed from: h  reason: collision with root package name */
    public static final long f7401h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f7402i;

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f7403j;

    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0141  */
    static {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.nl3.<clinit>():void");
    }

    public static long A(ByteBuffer byteBuffer) {
        return f7398e.o(byteBuffer, f7402i);
    }

    public static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new jl3());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean C(Class<?> cls) {
        int i10 = zg3.f12988a;
        try {
            Class<?> cls2 = f7395b;
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

    public static /* synthetic */ boolean F(Object obj, long j10) {
        return ((byte) ((f7398e.m(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean G(Object obj, long j10) {
        return ((byte) ((f7398e.m(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ void b(Throwable th2) {
        Logger.getLogger(nl3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    public static int c(Class<?> cls) {
        if (f7400g) {
            return f7398e.k(cls);
        }
        return -1;
    }

    public static int d(Class<?> cls) {
        if (f7400g) {
            return f7398e.l(cls);
        }
        return -1;
    }

    public static Field e() {
        int i10 = zg3.f12988a;
        Field f10 = f(Buffer.class, "effectiveDirectAddress");
        if (f10 == null) {
            Field f11 = f(Buffer.class, "address");
            if (f11 == null || f11.getType() != Long.TYPE) {
                return null;
            }
            return f11;
        }
        return f10;
    }

    public static Field f(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void g(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        ml3 ml3Var = f7398e;
        int m10 = ml3Var.m(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        ml3Var.n(obj, j11, ((255 & b10) << i10) | (m10 & (~(255 << i10))));
    }

    public static void h(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        ml3 ml3Var = f7398e;
        int i10 = (((int) j10) & 3) << 3;
        ml3Var.n(obj, j11, ((255 & b10) << i10) | (ml3Var.m(obj, j11) & (~(255 << i10))));
    }

    public static boolean i() {
        return f7400g;
    }

    public static boolean j() {
        return f7399f;
    }

    public static <T> T k(Class<T> cls) {
        try {
            return (T) f7394a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int l(Object obj, long j10) {
        return f7398e.m(obj, j10);
    }

    public static void m(Object obj, long j10, int i10) {
        f7398e.n(obj, j10, i10);
    }

    public static long n(Object obj, long j10) {
        return f7398e.o(obj, j10);
    }

    public static void o(Object obj, long j10, long j11) {
        f7398e.p(obj, j10, j11);
    }

    public static boolean p(Object obj, long j10) {
        return f7398e.b(obj, j10);
    }

    public static void q(Object obj, long j10, boolean z10) {
        f7398e.c(obj, j10, z10);
    }

    public static float r(Object obj, long j10) {
        return f7398e.d(obj, j10);
    }

    public static void s(Object obj, long j10, float f10) {
        f7398e.e(obj, j10, f10);
    }

    public static double t(Object obj, long j10) {
        return f7398e.f(obj, j10);
    }

    public static void u(Object obj, long j10, double d10) {
        f7398e.g(obj, j10, d10);
    }

    public static Object v(Object obj, long j10) {
        return f7398e.q(obj, j10);
    }

    public static void w(Object obj, long j10, Object obj2) {
        f7398e.r(obj, j10, obj2);
    }

    public static void x(byte[] bArr, long j10, byte b10) {
        f7398e.a(bArr, f7401h + j10, b10);
    }

    public static void y(long j10, byte[] bArr, long j11, long j12) {
        f7398e.i(j10, bArr, j11, j12);
    }

    public static byte z(long j10) {
        return f7398e.h(j10);
    }
}
