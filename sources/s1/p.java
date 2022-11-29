package s1;

import c1.c1;
import c1.i0;
import c1.s0;
import java.util.LinkedHashMap;
import java.util.Map;
import q1.l0;
import q1.m0;
import q1.p0;
import q1.q0;
import s1.e;

/* loaded from: classes.dex */
public abstract class p extends q0 implements q1.b0, q1.q, z, io.l<c1.w, wn.v> {
    public static final e S = new e(null);
    public static final io.l<p, wn.v> T = d.f51913w;
    public static final io.l<p, wn.v> U = c.f51912w;
    public static final c1 V = new c1();
    public static final f<b0, n1.c0, n1.d0> W = new a();
    public static final f<w1.m, w1.m, w1.n> X = new b();
    public final s1.k A;
    public p B;
    public boolean C;
    public io.l<? super i0, wn.v> D;
    public m2.d E;
    public m2.q F;
    public float G;
    public boolean H;
    public q1.d0 I;
    public Map<q1.a, Integer> J;
    public long K;
    public float L;
    public boolean M;
    public b1.d N;
    public final n<?, ?>[] O;
    public final io.a<wn.v> P;
    public boolean Q;
    public x R;

    /* loaded from: classes.dex */
    public static final class a implements f<b0, n1.c0, n1.d0> {
        @Override // s1.p.f
        public boolean b(s1.k kVar) {
            jo.p.h(kVar, "parentLayoutNode");
            return true;
        }

        @Override // s1.p.f
        public void c(s1.k kVar, long j10, s1.f<n1.c0> fVar, boolean z10, boolean z11) {
            jo.p.h(kVar, "layoutNode");
            jo.p.h(fVar, "hitTestResult");
            kVar.D0(j10, fVar, z10, z11);
        }

        @Override // s1.p.f
        public int d() {
            return s1.e.f51834a.d();
        }

        @Override // s1.p.f
        /* renamed from: f */
        public n1.c0 a(b0 b0Var) {
            jo.p.h(b0Var, "entity");
            return b0Var.c().z0();
        }

