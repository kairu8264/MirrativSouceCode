package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class dl3<T, B> {
    public abstract boolean a(ik3 ik3Var);

    public abstract void b(B b10, int i10, long j10);

    public abstract void c(B b10, int i10, int i11);

    public abstract void d(B b10, int i10, long j10);

    public abstract void e(B b10, int i10, oh3 oh3Var);

    public abstract void f(B b10, int i10, T t10);

    public abstract B g();

    public abstract T h(B b10);

    public abstract void i(Object obj, T t10);

    public abstract T j(Object obj);

    public abstract B k(Object obj);

    public abstract void l(Object obj, B b10);

    public abstract void m(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n(B b10, ik3 ik3Var) throws IOException {
        int b11 = ik3Var.b();
        int i10 = b11 >>> 3;
        int i11 = b11 & 7;
        if (i11 == 0) {
            b(b10, i10, ik3Var.e());
            return true;
        } else if (i11 == 1) {
            d(b10, i10, ik3Var.g());
            return true;
        } else if (i11 == 2) {
            e(b10, i10, ik3Var.l());
            return true;
        } else if (i11 != 3) {
            if (i11 != 4) {
                if (i11 == 5) {
                    c(b10, i10, ik3Var.i());
                    return true;
                }
                throw zzggm.i();
            }
            return false;
        } else {
            Object g10 = g();
            int i12 = 4 | (i10 << 3);
            while (ik3Var.zzb() != Integer.MAX_VALUE && n(g10, ik3Var)) {
            }
            if (i12 == ik3Var.b()) {
                h(g10);
                f(b10, i10, g10);
                return true;
            }
            throw zzggm.h();
        }
    }

    public abstract T o(T t10, T t11);

    public abstract int p(T t10);

    public abstract int q(T t10);

    public abstract void r(T t10, zh3 zh3Var) throws IOException;
}
