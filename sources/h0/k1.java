package h0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l0.i;
import w.k;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class k1 {

    @co.f(c = "androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$1", f = "Swipeable.kt", l = {512}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w */
        public int f33937w;

        /* renamed from: x */
        public final /* synthetic */ T f33938x;

        /* renamed from: y */
        public final /* synthetic */ l1<T> f33939y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T t10, l1<T> l1Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f33938x = t10;
            this.f33939y = l1Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f33938x, this.f33939y, dVar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return invoke2(q0Var, dVar);
        }

        /* renamed from: invoke */
        public final Object invoke2(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f33937w;
            if (i10 == 0) {
                wn.m.b(obj);
                if (!jo.p.c(this.f33938x, this.f33939y.o())) {
                    l1<T> l1Var = this.f33939y;
                    T t10 = this.f33938x;
                    this.f33937w = 1;
                    if (l1.j(l1Var, t10, null, this, 2, null) == c10) {
                        return c10;
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

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<l0.a0, l0.z> {

        /* renamed from: w */
        public final /* synthetic */ T f33940w;

        /* renamed from: x */
        public final /* synthetic */ l1<T> f33941x;

        /* renamed from: y */
        public final /* synthetic */ io.l<T, wn.v> f33942y;

        /* renamed from: z */
        public final /* synthetic */ l0.s0<Boolean> f33943z;

        /* loaded from: classes.dex */
        public static final class a implements l0.z {
            public a() {
            }

            @Override // l0.z
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(T t10, l1<T> l1Var, io.l<? super T, wn.v> lVar, l0.s0<Boolean> s0Var) {
            super(1);
            this.f33940w = t10;
            this.f33941x = l1Var;
            this.f33942y = lVar;
            this.f33943z = s0Var;
        }

        public final l0.z a(l0.a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            if (!jo.p.c(this.f33940w, this.f33941x.o())) {
                this.f33942y.invoke(this.f33941x.o());
                l0.s0<Boolean> s0Var = this.f33943z;
                s0Var.setValue(Boolean.valueOf(!s0Var.getValue().booleanValue()));
            }
            return new a();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ l0.z invoke(l0.a0 a0Var) {
            return a(a0Var);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<T, Boolean> {

        /* renamed from: w */
        public static final c f33944w = new c();

        static {
        }

        public c() {
            super(1);
        }

        public final Boolean a(T t10) {
            jo.p.h(t10, "it");
            return Boolean.TRUE;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return a(obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.p {

        /* renamed from: w */
        public static final d f33945w = new d();

        static {
        }

        public d() {
            super(2);
        }

        public final j0 a(Object obj, Object obj2) {
            return new j0(m2.g.l(56), null);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(obj, obj2);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {
        public final /* synthetic */ x.m A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ u0 C;
        public final /* synthetic */ io.p<T, T, x1> D;
        public final /* synthetic */ float E;

        /* renamed from: w */
        public final /* synthetic */ Map<Float, T> f33946w;

        /* renamed from: x */
        public final /* synthetic */ l1<T> f33947x;

        /* renamed from: y */
        public final /* synthetic */ w.q f33948y;

        /* renamed from: z */
        public final /* synthetic */ boolean f33949z;

        @co.f(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", l = {607}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ m2.d A;
            public final /* synthetic */ io.p<T, T, x1> B;
            public final /* synthetic */ float C;

            /* renamed from: w */
            public int f33950w;

            /* renamed from: x */
            public final /* synthetic */ l1<T> f33951x;

            /* renamed from: y */
            public final /* synthetic */ Map<Float, T> f33952y;

            /* renamed from: z */
            public final /* synthetic */ u0 f33953z;

            /* renamed from: h0.k1$e$a$a */
            /* loaded from: classes.dex */
            public static final class C0419a extends jo.q implements io.p<Float, Float, Float> {

                /* renamed from: w */
                public final /* synthetic */ Map<Float, T> f33954w;

                /* renamed from: x */
                public final /* synthetic */ io.p<T, T, x1> f33955x;

                /* renamed from: y */
                public final /* synthetic */ m2.d f33956y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0419a(Map<Float, ? extends T> map, io.p<? super T, ? super T, ? extends x1> pVar, m2.d dVar) {
                    super(2);
                    this.f33954w = map;
                    this.f33955x = pVar;
                    this.f33956y = dVar;
                }

                public final Float a(float f10, float f11) {
                    return Float.valueOf(this.f33955x.invoke(xn.n0.f(this.f33954w, Float.valueOf(f10)), xn.n0.f(this.f33954w, Float.valueOf(f11))).a(this.f33956y, f10, f11));
                }

                @Override // io.p
                public /* bridge */ /* synthetic */ Float invoke(Float f10, Float f11) {
                    return a(f10.floatValue(), f11.floatValue());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(l1<T> l1Var, Map<Float, ? extends T> map, u0 u0Var, m2.d dVar, io.p<? super T, ? super T, ? extends x1> pVar, float f10, ao.d<? super a> dVar2) {
                super(2, dVar2);
                this.f33951x = l1Var;
                this.f33952y = map;
                this.f33953z = u0Var;
                this.A = dVar;
                this.B = pVar;
                this.C = f10;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f33951x, this.f33952y, this.f33953z, this.A, this.B, this.C, dVar);
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return invoke2(q0Var, dVar);
            }

            /* renamed from: invoke */
            public final Object invoke2(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f33950w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    Map l10 = this.f33951x.l();
                    this.f33951x.z(this.f33952y);
                    this.f33951x.C(this.f33953z);
                    this.f33951x.D(new C0419a(this.f33952y, this.B, this.A));
                    this.f33951x.E(this.A.I0(this.C));
                    l1<T> l1Var = this.f33951x;
                    Object obj2 = this.f33952y;
                    this.f33950w = 1;
                    if (l1Var.y(l10, obj2, this) == c10) {
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

        @co.f(c = "androidx.compose.material.SwipeableKt$swipeable$3$4", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements io.q<uo.q0, Float, ao.d<? super wn.v>, Object> {

            /* renamed from: w */
            public int f33957w;

            /* renamed from: x */
            public /* synthetic */ Object f33958x;

            /* renamed from: y */
            public /* synthetic */ float f33959y;

            /* renamed from: z */
            public final /* synthetic */ l1<T> f33960z;

            @co.f(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", l = {616}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

                /* renamed from: w */
                public int f33961w;

                /* renamed from: x */
                public final /* synthetic */ l1<T> f33962x;

                /* renamed from: y */
                public final /* synthetic */ float f33963y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(l1<T> l1Var, float f10, ao.d<? super a> dVar) {
                    super(2, dVar);
                    this.f33962x = l1Var;
                    this.f33963y = f10;
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    return new a(this.f33962x, this.f33963y, dVar);
                }

                @Override // io.p
                public /* bridge */ /* synthetic */ Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                    return invoke2(q0Var, dVar);
                }

                /* renamed from: invoke */
                public final Object invoke2(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                    return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f33961w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        l1<T> l1Var = this.f33962x;
                        float f10 = this.f33963y;
                        this.f33961w = 1;
                        if (l1Var.x(f10, this) == c10) {
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
            public b(l1<T> l1Var, ao.d<? super b> dVar) {
                super(3, dVar);
                this.f33960z = l1Var;
            }

            public final Object a(uo.q0 q0Var, float f10, ao.d<? super wn.v> dVar) {
                b bVar = new b(this.f33960z, dVar);
                bVar.f33958x = q0Var;
                bVar.f33959y = f10;
                return bVar.invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f33957w == 0) {
                    wn.m.b(obj);
                    uo.l.d((uo.q0) this.f33958x, null, null, new a(this.f33960z, this.f33959y, null), 3, null);
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ Object s0(uo.q0 q0Var, Float f10, ao.d<? super wn.v> dVar) {
                return a(q0Var, f10.floatValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Map<Float, ? extends T> map, l1<T> l1Var, w.q qVar, boolean z10, x.m mVar, boolean z11, u0 u0Var, io.p<? super T, ? super T, ? extends x1> pVar, float f10) {
            super(3);
            this.f33946w = map;
            this.f33947x = l1Var;
            this.f33948y = qVar;
            this.f33949z = z10;
            this.A = mVar;
            this.B = z11;
            this.C = u0Var;
            this.D = pVar;
            this.E = f10;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            x0.f i11;
            jo.p.h(fVar, "$this$composed");
            iVar.x(43594985);
            if (!this.f33946w.isEmpty()) {
                if (xn.a0.P(this.f33946w.values()).size() == this.f33946w.size()) {
                    m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
                    this.f33947x.k(this.f33946w);
                    Map<Float, T> map = this.f33946w;
                    l1<T> l1Var = this.f33947x;
                    l0.c0.d(map, l1Var, new a(l1Var, map, this.C, dVar, this.D, this.E, null), iVar, 8);
                    i11 = w.k.i(x0.f.f59359u, this.f33947x.p(), this.f33948y, (r20 & 4) != 0 ? true : this.f33949z, (r20 & 8) != 0 ? null : this.A, (r20 & 16) != 0 ? false : this.f33947x.w(), (r20 & 32) != 0 ? new k.e(null) : null, (r20 & 64) != 0 ? new k.f(null) : new b(this.f33947x, null), (r20 & 128) != 0 ? false : this.B);
                    iVar.O();
                    return i11;
                }
                throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
            }
            throw new IllegalArgumentException("You must have at least one anchor.".toString());
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ x.m B;
        public final /* synthetic */ io.p C;
        public final /* synthetic */ u0 D;
        public final /* synthetic */ float E;

        /* renamed from: w */
        public final /* synthetic */ l1 f33964w;

        /* renamed from: x */
        public final /* synthetic */ Map f33965x;

        /* renamed from: y */
        public final /* synthetic */ w.q f33966y;

        /* renamed from: z */
        public final /* synthetic */ boolean f33967z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l1 l1Var, Map map, w.q qVar, boolean z10, boolean z11, x.m mVar, io.p pVar, u0 u0Var, float f10) {
            super(1);
            this.f33964w = l1Var;
            this.f33965x = map;
            this.f33966y = qVar;
            this.f33967z = z10;
            this.A = z11;
            this.B = mVar;
            this.C = pVar;
            this.D = u0Var;
            this.E = f10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("swipeable");
            c1Var.a().b("state", this.f33964w);
            c1Var.a().b("anchors", this.f33965x);
            c1Var.a().b("orientation", this.f33966y);
            c1Var.a().b("enabled", Boolean.valueOf(this.f33967z));
            c1Var.a().b("reverseDirection", Boolean.valueOf(this.A));
            c1Var.a().b("interactionSource", this.B);
            c1Var.a().b("thresholds", this.C);
            c1Var.a().b("resistance", this.D);
            c1Var.a().b("velocityThreshold", m2.g.e(this.E));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x003f, code lost:
        if (r3 < r6.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5)).floatValue()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005c, code lost:
        if (r3 > r6.invoke(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0)).floatValue()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float c(float r3, float r4, java.util.Set<java.lang.Float> r5, io.p<? super java.lang.Float, ? super java.lang.Float, java.lang.Float> r6, float r7, float r8) {
        /*
            java.util.List r5 = d(r3, r5)
            int r0 = r5.size()
            if (r0 == 0) goto L6c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L62
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L42
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 < 0) goto L2b
            return r5
        L2b:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L5e
            goto L60
        L42:
            float r4 = -r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L48
            return r0
        L48:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L60
        L5e:
            r4 = r5
            goto L6c
        L60:
            r4 = r0
            goto L6c
        L62:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r4 = r3.floatValue()
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.k1.c(float, float, java.util.Set, io.p, float, float):float");
    }

    public static final List<Float> d(float f10, Set<Float> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((double) ((Number) next).floatValue()) <= ((double) f10) + 0.001d) {
                arrayList.add(next);
            }
        }
        Float l02 = xn.a0.l0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            if (((double) ((Number) obj).floatValue()) >= ((double) f10) - 0.001d) {
                arrayList2.add(obj);
            }
        }
        Float n02 = xn.a0.n0(arrayList2);
        if (l02 == null) {
            return xn.s.n(n02);
        }
        if (n02 == null) {
            return xn.r.d(l02);
        }
        if (jo.p.b(l02, n02)) {
            return xn.r.d(l02);
        }
        return xn.s.m(l02, n02);
    }

    public static final <T> Float e(Map<Float, ? extends T> map, T t10) {
        T t11;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t11 = null;
                break;
            }
            t11 = it.next();
            if (jo.p.c(((Map.Entry) t11).getValue(), t10)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) t11;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static final <T> l1<T> f(T t10, io.l<? super T, wn.v> lVar, u.i<Float> iVar, l0.i iVar2, int i10, int i11) {
        jo.p.h(t10, "value");
        jo.p.h(lVar, "onValueChange");
        iVar2.x(1156387078);
        if ((i11 & 4) != 0) {
            iVar = j1.f33924a.a();
        }
        iVar2.x(-492369756);
        Object y10 = iVar2.y();
        i.a aVar = l0.i.f39065a;
        if (y10 == aVar.a()) {
            y10 = new l1(t10, iVar, c.f33944w);
            iVar2.q(y10);
        }
        iVar2.O();
        l1<T> l1Var = (l1) y10;
        iVar2.x(-492369756);
        Object y11 = iVar2.y();
        if (y11 == aVar.a()) {
            y11 = l0.z1.e(Boolean.FALSE, null, 2, null);
            iVar2.q(y11);
        }
        iVar2.O();
        l0.s0 s0Var = (l0.s0) y11;
        int i12 = i10 & 8;
        l0.c0.d(t10, s0Var.getValue(), new a(t10, l1Var, null), iVar2, (i10 & 14) | i12);
        l0.c0.a(l1Var.o(), new b(t10, l1Var, lVar, s0Var), iVar2, i12);
        iVar2.O();
        return l1Var;
    }

    public static final <T> x0.f g(x0.f fVar, l1<T> l1Var, Map<Float, ? extends T> map, w.q qVar, boolean z10, boolean z11, x.m mVar, io.p<? super T, ? super T, ? extends x1> pVar, u0 u0Var, float f10) {
        jo.p.h(fVar, "$this$swipeable");
        jo.p.h(l1Var, "state");
        jo.p.h(map, "anchors");
        jo.p.h(qVar, "orientation");
        jo.p.h(pVar, "thresholds");
        return x0.e.c(fVar, androidx.compose.ui.platform.a1.c() ? new f(l1Var, map, qVar, z10, z11, mVar, pVar, u0Var, f10) : androidx.compose.ui.platform.a1.a(), new e(map, l1Var, qVar, z10, mVar, z11, u0Var, pVar, f10));
    }

    public static /* synthetic */ x0.f h(x0.f fVar, l1 l1Var, Map map, w.q qVar, boolean z10, boolean z11, x.m mVar, io.p pVar, u0 u0Var, float f10, int i10, Object obj) {
        return g(fVar, l1Var, map, qVar, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? null : mVar, (i10 & 64) != 0 ? d.f33945w : pVar, (i10 & 128) != 0 ? j1.d(j1.f33924a, map.keySet(), 0.0f, 0.0f, 6, null) : u0Var, (i10 & 256) != 0 ? j1.f33924a.b() : f10);
    }
}
