package ai;

import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzaeg;

/* loaded from: classes3.dex */
public final class p5 {

    /* renamed from: a  reason: collision with root package name */
    public final ap3 f8303a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8304b;

    /* renamed from: c  reason: collision with root package name */
    public final qq3[] f8305c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8306d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8307e;

    /* renamed from: f  reason: collision with root package name */
    public q5 f8308f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8309g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f8310h;

    /* renamed from: i  reason: collision with root package name */
    public final v6[] f8311i;

    /* renamed from: j  reason: collision with root package name */
    public final ur3 f8312j;

    /* renamed from: k  reason: collision with root package name */
    public final z5 f8313k;

    /* renamed from: l  reason: collision with root package name */
    public p5 f8314l;

    /* renamed from: m  reason: collision with root package name */
    public uz3 f8315m;

    /* renamed from: n  reason: collision with root package name */
    public wr3 f8316n;

    /* renamed from: o  reason: collision with root package name */
    public long f8317o;

    public p5(v6[] v6VarArr, long j10, ur3 ur3Var, is3 is3Var, z5 z5Var, q5 q5Var, wr3 wr3Var, byte[] bArr) {
        this.f8311i = v6VarArr;
        this.f8317o = j10;
        this.f8312j = ur3Var;
        this.f8313k = z5Var;
        bp3 bp3Var = q5Var.f8825a;
        this.f8304b = bp3Var.f9603a;
        this.f8308f = q5Var;
        this.f8315m = uz3.f10891d;
        this.f8316n = wr3Var;
        this.f8305c = new qq3[2];
        this.f8310h = new boolean[2];
        long j11 = q5Var.f8826b;
        long j12 = q5Var.f8828d;
        ap3 o10 = z5Var.o(bp3Var, is3Var, j11);
        this.f8303a = j12 != C.TIME_UNSET ? new ho3(o10, true, 0L, j12) : o10;
    }

    public final long a() {
        return this.f8317o;
    }

    public final void b(long j10) {
        this.f8317o = 0L;
    }

    public final long c() {
        return this.f8308f.f8826b + this.f8317o;
    }

    public final boolean d() {
        return this.f8306d && (!this.f8307e || this.f8303a.e() == Long.MIN_VALUE);
    }

    public final long e() {
        if (this.f8306d) {
            long e10 = this.f8307e ? this.f8303a.e() : Long.MIN_VALUE;
            return e10 == Long.MIN_VALUE ? this.f8308f.f8829e : e10;
        }
        return this.f8308f.f8826b;
    }

    public final long f() {
        if (this.f8306d) {
            return this.f8303a.i();
        }
        return 0L;
    }

    public final void g(float f10, q7 q7Var) throws zzaeg {
        this.f8306d = true;
        this.f8315m = this.f8303a.d();
        wr3 j10 = j(f10, q7Var);
        q5 q5Var = this.f8308f;
        long j11 = q5Var.f8826b;
        long j12 = q5Var.f8829e;
        if (j12 != C.TIME_UNSET && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        long k10 = k(j10, j11, false);
        long j13 = this.f8317o;
        q5 q5Var2 = this.f8308f;
        this.f8317o = j13 + (q5Var2.f8826b - k10);
        this.f8308f = q5Var2.a(k10);
    }

    public final void h(long j10) {
        u9.d(u());
        if (this.f8306d) {
            this.f8303a.a(j10 - this.f8317o);
        }
    }

    public final void i(long j10) {
        u9.d(u());
        this.f8303a.c(j10 - this.f8317o);
    }

    public final wr3 j(float f10, q7 q7Var) throws zzaeg {
        br3[] br3VarArr;
        wr3 b10 = this.f8312j.b(this.f8311i, this.f8315m, this.f8308f.f8825a, q7Var);
        for (br3 br3Var : b10.f11731d) {
        }
        return b10;
    }

    public final long k(wr3 wr3Var, long j10, boolean z10) {
        return l(wr3Var, j10, false, new boolean[2]);
    }

    public final long l(wr3 wr3Var, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= wr3Var.f11728a) {
                break;
            }
            boolean[] zArr2 = this.f8310h;
            if (z10 || !wr3Var.b(this.f8316n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            v6[] v6VarArr = this.f8311i;
            if (i11 >= 2) {
                break;
            }
            v6VarArr[i11].U();
            i11++;
        }
        t();
        this.f8316n = wr3Var;
        s();
        long q10 = this.f8303a.q(wr3Var.f11731d, this.f8310h, this.f8305c, zArr, j10);
        int i12 = 0;
        while (true) {
            v6[] v6VarArr2 = this.f8311i;
            if (i12 >= 2) {
                break;
            }
            v6VarArr2[i12].U();
            i12++;
        }
        this.f8307e = false;
        int i13 = 0;
        while (true) {
            qq3[] qq3VarArr = this.f8305c;
            if (i13 >= 2) {
                return q10;
            }
            if (qq3VarArr[i13] != null) {
                u9.d(wr3Var.a(i13));
                this.f8311i[i13].U();
                this.f8307e = true;
            } else {
                u9.d(wr3Var.f11731d[i13] == null);
            }
            i13++;
        }
    }

    public final void m() {
        t();
        z5 z5Var = this.f8313k;
        ap3 ap3Var = this.f8303a;
        try {
            if (ap3Var instanceof ho3) {
                z5Var.f(((ho3) ap3Var).f4913w);
            } else {
                z5Var.f(ap3Var);
            }
        } catch (RuntimeException e10) {
            oa.b("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void n(p5 p5Var) {
        if (p5Var == this.f8314l) {
            return;
        }
        t();
        this.f8314l = p5Var;
        s();
    }

    public final p5 o() {
        return this.f8314l;
    }

    public final uz3 p() {
        return this.f8315m;
    }

    public final wr3 q() {
        return this.f8316n;
    }

    public final void r() {
        ap3 ap3Var = this.f8303a;
        if (ap3Var instanceof ho3) {
            long j10 = this.f8308f.f8828d;
            if (j10 == C.TIME_UNSET) {
                j10 = Long.MIN_VALUE;
            }
            ((ho3) ap3Var).m(0L, j10);
        }
    }

    public final void s() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            wr3 wr3Var = this.f8316n;
            if (i10 >= wr3Var.f11728a) {
                return;
            }
            wr3Var.a(i10);
            br3 br3Var = this.f8316n.f11731d[i10];
            i10++;
        }
    }

    public final void t() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            wr3 wr3Var = this.f8316n;
            if (i10 >= wr3Var.f11728a) {
                return;
            }
            wr3Var.a(i10);
            br3 br3Var = this.f8316n.f11731d[i10];
            i10++;
        }
    }

    public final boolean u() {
        return this.f8314l == null;
    }
}
