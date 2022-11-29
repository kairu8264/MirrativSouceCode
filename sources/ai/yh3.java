package ai;

import com.google.android.gms.internal.ads.zzgfg;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class yh3 extends dh3 {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f12603b = Logger.getLogger(yh3.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f12604c = nl3.i();

    /* renamed from: a  reason: collision with root package name */
    public zh3 f12605a;

    public yh3() {
    }

    public /* synthetic */ yh3(xh3 xh3Var) {
    }

    public static int A(int i10) {
        if (i10 >= 0) {
            return B(i10);
        }
        return 10;
    }

    public static int B(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int C(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int D(String str) {
        int length;
        try {
            length = sl3.g(str);
        } catch (rl3 unused) {
            length = str.getBytes(bj3.f2374a).length;
        }
        return B(length) + length;
    }

    public static int a(ej3 ej3Var) {
        int a10 = ej3Var.a();
        return B(a10) + a10;
    }

    public static int b(oh3 oh3Var) {
        int p10 = oh3Var.p();
        return B(p10) + p10;
    }

    public static int c(xj3 xj3Var, ok3 ok3Var) {
        xg3 xg3Var = (xg3) xj3Var;
        int a10 = xg3Var.a();
        if (a10 == -1) {
            a10 = ok3Var.g(xg3Var);
            xg3Var.d(a10);
        }
        return B(a10) + a10;
    }

    @Deprecated
    public static int f(int i10, xj3 xj3Var, ok3 ok3Var) {
        int B = B(i10 << 3);
        int i11 = B + B;
        xg3 xg3Var = (xg3) xj3Var;
        int a10 = xg3Var.a();
        if (a10 == -1) {
            a10 = ok3Var.g(xg3Var);
            xg3Var.d(a10);
        }
        return i11 + a10;
    }

    public static yh3 y(byte[] bArr) {
        return new wh3(bArr, 0, bArr.length);
    }

    public static int z(int i10) {
        return B(i10 << 3);
    }

    public final void d() {
        if (w() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void e(String str, rl3 rl3Var) throws IOException {
        f12603b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) rl3Var);
        byte[] bytes = str.getBytes(bj3.f2374a);
        try {
            int length = bytes.length;
            r(length);
            v(bytes, 0, length);
        } catch (zzgfg e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgfg(e11);
        }
    }

    public abstract void g(int i10, int i11) throws IOException;

    public abstract void h(int i10, int i11) throws IOException;

    public abstract void i(int i10, int i11) throws IOException;

    public abstract void j(int i10, int i11) throws IOException;

    public abstract void k(int i10, long j10) throws IOException;

    public abstract void l(int i10, long j10) throws IOException;

    public abstract void m(int i10, boolean z10) throws IOException;

    public abstract void n(int i10, String str) throws IOException;

    public abstract void o(int i10, oh3 oh3Var) throws IOException;

    public abstract void p(byte b10) throws IOException;

    public abstract void q(int i10) throws IOException;

    public abstract void r(int i10) throws IOException;

    public abstract void s(int i10) throws IOException;

    public abstract void t(long j10) throws IOException;

    public abstract void u(long j10) throws IOException;

    public abstract void v(byte[] bArr, int i10, int i11) throws IOException;

    public abstract int w();
}
