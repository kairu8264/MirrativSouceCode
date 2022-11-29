package h0;

import java.util.Map;
import l0.c2;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public class l1<T> {

    /* renamed from: q  reason: collision with root package name */
    public static final a f33971q = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final u.i<Float> f33972a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<T, Boolean> f33973b;

    /* renamed from: c  reason: collision with root package name */
    public final l0.s0 f33974c;

    /* renamed from: d  reason: collision with root package name */
    public final l0.s0 f33975d;

    /* renamed from: e  reason: collision with root package name */
    public final l0.s0<Float> f33976e;

    /* renamed from: f  reason: collision with root package name */
    public final l0.s0<Float> f33977f;

    /* renamed from: g  reason: collision with root package name */
    public final l0.s0<Float> f33978g;

    /* renamed from: h  reason: collision with root package name */
    public final l0.s0<Float> f33979h;

    /* renamed from: i  reason: collision with root package name */
    public final l0.s0 f33980i;

    /* renamed from: j  reason: collision with root package name */
    public final xo.c<Map<Float, T>> f33981j;

    /* renamed from: k  reason: collision with root package name */
    public float f33982k;

    /* renamed from: l  reason: collision with root package name */
    public float f33983l;

    /* renamed from: m  reason: collision with root package name */
    public final l0.s0 f33984m;

    /* renamed from: n  reason: collision with root package name */
    public final l0.s0 f33985n;

    /* renamed from: o  reason: collision with root package name */
    public final l0.s0 f33986o;

    /* renamed from: p  reason: collision with root package name */
    public final w.l f33987p;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", l = {223}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<w.j, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ u.i<Float> A;

        /* renamed from: w  reason: collision with root package name */
        public int f33988w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f33989x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l1<T> f33990y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ float f33991z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<u.a<Float, u.m>, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ w.j f33992w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ jo.b0 f33993x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w.j jVar, jo.b0 b0Var) {
                super(1);
                this.f33992w = jVar;
                this.f33993x = b0Var;
            }

            public final void a(u.a<Float, u.m> aVar) {
                jo.p.h(aVar, "$this$animateTo");
                this.f33992w.a(aVar.o().floatValue() - this.f33993x.f38128w);
                this.f33993x.f38128w = aVar.o().floatValue();
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(u.a<Float, u.m> aVar) {
                a(aVar);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l1<T> l1Var, float f10, u.i<Float> iVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f33990y = l1Var;
            this.f33991z = f10;
            this.A = iVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(w.j jVar, ao.d<? super wn.v> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.f33990y, this.f33991z, this.A, dVar);
            bVar.f33989x = obj;
            return bVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f33988w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    w.j jVar = (w.j) this.f33989x;
                    jo.b0 b0Var = new jo.b0();
                    b0Var.f38128w = ((Number) this.f33990y.f33978g.getValue()).floatValue();
                    this.f33990y.f33979h.setValue(co.b.c(this.f33991z));
                    this.f33990y.A(true);
                    u.a b10 = u.b.b(b0Var.f38128w, 0.0f, 2, null);
                    Float c11 = co.b.c(this.f33991z);
                    u.i<Float> iVar = this.A;
                    a aVar = new a(jVar, b0Var);
                    this.f33988w = 1;
                    if (u.a.f(b10, c11, iVar, null, aVar, this, 4, null) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                this.f33990y.f33979h.setValue(null);
                this.f33990y.A(false);
                return wn.v.f59242a;
            } catch (Throwable th2) {
                this.f33990y.f33979h.setValue(null);
                this.f33990y.A(false);
                throw th2;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements xo.d<Map<Float, ? extends T>> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ T f33994w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l1<T> f33995x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u.i<Float> f33996y;

        @co.f(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", l = {335}, m = "emit")
        /* loaded from: classes.dex */
        public static final class a extends co.d {
            public int A;

            /* renamed from: w  reason: collision with root package name */
            public Object f33997w;

            /* renamed from: x  reason: collision with root package name */
            public Object f33998x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ Object f33999y;

            public a(ao.d<? super a> dVar) {
                super(dVar);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                this.f33999y = obj;
                this.A |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        public c(T t10, l1<T> l1Var, u.i<Float> iVar) {
            this.f33994w = t10;
            this.f33995x = l1Var;
            this.f33996y = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(java.util.Map<java.lang.Float, ? extends T> r9, ao.d<? super wn.v> r10) {
            /*
                Method dump skipped, instructions count: 310
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.l1.c.a(java.util.Map, ao.d):java.lang.Object");
        }

        @Override // xo.d
        public /* bridge */ /* synthetic */ Object emit(Object obj, ao.d dVar) {
            return a((Map) obj, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l1<T> f34001w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l1<T> l1Var) {
            super(1);
            this.f34001w = l1Var;
        }

        public final void a(float f10) {
            float floatValue = ((Number) this.f34001w.f33978g.getValue()).floatValue() + f10;
            float l10 = po.n.l(floatValue, this.f34001w.r(), this.f34001w.q());
            float f11 = floatValue - l10;
            u0 t10 = this.f34001w.t();
            this.f34001w.f33976e.setValue(Float.valueOf(l10 + (t10 != null ? t10.a(f11) : 0.0f)));
            this.f34001w.f33977f.setValue(Float.valueOf(f11));
            this.f34001w.f33978g.setValue(Float.valueOf(floatValue));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Float f10) {
            a(f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<Map<Float, ? extends T>> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l1<T> f34002w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l1<T> l1Var) {
            super(0);
            this.f34002w = l1Var;
        }

        public final Map<Float, T> a() {
            return this.f34002w.l();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ Object invoke() {
            return a();
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements xo.d<Map<Float, ? extends T>> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l1<T> f34003w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ float f34004x;

        public f(l1<T> l1Var, float f10) {
            this.f34003w = l1Var;
            this.f34004x = f10;
        }

        public final Object a(Map<Float, ? extends T> map, ao.d<? super wn.v> dVar) {
            Float b10 = k1.b(map, this.f34003w.o());
            jo.p.e(b10);
            float floatValue = b10.floatValue();
            T t10 = map.get(co.b.c(k1.a(this.f34003w.s().getValue().floatValue(), floatValue, map.keySet(), this.f34003w.u(), this.f34004x, this.f34003w.v())));
            if (t10 != null && this.f34003w.n().invoke(t10).booleanValue()) {
                Object j10 = l1.j(this.f34003w, t10, null, dVar, 2, null);
                return j10 == bo.c.c() ? j10 : wn.v.f59242a;
            }
            l1<T> l1Var = this.f34003w;
            Object h10 = l1Var.h(floatValue, l1Var.m(), dVar);
            return h10 == bo.c.c() ? h10 : wn.v.f59242a;
        }

        @Override // xo.d
        public /* bridge */ /* synthetic */ Object emit(Object obj, ao.d dVar) {
            return a((Map) obj, dVar);
        }
    }

    @co.f(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", l = {159, 183, 186}, m = "processNewAnchors$material_release")
    /* loaded from: classes.dex */
    public static final class g extends co.d {
        public final /* synthetic */ l1<T> A;
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f34005w;

        /* renamed from: x  reason: collision with root package name */
        public Object f34006x;

        /* renamed from: y  reason: collision with root package name */
        public float f34007y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f34008z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(l1<T> l1Var, ao.d<? super g> dVar) {
            super(dVar);
            this.A = l1Var;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f34008z = obj;
            this.B |= Integer.MIN_VALUE;
            return this.A.y(null, null, this);
        }
    }

    @co.f(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends co.l implements io.p<w.j, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34009w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f34010x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f34011y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ l1<T> f34012z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(float f10, l1<T> l1Var, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f34011y = f10;
            this.f34012z = l1Var;
        }

        public final Object a(w.j jVar, ao.d<? super wn.v> dVar) {
            return ((h) create(jVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            h hVar = new h(this.f34011y, this.f34012z, dVar);
            hVar.f34010x = obj;
            return hVar;
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(w.j jVar, ao.d<? super wn.v> dVar) {
            return a(jVar, dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f34009w == 0) {
                wn.m.b(obj);
                ((w.j) this.f34010x).a(this.f34011y - ((Number) this.f34012z.f33978g.getValue()).floatValue());
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements xo.c<Map<Float, ? extends T>> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ xo.c f34013w;

        /* loaded from: classes.dex */
        public static final class a<T> implements xo.d {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.d f34014w;

            @co.f(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", l = {224}, m = "emit")
            /* renamed from: h0.l1$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0420a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public /* synthetic */ Object f34015w;

                /* renamed from: x  reason: collision with root package name */
                public int f34016x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ a f34017y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0420a(a aVar, ao.d dVar) {
                    super(dVar);
                    this.f34017y = aVar;
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f34015w = obj;
                    this.f34016x |= Integer.MIN_VALUE;
                    return this.f34017y.emit(null, this);
                }
            }

            public a(xo.d dVar) {
                this.f34014w = dVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // xo.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, ao.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof h0.l1.i.a.C0420a
                    if (r0 == 0) goto L13
                    r0 = r6
                    h0.l1$i$a$a r0 = (h0.l1.i.a.C0420a) r0
                    int r1 = r0.f34016x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f34016x = r1
                    goto L18
                L13:
                    h0.l1$i$a$a r0 = new h0.l1$i$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f34015w
                    java.lang.Object r1 = bo.c.c()
                    int r2 = r0.f34016x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    wn.m.b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    wn.m.b(r6)
                    xo.d r6 = r4.f34014w
                    r2 = r5
                    java.util.Map r2 = (java.util.Map) r2
                    boolean r2 = r2.isEmpty()
                    r2 = r2 ^ r3
                    if (r2 == 0) goto L49
                    r0.f34016x = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    wn.v r5 = wn.v.f59242a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: h0.l1.i.a.emit(java.lang.Object, ao.d):java.lang.Object");
            }
        }

        public i(xo.c cVar) {
            this.f34013w = cVar;
        }

        @Override // xo.c
        public Object a(xo.d dVar, ao.d dVar2) {
            Object a10 = this.f34013w.a(new a(dVar), dVar2);
            return a10 == bo.c.c() ? a10 : wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.p<Float, Float, Float> {

        /* renamed from: w  reason: collision with root package name */
        public static final j f34018w = new j();

        static {
        }

        public j() {
            super(2);
        }

        public final Float a(float f10, float f11) {
            return Float.valueOf(0.0f);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Float invoke(Float f10, Float f11) {
            return a(f10.floatValue(), f11.floatValue());
        }
    }

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l1(T t10, u.i<Float> iVar, io.l<? super T, Boolean> lVar) {
        l0.s0 e10;
        l0.s0 e11;
        l0.s0<Float> e12;
        l0.s0<Float> e13;
        l0.s0<Float> e14;
        l0.s0<Float> e15;
        l0.s0 e16;
        l0.s0 e17;
        l0.s0 e18;
        l0.s0 e19;
        jo.p.h(iVar, "animationSpec");
        jo.p.h(lVar, "confirmStateChange");
        this.f33972a = iVar;
        this.f33973b = lVar;
        e10 = l0.z1.e(t10, null, 2, null);
        this.f33974c = e10;
        e11 = l0.z1.e(Boolean.FALSE, null, 2, null);
        this.f33975d = e11;
        Float valueOf = Float.valueOf(0.0f);
        e12 = l0.z1.e(valueOf, null, 2, null);
        this.f33976e = e12;
        e13 = l0.z1.e(valueOf, null, 2, null);
        this.f33977f = e13;
        e14 = l0.z1.e(valueOf, null, 2, null);
        this.f33978g = e14;
        e15 = l0.z1.e(null, null, 2, null);
        this.f33979h = e15;
        e16 = l0.z1.e(xn.n0.e(), null, 2, null);
        this.f33980i = e16;
        this.f33981j = xo.e.y(new i(l0.u1.m(new e(this))), 1);
        this.f33982k = Float.NEGATIVE_INFINITY;
        this.f33983l = Float.POSITIVE_INFINITY;
        e17 = l0.z1.e(j.f34018w, null, 2, null);
        this.f33984m = e17;
        e18 = l0.z1.e(valueOf, null, 2, null);
        this.f33985n = e18;
        e19 = l0.z1.e(null, null, 2, null);
        this.f33986o = e19;
        this.f33987p = w.k.a(new d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object j(l1 l1Var, Object obj, u.i iVar, ao.d dVar, int i10, Object obj2) {
        if (obj2 == null) {
            if ((i10 & 2) != 0) {
                iVar = l1Var.f33972a;
            }
            return l1Var.i(obj, iVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    public final void A(boolean z10) {
        this.f33975d.setValue(Boolean.valueOf(z10));
    }

    public final void B(T t10) {
        this.f33974c.setValue(t10);
    }

    public final void C(u0 u0Var) {
        this.f33986o.setValue(u0Var);
    }

    public final void D(io.p<? super Float, ? super Float, Float> pVar) {
        jo.p.h(pVar, "<set-?>");
        this.f33984m.setValue(pVar);
    }

    public final void E(float f10) {
        this.f33985n.setValue(Float.valueOf(f10));
    }

    public final Object F(float f10, ao.d<? super wn.v> dVar) {
        Object b10 = w.l.b(this.f33987p, null, new h(f10, this, null), dVar, 1, null);
        return b10 == bo.c.c() ? b10 : wn.v.f59242a;
    }

    public final Object h(float f10, u.i<Float> iVar, ao.d<? super wn.v> dVar) {
        Object b10 = w.l.b(this.f33987p, null, new b(this, f10, iVar, null), dVar, 1, null);
        return b10 == bo.c.c() ? b10 : wn.v.f59242a;
    }

    public final Object i(T t10, u.i<Float> iVar, ao.d<? super wn.v> dVar) {
        Object a10 = this.f33981j.a(new c(t10, this, iVar), dVar);
        return a10 == bo.c.c() ? a10 : wn.v.f59242a;
    }

    public final void k(Map<Float, ? extends T> map) {
        jo.p.h(map, "newAnchors");
        if (l().isEmpty()) {
            Float b10 = k1.b(map, o());
            if (b10 != null) {
                this.f33976e.setValue(b10);
                this.f33978g.setValue(b10);
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
        }
    }

    public final Map<Float, T> l() {
        return (Map) this.f33980i.getValue();
    }

    public final u.i<Float> m() {
        return this.f33972a;
    }

    public final io.l<T, Boolean> n() {
        return this.f33973b;
    }

    public final T o() {
        return this.f33974c.getValue();
    }

    public final w.l p() {
        return this.f33987p;
    }

    public final float q() {
        return this.f33983l;
    }

    public final float r() {
        return this.f33982k;
    }

    public final c2<Float> s() {
        return this.f33976e;
    }

    public final u0 t() {
        return (u0) this.f33986o.getValue();
    }

    public final io.p<Float, Float, Float> u() {
        return (io.p) this.f33984m.getValue();
    }

    public final float v() {
        return ((Number) this.f33985n.getValue()).floatValue();
    }

    public final boolean w() {
        return ((Boolean) this.f33975d.getValue()).booleanValue();
    }

    public final Object x(float f10, ao.d<? super wn.v> dVar) {
        Object a10 = this.f33981j.a(new f(this, f10), dVar);
        return a10 == bo.c.c() ? a10 : wn.v.f59242a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(java.util.Map<java.lang.Float, ? extends T> r10, java.util.Map<java.lang.Float, ? extends T> r11, ao.d<? super wn.v> r12) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.l1.y(java.util.Map, java.util.Map, ao.d):java.lang.Object");
    }

    public final void z(Map<Float, ? extends T> map) {
        jo.p.h(map, "<set-?>");
        this.f33980i.setValue(map);
    }
}
