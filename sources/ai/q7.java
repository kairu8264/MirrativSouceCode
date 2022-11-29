package ai;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class q7 {

    /* renamed from: a  reason: collision with root package name */
    public static final q7 f8842a = new l7();

    /* renamed from: b  reason: collision with root package name */
    public static final x2<q7> f8843b = k7.f6105a;

    public abstract int a();

    public int b(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == d(z10)) {
                return -1;
            }
            return i10 + 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                return i10 == d(z10) ? e(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public int c(int i10, int i11, boolean z10) {
        if (i10 == e(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public int d(boolean z10) {
        if (k()) {
            return -1;
        }
        return a() - 1;
    }

    public int e(boolean z10) {
        return k() ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q7) {
            q7 q7Var = (q7) obj;
            if (q7Var.a() == a() && q7Var.g() == g()) {
                p7 p7Var = new p7();
                n7 n7Var = new n7();
                p7 p7Var2 = new p7();
                n7 n7Var2 = new n7();
                for (int i10 = 0; i10 < a(); i10++) {
                    if (!f(i10, p7Var, 0L).equals(q7Var.f(i10, p7Var2, 0L))) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < g(); i11++) {
                    if (!h(i11, n7Var, true).equals(q7Var.h(i11, n7Var2, true))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public abstract p7 f(int i10, p7 p7Var, long j10);

    public abstract int g();

    public abstract n7 h(int i10, n7 n7Var, boolean z10);

    public final int hashCode() {
        p7 p7Var = new p7();
        n7 n7Var = new n7();
        int a10 = a() + 217;
        for (int i10 = 0; i10 < a(); i10++) {
            a10 = (a10 * 31) + f(i10, p7Var, 0L).hashCode();
        }
        int g10 = (a10 * 31) + g();
        for (int i11 = 0; i11 < g(); i11++) {
            g10 = (g10 * 31) + h(i11, n7Var, true).hashCode();
        }
        return g10;
    }

    public abstract int i(Object obj);

    public abstract Object j(int i10);

    public final boolean k() {
        return a() == 0;
    }

    public final int l(int i10, n7 n7Var, p7 p7Var, int i11, boolean z10) {
        int i12 = h(i10, n7Var, false).f7216c;
        if (f(i12, p7Var, 0L).f8339n == i10) {
            int b10 = b(i12, i11, z10);
            if (b10 == -1) {
                return -1;
            }
            return f(b10, p7Var, 0L).f8338m;
        }
        return i10 + 1;
    }

    public final Pair<Object, Long> m(p7 p7Var, n7 n7Var, int i10, long j10) {
        Pair<Object, Long> n10 = n(p7Var, n7Var, i10, j10, 0L);
        Objects.requireNonNull(n10);
        return n10;
    }

    public final Pair<Object, Long> n(p7 p7Var, n7 n7Var, int i10, long j10, long j11) {
        u9.c(i10, 0, a());
        f(i10, p7Var, j11);
        if (j10 == C.TIME_UNSET) {
            long j12 = p7Var.f8336k;
            j10 = 0;
        }
        int i11 = p7Var.f8338m;
        h(i11, n7Var, false);
        while (i11 < p7Var.f8339n) {
            long j13 = n7Var.f7218e;
            int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i12 == 0) {
                break;
            }
            int i13 = i11 + 1;
            long j14 = h(i13, n7Var, false).f7218e;
            if (i12 < 0) {
                break;
            }
            i11 = i13;
        }
        h(i11, n7Var, true);
        long j15 = n7Var.f7218e;
        long j16 = n7Var.f7217d;
        if (j16 != C.TIME_UNSET) {
            j10 = Math.min(j10, j16 - 1);
        }
        long max = Math.max(0L, j10);
        if (max == 9) {
            Log.e("XXX", "YYY");
        }
        Object obj = n7Var.f7215b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    public n7 o(Object obj, n7 n7Var) {
        return h(i(obj), n7Var, true);
    }
}
