package y;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f60909a;

    /* renamed from: b  reason: collision with root package name */
    public final int f60910b;

    /* renamed from: c  reason: collision with root package name */
    public final int f60911c;

    /* renamed from: d  reason: collision with root package name */
    public final int f60912d;

    public q0(int i10, int i11, int i12, int i13) {
        this.f60909a = i10;
        this.f60910b = i11;
        this.f60911c = i12;
        this.f60912d = i13;
    }

    public /* synthetic */ q0(long j10, g0 g0Var, jo.h hVar) {
        this(j10, g0Var);
    }

    public static /* synthetic */ q0 b(q0 q0Var, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = q0Var.f60909a;
        }
        if ((i14 & 2) != 0) {
            i11 = q0Var.f60910b;
        }
        if ((i14 & 4) != 0) {
            i12 = q0Var.f60911c;
        }
        if ((i14 & 8) != 0) {
            i13 = q0Var.f60912d;
        }
        return q0Var.a(i10, i11, i12, i13);
    }

    public final q0 a(int i10, int i11, int i12, int i13) {
        return new q0(i10, i11, i12, i13);
    }

    public final int c() {
        return this.f60912d;
    }

    public final int d() {
        return this.f60911c;
    }

    public final int e() {
        return this.f60910b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            return this.f60909a == q0Var.f60909a && this.f60910b == q0Var.f60910b && this.f60911c == q0Var.f60911c && this.f60912d == q0Var.f60912d;
        }
        return false;
    }

    public final int f() {
        return this.f60909a;
    }

    public final long g(g0 g0Var) {
        jo.p.h(g0Var, "orientation");
        if (g0Var == g0.Horizontal) {
            return m2.c.a(this.f60909a, this.f60910b, this.f60911c, this.f60912d);
        }
        return m2.c.a(this.f60911c, this.f60912d, this.f60909a, this.f60910b);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f60909a) * 31) + Integer.hashCode(this.f60910b)) * 31) + Integer.hashCode(this.f60911c)) * 31) + Integer.hashCode(this.f60912d);
    }

    public String toString() {
        return "OrientationIndependentConstraints(mainAxisMin=" + this.f60909a + ", mainAxisMax=" + this.f60910b + ", crossAxisMin=" + this.f60911c + ", crossAxisMax=" + this.f60912d + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q0(long r5, y.g0 r7) {
        /*
            r4 = this;
            y.g0 r0 = y.g0.Horizontal
            if (r7 != r0) goto L9
            int r1 = m2.b.p(r5)
            goto Ld
        L9:
            int r1 = m2.b.o(r5)
        Ld:
            if (r7 != r0) goto L14
            int r2 = m2.b.n(r5)
            goto L18
        L14:
            int r2 = m2.b.m(r5)
        L18:
            if (r7 != r0) goto L1f
            int r3 = m2.b.o(r5)
            goto L23
        L1f:
            int r3 = m2.b.p(r5)
        L23:
            if (r7 != r0) goto L2a
            int r5 = m2.b.m(r5)
            goto L2e
        L2a:
            int r5 = m2.b.n(r5)
        L2e:
            r4.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.q0.<init>(long, y.g0):void");
    }
}
