package xo;

import uo.d2;
import uo.q0;
import uo.s0;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes4.dex */
public final /* synthetic */ class o {

    @co.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {214, 218, 219, 225}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ T A;

        /* renamed from: w  reason: collision with root package name */
        public int f60584w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c0 f60585x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c<T> f60586y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ r<T> f60587z;

        @co.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xo.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C1019a extends co.l implements io.p<Integer, ao.d<? super Boolean>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f60588w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ int f60589x;

            public C1019a(ao.d<? super C1019a> dVar) {
                super(2, dVar);
            }

            public final Object a(int i10, ao.d<? super Boolean> dVar) {
                return ((C1019a) create(Integer.valueOf(i10), dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                C1019a c1019a = new C1019a(dVar);
                c1019a.f60589x = ((Number) obj).intValue();
                return c1019a;
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ Object invoke(Integer num, ao.d<? super Boolean> dVar) {
                return a(num.intValue(), dVar);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f60588w == 0) {
                    wn.m.b(obj);
                    return co.b.a(this.f60589x > 0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @co.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {227}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class b extends co.l implements io.p<a0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ T A;

            /* renamed from: w  reason: collision with root package name */
            public int f60590w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f60591x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ c<T> f60592y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ r<T> f60593z;

            /* renamed from: xo.o$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C1020a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f60594a;

                static {
                    int[] iArr = new int[a0.values().length];
                    iArr[a0.START.ordinal()] = 1;
                    iArr[a0.STOP.ordinal()] = 2;
                    iArr[a0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    f60594a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(c<? extends T> cVar, r<T> rVar, T t10, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f60592y = cVar;
                this.f60593z = rVar;
                this.A = t10;
            }

            public final Object a(a0 a0Var, ao.d<? super wn.v> dVar) {
                return ((b) create(a0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                b bVar = new b(this.f60592y, this.f60593z, this.A, dVar);
                bVar.f60591x = obj;
                return bVar;
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ Object invoke(a0 a0Var, ao.d<? super wn.v> dVar) {
                return a(a0Var, dVar);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f60590w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    int i11 = C1020a.f60594a[((a0) this.f60591x).ordinal()];
                    if (i11 == 1) {
                        c<T> cVar = this.f60592y;
                        c cVar2 = this.f60593z;
                        this.f60590w = 1;
                        if (cVar.a(cVar2, this) == c10) {
                            return c10;
                        }
                    } else if (i11 == 3) {
                        T t10 = this.A;
                        if (t10 == y.f60631a) {
                            this.f60593z.f();
                        } else {
                            this.f60593z.b(t10);
                        }
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c0 c0Var, c<? extends T> cVar, r<T> rVar, T t10, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f60585x = c0Var;
            this.f60586y = cVar;
            this.f60587z = rVar;
            this.A = t10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f60585x, this.f60586y, this.f60587z, this.A, dVar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return invoke2(q0Var, dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r7.f60584w
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                wn.m.b(r8)
                goto L5c
            L21:
                wn.m.b(r8)
                goto L8d
            L25:
                wn.m.b(r8)
                xo.c0 r8 = r7.f60585x
                xo.c0$a r1 = xo.c0.f60480a
                xo.c0 r6 = r1.c()
                if (r8 != r6) goto L3f
                xo.c<T> r8 = r7.f60586y
                xo.r<T> r1 = r7.f60587z
                r7.f60584w = r5
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                xo.c0 r8 = r7.f60585x
                xo.c0 r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                xo.r<T> r8 = r7.f60587z
                xo.g0 r8 = r8.c()
                xo.o$a$a r1 = new xo.o$a$a
                r1.<init>(r5)
                r7.f60584w = r4
                java.lang.Object r8 = xo.e.p(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                xo.c<T> r8 = r7.f60586y
                xo.r<T> r1 = r7.f60587z
                r7.f60584w = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                xo.c0 r8 = r7.f60585x
                xo.r<T> r1 = r7.f60587z
                xo.g0 r1 = r1.c()
                xo.c r8 = r8.a(r1)
                xo.c r8 = xo.e.j(r8)
                xo.o$a$b r1 = new xo.o$a$b
                xo.c<T> r3 = r7.f60586y
                xo.r<T> r4 = r7.f60587z
                T r6 = r7.A
                r1.<init>(r3, r4, r6, r5)
                r7.f60584w = r2
                java.lang.Object r8 = xo.e.g(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                wn.v r8 = wn.v.f59242a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: xo.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> w<T> a(r<T> rVar) {
        return new t(rVar, null);
    }

    public static final <T> g0<T> b(s<T> sVar) {
        return new u(sVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r9 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> xo.b0<T> c(xo.c<? extends T> r8, int r9) {
        /*
            boolean r0 = uo.u0.a()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            if (r9 < 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L10
            goto L16
        L10:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L16:
            wo.i$a r0 = wo.i.f59275t
            int r0 = r0.a()
            int r0 = po.n.d(r9, r0)
            int r0 = r0 - r9
            boolean r3 = r8 instanceof yo.d
            if (r3 == 0) goto L53
            r3 = r8
            yo.d r3 = (yo.d) r3
            xo.c r4 = r3.k()
            if (r4 == 0) goto L53
            xo.b0 r8 = new xo.b0
            int r5 = r3.f62082x
            r6 = -3
            if (r5 == r6) goto L3c
            r6 = -2
            if (r5 == r6) goto L3c
            if (r5 == 0) goto L3c
            r1 = r5
            goto L4b
        L3c:
            wo.h r6 = r3.f62083y
            wo.h r7 = wo.h.SUSPEND
            if (r6 != r7) goto L47
            if (r5 != 0) goto L45
            goto L4a
        L45:
            r1 = r0
            goto L4b
        L47:
            if (r9 != 0) goto L4a
            goto L4b
        L4a:
            r1 = r2
        L4b:
            wo.h r9 = r3.f62083y
            ao.g r0 = r3.f62081w
            r8.<init>(r4, r1, r9, r0)
            return r8
        L53:
            xo.b0 r9 = new xo.b0
            wo.h r1 = wo.h.SUSPEND
            ao.h r2 = ao.h.f16651w
            r9.<init>(r8, r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.o.c(xo.c, int):xo.b0");
    }

    public static final <T> d2 d(q0 q0Var, ao.g gVar, c<? extends T> cVar, r<T> rVar, c0 c0Var, T t10) {
        return uo.j.c(q0Var, gVar, jo.p.c(c0Var, c0.f60480a.c()) ? s0.DEFAULT : s0.UNDISPATCHED, new a(c0Var, cVar, rVar, t10, null));
    }

    public static final <T> g0<T> e(c<? extends T> cVar, q0 q0Var, c0 c0Var, T t10) {
        b0 c10 = c(cVar, 1);
        s a10 = i0.a(t10);
        return new u(a10, d(q0Var, c10.f60479d, c10.f60476a, a10, c0Var, t10));
    }
}
