package f0;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import d2.l;
import l0.e1;
import l0.z1;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public d0 f31587a;

    /* renamed from: b  reason: collision with root package name */
    public final e1 f31588b;

    /* renamed from: c  reason: collision with root package name */
    public final e2.f f31589c;

    /* renamed from: d  reason: collision with root package name */
    public e2.f0 f31590d;

    /* renamed from: e  reason: collision with root package name */
    public final l0.s0 f31591e;

    /* renamed from: f  reason: collision with root package name */
    public q1.q f31592f;

    /* renamed from: g  reason: collision with root package name */
    public final l0.s0 f31593g;

    /* renamed from: h  reason: collision with root package name */
    public final l0.s0 f31594h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f31595i;

    /* renamed from: j  reason: collision with root package name */
    public final l0.s0 f31596j;

    /* renamed from: k  reason: collision with root package name */
    public final l0.s0 f31597k;

    /* renamed from: l  reason: collision with root package name */
    public final l0.s0 f31598l;

    /* renamed from: m  reason: collision with root package name */
    public final s f31599m;

    /* renamed from: n  reason: collision with root package name */
    public io.l<? super e2.a0, wn.v> f31600n;

    /* renamed from: o  reason: collision with root package name */
    public final io.l<e2.a0, wn.v> f31601o;

    /* renamed from: p  reason: collision with root package name */
    public final io.l<e2.l, wn.v> f31602p;

    /* renamed from: q  reason: collision with root package name */
    public final c1.s0 f31603q;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<e2.l, wn.v> {
        public a() {
            super(1);
        }

        public final void a(int i10) {
            r0.this.f31599m.d(i10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e2.l lVar) {
            a(lVar.o());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<e2.a0, wn.v> {
        public b() {
            super(1);
        }

        public final void a(e2.a0 a0Var) {
            jo.p.h(a0Var, "it");
            if (!jo.p.c(a0Var.h(), r0.this.q().k().g())) {
                r0.this.r(k.None);
            }
            r0.this.f31600n.invoke(a0Var);
            r0.this.k().invalidate();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e2.a0 a0Var) {
            a(a0Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<e2.a0, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f31606w = new c();

        public c() {
            super(1);
        }

        public final void a(e2.a0 a0Var) {
            jo.p.h(a0Var, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e2.a0 a0Var) {
            a(a0Var);
            return wn.v.f59242a;
        }
    }

    public r0(d0 d0Var, e1 e1Var) {
        l0.s0 e10;
        l0.s0 e11;
        l0.s0 e12;
        l0.s0 e13;
        l0.s0 e14;
        l0.s0 e15;
        jo.p.h(d0Var, "textDelegate");
        jo.p.h(e1Var, "recomposeScope");
        this.f31587a = d0Var;
        this.f31588b = e1Var;
        this.f31589c = new e2.f();
        Boolean bool = Boolean.FALSE;
        e10 = z1.e(bool, null, 2, null);
        this.f31591e = e10;
        e11 = z1.e(null, null, 2, null);
        this.f31593g = e11;
        e12 = z1.e(k.None, null, 2, null);
        this.f31594h = e12;
        e13 = z1.e(bool, null, 2, null);
        this.f31596j = e13;
        e14 = z1.e(bool, null, 2, null);
        this.f31597k = e14;
        e15 = z1.e(bool, null, 2, null);
        this.f31598l = e15;
        this.f31599m = new s();
        this.f31600n = c.f31606w;
        this.f31601o = new b();
        this.f31602p = new a();
        this.f31603q = c1.i.a();
    }

    public final void A(y1.a aVar, y1.d0 d0Var, boolean z10, m2.d dVar, l.b bVar, io.l<? super e2.a0, wn.v> lVar, u uVar, a1.g gVar, long j10) {
        jo.p.h(aVar, "visualText");
        jo.p.h(d0Var, "textStyle");
        jo.p.h(dVar, "density");
        jo.p.h(bVar, "fontFamilyResolver");
        jo.p.h(lVar, "onValueChange");
        jo.p.h(uVar, "keyboardActions");
        jo.p.h(gVar, "focusManager");
        this.f31600n = lVar;
        this.f31603q.l(j10);
        s sVar = this.f31599m;
        sVar.f(uVar);
        sVar.e(gVar);
        this.f31587a = i.d(this.f31587a, aVar, d0Var, dVar, bVar, z10, 0, 0, xn.s.k(), PsExtractor.AUDIO_STREAM, null);
    }

    public final k c() {
        return (k) this.f31594h.getValue();
    }

    public final boolean d() {
        return ((Boolean) this.f31591e.getValue()).booleanValue();
    }

    public final e2.f0 e() {
        return this.f31590d;
    }

    public final q1.q f() {
        return this.f31592f;
    }

    public final t0 g() {
        return (t0) this.f31593g.getValue();
    }

    public final io.l<e2.l, wn.v> h() {
        return this.f31602p;
    }

    public final io.l<e2.a0, wn.v> i() {
        return this.f31601o;
    }

    public final e2.f j() {
        return this.f31589c;
    }

    public final e1 k() {
        return this.f31588b;
    }

    public final c1.s0 l() {
        return this.f31603q;
    }

    public final boolean m() {
        return ((Boolean) this.f31598l.getValue()).booleanValue();
    }

    public final boolean n() {
        return this.f31595i;
    }

    public final boolean o() {
        return ((Boolean) this.f31597k.getValue()).booleanValue();
    }

    public final boolean p() {
        return ((Boolean) this.f31596j.getValue()).booleanValue();
    }

    public final d0 q() {
        return this.f31587a;
    }

    public final void r(k kVar) {
        jo.p.h(kVar, "<set-?>");
        this.f31594h.setValue(kVar);
    }

    public final void s(boolean z10) {
        this.f31591e.setValue(Boolean.valueOf(z10));
    }

    public final void t(e2.f0 f0Var) {
        this.f31590d = f0Var;
    }

    public final void u(q1.q qVar) {
        this.f31592f = qVar;
    }

    public final void v(t0 t0Var) {
        this.f31593g.setValue(t0Var);
    }

    public final void w(boolean z10) {
        this.f31598l.setValue(Boolean.valueOf(z10));
    }

    public final void x(boolean z10) {
        this.f31595i = z10;
    }

    public final void y(boolean z10) {
        this.f31597k.setValue(Boolean.valueOf(z10));
    }

    public final void z(boolean z10) {
        this.f31596j.setValue(Boolean.valueOf(z10));
    }
}
