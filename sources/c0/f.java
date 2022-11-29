package c0;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final m0.e<h> f18600a = new m0.e<>(new h[16], 0);

    @co.f(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {121}, m = "bringIntoView")
    /* loaded from: classes.dex */
    public static final class a extends co.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: w  reason: collision with root package name */
        public Object f18601w;

        /* renamed from: x  reason: collision with root package name */
        public Object f18602x;

        /* renamed from: y  reason: collision with root package name */
        public int f18603y;

        /* renamed from: z  reason: collision with root package name */
        public int f18604z;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return f.this.a(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r8 < r2) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:20:0x0067). Please submit an issue!!! */
    @Override // c0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(b1.h r8, ao.d<? super wn.v> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof c0.f.a
            if (r0 == 0) goto L13
            r0 = r9
            c0.f$a r0 = (c0.f.a) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            c0.f$a r0 = new c0.f$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.A
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.C
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f18604z
            int r2 = r0.f18603y
            java.lang.Object r4 = r0.f18602x
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f18601w
            b1.h r5 = (b1.h) r5
            wn.m.b(r9)
            r9 = r5
            goto L67
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            wn.m.b(r9)
            m0.e<c0.h> r9 = r7.f18600a
            int r2 = r9.p()
            if (r2 <= 0) goto L6a
            r4 = 0
            java.lang.Object[] r9 = r9.n()
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L52:
            r5 = r4[r8]
            c0.h r5 = (c0.h) r5
            r0.f18601w = r9
            r0.f18602x = r4
            r0.f18603y = r2
            r0.f18604z = r8
            r0.C = r3
            java.lang.Object r5 = r5.f(r9, r0)
            if (r5 != r1) goto L67
            return r1
        L67:
            int r8 = r8 + r3
            if (r8 < r2) goto L52
        L6a:
            wn.v r8 = wn.v.f59242a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.f.a(b1.h, ao.d):java.lang.Object");
    }

    public final m0.e<h> c() {
        return this.f18600a;
    }
}
