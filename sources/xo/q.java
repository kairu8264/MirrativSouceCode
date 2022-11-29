package xo;

/* loaded from: classes4.dex */
public final /* synthetic */ class q {

    /* loaded from: classes4.dex */
    public static final class a implements xo.c<R> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ xo.c[] f60603w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.r f60604x;

        @co.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {333, 333}, m = "invokeSuspend")
        /* renamed from: xo.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C1023a extends co.l implements io.q<xo.d<? super R>, Object[], ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f60605w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f60606x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ Object f60607y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.r f60608z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1023a(ao.d dVar, io.r rVar) {
                super(3, dVar);
                this.f60608z = rVar;
            }

            @Override // io.q
            /* renamed from: a */
            public final Object s0(xo.d<? super R> dVar, Object[] objArr, ao.d<? super wn.v> dVar2) {
                C1023a c1023a = new C1023a(dVar2, this.f60608z);
                c1023a.f60606x = dVar;
                c1023a.f60607y = objArr;
                return c1023a.invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                xo.d dVar;
                Object c10 = bo.c.c();
                int i10 = this.f60605w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    dVar = (xo.d) this.f60606x;
                    Object[] objArr = (Object[]) this.f60607y;
                    io.r rVar = this.f60608z;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f60606x = dVar;
                    this.f60605w = 1;
                    jo.n.a(6);
                    obj = rVar.F(obj2, obj3, obj4, this);
                    jo.n.a(7);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    if (i10 == 2) {
                        wn.m.b(obj);
                        return wn.v.f59242a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dVar = (xo.d) this.f60606x;
                    wn.m.b(obj);
                }
                this.f60606x = null;
                this.f60605w = 2;
                if (dVar.emit(obj, this) == c10) {
                    return c10;
                }
                return wn.v.f59242a;
            }
        }

        public a(xo.c[] cVarArr, io.r rVar) {
            this.f60603w = cVarArr;
            this.f60604x = rVar;
        }

        @Override // xo.c
        public Object a(xo.d dVar, ao.d dVar2) {
            Object a10 = yo.i.a(dVar, this.f60603w, q.e(), new C1023a(null, this.f60604x), dVar2);
            return a10 == bo.c.c() ? a10 : wn.v.f59242a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements xo.c<R> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ xo.c f60609w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ xo.c f60610x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.q f60611y;

        public b(xo.c cVar, xo.c cVar2, io.q qVar) {
            this.f60609w = cVar;
            this.f60610x = cVar2;
            this.f60611y = qVar;
        }

        @Override // xo.c
        public Object a(xo.d<? super R> dVar, ao.d<? super wn.v> dVar2) {
            Object a10 = yo.i.a(dVar, new xo.c[]{this.f60609w, this.f60610x}, q.e(), new c(this.f60611y, null), dVar2);
            return a10 == bo.c.c() ? a10 : wn.v.f59242a;
        }
    }

    @co.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {33, 33}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends co.l implements io.q<xo.d<? super R>, Object[], ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f60612w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f60613x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f60614y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.q<T1, T2, ao.d<? super R>, Object> f60615z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.q<? super T1, ? super T2, ? super ao.d<? super R>, ? extends Object> qVar, ao.d<? super c> dVar) {
            super(3, dVar);
            this.f60615z = qVar;
        }

        @Override // io.q
        /* renamed from: a */
        public final Object s0(xo.d<? super R> dVar, Object[] objArr, ao.d<? super wn.v> dVar2) {
            c cVar = new c(this.f60615z, dVar2);
            cVar.f60613x = dVar;
            cVar.f60614y = objArr;
            return cVar.invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            xo.d dVar;
            Object c10 = bo.c.c();
            int i10 = this.f60612w;
            if (i10 == 0) {
                wn.m.b(obj);
                dVar = (xo.d) this.f60613x;
                Object[] objArr = (Object[]) this.f60614y;
                io.q<T1, T2, ao.d<? super R>, Object> qVar = this.f60615z;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f60613x = dVar;
                this.f60612w = 1;
                obj = qVar.s0(obj2, obj3, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    wn.m.b(obj);
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                dVar = (xo.d) this.f60613x;
                wn.m.b(obj);
            }
            this.f60613x = null;
            this.f60612w = 2;
            if (dVar.emit(obj, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends jo.q implements io.a {

        /* renamed from: w  reason: collision with root package name */
        public static final d f60616w = new d();

        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Void invoke() {
            return null;
        }
    }

    public static final <T1, T2, R> xo.c<R> b(xo.c<? extends T1> cVar, xo.c<? extends T2> cVar2, io.q<? super T1, ? super T2, ? super ao.d<? super R>, ? extends Object> qVar) {
        return e.r(cVar, cVar2, qVar);
    }

    public static final <T1, T2, T3, R> xo.c<R> c(xo.c<? extends T1> cVar, xo.c<? extends T2> cVar2, xo.c<? extends T3> cVar3, io.r<? super T1, ? super T2, ? super T3, ? super ao.d<? super R>, ? extends Object> rVar) {
        return new a(new xo.c[]{cVar, cVar2, cVar3}, rVar);
    }

    public static final <T1, T2, R> xo.c<R> d(xo.c<? extends T1> cVar, xo.c<? extends T2> cVar2, io.q<? super T1, ? super T2, ? super ao.d<? super R>, ? extends Object> qVar) {
        return new b(cVar, cVar2, qVar);
    }

    public static final <T> io.a<T[]> e() {
        return d.f60616w;
    }
}
