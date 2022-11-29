package t;

import java.util.LinkedHashMap;
import java.util.Map;
import l0.c2;
import l0.s0;
import l0.u1;
import l0.z1;
import q1.p0;
import q1.q0;
import u.a1;
import u.e1;
import u.z0;
import x0.f;

/* loaded from: classes.dex */
public final class d<S> implements z0.b<S> {

    /* renamed from: a  reason: collision with root package name */
    public final z0<S> f52890a;

    /* renamed from: b  reason: collision with root package name */
    public x0.a f52891b;

    /* renamed from: c  reason: collision with root package name */
    public m2.q f52892c;

    /* renamed from: d  reason: collision with root package name */
    public final s0 f52893d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<S, c2<m2.o>> f52894e;

    /* renamed from: f  reason: collision with root package name */
    public c2<m2.o> f52895f;

    /* loaded from: classes.dex */
    public static final class a implements p0 {

        /* renamed from: w  reason: collision with root package name */
        public boolean f52896w;

        public a(boolean z10) {
            this.f52896w = z10;
        }

        @Override // x0.f
        public x0.f L(x0.f fVar) {
            return p0.a.d(this, fVar);
        }

        public final boolean a() {
            return this.f52896w;
        }

        public final void b(boolean z10) {
            this.f52896w = z10;
        }

        @Override // x0.f.b, x0.f
        public boolean e(io.l<? super f.b, Boolean> lVar) {
            return p0.a.a(this, lVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f52896w == ((a) obj).f52896w;
        }

        @Override // q1.p0
        public Object g0(m2.d dVar, Object obj) {
            jo.p.h(dVar, "<this>");
            return this;
        }

        public int hashCode() {
            boolean z10 = this.f52896w;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        @Override // x0.f.b, x0.f
        public <R> R k(R r10, io.p<? super R, ? super f.b, ? extends R> pVar) {
            return (R) p0.a.b(this, r10, pVar);
        }

        @Override // x0.f.b, x0.f
        public <R> R o(R r10, io.p<? super f.b, ? super R, ? extends R> pVar) {
            return (R) p0.a.c(this, r10, pVar);
        }

        public String toString() {
            return "ChildData(isTarget=" + this.f52896w + ')';
        }
    }

    /* loaded from: classes.dex */
    public final class b extends v {

        /* renamed from: w  reason: collision with root package name */
        public final z0<S>.a<m2.o, u.n> f52897w;

        /* renamed from: x  reason: collision with root package name */
        public final c2<x> f52898x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ d<S> f52899y;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<q0.a, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ q0 f52900w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ long f52901x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q0 q0Var, long j10) {
                super(1);
                this.f52900w = q0Var;
                this.f52901x = j10;
            }

            public final void a(q0.a aVar) {
                jo.p.h(aVar, "$this$layout");
                q0.a.l(aVar, this.f52900w, this.f52901x, 0.0f, 2, null);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                a(aVar);
                return wn.v.f59242a;
            }
        }

        /* renamed from: t.d$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0814b extends jo.q implements io.l<z0.b<S>, u.c0<m2.o>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d<S> f52902w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ d<S>.b f52903x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0814b(d<S> dVar, d<S>.b bVar) {
                super(1);
                this.f52902w = dVar;
                this.f52903x = bVar;
            }

            @Override // io.l
            /* renamed from: a */
            public final u.c0<m2.o> invoke(z0.b<S> bVar) {
                jo.p.h(bVar, "$this$animate");
                c2<m2.o> c2Var = this.f52902w.h().get(bVar.b());
                m2.o value = c2Var == null ? null : c2Var.getValue();
                long a10 = value == null ? m2.o.f40537b.a() : value.j();
                c2<m2.o> c2Var2 = this.f52902w.h().get(bVar.a());
                m2.o value2 = c2Var2 == null ? null : c2Var2.getValue();
                long a11 = value2 == null ? m2.o.f40537b.a() : value2.j();
                x value3 = this.f52903x.a().getValue();
                u.c0<m2.o> a12 = value3 == null ? null : value3.a(a10, a11);
                return a12 == null ? u.j.g(0.0f, 0.0f, null, 7, null) : a12;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends jo.q implements io.l<S, m2.o> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d<S> f52904w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d<S> dVar) {
                super(1);
                this.f52904w = dVar;
            }

