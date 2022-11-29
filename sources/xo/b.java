package xo;

/* loaded from: classes4.dex */
public final class b<T> implements c<T> {

    /* renamed from: w  reason: collision with root package name */
    public final c<T> f60467w;

    /* renamed from: x  reason: collision with root package name */
    public final io.l<T, Object> f60468x;

    /* renamed from: y  reason: collision with root package name */
    public final io.p<Object, Object, Boolean> f60469y;

    /* loaded from: classes4.dex */
    public static final class a<T> implements d {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ b<T> f60470w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ jo.e0<Object> f60471x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ d<T> f60472y;

        @co.f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {81}, m = "emit")
        /* renamed from: xo.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C1015a extends co.d {

            /* renamed from: w  reason: collision with root package name */
            public /* synthetic */ Object f60473w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ a<T> f60474x;

            /* renamed from: y  reason: collision with root package name */
            public int f60475y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1015a(a<? super T> aVar, ao.d<? super C1015a> dVar) {
                super(dVar);
                this.f60474x = aVar;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                this.f60473w = obj;
                this.f60475y |= Integer.MIN_VALUE;
                return this.f60474x.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(b<T> bVar, jo.e0<Object> e0Var, d<? super T> dVar) {
            this.f60470w = bVar;
            this.f60471x = e0Var;
            this.f60472y = dVar;
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
                boolean r0 = r7 instanceof xo.b.a.C1015a
                if (r0 == 0) goto L13
                r0 = r7
                xo.b$a$a r0 = (xo.b.a.C1015a) r0
                int r1 = r0.f60475y
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f60475y = r1
                goto L18
            L13:
                xo.b$a$a r0 = new xo.b$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f60473w
                java.lang.Object r1 = bo.c.c()
                int r2 = r0.f60475y
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                wn.m.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                wn.m.b(r7)
                xo.b<T> r7 = r5.f60470w
                io.l<T, java.lang.Object> r7 = r7.f60468x
                java.lang.Object r7 = r7.invoke(r6)
                jo.e0<java.lang.Object> r2 = r5.f60471x
                T r2 = r2.f38136w
                zo.k0 r4 = yo.q.f62129a
                if (r2 == r4) goto L58
                xo.b<T> r4 = r5.f60470w
                io.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f60469y
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                wn.v r6 = wn.v.f59242a
                return r6
            L58:
                jo.e0<java.lang.Object> r2 = r5.f60471x
                r2.f38136w = r7
                xo.d<T> r7 = r5.f60472y
                r0.f60475y = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                wn.v r6 = wn.v.f59242a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: xo.b.a.emit(java.lang.Object, ao.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(c<? extends T> cVar, io.l<? super T, ? extends Object> lVar, io.p<Object, Object, Boolean> pVar) {
        this.f60467w = cVar;
        this.f60468x = lVar;
        this.f60469y = pVar;
    }

    @Override // xo.c
    public Object a(d<? super T> dVar, ao.d<? super wn.v> dVar2) {
        jo.e0 e0Var = new jo.e0();
        e0Var.f38136w = (T) yo.q.f62129a;
        Object a10 = this.f60467w.a(new a(this, e0Var, dVar), dVar2);
        return a10 == bo.c.c() ? a10 : wn.v.f59242a;
    }
}
