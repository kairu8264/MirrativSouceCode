package g0;

import androidx.compose.ui.platform.m0;
import androidx.compose.ui.platform.x1;
import androidx.compose.ui.platform.z1;
import b1.f;
import e2.i0;
import f0.e0;
import f0.f0;
import f0.r0;
import f0.t0;
import f0.y0;
import l0.s0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final y0 f32281a;

    /* renamed from: b  reason: collision with root package name */
    public e2.t f32282b;

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super e2.a0, wn.v> f32283c;

    /* renamed from: d  reason: collision with root package name */
    public r0 f32284d;

    /* renamed from: e  reason: collision with root package name */
    public final s0 f32285e;

    /* renamed from: f  reason: collision with root package name */
    public i0 f32286f;

    /* renamed from: g  reason: collision with root package name */
    public m0 f32287g;

    /* renamed from: h  reason: collision with root package name */
    public x1 f32288h;

    /* renamed from: i  reason: collision with root package name */
    public i1.a f32289i;

    /* renamed from: j  reason: collision with root package name */
    public a1.t f32290j;

    /* renamed from: k  reason: collision with root package name */
    public final s0 f32291k;

    /* renamed from: l  reason: collision with root package name */
    public long f32292l;

    /* renamed from: m  reason: collision with root package name */
    public Integer f32293m;

    /* renamed from: n  reason: collision with root package name */
    public long f32294n;

    /* renamed from: o  reason: collision with root package name */
    public final s0 f32295o;

    /* renamed from: p  reason: collision with root package name */
    public final s0 f32296p;

    /* renamed from: q  reason: collision with root package name */
    public e2.a0 f32297q;

    /* renamed from: r  reason: collision with root package name */
    public final e0 f32298r;

    /* renamed from: s  reason: collision with root package name */
    public final g0.g f32299s;

    /* loaded from: classes.dex */
    public static final class a implements e0 {
        public a() {
        }

        @Override // f0.e0
        public void a() {
        }

        @Override // f0.e0
        public void b(long j10) {
            v.this.P(f0.j.Cursor);
            v vVar = v.this;
            vVar.O(b1.f.d(n.a(vVar.z(true))));
        }

        @Override // f0.e0
        public void c(long j10) {
            v vVar = v.this;
            vVar.f32292l = n.a(vVar.z(true));
            v vVar2 = v.this;
            vVar2.O(b1.f.d(vVar2.f32292l));
            v.this.f32294n = b1.f.f16721b.c();
            v.this.P(f0.j.Cursor);
        }

        @Override // f0.e0
        public void d() {
            v.this.P(null);
            v.this.O(null);
        }

        @Override // f0.e0
        public void e(long j10) {
            t0 g10;
            y1.z i10;
            v vVar = v.this;
            vVar.f32294n = b1.f.r(vVar.f32294n, j10);
            r0 E = v.this.E();
            if (E == null || (g10 = E.g()) == null || (i10 = g10.i()) == null) {
                return;
            }
            v vVar2 = v.this;
            vVar2.O(b1.f.d(b1.f.r(vVar2.f32292l, vVar2.f32294n)));
            b1.f u10 = vVar2.u();
            jo.p.e(u10);
            int w10 = i10.w(u10.u());
            long b10 = y1.c0.b(w10, w10);
            if (y1.b0.g(b10, vVar2.H().g())) {
                return;
            }
            i1.a A = vVar2.A();
            if (A != null) {
                A.a(i1.b.f36313a.b());
            }
            vVar2.D().invoke(vVar2.m(vVar2.H().e(), b10));
        }

        @Override // f0.e0
        public void onStop() {
            v.this.P(null);
            v.this.O(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements e0 {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f32302b;

        public b(boolean z10) {
            this.f32302b = z10;
        }

        @Override // f0.e0
        public void a() {
        }

        @Override // f0.e0
        public void b(long j10) {
            v.this.P(this.f32302b ? f0.j.SelectionStart : f0.j.SelectionEnd);
            v vVar = v.this;
            vVar.O(b1.f.d(n.a(vVar.z(this.f32302b))));
        }

        @Override // f0.e0
        public void c(long j10) {
            v vVar = v.this;
            vVar.f32292l = n.a(vVar.z(this.f32302b));
            v vVar2 = v.this;
            vVar2.O(b1.f.d(vVar2.f32292l));
            v.this.f32294n = b1.f.f16721b.c();
            v.this.P(this.f32302b ? f0.j.SelectionStart : f0.j.SelectionEnd);
            r0 E = v.this.E();
            if (E == null) {
                return;
            }
            E.x(false);
        }

        @Override // f0.e0
        public void d() {
            v.this.P(null);
            v.this.O(null);
        }

        @Override // f0.e0
        public void e(long j10) {
            t0 g10;
            y1.z i10;
            int b10;
            int w10;
            v vVar = v.this;
            vVar.f32294n = b1.f.r(vVar.f32294n, j10);
            r0 E = v.this.E();
            if (E != null && (g10 = E.g()) != null && (i10 = g10.i()) != null) {
                v vVar2 = v.this;
                boolean z10 = this.f32302b;
                vVar2.O(b1.f.d(b1.f.r(vVar2.f32292l, vVar2.f32294n)));
                if (z10) {
                    b1.f u10 = vVar2.u();
                    jo.p.e(u10);
                    b10 = i10.w(u10.u());
                } else {
                    b10 = vVar2.C().b(y1.b0.n(vVar2.H().g()));
                }
                int i11 = b10;
                if (z10) {
                    w10 = vVar2.C().b(y1.b0.i(vVar2.H().g()));
                } else {
                    b1.f u11 = vVar2.u();
                    jo.p.e(u11);
                    w10 = i10.w(u11.u());
                }
                vVar2.b0(vVar2.H(), i11, w10, z10, k.f32240a.c());
            }
            r0 E2 = v.this.E();
            if (E2 == null) {
                return;
            }
            E2.x(false);
        }

        @Override // f0.e0
        public void onStop() {
            v.this.P(null);
            v.this.O(null);
            r0 E = v.this.E();
            if (E != null) {
                E.x(true);
            }
            x1 F = v.this.F();
            if ((F != null ? F.d() : null) == z1.Hidden) {
                v.this.a0();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements g0.g {
        public c() {
        }

        @Override // g0.g
        public boolean a(long j10, k kVar) {
            t0 g10;
            jo.p.h(kVar, "adjustment");
            a1.t y10 = v.this.y();
            if (y10 != null) {
                y10.c();
            }
            v.this.f32292l = j10;
            r0 E = v.this.E();
            if (E == null || (g10 = E.g()) == null) {
                return false;
            }
            v vVar = v.this;
            vVar.f32293m = Integer.valueOf(t0.h(g10, j10, false, 2, null));
            int h10 = t0.h(g10, vVar.f32292l, false, 2, null);
            vVar.b0(vVar.H(), h10, h10, false, kVar);
            return true;
        }

        @Override // g0.g
        public boolean b(long j10, k kVar) {
            r0 E;
            t0 g10;
            jo.p.h(kVar, "adjustment");
            if ((v.this.H().h().length() == 0) || (E = v.this.E()) == null || (g10 = E.g()) == null) {
                return false;
            }
            v vVar = v.this;
            int g11 = g10.g(j10, false);
            e2.a0 H = vVar.H();
            Integer num = vVar.f32293m;
            jo.p.e(num);
            vVar.b0(H, num.intValue(), g11, false, kVar);
            return true;
        }

        @Override // g0.g
        public boolean c(long j10) {
            r0 E;
            t0 g10;
            if ((v.this.H().h().length() == 0) || (E = v.this.E()) == null || (g10 = E.g()) == null) {
                return false;
            }
            v vVar = v.this;
            vVar.b0(vVar.H(), vVar.C().b(y1.b0.n(vVar.H().g())), g10.g(j10, false), false, k.f32240a.e());
            return true;
        }

        @Override // g0.g
        public boolean d(long j10) {
            t0 g10;
            r0 E = v.this.E();
            if (E == null || (g10 = E.g()) == null) {
                return false;
            }
            v vVar = v.this;
            vVar.b0(vVar.H(), vVar.C().b(y1.b0.n(vVar.H().g())), t0.h(g10, j10, false, 2, null), false, k.f32240a.e());
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<e2.a0, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f32304w = new d();

        public d() {
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

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<wn.v> {
        public e() {
            super(0);
        }

        public final void a() {
            v.l(v.this, false, 1, null);
            v.this.J();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.a<wn.v> {
        public f() {
            super(0);
        }

        public final void a() {
            v.this.o();
            v.this.J();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.a<wn.v> {
        public g() {
            super(0);
        }

        public final void a() {
            v.this.L();
            v.this.J();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.a<wn.v> {
        public h() {
            super(0);
        }

        public final void a() {
            v.this.M();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements e0 {
        public i() {
        }

        @Override // f0.e0
        public void a() {
        }

        @Override // f0.e0
        public void b(long j10) {
        }

        @Override // f0.e0
        public void c(long j10) {
            t0 g10;
            r0 E;
            t0 g11;
            t0 g12;
            if (v.this.w() != null) {
                return;
            }
            v.this.P(f0.j.SelectionEnd);
            v.this.J();
            r0 E2 = v.this.E();
            if (!((E2 == null || (g12 = E2.g()) == null || !g12.j(j10)) ? false : true) && (E = v.this.E()) != null && (g11 = E.g()) != null) {
                v vVar = v.this;
                int a10 = vVar.C().a(t0.e(g11, g11.f(b1.f.n(j10)), false, 2, null));
                i1.a A = vVar.A();
                if (A != null) {
                    A.a(i1.b.f36313a.b());
                }
                e2.a0 m10 = vVar.m(vVar.H().e(), y1.c0.b(a10, a10));
                vVar.r();
                vVar.D().invoke(m10);
                return;
            }
            if (v.this.H().h().length() == 0) {
                return;
            }
            v.this.r();
            r0 E3 = v.this.E();
            if (E3 != null && (g10 = E3.g()) != null) {
                v vVar2 = v.this;
                int h10 = t0.h(g10, j10, false, 2, null);
                vVar2.b0(vVar2.H(), h10, h10, false, k.f32240a.g());
                vVar2.f32293m = Integer.valueOf(h10);
            }
            v.this.f32292l = j10;
            v vVar3 = v.this;
            vVar3.O(b1.f.d(vVar3.f32292l));
            v.this.f32294n = b1.f.f16721b.c();
        }

        @Override // f0.e0
        public void d() {
        }

        @Override // f0.e0
        public void e(long j10) {
            t0 g10;
            if (v.this.H().h().length() == 0) {
                return;
            }
            v vVar = v.this;
            vVar.f32294n = b1.f.r(vVar.f32294n, j10);
            r0 E = v.this.E();
            if (E != null && (g10 = E.g()) != null) {
                v vVar2 = v.this;
                vVar2.O(b1.f.d(b1.f.r(vVar2.f32292l, vVar2.f32294n)));
                Integer num = vVar2.f32293m;
                int intValue = num != null ? num.intValue() : g10.g(vVar2.f32292l, false);
                b1.f u10 = vVar2.u();
                jo.p.e(u10);
                vVar2.b0(vVar2.H(), intValue, g10.g(u10.u(), false), false, k.f32240a.g());
            }
            r0 E2 = v.this.E();
            if (E2 == null) {
                return;
            }
            E2.x(false);
        }

        @Override // f0.e0
        public void onStop() {
            v.this.P(null);
            v.this.O(null);
            r0 E = v.this.E();
            if (E != null) {
                E.x(true);
            }
            x1 F = v.this.F();
            if ((F != null ? F.d() : null) == z1.Hidden) {
                v.this.a0();
            }
            v.this.f32293m = null;
        }
    }

    public v() {
        this(null, 1, null);
    }

    public v(y0 y0Var) {
        s0 e10;
        s0 e11;
        s0 e12;
        s0 e13;
        this.f32281a = y0Var;
        this.f32282b = e2.t.f30146a.a();
        this.f32283c = d.f32304w;
        e10 = l0.z1.e(new e2.a0((String) null, 0L, (y1.b0) null, 7, (jo.h) null), null, 2, null);
        this.f32285e = e10;
        this.f32286f = i0.f30105a.c();
        e11 = l0.z1.e(Boolean.TRUE, null, 2, null);
        this.f32291k = e11;
        f.a aVar = b1.f.f16721b;
        this.f32292l = aVar.c();
        this.f32294n = aVar.c();
        e12 = l0.z1.e(null, null, 2, null);
        this.f32295o = e12;
        e13 = l0.z1.e(null, null, 2, null);
        this.f32296p = e13;
        this.f32297q = new e2.a0((String) null, 0L, (y1.b0) null, 7, (jo.h) null);
        this.f32298r = new i();
        this.f32299s = new c();
    }

    public static /* synthetic */ void l(v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        vVar.k(z10);
    }

    public static /* synthetic */ void q(v vVar, b1.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = null;
        }
        vVar.p(fVar);
    }

    public final i1.a A() {
        return this.f32289i;
    }

    public final g0.g B() {
        return this.f32299s;
    }

    public final e2.t C() {
        return this.f32282b;
    }

    public final io.l<e2.a0, wn.v> D() {
        return this.f32283c;
    }

    public final r0 E() {
        return this.f32284d;
    }

    public final x1 F() {
        return this.f32288h;
    }

    public final e0 G() {
        return this.f32298r;
    }

    public final e2.a0 H() {
        return (e2.a0) this.f32285e.getValue();
    }

    public final e0 I(boolean z10) {
        return new b(z10);
    }

    public final void J() {
        x1 x1Var;
        x1 x1Var2 = this.f32288h;
        if ((x1Var2 != null ? x1Var2.d() : null) != z1.Shown || (x1Var = this.f32288h) == null) {
            return;
        }
        x1Var.a();
    }

    public final boolean K() {
        return !jo.p.c(this.f32297q.h(), H().h());
    }

    public final void L() {
        y1.a a10;
        m0 m0Var = this.f32287g;
        if (m0Var == null || (a10 = m0Var.a()) == null) {
            return;
        }
        y1.a i10 = e2.b0.c(H(), H().h().length()).i(a10).i(e2.b0.b(H(), H().h().length()));
        int l10 = y1.b0.l(H().g()) + a10.length();
        this.f32283c.invoke(m(i10, y1.c0.b(l10, l10)));
        S(f0.k.None);
        y0 y0Var = this.f32281a;
        if (y0Var != null) {
            y0Var.a();
        }
    }

    public final void M() {
        e2.a0 m10 = m(H().e(), y1.c0.b(0, H().h().length()));
        this.f32283c.invoke(m10);
        this.f32297q = e2.a0.d(this.f32297q, null, m10.g(), null, 5, null);
        r0 r0Var = this.f32284d;
        if (r0Var == null) {
            return;
        }
        r0Var.x(true);
    }

    public final void N(m0 m0Var) {
        this.f32287g = m0Var;
    }

    public final void O(b1.f fVar) {
        this.f32296p.setValue(fVar);
    }

    public final void P(f0.j jVar) {
        this.f32295o.setValue(jVar);
    }

    public final void Q(boolean z10) {
        this.f32291k.setValue(Boolean.valueOf(z10));
    }

    public final void R(a1.t tVar) {
        this.f32290j = tVar;
    }

    public final void S(f0.k kVar) {
        r0 r0Var = this.f32284d;
        if (r0Var != null) {
            r0Var.r(kVar);
        }
    }

    public final void T(i1.a aVar) {
        this.f32289i = aVar;
    }

    public final void U(e2.t tVar) {
        jo.p.h(tVar, "<set-?>");
        this.f32282b = tVar;
    }

    public final void V(io.l<? super e2.a0, wn.v> lVar) {
        jo.p.h(lVar, "<set-?>");
        this.f32283c = lVar;
    }

    public final void W(r0 r0Var) {
        this.f32284d = r0Var;
    }

    public final void X(x1 x1Var) {
        this.f32288h = x1Var;
    }

    public final void Y(e2.a0 a0Var) {
        jo.p.h(a0Var, "<set-?>");
        this.f32285e.setValue(a0Var);
    }

    public final void Z(i0 i0Var) {
        jo.p.h(i0Var, "<set-?>");
        this.f32286f = i0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0() {
        /*
            r8 = this;
            e2.a0 r0 = r8.H()
            long r0 = r0.g()
            boolean r0 = y1.b0.h(r0)
            r1 = 0
            if (r0 != 0) goto L16
            g0.v$e r0 = new g0.v$e
            r0.<init>()
            r4 = r0
            goto L17
        L16:
            r4 = r1
        L17:
            e2.a0 r0 = r8.H()
            long r2 = r0.g()
            boolean r0 = y1.b0.h(r2)
            if (r0 != 0) goto L32
            boolean r0 = r8.x()
            if (r0 == 0) goto L32
            g0.v$f r0 = new g0.v$f
            r0.<init>()
            r6 = r0
            goto L33
        L32:
            r6 = r1
        L33:
            boolean r0 = r8.x()
            if (r0 == 0) goto L4c
            androidx.compose.ui.platform.m0 r0 = r8.f32287g
            if (r0 == 0) goto L42
            y1.a r0 = r0.a()
            goto L43
        L42:
            r0 = r1
        L43:
            if (r0 == 0) goto L4c
            g0.v$g r0 = new g0.v$g
            r0.<init>()
            r5 = r0
            goto L4d
        L4c:
            r5 = r1
        L4d:
            e2.a0 r0 = r8.H()
            long r2 = r0.g()
            int r0 = y1.b0.j(r2)
            e2.a0 r2 = r8.H()
            java.lang.String r2 = r2.h()
            int r2 = r2.length()
            if (r0 == r2) goto L6c
            g0.v$h r1 = new g0.v$h
            r1.<init>()
        L6c:
            r7 = r1
            androidx.compose.ui.platform.x1 r2 = r8.f32288h
            if (r2 == 0) goto L78
            b1.h r3 = r8.t()
            r2.e(r3, r4, r5, r6, r7)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.v.a0():void");
    }

    public final void b0(e2.a0 a0Var, int i10, int i11, boolean z10, k kVar) {
        t0 g10;
        long b10 = y1.c0.b(this.f32282b.b(y1.b0.n(a0Var.g())), this.f32282b.b(y1.b0.i(a0Var.g())));
        r0 r0Var = this.f32284d;
        long a10 = u.a((r0Var == null || (g10 = r0Var.g()) == null) ? null : g10.i(), i10, i11, y1.b0.h(b10) ? null : y1.b0.b(b10), z10, kVar);
        long b11 = y1.c0.b(this.f32282b.a(y1.b0.n(a10)), this.f32282b.a(y1.b0.i(a10)));
        if (y1.b0.g(b11, a0Var.g())) {
            return;
        }
        i1.a aVar = this.f32289i;
        if (aVar != null) {
            aVar.a(i1.b.f36313a.b());
        }
        this.f32283c.invoke(m(a0Var.e(), b11));
        r0 r0Var2 = this.f32284d;
        if (r0Var2 != null) {
            r0Var2.z(w.c(this, true));
        }
        r0 r0Var3 = this.f32284d;
        if (r0Var3 == null) {
            return;
        }
        r0Var3.y(w.c(this, false));
    }

    public final void k(boolean z10) {
        if (y1.b0.h(H().g())) {
            return;
        }
        m0 m0Var = this.f32287g;
        if (m0Var != null) {
            m0Var.b(e2.b0.a(H()));
        }
        if (z10) {
            int k10 = y1.b0.k(H().g());
            this.f32283c.invoke(m(H().e(), y1.c0.b(k10, k10)));
            S(f0.k.None);
        }
    }

    public final e2.a0 m(y1.a aVar, long j10) {
        return new e2.a0(aVar, j10, (y1.b0) null, 4, (jo.h) null);
    }

    public final e0 n() {
        return new a();
    }

    public final void o() {
        if (y1.b0.h(H().g())) {
            return;
        }
        m0 m0Var = this.f32287g;
        if (m0Var != null) {
            m0Var.b(e2.b0.a(H()));
        }
        y1.a i10 = e2.b0.c(H(), H().h().length()).i(e2.b0.b(H(), H().h().length()));
        int l10 = y1.b0.l(H().g());
        this.f32283c.invoke(m(i10, y1.c0.b(l10, l10)));
        S(f0.k.None);
        y0 y0Var = this.f32281a;
        if (y0Var != null) {
            y0Var.a();
        }
    }

    public final void p(b1.f fVar) {
        f0.k kVar;
        int k10;
        if (!y1.b0.h(H().g())) {
            r0 r0Var = this.f32284d;
            t0 g10 = r0Var != null ? r0Var.g() : null;
            if (fVar != null && g10 != null) {
                k10 = this.f32282b.a(t0.h(g10, fVar.u(), false, 2, null));
            } else {
                k10 = y1.b0.k(H().g());
            }
            this.f32283c.invoke(e2.a0.d(H(), null, y1.c0.a(k10), null, 5, null));
        }
        if (fVar != null) {
            if (H().h().length() > 0) {
                kVar = f0.k.Cursor;
                S(kVar);
                J();
            }
        }
        kVar = f0.k.None;
        S(kVar);
        J();
    }

    public final void r() {
        a1.t tVar;
        r0 r0Var = this.f32284d;
        boolean z10 = false;
        if (r0Var != null && !r0Var.d()) {
            z10 = true;
        }
        if (z10 && (tVar = this.f32290j) != null) {
            tVar.c();
        }
        this.f32297q = H();
        r0 r0Var2 = this.f32284d;
        if (r0Var2 != null) {
            r0Var2.x(true);
        }
        S(f0.k.Selection);
    }

    public final void s() {
        r0 r0Var = this.f32284d;
        if (r0Var != null) {
            r0Var.x(false);
        }
        S(f0.k.None);
    }

    public final b1.h t() {
        float f10;
        q1.q f11;
        y1.z i10;
        b1.h d10;
        q1.q f12;
        y1.z i11;
        b1.h d11;
        q1.q f13;
        q1.q f14;
        r0 r0Var = this.f32284d;
        if (r0Var != null) {
            long c10 = (r0Var == null || (f14 = r0Var.f()) == null) ? b1.f.f16721b.c() : f14.R(z(true));
            r0 r0Var2 = this.f32284d;
            long c11 = (r0Var2 == null || (f13 = r0Var2.f()) == null) ? b1.f.f16721b.c() : f13.R(z(false));
            r0 r0Var3 = this.f32284d;
            float f15 = 0.0f;
            if (r0Var3 == null || (f12 = r0Var3.f()) == null) {
                f10 = 0.0f;
            } else {
                t0 g10 = r0Var.g();
                f10 = b1.f.n(f12.R(b1.g.a(0.0f, (g10 == null || (i11 = g10.i()) == null || (d11 = i11.d(po.n.m(y1.b0.n(H().g()), 0, Math.max(0, H().h().length() - 1)))) == null) ? 0.0f : d11.l())));
            }
            r0 r0Var4 = this.f32284d;
            if (r0Var4 != null && (f11 = r0Var4.f()) != null) {
                t0 g11 = r0Var.g();
                f15 = b1.f.n(f11.R(b1.g.a(0.0f, (g11 == null || (i10 = g11.i()) == null || (d10 = i10.d(po.n.m(y1.b0.i(H().g()), 0, Math.max(0, H().h().length() - 1)))) == null) ? 0.0f : d10.l())));
            }
            return new b1.h(Math.min(b1.f.m(c10), b1.f.m(c11)), Math.min(f10, f15), Math.max(b1.f.m(c10), b1.f.m(c11)), Math.max(b1.f.n(c10), b1.f.n(c11)) + (m2.g.l(25) * r0Var.q().a().getDensity()));
        }
        return b1.h.f16726e.a();
    }

    public final b1.f u() {
        return (b1.f) this.f32296p.getValue();
    }

    public final long v(m2.d dVar) {
        jo.p.h(dVar, "density");
        int b10 = this.f32282b.b(y1.b0.n(H().g()));
        r0 r0Var = this.f32284d;
        t0 g10 = r0Var != null ? r0Var.g() : null;
        jo.p.e(g10);
        y1.z i10 = g10.i();
        b1.h d10 = i10.d(po.n.m(b10, 0, i10.k().j().length()));
        return b1.g.a(d10.i() + (dVar.I0(f0.d()) / 2), d10.e());
    }

    public final f0.j w() {
        return (f0.j) this.f32295o.getValue();
    }

    public final boolean x() {
        return ((Boolean) this.f32291k.getValue()).booleanValue();
    }

    public final a1.t y() {
        return this.f32290j;
    }

    public final long z(boolean z10) {
        long g10 = H().g();
        int n10 = z10 ? y1.b0.n(g10) : y1.b0.i(g10);
        r0 r0Var = this.f32284d;
        t0 g11 = r0Var != null ? r0Var.g() : null;
        jo.p.e(g11);
        return b0.b(g11.i(), this.f32282b.b(n10), z10, y1.b0.m(H().g()));
    }

    public /* synthetic */ v(y0 y0Var, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? null : y0Var);
    }
}
