package h0;

import l0.c2;
import l0.i;

/* loaded from: classes.dex */
public final class r implements e {

    /* renamed from: a  reason: collision with root package name */
    public final float f34136a;

    /* renamed from: b  reason: collision with root package name */
    public final float f34137b;

    /* renamed from: c  reason: collision with root package name */
    public final float f34138c;

    /* renamed from: d  reason: collision with root package name */
    public final float f34139d;

    /* renamed from: e  reason: collision with root package name */
    public final float f34140e;

    @co.f(c = "androidx.compose.material.DefaultButtonElevation$elevation$1", f = "Button.kt", l = {506}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34141w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x.k f34142x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ v0.s<x.j> f34143y;

        /* renamed from: h0.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0422a implements xo.d<x.j> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ v0.s<x.j> f34144w;

            public C0422a(v0.s<x.j> sVar) {
                this.f34144w = sVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(x.j jVar, ao.d<? super wn.v> dVar) {
                if (jVar instanceof x.g) {
                    this.f34144w.add(jVar);
                } else if (jVar instanceof x.h) {
                    this.f34144w.remove(((x.h) jVar).a());
                } else if (jVar instanceof x.d) {
                    this.f34144w.add(jVar);
                } else if (jVar instanceof x.e) {
                    this.f34144w.remove(((x.e) jVar).a());
                } else if (jVar instanceof x.p) {
                    this.f34144w.add(jVar);
                } else if (jVar instanceof x.q) {
                    this.f34144w.remove(((x.q) jVar).a());
                } else if (jVar instanceof x.o) {
                    this.f34144w.remove(((x.o) jVar).a());
                }
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x.k kVar, v0.s<x.j> sVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f34142x = kVar;
            this.f34143y = sVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f34142x, this.f34143y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34141w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<x.j> c11 = this.f34142x.c();
                C0422a c0422a = new C0422a(this.f34143y);
                this.f34141w = 1;
                if (c11.a(c0422a, this) == c10) {
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

    @co.f(c = "androidx.compose.material.DefaultButtonElevation$elevation$2", f = "Button.kt", l = {551}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34145w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ u.a<m2.g, u.m> f34146x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f34147y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u.a<m2.g, u.m> aVar, float f10, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f34146x = aVar;
            this.f34147y = f10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f34146x, this.f34147y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34145w;
            if (i10 == 0) {
                wn.m.b(obj);
                u.a<m2.g, u.m> aVar = this.f34146x;
                m2.g e10 = m2.g.e(this.f34147y);
                this.f34145w = 1;
                if (aVar.v(e10, this) == c10) {
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

    @co.f(c = "androidx.compose.material.DefaultButtonElevation$elevation$3", f = "Button.kt", l = {561}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ x.j A;

        /* renamed from: w  reason: collision with root package name */
        public int f34148w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ u.a<m2.g, u.m> f34149x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ r f34150y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ float f34151z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(u.a<m2.g, u.m> aVar, r rVar, float f10, x.j jVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f34149x = aVar;
            this.f34150y = rVar;
            this.f34151z = f10;
            this.A = jVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f34149x, this.f34150y, this.f34151z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34148w;
            if (i10 == 0) {
                wn.m.b(obj);
                float q10 = this.f34149x.m().q();
                x.j jVar = null;
                if (m2.g.n(q10, this.f34150y.f34137b)) {
                    jVar = new x.p(b1.f.f16721b.c(), null);
                } else if (m2.g.n(q10, this.f34150y.f34139d)) {
                    jVar = new x.g();
                } else if (m2.g.n(q10, this.f34150y.f34140e)) {
                    jVar = new x.d();
                }
                u.a<m2.g, u.m> aVar = this.f34149x;
                float f10 = this.f34151z;
                x.j jVar2 = this.A;
                this.f34148w = 1;
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

    public r(float f10, float f11, float f12, float f13, float f14) {
        this.f34136a = f10;
        this.f34137b = f11;
        this.f34138c = f12;
        this.f34139d = f13;
        this.f34140e = f14;
    }

    public /* synthetic */ r(float f10, float f11, float f12, float f13, float f14, jo.h hVar) {
        this(f10, f11, f12, f13, f14);
    }

    @Override // h0.e
    public c2<m2.g> a(boolean z10, x.k kVar, l0.i iVar, int i10) {
        float f10;
        jo.p.h(kVar, "interactionSource");
        iVar.x(-1588756907);
        iVar.x(-492369756);
        Object y10 = iVar.y();
        i.a aVar = l0.i.f39065a;
        if (y10 == aVar.a()) {
            y10 = l0.u1.c();
            iVar.q(y10);
        }
        iVar.O();
        v0.s sVar = (v0.s) y10;
        l0.c0.c(kVar, new a(kVar, sVar, null), iVar, (i10 >> 3) & 14);
        x.j jVar = (x.j) xn.a0.j0(sVar);
        if (!z10) {
            f10 = this.f34138c;
        } else if (jVar instanceof x.p) {
            f10 = this.f34137b;
        } else if (jVar instanceof x.g) {
            f10 = this.f34139d;
        } else {
            f10 = jVar instanceof x.d ? this.f34140e : this.f34136a;
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
        if (!z10) {
            iVar.x(-1598807481);
            l0.c0.c(m2.g.e(f11), new b(aVar2, f11, null), iVar, 0);
            iVar.O();
        } else {
            iVar.x(-1598807310);
            l0.c0.c(m2.g.e(f11), new c(aVar2, this, f11, jVar, null), iVar, 0);
            iVar.O();
        }
        c2<m2.g> g10 = aVar2.g();
        iVar.O();
        return g10;
    }
}
