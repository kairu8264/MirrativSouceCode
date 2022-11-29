package u;

import l0.c2;
import l0.i;
import l0.u1;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final u0<Float> f53950a = j.g(0.0f, 0.0f, null, 7, null);

    /* renamed from: b  reason: collision with root package name */
    public static final u0<m2.g> f53951b = j.g(0.0f, 0.0f, m2.g.e(q1.a(m2.g.f40516x)), 3, null);

    /* renamed from: c  reason: collision with root package name */
    public static final u0<b1.l> f53952c = j.g(0.0f, 0.0f, b1.l.c(q1.d(b1.l.f16742b)), 3, null);

    /* renamed from: d  reason: collision with root package name */
    public static final u0<b1.f> f53953d = j.g(0.0f, 0.0f, b1.f.d(q1.c(b1.f.f16721b)), 3, null);

    /* renamed from: e  reason: collision with root package name */
    public static final u0<b1.h> f53954e = j.g(0.0f, 0.0f, q1.g(b1.h.f16726e), 3, null);

    /* renamed from: f  reason: collision with root package name */
    public static final u0<Integer> f53955f = j.g(0.0f, 0.0f, Integer.valueOf(q1.b(jo.o.f38150a)), 3, null);

    /* renamed from: g  reason: collision with root package name */
    public static final u0<m2.k> f53956g = j.g(0.0f, 0.0f, m2.k.b(q1.e(m2.k.f40528b)), 3, null);

    /* renamed from: h  reason: collision with root package name */
    public static final u0<m2.o> f53957h = j.g(0.0f, 0.0f, m2.o.b(q1.f(m2.o.f40537b)), 3, null);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ wo.i<T> f53958w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ T f53959x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wo.i<T> iVar, T t10) {
            super(0);
            this.f53958w = iVar;
            this.f53959x = t10;
        }

        public final void a() {
            this.f53958w.l(this.f53959x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {368}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ u.a<T, V> A;
        public final /* synthetic */ c2<i<T>> B;
        public final /* synthetic */ c2<io.l<T, wn.v>> C;

        /* renamed from: w  reason: collision with root package name */
        public Object f53960w;

        /* renamed from: x  reason: collision with root package name */
        public int f53961x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f53962y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ wo.i<T> f53963z;

        @co.f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {377}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ c2<io.l<T, wn.v>> A;

            /* renamed from: w  reason: collision with root package name */
            public int f53964w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ T f53965x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ u.a<T, V> f53966y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ c2<i<T>> f53967z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(T t10, u.a<T, V> aVar, c2<? extends i<T>> c2Var, c2<? extends io.l<? super T, wn.v>> c2Var2, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f53965x = t10;
                this.f53966y = aVar;
                this.f53967z = c2Var;
                this.A = c2Var2;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f53965x, this.f53966y, this.f53967z, this.A, dVar);
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return invoke2(q0Var, dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f53964w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    if (!jo.p.c(this.f53965x, this.f53966y.m())) {
                        u.a<T, V> aVar = this.f53966y;
                        T t10 = this.f53965x;
                        i f10 = c.f(this.f53967z);
                        this.f53964w = 1;
                        if (u.a.f(aVar, t10, f10, null, null, this, 12, null) == c10) {
                            return c10;
                        }
                    }
                    return wn.v.f59242a;
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                io.l e10 = c.e(this.A);
                if (e10 != null) {
                    e10.invoke(this.f53966y.o());
                }
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(wo.i<T> iVar, u.a<T, V> aVar, c2<? extends i<T>> c2Var, c2<? extends io.l<? super T, wn.v>> c2Var2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f53963z = iVar;
            this.A = aVar;
            this.B = c2Var;
            this.C = c2Var2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.f53963z, this.A, this.B, this.C, dVar);
            bVar.f53962y = obj;
            return bVar;
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return invoke2(q0Var, dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0041 -> B:12:0x0044). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = bo.c.c()
                int r2 = r0.f53961x
                r3 = 1
                if (r2 == 0) goto L24
                if (r2 != r3) goto L1c
                java.lang.Object r2 = r0.f53960w
                wo.k r2 = (wo.k) r2
                java.lang.Object r4 = r0.f53962y
                uo.q0 r4 = (uo.q0) r4
                wn.m.b(r18)
                r6 = r18
                r5 = r0
                goto L44
            L1c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L24:
                wn.m.b(r18)
                java.lang.Object r2 = r0.f53962y
                uo.q0 r2 = (uo.q0) r2
                wo.i<T> r4 = r0.f53963z
                wo.k r4 = r4.iterator()
                r5 = r0
                r16 = r4
                r4 = r2
                r2 = r16
            L37:
                r5.f53962y = r4
                r5.f53960w = r2
                r5.f53961x = r3
                java.lang.Object r6 = r2.a(r5)
                if (r6 != r1) goto L44
                return r1
            L44:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L78
                java.lang.Object r6 = r2.next()
                wo.i<T> r7 = r5.f53963z
                java.lang.Object r7 = r7.t()
                java.lang.Object r7 = wo.m.f(r7)
                if (r7 != 0) goto L5e
                r9 = r6
                goto L5f
            L5e:
                r9 = r7
            L5f:
                r6 = 0
                r14 = 0
                u.c$b$a r15 = new u.c$b$a
                u.a<T, V> r10 = r5.A
                l0.c2<u.i<T>> r11 = r5.B
                l0.c2<io.l<T, wn.v>> r12 = r5.C
                r13 = 0
                r8 = r15
                r8.<init>(r9, r10, r11, r12, r13)
                r11 = 3
                r12 = 0
                r7 = r4
                r8 = r6
                r9 = r14
                r10 = r15
                uo.j.d(r7, r8, r9, r10, r11, r12)
                goto L37
            L78:
                wn.v r1 = wn.v.f59242a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
    }

    public static final c2<m2.g> c(float f10, i<m2.g> iVar, io.l<? super m2.g, wn.v> lVar, l0.i iVar2, int i10, int i11) {
        iVar2.x(-1364859110);
        if ((i11 & 2) != 0) {
            iVar = f53951b;
        }
        i<m2.g> iVar3 = iVar;
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        c2<m2.g> d10 = d(m2.g.e(f10), e1.g(m2.g.f40516x), iVar3, null, lVar, iVar2, (i10 & 14) | ((i10 << 3) & 896) | (57344 & (i10 << 6)), 8);
        iVar2.O();
        return d10;
    }

    public static final <T, V extends p> c2<T> d(T t10, c1<T, V> c1Var, i<T> iVar, T t11, io.l<? super T, wn.v> lVar, l0.i iVar2, int i10, int i11) {
        i<T> iVar3;
        jo.p.h(c1Var, "typeConverter");
        iVar2.x(1824613323);
        if ((i11 & 4) != 0) {
            iVar2.x(-3687241);
            Object y10 = iVar2.y();
            if (y10 == l0.i.f39065a.a()) {
                y10 = j.g(0.0f, 0.0f, t11, 3, null);
                iVar2.q(y10);
            }
            iVar2.O();
            iVar3 = (i) y10;
        } else {
            iVar3 = iVar;
        }
        io.l<? super T, wn.v> lVar2 = (i11 & 16) != 0 ? null : lVar;
        iVar2.x(-3687241);
        Object y11 = iVar2.y();
        i.a aVar = l0.i.f39065a;
        Object obj = y11;
        if (y11 == aVar.a()) {
            u.a aVar2 = new u.a(t10, c1Var, null, 4, null);
            iVar2.q(aVar2);
            obj = aVar2;
        }
        iVar2.O();
        u.a aVar3 = (u.a) obj;
        c2 l10 = u1.l(lVar2, iVar2, (i10 >> 12) & 14);
        c2 l11 = u1.l(iVar3, iVar2, (i10 >> 6) & 14);
        iVar2.x(-3687241);
        Object y12 = iVar2.y();
        if (y12 == aVar.a()) {
            y12 = wo.l.b(-1, null, null, 6, null);
            iVar2.q(y12);
        }
        iVar2.O();
        wo.i iVar4 = (wo.i) y12;
        l0.c0.g(new a(iVar4, t10), iVar2, 0);
        l0.c0.c(iVar4, new b(iVar4, aVar3, l11, l10, null), iVar2, 8);
        c2<T> g10 = aVar3.g();
        iVar2.O();
        return g10;
    }

    public static final <T> io.l<T, wn.v> e(c2<? extends io.l<? super T, wn.v>> c2Var) {
        return (io.l) ((io.l<? super T, wn.v>) c2Var.getValue());
    }

    public static final <T> i<T> f(c2<? extends i<T>> c2Var) {
        return c2Var.getValue();
    }
}
