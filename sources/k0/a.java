package k0;

import c1.c0;
import c1.w;
import l0.c2;
import l0.k1;
import l0.s0;
import l0.z1;
import uo.q0;
import wn.v;

/* loaded from: classes.dex */
public final class a extends m implements k1 {
    public final c2<f> A;
    public final i B;
    public final s0 C;
    public final s0 D;
    public long E;
    public int F;
    public final io.a<v> G;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f38271x;

    /* renamed from: y  reason: collision with root package name */
    public final float f38272y;

    /* renamed from: z  reason: collision with root package name */
    public final c2<c0> f38273z;

    /* renamed from: k0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0531a extends jo.q implements io.a<v> {
        public C0531a() {
            super(0);
        }

        public final void a() {
            a aVar = a.this;
            aVar.o(!aVar.l());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    public a(boolean z10, float f10, c2<c0> c2Var, c2<f> c2Var2, i iVar) {
        super(z10, c2Var2);
        s0 e10;
        s0 e11;
        this.f38271x = z10;
        this.f38272y = f10;
        this.f38273z = c2Var;
        this.A = c2Var2;
        this.B = iVar;
        e10 = z1.e(null, null, 2, null);
        this.C = e10;
        e11 = z1.e(Boolean.TRUE, null, 2, null);
        this.D = e11;
        this.E = b1.l.f16742b.b();
        this.F = -1;
        this.G = new C0531a();
    }

    public /* synthetic */ a(boolean z10, float f10, c2 c2Var, c2 c2Var2, i iVar, jo.h hVar) {
        this(z10, f10, c2Var, c2Var2, iVar);
    }

    @Override // l0.k1
    public void a() {
    }

    @Override // l0.k1
    public void b() {
        k();
    }

    @Override // l0.k1
    public void c() {
        k();
    }

    @Override // v.y
    public void d(e1.c cVar) {
        int X;
        jo.p.h(cVar, "<this>");
        this.E = cVar.c();
        if (Float.isNaN(this.f38272y)) {
            X = lo.c.c(h.a(cVar, this.f38271x, cVar.c()));
        } else {
            X = cVar.X(this.f38272y);
        }
        this.F = X;
        long u10 = this.f38273z.getValue().u();
        float d10 = this.A.getValue().d();
        cVar.c1();
        f(cVar, this.f38272y, u10);
        w e10 = cVar.M0().e();
        l();
        l m10 = m();
        if (m10 != null) {
            m10.f(cVar.c(), this.F, u10, d10);
            m10.draw(c1.c.c(e10));
        }
    }

    @Override // k0.m
    public void e(x.p pVar, q0 q0Var) {
        jo.p.h(pVar, "interaction");
        jo.p.h(q0Var, "scope");
        l b10 = this.B.b(this);
        b10.b(pVar, this.f38271x, this.E, this.F, this.f38273z.getValue().u(), this.A.getValue().d(), this.G);
        p(b10);
    }

    @Override // k0.m
    public void g(x.p pVar) {
        jo.p.h(pVar, "interaction");
        l m10 = m();
        if (m10 != null) {
            m10.e();
        }
    }

    public final void k() {
        this.B.a(this);
    }

    public final boolean l() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    public final l m() {
        return (l) this.C.getValue();
    }

    public final void n() {
        p(null);
    }

    public final void o(boolean z10) {
        this.D.setValue(Boolean.valueOf(z10));
    }

    public final void p(l lVar) {
        this.C.setValue(lVar);
    }
}
