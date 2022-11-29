package hi;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class cb extends eb {
    public cb(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // hi.eb
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(k(obj, j10));
    }

    @Override // hi.eb
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(j(obj, j10));
    }

    @Override // hi.eb
    public final void c(Object obj, long j10, boolean z10) {
        if (fb.f35769i) {
            fb.d(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            fb.e(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // hi.eb
    public final void d(Object obj, long j10, byte b10) {
        if (fb.f35769i) {
            fb.d(obj, j10, b10);
        } else {
            fb.e(obj, j10, b10);
        }
    }

    @Override // hi.eb
    public final void e(Object obj, long j10, double d10) {
        o(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // hi.eb
    public final void f(Object obj, long j10, float f10) {
        n(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // hi.eb
    public final boolean g(Object obj, long j10) {
        if (fb.f35769i) {
            return fb.y(obj, j10);
        }
        return fb.z(obj, j10);
    }
}
