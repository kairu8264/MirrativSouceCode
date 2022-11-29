package y;

import m2.o;
import q1.q0;

/* loaded from: classes.dex */
public final class h extends androidx.compose.ui.platform.d1 implements q1.x {

    /* renamed from: x  reason: collision with root package name */
    public final float f60800x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f60801y;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f60802w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1.q0 q0Var) {
            super(1);
            this.f60802w = q0Var;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0.a.n(aVar, this.f60802w, 0, 0, 0.0f, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(float f10, boolean z10, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
        jo.p.h(lVar, "inspectorInfo");
        this.f60800x = f10;
        this.f60801y = z10;
        if (f10 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f10 + " must be > 0").toString());
    }

    public static /* synthetic */ long f(h hVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return hVar.c(j10, z10);
    }

    public static /* synthetic */ long i(h hVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return hVar.g(j10, z10);
    }

    public static /* synthetic */ long l(h hVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return hVar.j(j10, z10);
    }

    public static /* synthetic */ long n(h hVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return hVar.m(j10, z10);
    }

    public final long b(long j10) {
        if (!this.f60801y) {
            long i10 = i(this, j10, false, 1, null);
            o.a aVar = m2.o.f40537b;
            if (!m2.o.e(i10, aVar.a())) {
                return i10;
            }
            long f10 = f(this, j10, false, 1, null);
            if (!m2.o.e(f10, aVar.a())) {
                return f10;
            }
            long n10 = n(this, j10, false, 1, null);
            if (!m2.o.e(n10, aVar.a())) {
                return n10;
            }
            long l10 = l(this, j10, false, 1, null);
            if (!m2.o.e(l10, aVar.a())) {
                return l10;
            }
            long g10 = g(j10, false);
            if (!m2.o.e(g10, aVar.a())) {
                return g10;
            }
            long c10 = c(j10, false);
            if (!m2.o.e(c10, aVar.a())) {
                return c10;
            }
            long m10 = m(j10, false);
            if (!m2.o.e(m10, aVar.a())) {
                return m10;
            }
            long j11 = j(j10, false);
            if (!m2.o.e(j11, aVar.a())) {
                return j11;
            }
        } else {
            long f11 = f(this, j10, false, 1, null);
            o.a aVar2 = m2.o.f40537b;
            if (!m2.o.e(f11, aVar2.a())) {
                return f11;
            }
            long i11 = i(this, j10, false, 1, null);
            if (!m2.o.e(i11, aVar2.a())) {
                return i11;
            }
            long l11 = l(this, j10, false, 1, null);
            if (!m2.o.e(l11, aVar2.a())) {
                return l11;
            }
            long n11 = n(this, j10, false, 1, null);
            if (!m2.o.e(n11, aVar2.a())) {
                return n11;
            }
            long c11 = c(j10, false);
            if (!m2.o.e(c11, aVar2.a())) {
                return c11;
            }
            long g11 = g(j10, false);
            if (!m2.o.e(g11, aVar2.a())) {
                return g11;
            }
            long j12 = j(j10, false);
            if (!m2.o.e(j12, aVar2.a())) {
                return j12;
            }
            long m11 = m(j10, false);
            if (!m2.o.e(m11, aVar2.a())) {
                return m11;
            }
        }
        return m2.o.f40537b.a();
    }

    public final long c(long j10, boolean z10) {
        int c10;
        int m10 = m2.b.m(j10);
        if (m10 != Integer.MAX_VALUE && (c10 = lo.c.c(m10 * this.f60800x)) > 0) {
            long a10 = m2.p.a(c10, m10);
            if (!z10 || m2.c.h(j10, a10)) {
                return a10;
            }
        }
        return m2.o.f40537b.a();
    }

    @Override // q1.x
    public int d(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        if (i10 != Integer.MAX_VALUE) {
            return lo.c.c(i10 * this.f60800x);
        }
        return lVar.G(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        h hVar = obj instanceof h ? (h) obj : null;
        if (hVar == null) {
            return false;
        }
        return ((this.f60800x > hVar.f60800x ? 1 : (this.f60800x == hVar.f60800x ? 0 : -1)) == 0) && this.f60801y == ((h) obj).f60801y;
    }

    public final long g(long j10, boolean z10) {
        int c10;
        int n10 = m2.b.n(j10);
        if (n10 != Integer.MAX_VALUE && (c10 = lo.c.c(n10 / this.f60800x)) > 0) {
            long a10 = m2.p.a(n10, c10);
            if (!z10 || m2.c.h(j10, a10)) {
                return a10;
            }
        }
        return m2.o.f40537b.a();
    }

    @Override // q1.x
    public int h(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        if (i10 != Integer.MAX_VALUE) {
            return lo.c.c(i10 / this.f60800x);
        }
        return lVar.u(i10);
    }

    public int hashCode() {
        return (Float.hashCode(this.f60800x) * 31) + Boolean.hashCode(this.f60801y);
    }

    public final long j(long j10, boolean z10) {
        int o10 = m2.b.o(j10);
        int c10 = lo.c.c(o10 * this.f60800x);
        if (c10 > 0) {
            long a10 = m2.p.a(c10, o10);
            if (!z10 || m2.c.h(j10, a10)) {
                return a10;
            }
        }
        return m2.o.f40537b.a();
    }

    public final long m(long j10, boolean z10) {
        int p10 = m2.b.p(j10);
        int c10 = lo.c.c(p10 / this.f60800x);
        if (c10 > 0) {
            long a10 = m2.p.a(p10, c10);
            if (!z10 || m2.c.h(j10, a10)) {
                return a10;
            }
        }
        return m2.o.f40537b.a();
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        long b10 = b(j10);
        if (!m2.o.e(b10, m2.o.f40537b.a())) {
            j10 = m2.b.f40509b.c(m2.o.g(b10), m2.o.f(b10));
        }
        q1.q0 M = b0Var.M(j10);
        return q1.e0.O0(e0Var, M.r0(), M.f0(), null, new a(M), 4, null);
    }

    public String toString() {
        return "AspectRatioModifier(aspectRatio=" + this.f60800x + ')';
    }

    @Override // q1.x
    public int u(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        if (i10 != Integer.MAX_VALUE) {
            return lo.c.c(i10 / this.f60800x);
        }
        return lVar.e(i10);
    }

    @Override // q1.x
    public int w(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        if (i10 != Integer.MAX_VALUE) {
            return lo.c.c(i10 * this.f60800x);
        }
        return lVar.E(i10);
    }
}
