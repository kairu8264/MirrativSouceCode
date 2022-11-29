package g0;

import l0.c2;
import l0.i;
import l0.u1;
import u.c1;
import u.e1;
import u.u0;
import uo.d2;
import uo.q0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final u.n f32252a = new u.n(Float.NaN, Float.NaN);

    /* renamed from: b  reason: collision with root package name */
    public static final c1<b1.f, u.n> f32253b = e1.a(a.f32256w, b.f32257w);

    /* renamed from: c  reason: collision with root package name */
    public static final long f32254c;

    /* renamed from: d  reason: collision with root package name */
    public static final u0<b1.f> f32255d;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<b1.f, u.n> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f32256w = new a();

        public a() {
            super(1);
        }

        public final u.n a(long j10) {
            if (!b1.g.c(j10)) {
                return o.f32252a;
            }
            return new u.n(b1.f.m(j10), b1.f.n(j10));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ u.n invoke(b1.f fVar) {
            return a(fVar.u());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<u.n, b1.f> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f32257w = new b();

        public b() {
            super(1);
        }

        public final long a(u.n nVar) {
            jo.p.h(nVar, "it");
            return b1.g.a(nVar.f(), nVar.g());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ b1.f invoke(u.n nVar) {
            return b1.f.d(a(nVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<b1.f> f32258w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<io.a<b1.f>, x0.f> f32259x;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<b1.f> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c2<b1.f> f32260w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c2<b1.f> c2Var) {
                super(0);
                this.f32260w = c2Var;
            }

            public final long a() {
                return c.c(this.f32260w);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ b1.f invoke() {
                return b1.f.d(a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.a<b1.f> aVar, io.l<? super io.a<b1.f>, ? extends x0.f> lVar) {
            super(3);
            this.f32258w = aVar;
            this.f32259x = lVar;
        }

        public static final long c(c2<b1.f> c2Var) {
            return c2Var.getValue().u();
        }

        public final x0.f b(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(759876635);
            x0.f invoke = this.f32259x.invoke(new a(o.f(this.f32258w, iVar, 0)));
            iVar.O();
            return invoke;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return b(fVar, iVar, num.intValue());
        }
    }

    @co.f(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", l = {88}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f32261w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f32262x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c2<b1.f> f32263y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ u.a<b1.f, u.n> f32264z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<b1.f> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c2<b1.f> f32265w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c2<b1.f> c2Var) {
                super(0);
                this.f32265w = c2Var;
            }

            public final long a() {
                return o.g(this.f32265w);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ b1.f invoke() {
                return b1.f.d(a());
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements xo.d<b1.f> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ u.a<b1.f, u.n> f32266w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ q0 f32267x;

            @co.f(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2", f = "SelectionMagnifier.kt", l = {102}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f32268w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ u.a<b1.f, u.n> f32269x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ long f32270y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(u.a<b1.f, u.n> aVar, long j10, ao.d<? super a> dVar) {
                    super(2, dVar);
                    this.f32269x = aVar;
                    this.f32270y = j10;
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    return new a(this.f32269x, this.f32270y, dVar);
                }

                @Override // io.p
                public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                    return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f32268w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        u.a<b1.f, u.n> aVar = this.f32269x;
                        b1.f d10 = b1.f.d(this.f32270y);
                        u0 u0Var = o.f32255d;
                        this.f32268w = 1;
                        if (u.a.f(aVar, d10, u0Var, null, null, this, 12, null) == c10) {
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

            public b(u.a<b1.f, u.n> aVar, q0 q0Var) {
                this.f32266w = aVar;
                this.f32267x = q0Var;
            }

            public final Object a(long j10, ao.d<? super wn.v> dVar) {
                d2 d10;
                if (b1.g.c(this.f32266w.o().u()) && b1.g.c(j10)) {
                    if (!(b1.f.n(this.f32266w.o().u()) == b1.f.n(j10))) {
                        d10 = uo.l.d(this.f32267x, null, null, new a(this.f32266w, j10, null), 3, null);
                        return d10 == bo.c.c() ? d10 : wn.v.f59242a;
                    }
                }
                Object v10 = this.f32266w.v(b1.f.d(j10), dVar);
                return v10 == bo.c.c() ? v10 : wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(b1.f fVar, ao.d dVar) {
                return a(fVar.u(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c2<b1.f> c2Var, u.a<b1.f, u.n> aVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f32263y = c2Var;
            this.f32264z = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            d dVar2 = new d(this.f32263y, this.f32264z, dVar);
            dVar2.f32262x = obj;
            return dVar2;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f32261w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c m10 = u1.m(new a(this.f32263y));
                b bVar = new b(this.f32264z, (q0) this.f32262x);
                this.f32261w = 1;
                if (m10.a(bVar, this) == c10) {
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

    static {
        long a10 = b1.g.a(0.01f, 0.01f);
        f32254c = a10;
        f32255d = new u0<>(0.0f, 0.0f, b1.f.d(a10), 3, null);
    }

    public static final x0.f e(x0.f fVar, io.a<b1.f> aVar, io.l<? super io.a<b1.f>, ? extends x0.f> lVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(aVar, "magnifierCenter");
        jo.p.h(lVar, "platformMagnifier");
        return x0.e.d(fVar, null, new c(aVar, lVar), 1, null);
    }

    public static final c2<b1.f> f(io.a<b1.f> aVar, l0.i iVar, int i10) {
        iVar.x(-1589795249);
        iVar.x(-492369756);
        Object y10 = iVar.y();
        i.a aVar2 = l0.i.f39065a;
        if (y10 == aVar2.a()) {
            y10 = u1.b(aVar);
            iVar.q(y10);
        }
        iVar.O();
        c2 c2Var = (c2) y10;
        iVar.x(-492369756);
        Object y11 = iVar.y();
        if (y11 == aVar2.a()) {
            y11 = new u.a(b1.f.d(g(c2Var)), f32253b, b1.f.d(f32254c));
            iVar.q(y11);
        }
        iVar.O();
        u.a aVar3 = (u.a) y11;
        l0.c0.c(wn.v.f59242a, new d(c2Var, aVar3, null), iVar, 0);
        c2<b1.f> g10 = aVar3.g();
        iVar.O();
        return g10;
    }

    public static final long g(c2<b1.f> c2Var) {
        return c2Var.getValue().u();
    }
}
