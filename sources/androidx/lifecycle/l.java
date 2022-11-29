package androidx.lifecycle;

import com.google.android.exoplayer2.DefaultRenderersFactory;

/* loaded from: classes.dex */
public final class l {

    @co.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {98, 102, 103}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<xo.d<? super T>, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ LiveData<T> A;

        /* renamed from: w */
        public Object f15559w;

        /* renamed from: x */
        public Object f15560x;

        /* renamed from: y */
        public int f15561y;

        /* renamed from: z */
        public /* synthetic */ Object f15562z;

        @co.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.l$a$a */
        /* loaded from: classes.dex */
        public static final class C0066a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w */
            public int f15563w;

            /* renamed from: x */
            public final /* synthetic */ LiveData<T> f15564x;

            /* renamed from: y */
            public final /* synthetic */ f0<T> f15565y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0066a(LiveData<T> liveData, f0<T> f0Var, ao.d<? super C0066a> dVar) {
                super(2, dVar);
                this.f15564x = liveData;
                this.f15565y = f0Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new C0066a(this.f15564x, this.f15565y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((C0066a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f15563w == 0) {
                    wn.m.b(obj);
                    this.f15564x.j(this.f15565y);
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @co.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w */
            public int f15566w;

            /* renamed from: x */
            public final /* synthetic */ LiveData<T> f15567x;

            /* renamed from: y */
            public final /* synthetic */ f0<T> f15568y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(LiveData<T> liveData, f0<T> f0Var, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f15567x = liveData;
                this.f15568y = f0Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f15567x, this.f15568y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f15566w == 0) {
                    wn.m.b(obj);
                    this.f15567x.n(this.f15568y);
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* loaded from: classes.dex */
        public static final class c<T> implements f0 {

            /* renamed from: a */
            public final /* synthetic */ wo.i<T> f15569a;

            public c(wo.i<T> iVar) {
                this.f15569a = iVar;
            }

            @Override // androidx.lifecycle.f0
            public final void d(T t10) {
                this.f15569a.l(t10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LiveData<T> liveData, ao.d<? super a> dVar) {
            super(2, dVar);
            this.A = liveData;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(xo.d<? super T> dVar, ao.d<? super wn.v> dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.A, dVar);
            aVar.f15562z = obj;
            return aVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:1|(4:(1:(2:35|(1:(7:38|39|40|8|9|10|(1:12)(4:14|15|16|(2:18|(1:20)(4:21|9|10|(0)(0)))(2:22|23)))(2:41|42))(6:43|44|45|15|16|(0)(0)))(1:4))(2:47|(1:49)(1:50))|9|10|(0)(0))|5|6|7|8|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x00dd, code lost:
            r15 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x00de, code lost:
            r4 = r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0099 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00a7 A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #0 {all -> 0x00d8, blocks: (B:81:0x009f, B:83:0x00a7), top: B:97:0x009f }] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00be  */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4, types: [androidx.lifecycle.f0] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x00ba -> B:99:0x008b). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {151}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<a0<T>, ao.d<? super wn.v>, Object> {

        /* renamed from: w */
        public int f15570w;

        /* renamed from: x */
        public /* synthetic */ Object f15571x;

        /* renamed from: y */
        public final /* synthetic */ xo.c<T> f15572y;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<T> {

            /* renamed from: w */
            public final /* synthetic */ a0 f15573w;

            public a(a0 a0Var) {
                this.f15573w = a0Var;
            }

            @Override // xo.d
            public Object emit(T t10, ao.d<? super wn.v> dVar) {
                Object emit = this.f15573w.emit(t10, dVar);
                return emit == bo.c.c() ? emit : wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(xo.c<? extends T> cVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f15572y = cVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(a0<T> a0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(a0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.f15572y, dVar);
            bVar.f15571x = obj;
            return bVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f15570w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<T> cVar = this.f15572y;
                a aVar = new a((a0) this.f15571x);
                this.f15570w = 1;
                if (cVar.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    public static final <T> xo.c<T> a(LiveData<T> liveData) {
        jo.p.h(liveData, "<this>");
        return xo.e.q(new a(liveData, null));
    }

    public static final <T> LiveData<T> b(xo.c<? extends T> cVar, ao.g gVar, long j10) {
        jo.p.h(cVar, "<this>");
        jo.p.h(gVar, "context");
        return g.a(gVar, j10, new b(cVar, null));
    }

    public static /* synthetic */ LiveData c(xo.c cVar, ao.g gVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = ao.h.f16651w;
        }
        if ((i10 & 2) != 0) {
            j10 = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        }
        return b(cVar, gVar, j10);
    }
}
