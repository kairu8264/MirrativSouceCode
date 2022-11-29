package z5;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import c1.d0;
import c1.e0;
import io.l;
import j6.i;
import jo.p;
import jo.q;
import kotlin.NoWhenBranchMatchedException;
import l0.k1;
import l0.s0;
import l0.u1;
import l0.z1;
import uo.b3;
import uo.g1;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;
import xo.i0;
import xo.s;

/* loaded from: classes.dex */
public final class b extends f1.d implements k1 {
    public static final C1075b R = new C1075b(null);
    public static final l<c, c> S = a.f62530w;
    public q0 C;
    public final s<b1.l> D = i0.a(b1.l.c(b1.l.f16742b.b()));
    public final s0 E;
    public final s0 F;
    public final s0 G;
    public c H;
    public f1.d I;
    public l<? super c, ? extends c> J;
    public l<? super c, v> K;
    public q1.f L;
    public int M;
    public boolean N;
    public final s0 O;
    public final s0 P;
    public final s0 Q;

    /* loaded from: classes.dex */
    public static final class a extends q implements l<c, c> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f62530w = new a();

        public a() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final c invoke(c cVar) {
            return cVar;
        }
    }

    /* renamed from: z5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1075b {
        public C1075b() {
        }

        public /* synthetic */ C1075b(jo.h hVar) {
            this();
        }

        public final l<c, c> a() {
            return b.S;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* loaded from: classes.dex */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f62531a = new a();

            public a() {
                super(null);
            }

            @Override // z5.b.c
            public f1.d a() {
                return null;
            }
        }

        /* renamed from: z5.b$c$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1076b extends c {

            /* renamed from: a  reason: collision with root package name */
            public final f1.d f62532a;

            /* renamed from: b  reason: collision with root package name */
            public final j6.e f62533b;

            public C1076b(f1.d dVar, j6.e eVar) {
                super(null);
                this.f62532a = dVar;
                this.f62533b = eVar;
            }

            public static /* synthetic */ C1076b c(C1076b c1076b, f1.d dVar, j6.e eVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    dVar = c1076b.a();
                }
                if ((i10 & 2) != 0) {
                    eVar = c1076b.f62533b;
                }
                return c1076b.b(dVar, eVar);
            }

            @Override // z5.b.c
            public f1.d a() {
                return this.f62532a;
            }

            public final C1076b b(f1.d dVar, j6.e eVar) {
                return new C1076b(dVar, eVar);
            }

            public final j6.e d() {
                return this.f62533b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C1076b) {
                    C1076b c1076b = (C1076b) obj;
                    return p.c(a(), c1076b.a()) && p.c(this.f62533b, c1076b.f62533b);
                }
                return false;
            }

            public int hashCode() {
                return ((a() == null ? 0 : a().hashCode()) * 31) + this.f62533b.hashCode();
            }

            public String toString() {
                return "Error(painter=" + a() + ", result=" + this.f62533b + ')';
            }
        }

        /* renamed from: z5.b$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1077c extends c {

            /* renamed from: a  reason: collision with root package name */
            public final f1.d f62534a;

            public C1077c(f1.d dVar) {
                super(null);
                this.f62534a = dVar;
            }

            @Override // z5.b.c
            public f1.d a() {
                return this.f62534a;
            }

            public final C1077c b(f1.d dVar) {
                return new C1077c(dVar);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1077c) && p.c(a(), ((C1077c) obj).a());
            }

            public int hashCode() {
                if (a() == null) {
                    return 0;
                }
                return a().hashCode();
            }

            public String toString() {
                return "Loading(painter=" + a() + ')';
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends c {

            /* renamed from: a  reason: collision with root package name */
            public final f1.d f62535a;

            /* renamed from: b  reason: collision with root package name */
            public final j6.p f62536b;

            public d(f1.d dVar, j6.p pVar) {
                super(null);
                this.f62535a = dVar;
                this.f62536b = pVar;
            }

            @Override // z5.b.c
            public f1.d a() {
                return this.f62535a;
            }

            public final j6.p b() {
                return this.f62536b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    return p.c(a(), dVar.a()) && p.c(this.f62536b, dVar.f62536b);
                }
                return false;
            }

            public int hashCode() {
                return (a().hashCode() * 31) + this.f62536b.hashCode();
            }

            public String toString() {
                return "Success(painter=" + a() + ", result=" + this.f62536b + ')';
            }
        }

        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }

        public abstract f1.d a();
    }

    @co.f(c = "coil.compose.AsyncImagePainter$onRemembered$1", f = "AsyncImagePainter.kt", l = {246}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f62537w;

        /* loaded from: classes.dex */
        public static final class a extends q implements io.a<j6.i> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b f62539w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(0);
                this.f62539w = bVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final j6.i invoke() {
                return this.f62539w.A();
            }
        }

        @co.f(c = "coil.compose.AsyncImagePainter$onRemembered$1$2", f = "AsyncImagePainter.kt", l = {245}, m = "invokeSuspend")
        /* renamed from: z5.b$d$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1078b extends co.l implements io.p<j6.i, ao.d<? super c>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public Object f62540w;

            /* renamed from: x  reason: collision with root package name */
            public int f62541x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ b f62542y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1078b(b bVar, ao.d<? super C1078b> dVar) {
                super(2, dVar);
                this.f62542y = bVar;
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(j6.i iVar, ao.d<? super c> dVar) {
                return ((C1078b) create(iVar, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new C1078b(this.f62542y, dVar);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                b bVar;
                Object c10 = bo.c.c();
                int i10 = this.f62541x;
                if (i10 == 0) {
                    m.b(obj);
                    b bVar2 = this.f62542y;
                    x5.e y10 = bVar2.y();
                    b bVar3 = this.f62542y;
                    j6.i R = bVar3.R(bVar3.A());
                    this.f62540w = bVar2;
                    this.f62541x = 1;
                    Object b10 = y10.b(R, this);
                    if (b10 == c10) {
                        return c10;
                    }
                    bVar = bVar2;
                    obj = b10;
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    bVar = (b) this.f62540w;
                    m.b(obj);
                }
                return bVar.Q((j6.j) obj);
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class c implements xo.d, jo.j {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b f62543w;

            public c(b bVar) {
                this.f62543w = bVar;
            }

            @Override // jo.j
            public final wn.b<?> a() {
                return new jo.a(2, this.f62543w, b.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            @Override // xo.d
            /* renamed from: d */
            public final Object emit(c cVar, ao.d<? super v> dVar) {
                Object g10 = d.g(this.f62543w, cVar, dVar);
                return g10 == bo.c.c() ? g10 : v.f59242a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof xo.d) && (obj instanceof jo.j)) {
                    return p.c(a(), ((jo.j) obj).a());
                }
                return false;
            }

            public final int hashCode() {
                return a().hashCode();
            }
        }

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        public static final /* synthetic */ Object g(b bVar, c cVar, ao.d dVar) {
            bVar.S(cVar);
            return v.f59242a;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f62537w;
            if (i10 == 0) {
                m.b(obj);
                xo.c u10 = xo.e.u(u1.m(new a(b.this)), new C1078b(b.this, null));
                c cVar = new c(b.this);
                this.f62537w = 1;
                if (u10.a(cVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements l6.a {
        public e() {
        }

        @Override // l6.a
        public void e(Drawable drawable) {
        }

        @Override // l6.a
        public void j(Drawable drawable) {
            b.this.S(new c.C1077c(drawable == null ? null : b.this.P(drawable)));
        }

        @Override // l6.a
        public void k(Drawable drawable) {
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements k6.i {

        /* loaded from: classes.dex */
        public static final class a implements xo.c<k6.h> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.c f62546w;

            /* renamed from: z5.b$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1079a<T> implements xo.d {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ xo.d f62547w;

                @co.f(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", l = {225}, m = "emit")
                /* renamed from: z5.b$f$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C1080a extends co.d {

                    /* renamed from: w  reason: collision with root package name */
                    public /* synthetic */ Object f62548w;

                    /* renamed from: x  reason: collision with root package name */
                    public int f62549x;

                    public C1080a(ao.d dVar) {
                        super(dVar);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        this.f62548w = obj;
                        this.f62549x |= Integer.MIN_VALUE;
                        return C1079a.this.emit(null, this);
                    }
                }

                public C1079a(xo.d dVar) {
                    this.f62547w = dVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // xo.d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, ao.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof z5.b.f.a.C1079a.C1080a
                        if (r0 == 0) goto L13
                        r0 = r8
                        z5.b$f$a$a$a r0 = (z5.b.f.a.C1079a.C1080a) r0
                        int r1 = r0.f62549x
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f62549x = r1
                        goto L18
                    L13:
                        z5.b$f$a$a$a r0 = new z5.b$f$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f62548w
                        java.lang.Object r1 = bo.c.c()
                        int r2 = r0.f62549x
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        wn.m.b(r8)
                        goto L4c
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        wn.m.b(r8)
                        xo.d r8 = r6.f62547w
                        b1.l r7 = (b1.l) r7
                        long r4 = r7.m()
                        k6.h r7 = z5.c.b(r4)
                        if (r7 != 0) goto L43
                        goto L4c
                    L43:
                        r0.f62549x = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L4c
                        return r1
                    L4c:
                        wn.v r7 = wn.v.f59242a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: z5.b.f.a.C1079a.emit(java.lang.Object, ao.d):java.lang.Object");
                }
            }

            public a(xo.c cVar) {
                this.f62546w = cVar;
            }

            @Override // xo.c
            public Object a(xo.d<? super k6.h> dVar, ao.d dVar2) {
                Object a10 = this.f62546w.a(new C1079a(dVar), dVar2);
                return a10 == bo.c.c() ? a10 : v.f59242a;
            }
        }

        public f() {
        }

        @Override // k6.i
        public final Object b(ao.d<? super k6.h> dVar) {
            return xo.e.o(new a(b.this.D), dVar);
        }
    }

    public b(j6.i iVar, x5.e eVar) {
        s0 e10;
        s0 e11;
        s0 e12;
        s0 e13;
        s0 e14;
        s0 e15;
        e10 = z1.e(null, null, 2, null);
        this.E = e10;
        e11 = z1.e(Float.valueOf(1.0f), null, 2, null);
        this.F = e11;
        e12 = z1.e(null, null, 2, null);
        this.G = e12;
        c.a aVar = c.a.f62531a;
        this.H = aVar;
        this.J = S;
        this.L = q1.f.f48569a.d();
        this.M = e1.e.f30042e.b();
        e13 = z1.e(aVar, null, 2, null);
        this.O = e13;
        e14 = z1.e(iVar, null, 2, null);
        this.P = e14;
        e15 = z1.e(eVar, null, 2, null);
        this.Q = e15;
    }

    public final j6.i A() {
        return (j6.i) this.P.getValue();
    }

    public final z5.f B(c cVar, c cVar2) {
        j6.j d10;
        if (!(cVar2 instanceof c.d)) {
            if (cVar2 instanceof c.C1076b) {
                d10 = ((c.C1076b) cVar2).d();
            }
            return null;
        }
        d10 = ((c.d) cVar2).b();
        n6.c a10 = d10.b().P().a(z5.c.a(), d10);
        if (a10 instanceof n6.a) {
            n6.a aVar = (n6.a) a10;
            return new z5.f(cVar instanceof c.C1077c ? cVar.a() : null, cVar2.a(), this.L, aVar.b(), ((d10 instanceof j6.p) && ((j6.p) d10).d()) ? false : true, aVar.c());
        }
        return null;
    }

    public final void C(float f10) {
        this.F.setValue(Float.valueOf(f10));
    }

    public final void D(d0 d0Var) {
        this.G.setValue(d0Var);
    }

    public final void E(q1.f fVar) {
        this.L = fVar;
    }

    public final void F(int i10) {
        this.M = i10;
    }

    public final void G(x5.e eVar) {
        this.Q.setValue(eVar);
    }

    public final void H(l<? super c, v> lVar) {
        this.K = lVar;
    }

    public final void I(f1.d dVar) {
        this.E.setValue(dVar);
    }

    public final void J(boolean z10) {
        this.N = z10;
    }

    public final void K(j6.i iVar) {
        this.P.setValue(iVar);
    }

    public final void L(c cVar) {
        this.O.setValue(cVar);
    }

    public final void M(l<? super c, ? extends c> lVar) {
        this.J = lVar;
    }

    public final void N(f1.d dVar) {
        this.I = dVar;
        I(dVar);
    }

    public final void O(c cVar) {
        this.H = cVar;
        L(cVar);
    }

    public final f1.d P(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return f1.b.b(c1.f.c(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, x(), 6, null);
        }
        return drawable instanceof ColorDrawable ? new f1.c(e0.b(((ColorDrawable) drawable).getColor()), null) : new tf.a(drawable.mutate());
    }

    public final c Q(j6.j jVar) {
        if (jVar instanceof j6.p) {
            j6.p pVar = (j6.p) jVar;
            return new c.d(P(pVar.a()), pVar);
        } else if (jVar instanceof j6.e) {
            Drawable a10 = jVar.a();
            return new c.C1076b(a10 == null ? null : P(a10), (j6.e) jVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final j6.i R(j6.i iVar) {
        i.a m10 = j6.i.R(iVar, null, 1, null).m(new e());
        if (iVar.q().m() == null) {
            m10.k(new f());
        }
        if (iVar.q().l() == null) {
            m10.j(j.g(w()));
        }
        if (iVar.q().k() != k6.d.EXACT) {
            m10.d(k6.d.INEXACT);
        }
        return m10.a();
    }

    public final void S(c cVar) {
        c cVar2 = this.H;
        c invoke = this.J.invoke(cVar);
        O(invoke);
        f1.d B = B(cVar2, invoke);
        if (B == null) {
            B = invoke.a();
        }
        N(B);
        if (this.C != null && cVar2.a() != invoke.a()) {
            f1.d a10 = cVar2.a();
            k1 k1Var = a10 instanceof k1 ? (k1) a10 : null;
            if (k1Var != null) {
                k1Var.c();
            }
            f1.d a11 = invoke.a();
            k1 k1Var2 = a11 instanceof k1 ? (k1) a11 : null;
            if (k1Var2 != null) {
                k1Var2.a();
            }
        }
        l<? super c, v> lVar = this.K;
        if (lVar == null) {
            return;
        }
        lVar.invoke(invoke);
    }

    @Override // l0.k1
    public void a() {
        if (this.C != null) {
            return;
        }
        q0 a10 = r0.a(b3.b(null, 1, null).plus(g1.c().h0()));
        this.C = a10;
        f1.d dVar = this.I;
        k1 k1Var = dVar instanceof k1 ? (k1) dVar : null;
        if (k1Var != null) {
            k1Var.a();
        }
        if (!this.N) {
            uo.l.d(a10, null, null, new d(null), 3, null);
            return;
        }
        Drawable F = j6.i.R(A(), null, 1, null).c(y().a()).a().F();
        S(new c.C1077c(F != null ? P(F) : null));
    }

    @Override // l0.k1
    public void b() {
        t();
        f1.d dVar = this.I;
        k1 k1Var = dVar instanceof k1 ? (k1) dVar : null;
        if (k1Var == null) {
            return;
        }
        k1Var.b();
    }

    @Override // l0.k1
    public void c() {
        t();
        f1.d dVar = this.I;
        k1 k1Var = dVar instanceof k1 ? (k1) dVar : null;
        if (k1Var == null) {
            return;
        }
        k1Var.c();
    }

    @Override // f1.d
    public boolean d(float f10) {
        C(f10);
        return true;
    }

    @Override // f1.d
    public boolean e(d0 d0Var) {
        D(d0Var);
        return true;
    }

    @Override // f1.d
    public long k() {
        f1.d z10 = z();
        b1.l c10 = z10 == null ? null : b1.l.c(z10.k());
        return c10 == null ? b1.l.f16742b.a() : c10.m();
    }

    @Override // f1.d
    public void m(e1.e eVar) {
        this.D.setValue(b1.l.c(eVar.c()));
        f1.d z10 = z();
        if (z10 == null) {
            return;
        }
        z10.j(eVar, eVar.c(), u(), v());
    }

    public final void t() {
        q0 q0Var = this.C;
        if (q0Var != null) {
            r0.d(q0Var, null, 1, null);
        }
        this.C = null;
    }

    public final float u() {
        return ((Number) this.F.getValue()).floatValue();
    }

    public final d0 v() {
        return (d0) this.G.getValue();
    }

    public final q1.f w() {
        return this.L;
    }

    public final int x() {
        return this.M;
    }

    public final x5.e y() {
        return (x5.e) this.Q.getValue();
    }

    public final f1.d z() {
        return (f1.d) this.E.getValue();
    }
}
