package ai;

/* loaded from: classes3.dex */
public final class nr3 implements Comparable<nr3> {
    public final int A;
    public final int B;
    public final int C;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f7447w;

    /* renamed from: x  reason: collision with root package name */
    public final ir3 f7448x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f7449y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f7450z;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r4 <= 2.14748365E9f) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
        if (r10 >= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
        if (r10 >= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
        if (r10 >= 0.0f) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0056, code lost:
        if (r10 >= 0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public nr3(ai.v4 r7, ai.ir3 r8, int r9, boolean r10) {
        /*
            r6 = this;
            r6.<init>()
            r6.f7448x = r8
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1
            r2 = -1
            r3 = 0
            if (r10 == 0) goto L2e
            int r4 = r7.f10965q
            if (r4 == r2) goto L12
            int r4 = r8.f10096a
        L12:
            int r4 = r7.f10966r
            if (r4 == r2) goto L18
            int r4 = r8.f10097b
        L18:
            float r4 = r7.f10967s
            int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r5 == 0) goto L26
            int r5 = r8.f10098c
            r5 = 1325400064(0x4f000000, float:2.14748365E9)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L2e
        L26:
            int r4 = r7.f10956h
            if (r4 == r2) goto L2c
            int r4 = r8.f10099d
        L2c:
            r4 = r1
            goto L2f
        L2e:
            r4 = r3
        L2f:
            r6.f7447w = r4
            if (r10 == 0) goto L59
            int r10 = r7.f10965q
            if (r10 == r2) goto L3b
            int r4 = r8.f10100e
            if (r10 < 0) goto L59
        L3b:
            int r10 = r7.f10966r
            if (r10 == r2) goto L43
            int r4 = r8.f10101f
            if (r10 < 0) goto L59
        L43:
            float r10 = r7.f10967s
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L50
            int r0 = r8.f10102g
            r0 = 0
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L59
        L50:
            int r10 = r7.f10956h
            if (r10 == r2) goto L5a
            int r0 = r8.f10103h
            if (r10 < 0) goto L59
            goto L5a
        L59:
            r1 = r3
        L5a:
            r6.f7449y = r1
            boolean r9 = ai.or3.k(r9, r3)
            r6.f7450z = r9
            int r9 = r7.f10956h
            r6.A = r9
            int r9 = r7.c()
            r6.B = r9
        L6c:
            ai.zz2<java.lang.String> r9 = r8.f10107l
            int r9 = r9.size()
            if (r3 >= r9) goto L88
            java.lang.String r9 = r7.f10960l
            if (r9 == 0) goto L85
            ai.zz2<java.lang.String> r10 = r8.f10107l
            java.lang.Object r10 = r10.get(r3)
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L85
            goto L8b
        L85:
            int r3 = r3 + 1
            goto L6c
        L88:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L8b:
            r6.C = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.nr3.<init>(ai.v4, ai.ir3, int, boolean):void");
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(nr3 nr3Var) {
        l13 l13Var;
        l13 a10;
        l13 l13Var2;
        if (this.f7447w && this.f7450z) {
            a10 = or3.f7891f;
        } else {
            l13Var = or3.f7891f;
            a10 = l13Var.a();
        }
        nz2 a11 = nz2.i().d(this.f7450z, nr3Var.f7450z).d(this.f7447w, nr3Var.f7447w).d(this.f7449y, nr3Var.f7449y).a(Integer.valueOf(this.C), Integer.valueOf(nr3Var.C), l13.b().a());
        Integer valueOf = Integer.valueOf(this.A);
        Integer valueOf2 = Integer.valueOf(nr3Var.A);
        boolean z10 = this.f7448x.f10116u;
        l13Var2 = or3.f7892g;
        return a11.a(valueOf, valueOf2, l13Var2).a(Integer.valueOf(this.B), Integer.valueOf(nr3Var.B), a10).a(Integer.valueOf(this.A), Integer.valueOf(nr3Var.A), a10).e();
    }
}
