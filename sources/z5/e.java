package z5;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.d1;
import b1.m;
import c1.d0;
import io.l;
import jo.p;
import jo.q;
import m2.k;
import q1.b0;
import q1.e0;
import q1.q0;
import q1.w0;
import q1.x;
import wn.v;
import x0.f;

/* loaded from: classes.dex */
public final class e extends d1 implements x, z0.h {
    public final float A;
    public final d0 B;

    /* renamed from: x  reason: collision with root package name */
    public final f1.d f62559x;

    /* renamed from: y  reason: collision with root package name */
    public final x0.a f62560y;

    /* renamed from: z  reason: collision with root package name */
    public final q1.f f62561z;

    /* loaded from: classes.dex */
    public static final class a extends q implements l<q0.a, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q0 f62562w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0 q0Var) {
            super(1);
            this.f62562w = q0Var;
        }

        public final void a(q0.a aVar) {
            q0.a.n(aVar, this.f62562w, 0, 0, 0.0f, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(q0.a aVar) {
            a(aVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<c1, v> {
        public final /* synthetic */ d0 A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f1.d f62563w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.a f62564x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q1.f f62565y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ float f62566z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f1.d dVar, x0.a aVar, q1.f fVar, float f10, d0 d0Var) {
            super(1);
            this.f62563w = dVar;
            this.f62564x = aVar;
            this.f62565y = fVar;
            this.f62566z = f10;
            this.A = d0Var;
        }

        public final void a(c1 c1Var) {
            p.h(c1Var, "$this$null");
            c1Var.b("content");
            c1Var.a().b("painter", this.f62563w);
            c1Var.a().b("alignment", this.f62564x);
            c1Var.a().b("contentScale", this.f62565y);
            c1Var.a().b("alpha", Float.valueOf(this.f62566z));
            c1Var.a().b("colorFilter", this.A);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c1 c1Var) {
            a(c1Var);
            return v.f59242a;
        }
    }

    public e(f1.d dVar, x0.a aVar, q1.f fVar, float f10, d0 d0Var) {
        super(a1.c() ? new b(dVar, aVar, fVar, f10, d0Var) : a1.a());
        this.f62559x = dVar;
        this.f62560y = aVar;
        this.f62561z = fVar;
        this.A = f10;
        this.B = d0Var;
    }

    @Override // x0.f
    public x0.f L(x0.f fVar) {
        return x.a.h(this, fVar);
    }

    public final long b(long j10) {
        if (b1.l.k(j10)) {
            return b1.l.f16742b.b();
        }
        long k10 = this.f62559x.k();
        boolean z10 = true;
        if (k10 == b1.l.f16742b.a()) {
            return j10;
        }
        float i10 = b1.l.i(k10);
        if (!((Float.isInfinite(i10) || Float.isNaN(i10)) ? false : true)) {
            i10 = b1.l.i(j10);
        }
        float g10 = b1.l.g(k10);
        if (Float.isInfinite(g10) || Float.isNaN(g10)) {
            z10 = false;
        }
        if (!z10) {
            g10 = b1.l.g(j10);
        }
        long a10 = m.a(i10, g10);
        return w0.b(a10, this.f62561z.a(a10, j10));
    }

    public final long c(long j10) {
        float b10;
        int o10;
        float a10;
        boolean l10 = m2.b.l(j10);
        boolean k10 = m2.b.k(j10);
        if (l10 && k10) {
            return j10;
        }
        boolean z10 = true;
        boolean z11 = m2.b.j(j10) && m2.b.i(j10);
        long k11 = this.f62559x.k();
        if (k11 == b1.l.f16742b.a()) {
            return z11 ? m2.b.e(j10, m2.b.n(j10), 0, m2.b.m(j10), 0, 10, null) : j10;
        }
        if (z11 && (l10 || k10)) {
            b10 = m2.b.n(j10);
            o10 = m2.b.m(j10);
        } else {
            float i10 = b1.l.i(k11);
            float g10 = b1.l.g(k11);
            b10 = !Float.isInfinite(i10) && !Float.isNaN(i10) ? j.b(j10, i10) : m2.b.p(j10);
            if (Float.isInfinite(g10) || Float.isNaN(g10)) {
                z10 = false;
            }
            if (!z10) {
                o10 = m2.b.o(j10);
            } else {
                a10 = j.a(j10, g10);
                long b11 = b(m.a(b10, a10));
                return m2.b.e(j10, m2.c.g(j10, lo.c.c(b1.l.i(b11))), 0, m2.c.f(j10, lo.c.c(b1.l.g(b11))), 0, 10, null);
            }
        }
        a10 = o10;
        long b112 = b(m.a(b10, a10));
        return m2.b.e(j10, m2.c.g(j10, lo.c.c(b1.l.i(b112))), 0, m2.c.f(j10, lo.c.c(b1.l.g(b112))), 0, 10, null);
    }

    @Override // q1.x
    public int d(q1.m mVar, q1.l lVar, int i10) {
        if (this.f62559x.k() != b1.l.f16742b.a()) {
            int G = lVar.G(m2.b.m(c(m2.c.b(0, 0, 0, i10, 7, null))));
            return Math.max(lo.c.c(b1.l.i(b(m.a(G, i10)))), G);
        }
        return lVar.G(i10);
    }

    @Override // x0.f.b, x0.f
    public boolean e(l<? super f.b, Boolean> lVar) {
        return x.a.a(this, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return p.c(this.f62559x, eVar.f62559x) && p.c(this.f62560y, eVar.f62560y) && p.c(this.f62561z, eVar.f62561z) && p.c(Float.valueOf(this.A), Float.valueOf(eVar.A)) && p.c(this.B, eVar.B);
        }
        return false;
    }

    @Override // q1.x
    public int h(q1.m mVar, q1.l lVar, int i10) {
        if (this.f62559x.k() != b1.l.f16742b.a()) {
            int u10 = lVar.u(m2.b.n(c(m2.c.b(0, i10, 0, 0, 13, null))));
            return Math.max(lo.c.c(b1.l.g(b(m.a(i10, u10)))), u10);
        }
        return lVar.u(i10);
    }

    public int hashCode() {
        int hashCode = ((((((this.f62559x.hashCode() * 31) + this.f62560y.hashCode()) * 31) + this.f62561z.hashCode()) * 31) + Float.hashCode(this.A)) * 31;
        d0 d0Var = this.B;
        return hashCode + (d0Var == null ? 0 : d0Var.hashCode());
    }

    @Override // x0.f.b, x0.f
    public <R> R k(R r10, io.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) x.a.b(this, r10, pVar);
    }

    @Override // x0.f.b, x0.f
    public <R> R o(R r10, io.p<? super f.b, ? super R, ? extends R> pVar) {
        return (R) x.a.c(this, r10, pVar);
    }

    @Override // q1.x
    public q1.d0 q(e0 e0Var, b0 b0Var, long j10) {
        q1.d0 O0;
        q0 M = b0Var.M(c(j10));
        O0 = e0.O0(e0Var, M.r0(), M.f0(), null, new a(M), 4, null);
        return O0;
    }

    public String toString() {
        return "ContentPainterModifier(painter=" + this.f62559x + ", alignment=" + this.f62560y + ", contentScale=" + this.f62561z + ", alpha=" + this.A + ", colorFilter=" + this.B + ')';
    }

    @Override // q1.x
    public int u(q1.m mVar, q1.l lVar, int i10) {
        if (this.f62559x.k() != b1.l.f16742b.a()) {
            int e10 = lVar.e(m2.b.n(c(m2.c.b(0, i10, 0, 0, 13, null))));
            return Math.max(lo.c.c(b1.l.g(b(m.a(i10, e10)))), e10);
        }
        return lVar.e(i10);
    }

    @Override // q1.x
    public int w(q1.m mVar, q1.l lVar, int i10) {
        if (this.f62559x.k() != b1.l.f16742b.a()) {
            int E = lVar.E(m2.b.m(c(m2.c.b(0, 0, 0, i10, 7, null))));
            return Math.max(lo.c.c(b1.l.i(b(m.a(E, i10)))), E);
        }
        return lVar.E(i10);
    }

    @Override // z0.h
    public void x0(e1.c cVar) {
        long b10 = b(cVar.c());
        long a10 = this.f62560y.a(j.f(b10), j.f(cVar.c()), cVar.getLayoutDirection());
        float c10 = k.c(a10);
        float d10 = k.d(a10);
        cVar.M0().d().b(c10, d10);
        this.f62559x.j(cVar, b10, this.A, this.B);
        cVar.M0().d().b(-c10, -d10);
        cVar.c1();
    }
}
