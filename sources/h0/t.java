package h0;

import l0.c2;
import l0.i;

/* loaded from: classes.dex */
public final class t implements l0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f34196a;

    /* renamed from: b  reason: collision with root package name */
    public final float f34197b;

    /* renamed from: c  reason: collision with root package name */
    public final float f34198c;

    /* renamed from: d  reason: collision with root package name */
    public final float f34199d;

    @co.f(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1", f = "FloatingActionButton.kt", l = {273}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34200w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x.k f34201x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ v0.s<x.j> f34202y;

        /* renamed from: h0.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0425a implements xo.d<x.j> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ v0.s<x.j> f34203w;

            public C0425a(v0.s<x.j> sVar) {
                this.f34203w = sVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(x.j jVar, ao.d<? super wn.v> dVar) {
                if (jVar instanceof x.g) {
                    this.f34203w.add(jVar);
                } else if (jVar instanceof x.h) {
                    this.f34203w.remove(((x.h) jVar).a());
                } else if (jVar instanceof x.d) {
                    this.f34203w.add(jVar);
                } else if (jVar instanceof x.e) {
                    this.f34203w.remove(((x.e) jVar).a());
                } else if (jVar instanceof x.p) {
                    this.f34203w.add(jVar);
                } else if (jVar instanceof x.q) {
                    this.f34203w.remove(((x.q) jVar).a());
                } else if (jVar instanceof x.o) {
                    this.f34203w.remove(((x.o) jVar).a());
                }
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x.k kVar, v0.s<x.j> sVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f34201x = kVar;
            this.f34202y = sVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f34201x, this.f34202y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34200w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<x.j> c11 = this.f34201x.c();
                C0425a c0425a = new C0425a(this.f34202y);
                this.f34200w = 1;
                if (c11.a(c0425a, this) == c10) {
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

    @co.f(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2", f = "FloatingActionButton.kt", l = {318}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ x.j A;

        /* renamed from: w  reason: collision with root package name */
        public int f34204w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ u.a<m2.g, u.m> f34205x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ t f34206y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ float f34207z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u.a<m2.g, u.m> aVar, t tVar, float f10, x.j jVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f34205x = aVar;
            this.f34206y = tVar;
            this.f34207z = f10;
            this.A = jVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f34205x, this.f34206y, this.f34207z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34204w;
            if (i10 == 0) {
                wn.m.b(obj);
                float q10 = this.f34205x.m().q();
                x.j jVar = null;
                if (m2.g.n(q10, this.f34206y.f34197b)) {
                    jVar = new x.p(b1.f.f16721b.c(), null);
                } else if (m2.g.n(q10, this.f34206y.f34198c)) {
                    jVar = new x.g();
                } else if (m2.g.n(q10, this.f34206y.f34199d)) {
                    jVar = new x.d();
                }
                u.a<m2.g, u.m> aVar = this.f34205x;
                float f10 = this.f34207z;
                x.j jVar2 = this.A;
                this.f34204w = 1;
                if (c0.d(aVar, f10, jVar, jVar2, this) == c10) {
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

    public t(float f10, float f11, float f12, float f13) {
        this.f34196a = f10;
        this.f34197b = f11;
        this.f34198c = f12;
        this.f34199d = f13;
    }

    public /* synthetic */ t(float f10, float f11, float f12, float f13, jo.h hVar) {
        this(f10, f11, f12, f13);
    }

    @Override // h0.l0
    public c2<m2.g> a(x.k kVar, l0.i iVar, int i10) {
        float f10;
        jo.p.h(kVar, "interactionSource");
        iVar.x(-478475335);
        iVar.x(-492369756);
        Object y10 = iVar.y();
        i.a aVar = l0.i.f39065a;
        if (y10 == aVar.a()) {
            y10 = l0.u1.c();
            iVar.q(y10);
        }
        iVar.O();
        v0.s sVar = (v0.s) y10;
        l0.c0.c(kVar, new a(kVar, sVar, null), iVar, i10 & 14);
        x.j jVar = (x.j) xn.a0.j0(sVar);
        if (jVar instanceof x.p) {
            f10 = this.f34197b;
        } else if (jVar instanceof x.g) {
            f10 = this.f34198c;
        } else {
            f10 = jVar instanceof x.d ? this.f34199d : this.f34196a;
        }
        float f11 = f10;
        iVar.x(-492369756);
        Object y11 = iVar.y();
        if (y11 == aVar.a()) {
            y11 = new u.a(m2.g.e(f11), u.e1.g(m2.g.f40516x), null, 4, null);
            iVar.q(y11);
        }
        iVar.O();
        u.a aVar2 = (u.a) y11;
        l0.c0.c(m2.g.e(f11), new b(aVar2, this, f11, jVar, null), iVar, 0);
        c2<m2.g> g10 = aVar2.g();
        iVar.O();
        return g10;
    }
}
