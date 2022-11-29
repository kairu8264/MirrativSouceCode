package u;

import java.util.concurrent.CancellationException;
import l0.c2;
import l0.z1;
import u.p;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class a<T, V extends p> {

    /* renamed from: l  reason: collision with root package name */
    public static final int f53905l = 8;

    /* renamed from: a  reason: collision with root package name */
    public final c1<T, V> f53906a;

    /* renamed from: b  reason: collision with root package name */
    public final T f53907b;

    /* renamed from: c  reason: collision with root package name */
    public final k<T, V> f53908c;

    /* renamed from: d  reason: collision with root package name */
    public final l0.s0 f53909d;

    /* renamed from: e  reason: collision with root package name */
    public final l0.s0 f53910e;

    /* renamed from: f  reason: collision with root package name */
    public final p0 f53911f;

    /* renamed from: g  reason: collision with root package name */
    public final u0<T> f53912g;

    /* renamed from: h  reason: collision with root package name */
    public final V f53913h;

    /* renamed from: i  reason: collision with root package name */
    public final V f53914i;

    /* renamed from: j  reason: collision with root package name */
    public V f53915j;

    /* renamed from: k  reason: collision with root package name */
    public V f53916k;

    @co.f(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {291}, m = "invokeSuspend")
    /* renamed from: u.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0844a extends co.l implements io.l<ao.d<? super g<T, V>>, Object> {
        public final /* synthetic */ T A;
        public final /* synthetic */ d<T, V> B;
        public final /* synthetic */ long C;
        public final /* synthetic */ io.l<a<T, V>, wn.v> D;

        /* renamed from: w  reason: collision with root package name */
        public Object f53917w;

        /* renamed from: x  reason: collision with root package name */
        public Object f53918x;

        /* renamed from: y  reason: collision with root package name */
        public int f53919y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ a<T, V> f53920z;

        /* renamed from: u.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0845a extends jo.q implements io.l<h<T, V>, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a<T, V> f53921w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ k<T, V> f53922x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.l<a<T, V>, wn.v> f53923y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ jo.a0 f53924z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0845a(a<T, V> aVar, k<T, V> kVar, io.l<? super a<T, V>, wn.v> lVar, jo.a0 a0Var) {
                super(1);
                this.f53921w = aVar;
                this.f53922x = kVar;
                this.f53923y = lVar;
                this.f53924z = a0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void a(h<T, V> hVar) {
                jo.p.h(hVar, "$this$animate");
                x0.n(hVar, this.f53921w.l());
                Object h10 = this.f53921w.h(hVar.e());
                if (!jo.p.c(h10, hVar.e())) {
                    this.f53921w.l().v(h10);
                    this.f53922x.v(h10);
                    io.l<a<T, V>, wn.v> lVar = this.f53923y;
                    if (lVar != null) {
                        lVar.invoke(this.f53921w);
                    }
                    hVar.a();
                    this.f53924z.f38125w = true;
                    return;
                }
                io.l<a<T, V>, wn.v> lVar2 = this.f53923y;
                if (lVar2 == null) {
                    return;
                }
                lVar2.invoke(this.f53921w);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(Object obj) {
                a((h) obj);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0844a(a<T, V> aVar, T t10, d<T, V> dVar, long j10, io.l<? super a<T, V>, wn.v> lVar, ao.d<? super C0844a> dVar2) {
            super(1, dVar2);
            this.f53920z = aVar;
            this.A = t10;
            this.B = dVar;
            this.C = j10;
            this.D = lVar;
        }

        public final Object a(ao.d<? super g<T, V>> dVar) {
            return ((C0844a) create(dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(ao.d<?> dVar) {
            return new C0844a(this.f53920z, this.A, this.B, this.C, this.D, dVar);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a((ao.d) obj);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            k kVar;
            jo.a0 a0Var;
            Object c10 = bo.c.c();
            int i10 = this.f53919y;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f53920z.l().w(this.f53920z.n().a().invoke(this.A));
                    this.f53920z.u(this.B.g());
                    this.f53920z.t(true);
                    k f10 = l.f(this.f53920z.l(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    jo.a0 a0Var2 = new jo.a0();
                    d<T, V> dVar = this.B;
                    long j10 = this.C;
                    C0845a c0845a = new C0845a(this.f53920z, f10, this.D, a0Var2);
                    this.f53917w = f10;
                    this.f53918x = a0Var2;
                    this.f53919y = 1;
                    if (x0.c(f10, dVar, j10, c0845a, this) == c10) {
                        return c10;
                    }
                    kVar = f10;
                    a0Var = a0Var2;
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    a0Var = (jo.a0) this.f53918x;
                    kVar = (k) this.f53917w;
                    wn.m.b(obj);
                }
                e eVar = a0Var.f38125w ? e.BoundReached : e.Finished;
                this.f53920z.j();
                return new g(kVar, eVar);
            } catch (CancellationException e10) {
                this.f53920z.j();
                throw e10;
            }
        }
    }

    @co.f(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.l<ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53925w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a<T, V> f53926x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ T f53927y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<T, V> aVar, T t10, ao.d<? super b> dVar) {
            super(1, dVar);
            this.f53926x = aVar;
            this.f53927y = t10;
        }

        public final Object a(ao.d<? super wn.v> dVar) {
            return ((b) create(dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(ao.d<?> dVar) {
            return new b(this.f53926x, this.f53927y, dVar);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Object invoke(ao.d<? super wn.v> dVar) {
            return a(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f53925w == 0) {
                wn.m.b(obj);
                this.f53926x.j();
                Object h10 = this.f53926x.h(this.f53927y);
                this.f53926x.l().v(h10);
                this.f53926x.u(h10);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
    }

    public a(T t10, c1<T, V> c1Var, T t11) {
        l0.s0 e10;
        l0.s0 e11;
        jo.p.h(c1Var, "typeConverter");
        this.f53906a = c1Var;
        this.f53907b = t11;
        this.f53908c = new k<>(c1Var, t10, null, 0L, 0L, false, 60, null);
        e10 = z1.e(Boolean.FALSE, null, 2, null);
        this.f53909d = e10;
        e11 = z1.e(t10, null, 2, null);
        this.f53910e = e11;
        this.f53911f = new p0();
        this.f53912g = new u0<>(0.0f, 0.0f, t11, 3, null);
        V i10 = i(t10, Float.NEGATIVE_INFINITY);
        this.f53913h = i10;
        V i11 = i(t10, Float.POSITIVE_INFINITY);
        this.f53914i = i11;
        this.f53915j = i10;
        this.f53916k = i11;
    }

    public static /* synthetic */ Object f(a aVar, Object obj, i iVar, Object obj2, io.l lVar, ao.d dVar, int i10, Object obj3) {
        u0 u0Var = iVar;
        if ((i10 & 2) != 0) {
            u0Var = aVar.k();
        }
        i iVar2 = u0Var;
        Object obj4 = obj2;
        if ((i10 & 4) != 0) {
            obj4 = aVar.p();
        }
        Object obj5 = obj4;
        io.l lVar2 = lVar;
        if ((i10 & 8) != 0) {
            lVar2 = null;
        }
        return aVar.e(obj, iVar2, obj5, lVar2, dVar);
    }

    public final Object e(T t10, i<T> iVar, T t11, io.l<? super a<T, V>, wn.v> lVar, ao.d<? super g<T, V>> dVar) {
        return s(f.b(iVar, n(), o(), t10, t11), t11, lVar, dVar);
    }

    public final c2<T> g() {
        return this.f53908c;
    }

    public final T h(T t10) {
        if (jo.p.c(this.f53915j, this.f53913h) && jo.p.c(this.f53916k, this.f53914i)) {
            return t10;
        }
        V invoke = this.f53906a.a().invoke(t10);
        int b10 = invoke.b();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < b10) {
            int i11 = i10 + 1;
            if (invoke.a(i10) < this.f53915j.a(i10) || invoke.a(i10) > this.f53916k.a(i10)) {
                invoke.e(i10, po.n.l(invoke.a(i10), this.f53915j.a(i10), this.f53916k.a(i10)));
                z10 = true;
            }
            i10 = i11;
        }
        return z10 ? this.f53906a.b().invoke(invoke) : t10;
    }

    public final V i(T t10, float f10) {
        V invoke = this.f53906a.a().invoke(t10);
        int b10 = invoke.b();
        for (int i10 = 0; i10 < b10; i10++) {
            invoke.e(i10, f10);
        }
        return invoke;
    }

    public final void j() {
        k<T, V> kVar = this.f53908c;
        kVar.q().d();
        kVar.t(Long.MIN_VALUE);
        t(false);
    }

    public final u0<T> k() {
        return this.f53912g;
    }

    public final k<T, V> l() {
        return this.f53908c;
    }

    public final T m() {
        return this.f53910e.getValue();
    }

    public final c1<T, V> n() {
        return this.f53906a;
    }

    public final T o() {
        return this.f53908c.getValue();
    }

    public final T p() {
        return this.f53906a.b().invoke(q());
    }

    public final V q() {
        return this.f53908c.q();
    }

    public final boolean r() {
        return ((Boolean) this.f53909d.getValue()).booleanValue();
    }

    public final Object s(d<T, V> dVar, T t10, io.l<? super a<T, V>, wn.v> lVar, ao.d<? super g<T, V>> dVar2) {
        return p0.e(this.f53911f, null, new C0844a(this, t10, dVar, l().j(), lVar, null), dVar2, 1, null);
    }

    public final void t(boolean z10) {
        this.f53909d.setValue(Boolean.valueOf(z10));
    }

    public final void u(T t10) {
        this.f53910e.setValue(t10);
    }

    public final Object v(T t10, ao.d<? super wn.v> dVar) {
        Object e10 = p0.e(this.f53911f, null, new b(this, t10, null), dVar, 1, null);
        return e10 == bo.c.c() ? e10 : wn.v.f59242a;
    }

    public /* synthetic */ a(Object obj, c1 c1Var, Object obj2, int i10, jo.h hVar) {
        this(obj, c1Var, (i10 & 4) != 0 ? null : obj2);
    }
}
