package ai;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class s5 {

    /* renamed from: a  reason: collision with root package name */
    public final n7 f9719a = new n7();

    /* renamed from: b  reason: collision with root package name */
    public final p7 f9720b = new p7();

    /* renamed from: c  reason: collision with root package name */
    public final o11 f9721c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f9722d;

    /* renamed from: e  reason: collision with root package name */
    public long f9723e;

    /* renamed from: f  reason: collision with root package name */
    public int f9724f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9725g;

    /* renamed from: h  reason: collision with root package name */
    public p5 f9726h;

    /* renamed from: i  reason: collision with root package name */
    public p5 f9727i;

    /* renamed from: j  reason: collision with root package name */
    public p5 f9728j;

    /* renamed from: k  reason: collision with root package name */
    public int f9729k;

    /* renamed from: l  reason: collision with root package name */
    public Object f9730l;

    /* renamed from: m  reason: collision with root package name */
    public long f9731m;

    public s5(o11 o11Var, Handler handler) {
        this.f9721c = o11Var;
        this.f9722d = handler;
    }

    public static final boolean c(bp3 bp3Var) {
        return !bp3Var.b() && bp3Var.f9607e == -1;
    }

    public static bp3 w(q7 q7Var, Object obj, long j10, long j11, n7 n7Var) {
        q7Var.o(obj, n7Var);
        int e10 = n7Var.e(j10);
        if (e10 == -1) {
            return new bp3(obj, j11, n7Var.f(j10));
        }
        return new bp3(obj, e10, n7Var.c(e10), j11);
    }

    public final q5 A(q7 q7Var, Object obj, int i10, int i11, long j10, long j11) {
        bp3 bp3Var = new bp3(obj, i10, i11, j11);
        long h10 = q7Var.o(bp3Var.f9603a, this.f9719a).h(bp3Var.f9604b, bp3Var.f9605c);
        if (i11 == this.f9719a.c(i10)) {
            this.f9719a.i();
        }
        this.f9719a.j(bp3Var.f9604b);
        return new q5(bp3Var, (h10 == C.TIME_UNSET || h10 > 0) ? 0L : Math.max(0L, (-1) + h10), j10, C.TIME_UNSET, h10, false, false, false, false);
    }

    public final q5 B(q7 q7Var, Object obj, long j10, long j11, long j12) {
        long j13;
        long j14 = j10;
        q7Var.o(obj, this.f9719a);
        int f10 = this.f9719a.f(j14);
        bp3 bp3Var = new bp3(obj, j12, f10);
        boolean c10 = c(bp3Var);
        boolean C = C(q7Var, bp3Var);
        boolean a10 = a(q7Var, bp3Var, c10);
        if (f10 != -1) {
            this.f9719a.j(f10);
        }
        if (f10 != -1) {
            this.f9719a.b(f10);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        long j15 = j13 != C.TIME_UNSET ? j13 : this.f9719a.f7217d;
        if (j15 != C.TIME_UNSET && j14 >= j15) {
            j14 = Math.max(0L, (-1) + j15);
        }
        return new q5(bp3Var, j14, j11, j13, j15, false, c10, C, a10);
    }

    public final boolean C(q7 q7Var, bp3 bp3Var) {
        if (c(bp3Var)) {
            return q7Var.f(q7Var.o(bp3Var.f9603a, this.f9719a).f7216c, this.f9720b, 0L).f8339n == q7Var.i(bp3Var.f9603a);
        }
        return false;
    }

    public final boolean a(q7 q7Var, bp3 bp3Var, boolean z10) {
        int i10 = q7Var.i(bp3Var.f9603a);
        return !q7Var.f(q7Var.h(i10, this.f9719a, false).f7216c, this.f9720b, 0L).f8332g && q7Var.l(i10, this.f9719a, this.f9720b, this.f9724f, this.f9725g) == -1 && z10;
    }

    public final long b(q7 q7Var, Object obj, int i10) {
        q7Var.o(obj, this.f9719a);
        this.f9719a.b(i10);
        this.f9719a.k(i10);
        return 0L;
    }

    public final boolean d(q7 q7Var, int i10) {
        this.f9724f = i10;
        return x(q7Var);
    }

    public final boolean e(q7 q7Var, boolean z10) {
        this.f9725g = z10;
        return x(q7Var);
    }

    public final boolean f(ap3 ap3Var) {
        p5 p5Var = this.f9728j;
        return p5Var != null && p5Var.f8303a == ap3Var;
    }

    public final void g(long j10) {
        p5 p5Var = this.f9728j;
        if (p5Var != null) {
            p5Var.h(j10);
        }
    }

    public final boolean h() {
        p5 p5Var = this.f9728j;
        if (p5Var != null) {
            if (p5Var.f8308f.f8833i || !p5Var.d() || this.f9728j.f8308f.f8829e == C.TIME_UNSET) {
                return false;
            }
            return this.f9729k < 100;
        }
        return true;
    }

    public final q5 i(long j10, c6 c6Var) {
        p5 p5Var = this.f9728j;
        return p5Var == null ? z(c6Var.f2722a, c6Var.f2723b, c6Var.f2724c, c6Var.f2740s) : y(c6Var.f2722a, p5Var, j10);
    }

    public final p5 j() {
        return this.f9728j;
    }

    public final p5 k() {
        return this.f9726h;
    }

    public final p5 l() {
        return this.f9727i;
    }

    public final p5 m() {
        p5 p5Var = this.f9727i;
        boolean z10 = false;
        if (p5Var != null && p5Var.o() != null) {
            z10 = true;
        }
        u9.d(z10);
        this.f9727i = this.f9727i.o();
        v();
        return this.f9727i;
    }

    public final p5 n() {
        p5 p5Var = this.f9726h;
        if (p5Var == null) {
            return null;
        }
        if (p5Var == this.f9727i) {
            this.f9727i = p5Var.o();
        }
        this.f9726h.m();
        int i10 = this.f9729k - 1;
        this.f9729k = i10;
        if (i10 == 0) {
            this.f9728j = null;
            p5 p5Var2 = this.f9726h;
            this.f9730l = p5Var2.f8304b;
            this.f9731m = p5Var2.f8308f.f8825a.f9606d;
        }
        this.f9726h = this.f9726h.o();
        v();
        return this.f9726h;
    }

    public final boolean o(p5 p5Var) {
        boolean z10 = false;
        u9.d(p5Var != null);
        if (p5Var.equals(this.f9728j)) {
            return false;
        }
        this.f9728j = p5Var;
        while (p5Var.o() != null) {
            p5Var = p5Var.o();
            if (p5Var == this.f9727i) {
                this.f9727i = this.f9726h;
                z10 = true;
            }
            p5Var.m();
            this.f9729k--;
        }
        this.f9728j.n(null);
        v();
        return z10;
    }

    public final void p() {
        if (this.f9729k == 0) {
            return;
        }
        p5 p5Var = this.f9726h;
        u9.e(p5Var);
        this.f9730l = p5Var.f8304b;
        this.f9731m = p5Var.f8308f.f8825a.f9606d;
        while (p5Var != null) {
            p5Var.m();
            p5Var = p5Var.o();
        }
        this.f9726h = null;
        this.f9728j = null;
        this.f9727i = null;
        this.f9729k = 0;
        v();
    }

    public final boolean q(q7 q7Var, long j10, long j11) {
        q5 q5Var;
        boolean z10;
        p5 p5Var = null;
        for (p5 p5Var2 = this.f9726h; p5Var2 != null; p5Var2 = p5Var2.o()) {
            q5 q5Var2 = p5Var2.f8308f;
            if (p5Var == null) {
                q5Var = r(q7Var, q5Var2);
            } else {
                q5 y10 = y(q7Var, p5Var, j10);
                if (y10 == null) {
                    return !o(p5Var);
                } else if (q5Var2.f8826b != y10.f8826b || !q5Var2.f8825a.equals(y10.f8825a)) {
                    return !o(p5Var);
                } else {
                    q5Var = y10;
                }
            }
            p5Var2.f8308f = q5Var.b(q5Var2.f8827c);
            long j12 = q5Var2.f8829e;
            long j13 = q5Var.f8829e;
            if (j12 != C.TIME_UNSET && j12 != j13) {
                p5Var2.r();
                long j14 = q5Var.f8829e;
                long a10 = j14 == C.TIME_UNSET ? Long.MAX_VALUE : j14 + p5Var2.a();
                if (p5Var2 == this.f9727i) {
                    boolean z11 = p5Var2.f8308f.f8830f;
                    if (j11 == Long.MIN_VALUE || j11 >= a10) {
                        z10 = true;
                        return o(p5Var2) && !z10;
                    }
                }
                z10 = false;
                if (o(p5Var2)) {
                }
            }
            p5Var = p5Var2;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ai.q5 r(ai.q7 r19, ai.q5 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            ai.bp3 r3 = r2.f8825a
            boolean r12 = c(r3)
            boolean r13 = r0.C(r1, r3)
            boolean r14 = r0.a(r1, r3, r12)
            ai.bp3 r4 = r2.f8825a
            java.lang.Object r4 = r4.f9603a
            ai.n7 r5 = r0.f9719a
            r1.o(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L36
            int r1 = r3.f9607e
            if (r1 != r4) goto L2e
            goto L36
        L2e:
            ai.n7 r7 = r0.f9719a
            r7.b(r1)
            r7 = 0
            goto L37
        L36:
            r7 = r5
        L37:
            boolean r1 = r3.b()
            if (r1 == 0) goto L49
            ai.n7 r1 = r0.f9719a
            int r5 = r3.f9604b
            int r6 = r3.f9605c
            long r5 = r1.h(r5, r6)
        L47:
            r9 = r5
            goto L54
        L49:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L4f
            r9 = r7
            goto L54
        L4f:
            ai.n7 r1 = r0.f9719a
            long r5 = r1.f7217d
            goto L47
        L54:
            boolean r1 = r3.b()
            if (r1 == 0) goto L62
            ai.n7 r1 = r0.f9719a
            int r4 = r3.f9604b
            r1.j(r4)
            goto L6b
        L62:
            int r1 = r3.f9607e
            if (r1 == r4) goto L6b
            ai.n7 r4 = r0.f9719a
            r4.j(r1)
        L6b:
            ai.q5 r15 = new ai.q5
            long r4 = r2.f8826b
            long r1 = r2.f8827c
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.s5.r(ai.q7, ai.q5):ai.q5");
    }

    public final bp3 s(q7 q7Var, Object obj, long j10) {
        long j11;
        int i10;
        int i11 = q7Var.o(obj, this.f9719a).f7216c;
        Object obj2 = this.f9730l;
        if (obj2 == null || (i10 = q7Var.i(obj2)) == -1 || q7Var.h(i10, this.f9719a, false).f7216c != i11) {
            p5 p5Var = this.f9726h;
            while (true) {
                if (p5Var == null) {
                    p5 p5Var2 = this.f9726h;
                    while (true) {
                        if (p5Var2 != null) {
                            int i12 = q7Var.i(p5Var2.f8304b);
                            if (i12 != -1 && q7Var.h(i12, this.f9719a, false).f7216c == i11) {
                                j11 = p5Var2.f8308f.f8825a.f9606d;
                                break;
                            }
                            p5Var2 = p5Var2.o();
                        } else {
                            j11 = this.f9723e;
                            this.f9723e = 1 + j11;
                            if (this.f9726h == null) {
                                this.f9730l = obj;
                                this.f9731m = j11;
                            }
                        }
                    }
                } else if (p5Var.f8304b.equals(obj)) {
                    j11 = p5Var.f8308f.f8825a.f9606d;
                    break;
                } else {
                    p5Var = p5Var.o();
                }
            }
        } else {
            j11 = this.f9731m;
        }
        return w(q7Var, obj, j10, j11, this.f9719a);
    }

    public final /* synthetic */ void t(wz2 wz2Var, bp3 bp3Var) {
        this.f9721c.R(wz2Var.g(), bp3Var);
    }

    public final p5 u(v6[] v6VarArr, ur3 ur3Var, is3 is3Var, z5 z5Var, q5 q5Var, wr3 wr3Var) {
        long a10;
        p5 p5Var = this.f9728j;
        if (p5Var == null) {
            if (q5Var.f8825a.b()) {
                long j10 = q5Var.f8827c;
                if (j10 != C.TIME_UNSET) {
                    a10 = j10;
                }
            }
            a10 = 0;
        } else {
            a10 = (p5Var.a() + this.f9728j.f8308f.f8829e) - q5Var.f8826b;
        }
        p5 p5Var2 = new p5(v6VarArr, a10, ur3Var, is3Var, z5Var, q5Var, wr3Var, null);
        p5 p5Var3 = this.f9728j;
        if (p5Var3 != null) {
            p5Var3.n(p5Var2);
        } else {
            this.f9726h = p5Var2;
            this.f9727i = p5Var2;
        }
        this.f9730l = null;
        this.f9728j = p5Var2;
        this.f9729k++;
        v();
        return p5Var2;
    }

    public final void v() {
        final wz2 K = zz2.K();
        for (p5 p5Var = this.f9726h; p5Var != null; p5Var = p5Var.o()) {
            K.f(p5Var.f8308f.f8825a);
        }
        p5 p5Var2 = this.f9727i;
        final bp3 bp3Var = p5Var2 == null ? null : p5Var2.f8308f.f8825a;
        this.f9722d.post(new Runnable(this, K, bp3Var) { // from class: ai.r5

            /* renamed from: w  reason: collision with root package name */
            public final s5 f9342w;

            /* renamed from: x  reason: collision with root package name */
            public final wz2 f9343x;

            /* renamed from: y  reason: collision with root package name */
            public final bp3 f9344y;

            {
                this.f9342w = this;
                this.f9343x = K;
                this.f9344y = bp3Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9342w.t(this.f9343x, this.f9344y);
            }
        });
    }

    public final boolean x(q7 q7Var) {
        p5 p5Var = this.f9726h;
        if (p5Var == null) {
            return true;
        }
        int i10 = q7Var.i(p5Var.f8304b);
        while (true) {
            i10 = q7Var.l(i10, this.f9719a, this.f9720b, this.f9724f, this.f9725g);
            while (p5Var.o() != null && !p5Var.f8308f.f8831g) {
                p5Var = p5Var.o();
            }
            p5 o10 = p5Var.o();
            if (i10 == -1 || o10 == null || q7Var.i(o10.f8304b) != i10) {
                break;
            }
            p5Var = o10;
        }
        boolean o11 = o(p5Var);
        p5Var.f8308f = r(q7Var, p5Var.f8308f);
        return !o11;
    }

    public final q5 y(q7 q7Var, p5 p5Var, long j10) {
        long j11;
        q5 q5Var = p5Var.f8308f;
        long a10 = (p5Var.a() + q5Var.f8829e) - j10;
        if (q5Var.f8831g) {
            long j12 = 0;
            int l10 = q7Var.l(q7Var.i(q5Var.f8825a.f9603a), this.f9719a, this.f9720b, this.f9724f, this.f9725g);
            if (l10 == -1) {
                return null;
            }
            int i10 = q7Var.h(l10, this.f9719a, true).f7216c;
            Object obj = this.f9719a.f7215b;
            long j13 = q5Var.f8825a.f9606d;
            if (q7Var.f(i10, this.f9720b, 0L).f8338m == l10) {
                Pair<Object, Long> n10 = q7Var.n(this.f9720b, this.f9719a, i10, C.TIME_UNSET, Math.max(0L, a10));
                if (n10 == null) {
                    return null;
                }
                obj = n10.first;
                long longValue = ((Long) n10.second).longValue();
                p5 o10 = p5Var.o();
                if (o10 != null && o10.f8304b.equals(obj)) {
                    j13 = o10.f8308f.f8825a.f9606d;
                } else {
                    j13 = this.f9723e;
                    this.f9723e = 1 + j13;
                }
                j11 = longValue;
                j12 = C.TIME_UNSET;
            } else {
                j11 = 0;
            }
            return z(q7Var, w(q7Var, obj, j11, j13, this.f9719a), j12, j11);
        }
        bp3 bp3Var = q5Var.f8825a;
        q7Var.o(bp3Var.f9603a, this.f9719a);
        if (bp3Var.b()) {
            int i11 = bp3Var.f9604b;
            if (this.f9719a.g(i11) == -1) {
                return null;
            }
            int d10 = this.f9719a.d(i11, bp3Var.f9605c);
            if (d10 < 0) {
                return A(q7Var, bp3Var.f9603a, i11, d10, q5Var.f8827c, bp3Var.f9606d);
            }
            long j14 = q5Var.f8827c;
            if (j14 == C.TIME_UNSET) {
                p7 p7Var = this.f9720b;
                n7 n7Var = this.f9719a;
                Pair<Object, Long> n11 = q7Var.n(p7Var, n7Var, n7Var.f7216c, C.TIME_UNSET, Math.max(0L, a10));
                if (n11 == null) {
                    return null;
                }
                j14 = ((Long) n11.second).longValue();
            }
            b(q7Var, bp3Var.f9603a, bp3Var.f9604b);
            return B(q7Var, bp3Var.f9603a, Math.max(0L, j14), q5Var.f8827c, bp3Var.f9606d);
        }
        int c10 = this.f9719a.c(bp3Var.f9607e);
        if (c10 == this.f9719a.g(bp3Var.f9607e)) {
            b(q7Var, bp3Var.f9603a, bp3Var.f9607e);
            return B(q7Var, bp3Var.f9603a, 0L, q5Var.f8829e, bp3Var.f9606d);
        }
        return A(q7Var, bp3Var.f9603a, bp3Var.f9607e, c10, q5Var.f8829e, bp3Var.f9606d);
    }

    public final q5 z(q7 q7Var, bp3 bp3Var, long j10, long j11) {
        q7Var.o(bp3Var.f9603a, this.f9719a);
        if (bp3Var.b()) {
            return A(q7Var, bp3Var.f9603a, bp3Var.f9604b, bp3Var.f9605c, j10, bp3Var.f9606d);
        }
        return B(q7Var, bp3Var.f9603a, j11, j10, bp3Var.f9606d);
    }
}
