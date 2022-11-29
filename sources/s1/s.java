package s1;

import c1.i0;
import c1.s0;
import c1.t0;
import l0.z1;
import q1.q0;

/* loaded from: classes.dex */
public final class s extends p {

    /* renamed from: c0  reason: collision with root package name */
    public static final a f51943c0 = new a(null);

    /* renamed from: d0  reason: collision with root package name */
    public static final s0 f51944d0;
    public p Y;
    public q1.x Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f51945a0;

    /* renamed from: b0  reason: collision with root package name */
    public l0.s0<q1.x> f51946b0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    static {
        s0 a10 = c1.i.a();
        a10.l(c1.c0.f18634b.b());
        a10.w(1.0f);
        a10.v(t0.f18770a.b());
        f51944d0 = a10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p pVar, q1.x xVar) {
        super(pVar.z1());
        jo.p.h(pVar, "wrapped");
        jo.p.h(xVar, "modifier");
        this.Y = pVar;
        this.Z = xVar;
    }

    @Override // s1.p
    public q1.e0 B1() {
        return H1().B1();
    }

    @Override // q1.l
    public int E(int i10) {
        return o2().w(B1(), H1(), i10);
    }

    @Override // q1.l
    public int G(int i10) {
        return o2().d(B1(), H1(), i10);
    }

    @Override // s1.p
    public p H1() {
        return this.Y;
    }

    @Override // q1.b0
    public q0 M(long j10) {
        long j02;
        E0(j10);
        d2(this.Z.q(B1(), H1(), j10));
        x x12 = x1();
        if (x12 != null) {
            j02 = j0();
            x12.c(j02);
        }
        X1();
        return this;
    }

    @Override // s1.p
    public void U1() {
        super.U1();
        H1().f2(this);
    }

    @Override // s1.p
    public void Y1() {
        super.Y1();
        l0.s0<q1.x> s0Var = this.f51946b0;
        if (s0Var == null) {
            return;
        }
        s0Var.setValue(this.Z);
    }

    @Override // s1.p
    public void a2(c1.w wVar) {
        jo.p.h(wVar, "canvas");
        H1().o1(wVar);
        if (o.a(z1()).getShowLayoutBounds()) {
            p1(wVar, f51944d0);
        }
    }

    @Override // q1.l
    public int e(int i10) {
        return o2().u(B1(), H1(), i10);
    }

    @Override // s1.p
    public int k1(q1.a aVar) {
        int j10;
        jo.p.h(aVar, "alignmentLine");
        if (A1().e().containsKey(aVar)) {
            Integer num = A1().e().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int L = H1().L(aVar);
        if (L == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        e2(true);
        v0(E1(), J1(), y1());
        e2(false);
        if (aVar instanceof q1.k) {
            j10 = m2.k.k(H1().E1());
        } else {
            j10 = m2.k.j(H1().E1());
        }
        return L + j10;
    }

    public final q1.x m2() {
        return this.Z;
    }

    public final boolean n2() {
        return this.f51945a0;
    }

    public final q1.x o2() {
        l0.s0<q1.x> s0Var = this.f51946b0;
        if (s0Var == null) {
            s0Var = z1.e(this.Z, null, 2, null);
        }
        this.f51946b0 = s0Var;
        return s0Var.getValue();
    }

    public final void p2(q1.x xVar) {
        jo.p.h(xVar, "<set-?>");
        this.Z = xVar;
    }

    public final void q2(boolean z10) {
        this.f51945a0 = z10;
    }

    public void r2(p pVar) {
        jo.p.h(pVar, "<set-?>");
        this.Y = pVar;
    }

    @Override // q1.l
    public int u(int i10) {
        return o2().h(B1(), H1(), i10);
    }

    @Override // s1.p, q1.q0
    public void v0(long j10, float f10, io.l<? super i0, wn.v> lVar) {
        int h10;
        m2.q g10;
        super.v0(j10, f10, lVar);
        p I1 = I1();
        boolean z10 = true;
        if (I1 == null || !I1.R1()) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        Z1();
        q0.a.C0733a c0733a = q0.a.f48598a;
        int g11 = m2.o.g(j0());
        m2.q layoutDirection = B1().getLayoutDirection();
        h10 = c0733a.h();
        g10 = c0733a.g();
        q0.a.f48600c = g11;
        q0.a.f48599b = layoutDirection;
        A1().c();
        q0.a.f48600c = h10;
        q0.a.f48599b = g10;
    }
}