        @Override // s1.p.f
        /* renamed from: g */
        public boolean e(b0 b0Var) {
            jo.p.h(b0Var, "entity");
            return b0Var.c().z0().C();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements f<w1.m, w1.m, w1.n> {
        @Override // s1.p.f
        public boolean b(s1.k kVar) {
            w1.k j10;
            jo.p.h(kVar, "parentLayoutNode");
            w1.m j11 = w1.r.j(kVar);
            boolean z10 = false;
            if (j11 != null && (j10 = j11.j()) != null && j10.r()) {
                z10 = true;
            }
            return !z10;
        }

        @Override // s1.p.f
        public void c(s1.k kVar, long j10, s1.f<w1.m> fVar, boolean z10, boolean z11) {
            jo.p.h(kVar, "layoutNode");
            jo.p.h(fVar, "hitTestResult");
            kVar.F0(j10, fVar, z10, z11);
        }

        @Override // s1.p.f
        public int d() {
            return s1.e.f51834a.f();
        }

        @Override // s1.p.f
        /* renamed from: f */
        public w1.m a(w1.m mVar) {
            jo.p.h(mVar, "entity");
            return mVar;
        }

        @Override // s1.p.f
        /* renamed from: g */
        public boolean e(w1.m mVar) {
            jo.p.h(mVar, "entity");
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<p, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f51912w = new c();

        public c() {
            super(1);
        }

        public final void a(p pVar) {
            jo.p.h(pVar, "wrapper");
            x x12 = pVar.x1();
            if (x12 != null) {
                x12.invalidate();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(p pVar) {
            a(pVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<p, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f51913w = new d();

        public d() {
            super(1);
        }

        public final void a(p pVar) {
            jo.p.h(pVar, "wrapper");
            if (pVar.m0()) {
                pVar.k2();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(p pVar) {
            a(pVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public e() {
        }

        public /* synthetic */ e(jo.h hVar) {
            this();
        }

        public final f<b0, n1.c0, n1.d0> a() {
            return p.W;
        }

        public final f<w1.m, w1.m, w1.n> b() {
            return p.X;
        }
    }

    /* loaded from: classes.dex */
    public interface f<T extends n<T, M>, C, M extends x0.f> {
        C a(T t10);

        boolean b(s1.k kVar);

        void c(s1.k kVar, long j10, s1.f<C> fVar, boolean z10, boolean z11);

        int d();

        boolean e(T t10);
    }

    /* JADX WARN: Incorrect field signature: TT; */
    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.a<wn.v> {
        public final /* synthetic */ s1.f<C> A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ boolean C;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ n f51915x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f<T, C, M> f51916y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f51917z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Ls1/p;TT;Ls1/p$f<TT;TC;TM;>;JLs1/f<TC;>;ZZ)V */
        public g(n nVar, f fVar, long j10, s1.f fVar2, boolean z10, boolean z11) {
            super(0);
            this.f51915x = nVar;
            this.f51916y = fVar;
            this.f51917z = j10;
            this.A = fVar2;
            this.B = z10;
            this.C = z11;
        }

        public final void a() {
            p.this.K1(this.f51915x.d(), this.f51916y, this.f51917z, this.A, this.B, this.C);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Incorrect field signature: TT; */
    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.a<wn.v> {
        public final /* synthetic */ s1.f<C> A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ float D;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ n f51919x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f<T, C, M> f51920y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f51921z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Ls1/p;TT;Ls1/p$f<TT;TC;TM;>;JLs1/f<TC;>;ZZF)V */
        public h(n nVar, f fVar, long j10, s1.f fVar2, boolean z10, boolean z11, float f10) {
            super(0);
            this.f51919x = nVar;
            this.f51920y = fVar;
            this.f51921z = j10;
            this.A = fVar2;
            this.B = z10;
            this.C = z11;
            this.D = f10;
        }

        public final void a() {
            p.this.L1(this.f51919x.d(), this.f51920y, this.f51921z, this.A, this.B, this.C, this.D);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.a<wn.v> {
        public i() {
            super(0);
        }

        public final void a() {
            p I1 = p.this.I1();
            if (I1 != null) {
                I1.O1();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c1.w f51924x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(c1.w wVar) {
            super(0);
            this.f51924x = wVar;
        }

        public final void a() {
            p.this.q1(this.f51924x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Incorrect field signature: TT; */
    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.a<wn.v> {
        public final /* synthetic */ s1.f<C> A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ float D;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ n f51926x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f<T, C, M> f51927y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f51928z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Ls1/p;TT;Ls1/p$f<TT;TC;TM;>;JLs1/f<TC;>;ZZF)V */
        public k(n nVar, f fVar, long j10, s1.f fVar2, boolean z10, boolean z11, float f10) {
            super(0);
            this.f51926x = nVar;
            this.f51927y = fVar;
            this.f51928z = j10;
            this.A = fVar2;
            this.B = z10;
            this.C = z11;
            this.D = f10;
        }

        public final void a() {
            p.this.h2(this.f51926x.d(), this.f51927y, this.f51928z, this.A, this.B, this.C, this.D);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<i0, wn.v> f51929w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(io.l<? super i0, wn.v> lVar) {
            super(0);
            this.f51929w = lVar;
        }

        public final void a() {
            this.f51929w.invoke(p.V);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public p(s1.k kVar) {
        jo.p.h(kVar, "layoutNode");
        this.A = kVar;
        this.E = kVar.X();
        this.F = kVar.getLayoutDirection();
        this.G = 0.8f;
        this.K = m2.k.f40528b.a();
        this.O = s1.e.l(null, 1, null);
        this.P = new i();
    }

    private final a0 G1() {
        return o.a(this.A).getSnapshotObserver();
    }

    public static /* synthetic */ void c2(p pVar, b1.d dVar, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        pVar.b2(dVar, z10, z11);
    }

    public final q1.d0 A1() {
        q1.d0 d0Var = this.I;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    public abstract q1.e0 B1();

    public final long C1() {
        return this.E.W0(this.A.x0().d());
    }

    public final Object D1(e0<p0> e0Var) {
        if (e0Var == null) {
            p H1 = H1();
            if (H1 != null) {
                return H1.d();
            }
            return null;
        }
        return e0Var.c().g0(B1(), D1((e0) e0Var.d()));
    }

    public final long E1() {
        return this.K;
    }

    public final b1.d F1() {
        b1.d dVar = this.N;
        if (dVar == null) {
            b1.d dVar2 = new b1.d(0.0f, 0.0f, 0.0f, 0.0f);
            this.N = dVar2;
            return dVar2;
        }
        return dVar;
    }

    public p H1() {
        return null;
    }

    public final p I1() {
        return this.B;
    }

    public final float J1() {
        return this.L;
    }

    public final <T extends n<T, M>, C, M extends x0.f> void K1(T t10, f<T, C, M> fVar, long j10, s1.f<C> fVar2, boolean z10, boolean z11) {
        if (t10 == null) {
            N1(fVar, j10, fVar2, z10, z11);
        } else {
            fVar2.s(fVar.a(t10), z11, new g(t10, fVar, j10, fVar2, z10, z11));
        }
    }

    @Override // q1.f0
    public final int L(q1.a aVar) {
        int k12;
        jo.p.h(aVar, "alignmentLine");
        if (v1() && (k12 = k1(aVar)) != Integer.MIN_VALUE) {
            return k12 + m2.k.k(e0());
        }
        return Integer.MIN_VALUE;
    }

    public final <T extends n<T, M>, C, M extends x0.f> void L1(T t10, f<T, C, M> fVar, long j10, s1.f<C> fVar2, boolean z10, boolean z11, float f10) {
        if (t10 == null) {
            N1(fVar, j10, fVar2, z10, z11);
        } else {
            fVar2.t(fVar.a(t10), f10, z11, new h(t10, fVar, j10, fVar2, z10, z11, f10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends n<T, M>, C, M extends x0.f> void M1(f<T, C, M> fVar, long j10, s1.f<C> fVar2, boolean z10, boolean z11) {
        jo.p.h(fVar, "hitTestSource");
        jo.p.h(fVar2, "hitTestResult");
        n n10 = s1.e.n(this.O, fVar.d());
        boolean z12 = true;
        if (!l2(j10)) {
            if (z10) {
                float n12 = n1(j10, C1());
                if (Float.isInfinite(n12) || Float.isNaN(n12)) {
                    z12 = false;
                }
                if (z12 && fVar2.u(n12, false)) {
                    L1(n10, fVar, j10, fVar2, z10, false, n12);
                }
            }
        } else if (n10 == null) {
            N1(fVar, j10, fVar2, z10, z11);
        } else if (Q1(j10)) {
            K1(n10, fVar, j10, fVar2, z10, z11);
        } else {
            float n13 = !z10 ? Float.POSITIVE_INFINITY : n1(j10, C1());
            if (Float.isInfinite(n13) || Float.isNaN(n13)) {
                z12 = false;
            }
            if (z12 && fVar2.u(n13, z11)) {
                L1(n10, fVar, j10, fVar2, z10, z11, n13);
            } else {
                h2(n10, fVar, j10, fVar2, z10, z11, n13);
            }
        }
    }

    public <T extends n<T, M>, C, M extends x0.f> void N1(f<T, C, M> fVar, long j10, s1.f<C> fVar2, boolean z10, boolean z11) {
        jo.p.h(fVar, "hitTestSource");
        jo.p.h(fVar2, "hitTestResult");
        p H1 = H1();
        if (H1 != null) {
            H1.M1(fVar, H1.s1(j10), fVar2, z10, z11);
        }
    }

    public void O1() {
        x xVar = this.R;
        if (xVar != null) {
            xVar.invalidate();
            return;
        }
        p pVar = this.B;
        if (pVar != null) {
            pVar.O1();
        }
    }

    @Override // q1.q
    public final q1.q P() {
        if (h()) {
            return this.A.s0().B;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public void P1(c1.w wVar) {
        jo.p.h(wVar, "canvas");
        if (this.A.g()) {
            G1().e(this, U, new j(wVar));
            this.Q = false;
            return;
        }
        this.Q = true;
    }

    public final boolean Q1(long j10) {
        float m10 = b1.f.m(j10);
        float n10 = b1.f.n(j10);
        return m10 >= 0.0f && n10 >= 0.0f && m10 < ((float) l0()) && n10 < ((float) g0());
    }

    @Override // q1.q
    public long R(long j10) {
        if (h()) {
            for (p pVar = this; pVar != null; pVar = pVar.B) {
                j10 = pVar.i2(j10);
            }
            return j10;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final boolean R1() {
        return this.M;
    }

    public final boolean S1() {
        if (this.R == null || this.G > 0.0f) {
            p pVar = this.B;
            if (pVar != null) {
                return pVar.S1();
            }
            return false;
        }
        return true;
    }

    public final long T1(long j10) {
        float m10 = b1.f.m(j10);
        float max = Math.max(0.0f, m10 < 0.0f ? -m10 : m10 - l0());
        float n10 = b1.f.n(j10);
        return b1.g.a(max, Math.max(0.0f, n10 < 0.0f ? -n10 : n10 - g0()));
    }

    public void U1() {
        x xVar = this.R;
        if (xVar != null) {
            xVar.invalidate();
        }
    }

    public final void V1(io.l<? super i0, wn.v> lVar) {
        y t02;
        boolean z10 = (this.D == lVar && jo.p.c(this.E, this.A.X()) && this.F == this.A.getLayoutDirection()) ? false : true;
        this.D = lVar;
        this.E = this.A.X();
        this.F = this.A.getLayoutDirection();
        if (h() && lVar != null) {
            if (this.R != null) {
                if (z10) {
                    k2();
                    return;
                }
                return;
            }
            x x10 = o.a(this.A).x(this, this.P);
            x10.c(j0());
            x10.h(this.K);
            this.R = x10;
            k2();
            this.A.p1(true);
            this.P.invoke();
            return;
        }
        x xVar = this.R;
        if (xVar != null) {
            xVar.destroy();
            this.A.p1(true);
            this.P.invoke();
            if (h() && (t02 = this.A.t0()) != null) {
                t02.r(this.A);
            }
        }
        this.R = null;
        this.Q = false;
    }

    public void W1(int i10, int i11) {
        x xVar = this.R;
        if (xVar != null) {
            xVar.c(m2.p.a(i10, i11));
        } else {
            p pVar = this.B;
            if (pVar != null) {
                pVar.O1();
            }
        }
        y t02 = this.A.t0();
        if (t02 != null) {
            t02.r(this.A);
        }
        z0(m2.p.a(i10, i11));
        for (n<?, ?> nVar = this.O[s1.e.f51834a.a()]; nVar != null; nVar = nVar.d()) {
            ((s1.d) nVar).n();
        }
    }

    public final void X1() {
        n<?, ?>[] nVarArr = this.O;
        e.a aVar = s1.e.f51834a;
        if (s1.e.m(nVarArr, aVar.e())) {
            v0.h a10 = v0.h.f56484e.a();
            try {
                v0.h k10 = a10.k();
                for (n<?, ?> nVar = this.O[aVar.e()]; nVar != null; nVar = nVar.d()) {
                    ((m0) ((e0) nVar).c()).z(j0());
                }
                wn.v vVar = wn.v.f59242a;
                a10.r(k10);
            } finally {
                a10.d();
            }
        }
    }

    public void Y1() {
        x xVar = this.R;
        if (xVar != null) {
            xVar.invalidate();
        }
    }

    public final void Z1() {
        for (n<?, ?> nVar = this.O[s1.e.f51834a.b()]; nVar != null; nVar = nVar.d()) {
            ((l0) ((e0) nVar).c()).T(this);
        }
    }

    @Override // q1.q
    public final long a() {
        return j0();
    }

    public void a2(c1.w wVar) {
        jo.p.h(wVar, "canvas");
        p H1 = H1();
        if (H1 != null) {
            H1.o1(wVar);
        }
    }

    public final void b2(b1.d dVar, boolean z10, boolean z11) {
        jo.p.h(dVar, "bounds");
        x xVar = this.R;
        if (xVar != null) {
            if (this.C) {
                if (z11) {
                    long C1 = C1();
                    float i10 = b1.l.i(C1) / 2.0f;
                    float g10 = b1.l.g(C1) / 2.0f;
                    dVar.e(-i10, -g10, m2.o.g(a()) + i10, m2.o.f(a()) + g10);
                } else if (z10) {
                    dVar.e(0.0f, 0.0f, m2.o.g(a()), m2.o.f(a()));
                }
                if (dVar.f()) {
                    return;
                }
            }
            xVar.f(dVar, false);
        }
        float j10 = m2.k.j(this.K);
        dVar.i(dVar.b() + j10);
        dVar.j(dVar.c() + j10);
        float k10 = m2.k.k(this.K);
        dVar.k(dVar.d() + k10);
        dVar.h(dVar.a() + k10);
    }

    @Override // q1.f0, q1.l
    public Object d() {
        return D1((e0) s1.e.n(this.O, s1.e.f51834a.c()));
    }

    public final void d2(q1.d0 d0Var) {
        s1.k u02;
        jo.p.h(d0Var, "value");
        q1.d0 d0Var2 = this.I;
        if (d0Var != d0Var2) {
            this.I = d0Var;
            if (d0Var2 == null || d0Var.getWidth() != d0Var2.getWidth() || d0Var.getHeight() != d0Var2.getHeight()) {
                W1(d0Var.getWidth(), d0Var.getHeight());
            }
            Map<q1.a, Integer> map = this.J;
            if ((!(map == null || map.isEmpty()) || (!d0Var.e().isEmpty())) && !jo.p.c(d0Var.e(), this.J)) {
                p H1 = H1();
                if (jo.p.c(H1 != null ? H1.A : null, this.A)) {
                    s1.k u03 = this.A.u0();
                    if (u03 != null) {
                        u03.T0();
                    }
                    if (this.A.U().i()) {
                        s1.k u04 = this.A.u0();
                        if (u04 != null) {
                            s1.k.k1(u04, false, 1, null);
                        }
                    } else if (this.A.U().h() && (u02 = this.A.u0()) != null) {
                        s1.k.i1(u02, false, 1, null);
                    }
                } else {
                    this.A.T0();
                }
                this.A.U().n(true);
                Map map2 = this.J;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.J = map2;
                }
                map2.clear();
                map2.putAll(d0Var.e());
            }
        }
    }

    public final void e2(boolean z10) {
        this.M = z10;
    }

    public final void f2(p pVar) {
        this.B = pVar;
    }

    public final boolean g2() {
        b0 b0Var = (b0) s1.e.n(this.O, s1.e.f51834a.d());
        if (b0Var != null && b0Var.j()) {
            return true;
        }
        p H1 = H1();
        return H1 != null && H1.g2();
    }

    @Override // q1.q
    public final boolean h() {
        if (!this.H || this.A.L0()) {
            return this.H;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void h1(p pVar, b1.d dVar, boolean z10) {
        if (pVar == this) {
            return;
        }
        p pVar2 = this.B;
        if (pVar2 != null) {
            pVar2.h1(pVar, dVar, z10);
        }
        t1(dVar, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends n<T, M>, C, M extends x0.f> void h2(T t10, f<T, C, M> fVar, long j10, s1.f<C> fVar2, boolean z10, boolean z11, float f10) {
        if (t10 == null) {
            N1(fVar, j10, fVar2, z10, z11);
        } else if (fVar.e(t10)) {
            fVar2.x(fVar.a(t10), f10, z11, new k(t10, fVar, j10, fVar2, z10, z11, f10));
        } else {
            h2(t10.d(), fVar, j10, fVar2, z10, z11, f10);
        }
    }

    public final long i1(p pVar, long j10) {
        if (pVar == this) {
            return j10;
        }
        p pVar2 = this.B;
        if (pVar2 != null && !jo.p.c(pVar, pVar2)) {
            return s1(pVar2.i1(pVar, j10));
        }
        return s1(j10);
    }

    public long i2(long j10) {
        x xVar = this.R;
        if (xVar != null) {
            j10 = xVar.b(j10, false);
        }
        return m2.l.c(j10, this.K);
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(c1.w wVar) {
        P1(wVar);
        return wn.v.f59242a;
    }

    public void j1() {
        n<?, ?>[] nVarArr;
        this.H = true;
        V1(this.D);
        for (n<?, ?> nVar : this.O) {
            for (; nVar != null; nVar = nVar.d()) {
                nVar.g();
            }
        }
    }

    public final b1.h j2() {
        if (!h()) {
            return b1.h.f16726e.a();
        }
        q1.q d10 = q1.r.d(this);
        b1.d F1 = F1();
        long l12 = l1(C1());
        F1.i(-b1.l.i(l12));
        F1.k(-b1.l.g(l12));
        F1.j(l0() + b1.l.i(l12));
        F1.h(g0() + b1.l.g(l12));
        p pVar = this;
        while (pVar != d10) {
            pVar.b2(F1, false, true);
            if (F1.f()) {
                return b1.h.f16726e.a();
            }
            pVar = pVar.B;
            jo.p.e(pVar);
        }
        return b1.e.a(F1);
    }

    @Override // q1.q
    public b1.h k(q1.q qVar, boolean z10) {
        jo.p.h(qVar, "sourceCoordinates");
        if (h()) {
            if (qVar.h()) {
                p pVar = (p) qVar;
                p r12 = r1(pVar);
                b1.d F1 = F1();
                F1.i(0.0f);
                F1.k(0.0f);
                F1.j(m2.o.g(qVar.a()));
                F1.h(m2.o.f(qVar.a()));
                while (pVar != r12) {
                    c2(pVar, F1, z10, false, 4, null);
                    if (F1.f()) {
                        return b1.h.f16726e.a();
                    }
                    pVar = pVar.B;
                    jo.p.e(pVar);
                }
                h1(r12, F1, z10);
                return b1.e.a(F1);
            }
            throw new IllegalStateException(("LayoutCoordinates " + qVar + " is not attached!").toString());
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public abstract int k1(q1.a aVar);

    public final void k2() {
        x xVar = this.R;
        if (xVar != null) {
            io.l<? super i0, wn.v> lVar = this.D;
            if (lVar != null) {
                c1 c1Var = V;
                c1Var.R();
                c1Var.T(this.A.X());
                G1().e(this, T, new l(lVar));
                xVar.g(c1Var.z(), c1Var.C(), c1Var.d(), c1Var.M(), c1Var.P(), c1Var.E(), c1Var.q(), c1Var.u(), c1Var.w(), c1Var.h(), c1Var.L(), c1Var.F(), c1Var.k(), c1Var.o(), c1Var.e(), c1Var.G(), this.A.getLayoutDirection(), this.A.X());
                this.C = c1Var.k();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            if (!(this.D == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        this.G = V.d();
        y t02 = this.A.t0();
        if (t02 != null) {
            t02.r(this.A);
        }
    }

    public final long l1(long j10) {
        return b1.m.a(Math.max(0.0f, (b1.l.i(j10) - l0()) / 2.0f), Math.max(0.0f, (b1.l.g(j10) - g0()) / 2.0f));
    }

    public final boolean l2(long j10) {
        if (b1.g.b(j10)) {
            x xVar = this.R;
            return xVar == null || !this.C || xVar.e(j10);
        }
        return false;
    }

    @Override // s1.z
    public boolean m0() {
        return this.R != null;
    }

    public void m1() {
        n<?, ?>[] nVarArr;
        for (n<?, ?> nVar : this.O) {
            for (; nVar != null; nVar = nVar.d()) {
                nVar.h();
            }
        }
        this.H = false;
        V1(this.D);
        s1.k u02 = this.A.u0();
        if (u02 != null) {
            u02.I0();
        }
    }

    public final float n1(long j10, long j11) {
        if (l0() < b1.l.i(j11) || g0() < b1.l.g(j11)) {
            long l12 = l1(j11);
            float i10 = b1.l.i(l12);
            float g10 = b1.l.g(l12);
            long T1 = T1(j10);
            if ((i10 > 0.0f || g10 > 0.0f) && b1.f.m(T1) <= i10 && b1.f.n(T1) <= g10) {
                return b1.f.l(T1);
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void o1(c1.w wVar) {
        jo.p.h(wVar, "canvas");
        x xVar = this.R;
        if (xVar != null) {
            xVar.a(wVar);
            return;
        }
        float j10 = m2.k.j(this.K);
        float k10 = m2.k.k(this.K);
        wVar.b(j10, k10);
        q1(wVar);
        wVar.b(-j10, -k10);
    }

    public final void p1(c1.w wVar, s0 s0Var) {
        jo.p.h(wVar, "canvas");
        jo.p.h(s0Var, "paint");
        wVar.o(new b1.h(0.5f, 0.5f, m2.o.g(j0()) - 0.5f, m2.o.f(j0()) - 0.5f), s0Var);
    }

    @Override // q1.q
    public long q(long j10) {
        if (h()) {
            q1.q d10 = q1.r.d(this);
            return z(d10, b1.f.q(o.a(this.A).s(j10), q1.r.e(d10)));
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final void q1(c1.w wVar) {
        s1.d dVar = (s1.d) s1.e.n(this.O, s1.e.f51834a.a());
        if (dVar == null) {
            a2(wVar);
        } else {
            dVar.m(wVar);
        }
    }

    public final p r1(p pVar) {
        jo.p.h(pVar, "other");
        s1.k kVar = pVar.A;
        s1.k kVar2 = this.A;
        if (kVar == kVar2) {
            p s02 = kVar2.s0();
            p pVar2 = this;
            while (pVar2 != s02 && pVar2 != pVar) {
                pVar2 = pVar2.B;
                jo.p.e(pVar2);
            }
            return pVar2 == pVar ? pVar : this;
        }
        while (kVar.Y() > kVar2.Y()) {
            kVar = kVar.u0();
            jo.p.e(kVar);
        }
        while (kVar2.Y() > kVar.Y()) {
            kVar2 = kVar2.u0();
            jo.p.e(kVar2);
        }
        while (kVar != kVar2) {
            kVar = kVar.u0();
            kVar2 = kVar2.u0();
            if (kVar != null) {
                if (kVar2 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        return kVar2 == this.A ? this : kVar == pVar.A ? pVar : kVar.c0();
    }

    public long s1(long j10) {
        long b10 = m2.l.b(j10, this.K);
        x xVar = this.R;
        return xVar != null ? xVar.b(b10, true) : b10;
    }

    public final void t1(b1.d dVar, boolean z10) {
        float j10 = m2.k.j(this.K);
        dVar.i(dVar.b() - j10);
        dVar.j(dVar.c() - j10);
        float k10 = m2.k.k(this.K);
        dVar.k(dVar.d() - k10);
        dVar.h(dVar.a() - k10);
        x xVar = this.R;
        if (xVar != null) {
            xVar.f(dVar, true);
            if (this.C && z10) {
                dVar.e(0.0f, 0.0f, m2.o.g(a()), m2.o.f(a()));
                dVar.f();
            }
        }
    }

    public final n<?, ?>[] u1() {
        return this.O;
    }

    @Override // q1.q0
    public void v0(long j10, float f10, io.l<? super i0, wn.v> lVar) {
        V1(lVar);
        if (!m2.k.i(this.K, j10)) {
            this.K = j10;
            x xVar = this.R;
            if (xVar != null) {
                xVar.h(j10);
            } else {
                p pVar = this.B;
                if (pVar != null) {
                    pVar.O1();
                }
            }
            p H1 = H1();
            if (!jo.p.c(H1 != null ? H1.A : null, this.A)) {
                this.A.T0();
            } else {
                s1.k u02 = this.A.u0();
                if (u02 != null) {
                    u02.T0();
                }
            }
            y t02 = this.A.t0();
            if (t02 != null) {
                t02.r(this.A);
            }
        }
        this.L = f10;
    }

    public final boolean v1() {
        return this.I != null;
    }

    @Override // q1.q
    public long w(long j10) {
        return o.a(this.A).j(R(j10));
    }

    public final boolean w1() {
        return this.Q;
    }

    public final x x1() {
        return this.R;
    }

    public final io.l<i0, wn.v> y1() {
        return this.D;
    }

    @Override // q1.q
    public long z(q1.q qVar, long j10) {
        jo.p.h(qVar, "sourceCoordinates");
        p pVar = (p) qVar;
        p r12 = r1(pVar);
        while (pVar != r12) {
            j10 = pVar.i2(j10);
            pVar = pVar.B;
            jo.p.e(pVar);
        }
        return i1(r12, j10);
    }

    public final s1.k z1() {
        return this.A;
    }
}
