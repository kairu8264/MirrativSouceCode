package z;

import uo.q0;

/* loaded from: classes.dex */
public final class k0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<w1.y, wn.v> {
        public final /* synthetic */ io.l<Integer, Boolean> A;
        public final /* synthetic */ w1.b B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<Object, Integer> f62283w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f62284x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ w1.i f62285y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.p<Float, Float, Boolean> f62286z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<Object, Integer> lVar, boolean z10, w1.i iVar, io.p<? super Float, ? super Float, Boolean> pVar, io.l<? super Integer, Boolean> lVar2, w1.b bVar) {
            super(1);
            this.f62283w = lVar;
            this.f62284x = z10;
            this.f62285y = iVar;
            this.f62286z = pVar;
            this.A = lVar2;
            this.B = bVar;
        }

        public final void a(w1.y yVar) {
            jo.p.h(yVar, "$this$semantics");
            w1.w.j(yVar, this.f62283w);
            if (this.f62284x) {
                w1.w.R(yVar, this.f62285y);
            } else {
                w1.w.D(yVar, this.f62285y);
            }
            io.p<Float, Float, Boolean> pVar = this.f62286z;
            if (pVar != null) {
                w1.w.v(yVar, null, pVar, 1, null);
            }
            io.l<Integer, Boolean> lVar = this.A;
            if (lVar != null) {
                w1.w.x(yVar, null, lVar, 1, null);
            }
            w1.w.z(yVar, this.B);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
            a(yVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<Float> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0 f62287w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g0 g0Var) {
            super(0);
            this.f62287w = g0Var;
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(this.f62287w.m() + (this.f62287w.n() / 100000.0f));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<Float> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0 f62288w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q f62289x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g0 g0Var, q qVar) {
            super(0);
            this.f62288w = g0Var;
            this.f62289x = qVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            float m10;
            float n10;
            if (this.f62288w.k()) {
                m10 = this.f62289x.d();
                n10 = 1.0f;
            } else {
                m10 = this.f62288w.m();
                n10 = this.f62288w.n() / 100000.0f;
            }
            return Float.valueOf(m10 + n10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<Object, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q f62290w;

        /* loaded from: classes.dex */
        public /* synthetic */ class a extends jo.m implements io.l<Integer, Object> {
            public a(Object obj) {
                super(1, obj, q.class, "getKey", "getKey(I)Ljava/lang/Object;", 0);
            }

            public final Object i(int i10) {
                return ((q) this.f38131x).e(i10);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return i(num.intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q qVar) {
            super(1);
            this.f62290w = qVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final Integer invoke(Object obj) {
            jo.p.h(obj, "needle");
            a aVar = new a(this.f62290w);
            int d10 = this.f62290w.d();
            int i10 = 0;
            while (true) {
                if (i10 >= d10) {
                    i10 = -1;
                    break;
                } else if (jo.p.c(aVar.invoke(Integer.valueOf(i10)), obj)) {
                    break;
                } else {
                    i10++;
                }
            }
            return Integer.valueOf(i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<Float, Float, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f62291w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q0 f62292x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g0 f62293y;

        @co.f(c = "androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollByAction$1$1", f = "LazySemantics.kt", l = {95}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f62294w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ g0 f62295x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ float f62296y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g0 g0Var, float f10, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f62295x = g0Var;
                this.f62296y = f10;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f62295x, this.f62296y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f62294w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    g0 g0Var = this.f62295x;
                    float f10 = this.f62296y;
                    this.f62294w = 1;
                    if (w.x.b(g0Var, f10, null, this, 2, null) == c10) {
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
        public e(boolean z10, q0 q0Var, g0 g0Var) {
            super(2);
            this.f62291w = z10;
            this.f62292x = q0Var;
            this.f62293y = g0Var;
        }

        public final Boolean a(float f10, float f11) {
            if (this.f62291w) {
                f10 = f11;
            }
            uo.l.d(this.f62292x, null, null, new a(this.f62293y, f10, null), 3, null);
            return Boolean.TRUE;
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Boolean invoke(Float f10, Float f11) {
            return a(f10.floatValue(), f11.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<Integer, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0 f62297w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q0 f62298x;

        @co.f(c = "androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1$2", f = "LazySemantics.kt", l = {111}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f62299w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ g0 f62300x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f62301y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g0 g0Var, int i10, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f62300x = g0Var;
                this.f62301y = i10;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f62300x, this.f62301y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f62299w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    g0 g0Var = this.f62300x;
                    int i11 = this.f62301y;
                    this.f62299w = 1;
                    if (g0.z(g0Var, i11, 0, this, 2, null) == c10) {
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
        public f(g0 g0Var, q0 q0Var) {
            super(1);
            this.f62297w = g0Var;
            this.f62298x = q0Var;
        }

        public final Boolean a(int i10) {
            boolean z10 = i10 >= 0 && i10 < this.f62297w.p().a();
            g0 g0Var = this.f62297w;
            if (z10) {
                uo.l.d(this.f62298x, null, null, new a(g0Var, i10, null), 3, null);
                return Boolean.TRUE;
            }
            throw new IllegalArgumentException(("Can't scroll to index " + i10 + ", it is out of bounds [0, " + g0Var.p().a() + ')').toString());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public static final x0.f a(x0.f fVar, q qVar, g0 g0Var, q0 q0Var, boolean z10, boolean z11, boolean z12, l0.i iVar, int i10) {
        jo.p.h(fVar, "<this>");
        jo.p.h(qVar, "itemProvider");
        jo.p.h(g0Var, "state");
        jo.p.h(q0Var, "coroutineScope");
        iVar.x(-1728067365);
        Object[] objArr = {qVar, g0Var, Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12)};
        iVar.x(-568225417);
        boolean z13 = false;
        for (int i11 = 0; i11 < 5; i11++) {
            z13 |= iVar.P(objArr[i11]);
        }
        Object y10 = iVar.y();
        if (z13 || y10 == l0.i.f39065a.a()) {
            y10 = w1.p.b(x0.f.f59359u, false, new a(new d(qVar), z10, new w1.i(new b(g0Var), new c(g0Var, qVar), z11), z12 ? new e(z10, q0Var, g0Var) : null, z12 ? new f(g0Var, q0Var) : null, new w1.b(z10 ? -1 : 1, z10 ? 1 : -1)), 1, null);
            iVar.q(y10);
        }
        iVar.O();
        x0.f L = fVar.L((x0.f) y10);
        iVar.O();
        return L;
    }
}
