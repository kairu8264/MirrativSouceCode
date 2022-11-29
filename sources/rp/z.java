package rp;

/* loaded from: classes4.dex */
public final class z implements h0 {
    public boolean A;
    public long B;

    /* renamed from: w  reason: collision with root package name */
    public final e f51739w;

    /* renamed from: x  reason: collision with root package name */
    public final c f51740x;

    /* renamed from: y  reason: collision with root package name */
    public c0 f51741y;

    /* renamed from: z  reason: collision with root package name */
    public int f51742z;

    public z(e eVar) {
        jo.p.h(eVar, "upstream");
        this.f51739w = eVar;
        c l10 = eVar.l();
        this.f51740x = l10;
        c0 c0Var = l10.f51656w;
        this.f51741y = c0Var;
        this.f51742z = c0Var == null ? -1 : c0Var.f51666b;
    }

    @Override // rp.h0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r5 == r6.f51666b) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    @Override // rp.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long f1(rp.c r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            jo.p.h(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto Lf
            r5 = r4
            goto L10
        Lf:
            r5 = r3
        L10:
            if (r5 == 0) goto L87
            boolean r5 = r8.A
            r5 = r5 ^ r4
            if (r5 == 0) goto L7b
            rp.c0 r5 = r8.f51741y
            if (r5 == 0) goto L2a
            rp.c r6 = r8.f51740x
            rp.c0 r6 = r6.f51656w
            if (r5 != r6) goto L2b
            int r5 = r8.f51742z
            jo.p.e(r6)
            int r6 = r6.f51666b
            if (r5 != r6) goto L2b
        L2a:
            r3 = r4
        L2b:
            if (r3 == 0) goto L6f
            if (r2 != 0) goto L30
            return r0
        L30:
            rp.e r0 = r8.f51739w
            long r1 = r8.B
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.n0(r1)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            rp.c0 r0 = r8.f51741y
            if (r0 != 0) goto L53
            rp.c r0 = r8.f51740x
            rp.c0 r0 = r0.f51656w
            if (r0 == 0) goto L53
            r8.f51741y = r0
            jo.p.e(r0)
            int r0 = r0.f51666b
            r8.f51742z = r0
        L53:
            rp.c r0 = r8.f51740x
            long r0 = r0.X()
            long r2 = r8.B
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            rp.c r2 = r8.f51740x
            long r4 = r8.B
            r3 = r9
            r6 = r10
            r2.i(r3, r4, r6)
            long r0 = r8.B
            long r0 = r0 + r10
            r8.B = r0
            return r10
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L87:
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r9 = jo.p.o(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rp.z.f1(rp.c, long):long");
    }

    @Override // rp.h0
    public i0 m() {
        return this.f51739w.m();
    }
}
