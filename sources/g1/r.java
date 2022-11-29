package g1;

import c1.d0;
import l0.a0;
import l0.c0;
import l0.l1;
import l0.s0;
import l0.z;
import l0.z1;
import wn.v;

/* loaded from: classes.dex */
public final class r extends f1.d {
    public static final int J = 8;
    public final s0 C;
    public final s0 D;
    public final l E;
    public l0.l F;
    public final s0 G;
    public float H;
    public d0 I;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<a0, z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l0.l f32534w;

        /* renamed from: g1.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0376a implements z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ l0.l f32535a;

            public C0376a(l0.l lVar) {
                this.f32535a = lVar;
            }

            @Override // l0.z
            public void dispose() {
                this.f32535a.dispose();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.l lVar) {
            super(1);
            this.f32534w = lVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final z invoke(a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            return new C0376a(this.f32534w);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, v> {
        public final /* synthetic */ io.r<Float, Float, l0.i, Integer, v> A;
        public final /* synthetic */ int B;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f32537x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f32538y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ float f32539z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, float f10, float f11, io.r<? super Float, ? super Float, ? super l0.i, ? super Integer, v> rVar, int i10) {
            super(2);
            this.f32537x = str;
            this.f32538y = f10;
            this.f32539z = f11;
            this.A = rVar;
            this.B = i10;
        }

        public final void a(l0.i iVar, int i10) {
            r.this.n(this.f32537x, this.f32538y, this.f32539z, this.A, iVar, this.B | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.r<Float, Float, l0.i, Integer, v> f32540w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ r f32541x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.r<? super Float, ? super Float, ? super l0.i, ? super Integer, v> rVar, r rVar2) {
            super(2);
            this.f32540w = rVar;
            this.f32541x = rVar2;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                this.f32540w.F(Float.valueOf(this.f32541x.E.l()), Float.valueOf(this.f32541x.E.k()), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<v> {
        public d() {
            super(0);
        }

        public final void a() {
            r.this.v(true);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    public r() {
        s0 e10;
        s0 e11;
        s0 e12;
        e10 = z1.e(b1.l.c(b1.l.f16742b.b()), null, 2, null);
        this.C = e10;
        e11 = z1.e(Boolean.FALSE, null, 2, null);
        this.D = e11;
        l lVar = new l();
        lVar.n(new d());
        this.E = lVar;
        e12 = z1.e(Boolean.TRUE, null, 2, null);
        this.G = e12;
        this.H = 1.0f;
    }

    @Override // f1.d
    public boolean d(float f10) {
        this.H = f10;
        return true;
    }

    @Override // f1.d
    public boolean e(d0 d0Var) {
        this.I = d0Var;
        return true;
    }

    @Override // f1.d
    public long k() {
        return s();
    }

    @Override // f1.d
    public void m(e1.e eVar) {
        jo.p.h(eVar, "<this>");
        l lVar = this.E;
        d0 d0Var = this.I;
        if (d0Var == null) {
            d0Var = lVar.h();
        }
        if (r() && eVar.getLayoutDirection() == m2.q.Rtl) {
            long U0 = eVar.U0();
            e1.d M0 = eVar.M0();
            long c10 = M0.c();
            M0.e().p();
            M0.d().g(-1.0f, 1.0f, U0);
            lVar.g(eVar, this.H, d0Var);
            M0.e().k();
            M0.f(c10);
        } else {
            lVar.g(eVar, this.H, d0Var);
        }
        if (t()) {
            v(false);
        }
    }

    public final void n(String str, float f10, float f11, io.r<? super Float, ? super Float, ? super l0.i, ? super Integer, v> rVar, l0.i iVar, int i10) {
        jo.p.h(str, "name");
        jo.p.h(rVar, "content");
        l0.i h10 = iVar.h(1264894527);
        l lVar = this.E;
        lVar.o(str);
        lVar.q(f10);
        lVar.p(f11);
        l0.l q10 = q(l0.h.d(h10, 0), rVar);
        c0.a(q10, new a(q10), h10, 8);
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(str, f10, f11, rVar, i10));
    }

    public final l0.l q(l0.m mVar, io.r<? super Float, ? super Float, ? super l0.i, ? super Integer, v> rVar) {
        l0.l lVar = this.F;
        if (lVar == null || lVar.j()) {
            lVar = l0.p.a(new k(this.E.j()), mVar);
        }
        this.F = lVar;
        lVar.n(s0.c.c(-1916507005, true, new c(rVar, this)));
        return lVar;
    }

    public final boolean r() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    public final long s() {
        return ((b1.l) this.C.getValue()).m();
    }

    public final boolean t() {
        return ((Boolean) this.G.getValue()).booleanValue();
    }

    public final void u(boolean z10) {
        this.D.setValue(Boolean.valueOf(z10));
    }

    public final void v(boolean z10) {
        this.G.setValue(Boolean.valueOf(z10));
    }

    public final void w(d0 d0Var) {
        this.E.m(d0Var);
    }

    public final void x(long j10) {
        this.C.setValue(b1.l.c(j10));
    }
}
