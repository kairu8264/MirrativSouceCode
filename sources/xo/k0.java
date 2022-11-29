package xo;

/* loaded from: classes4.dex */
public final class k0<T> implements d<T> {

    /* renamed from: w  reason: collision with root package name */
    public final d<T> f60525w;

    /* renamed from: x  reason: collision with root package name */
    public final io.p<d<? super T>, ao.d<? super wn.v>, Object> f60526x;

    @co.f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    /* loaded from: classes4.dex */
    public static final class a extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f60527w;

        /* renamed from: x  reason: collision with root package name */
        public Object f60528x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f60529y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ k0<T> f60530z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k0<T> k0Var, ao.d<? super a> dVar) {
            super(dVar);
            this.f60530z = k0Var;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f60529y = obj;
            this.A |= Integer.MIN_VALUE;
            return this.f60530z.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [yo.r] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ao.d<? super wn.v> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof xo.k0.a
            if (r0 == 0) goto L13
            r0 = r7
            xo.k0$a r0 = (xo.k0.a) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            xo.k0$a r0 = new xo.k0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f60529y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            wn.m.b(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f60528x
            yo.r r2 = (yo.r) r2
            java.lang.Object r4 = r0.f60527w
            xo.k0 r4 = (xo.k0) r4
            wn.m.b(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            wn.m.b(r7)
            yo.r r2 = new yo.r
            xo.d<T> r7 = r6.f60525w
            ao.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            io.p<xo.d<? super T>, ao.d<? super wn.v>, java.lang.Object> r7 = r6.f60526x     // Catch: java.lang.Throwable -> L7d
            r0.f60527w = r6     // Catch: java.lang.Throwable -> L7d
            r0.f60528x = r2     // Catch: java.lang.Throwable -> L7d
            r0.A = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            xo.d<T> r7 = r4.f60525w
            boolean r2 = r7 instanceof xo.k0
            if (r2 == 0) goto L7a
            xo.k0 r7 = (xo.k0) r7
            r2 = 0
            r0.f60527w = r2
            r0.f60528x = r2
            r0.A = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            wn.v r7 = wn.v.f59242a
            return r7
        L7a:
            wn.v r7 = wn.v.f59242a
            return r7
        L7d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.k0.a(ao.d):java.lang.Object");
    }

    @Override // xo.d
    public Object emit(T t10, ao.d<? super wn.v> dVar) {
        return this.f60525w.emit(t10, dVar);
    }
}
