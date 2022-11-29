package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class vh3 implements ik3 {

    /* renamed from: a  reason: collision with root package name */
    public final uh3 f11089a;

    /* renamed from: b  reason: collision with root package name */
    public int f11090b;

    /* renamed from: c  reason: collision with root package name */
    public int f11091c;

    /* renamed from: d  reason: collision with root package name */
    public int f11092d = 0;

    public vh3(uh3 uh3Var) {
        bj3.b(uh3Var, "input");
        this.f11089a = uh3Var;
        uh3Var.f10716c = this;
    }

    public static final void R(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw zzggm.k();
        }
    }

    public static final void S(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw zzggm.k();
        }
    }

    public static vh3 T(uh3 uh3Var) {
        vh3 vh3Var = uh3Var.f10716c;
        return vh3Var != null ? vh3Var : new vh3(uh3Var);
    }

    @Override // ai.ik3
    public final void A(List<Long> list) throws IOException {
        int g10;
        int g11;
        if (list instanceof lj3) {
            lj3 lj3Var = (lj3) list;
            int i10 = this.f11090b & 7;
            if (i10 == 1) {
                do {
                    lj3Var.j(this.f11089a.o());
                    if (this.f11089a.b()) {
                        return;
                    }
                    g11 = this.f11089a.g();
                } while (g11 == this.f11090b);
                this.f11092d = g11;
                return;
            } else if (i10 == 2) {
                int u10 = this.f11089a.u();
                S(u10);
                int c10 = this.f11089a.c() + u10;
                do {
                    lj3Var.j(this.f11089a.o());
                } while (this.f11089a.c() < c10);
                return;
            } else {
                throw zzggm.i();
            }
        }
        int i11 = this.f11090b & 7;
        if (i11 == 1) {
            do {
                list.add(Long.valueOf(this.f11089a.o()));
                if (this.f11089a.b()) {
                    return;
                }
                g10 = this.f11089a.g();
            } while (g10 == this.f11090b);
            this.f11092d = g10;
        } else if (i11 == 2) {
            int u11 = this.f11089a.u();
            S(u11);
            int c11 = this.f11089a.c() + u11;
            do {
                list.add(Long.valueOf(this.f11089a.o()));
            } while (this.f11089a.c() < c11);
        } else {
            throw zzggm.i();
        }
    }

    @Override // ai.ik3
    public final void B(List<Integer> list) throws IOException {
        int g10;
        int g11;
        if (list instanceof si3) {
            si3 si3Var = (si3) list;
            int i10 = this.f11090b & 7;
            if (i10 == 0) {
                do {
                    si3Var.c0(this.f11089a.n());
                    if (this.f11089a.b()) {
                        return;
                    }
                    g11 = this.f11089a.g();
                } while (g11 == this.f11090b);
                this.f11092d = g11;
                return;
            } else if (i10 == 2) {
                int c10 = this.f11089a.c() + this.f11089a.u();
                do {
                    si3Var.c0(this.f11089a.n());
                } while (this.f11089a.c() < c10);
                Q(c10);
                return;
            } else {
                throw zzggm.i();
            }
        }
        int i11 = this.f11090b & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.f11089a.n()));
                if (this.f11089a.b()) {
                    return;
                }
                g10 = this.f11089a.g();
            } while (g10 == this.f11090b);
            this.f11092d = g10;
        } else if (i11 == 2) {
            int c11 = this.f11089a.c() + this.f11089a.u();
            do {
                list.add(Integer.valueOf(this.f11089a.n()));
            } while (this.f11089a.c() < c11);
            Q(c11);
        } else {
            throw zzggm.i();
        }
    }

    @Override // ai.ik3
    public final int C() throws IOException {
        N(0);
        return this.f11089a.y();
    }

    @Override // ai.ik3
    public final void D(List<Integer> list) throws IOException {
        int g10;
        int g11;
        if (list instanceof si3) {
            si3 si3Var = (si3) list;
            int i10 = this.f11090b & 7;
            if (i10 == 0) {
                do {
                    si3Var.c0(this.f11089a.y());
                    if (this.f11089a.b()) {
                        return;
                    }
                    g11 = this.f11089a.g();
                } while (g11 == this.f11090b);
                this.f11092d = g11;
                return;
            } else if (i10 == 2) {
                int c10 = this.f11089a.c() + this.f11089a.u();
                do {
                    si3Var.c0(this.f11089a.y());
                } while (this.f11089a.c() < c10);
                Q(c10);
                return;
            } else {
                throw zzggm.i();
            }
        }
        int i11 = this.f11090b & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.f11089a.y()));
                if (this.f11089a.b()) {
                    return;
                }
                g10 = this.f11089a.g();
            } while (g10 == this.f11090b);
            this.f11092d = g10;
        } else if (i11 == 2) {
            int c11 = this.f11089a.c() + this.f11089a.u();
            do {
                list.add(Integer.valueOf(this.f11089a.y()));
            } while (this.f11089a.c() < c11);
            Q(c11);
        } else {
            throw zzggm.i();
        }
    }

    @Override // ai.ik3
    public final void E(List<Long> list) throws IOException {
        int g10;
        int g11;
        if (list instanceof lj3) {
            lj3 lj3Var = (lj3) list;
            int i10 = this.f11090b & 7;
            if (i10 == 1) {
                do {
                    lj3Var.j(this.f11089a.x());
                    if (this.f11089a.b()) {
                        return;
                    }
                    g11 = this.f11089a.g();
                } while (g11 == this.f11090b);
                this.f11092d = g11;
                return;
            } else if (i10 == 2) {
                int u10 = this.f11089a.u();
                S(u10);
                int c10 = this.f11089a.c() + u10;
                do {
                    lj3Var.j(this.f11089a.x());
                } while (this.f11089a.c() < c10);
                return;
            } else {
                throw zzggm.i();
            }
        }
        int i11 = this.f11090b & 7;
        if (i11 == 1) {
            do {
                list.add(Long.valueOf(this.f11089a.x()));
                if (this.f11089a.b()) {
                    return;
                }
                g10 = this.f11089a.g();
            } while (g10 == this.f11090b);
            this.f11092d = g10;
        } else if (i11 == 2) {
            int u11 = this.f11089a.u();
            S(u11);
            int c11 = this.f11089a.c() + u11;
            do {
                list.add(Long.valueOf(this.f11089a.x()));
            } while (this.f11089a.c() < c11);
        } else {
            throw zzggm.i();
        }
    }

    @Override // ai.ik3
    public final void F(List<Long> list) throws IOException {
        int g10;
        int g11;
        if (list instanceof lj3) {
            lj3 lj3Var = (lj3) list;
            int i10 = this.f11090b & 7;
            if (i10 == 0) {
                do {
                    lj3Var.j(this.f11089a.z());
                    if (this.f11089a.b()) {
                        return;
                    }
                    g11 = this.f11089a.g();
                } while (g11 == this.f11090b);
                this.f11092d = g11;
                return;
            } else if (i10 == 2) {
                int c10 = this.f11089a.c() + this.f11089a.u();
                do {
                    lj3Var.j(this.f11089a.z());
                } while (this.f11089a.c() < c10);
                Q(c10);
                return;
            } else {
                throw zzggm.i();
            }
        }
        int i11 = this.f11090b & 7;
        if (i11 == 0) {
            do {
                list.add(Long.valueOf(this.f11089a.z()));
                if (this.f11089a.b()) {
                    return;
                }
                g10 = this.f11089a.g();
            } while (g10 == this.f11090b);
            this.f11092d = g10;
        } else if (i11 == 2) {
            int c11 = this.f11089a.c() + this.f11089a.u();
            do {
                list.add(Long.valueOf(this.f11089a.z()));
            } while (this.f11089a.c() < c11);
            Q(c11);
        } else {
            throw zzggm.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ai.ik3
    public final <T> void G(List<T> list, ok3<T> ok3Var, di3 di3Var) throws IOException {
        int g10;
        int i10 = this.f11090b;
        if ((i10 & 7) != 3) {
            throw zzggm.i();
        }
        do {
            list.add(P(ok3Var, di3Var));
            if (this.f11089a.b() || this.f11092d != 0) {
                return;
            }
            g10 = this.f11089a.g();
        } while (g10 == i10);
        this.f11092d = g10;
    }

    @Override // ai.ik3
    public final void H(List<Integer> list) throws IOException {
        int g10;
        int g11;
        if (list instanceof si3) {
            si3 si3Var = (si3) list;
            int i10 = this.f11090b & 7;
            if (i10 == 0) {
                do {
                    si3Var.c0(this.f11089a.u());
                    if (this.f11089a.b()) {
                        return;
                    }
                    g11 = this.f11089a.g();
                } while (g11 == this.f11090b);
                this.f11092d = g11;
                return;
            } else if (i10 == 2) {
                int c10 = this.f11089a.c() + this.f11089a.u();
                do {
                    si3Var.c0(this.f11089a.u());
                } while (this.f11089a.c() < c10);
                Q(c10);
                return;
            } else {
                throw zzggm.i();
            }
        }
        int i11 = this.f11090b & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.f11089a.u()));
                if (this.f11089a.b()) {
                    return;
                }
                g10 = this.f11089a.g();
            } while (g10 == this.f11090b);
            this.f11092d = g10;
        } else if (i11 == 2) {
            int c11 = this.f11089a.c() + this.f11089a.u();
            do {
                list.add(Integer.valueOf(this.f11089a.u()));
            } while (this.f11089a.c() < c11);
            Q(c11);
        } else {
            throw zzggm.i();
        }
    }

    @Override // ai.ik3
    public final void I(List<oh3> list) throws IOException {
        int g10;
        if ((this.f11090b & 7) != 2) {
            throw zzggm.i();
        }
        do {
            list.add(l());
            if (this.f11089a.b()) {
                return;
            }
            g10 = this.f11089a.g();
        } while (g10 == this.f11090b);
        this.f11092d = g10;
    }

    @Override // ai.ik3
    public final long J() throws IOException {
        N(0);
        return this.f11089a.z();
    }

    @Override // ai.ik3
    public final void K(List<Integer> list) throws IOException {
        int g10;
        int g11;
        if (!(list instanceof si3)) {
            int i10 = this.f11090b & 7;
            if (i10 == 2) {
                int u10 = this.f11089a.u();
                R(u10);
                int c10 = this.f11089a.c() + u10;
                do {
                    list.add(Integer.valueOf(this.f11089a.w()));
                } while (this.f11089a.c() < c10);
                return;
            } else if (i10 != 5) {
                throw zzggm.i();
            } else {
                do {
                    list.add(Integer.valueOf(this.f11089a.w()));
                    if (this.f11089a.b()) {
                        return;
                    }
                    g10 = this.f11089a.g();
                } while (g10 == this.f11090b);
                this.f11092d = g10;
                return;
            }
        }
        si3 si3Var = (si3) list;
        int i11 = this.f11090b & 7;
        if (i11 == 2) {
            int u11 = this.f11089a.u();
            R(u11);
            int c11 = this.f11089a.c() + u11;
            do {
                si3Var.c0(this.f11089a.w());
            } while (this.f11089a.c() < c11);
        } else if (i11 != 5) {
            throw zzggm.i();
        } else {
            do {
                si3Var.c0(this.f11089a.w());
                if (this.f11089a.b()) {
                    return;
                }
                g11 = this.f11089a.g();
            } while (g11 == this.f11090b);
            this.f11092d = g11;
        }
    }

    @Override // ai.ik3
    public final void L(List<Integer> list) throws IOException {
        int g10;
        int g11;
        if (list instanceof si3) {
            si3 si3Var = (si3) list;
            int i10 = this.f11090b & 7;
            if (i10 == 0) {
                do {
                    si3Var.c0(this.f11089a.v());
                    if (this.f11089a.b()) {
                        return;
                    }
                    g11 = this.f11089a.g();
                } while (g11 == this.f11090b);
                this.f11092d = g11;
                return;
            } else if (i10 == 2) {
                int c10 = this.f11089a.c() + this.f11089a.u();
                do {
                    si3Var.c0(this.f11089a.v());
                } while (this.f11089a.c() < c10);
                Q(c10);
                return;
            } else {
                throw zzggm.i();
            }
        }
        int i11 = this.f11090b & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.f11089a.v()));
                if (this.f11089a.b()) {
                    return;
                }
                g10 = this.f11089a.g();
            } while (g10 == this.f11090b);
            this.f11092d = g10;
        } else if (i11 == 2) {
            int c11 = this.f11089a.c() + this.f11089a.u();
            do {
                list.add(Integer.valueOf(this.f11089a.v()));
            } while (this.f11089a.c() < c11);
            Q(c11);
        } else {
            throw zzggm.i();
        }
    }

    public final void M(List<String> list, boolean z10) throws IOException {
        int g10;
        int g11;
        if ((this.f11090b & 7) == 2) {
            if (!(list instanceof gj3) || z10) {
                do {
                    list.add(z10 ? n() : k());
                    if (this.f11089a.b()) {
                        return;
                    }
                    g10 = this.f11089a.g();
                } while (g10 == this.f11090b);
                this.f11092d = g10;
                return;
            }
            gj3 gj3Var = (gj3) list;
            do {
                gj3Var.q(l());
                if (this.f11089a.b()) {
                    return;
                }
                g11 = this.f11089a.g();
            } while (g11 == this.f11090b);
            this.f11092d = g11;
            return;
        }
        throw zzggm.i();
    }

    public final void N(int i10) throws IOException {
        if ((this.f11090b & 7) != i10) {
            throw zzggm.i();
        }
    }

    public final <T> T O(ok3<T> ok3Var, di3 di3Var) throws IOException {
        uh3 uh3Var;
        int u10 = this.f11089a.u();
        uh3 uh3Var2 = this.f11089a;
        if (uh3Var2.f10714a < uh3Var2.f10715b) {
            int A = uh3Var2.A(u10);
            T zza = ok3Var.zza();
            this.f11089a.f10714a++;
            ok3Var.k(zza, this, di3Var);
            ok3Var.e(zza);
            this.f11089a.h(0);
            uh3Var.f10714a--;
            this.f11089a.a(A);
            return zza;
        }
        throw new zzggm("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final <T> T P(ok3<T> ok3Var, di3 di3Var) throws IOException {
        int i10 = this.f11091c;
        this.f11091c = ((this.f11090b >>> 3) << 3) | 4;
        try {
            T zza = ok3Var.zza();
            ok3Var.k(zza, this, di3Var);
            ok3Var.e(zza);
            if (this.f11090b == this.f11091c) {
                return zza;
            }
            throw zzggm.k();
        } finally {
            this.f11091c = i10;
        }
    }

    public final void Q(int i10) throws IOException {
        if (this.f11089a.c() != i10) {
            throw zzggm.d();
        }
    }

    @Override // ai.ik3
    public final float a() throws IOException {
        N(5);
        return this.f11089a.k();
    }

    @Override // ai.ik3
    public final int b() {
        return this.f11090b;
    }

    @Override // ai.ik3
    public final double c() throws IOException {
        N(1);
        return this.f11089a.j();
    }

    @Override // ai.ik3
    public final boolean d() throws IOException {
        int i10;
        if (this.f11089a.b() || (i10 = this.f11090b) == this.f11091c) {
            return false;
        }
        return this.f11089a.i(i10);
    }

    @Override // ai.ik3
    public final long e() throws IOException {
        N(0);
        return this.f11089a.m();
    }

    @Override // ai.ik3
    public final long f() throws IOException {
        N(0);
        return this.f11089a.l();
    }

    @Override // ai.ik3
    public final long g() throws IOException {
        N(1);
        return this.f11089a.o();
    }

    @Override // ai.ik3
    public final int h() throws IOException {
        N(0);
        return this.f11089a.n();
    }

    @Override // ai.ik3
    public final int i() throws IOException {
        N(5);
        return this.f11089a.p();
    }

    @Override // ai.ik3
    public final boolean j() throws IOException {
        N(0);
        return this.f11089a.q();
    }

    @Override // ai.ik3
    public final String k() throws IOException {
        N(2);
        return this.f11089a.r();
    }

    @Override // ai.ik3
    public final oh3 l() throws IOException {
        N(2);
        return this.f11089a.t();
    }

    @Override // ai.ik3
    public final int m() throws IOException {
        N(5);
        return this.f11089a.w();
    }

    @Override // ai.ik3
    public final String n() throws IOException {
        N(2);
        return this.f11089a.s();
    }

    @Override // ai.ik3
    public final <T> T o(ok3<T> ok3Var, di3 di3Var) throws IOException {
        N(2);
        return (T) O(ok3Var, di3Var);
    }

    @Override // ai.ik3
    public final void p(List<Float> list) throws IOException {
        int g10;
        int g11;
        if (!(list instanceof ki3)) {
            int i10 = this.f11090b & 7;
            if (i10 == 2) {
                int u10 = this.f11089a.u();
                R(u10);
                int c10 = this.f11089a.c() + u10;
                do {
                    list.add(Float.valueOf(this.f11089a.k()));
                } while (this.f11089a.c() < c10);
                return;
            } else if (i10 != 5) {
                throw zzggm.i();
            } else {
                do {
                    list.add(Float.valueOf(this.f11089a.k()));
                    if (this.f11089a.b()) {
                        return;
                    }
                    g10 = this.f11089a.g();
                } while (g10 == this.f11090b);
                this.f11092d = g10;
                return;
            }
        }
        ki3 ki3Var = (ki3) list;
        int i11 = this.f11090b & 7;
        if (i11 == 2) {
            int u11 = this.f11089a.u();
            R(u11);
            int c11 = this.f11089a.c() + u11;
            do {
                ki3Var.f(this.f11089a.k());
            } while (this.f11089a.c() < c11);
        } else if (i11 != 5) {
            throw zzggm.i();
        } else {
            do {
                ki3Var.f(this.f11089a.k());
                if (this.f11089a.b()) {
                    return;
                }
                g11 = this.f11089a.g();
            } while (g11 == this.f11090b);
            this.f11092d = g11;
        }
    }

    @Override // ai.ik3
    public final int q() throws IOException {
        N(0);
        return this.f11089a.v();
    }

    @Override // ai.ik3
    public final long r() throws IOException {
        N(1);
        return this.f11089a.x();
    }

    @Override // ai.ik3
    public final void s(List<Boolean> list) throws IOException {
        int g10;
        int g11;
        if (list instanceof ch3) {
            ch3 ch3Var = (ch3) list;
            int i10 = this.f11090b & 7;
            if (i10 == 0) {
                do {
                    ch3Var.f(this.f11089a.q());
                    if (this.f11089a.b()) {
                        return;
                    }
                    g11 = this.f11089a.g();
                } while (g11 == this.f11090b);
                this.f11092d = g11;
                return;
            } else if (i10 == 2) {
                int c10 = this.f11089a.c() + this.f11089a.u();
                do {
                    ch3Var.f(this.f11089a.q());
                } while (this.f11089a.c() < c10);
                Q(c10);
                return;
            } else {
                throw zzggm.i();
            }
        }
        int i11 = this.f11090b & 7;
        if (i11 == 0) {
            do {
                list.add(Boolean.valueOf(this.f11089a.q()));
                if (this.f11089a.b()) {
                    return;
                }
                g10 = this.f11089a.g();
            } while (g10 == this.f11090b);
            this.f11092d = g10;
        } else if (i11 == 2) {
            int c11 = this.f11089a.c() + this.f11089a.u();
            do {
                list.add(Boolean.valueOf(this.f11089a.q()));
            } while (this.f11089a.c() < c11);
            Q(c11);
        } else {
            throw zzggm.i();
        }
    }

    @Override // ai.ik3
    public final <T> T t(ok3<T> ok3Var, di3 di3Var) throws IOException {
        N(3);
        return (T) P(ok3Var, di3Var);
    }

    @Override // ai.ik3
    public final void u(List<Double> list) throws IOException {
        int g10;
        int g11;
        if (list instanceof ai3) {
            ai3 ai3Var = (ai3) list;
            int i10 = this.f11090b & 7;
            if (i10 == 1) {
                do {
                    ai3Var.f(this.f11089a.j());
                    if (this.f11089a.b()) {
                        return;
                    }
                    g11 = this.f11089a.g();
                } while (g11 == this.f11090b);
                this.f11092d = g11;
                return;
            } else if (i10 == 2) {
                int u10 = this.f11089a.u();
                S(u10);
                int c10 = this.f11089a.c() + u10;
                do {
                    ai3Var.f(this.f11089a.j());
                } while (this.f11089a.c() < c10);
                return;
            } else {
                throw zzggm.i();
            }
        }
        int i11 = this.f11090b & 7;
        if (i11 == 1) {
            do {
                list.add(Double.valueOf(this.f11089a.j()));
                if (this.f11089a.b()) {
                    return;
                }
                g10 = this.f11089a.g();
            } while (g10 == this.f11090b);
            this.f11092d = g10;
        } else if (i11 == 2) {
            int u11 = this.f11089a.u();
            S(u11);
            int c11 = this.f11089a.c() + u11;
            do {
                list.add(Double.valueOf(this.f11089a.j()));
            } while (this.f11089a.c() < c11);
        } else {
            throw zzggm.i();
        }
    }

    @Override // ai.ik3
    public final void v(List<Integer> list) throws IOException {
        int g10;
        int g11;
        if (!(list instanceof si3)) {
            int i10 = this.f11090b & 7;
            if (i10 == 2) {
                int u10 = this.f11089a.u();
                R(u10);
                int c10 = this.f11089a.c() + u10;
                do {
                    list.add(Integer.valueOf(this.f11089a.p()));
                } while (this.f11089a.c() < c10);
                return;
            } else if (i10 != 5) {
                throw zzggm.i();
            } else {
                do {
                    list.add(Integer.valueOf(this.f11089a.p()));
                    if (this.f11089a.b()) {
                        return;
                    }
                    g10 = this.f11089a.g();
                } while (g10 == this.f11090b);
                this.f11092d = g10;
                return;
            }
        }
        si3 si3Var = (si3) list;
        int i11 = this.f11090b & 7;
        if (i11 == 2) {
            int u11 = this.f11089a.u();
            R(u11);
            int c11 = this.f11089a.c() + u11;
            do {
                si3Var.c0(this.f11089a.p());
            } while (this.f11089a.c() < c11);
        } else if (i11 != 5) {
            throw zzggm.i();
        } else {
            do {
                si3Var.c0(this.f11089a.p());
                if (this.f11089a.b()) {
                    return;
                }
                g11 = this.f11089a.g();
            } while (g11 == this.f11090b);
            this.f11092d = g11;
        }
    }

    @Override // ai.ik3
    public final int w() throws IOException {
        N(0);
        return this.f11089a.u();
    }

    @Override // ai.ik3
    public final void x(List<Long> list) throws IOException {
        int g10;
        int g11;
        if (list instanceof lj3) {
            lj3 lj3Var = (lj3) list;
            int i10 = this.f11090b & 7;
            if (i10 == 0) {
                do {
                    lj3Var.j(this.f11089a.l());
                    if (this.f11089a.b()) {
                        return;
                    }
                    g11 = this.f11089a.g();
                } while (g11 == this.f11090b);
                this.f11092d = g11;
                return;
            } else if (i10 == 2) {
                int c10 = this.f11089a.c() + this.f11089a.u();
                do {
                    lj3Var.j(this.f11089a.l());
                } while (this.f11089a.c() < c10);
                Q(c10);
                return;
            } else {
                throw zzggm.i();
            }
        }
        int i11 = this.f11090b & 7;
        if (i11 == 0) {
            do {
                list.add(Long.valueOf(this.f11089a.l()));
                if (this.f11089a.b()) {
                    return;
                }
                g10 = this.f11089a.g();
            } while (g10 == this.f11090b);
            this.f11092d = g10;
        } else if (i11 == 2) {
            int c11 = this.f11089a.c() + this.f11089a.u();
            do {
                list.add(Long.valueOf(this.f11089a.l()));
            } while (this.f11089a.c() < c11);
            Q(c11);
        } else {
            throw zzggm.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ai.ik3
    public final <T> void y(List<T> list, ok3<T> ok3Var, di3 di3Var) throws IOException {
        int g10;
        int i10 = this.f11090b;
        if ((i10 & 7) != 2) {
            throw zzggm.i();
        }
        do {
            list.add(O(ok3Var, di3Var));
            if (this.f11089a.b() || this.f11092d != 0) {
                return;
            }
            g10 = this.f11089a.g();
        } while (g10 == i10);
        this.f11092d = g10;
    }

    @Override // ai.ik3
    public final void z(List<Long> list) throws IOException {
        int g10;
        int g11;
        if (list instanceof lj3) {
            lj3 lj3Var = (lj3) list;
            int i10 = this.f11090b & 7;
            if (i10 == 0) {
                do {
                    lj3Var.j(this.f11089a.m());
                    if (this.f11089a.b()) {
                        return;
                    }
                    g11 = this.f11089a.g();
                } while (g11 == this.f11090b);
                this.f11092d = g11;
                return;
            } else if (i10 == 2) {
                int c10 = this.f11089a.c() + this.f11089a.u();
                do {
                    lj3Var.j(this.f11089a.m());
                } while (this.f11089a.c() < c10);
                Q(c10);
                return;
            } else {
                throw zzggm.i();
            }
        }
        int i11 = this.f11090b & 7;
        if (i11 == 0) {
            do {
                list.add(Long.valueOf(this.f11089a.m()));
                if (this.f11089a.b()) {
                    return;
                }
                g10 = this.f11089a.g();
            } while (g10 == this.f11090b);
            this.f11092d = g10;
        } else if (i11 == 2) {
            int c11 = this.f11089a.c() + this.f11089a.u();
            do {
                list.add(Long.valueOf(this.f11089a.m()));
            } while (this.f11089a.c() < c11);
            Q(c11);
        } else {
            throw zzggm.i();
        }
    }

    @Override // ai.ik3
    public final int zzb() throws IOException {
        int i10 = this.f11092d;
        if (i10 != 0) {
            this.f11090b = i10;
            this.f11092d = 0;
        } else {
            i10 = this.f11089a.g();
            this.f11090b = i10;
        }
        if (i10 == 0 || i10 == this.f11091c) {
            return Integer.MAX_VALUE;
        }
        return i10 >>> 3;
    }
}
