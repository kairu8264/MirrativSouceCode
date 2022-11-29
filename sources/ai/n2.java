package ai;

import android.util.Pair;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class n2 extends q7 {

    /* renamed from: c  reason: collision with root package name */
    public final int f7154c;

    /* renamed from: d  reason: collision with root package name */
    public final tq3 f7155d;

    public n2(boolean z10, tq3 tq3Var, byte[] bArr) {
        this.f7155d = tq3Var;
        this.f7154c = tq3Var.a();
    }

    @Override // ai.q7
    public final int b(int i10, int i11, boolean z10) {
        int q10 = q(i10);
        int u10 = u(q10);
        int b10 = s(q10).b(i10 - u10, i11 == 2 ? 0 : i11, z10);
        if (b10 != -1) {
            return u10 + b10;
        }
        int w10 = w(q10, z10);
        while (w10 != -1 && s(w10).k()) {
            w10 = w(w10, z10);
        }
        if (w10 != -1) {
            return u(w10) + s(w10).e(z10);
        }
        if (i11 == 2) {
            return e(z10);
        }
        return -1;
    }

    @Override // ai.q7
    public final int c(int i10, int i11, boolean z10) {
        int q10 = q(i10);
        int u10 = u(q10);
        int c10 = s(q10).c(i10 - u10, 0, false);
        if (c10 != -1) {
            return u10 + c10;
        }
        int x10 = x(q10, false);
        while (x10 != -1 && s(x10).k()) {
            x10 = x(x10, false);
        }
        if (x10 != -1) {
            return u(x10) + s(x10).d(false);
        }
        return -1;
    }

    @Override // ai.q7
    public final int d(boolean z10) {
        int i10 = this.f7154c;
        if (i10 == 0) {
            return -1;
        }
        int d10 = z10 ? this.f7155d.d() : i10 - 1;
        while (s(d10).k()) {
            d10 = x(d10, z10);
            if (d10 == -1) {
                return -1;
            }
        }
        return u(d10) + s(d10).d(z10);
    }

    @Override // ai.q7
    public final int e(boolean z10) {
        if (this.f7154c == 0) {
            return -1;
        }
        int e10 = z10 ? this.f7155d.e() : 0;
        while (s(e10).k()) {
            e10 = w(e10, z10);
            if (e10 == -1) {
                return -1;
            }
        }
        return u(e10) + s(e10).e(z10);
    }

    @Override // ai.q7
    public final p7 f(int i10, p7 p7Var, long j10) {
        int q10 = q(i10);
        int u10 = u(q10);
        int t10 = t(q10);
        s(q10).f(i10 - u10, p7Var, j10);
        Object v10 = v(q10);
        if (!p7.f8322o.equals(p7Var.f8326a)) {
            v10 = Pair.create(v10, p7Var.f8326a);
        }
        p7Var.f8326a = v10;
        p7Var.f8338m += t10;
        p7Var.f8339n += t10;
        return p7Var;
    }

    @Override // ai.q7
    public final n7 h(int i10, n7 n7Var, boolean z10) {
        int p10 = p(i10);
        int u10 = u(p10);
        s(p10).h(i10 - t(p10), n7Var, z10);
        n7Var.f7216c += u10;
        if (z10) {
            Object v10 = v(p10);
            Object obj = n7Var.f7215b;
            Objects.requireNonNull(obj);
            n7Var.f7215b = Pair.create(v10, obj);
        }
        return n7Var;
    }

    @Override // ai.q7
    public final int i(Object obj) {
        int i10;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int r10 = r(obj2);
            if (r10 == -1 || (i10 = s(r10).i(obj3)) == -1) {
                return -1;
            }
            return t(r10) + i10;
        }
        return -1;
    }

    @Override // ai.q7
    public final Object j(int i10) {
        int p10 = p(i10);
        return Pair.create(v(p10), s(p10).j(i10 - t(p10)));
    }

    @Override // ai.q7
    public final n7 o(Object obj, n7 n7Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int r10 = r(obj2);
        int u10 = u(r10);
        s(r10).o(obj3, n7Var);
        n7Var.f7216c += u10;
        n7Var.f7215b = obj;
        return n7Var;
    }

    public abstract int p(int i10);

    public abstract int q(int i10);

    public abstract int r(Object obj);

    public abstract q7 s(int i10);

    public abstract int t(int i10);

    public abstract int u(int i10);

    public abstract Object v(int i10);

    public final int w(int i10, boolean z10) {
        if (z10) {
            return this.f7155d.b(i10);
        }
        if (i10 >= this.f7154c - 1) {
            return -1;
        }
        return i10 + 1;
    }

    public final int x(int i10, boolean z10) {
        if (z10) {
            return this.f7155d.c(i10);
        }
        if (i10 <= 0) {
            return -1;
        }
        return i10 - 1;
    }
}
