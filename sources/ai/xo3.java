package ai;

import com.google.android.exoplayer2.C;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public final class xo3 extends lo3<Void> {

    /* renamed from: j  reason: collision with root package name */
    public final dp3 f12045j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f12046k;

    /* renamed from: l  reason: collision with root package name */
    public final p7 f12047l;

    /* renamed from: m  reason: collision with root package name */
    public final n7 f12048m;

    /* renamed from: n  reason: collision with root package name */
    public uo3 f12049n;

    /* renamed from: o  reason: collision with root package name */
    public to3 f12050o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12051p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12052q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12053r;

    public xo3(dp3 dp3Var, boolean z10) {
        boolean z11;
        this.f12045j = dp3Var;
        if (z10) {
            dp3Var.m();
            z11 = true;
        } else {
            z11 = false;
        }
        this.f12046k = z11;
        this.f12047l = new p7();
        this.f12048m = new n7();
        dp3Var.q();
        this.f12049n = uo3.q(dp3Var.u());
    }

    @Override // ai.lo3
    public final /* bridge */ /* synthetic */ bp3 B(Void r22, bp3 bp3Var) {
        Object obj = bp3Var.f9603a;
        if (uo3.p(this.f12049n) != null && uo3.p(this.f12049n).equals(obj)) {
            obj = uo3.f10783f;
        }
        return bp3Var.c(obj);
    }

    @Override // ai.dp3
    /* renamed from: C */
    public final to3 f(bp3 bp3Var, is3 is3Var, long j10) {
        to3 to3Var = new to3(bp3Var, is3Var, j10, null);
        to3Var.s(this.f12045j);
        if (this.f12052q) {
            to3Var.t(bp3Var.c(D(bp3Var.f9603a)));
        } else {
            this.f12050o = to3Var;
            if (!this.f12051p) {
                this.f12051p = true;
                A(null, this.f12045j);
            }
        }
        return to3Var;
    }

    public final Object D(Object obj) {
        return (uo3.p(this.f12049n) == null || !obj.equals(uo3.f10783f)) ? obj : uo3.p(this.f12049n);
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final void E(long j10) {
        to3 to3Var = this.f12050o;
        int i10 = this.f12049n.i(to3Var.f10360w.f9603a);
        if (i10 == -1) {
            return;
        }
        uo3 uo3Var = this.f12049n;
        n7 n7Var = this.f12048m;
        uo3Var.h(i10, n7Var, false);
        long j11 = n7Var.f7217d;
        if (j11 != C.TIME_UNSET && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        to3Var.n(j10);
    }

    public final q7 F() {
        return this.f12049n;
    }

    @Override // ai.dp3
    public final void g(ap3 ap3Var) {
        ((to3) ap3Var).u();
        if (ap3Var == this.f12050o) {
            this.f12050o = null;
        }
    }

    @Override // ai.lo3, ai.pk3
    public final void n(pm pmVar) {
        super.n(pmVar);
        if (this.f12046k) {
            return;
        }
        this.f12051p = true;
        A(null, this.f12045j);
    }

    @Override // ai.lo3, ai.pk3
    public final void p() {
        this.f12052q = false;
        this.f12051p = false;
        super.p();
    }

    @Override // ai.lo3, ai.dp3
    public final void r() {
    }

    @Override // ai.dp3
    public final k5 u() {
        return this.f12045j.u();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    @Override // ai.lo3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void z(java.lang.Void r12, ai.dp3 r13, ai.q7 r14) {
        /*
            r11 = this;
            java.lang.Void r12 = (java.lang.Void) r12
            boolean r12 = r11.f12052q
            r13 = 0
            if (r12 == 0) goto L1c
            ai.uo3 r12 = r11.f12049n
            ai.uo3 r12 = r12.s(r14)
            r11.f12049n = r12
            ai.to3 r12 = r11.f12050o
            if (r12 == 0) goto L9f
            long r0 = r12.p()
            r11.E(r0)
            goto L9f
        L1c:
            boolean r12 = r14.k()
            if (r12 == 0) goto L38
            boolean r12 = r11.f12053r
            if (r12 == 0) goto L2d
            ai.uo3 r12 = r11.f12049n
            ai.uo3 r12 = r12.s(r14)
            goto L35
        L2d:
            java.lang.Object r12 = ai.p7.f8322o
            java.lang.Object r0 = ai.uo3.f10783f
            ai.uo3 r12 = ai.uo3.r(r14, r12, r0)
        L35:
            r11.f12049n = r12
            goto L9f
        L38:
            ai.p7 r12 = r11.f12047l
            r0 = 0
            r1 = 0
            r14.f(r0, r12, r1)
            ai.p7 r12 = r11.f12047l
            java.lang.Object r12 = r12.f8326a
            ai.to3 r3 = r11.f12050o
            if (r3 == 0) goto L66
            long r3 = r3.m()
            ai.uo3 r5 = r11.f12049n
            ai.to3 r6 = r11.f12050o
            ai.bp3 r6 = r6.f10360w
            java.lang.Object r6 = r6.f9603a
            ai.n7 r7 = r11.f12048m
            r5.o(r6, r7)
            ai.uo3 r5 = r11.f12049n
            ai.p7 r6 = r11.f12047l
            r5.f(r0, r6, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L66
            r9 = r3
            goto L67
        L66:
            r9 = r1
        L67:
            ai.p7 r6 = r11.f12047l
            ai.n7 r7 = r11.f12048m
            r8 = 0
            r5 = r14
            android.util.Pair r0 = r5.m(r6, r7, r8, r9)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r11.f12053r
            if (r0 == 0) goto L86
            ai.uo3 r12 = r11.f12049n
            ai.uo3 r12 = r12.s(r14)
            goto L8a
        L86:
            ai.uo3 r12 = ai.uo3.r(r14, r12, r1)
        L8a:
            r11.f12049n = r12
            ai.to3 r12 = r11.f12050o
            if (r12 == 0) goto L9f
            r11.E(r2)
            ai.bp3 r12 = r12.f10360w
            java.lang.Object r13 = r12.f9603a
            java.lang.Object r13 = r11.D(r13)
            ai.bp3 r13 = r12.c(r13)
        L9f:
            r12 = 1
            r11.f12053r = r12
            r11.f12052q = r12
            ai.uo3 r12 = r11.f12049n
            r11.s(r12)
            if (r13 == 0) goto Lb3
            ai.to3 r12 = r11.f12050o
            java.util.Objects.requireNonNull(r12)
            r12.t(r13)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.xo3.z(java.lang.Object, ai.dp3, ai.q7):void");
    }
}
