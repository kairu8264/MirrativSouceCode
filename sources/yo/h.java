package yo;

import jo.e0;
import uo.d2;
import uo.q0;
import uo.r0;
import uo.u0;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes4.dex */
public final class h<T, R> extends f<T, R> {
    public final io.q<xo.d<? super R>, T, ao.d<? super wn.v>, Object> A;

    @co.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {27}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f62095w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f62096x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ h<T, R> f62097y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xo.d<R> f62098z;

        /* renamed from: yo.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C1064a<T> implements xo.d {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e0<d2> f62099w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ q0 f62100x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ h<T, R> f62101y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ xo.d<R> f62102z;

            @co.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {34}, m = "invokeSuspend")
            /* renamed from: yo.h$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C1065a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f62103w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ h<T, R> f62104x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ xo.d<R> f62105y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ T f62106z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C1065a(h<T, R> hVar, xo.d<? super R> dVar, T t10, ao.d<? super C1065a> dVar2) {
                    super(2, dVar2);
                    this.f62104x = hVar;
                    this.f62105y = dVar;
                    this.f62106z = t10;
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    return new C1065a(this.f62104x, this.f62105y, this.f62106z, dVar);
                }

                @Override // io.p
                public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                    return invoke2(q0Var, dVar);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(q0 q0Var, ao.d<? super wn.v> dVar) {
                    return ((C1065a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f62103w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        io.q qVar = this.f62104x.A;
                        xo.d<R> dVar = this.f62105y;
                        T t10 = this.f62106z;
                        this.f62103w = 1;
                        if (qVar.s0(dVar, t10, this) == c10) {
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

            @co.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {30}, m = "emit")
            /* renamed from: yo.h$a$a$b */
            /* loaded from: classes4.dex */
            public static final class b extends co.d {
                public final /* synthetic */ C1064a<T> A;
                public int B;

                /* renamed from: w  reason: collision with root package name */
                public Object f62107w;

                /* renamed from: x  reason: collision with root package name */
                public Object f62108x;

                /* renamed from: y  reason: collision with root package name */
                public Object f62109y;

                /* renamed from: z  reason: collision with root package name */
                public /* synthetic */ Object f62110z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C1064a<? super T> c1064a, ao.d<? super b> dVar) {
                    super(dVar);
                    this.A = c1064a;
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f62110z = obj;
                    this.B |= Integer.MIN_VALUE;
                    return this.A.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C1064a(e0<d2> e0Var, q0 q0Var, h<T, R> hVar, xo.d<? super R> dVar) {
                this.f62099w = e0Var;
                this.f62100x = q0Var;
                this.f62101y = hVar;
                this.f62102z = dVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
            @Override // xo.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r8, ao.d<? super wn.v> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof yo.h.a.C1064a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    yo.h$a$a$b r0 = (yo.h.a.C1064a.b) r0
                    int r1 = r0.B
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.B = r1
                    goto L18
                L13:
                    yo.h$a$a$b r0 = new yo.h$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f62110z
                    java.lang.Object r1 = bo.c.c()
                    int r2 = r0.B
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f62109y
                    uo.d2 r8 = (uo.d2) r8
                    java.lang.Object r8 = r0.f62108x
                    java.lang.Object r0 = r0.f62107w
                    yo.h$a$a r0 = (yo.h.a.C1064a) r0
                    wn.m.b(r9)
                    goto L5f
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    wn.m.b(r9)
                    jo.e0<uo.d2> r9 = r7.f62099w
                    T r9 = r9.f38136w
                    uo.d2 r9 = (uo.d2) r9
                    if (r9 != 0) goto L48
                L46:
                    r0 = r7
                    goto L5f
                L48:
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.c(r2)
                    r0.f62107w = r7
                    r0.f62108x = r8
                    r0.f62109y = r9
                    r0.B = r3
                    java.lang.Object r9 = r9.E(r0)
                    if (r9 != r1) goto L46
                    return r1
                L5f:
                    jo.e0<uo.d2> r9 = r0.f62099w
                    uo.q0 r1 = r0.f62100x
                    r2 = 0
                    uo.s0 r3 = uo.s0.UNDISPATCHED
                    yo.h$a$a$a r4 = new yo.h$a$a$a
                    yo.h<T, R> r5 = r0.f62101y
                    xo.d<R> r0 = r0.f62102z
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    uo.d2 r8 = uo.j.d(r1, r2, r3, r4, r5, r6)
                    r9.f38136w = r8
                    wn.v r8 = wn.v.f59242a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: yo.h.a.C1064a.emit(java.lang.Object, ao.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h<T, R> hVar, xo.d<? super R> dVar, ao.d<? super a> dVar2) {
            super(2, dVar2);
            this.f62097y = hVar;
            this.f62098z = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f62097y, this.f62098z, dVar);
            aVar.f62096x = obj;
            return aVar;
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return invoke2(q0Var, dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f62095w;
            if (i10 == 0) {
                wn.m.b(obj);
                e0 e0Var = new e0();
                h<T, R> hVar = this.f62097y;
                xo.c<S> cVar = hVar.f62091z;
                C1064a c1064a = new C1064a(e0Var, (q0) this.f62096x, hVar, this.f62098z);
                this.f62095w = 1;
                if (cVar.a(c1064a, this) == c10) {
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

    public /* synthetic */ h(io.q qVar, xo.c cVar, ao.g gVar, int i10, wo.h hVar, int i11, jo.h hVar2) {
        this(qVar, cVar, (i11 & 4) != 0 ? ao.h.f16651w : gVar, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? wo.h.SUSPEND : hVar);
    }

    @Override // yo.d
    public d<R> j(ao.g gVar, int i10, wo.h hVar) {
        return new h(this.A, this.f62091z, gVar, i10, hVar);
    }

    @Override // yo.f
    public Object r(xo.d<? super R> dVar, ao.d<? super wn.v> dVar2) {
        if (!u0.a() || (dVar instanceof u)) {
            Object e10 = r0.e(new a(this, dVar, null), dVar2);
            return e10 == bo.c.c() ? e10 : wn.v.f59242a;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(io.q<? super xo.d<? super R>, ? super T, ? super ao.d<? super wn.v>, ? extends Object> qVar, xo.c<? extends T> cVar, ao.g gVar, int i10, wo.h hVar) {
        super(cVar, gVar, i10, hVar);
        this.A = qVar;
    }
}
