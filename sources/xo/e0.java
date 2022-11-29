package xo;

import kotlin.KotlinNothingValueException;

/* loaded from: classes4.dex */
public final class e0 implements c0 {

    @co.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {155}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends co.l implements io.p<d<? super a0>, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f60484w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f60485x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g0<Integer> f60486y;

        /* renamed from: xo.e0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C1016a<T> implements d {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ jo.a0 f60487w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ d<a0> f60488x;

            @co.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {158}, m = "emit")
            /* renamed from: xo.e0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C1017a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public /* synthetic */ Object f60489w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ C1016a<T> f60490x;

                /* renamed from: y  reason: collision with root package name */
                public int f60491y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C1017a(C1016a<? super T> c1016a, ao.d<? super C1017a> dVar) {
                    super(dVar);
                    this.f60490x = c1016a;
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f60489w = obj;
                    this.f60491y |= Integer.MIN_VALUE;
                    return this.f60490x.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C1016a(jo.a0 a0Var, d<? super a0> dVar) {
                this.f60487w = a0Var;
                this.f60488x = dVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(int r5, ao.d<? super wn.v> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof xo.e0.a.C1016a.C1017a
                    if (r0 == 0) goto L13
                    r0 = r6
                    xo.e0$a$a$a r0 = (xo.e0.a.C1016a.C1017a) r0
                    int r1 = r0.f60491y
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f60491y = r1
                    goto L18
                L13:
                    xo.e0$a$a$a r0 = new xo.e0$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f60489w
                    java.lang.Object r1 = bo.c.c()
                    int r2 = r0.f60491y
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    wn.m.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    wn.m.b(r6)
                    if (r5 <= 0) goto L4e
                    jo.a0 r5 = r4.f60487w
                    boolean r6 = r5.f38125w
                    if (r6 != 0) goto L4e
                    r5.f38125w = r3
                    xo.d<xo.a0> r5 = r4.f60488x
                    xo.a0 r6 = xo.a0.START
                    r0.f60491y = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    wn.v r5 = wn.v.f59242a
                    return r5
                L4e:
                    wn.v r5 = wn.v.f59242a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: xo.e0.a.C1016a.a(int, ao.d):java.lang.Object");
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Object obj, ao.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g0<Integer> g0Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f60486y = g0Var;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(d<? super a0> dVar, ao.d<? super wn.v> dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f60486y, dVar);
            aVar.f60485x = obj;
            return aVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f60484w;
            if (i10 == 0) {
                wn.m.b(obj);
                jo.a0 a0Var = new jo.a0();
                g0<Integer> g0Var = this.f60486y;
                C1016a c1016a = new C1016a(a0Var, (d) this.f60485x);
                this.f60484w = 1;
                if (g0Var.a(c1016a, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // xo.c0
    public c<a0> a(g0<Integer> g0Var) {
        return e.q(new a(g0Var, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
