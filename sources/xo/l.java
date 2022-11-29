package xo;

/* loaded from: classes4.dex */
public final /* synthetic */ class l {

    /* loaded from: classes4.dex */
    public static final class a implements xo.c<T> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ xo.c f60531w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f60532x;

        public a(xo.c cVar, int i10) {
            this.f60531w = cVar;
            this.f60532x = i10;
        }

        @Override // xo.c
        public Object a(xo.d<? super T> dVar, ao.d<? super wn.v> dVar2) {
            Object a10 = this.f60531w.a(new b(new jo.c0(), this.f60532x, dVar), dVar2);
            return a10 == bo.c.c() ? a10 : wn.v.f59242a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b<T> implements xo.d {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ jo.c0 f60533w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f60534x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xo.d<T> f60535y;

        @co.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {25}, m = "emit")
        /* loaded from: classes4.dex */
        public static final class a extends co.d {

            /* renamed from: w  reason: collision with root package name */
            public /* synthetic */ Object f60536w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ b<T> f60537x;

            /* renamed from: y  reason: collision with root package name */
            public int f60538y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, ao.d<? super a> dVar) {
                super(dVar);
                this.f60537x = bVar;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                this.f60536w = obj;
                this.f60538y |= Integer.MIN_VALUE;
                return this.f60537x.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(jo.c0 c0Var, int i10, xo.d<? super T> dVar) {
            this.f60533w = c0Var;
            this.f60534x = i10;
            this.f60535y = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // xo.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, ao.d<? super wn.v> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof xo.l.b.a
                if (r0 == 0) goto L13
                r0 = r7
                xo.l$b$a r0 = (xo.l.b.a) r0
                int r1 = r0.f60538y
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f60538y = r1
                goto L18
            L13:
                xo.l$b$a r0 = new xo.l$b$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f60536w
                java.lang.Object r1 = bo.c.c()
                int r2 = r0.f60538y
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                wn.m.b(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                wn.m.b(r7)
                jo.c0 r7 = r5.f60533w
                int r2 = r7.f38129w
                int r4 = r5.f60534x
                if (r2 < r4) goto L4a
                xo.d<T> r7 = r5.f60535y
                r0.f60538y = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                wn.v r6 = wn.v.f59242a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.f38129w = r2
                wn.v r6 = wn.v.f59242a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: xo.l.b.emit(java.lang.Object, ao.d):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements xo.c<T> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ xo.c f60539w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p f60540x;

        public c(xo.c cVar, io.p pVar) {
            this.f60539w = cVar;
            this.f60540x = pVar;
        }

        @Override // xo.c
        public Object a(xo.d<? super T> dVar, ao.d<? super wn.v> dVar2) {
            Object a10 = this.f60539w.a(new d(new jo.a0(), dVar, this.f60540x), dVar2);
            return a10 == bo.c.c() ? a10 : wn.v.f59242a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d<T> implements xo.d {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ jo.a0 f60541w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ xo.d<T> f60542x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.p<T, ao.d<? super Boolean>, Object> f60543y;

        @co.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
        /* loaded from: classes4.dex */
        public static final class a extends co.d {
            public int A;

            /* renamed from: w  reason: collision with root package name */
            public Object f60544w;

            /* renamed from: x  reason: collision with root package name */
            public Object f60545x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ Object f60546y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ d<T> f60547z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, ao.d<? super a> dVar2) {
                super(dVar2);
                this.f60547z = dVar;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                this.f60546y = obj;
                this.A |= Integer.MIN_VALUE;
                return this.f60547z.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(jo.a0 a0Var, xo.d<? super T> dVar, io.p<? super T, ? super ao.d<? super Boolean>, ? extends Object> pVar) {
            this.f60541w = a0Var;
            this.f60542x = dVar;
            this.f60543y = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        @Override // xo.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r7, ao.d<? super wn.v> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof xo.l.d.a
                if (r0 == 0) goto L13
                r0 = r8
                xo.l$d$a r0 = (xo.l.d.a) r0
                int r1 = r0.A
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.A = r1
                goto L18
            L13:
                xo.l$d$a r0 = new xo.l$d$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f60546y
                java.lang.Object r1 = bo.c.c()
                int r2 = r0.A
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                wn.m.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f60545x
                java.lang.Object r2 = r0.f60544w
                xo.l$d r2 = (xo.l.d) r2
                wn.m.b(r8)
                goto L6c
            L41:
                wn.m.b(r8)
                goto L59
            L45:
                wn.m.b(r8)
                jo.a0 r8 = r6.f60541w
                boolean r8 = r8.f38125w
                if (r8 == 0) goto L5c
                xo.d<T> r8 = r6.f60542x
                r0.A = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                wn.v r7 = wn.v.f59242a
                return r7
            L5c:
                io.p<T, ao.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f60543y
                r0.f60544w = r6
                r0.f60545x = r7
                r0.A = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                jo.a0 r8 = r2.f60541w
                r8.f38125w = r5
                xo.d<T> r8 = r2.f60542x
                r2 = 0
                r0.f60544w = r2
                r0.f60545x = r2
                r0.A = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                wn.v r7 = wn.v.f59242a
                return r7
            L8b:
                wn.v r7 = wn.v.f59242a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: xo.l.d.emit(java.lang.Object, ao.d):java.lang.Object");
        }
    }

    @co.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {73}, m = "emitAbort$FlowKt__LimitKt")
    /* loaded from: classes4.dex */
    public static final class e<T> extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f60548w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f60549x;

        /* renamed from: y  reason: collision with root package name */
        public int f60550y;

        public e(ao.d<? super e> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f60549x = obj;
            this.f60550y |= Integer.MIN_VALUE;
            return l.d(null, null, this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements xo.c<T> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ xo.c f60551w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f60552x;

        @co.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {115}, m = "collect")
        /* loaded from: classes4.dex */
        public static final class a extends co.d {

            /* renamed from: w  reason: collision with root package name */
            public /* synthetic */ Object f60553w;

            /* renamed from: x  reason: collision with root package name */
            public int f60554x;

            /* renamed from: z  reason: collision with root package name */
            public Object f60556z;

            public a(ao.d dVar) {
                super(dVar);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                this.f60553w = obj;
                this.f60554x |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        public f(xo.c cVar, int i10) {
            this.f60551w = cVar;
            this.f60552x = i10;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
            r8 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
            yo.m.a(r8, r7);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        /* JADX WARN: Type inference failed for: r7v0, types: [xo.d, xo.d<? super T>, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v1, types: [xo.d] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v8 */
        @Override // xo.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(xo.d<? super T> r7, ao.d<? super wn.v> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof xo.l.f.a
                if (r0 == 0) goto L13
                r0 = r8
                xo.l$f$a r0 = (xo.l.f.a) r0
                int r1 = r0.f60554x
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f60554x = r1
                goto L18
            L13:
                xo.l$f$a r0 = new xo.l$f$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f60553w
                java.lang.Object r1 = bo.c.c()
                int r2 = r0.f60554x
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f60556z
                xo.d r7 = (xo.d) r7
                wn.m.b(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                goto L55
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                wn.m.b(r8)
                jo.c0 r8 = new jo.c0
                r8.<init>()
                xo.c r2 = r6.f60551w     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                xo.l$g r4 = new xo.l$g     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                int r5 = r6.f60552x     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                r4.<init>(r8, r5, r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                r0.f60556z = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                r0.f60554x = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                java.lang.Object r7 = r2.a(r4, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                if (r7 != r1) goto L55
                return r1
            L51:
                r8 = move-exception
                yo.m.a(r8, r7)
            L55:
                wn.v r7 = wn.v.f59242a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: xo.l.f.a(xo.d, ao.d):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    public static final class g<T> implements xo.d {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ jo.c0 f60557w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f60558x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xo.d<T> f60559y;

        @co.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {61, 63}, m = "emit")
        /* loaded from: classes4.dex */
        public static final class a extends co.d {

            /* renamed from: w  reason: collision with root package name */
            public /* synthetic */ Object f60560w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ g<T> f60561x;

            /* renamed from: y  reason: collision with root package name */
            public int f60562y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(g<? super T> gVar, ao.d<? super a> dVar) {
                super(dVar);
                this.f60561x = gVar;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                this.f60560w = obj;
                this.f60562y |= Integer.MIN_VALUE;
                return this.f60561x.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g(jo.c0 c0Var, int i10, xo.d<? super T> dVar) {
            this.f60557w = c0Var;
            this.f60558x = i10;
            this.f60559y = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        @Override // xo.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, ao.d<? super wn.v> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof xo.l.g.a
                if (r0 == 0) goto L13
                r0 = r7
                xo.l$g$a r0 = (xo.l.g.a) r0
                int r1 = r0.f60562y
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f60562y = r1
                goto L18
            L13:
                xo.l$g$a r0 = new xo.l$g$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f60560w
                java.lang.Object r1 = bo.c.c()
                int r2 = r0.f60562y
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                wn.m.b(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                wn.m.b(r7)
                goto L51
            L38:
                wn.m.b(r7)
                jo.c0 r7 = r5.f60557w
                int r2 = r7.f38129w
                int r2 = r2 + r4
                r7.f38129w = r2
                int r7 = r5.f60558x
                if (r2 >= r7) goto L54
                xo.d<T> r7 = r5.f60559y
                r0.f60562y = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                wn.v r6 = wn.v.f59242a
                return r6
            L54:
                xo.d<T> r7 = r5.f60559y
                r0.f60562y = r3
                java.lang.Object r6 = xo.l.a(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                wn.v r6 = wn.v.f59242a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: xo.l.g.emit(java.lang.Object, ao.d):java.lang.Object");
        }
    }

    public static final <T> xo.c<T> b(xo.c<? extends T> cVar, int i10) {
        if (i10 >= 0) {
            return new a(cVar, i10);
        }
        throw new IllegalArgumentException(jo.p.o("Drop count should be non-negative, but had ", Integer.valueOf(i10)).toString());
    }

    public static final <T> xo.c<T> c(xo.c<? extends T> cVar, io.p<? super T, ? super ao.d<? super Boolean>, ? extends Object> pVar) {
        return new c(cVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object d(xo.d<? super T> r4, T r5, ao.d<? super wn.v> r6) {
        /*
            boolean r0 = r6 instanceof xo.l.e
            if (r0 == 0) goto L13
            r0 = r6
            xo.l$e r0 = (xo.l.e) r0
            int r1 = r0.f60550y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60550y = r1
            goto L18
        L13:
            xo.l$e r0 = new xo.l$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f60549x
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f60550y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f60548w
            xo.d r4 = (xo.d) r4
            wn.m.b(r6)
            goto L43
        L35:
            wn.m.b(r6)
            r0.f60548w = r4
            r0.f60550y = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.l.d(xo.d, java.lang.Object, ao.d):java.lang.Object");
    }

    public static final <T> xo.c<T> e(xo.c<? extends T> cVar, int i10) {
        if (i10 > 0) {
            return new f(cVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }
}
