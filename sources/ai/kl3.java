package ai;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class kl3 extends ml3 {
    public kl3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // ai.ml3
    public final void a(Object obj, long j10, byte b10) {
        if (nl3.f7403j) {
            nl3.g(obj, j10, b10);
        } else {
            nl3.h(obj, j10, b10);
        }
    }

    @Override // ai.ml3
    public final boolean b(Object obj, long j10) {
        if (nl3.f7403j) {
            return nl3.F(obj, j10);
        }
        return nl3.G(obj, j10);
    }

    @Override // ai.ml3
    public final void c(Object obj, long j10, boolean z10) {
        if (nl3.f7403j) {
            nl3.g(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            nl3.h(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // ai.ml3
    public final float d(Object obj, long j10) {
        return Float.intBitsToFloat(m(obj, j10));
    }

    @Override // ai.ml3
    public final void e(Object obj, long j10, float f10) {
        n(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // ai.ml3
    public final double f(Object obj, long j10) {
        return Double.longBitsToDouble(o(obj, j10));
    }

    @Override // ai.ml3
    public final void g(Object obj, long j10, double d10) {
        p(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // ai.ml3
    public final byte h(long j10) {
        return Memory.peekByte((int) j10);
    }

    @Override // ai.ml3
    public final void i(long j10, byte[] bArr, long j11, long j12) {
        Memory.peekByteArray((int) j10, bArr, (int) j11, (int) j12);
    }
}
