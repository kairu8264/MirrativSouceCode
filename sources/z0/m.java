package z0;

import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.d1;
import c1.d0;
import q1.b0;
import q1.e0;
import q1.q0;
import q1.w0;
import q1.x;
import wn.v;

/* loaded from: classes.dex */
public final class m extends d1 implements x, h {
    public final q1.f A;
    public final float B;
    public final d0 C;

    /* renamed from: x  reason: collision with root package name */
    public final f1.d f62412x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f62413y;

    /* renamed from: z  reason: collision with root package name */
    public final x0.a f62414z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q0 f62415w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0 q0Var) {
            super(1);
            this.f62415w = q0Var;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0.a.n(aVar, this.f62415w, 0, 0, 0.0f, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(q0.a aVar) {
            a(aVar);
            return v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f1.d dVar, boolean z10, x0.a aVar, q1.f fVar, float f10, d0 d0Var, io.l<? super c1, v> lVar) {
        super(lVar);
        jo.p.h(dVar, "painter");
        jo.p.h(aVar, "alignment");
        jo.p.h(fVar, "contentScale");
        jo.p.h(lVar, "inspectorInfo");
        this.f62412x = dVar;
        this.f62413y = z10;
        this.f62414z = aVar;
        this.A = fVar;
        this.B = f10;
        this.C = d0Var;
    }

    public final long b(long j10) {
        float i10;
        float g10;
        if (c()) {
            if (!g(this.f62412x.k())) {
                i10 = b1.l.i(j10);
            } else {
                i10 = b1.l.i(this.f62412x.k());
            }
            if (!f(this.f62412x.k())) {
                g10 = b1.l.g(j10);
            } else {
                g10 = b1.l.g(this.f62412x.k());
            }
            long a10 = b1.m.a(i10, g10);
            if (!(b1.l.i(j10) == 0.0f)) {
                if (!(b1.l.g(j10) == 0.0f)) {
                    return w0.b(a10, this.A.a(a10, j10));
                }
            }
            return b1.l.f16742b.b();
        }
        return j10;
    }

    public final boolean c() {
        if (this.f62413y) {
            if (this.f62412x.k() != b1.l.f16742b.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // q1.x
    public int d(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        if (c()) {
            long i11 = i(m2.c.b(0, 0, 0, i10, 7, null));
            return Math.max(m2.b.p(i11), lVar.G(i10));
        }
        return lVar.G(i10);
    }

    public boolean equals(Object obj) {
        m mVar = obj instanceof m ? (m) obj : null;
        if (mVar != null && jo.p.c(this.f62412x, mVar.f62412x) && this.f62413y == mVar.f62413y && jo.p.c(this.f62414z, mVar.f62414z) && jo.p.c(this.A, mVar.A)) {
            return ((this.B > mVar.B ? 1 : (this.B == mVar.B ? 0 : -1)) == 0) && jo.p.c(this.C, mVar.C);
        }
        return false;
    }

    public final boolean f(long j10) {
        if (!b1.l.f(j10, b1.l.f16742b.a())) {
            float g10 = b1.l.g(j10);
            if ((Float.isInfinite(g10) || Float.isNaN(g10)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(long j10) {
        if (!b1.l.f(j10, b1.l.f16742b.a())) {
            float i10 = b1.l.i(j10);
            if ((Float.isInfinite(i10) || Float.isNaN(i10)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    @Override // q1.x
    public int h(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        if (c()) {
            long i11 = i(m2.c.b(0, i10, 0, 0, 13, null));
            return Math.max(m2.b.o(i11), lVar.u(i10));
        }
        return lVar.u(i10);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f62412x.hashCode() * 31) + Boolean.hashCode(this.f62413y)) * 31) + this.f62414z.hashCode()) * 31) + this.A.hashCode()) * 31) + Float.hashCode(this.B)) * 31;
        d0 d0Var = this.C;
        return hashCode + (d0Var != null ? d0Var.hashCode() : 0);
    }

    public final long i(long j10) {
        int p10;
        int o10;
        boolean z10 = true;
        boolean z11 = m2.b.j(j10) && m2.b.i(j10);
        if (!m2.b.l(j10) || !m2.b.k(j10)) {
            z10 = false;
        }
        if ((!c() && z11) || z10) {
            return m2.b.e(j10, m2.b.n(j10), 0, m2.b.m(j10), 0, 10, null);
        }
        long k10 = this.f62412x.k();
        if (g(k10)) {
            p10 = lo.c.c(b1.l.i(k10));
        } else {
            p10 = m2.b.p(j10);
        }
        if (f(k10)) {
            o10 = lo.c.c(b1.l.g(k10));
        } else {
            o10 = m2.b.o(j10);
        }
        long b10 = b(b1.m.a(m2.c.g(j10, p10), m2.c.f(j10, o10)));
        return m2.b.e(j10, m2.c.g(j10, lo.c.c(b1.l.i(b10))), 0, m2.c.f(j10, lo.c.c(b1.l.g(b10))), 0, 10, null);
    }

    @Override // q1.x
    public q1.d0 q(e0 e0Var, b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        q0 M = b0Var.M(i(j10));
        return e0.O0(e0Var, M.r0(), M.f0(), null, new a(M), 4, null);
    }

    public String toString() {
        return "PainterModifier(painter=" + this.f62412x + ", sizeToIntrinsics=" + this.f62413y + ", alignment=" + this.f62414z + ", alpha=" + this.B + ", colorFilter=" + this.C + ')';
    }

    @Override // q1.x
    public int u(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        if (c()) {
            long i11 = i(m2.c.b(0, i10, 0, 0, 13, null));
            return Math.max(m2.b.o(i11), lVar.e(i10));
        }
        return lVar.e(i10);
    }

    @Override // q1.x
    public int w(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        if (c()) {
            long i11 = i(m2.c.b(0, 0, 0, i10, 7, null));
            return Math.max(m2.b.p(i11), lVar.E(i10));
        }
        return lVar.E(i10);
    }

    @Override // z0.h
    public void x0(e1.c cVar) {
        float i10;
        float g10;
        long b10;
        jo.p.h(cVar, "<this>");
        long k10 = this.f62412x.k();
        if (g(k10)) {
            i10 = b1.l.i(k10);
        } else {
            i10 = b1.l.i(cVar.c());
        }
        if (f(k10)) {
            g10 = b1.l.g(k10);
        } else {
            g10 = b1.l.g(cVar.c());
        }
        long a10 = b1.m.a(i10, g10);
        if (!(b1.l.i(cVar.c()) == 0.0f)) {
            if (!(b1.l.g(cVar.c()) == 0.0f)) {
                b10 = w0.b(a10, this.A.a(a10, cVar.c()));
                long j10 = b10;
                long a11 = this.f62414z.a(m2.p.a(lo.c.c(b1.l.i(j10)), lo.c.c(b1.l.g(j10))), m2.p.a(lo.c.c(b1.l.i(cVar.c())), lo.c.c(b1.l.g(cVar.c()))), cVar.getLayoutDirection());
                float j11 = m2.k.j(a11);
                float k11 = m2.k.k(a11);
                cVar.M0().d().b(j11, k11);
                this.f62412x.j(cVar, j10, this.B, this.C);
                cVar.M0().d().b(-j11, -k11);
                cVar.c1();
            }
        }
        b10 = b1.l.f16742b.b();
        long j102 = b10;
        long a112 = this.f62414z.a(m2.p.a(lo.c.c(b1.l.i(j102)), lo.c.c(b1.l.g(j102))), m2.p.a(lo.c.c(b1.l.i(cVar.c())), lo.c.c(b1.l.g(cVar.c()))), cVar.getLayoutDirection());
        float j112 = m2.k.j(a112);
        float k112 = m2.k.k(a112);
        cVar.M0().d().b(j112, k112);
        this.f62412x.j(cVar, j102, this.B, this.C);
        cVar.M0().d().b(-j112, -k112);
        cVar.c1();
    }
}
