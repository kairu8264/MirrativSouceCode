package hi;

import com.google.android.gms.internal.measurement.zzjd;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class b8 extends k7 {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f35660b = Logger.getLogger(b8.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f35661c = fb.C();

    /* renamed from: a  reason: collision with root package name */
    public c8 f35662a;

    public b8() {
    }

    public /* synthetic */ b8(z7 z7Var) {
    }

    public static int A(d9 d9Var) {
        int a10 = d9Var.a();
        return a(a10) + a10;
    }

    public static int B(w9 w9Var, ha haVar) {
        e7 e7Var = (e7) w9Var;
        int a10 = e7Var.a();
        if (a10 == -1) {
            a10 = haVar.a(e7Var);
            e7Var.d(a10);
        }
        return a(a10) + a10;
    }

    public static int C(String str) {
        int length;
        try {
            length = kb.c(str);
        } catch (jb unused) {
            length = str.getBytes(b9.f35664b).length;
        }
        return a(length) + length;
    }

    public static int D(int i10) {
        return a(i10 << 3);
    }

    public static int a(int i10) {
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

    public static int b(long j10) {
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

    public static b8 c(byte[] bArr) {
        return new a8(bArr, 0, bArr.length);
    }

    public static int x(u7 u7Var) {
        int g10 = u7Var.g();
        return a(g10) + g10;
    }

    @Deprecated
    public static int y(int i10, w9 w9Var, ha haVar) {
        int a10 = a(i10 << 3);
        int i11 = a10 + a10;
        e7 e7Var = (e7) w9Var;
        int a11 = e7Var.a();
        if (a11 == -1) {
            a11 = haVar.a(e7Var);
            e7Var.d(a11);
        }
        return i11 + a11;
    }

    public static int z(int i10) {
        if (i10 >= 0) {
            return a(i10);
        }
        return 10;
    }

    public final void d() {
        if (g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void e(String str, jb jbVar) throws IOException {
        f35660b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) jbVar);
        byte[] bytes = str.getBytes(b9.f35664b);
        try {
            int length = bytes.length;
            u(length);
            q(bytes, 0, length);
        } catch (zzjd e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzjd(e11);
        }
    }

    public abstract int g();

    public abstract void h(byte b10) throws IOException;

    public abstract void i(int i10, boolean z10) throws IOException;

    public abstract void j(int i10, u7 u7Var) throws IOException;

    public abstract void k(int i10, int i11) throws IOException;

    public abstract void l(int i10) throws IOException;

    public abstract void m(int i10, long j10) throws IOException;

    public abstract void n(long j10) throws IOException;

    public abstract void o(int i10, int i11) throws IOException;

    public abstract void p(int i10) throws IOException;

    public abstract void q(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void r(int i10, String str) throws IOException;

    public abstract void s(int i10, int i11) throws IOException;

    public abstract void t(int i10, int i11) throws IOException;

    public abstract void u(int i10) throws IOException;

    public abstract void v(int i10, long j10) throws IOException;

    public abstract void w(long j10) throws IOException;
}
