package z;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final m0.e<a> f62268a = new m0.e<>(new a[16], 0);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f62269a;

        /* renamed from: b  reason: collision with root package name */
        public final int f62270b;

        public a(int i10, int i11) {
            this.f62269a = i10;
            this.f62270b = i11;
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i11 >= i10)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        public final int a() {
            return this.f62270b;
        }

        public final int b() {
            return this.f62269a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f62269a == aVar.f62269a && this.f62270b == aVar.f62270b;
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f62269a) * 31) + Integer.hashCode(this.f62270b);
        }

        public String toString() {
            return "Interval(start=" + this.f62269a + ", end=" + this.f62270b + ')';
        }
    }

    public final a a(int i10, int i11) {
        a aVar = new a(i10, i11);
        this.f62268a.c(aVar);
        return aVar;
    }

    public final int b() {
        int a10 = this.f62268a.m().a();
        m0.e<a> eVar = this.f62268a;
        int p10 = eVar.p();
        if (p10 > 0) {
            int i10 = 0;
            a[] n10 = eVar.n();
            do {
                a aVar = n10[i10];
                if (aVar.a() > a10) {
                    a10 = aVar.a();
                }
                i10++;
            } while (i10 < p10);
            return a10;
        }
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c() {
        /*
            r7 = this;
            m0.e<z.j$a> r0 = r7.f62268a
            java.lang.Object r0 = r0.m()
            z.j$a r0 = (z.j.a) r0
            int r0 = r0.b()
            m0.e<z.j$a> r1 = r7.f62268a
            int r2 = r1.p()
            r3 = 0
            if (r2 <= 0) goto L2c
            java.lang.Object[] r1 = r1.n()
            r4 = r3
        L1a:
            r5 = r1[r4]
            z.j$a r5 = (z.j.a) r5
            int r6 = r5.b()
            if (r6 >= r0) goto L28
            int r0 = r5.b()
        L28:
            int r4 = r4 + 1
            if (r4 < r2) goto L1a
        L2c:
            if (r0 < 0) goto L2f
            r3 = 1
        L2f:
            if (r3 == 0) goto L32
            return r0
        L32:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.j.c():int");
    }

    public final boolean d() {
        return this.f62268a.s();
    }

    public final void e(a aVar) {
        jo.p.h(aVar, "interval");
        this.f62268a.u(aVar);
    }
}
