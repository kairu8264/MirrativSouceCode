package e1;

import b1.l;
import c1.c0;
import c1.d0;
import c1.f0;
import c1.j1;
import c1.k0;
import c1.k1;
import c1.r;
import c1.s0;
import c1.t0;
import c1.u;
import c1.u0;
import c1.v0;
import c1.w;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;
import kotlin.NoWhenBranchMatchedException;
import m2.q;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: w  reason: collision with root package name */
    public final C0296a f30030w = new C0296a(null, null, null, 0, 15, null);

    /* renamed from: x  reason: collision with root package name */
    public final d f30031x = new b();

    /* renamed from: y  reason: collision with root package name */
    public s0 f30032y;

    /* renamed from: z  reason: collision with root package name */
    public s0 f30033z;

    /* loaded from: classes.dex */
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public final g f30038a;

        public b() {
            g c10;
            c10 = e1.b.c(this);
            this.f30038a = c10;
        }

        @Override // e1.d
        public long c() {
            return a.this.z().h();
        }

        @Override // e1.d
        public g d() {
            return this.f30038a;
        }

        @Override // e1.d
        public w e() {
            return a.this.z().e();
        }

        @Override // e1.d
        public void f(long j10) {
            a.this.z().l(j10);
        }
    }

    public static /* synthetic */ s0 e(a aVar, long j10, f fVar, float f10, d0 d0Var, int i10, int i11, int i12, Object obj) {
        return aVar.d(j10, fVar, f10, d0Var, i10, (i12 & 32) != 0 ? e.f30042e.b() : i11);
    }

    public static /* synthetic */ s0 k(a aVar, u uVar, f fVar, float f10, d0 d0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = e.f30042e.b();
        }
        return aVar.h(uVar, fVar, f10, d0Var, i10, i11);
    }

    public static /* synthetic */ s0 q(a aVar, long j10, float f10, float f11, int i10, int i11, v0 v0Var, float f12, d0 d0Var, int i12, int i13, int i14, Object obj) {
        return aVar.o(j10, f10, f11, i10, i11, v0Var, f12, d0Var, i12, (i14 & 512) != 0 ? e.f30042e.b() : i13);
    }

    public static /* synthetic */ s0 w(a aVar, u uVar, float f10, float f11, int i10, int i11, v0 v0Var, float f12, d0 d0Var, int i12, int i13, int i14, Object obj) {
        return aVar.u(uVar, f10, f11, i10, i11, v0Var, f12, d0Var, i12, (i14 & 512) != 0 ? e.f30042e.b() : i13);
    }

    @Override // e1.e
    public void B0(u0 u0Var, u uVar, float f10, f fVar, d0 d0Var, int i10) {
        p.h(u0Var, "path");
        p.h(uVar, "brush");
        p.h(fVar, TtmlNode.TAG_STYLE);
        this.f30030w.e().w(u0Var, k(this, uVar, fVar, f10, d0Var, i10, 0, 32, null));
    }

    public final long C(long j10, float f10) {
        return !((f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1)) == 0) ? c0.k(j10, c0.n(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null) : j10;
    }

    @Override // e1.e
    public void C0(long j10, long j11, long j12, long j13, f fVar, float f10, d0 d0Var, int i10) {
        p.h(fVar, TtmlNode.TAG_STYLE);
        this.f30030w.e().u(b1.f.m(j11), b1.f.n(j11), b1.f.m(j11) + l.i(j12), b1.f.n(j11) + l.g(j12), b1.a.d(j13), b1.a.e(j13), e(this, j10, fVar, f10, d0Var, i10, 0, 32, null));
    }

    public final s0 E() {
        s0 s0Var = this.f30032y;
        if (s0Var == null) {
            s0 a10 = c1.i.a();
            a10.v(t0.f18770a.a());
            this.f30032y = a10;
            return a10;
        }
        return s0Var;
    }

    public final s0 F() {
        s0 s0Var = this.f30033z;
        if (s0Var == null) {
            s0 a10 = c1.i.a();
            a10.v(t0.f18770a.b());
            this.f30033z = a10;
            return a10;
        }
        return s0Var;
    }

    @Override // e1.e
    public void F0(u uVar, long j10, long j11, long j12, float f10, f fVar, d0 d0Var, int i10) {
        p.h(uVar, "brush");
        p.h(fVar, TtmlNode.TAG_STYLE);
        this.f30030w.e().u(b1.f.m(j10), b1.f.n(j10), b1.f.m(j10) + l.i(j11), b1.f.n(j10) + l.g(j11), b1.a.d(j12), b1.a.e(j12), k(this, uVar, fVar, f10, d0Var, i10, 0, 32, null));
    }

    public final s0 G(f fVar) {
        if (p.c(fVar, i.f30046a)) {
            return E();
        }
        if (fVar instanceof j) {
            s0 F = F();
            j jVar = (j) fVar;
            if (!(F.x() == jVar.f())) {
                F.w(jVar.f());
            }
            if (!j1.g(F.h(), jVar.b())) {
                F.c(jVar.b());
            }
            if (!(F.p() == jVar.d())) {
                F.t(jVar.d());
            }
            if (!k1.g(F.o(), jVar.c())) {
                F.i(jVar.c());
            }
            if (!p.c(F.m(), jVar.e())) {
                F.f(jVar.e());
            }
            return F;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // m2.d
    public float G0() {
        return this.f30030w.f().G0();
    }

    @Override // e1.e
    public void H0(u uVar, long j10, long j11, float f10, int i10, v0 v0Var, float f11, d0 d0Var, int i11) {
        p.h(uVar, "brush");
        this.f30030w.e().v(j10, j11, w(this, uVar, f10, 4.0f, i10, k1.f18705b.b(), v0Var, f11, d0Var, i11, 0, 512, null));
    }

    @Override // e1.e
    public void I(u uVar, long j10, long j11, float f10, f fVar, d0 d0Var, int i10) {
        p.h(uVar, "brush");
        p.h(fVar, TtmlNode.TAG_STYLE);
        this.f30030w.e().i(b1.f.m(j10), b1.f.n(j10), b1.f.m(j10) + l.i(j11), b1.f.n(j10) + l.g(j11), k(this, uVar, fVar, f10, d0Var, i10, 0, 32, null));
    }

    @Override // e1.e
    public d M0() {
        return this.f30031x;
    }

    @Override // e1.e
    public void O(long j10, long j11, long j12, float f10, f fVar, d0 d0Var, int i10) {
        p.h(fVar, TtmlNode.TAG_STYLE);
        this.f30030w.e().i(b1.f.m(j11), b1.f.n(j11), b1.f.m(j11) + l.i(j12), b1.f.n(j11) + l.g(j12), e(this, j10, fVar, f10, d0Var, i10, 0, 32, null));
    }

    @Override // e1.e
    public void V0(k0 k0Var, long j10, float f10, f fVar, d0 d0Var, int i10) {
        p.h(k0Var, "image");
        p.h(fVar, TtmlNode.TAG_STYLE);
        this.f30030w.e().r(k0Var, j10, k(this, null, fVar, f10, d0Var, i10, 0, 32, null));
    }

    @Override // e1.e
    public void b1(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, f fVar, d0 d0Var, int i10) {
        p.h(fVar, TtmlNode.TAG_STYLE);
        this.f30030w.e().f(b1.f.m(j11), b1.f.n(j11), b1.f.m(j11) + l.i(j12), b1.f.n(j11) + l.g(j12), f10, f11, z10, e(this, j10, fVar, f12, d0Var, i10, 0, 32, null));
    }

    public final s0 d(long j10, f fVar, float f10, d0 d0Var, int i10, int i11) {
        s0 G = G(fVar);
        long C = C(j10, f10);
        if (!c0.m(G.a(), C)) {
            G.l(C);
        }
        if (G.s() != null) {
            G.r(null);
        }
        if (!p.c(G.e(), d0Var)) {
            G.j(d0Var);
        }
        if (!r.G(G.n(), i10)) {
            G.d(i10);
        }
        if (!f0.d(G.u(), i11)) {
            G.g(i11);
        }
        return G;
    }

    @Override // e1.e
    public void d0(long j10, float f10, long j11, float f11, f fVar, d0 d0Var, int i10) {
        p.h(fVar, TtmlNode.TAG_STYLE);
        this.f30030w.e().t(j11, f10, e(this, j10, fVar, f11, d0Var, i10, 0, 32, null));
    }

    @Override // m2.d
    public float getDensity() {
        return this.f30030w.f().getDensity();
    }

    @Override // e1.e
    public q getLayoutDirection() {
        return this.f30030w.g();
    }

    public final s0 h(u uVar, f fVar, float f10, d0 d0Var, int i10, int i11) {
        s0 G = G(fVar);
        if (uVar != null) {
            uVar.a(c(), G, f10);
        } else {
            if (!(G.k() == f10)) {
                G.b(f10);
            }
        }
        if (!p.c(G.e(), d0Var)) {
            G.j(d0Var);
        }
        if (!r.G(G.n(), i10)) {
            G.d(i10);
        }
        if (!f0.d(G.u(), i11)) {
            G.g(i11);
        }
        return G;
    }

    public final s0 o(long j10, float f10, float f11, int i10, int i11, v0 v0Var, float f12, d0 d0Var, int i12, int i13) {
        s0 F = F();
        long C = C(j10, f12);
        if (!c0.m(F.a(), C)) {
            F.l(C);
        }
        if (F.s() != null) {
            F.r(null);
        }
        if (!p.c(F.e(), d0Var)) {
            F.j(d0Var);
        }
        if (!r.G(F.n(), i12)) {
            F.d(i12);
        }
        if (!(F.x() == f10)) {
            F.w(f10);
        }
        if (!(F.p() == f11)) {
            F.t(f11);
        }
        if (!j1.g(F.h(), i10)) {
            F.c(i10);
        }
        if (!k1.g(F.o(), i11)) {
            F.i(i11);
        }
        if (!p.c(F.m(), v0Var)) {
            F.f(v0Var);
        }
        if (!f0.d(F.u(), i13)) {
            F.g(i13);
        }
        return F;
    }

    @Override // e1.e
    public void q0(u0 u0Var, long j10, float f10, f fVar, d0 d0Var, int i10) {
        p.h(u0Var, "path");
        p.h(fVar, TtmlNode.TAG_STYLE);
        this.f30030w.e().w(u0Var, e(this, j10, fVar, f10, d0Var, i10, 0, 32, null));
    }

    public final s0 u(u uVar, float f10, float f11, int i10, int i11, v0 v0Var, float f12, d0 d0Var, int i12, int i13) {
        s0 F = F();
        if (uVar != null) {
            uVar.a(c(), F, f12);
        } else {
            if (!(F.k() == f12)) {
                F.b(f12);
            }
        }
        if (!p.c(F.e(), d0Var)) {
            F.j(d0Var);
        }
        if (!r.G(F.n(), i12)) {
            F.d(i12);
        }
        if (!(F.x() == f10)) {
            F.w(f10);
        }
        if (!(F.p() == f11)) {
            F.t(f11);
        }
        if (!j1.g(F.h(), i10)) {
            F.c(i10);
        }
        if (!k1.g(F.o(), i11)) {
            F.i(i11);
        }
        if (!p.c(F.m(), v0Var)) {
            F.f(v0Var);
        }
        if (!f0.d(F.u(), i13)) {
            F.g(i13);
        }
        return F;
    }

    @Override // e1.e
    public void w0(long j10, long j11, long j12, float f10, int i10, v0 v0Var, float f11, d0 d0Var, int i11) {
        this.f30030w.e().v(j11, j12, q(this, j10, f10, 4.0f, i10, k1.f18705b.b(), v0Var, f11, d0Var, i11, 0, 512, null));
    }

    @Override // e1.e
    public void y(k0 k0Var, long j10, long j11, long j12, long j13, float f10, f fVar, d0 d0Var, int i10, int i11) {
        p.h(k0Var, "image");
        p.h(fVar, TtmlNode.TAG_STYLE);
        this.f30030w.e().n(k0Var, j10, j11, j12, j13, h(null, fVar, f10, d0Var, i10, i11));
    }

    public final C0296a z() {
        return this.f30030w;
    }

    /* renamed from: e1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0296a {

        /* renamed from: a  reason: collision with root package name */
        public m2.d f30034a;

        /* renamed from: b  reason: collision with root package name */
        public q f30035b;

        /* renamed from: c  reason: collision with root package name */
        public w f30036c;

        /* renamed from: d  reason: collision with root package name */
        public long f30037d;

        public C0296a(m2.d dVar, q qVar, w wVar, long j10) {
            this.f30034a = dVar;
            this.f30035b = qVar;
            this.f30036c = wVar;
            this.f30037d = j10;
        }

        public /* synthetic */ C0296a(m2.d dVar, q qVar, w wVar, long j10, jo.h hVar) {
            this(dVar, qVar, wVar, j10);
        }

        public final m2.d a() {
            return this.f30034a;
        }

        public final q b() {
            return this.f30035b;
        }

        public final w c() {
            return this.f30036c;
        }

        public final long d() {
            return this.f30037d;
        }

        public final w e() {
            return this.f30036c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0296a) {
                C0296a c0296a = (C0296a) obj;
                return p.c(this.f30034a, c0296a.f30034a) && this.f30035b == c0296a.f30035b && p.c(this.f30036c, c0296a.f30036c) && l.f(this.f30037d, c0296a.f30037d);
            }
            return false;
        }

        public final m2.d f() {
            return this.f30034a;
        }

        public final q g() {
            return this.f30035b;
        }

        public final long h() {
            return this.f30037d;
        }

        public int hashCode() {
            return (((((this.f30034a.hashCode() * 31) + this.f30035b.hashCode()) * 31) + this.f30036c.hashCode()) * 31) + l.j(this.f30037d);
        }

        public final void i(w wVar) {
            p.h(wVar, "<set-?>");
            this.f30036c = wVar;
        }

        public final void j(m2.d dVar) {
            p.h(dVar, "<set-?>");
            this.f30034a = dVar;
        }

        public final void k(q qVar) {
            p.h(qVar, "<set-?>");
            this.f30035b = qVar;
        }

        public final void l(long j10) {
            this.f30037d = j10;
        }

        public String toString() {
            return "DrawParams(density=" + this.f30034a + ", layoutDirection=" + this.f30035b + ", canvas=" + this.f30036c + ", size=" + ((Object) l.l(this.f30037d)) + ')';
        }

        public /* synthetic */ C0296a(m2.d dVar, q qVar, w wVar, long j10, int i10, jo.h hVar) {
            this((i10 & 1) != 0 ? e1.b.f30040a : dVar, (i10 & 2) != 0 ? q.Ltr : qVar, (i10 & 4) != 0 ? new h() : wVar, (i10 & 8) != 0 ? l.f16742b.b() : j10, null);
        }
    }
}
