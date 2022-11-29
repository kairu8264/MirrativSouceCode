package xo;

/* loaded from: classes4.dex */
public final /* synthetic */ class k {

    /* loaded from: classes4.dex */
    public static final class a implements c<T> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p f60519w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c f60520x;

        @co.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {116, 120}, m = "collect")
        /* renamed from: xo.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C1018a extends co.d {
            public Object A;
            public Object B;

            /* renamed from: w  reason: collision with root package name */
            public /* synthetic */ Object f60521w;

            /* renamed from: x  reason: collision with root package name */
            public int f60522x;

            /* renamed from: z  reason: collision with root package name */
            public Object f60524z;

            public C1018a(ao.d dVar) {
                super(dVar);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                this.f60521w = obj;
                this.f60522x |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(io.p pVar, c cVar) {
            this.f60519w = pVar;
            this.f60520x = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        @Override // xo.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(xo.d<? super T> r7, ao.d<? super wn.v> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof xo.k.a.C1018a
                if (r0 == 0) goto L13
                r0 = r8
                xo.k$a$a r0 = (xo.k.a.C1018a) r0
                int r1 = r0.f60522x
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f60522x = r1
                goto L18
            L13:
                xo.k$a$a r0 = new xo.k$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f60521w
                java.lang.Object r1 = bo.c.c()
                int r2 = r0.f60522x
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                wn.m.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.B
                yo.r r7 = (yo.r) r7
                java.lang.Object r2 = r0.A
                xo.d r2 = (xo.d) r2
                java.lang.Object r4 = r0.f60524z
                xo.k$a r4 = (xo.k.a) r4
                wn.m.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                wn.m.b(r8)
                yo.r r8 = new yo.r
                ao.g r2 = r0.getContext()
                r8.<init>(r7, r2)
                io.p r2 = r6.f60519w     // Catch: java.lang.Throwable -> L86
                r0.f60524z = r6     // Catch: java.lang.Throwable -> L86
                r0.A = r7     // Catch: java.lang.Throwable -> L86
                r0.B = r8     // Catch: java.lang.Throwable -> L86
                r0.f60522x = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                jo.n.a(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                jo.n.a(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                xo.c r7 = r4.f60520x
                r8 = 0
                r0.f60524z = r8
                r0.A = r8
                r0.B = r8
                r0.f60522x = r3
                java.lang.Object r7 = r7.a(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                wn.v r7 = wn.v.f59242a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: xo.k.a.a(xo.d, ao.d):java.lang.Object");
        }
    }

    public static final void a(d<?> dVar) {
        if (dVar instanceof l0) {
            throw ((l0) dVar).f60563w;
        }
    }

    public static final <T> c<T> b(c<? extends T> cVar, io.p<? super d<? super T>, ? super ao.d<? super wn.v>, ? extends Object> pVar) {
        return new a(pVar, cVar);
    }
}
