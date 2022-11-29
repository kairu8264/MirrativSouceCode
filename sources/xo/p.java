package xo;

/* loaded from: classes4.dex */
public final /* synthetic */ class p {

    /* loaded from: classes4.dex */
    public static final class a implements c<T> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c f60595w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p f60596x;

        /* renamed from: xo.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C1021a<T> implements d {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d f60597w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.p f60598x;

            @co.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223, 224}, m = "emit")
            /* renamed from: xo.p$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C1022a extends co.d {
                public Object A;

                /* renamed from: w  reason: collision with root package name */
                public /* synthetic */ Object f60599w;

                /* renamed from: x  reason: collision with root package name */
                public int f60600x;

                /* renamed from: z  reason: collision with root package name */
                public Object f60602z;

                public C1022a(ao.d dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f60599w = obj;
                    this.f60600x |= Integer.MIN_VALUE;
                    return C1021a.this.emit(null, this);
                }
            }

            public C1021a(d dVar, io.p pVar) {
                this.f60597w = dVar;
                this.f60598x = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
            @Override // xo.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r6, ao.d<? super wn.v> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof xo.p.a.C1021a.C1022a
                    if (r0 == 0) goto L13
                    r0 = r7
                    xo.p$a$a$a r0 = (xo.p.a.C1021a.C1022a) r0
                    int r1 = r0.f60600x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f60600x = r1
                    goto L18
                L13:
                    xo.p$a$a$a r0 = new xo.p$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f60599w
                    java.lang.Object r1 = bo.c.c()
                    int r2 = r0.f60600x
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    wn.m.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.A
                    xo.d r6 = (xo.d) r6
                    java.lang.Object r2 = r0.f60602z
                    wn.m.b(r7)
                    goto L5c
                L3e:
                    wn.m.b(r7)
                    xo.d r7 = r5.f60597w
                    io.p r2 = r5.f60598x
                    r0.f60602z = r6
                    r0.A = r7
                    r0.f60600x = r4
                    r4 = 6
                    jo.n.a(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    jo.n.a(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f60602z = r7
                    r0.A = r7
                    r0.f60600x = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    wn.v r6 = wn.v.f59242a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: xo.p.a.C1021a.emit(java.lang.Object, ao.d):java.lang.Object");
            }
        }

        public a(c cVar, io.p pVar) {
            this.f60595w = cVar;
            this.f60596x = pVar;
        }

        @Override // xo.c
        public Object a(d dVar, ao.d dVar2) {
            Object a10 = this.f60595w.a(new C1021a(dVar, this.f60596x), dVar2);
            return a10 == bo.c.c() ? a10 : wn.v.f59242a;
        }
    }

    public static final <T> c<T> a(c<? extends T> cVar, io.p<? super T, ? super ao.d<? super wn.v>, ? extends Object> pVar) {
        return new a(cVar, pVar);
    }
}
