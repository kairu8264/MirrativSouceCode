package y;

import l0.z1;
import q1.q0;

/* loaded from: classes.dex */
public final class a0 extends androidx.compose.ui.platform.d1 implements q1.x, r1.b, r1.d<n1> {

    /* renamed from: x  reason: collision with root package name */
    public final n1 f60665x;

    /* renamed from: y  reason: collision with root package name */
    public final l0.s0 f60666y;

    /* renamed from: z  reason: collision with root package name */
    public final l0.s0 f60667z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f60668w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f60669x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f60670y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1.q0 q0Var, int i10, int i11) {
            super(1);
            this.f60668w = q0Var;
            this.f60669x = i10;
            this.f60670y = i11;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0.a.j(aVar, this.f60668w, this.f60669x, this.f60670y, 0.0f, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ n1 f60671w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n1 n1Var) {
            super(1);
            this.f60671w = n1Var;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("InsetsPaddingModifier");
            c1Var.a().b("insets", this.f60671w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(n1 n1Var, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
        l0.s0 e10;
        l0.s0 e11;
        jo.p.h(n1Var, "insets");
        jo.p.h(lVar, "inspectorInfo");
        this.f60665x = n1Var;
        e10 = z1.e(n1Var, null, 2, null);
        this.f60666y = e10;
        e11 = z1.e(n1Var, null, 2, null);
        this.f60667z = e11;
    }

    public final n1 b() {
        return (n1) this.f60667z.getValue();
    }

    public final n1 c() {
        return (n1) this.f60666y.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return jo.p.c(((a0) obj).f60665x, this.f60665x);
        }
        return false;
    }

    @Override // r1.d
    /* renamed from: f */
    public n1 getValue() {
        return b();
    }

    public final void g(n1 n1Var) {
        this.f60667z.setValue(n1Var);
    }

    @Override // r1.d
    public r1.f<n1> getKey() {
        return s1.a();
    }

    public int hashCode() {
        return this.f60665x.hashCode();
    }

    public final void i(n1 n1Var) {
        this.f60666y.setValue(n1Var);
    }

    @Override // r1.b
    public void j0(r1.e eVar) {
        jo.p.h(eVar, "scope");
        n1 n1Var = (n1) eVar.a(s1.a());
        i(q1.b(this.f60665x, n1Var));
        g(q1.d(n1Var, this.f60665x));
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        int c10 = c().c(e0Var, e0Var.getLayoutDirection());
        int b10 = c().b(e0Var);
        int d10 = c().d(e0Var, e0Var.getLayoutDirection()) + c10;
        int a10 = c().a(e0Var) + b10;
        q1.q0 M = b0Var.M(m2.c.i(j10, -d10, -a10));
        return q1.e0.O0(e0Var, m2.c.g(j10, M.r0() + d10), m2.c.f(j10, M.f0() + a10), null, new a(M, c10, b10), 4, null);
    }

    public /* synthetic */ a0(n1 n1Var, io.l lVar, int i10, jo.h hVar) {
        this(n1Var, (i10 & 2) != 0 ? androidx.compose.ui.platform.a1.c() ? new b(n1Var) : androidx.compose.ui.platform.a1.a() : lVar);
    }
}
