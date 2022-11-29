package f0;

import q1.q0;

/* loaded from: classes.dex */
public final class l implements q1.x {

    /* renamed from: w  reason: collision with root package name */
    public final o0 f31524w;

    /* renamed from: x  reason: collision with root package name */
    public final int f31525x;

    /* renamed from: y  reason: collision with root package name */
    public final e2.g0 f31526y;

    /* renamed from: z  reason: collision with root package name */
    public final io.a<t0> f31527z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q1.e0 f31528w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l f31529x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f31530y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f31531z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1.e0 e0Var, l lVar, q1.q0 q0Var, int i10) {
            super(1);
            this.f31528w = e0Var;
            this.f31529x = lVar;
            this.f31530y = q0Var;
            this.f31531z = i10;
        }

        public final void a(q0.a aVar) {
            b1.h b10;
            jo.p.h(aVar, "$this$layout");
            q1.e0 e0Var = this.f31528w;
            int a10 = this.f31529x.a();
            e2.g0 f10 = this.f31529x.f();
            t0 invoke = this.f31529x.c().invoke();
            b10 = n0.b(e0Var, a10, f10, invoke != null ? invoke.i() : null, this.f31528w.getLayoutDirection() == m2.q.Rtl, this.f31530y.r0());
            this.f31529x.b().j(w.q.Horizontal, b10, this.f31531z, this.f31530y.r0());
            q0.a.n(aVar, this.f31530y, lo.c.c(-this.f31529x.b().d()), 0, 0.0f, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    public l(o0 o0Var, int i10, e2.g0 g0Var, io.a<t0> aVar) {
        jo.p.h(o0Var, "scrollerPosition");
        jo.p.h(g0Var, "transformedText");
        jo.p.h(aVar, "textLayoutResultProvider");
        this.f31524w = o0Var;
        this.f31525x = i10;
        this.f31526y = g0Var;
        this.f31527z = aVar;
    }

    public final int a() {
        return this.f31525x;
    }

    public final o0 b() {
        return this.f31524w;
    }

    public final io.a<t0> c() {
        return this.f31527z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return jo.p.c(this.f31524w, lVar.f31524w) && this.f31525x == lVar.f31525x && jo.p.c(this.f31526y, lVar.f31526y) && jo.p.c(this.f31527z, lVar.f31527z);
        }
        return false;
    }

    public final e2.g0 f() {
        return this.f31526y;
    }

    public int hashCode() {
        return (((((this.f31524w.hashCode() * 31) + Integer.hashCode(this.f31525x)) * 31) + this.f31526y.hashCode()) * 31) + this.f31527z.hashCode();
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        q1.q0 M = b0Var.M(b0Var.G(m2.b.m(j10)) < m2.b.n(j10) ? j10 : m2.b.e(j10, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        int min = Math.min(M.r0(), m2.b.n(j10));
        return q1.e0.O0(e0Var, min, M.f0(), null, new a(e0Var, this, M, min), 4, null);
    }

    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f31524w + ", cursorOffset=" + this.f31525x + ", transformedText=" + this.f31526y + ", textLayoutResultProvider=" + this.f31527z + ')';
    }
}
