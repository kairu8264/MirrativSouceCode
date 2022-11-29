package w;

import dp.c;

/* loaded from: classes.dex */
public final class u implements t, m2.d {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ m2.d f57844w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f57845x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f57846y;

    /* renamed from: z  reason: collision with root package name */
    public final dp.c f57847z;

    @co.f(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {327}, m = "tryAwaitRelease")
    /* loaded from: classes.dex */
    public static final class a extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f57848w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57849x;

        /* renamed from: z  reason: collision with root package name */
        public int f57851z;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f57849x = obj;
            this.f57851z |= Integer.MIN_VALUE;
            return u.this.d1(this);
        }
    }

    public u(m2.d dVar) {
        jo.p.h(dVar, "density");
        this.f57844w = dVar;
        this.f57847z = dp.e.a(false);
    }

    @Override // m2.d
    public float G0() {
        return this.f57844w.G0();
    }

    @Override // m2.d
    public float I0(float f10) {
        return this.f57844w.I0(f10);
    }

    @Override // m2.d
    public int N0(long j10) {
        return this.f57844w.N0(j10);
    }

    @Override // m2.d
    public long W0(long j10) {
        return this.f57844w.W0(j10);
    }

    @Override // m2.d
    public int X(float f10) {
        return this.f57844w.X(f10);
    }

    @Override // m2.d
    public float c0(long j10) {
        return this.f57844w.c0(j10);
    }

    public final void d() {
        this.f57846y = true;
        c.a.c(this.f57847z, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // w.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d1(ao.d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof w.u.a
            if (r0 == 0) goto L13
            r0 = r5
            w.u$a r0 = (w.u.a) r0
            int r1 = r0.f57851z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57851z = r1
            goto L18
        L13:
            w.u$a r0 = new w.u$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f57849x
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f57851z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f57848w
            w.u r0 = (w.u) r0
            wn.m.b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            wn.m.b(r5)
            boolean r5 = r4.f57845x
            if (r5 != 0) goto L4e
            boolean r5 = r4.f57846y
            if (r5 != 0) goto L4e
            dp.c r5 = r4.f57847z
            r0.f57848w = r4
            r0.f57851z = r3
            r2 = 0
            java.lang.Object r5 = dp.c.a.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            boolean r5 = r0.f57845x
            java.lang.Boolean r5 = co.b.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w.u.d1(ao.d):java.lang.Object");
    }

    public final void e() {
        this.f57845x = true;
        c.a.c(this.f57847z, null, 1, null);
    }

    @Override // m2.d
    public long f(long j10) {
        return this.f57844w.f(j10);
    }

    @Override // m2.d
    public float getDensity() {
        return this.f57844w.getDensity();
    }

    public final void h() {
        c.a.b(this.f57847z, null, 1, null);
        this.f57845x = false;
        this.f57846y = false;
    }

    @Override // m2.d
    public float s(int i10) {
        return this.f57844w.s(i10);
    }

    @Override // m2.d
    public float t(float f10) {
        return this.f57844w.t(f10);
    }
}
