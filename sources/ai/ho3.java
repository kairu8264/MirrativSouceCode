package ai;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ho3 implements ap3, zo3 {
    public long A;

    /* renamed from: w  reason: collision with root package name */
    public final ap3 f4913w;

    /* renamed from: x  reason: collision with root package name */
    public zo3 f4914x;

    /* renamed from: y  reason: collision with root package name */
    public qn3[] f4915y = new qn3[0];

    /* renamed from: z  reason: collision with root package name */
    public long f4916z = 0;

    public ho3(ap3 ap3Var, boolean z10, long j10, long j11) {
        this.f4913w = ap3Var;
        this.A = j11;
    }

    @Override // ai.ap3, ai.sq3
    public final void a(long j10) {
        this.f4913w.a(j10);
    }

    @Override // ai.ap3
    public final void b() throws IOException {
        this.f4913w.b();
    }

    @Override // ai.ap3, ai.sq3
    public final boolean c(long j10) {
        return this.f4913w.c(j10);
    }

    @Override // ai.ap3
    public final uz3 d() {
        return this.f4913w.d();
    }

    @Override // ai.ap3, ai.sq3
    public final long e() {
        long e10 = this.f4913w.e();
        if (e10 != Long.MIN_VALUE) {
            long j10 = this.A;
            if (j10 == Long.MIN_VALUE || e10 < j10) {
                return e10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // ai.ap3
    public final long f() {
        if (n()) {
            long j10 = this.f4916z;
            this.f4916z = C.TIME_UNSET;
            long f10 = f();
            return f10 != C.TIME_UNSET ? f10 : j10;
        }
        long f11 = this.f4913w.f();
        if (f11 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        boolean z10 = false;
        u9.d(f11 >= 0);
        long j11 = this.A;
        if (j11 == Long.MIN_VALUE || f11 <= j11) {
            z10 = true;
        }
        u9.d(z10);
        return f11;
    }

    @Override // ai.zo3
    public final void g(ap3 ap3Var) {
        zo3 zo3Var = this.f4914x;
        Objects.requireNonNull(zo3Var);
        zo3Var.g(this);
    }

    @Override // ai.rq3
    public final /* bridge */ /* synthetic */ void h(ap3 ap3Var) {
        zo3 zo3Var = this.f4914x;
        Objects.requireNonNull(zo3Var);
        zo3Var.h(this);
    }

    @Override // ai.ap3, ai.sq3
    public final long i() {
        long i10 = this.f4913w.i();
        if (i10 != Long.MIN_VALUE) {
            long j10 = this.A;
            if (j10 == Long.MIN_VALUE || i10 < j10) {
                return i10;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r0 > r3) goto L18;
     */
    @Override // ai.ap3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long j(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f4916z = r0
            ai.qn3[] r0 = r7.f4915y
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.d()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            ai.ap3 r0 = r7.f4913w
            long r0 = r0.j(r8)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L35
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 < 0) goto L36
            long r3 = r7.A
            r5 = -9223372036854775808
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L35
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 > 0) goto L36
        L35:
            r2 = r9
        L36:
            ai.u9.d(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ho3.j(long):long");
    }

    @Override // ai.ap3, ai.sq3
    public final boolean k() {
        return this.f4913w.k();
    }

    @Override // ai.ap3
    public final void l(long j10, boolean z10) {
        this.f4913w.l(j10, false);
    }

    public final void m(long j10, long j11) {
        this.A = j11;
    }

    public final boolean n() {
        return this.f4916z != C.TIME_UNSET;
    }

    @Override // ai.ap3
    public final long o(long j10, y6 y6Var) {
        if (j10 != 0) {
            long d02 = sb.d0(y6Var.f12463a, 0L, j10);
            long j11 = y6Var.f12464b;
            long j12 = this.A;
            long d03 = sb.d0(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
            if (d02 != y6Var.f12463a || d03 != y6Var.f12464b) {
                y6Var = new y6(d02, d03);
            }
            return this.f4913w.o(j10, y6Var);
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r4 > r8) goto L19;
     */
    @Override // ai.ap3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long q(ai.br3[] r15, boolean[] r16, ai.qq3[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            ai.qn3[] r3 = new ai.qn3[r2]
            r0.f4915y = r3
            ai.qq3[] r2 = new ai.qq3[r2]
            r3 = 0
            r4 = r3
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            ai.qn3[] r5 = r0.f4915y
            r6 = r1[r4]
            ai.qn3 r6 = (ai.qn3) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            ai.qq3 r11 = r6.f9016a
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            ai.ap3 r4 = r0.f4913w
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.q(r5, r6, r7, r8, r9)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f4916z = r6
            int r6 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            r7 = 1
            if (r6 == 0) goto L4f
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 < 0) goto L4e
            long r8 = r0.A
            r12 = -9223372036854775808
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 == 0) goto L4f
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 > 0) goto L4e
            goto L4f
        L4e:
            r7 = r3
        L4f:
            ai.u9.d(r7)
        L52:
            int r6 = r1.length
            if (r3 >= r6) goto L78
            r6 = r2[r3]
            if (r6 != 0) goto L5e
            ai.qn3[] r6 = r0.f4915y
            r6[r3] = r11
            goto L6f
        L5e:
            ai.qn3[] r7 = r0.f4915y
            r8 = r7[r3]
            if (r8 == 0) goto L68
            ai.qq3 r8 = r8.f9016a
            if (r8 == r6) goto L6f
        L68:
            ai.qn3 r8 = new ai.qn3
            r8.<init>(r14, r6)
            r7[r3] = r8
        L6f:
            ai.qn3[] r6 = r0.f4915y
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L52
        L78:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ho3.q(ai.br3[], boolean[], ai.qq3[], boolean[], long):long");
    }

    @Override // ai.ap3
    public final void r(zo3 zo3Var, long j10) {
        this.f4914x = zo3Var;
        this.f4913w.r(this, j10);
    }
}
