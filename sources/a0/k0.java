package a0;

import uo.q0;

/* loaded from: classes.dex */
public final class k0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<w1.y, wn.v> {
        public final /* synthetic */ io.l<Integer, Boolean> A;
        public final /* synthetic */ w1.b B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<Object, Integer> f159w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f160x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ w1.i f161y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.p<Float, Float, Boolean> f162z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<Object, Integer> lVar, boolean z10, w1.i iVar, io.p<? super Float, ? super Float, Boolean> pVar, io.l<? super Integer, Boolean> lVar2, w1.b bVar) {
            super(1);
            this.f159w = lVar;
            this.f160x = z10;
            this.f161y = iVar;
            this.f162z = pVar;
            this.A = lVar2;
            this.B = bVar;
        }

        public final void a(w1.y yVar) {
            jo.p.h(yVar, "$this$semantics");
            w1.w.j(yVar, this.f159w);
            if (this.f160x) {
                w1.w.R(yVar, this.f161y);
            } else {
                w1.w.D(yVar, this.f161y);
            }
            io.p<Float, Float, Boolean> pVar = this.f162z;
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
        public final /* synthetic */ e0 f163w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var) {
            super(0);
            this.f163w = e0Var;
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(this.f163w.m() + (this.f163w.n() / 100000.0f));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<Float> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e0 f164w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l f165x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e0 e0Var, l lVar) {
            super(0);
            this.f164w = e0Var;
            this.f165x = lVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            float m10;
            float n10;
            if (this.f164w.k()) {
                m10 = this.f165x.d();
                n10 = 1.0f;
            } else {
                m10 = this.f164w.m();
                n10 = this.f164w.n() / 100000.0f;
            }
            return Float.valueOf(m10 + n10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<Object, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l f166w;

        /* loaded from: classes.dex */
        public /* synthetic */ class a extends jo.m implements io.l<Integer, Object> {
            public a(Object obj) {
                super(1, obj, l.class, "getKey", "getKey(I)Ljava/lang/Object;", 0);
            }

            public final Object i(int i10) {
                return ((l) this.f38131x).e(i10);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return i(num.intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l lVar) {
            super(1);
            this.f166w = lVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final Integer invoke(Object obj) {
            jo.p.h(obj, "needle");
            a aVar = new a(this.f166w);
            int d10 = this.f166w.d();
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
        public final /* synthetic */ boolean f167w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q0 f168x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e0 f169y;

        @co.f(c = "androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$scrollByAction$1$1", f = "LazySemantics.kt", l = {96}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f170w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ e0 f171x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ float f172y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e0 e0Var, float f10, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f171x = e0Var;
                this.f172y = f10;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f171x, this.f172y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f170w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    e0 e0Var = this.f171x;
                    float f10 = this.f172y;
                    this.f170w = 1;
                    if (w.x.b(e0Var, f10, null, this, 2, null) == c10) {
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
        public e(boolean z10, q0 q0Var, e0 e0Var) {
            super(2);
            this.f167w = z10;
            this.f168x = q0Var;
            this.f169y = e0Var;
        }

        public final Boolean a(float f10, float f11) {
            if (this.f167w) {
                f10 = f11;
            }
            uo.l.d(this.f168x, null, null, new a(this.f169y, f10, null), 3, null);
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
        public final /* synthetic */ e0 f173w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q0 f174x;

        @co.f(c = "androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$scrollToIndexAction$1$2", f = "LazySemantics.kt", l = {112}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f175w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ e0 f176x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f177y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e0 e0Var, int i10, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f176x = e0Var;
                this.f177y = i10;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f176x, this.f177y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f175w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    e0 e0Var = this.f176x;
                    int i11 = this.f177y;
                    this.f175w = 1;
                    if (e0.B(e0Var, i11, 0, this, 2, null) == c10) {
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
        public f(e0 e0Var, q0 q0Var) {
            super(1);
            this.f173w = e0Var;
            this.f174x = q0Var;
        }

        public final Boolean a(int i10) {
            boolean z10 = i10 >= 0 && i10 < this.f173w.p().a();
            e0 e0Var = this.f173w;
            if (z10) {
                uo.l.d(this.f174x, null, null, new a(e0Var, i10, null), 3, null);
                return Boolean.TRUE;
            }
            throw new IllegalArgumentException(("Can't scroll to index " + i10 + ", it is out of bounds [0, " + e0Var.p().a() + ')').toString());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public static final x0.f a(x0.f fVar, l lVar, e0 e0Var, q0 q0Var, boolean z10, boolean z11, boolean z12, l0.i iVar, int i10) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "itemProvider");
        jo.p.h(e0Var, "state");
        jo.p.h(q0Var, "coroutineScope");
        iVar.x(1364424801);
        Object[] objArr = {lVar, e0Var, Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12)};
        iVar.x(-568225417);
        boolean z13 = false;
        for (int i11 = 0; i11 < 5; i11++) {
            z13 |= iVar.P(objArr[i11]);
        }
        Object y10 = iVar.y();
        if (z13 || y10 == l0.i.f39065a.a()) {
            y10 = w1.p.b(x0.f.f59359u, false, new a(new d(lVar), z10, new w1.i(new b(e0Var), new c(e0Var, lVar), z11), z12 ? new e(z10, q0Var, e0Var) : null, z12 ? new f(e0Var, q0Var) : null, new w1.b(-1, -1)), 1, null);
            iVar.q(y10);
        }
        iVar.O();
        x0.f L = fVar.L((x0.f) y10);
        iVar.O();
        return L;
    }
}