            public final long a(S s10) {
                c2<m2.o> c2Var = this.f52904w.h().get(s10);
                m2.o value = c2Var == null ? null : c2Var.getValue();
                return value == null ? m2.o.f40537b.a() : value.j();
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ m2.o invoke(Object obj) {
                return m2.o.b(a(obj));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(d dVar, z0<S>.a<m2.o, u.n> aVar, c2<? extends x> c2Var) {
            jo.p.h(dVar, "this$0");
            jo.p.h(aVar, "sizeAnimation");
            jo.p.h(c2Var, "sizeTransform");
            this.f52899y = dVar;
            this.f52897w = aVar;
            this.f52898x = c2Var;
        }

        public final c2<x> a() {
            return this.f52898x;
        }

        @Override // q1.x
        public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
            q1.d0 O0;
            jo.p.h(e0Var, "$receiver");
            jo.p.h(b0Var, "measurable");
            q0 M = b0Var.M(j10);
            c2<m2.o> a10 = this.f52897w.a(new C0814b(this.f52899y, this), new c(this.f52899y));
            this.f52899y.i(a10);
            O0 = q1.e0.O0(e0Var, m2.o.g(a10.getValue().j()), m2.o.f(a10.getValue().j()), null, new a(M, this.f52899y.g().a(m2.p.a(M.r0(), M.f0()), a10.getValue().j(), m2.q.Ltr)), 4, null);
            return O0;
        }
    }

    public d(z0<S> z0Var, x0.a aVar, m2.q qVar) {
        s0 e10;
        jo.p.h(z0Var, "transition");
        jo.p.h(aVar, "contentAlignment");
        jo.p.h(qVar, "layoutDirection");
        this.f52890a = z0Var;
        this.f52891b = aVar;
        this.f52892c = qVar;
        e10 = z1.e(m2.o.b(m2.o.f40537b.a()), null, 2, null);
        this.f52893d = e10;
        this.f52894e = new LinkedHashMap();
    }

    public static final boolean e(s0<Boolean> s0Var) {
        return s0Var.getValue().booleanValue();
    }

    public static final void f(s0<Boolean> s0Var, boolean z10) {
        s0Var.setValue(Boolean.valueOf(z10));
    }

    @Override // u.z0.b
    public S a() {
        return this.f52890a.k().a();
    }

    @Override // u.z0.b
    public S b() {
        return this.f52890a.k().b();
    }

    @Override // u.z0.b
    public boolean c(S s10, S s11) {
        return z0.b.a.a(this, s10, s11);
    }

    public final x0.f d(k kVar, l0.i iVar, int i10) {
        x0.f fVar;
        jo.p.h(kVar, "contentTransform");
        iVar.x(-237337061);
        iVar.x(-3686930);
        boolean P = iVar.P(this);
        Object y10 = iVar.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = z1.e(Boolean.FALSE, null, 2, null);
            iVar.q(y10);
        }
        iVar.O();
        s0 s0Var = (s0) y10;
        boolean z10 = false;
        c2 l10 = u1.l(kVar.b(), iVar, 0);
        if (jo.p.c(this.f52890a.g(), this.f52890a.m())) {
            f(s0Var, false);
        } else if (l10.getValue() != null) {
            f(s0Var, true);
        }
        if (e(s0Var)) {
            z0.a b10 = a1.b(this.f52890a, e1.j(m2.o.f40537b), null, iVar, 64, 2);
            iVar.x(-3686930);
            boolean P2 = iVar.P(b10);
            Object y11 = iVar.y();
            if (P2 || y11 == l0.i.f39065a.a()) {
                x xVar = (x) l10.getValue();
                if (xVar != null && !xVar.b()) {
                    z10 = true;
                }
                x0.f fVar2 = x0.f.f59359u;
                if (!z10) {
                    fVar2 = z0.d.b(fVar2);
                }
                y11 = fVar2.L(new b(this, b10, l10));
                iVar.q(y11);
            }
            iVar.O();
            fVar = (x0.f) y11;
        } else {
            this.f52895f = null;
            fVar = x0.f.f59359u;
        }
        iVar.O();
        return fVar;
    }

    public final x0.a g() {
        return this.f52891b;
    }

    public final Map<S, c2<m2.o>> h() {
        return this.f52894e;
    }

    public final void i(c2<m2.o> c2Var) {
        this.f52895f = c2Var;
    }

    public final void j(x0.a aVar) {
        jo.p.h(aVar, "<set-?>");
        this.f52891b = aVar;
    }

    public final void k(m2.q qVar) {
        jo.p.h(qVar, "<set-?>");
        this.f52892c = qVar;
    }

    public final void l(long j10) {
        this.f52893d.setValue(m2.o.b(j10));
    }
}
