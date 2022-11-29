package u;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class x0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<u.h<T, V>, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<T, T, wn.v> f54153w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c1<T, V> f54154x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.p<? super T, ? super T, wn.v> pVar, c1<T, V> c1Var) {
            super(1);
            this.f54153w = pVar;
            this.f54154x = c1Var;
        }

        public final void a(u.h<T, V> hVar) {
            jo.p.h(hVar, "$this$animate");
            this.f54153w.invoke(hVar.e(), this.f54154x.b().invoke(hVar.g()));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Object obj) {
            a((u.h) obj);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {229, 261}, m = "animate")
    /* loaded from: classes.dex */
    public static final class b<T, V extends p> extends co.d {
        public /* synthetic */ Object A;
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f54155w;

        /* renamed from: x  reason: collision with root package name */
        public Object f54156x;

        /* renamed from: y  reason: collision with root package name */
        public Object f54157y;

        /* renamed from: z  reason: collision with root package name */
        public Object f54158z;

        public b(ao.d<? super b> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.B |= Integer.MIN_VALUE;
            return x0.c(null, null, 0L, null, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l {

        /* renamed from: w  reason: collision with root package name */
        public static final c f54159w = new c();

        public c() {
            super(1);
        }

        public final void a(u.h hVar) {
            jo.p.h(hVar, "$this$null");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((u.h) obj);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Incorrect field signature: TV; */
    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<Long, wn.v> {
        public final /* synthetic */ k<T, V> A;
        public final /* synthetic */ io.l<u.h<T, V>, wn.v> B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ jo.e0<u.h<T, V>> f54160w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ T f54161x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u.d<T, V> f54162y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ p f54163z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ k<T, V> f54164w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k<T, V> kVar) {
                super(0);
                this.f54164w = kVar;
            }

            public final void a() {
                this.f54164w.u(false);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Ljo/e0<Lu/h<TT;TV;>;>;TT;Lu/d<TT;TV;>;TV;Lu/k<TT;TV;>;Lio/l<-Lu/h<TT;TV;>;Lwn/v;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        public d(jo.e0 e0Var, Object obj, u.d dVar, p pVar, k kVar, io.l lVar) {
            super(1);
            this.f54160w = e0Var;
            this.f54161x = obj;
            this.f54162y = dVar;
            this.f54163z = pVar;
            this.A = kVar;
            this.B = lVar;
        }

        /* JADX WARN: Type inference failed for: r12v0, types: [T, u.h] */
        public final void a(long j10) {
            jo.e0<u.h<T, V>> e0Var = this.f54160w;
            ?? hVar = new u.h(this.f54161x, this.f54162y.e(), this.f54163z, j10, this.f54162y.g(), j10, true, new a(this.A));
            x0.m(hVar, j10, this.f54162y, this.A, this.B);
            e0Var.f38136w = hVar;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Long l10) {
            a(l10.longValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ k<T, V> f54165w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(k<T, V> kVar) {
            super(0);
            this.f54165w = kVar;
        }

        public final void a() {
            this.f54165w.u(false);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<Long, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ jo.e0<u.h<T, V>> f54166w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ u.d<T, V> f54167x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ k<T, V> f54168y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<u.h<T, V>, wn.v> f54169z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(jo.e0<u.h<T, V>> e0Var, u.d<T, V> dVar, k<T, V> kVar, io.l<? super u.h<T, V>, wn.v> lVar) {
            super(1);
            this.f54166w = e0Var;
            this.f54167x = dVar;
            this.f54168y = kVar;
            this.f54169z = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(long j10) {
            T t10 = this.f54166w.f38136w;
            jo.p.e(t10);
            x0.m((u.h) t10, j10, this.f54167x, this.f54168y, this.f54169z);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Long l10) {
            a(l10.longValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.l<u.h<Float, m>, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<Float, Float, wn.v> f54170w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(io.p<? super Float, ? super Float, wn.v> pVar) {
            super(1);
            this.f54170w = pVar;
        }

        public final void a(u.h<Float, m> hVar) {
            jo.p.h(hVar, "$this$animate");
            this.f54170w.invoke(hVar.e(), Float.valueOf(hVar.g().f()));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(u.h<Float, m> hVar) {
            a(hVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l {

        /* renamed from: w  reason: collision with root package name */
        public static final h f54171w = new h();

        static {
        }

        public h() {
            super(1);
        }

        public final void a(u.h hVar) {
            jo.p.h(hVar, "$this$null");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((u.h) obj);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.l {

        /* renamed from: w  reason: collision with root package name */
        public static final i f54172w = new i();

        static {
        }

        public i() {
            super(1);
        }

        public final void a(u.h hVar) {
            jo.p.h(hVar, "$this$null");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((u.h) obj);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.l<Long, R> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<Long, R> f54173w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(io.l<? super Long, ? extends R> lVar) {
            super(1);
            this.f54173w = lVar;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [R, java.lang.Object] */
        public final R a(long j10) {
            return this.f54173w.invoke(Long.valueOf(j10 / 1));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Object invoke(Long l10) {
            return a(l10.longValue());
        }
    }

    public static final Object b(float f10, float f11, float f12, u.i<Float> iVar, io.p<? super Float, ? super Float, wn.v> pVar, ao.d<? super wn.v> dVar) {
        Object d10 = d(e1.e(jo.i.f38148a), co.b.c(f10), co.b.c(f11), co.b.c(f12), iVar, pVar, dVar);
        return d10 == bo.c.c() ? d10 : wn.v.f59242a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5 A[Catch: CancellationException -> 0x0061, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0061, blocks: (B:16:0x005a, B:35:0x00d8, B:37:0x00e5), top: B:63:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, u.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, V extends u.p> java.lang.Object c(u.k<T, V> r24, u.d<T, V> r25, long r26, io.l<? super u.h<T, V>, wn.v> r28, ao.d<? super wn.v> r29) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.x0.c(u.k, u.d, long, io.l, ao.d):java.lang.Object");
    }

    public static final <T, V extends p> Object d(c1<T, V> c1Var, T t10, T t11, T t12, u.i<T> iVar, io.p<? super T, ? super T, wn.v> pVar, ao.d<? super wn.v> dVar) {
        V invoke = t12 == null ? null : c1Var.a().invoke(t12);
        if (invoke == null) {
            invoke = q.d(c1Var.a().invoke(t10));
        }
        Object f10 = f(new k(c1Var, t10, invoke, 0L, 0L, false, 56, null), new y0(iVar, c1Var, t10, t11, invoke), 0L, new a(pVar, c1Var), dVar, 2, null);
        return f10 == bo.c.c() ? f10 : wn.v.f59242a;
    }

    public static /* synthetic */ Object e(float f10, float f11, float f12, u.i iVar, io.p pVar, ao.d dVar, int i10, Object obj) {
        float f13 = (i10 & 4) != 0 ? 0.0f : f12;
        if ((i10 & 8) != 0) {
            iVar = u.j.g(0.0f, 0.0f, null, 7, null);
        }
        return b(f10, f11, f13, iVar, pVar, dVar);
    }

    public static /* synthetic */ Object f(k kVar, u.d dVar, long j10, io.l lVar, ao.d dVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            lVar = c.f54159w;
        }
        return c(kVar, dVar, j11, lVar, dVar2);
    }

    public static final Object g(float f10, float f11, e0 e0Var, io.p<? super Float, ? super Float, wn.v> pVar, ao.d<? super wn.v> dVar) {
        Object f12 = f(l.b(f10, f11, 0L, 0L, false, 28, null), u.f.a(e0Var, f10, f11), 0L, new g(pVar), dVar, 2, null);
        return f12 == bo.c.c() ? f12 : wn.v.f59242a;
    }

    public static final <T, V extends p> Object h(k<T, V> kVar, w<T> wVar, boolean z10, io.l<? super u.h<T, V>, wn.v> lVar, ao.d<? super wn.v> dVar) {
        Object c10 = c(kVar, new v(wVar, kVar.k(), kVar.getValue(), kVar.q()), z10 ? kVar.j() : Long.MIN_VALUE, lVar, dVar);
        return c10 == bo.c.c() ? c10 : wn.v.f59242a;
    }

    public static /* synthetic */ Object i(k kVar, w wVar, boolean z10, io.l lVar, ao.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            lVar = h.f54171w;
        }
        return h(kVar, wVar, z10, lVar, dVar);
    }

    public static final <T, V extends p> Object j(k<T, V> kVar, T t10, u.i<T> iVar, boolean z10, io.l<? super u.h<T, V>, wn.v> lVar, ao.d<? super wn.v> dVar) {
        Object c10 = c(kVar, new y0(iVar, kVar.k(), kVar.getValue(), t10, kVar.q()), z10 ? kVar.j() : Long.MIN_VALUE, lVar, dVar);
        return c10 == bo.c.c() ? c10 : wn.v.f59242a;
    }

    public static /* synthetic */ Object k(k kVar, Object obj, u.i iVar, boolean z10, io.l lVar, ao.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            iVar = u.j.g(0.0f, 0.0f, null, 7, null);
        }
        u.i iVar2 = iVar;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            lVar = i.f54172w;
        }
        return j(kVar, obj, iVar2, z11, lVar, dVar);
    }

    public static final <R, T, V extends p> Object l(u.d<T, V> dVar, io.l<? super Long, ? extends R> lVar, ao.d<? super R> dVar2) {
        if (dVar.a()) {
            return h0.a(lVar, dVar2);
        }
        return l0.o0.b(new j(lVar), dVar2);
    }

    public static final <T, V extends p> void m(u.h<T, V> hVar, long j10, u.d<T, V> dVar, k<T, V> kVar, io.l<? super u.h<T, V>, wn.v> lVar) {
        hVar.j(j10);
        long d10 = j10 - hVar.d();
        hVar.l(dVar.f(d10));
        hVar.m(dVar.b(d10));
        if (dVar.c(d10)) {
            hVar.i(hVar.c());
            hVar.k(false);
        }
        n(hVar, kVar);
        lVar.invoke(hVar);
    }

    public static final <T, V extends p> void n(u.h<T, V> hVar, k<T, V> kVar) {
        jo.p.h(hVar, "<this>");
        jo.p.h(kVar, "state");
        kVar.v(hVar.e());
        q.c(kVar.q(), hVar.g());
        kVar.s(hVar.b());
        kVar.t(hVar.c());
        kVar.u(hVar.h());
    }
}
