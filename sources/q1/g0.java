package q1;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f48578a = new g0();

    /* loaded from: classes.dex */
    public static final class a implements b0 {

        /* renamed from: w  reason: collision with root package name */
        public final l f48579w;

        /* renamed from: x  reason: collision with root package name */
        public final c f48580x;

        /* renamed from: y  reason: collision with root package name */
        public final d f48581y;

        public a(l lVar, c cVar, d dVar) {
            jo.p.h(lVar, "measurable");
            jo.p.h(cVar, "minMax");
            jo.p.h(dVar, "widthHeight");
            this.f48579w = lVar;
            this.f48580x = cVar;
            this.f48581y = dVar;
        }

        @Override // q1.l
        public int E(int i10) {
            return this.f48579w.E(i10);
        }

        @Override // q1.l
        public int G(int i10) {
            return this.f48579w.G(i10);
        }

        @Override // q1.b0
        public q0 M(long j10) {
            int u10;
            int E;
            if (this.f48581y == d.Width) {
                if (this.f48580x == c.Max) {
                    E = this.f48579w.G(m2.b.m(j10));
                } else {
                    E = this.f48579w.E(m2.b.m(j10));
                }
                return new b(E, m2.b.m(j10));
            }
            if (this.f48580x == c.Max) {
                u10 = this.f48579w.e(m2.b.n(j10));
            } else {
                u10 = this.f48579w.u(m2.b.n(j10));
            }
            return new b(m2.b.n(j10), u10);
        }

        @Override // q1.l
        public Object d() {
            return this.f48579w.d();
        }

        @Override // q1.l
        public int e(int i10) {
            return this.f48579w.e(i10);
        }

        @Override // q1.l
        public int u(int i10) {
            return this.f48579w.u(i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q0 {
        public b(int i10, int i11) {
            z0(m2.p.a(i10, i11));
        }

        @Override // q1.f0
        public int L(q1.a aVar) {
            jo.p.h(aVar, "alignmentLine");
            return Integer.MIN_VALUE;
        }

        @Override // q1.q0
        public void v0(long j10, float f10, io.l<? super c1.i0, wn.v> lVar) {
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        Min,
        Max
    }

    /* loaded from: classes.dex */
    public enum d {
        Width,
        Height
    }

    public final int a(x xVar, m mVar, l lVar, int i10) {
        jo.p.h(xVar, "modifier");
        jo.p.h(mVar, "instrinsicMeasureScope");
        jo.p.h(lVar, "intrinsicMeasurable");
        return xVar.q(new p(mVar, mVar.getLayoutDirection()), new a(lVar, c.Max, d.Height), m2.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int b(x xVar, m mVar, l lVar, int i10) {
        jo.p.h(xVar, "modifier");
        jo.p.h(mVar, "instrinsicMeasureScope");
        jo.p.h(lVar, "intrinsicMeasurable");
        return xVar.q(new p(mVar, mVar.getLayoutDirection()), new a(lVar, c.Max, d.Width), m2.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int c(x xVar, m mVar, l lVar, int i10) {
        jo.p.h(xVar, "modifier");
        jo.p.h(mVar, "instrinsicMeasureScope");
        jo.p.h(lVar, "intrinsicMeasurable");
        return xVar.q(new p(mVar, mVar.getLayoutDirection()), new a(lVar, c.Min, d.Height), m2.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int d(x xVar, m mVar, l lVar, int i10) {
        jo.p.h(xVar, "modifier");
        jo.p.h(mVar, "instrinsicMeasureScope");
        jo.p.h(lVar, "intrinsicMeasurable");
        return xVar.q(new p(mVar, mVar.getLayoutDirection()), new a(lVar, c.Min, d.Width), m2.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
