package f0;

import uo.d2;

/* loaded from: classes.dex */
public final class w {

    @co.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super d2>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f31628w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f31629x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ n1.e0 f31630y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ e0 f31631z;

        @co.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {82}, m = "invokeSuspend")
        /* renamed from: f0.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0342a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f31632w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ n1.e0 f31633x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ e0 f31634y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0342a(n1.e0 e0Var, e0 e0Var2, ao.d<? super C0342a> dVar) {
                super(2, dVar);
                this.f31633x = e0Var;
                this.f31634y = e0Var2;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new C0342a(this.f31633x, this.f31634y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((C0342a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f31632w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    n1.e0 e0Var = this.f31633x;
                    e0 e0Var2 = this.f31634y;
                    this.f31632w = 1;
                    if (w.f(e0Var, e0Var2, this) == c10) {
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

        @co.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {85}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f31635w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ n1.e0 f31636x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ e0 f31637y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n1.e0 e0Var, e0 e0Var2, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f31636x = e0Var;
                this.f31637y = e0Var2;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f31636x, this.f31637y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f31635w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    n1.e0 e0Var = this.f31636x;
                    e0 e0Var2 = this.f31637y;
                    this.f31635w = 1;
                    if (w.e(e0Var, e0Var2, this) == c10) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n1.e0 e0Var, e0 e0Var2, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f31630y = e0Var;
            this.f31631z = e0Var2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f31630y, this.f31631z, dVar);
            aVar.f31629x = obj;
            return aVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super d2> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            d2 d10;
            bo.c.c();
            if (this.f31628w == 0) {
                wn.m.b(obj);
                uo.q0 q0Var = (uo.q0) this.f31629x;
                uo.l.d(q0Var, null, null, new C0342a(this.f31630y, this.f31631z, null), 3, null);
                d10 = uo.l.d(q0Var, null, null, new b(this.f31630y, this.f31631z, null), 3, null);
                return d10;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<b1.f, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e0 f31638w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var) {
            super(1);
            this.f31638w = e0Var;
        }

        public final void a(long j10) {
            this.f31638w.c(j10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(b1.f fVar) {
            a(fVar.u());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e0 f31639w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e0 e0Var) {
            super(0);
            this.f31639w = e0Var;
        }

        public final void a() {
            this.f31639w.onStop();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e0 f31640w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e0 e0Var) {
            super(0);
            this.f31640w = e0Var;
        }

        public final void a() {
            this.f31640w.a();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<n1.w, b1.f, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e0 f31641w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e0 e0Var) {
            super(2);
            this.f31641w = e0Var;
        }

        public final void a(n1.w wVar, long j10) {
            jo.p.h(wVar, "<anonymous parameter 0>");
            this.f31641w.e(j10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(n1.w wVar, b1.f fVar) {
            a(wVar, fVar.u());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<b1.f, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e0 f31642w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e0 e0Var) {
            super(1);
            this.f31642w = e0Var;
        }

        public final void a(long j10) {
            this.f31642w.c(j10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(b1.f fVar) {
            a(fVar.u());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e0 f31643w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e0 e0Var) {
            super(0);
            this.f31643w = e0Var;
        }

        public final void a() {
            this.f31643w.onStop();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e0 f31644w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e0 e0Var) {
            super(0);
            this.f31644w = e0Var;
        }

        public final void a() {
            this.f31644w.a();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.p<n1.w, b1.f, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e0 f31645w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e0 e0Var) {
            super(2);
            this.f31645w = e0Var;
        }

        public final void a(n1.w wVar, long j10) {
            jo.p.h(wVar, "<anonymous parameter 0>");
            this.f31645w.e(j10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(n1.w wVar, b1.f fVar) {
            a(wVar, fVar.u());
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {98}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f31646w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f31647x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e0 f31648y;

        @co.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {99, 103}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.k implements io.p<n1.c, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ e0 A;

            /* renamed from: x  reason: collision with root package name */
            public Object f31649x;

            /* renamed from: y  reason: collision with root package name */
            public int f31650y;

            /* renamed from: z  reason: collision with root package name */
            public /* synthetic */ Object f31651z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e0 e0Var, ao.d<? super a> dVar) {
                super(2, dVar);
                this.A = e0Var;
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(n1.c cVar, ao.d<? super wn.v> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                a aVar = new a(this.A, dVar);
                aVar.f31651z = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0060 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0094 A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005e -> B:17:0x0061). Please submit an issue!!! */
            @Override // co.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    r16 = this;
                    r0 = r16
                    java.lang.Object r1 = bo.c.c()
                    int r2 = r0.f31650y
                    r3 = 2
                    r4 = 0
                    r5 = 0
                    r6 = 1
                    if (r2 == 0) goto L33
                    if (r2 == r6) goto L29
                    if (r2 != r3) goto L21
                    java.lang.Object r2 = r0.f31649x
                    n1.w r2 = (n1.w) r2
                    java.lang.Object r7 = r0.f31651z
                    n1.c r7 = (n1.c) r7
                    wn.m.b(r17)
                    r9 = r17
                    r8 = r0
                    goto L61
                L21:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L29:
                    java.lang.Object r2 = r0.f31651z
                    n1.c r2 = (n1.c) r2
                    wn.m.b(r17)
                    r7 = r17
                    goto L45
                L33:
                    wn.m.b(r17)
                    java.lang.Object r2 = r0.f31651z
                    n1.c r2 = (n1.c) r2
                    r0.f31651z = r2
                    r0.f31650y = r6
                    java.lang.Object r7 = w.e0.e(r2, r5, r0, r6, r4)
                    if (r7 != r1) goto L45
                    return r1
                L45:
                    n1.w r7 = (n1.w) r7
                    f0.e0 r8 = r0.A
                    long r9 = r7.f()
                    r8.b(r9)
                    r8 = r0
                    r15 = r7
                    r7 = r2
                    r2 = r15
                L54:
                    r8.f31651z = r7
                    r8.f31649x = r2
                    r8.f31650y = r3
                    java.lang.Object r9 = n1.c.y0(r7, r4, r8, r6, r4)
                    if (r9 != r1) goto L61
                    return r1
                L61:
                    n1.m r9 = (n1.m) r9
                    java.util.List r9 = r9.c()
                    int r10 = r9.size()
                    r11 = r5
                L6c:
                    if (r11 >= r10) goto L94
                    java.lang.Object r12 = r9.get(r11)
                    n1.w r12 = (n1.w) r12
                    long r13 = r12.e()
                    long r3 = r2.e()
                    boolean r3 = n1.v.d(r13, r3)
                    if (r3 == 0) goto L8a
                    boolean r3 = r12.g()
                    if (r3 == 0) goto L8a
                    r3 = r6
                    goto L8b
                L8a:
                    r3 = r5
                L8b:
                    if (r3 == 0) goto L8f
                    r3 = r6
                    goto L95
                L8f:
                    int r11 = r11 + 1
                    r3 = 2
                    r4 = 0
                    goto L6c
                L94:
                    r3 = r5
                L95:
                    if (r3 != 0) goto L9f
                    f0.e0 r1 = r8.A
                    r1.d()
                    wn.v r1 = wn.v.f59242a
                    return r1
                L9f:
                    r3 = 2
                    r4 = 0
                    goto L54
                */
                throw new UnsupportedOperationException("Method not decompiled: f0.w.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(e0 e0Var, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f31648y = e0Var;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            j jVar = new j(this.f31648y, dVar);
            jVar.f31647x = obj;
            return jVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f31646w;
            if (i10 == 0) {
                wn.m.b(obj);
                a aVar = new a(this.f31648y, null);
                this.f31646w = 1;
                if (((n1.e0) this.f31647x).N(aVar, this) == c10) {
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

    public static final Object c(n1.e0 e0Var, e0 e0Var2, ao.d<? super wn.v> dVar) {
        Object e10 = uo.r0.e(new a(e0Var, e0Var2, null), dVar);
        return e10 == bo.c.c() ? e10 : wn.v.f59242a;
    }

    public static final Object d(n1.e0 e0Var, e0 e0Var2, ao.d<? super wn.v> dVar) {
        Object i10 = w.h.i(e0Var, new b(e0Var2), new c(e0Var2), new d(e0Var2), new e(e0Var2), dVar);
        return i10 == bo.c.c() ? i10 : wn.v.f59242a;
    }

    public static final Object e(n1.e0 e0Var, e0 e0Var2, ao.d<? super wn.v> dVar) {
        Object h10 = w.h.h(e0Var, new f(e0Var2), new g(e0Var2), new h(e0Var2), new i(e0Var2), dVar);
        return h10 == bo.c.c() ? h10 : wn.v.f59242a;
    }

    public static final Object f(n1.e0 e0Var, e0 e0Var2, ao.d<? super wn.v> dVar) {
        Object d10 = w.n.d(e0Var, new j(e0Var2, null), dVar);
        return d10 == bo.c.c() ? d10 : wn.v.f59242a;
    }
}
