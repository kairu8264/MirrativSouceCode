package f0;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final y1.z f31609a;

    /* renamed from: b  reason: collision with root package name */
    public q1.q f31610b;

    /* renamed from: c  reason: collision with root package name */
    public q1.q f31611c;

    public t0(y1.z zVar) {
        jo.p.h(zVar, "value");
        this.f31609a = zVar;
    }

    public static /* synthetic */ int e(t0 t0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return t0Var.d(i10, z10);
    }

    public static /* synthetic */ int h(t0 t0Var, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return t0Var.g(j10, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r2 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(long r6) {
        /*
            r5 = this;
            q1.q r0 = r5.f31610b
            if (r0 == 0) goto L1e
            boolean r1 = r0.h()
            r2 = 0
            if (r1 == 0) goto L16
            q1.q r1 = r5.f31611c
            if (r1 == 0) goto L1c
            r3 = 0
            r4 = 2
            b1.h r2 = q1.q.o(r1, r0, r3, r4, r2)
            goto L1c
        L16:
            b1.h$a r0 = b1.h.f16726e
            b1.h r2 = r0.a()
        L1c:
            if (r2 != 0) goto L24
        L1e:
            b1.h$a r0 = b1.h.f16726e
            b1.h r2 = r0.a()
        L24:
            long r6 = f0.u0.a(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.t0.a(long):long");
    }

    public final q1.q b() {
        return this.f31611c;
    }

    public final q1.q c() {
        return this.f31610b;
    }

    public final int d(int i10, boolean z10) {
        return this.f31609a.n(i10, z10);
    }

    public final int f(float f10) {
        return this.f31609a.q(b1.f.n(k(a(b1.g.a(0.0f, f10)))));
    }

    public final int g(long j10, boolean z10) {
        if (z10) {
            j10 = a(j10);
        }
        return this.f31609a.w(k(j10));
    }

    public final y1.z i() {
        return this.f31609a;
    }

    public final boolean j(long j10) {
        long k10 = k(a(j10));
        int q10 = this.f31609a.q(b1.f.n(k10));
        return b1.f.m(k10) >= this.f31609a.r(q10) && b1.f.m(k10) <= this.f31609a.s(q10);
    }

    public final long k(long j10) {
        b1.f fVar;
        q1.q qVar = this.f31610b;
        if (qVar != null) {
            q1.q qVar2 = this.f31611c;
            if (qVar2 != null) {
                fVar = b1.f.d((qVar.h() && qVar2.h()) ? qVar.z(qVar2, j10) : j10);
            } else {
                fVar = null;
            }
            return fVar != null ? fVar.u() : j10;
        }
        return j10;
    }

    public final void l(q1.q qVar) {
        this.f31611c = qVar;
    }

    public final void m(q1.q qVar) {
        this.f31610b = qVar;
    }
}
