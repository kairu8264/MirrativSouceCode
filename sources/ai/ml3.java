package ai;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class ml3 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f6974a;

    public ml3(Unsafe unsafe) {
        this.f6974a = unsafe;
    }

    public abstract void a(Object obj, long j10, byte b10);

    public abstract boolean b(Object obj, long j10);

    public abstract void c(Object obj, long j10, boolean z10);

    public abstract float d(Object obj, long j10);

    public abstract void e(Object obj, long j10, float f10);

    public abstract double f(Object obj, long j10);

    public abstract void g(Object obj, long j10, double d10);

    public abstract byte h(long j10);

    public abstract void i(long j10, byte[] bArr, long j11, long j12);

    public final long j(Field field) {
        return this.f6974a.objectFieldOffset(field);
    }

    public final int k(Class<?> cls) {
        return this.f6974a.arrayBaseOffset(cls);
    }

    public final int l(Class<?> cls) {
        return this.f6974a.arrayIndexScale(cls);
    }

    public final int m(Object obj, long j10) {
        return this.f6974a.getInt(obj, j10);
    }

    public final void n(Object obj, long j10, int i10) {
        this.f6974a.putInt(obj, j10, i10);
    }

    public final long o(Object obj, long j10) {
        return this.f6974a.getLong(obj, j10);
    }

    public final void p(Object obj, long j10, long j11) {
        this.f6974a.putLong(obj, j10, j11);
    }

    public final Object q(Object obj, long j10) {
        return this.f6974a.getObject(obj, j10);
    }

    public final void r(Object obj, long j10, Object obj2) {
        this.f6974a.putObject(obj, j10, obj2);
    }
}
