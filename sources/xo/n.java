package xo;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes4.dex */
public final /* synthetic */ class n {

    /* loaded from: classes4.dex */
    public static final class a implements xo.d<T> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ jo.e0 f60569w;

        public a(jo.e0 e0Var) {
            this.f60569w = e0Var;
        }

        @Override // xo.d
        public Object emit(T t10, ao.d<? super wn.v> dVar) {
            this.f60569w.f38136w = t10;
            throw new AbortFlowException(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements xo.d<T> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p f60570w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ jo.e0 f60571x;

        @co.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {143}, m = "emit")
        /* loaded from: classes4.dex */
        public static final class a extends co.d {
            public Object A;

            /* renamed from: w  reason: collision with root package name */
            public Object f60572w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f60573x;

            /* renamed from: y  reason: collision with root package name */
            public int f60574y;

            public a(ao.d dVar) {
                super(dVar);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                this.f60573x = obj;
                this.f60574y |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(io.p pVar, jo.e0 e0Var) {
            this.f60570w = pVar;
            this.f60571x = e0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        @Override // xo.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(T r5, ao.d<? super wn.v> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof xo.n.b.a
                if (r0 == 0) goto L13
                r0 = r6
                xo.n$b$a r0 = (xo.n.b.a) r0
                int r1 = r0.f60574y
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f60574y = r1
                goto L18
            L13:
                xo.n$b$a r0 = new xo.n$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f60573x
                java.lang.Object r1 = bo.c.c()
                int r2 = r0.f60574y
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.A
                java.lang.Object r0 = r0.f60572w
                xo.n$b r0 = (xo.n.b) r0
                wn.m.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                wn.m.b(r6)
                io.p r6 = r4.f60570w
                r0.f60572w = r4
                r0.A = r5
                r0.f60574y = r3
                r2 = 6
                jo.n.a(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                jo.n.a(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5f
                jo.e0 r6 = r0.f60571x
                r6.f38136w = r5
                r3 = 0
            L5f:
                if (r3 == 0) goto L64
                wn.v r5 = wn.v.f59242a
                return r5
            L64:
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: xo.n.b.emit(java.lang.Object, ao.d):java.lang.Object");
        }
    }

    @co.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    /* loaded from: classes4.dex */
    public static final class c<T> extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f60576w;

        /* renamed from: x  reason: collision with root package name */
        public Object f60577x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f60578y;

        /* renamed from: z  reason: collision with root package name */
        public int f60579z;

        public c(ao.d<? super c> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f60578y = obj;
            this.f60579z |= Integer.MIN_VALUE;
            return e.o(null, this);
        }
    }

    @co.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    /* loaded from: classes4.dex */
    public static final class d<T> extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f60580w;

        /* renamed from: x  reason: collision with root package name */
        public Object f60581x;

        /* renamed from: y  reason: collision with root package name */
        public Object f60582y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f60583z;

        public d(ao.d<? super d> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f60583z = obj;
            this.A |= Integer.MIN_VALUE;
            return e.p(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object a(xo.c<? extends T> r4, ao.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof xo.n.c
            if (r0 == 0) goto L13
            r0 = r5
            xo.n$c r0 = (xo.n.c) r0
            int r1 = r0.f60579z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60579z = r1
            goto L18
        L13:
            xo.n$c r0 = new xo.n$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f60578y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f60579z
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f60577x
            xo.n$a r4 = (xo.n.a) r4
            java.lang.Object r0 = r0.f60576w
            jo.e0 r0 = (jo.e0) r0
            wn.m.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            wn.m.b(r5)
            jo.e0 r5 = new jo.e0
            r5.<init>()
            zo.k0 r2 = yo.q.f62129a
            r5.f38136w = r2
            xo.n$a r2 = new xo.n$a
            r2.<init>(r5)
            r0.f60576w = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f60577x = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f60579z = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            yo.m.a(r5, r4)
        L62:
            T r4 = r0.f38136w
            zo.k0 r5 = yo.q.f62129a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.n.a(xo.c, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object b(xo.c<? extends T> r4, io.p<? super T, ? super ao.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, ao.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof xo.n.d
            if (r0 == 0) goto L13
            r0 = r6
            xo.n$d r0 = (xo.n.d) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            xo.n$d r0 = new xo.n$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f60583z
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.f60582y
            xo.n$b r4 = (xo.n.b) r4
            java.lang.Object r5 = r0.f60581x
            jo.e0 r5 = (jo.e0) r5
            java.lang.Object r0 = r0.f60580w
            io.p r0 = (io.p) r0
            wn.m.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            wn.m.b(r6)
            jo.e0 r6 = new jo.e0
            r6.<init>()
            zo.k0 r2 = yo.q.f62129a
            r6.f38136w = r2
            xo.n$b r2 = new xo.n$b
            r2.<init>(r5, r6)
            r0.f60580w = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f60581x = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f60582y = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.A = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            yo.m.a(r6, r4)
        L6a:
            T r4 = r5.f38136w
            zo.k0 r5 = yo.q.f62129a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate "
            java.lang.String r5 = jo.p.o(r5, r0)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.n.b(xo.c, io.p, ao.d):java.lang.Object");
    }
}
