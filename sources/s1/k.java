package s1;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.f1;
import androidx.compose.ui.platform.g2;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import q1.i0;
import q1.l0;
import q1.q0;
import q1.s0;
import q1.t0;
import s1.y;
import x0.f;

/* loaded from: classes.dex */
public final class k implements q1.b0, s0, z, q1.v, s1.a, y.b {

    /* renamed from: p0 */
    public static final f f51858p0 = new f(null);

    /* renamed from: q0 */
    public static final h f51859q0 = new c();

    /* renamed from: r0 */
    public static final io.a<k> f51860r0 = a.f51883w;

    /* renamed from: s0 */
    public static final g2 f51861s0 = new b();

    /* renamed from: t0 */
    public static final r1.f f51862t0 = r1.c.a(d.f51884w);

    /* renamed from: u0 */
    public static final e f51863u0 = new e();
    public boolean A;
    public k B;
    public y C;
    public int D;
    public g E;
    public m0.e<s> F;
    public boolean G;
    public final m0.e<k> H;
    public boolean I;
    public q1.c0 J;
    public final s1.i K;
    public m2.d L;
    public final q1.e0 M;
    public m2.q N;
    public g2 O;
    public final s1.l P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public i U;
    public i V;
    public i W;
    public boolean X;
    public final s1.p Y;
    public final w Z;

    /* renamed from: a0 */
    public float f51864a0;

    /* renamed from: b0 */
    public q1.a0 f51865b0;

    /* renamed from: c0 */
    public s1.p f51866c0;

    /* renamed from: d0 */
    public boolean f51867d0;

    /* renamed from: e0 */
    public final u f51868e0;

    /* renamed from: f0 */
    public u f51869f0;

    /* renamed from: g0 */
    public x0.f f51870g0;

    /* renamed from: h0 */
    public io.l<? super y, wn.v> f51871h0;

    /* renamed from: i0 */
    public io.l<? super y, wn.v> f51872i0;

    /* renamed from: j0 */
    public m0.e<wn.k<s1.p, i0>> f51873j0;

    /* renamed from: k0 */
    public boolean f51874k0;

    /* renamed from: l0 */
    public boolean f51875l0;

    /* renamed from: m0 */
    public boolean f51876m0;

    /* renamed from: n0 */
    public boolean f51877n0;

    /* renamed from: o0 */
    public final Comparator<k> f51878o0;

    /* renamed from: w */
    public final boolean f51879w;

    /* renamed from: x */
    public int f51880x;

    /* renamed from: y */
    public final m0.e<k> f51881y;

    /* renamed from: z */
    public m0.e<k> f51882z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<k> {

        /* renamed from: w */
        public static final a f51883w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final k invoke() {
            return new k(false, 1, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g2 {
        @Override // androidx.compose.ui.platform.g2
        public long a() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.g2
        public long b() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.g2
        public long c() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.g2
        public long d() {
            return m2.j.f40524b.b();
        }

        @Override // androidx.compose.ui.platform.g2
        public float e() {
            return 16.0f;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends h {
        public c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // q1.c0
        public /* bridge */ /* synthetic */ q1.d0 c(q1.e0 e0Var, List list, long j10) {
            return (q1.d0) n(e0Var, list, j10);
        }

        public Void n(q1.e0 e0Var, List<? extends q1.b0> list, long j10) {
            jo.p.h(e0Var, "$this$measure");
            jo.p.h(list, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a {

        /* renamed from: w */
        public static final d f51884w = new d();

        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Void invoke() {
            throw new IllegalStateException("default value for sentinel shouldn't be read".toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements r1.d {
        @Override // r1.d
        /* renamed from: a */
        public Void getValue() {
            throw new IllegalStateException("Sentinel ModifierLocal shouldn't be read".toString());
        }

        @Override // r1.d
        public r1.f getKey() {
            return k.f51862t0;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {
        public f() {
        }

        public /* synthetic */ f(jo.h hVar) {
            this();
        }

        public final io.a<k> a() {
            return k.f51860r0;
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        Measuring,
        LayingOut,
        Idle
    }

    /* loaded from: classes.dex */
    public static abstract class h implements q1.c0 {

        /* renamed from: a */
        public final String f51885a;

        public h(String str) {
            jo.p.h(str, MRLog.PAYLOAD_KEY_ERROR);
            this.f51885a = str;
        }

        @Override // q1.c0
        public /* bridge */ /* synthetic */ int a(q1.m mVar, List list, int i10) {
            return ((Number) j(mVar, list, i10)).intValue();
        }

        @Override // q1.c0
        public /* bridge */ /* synthetic */ int d(q1.m mVar, List list, int i10) {
            return ((Number) k(mVar, list, i10)).intValue();
        }

        @Override // q1.c0
        public /* bridge */ /* synthetic */ int e(q1.m mVar, List list, int i10) {
            return ((Number) l(mVar, list, i10)).intValue();
        }

        @Override // q1.c0
        public /* bridge */ /* synthetic */ int g(q1.m mVar, List list, int i10) {
            return ((Number) m(mVar, list, i10)).intValue();
        }

        public Void j(q1.m mVar, List<? extends q1.l> list, int i10) {
            jo.p.h(mVar, "<this>");
            jo.p.h(list, "measurables");
            throw new IllegalStateException(this.f51885a.toString());
        }

        public Void k(q1.m mVar, List<? extends q1.l> list, int i10) {
            jo.p.h(mVar, "<this>");
            jo.p.h(list, "measurables");
            throw new IllegalStateException(this.f51885a.toString());
        }

        public Void l(q1.m mVar, List<? extends q1.l> list, int i10) {
            jo.p.h(mVar, "<this>");
            jo.p.h(list, "measurables");
            throw new IllegalStateException(this.f51885a.toString());
        }

        public Void m(q1.m mVar, List<? extends q1.l> list, int i10) {
            jo.p.h(mVar, "<this>");
            jo.p.h(list, "measurables");
            throw new IllegalStateException(this.f51885a.toString());
        }
    }

    /* loaded from: classes.dex */
    public enum i {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class j {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51886a;

        static {
            int[] iArr = new int[g.values().length];
            iArr[g.Idle.ordinal()] = 1;
            f51886a = iArr;
        }
    }

    /* renamed from: s1.k$k */
    /* loaded from: classes.dex */
    public static final class C0791k extends jo.q implements io.p<f.b, Boolean, Boolean> {

        /* renamed from: w */
        public final /* synthetic */ m0.e<wn.k<s1.p, i0>> f51887w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0791k(m0.e<wn.k<s1.p, i0>> eVar) {
            super(2);
            this.f51887w = eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x0033, code lost:
            if (r1 == null) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean a(x0.f.b r7, boolean r8) {
            /*
                r6 = this;
                java.lang.String r0 = "mod"
                jo.p.h(r7, r0)
                r0 = 0
                if (r8 != 0) goto L35
                boolean r8 = r7 instanceof q1.i0
                if (r8 == 0) goto L36
                m0.e<wn.k<s1.p, q1.i0>> r8 = r6.f51887w
                r1 = 0
                if (r8 == 0) goto L33
                int r2 = r8.p()
                if (r2 <= 0) goto L31
                java.lang.Object[] r8 = r8.n()
                r3 = r0
            L1c:
                r4 = r8[r3]
                r5 = r4
                wn.k r5 = (wn.k) r5
                java.lang.Object r5 = r5.d()
                boolean r5 = jo.p.c(r7, r5)
                if (r5 == 0) goto L2d
                r1 = r4
                goto L31
            L2d:
                int r3 = r3 + 1
                if (r3 < r2) goto L1c
            L31:
                wn.k r1 = (wn.k) r1
            L33:
                if (r1 != 0) goto L36
            L35:
                r0 = 1
            L36:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: s1.k.C0791k.a(x0.f$b, boolean):java.lang.Boolean");
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Boolean invoke(f.b bVar, Boolean bool) {
            return a(bVar, bool.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.a<wn.v> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l() {
            super(0);
            k.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x008f A[ORIG_RETURN, RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r8 = this;
                s1.k r0 = s1.k.this
                r1 = 0
                s1.k.A(r0, r1)
                s1.k r0 = s1.k.this
                m0.e r0 = r0.A0()
                int r2 = r0.p()
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r2 <= 0) goto L40
                java.lang.Object[] r0 = r0.n()
                r4 = r1
            L1a:
                r5 = r0[r4]
                s1.k r5 = (s1.k) r5
                int r6 = r5.v0()
                s1.k.C(r5, r6)
                s1.k.B(r5, r3)
                s1.l r6 = r5.U()
                r6.r(r1)
                s1.k$i r6 = r5.l0()
                s1.k$i r7 = s1.k.i.InLayoutBlock
                if (r6 != r7) goto L3c
                s1.k$i r6 = s1.k.i.NotUsed
                r5.r1(r6)
            L3c:
                int r4 = r4 + 1
                if (r4 < r2) goto L1a
            L40:
                s1.k r0 = s1.k.this
                s1.p r0 = r0.c0()
                q1.d0 r0 = r0.A1()
                r0.c()
                s1.k r0 = s1.k.this
                m0.e r0 = r0.A0()
                s1.k r2 = s1.k.this
                int r4 = r0.p()
                if (r4 <= 0) goto L8f
                java.lang.Object[] r0 = r0.n()
            L5f:
                r5 = r0[r1]
                s1.k r5 = (s1.k) r5
                int r6 = s1.k.t(r5)
                int r7 = r5.v0()
                if (r6 == r7) goto L7c
                s1.k.x(r2)
                r2.I0()
                int r6 = r5.v0()
                if (r6 != r3) goto L7c
                s1.k.w(r5)
            L7c:
                s1.l r6 = r5.U()
                s1.l r5 = r5.U()
                boolean r5 = r5.h()
                r6.o(r5)
                int r1 = r1 + 1
                if (r1 < r4) goto L5f
            L8f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s1.k.l.a():void");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.p<wn.v, f.b, wn.v> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m() {
            super(2);
            k.this = r1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object[]] */
        public final void a(wn.v vVar, f.b bVar) {
            s sVar;
            jo.p.h(vVar, "<anonymous parameter 0>");
            jo.p.h(bVar, "mod");
            m0.e eVar = k.this.F;
            int p10 = eVar.p();
            if (p10 > 0) {
                int i10 = p10 - 1;
                ?? n10 = eVar.n();
                do {
                    sVar = n10[i10];
                    s sVar2 = (s) sVar;
                    if (sVar2.m2() == bVar && !sVar2.n2()) {
                        break;
                    }
                    i10--;
                } while (i10 >= 0);
                sVar = null;
            } else {
                sVar = null;
            }
            s sVar3 = sVar;
            if (sVar3 == null) {
                return;
            }
            sVar3.q2(true);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(wn.v vVar, f.b bVar) {
            a(vVar, bVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class n implements q1.e0, m2.d {
        public n() {
            k.this = r1;
        }

        @Override // m2.d
        public float G0() {
            return k.this.X().G0();
        }

        @Override // m2.d
        public float getDensity() {
            return k.this.X().getDensity();
        }

        @Override // q1.m
        public m2.q getLayoutDirection() {
            return k.this.getLayoutDirection();
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.p<f.b, s1.p, s1.p> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o() {
            super(2);
            k.this = r1;
        }

        @Override // io.p
        /* renamed from: a */
        public final s1.p invoke(f.b bVar, s1.p pVar) {
            jo.p.h(bVar, "mod");
            jo.p.h(pVar, "toWrap");
            if (bVar instanceof t0) {
                ((t0) bVar).p0(k.this);
            }
            s1.e.i(pVar.u1(), pVar, bVar);
            if (bVar instanceof i0) {
                k.this.r0().c(wn.q.a(pVar, bVar));
            }
            if (bVar instanceof q1.x) {
                q1.x xVar = (q1.x) bVar;
                s n12 = k.this.n1(pVar, xVar);
                if (n12 == null) {
                    n12 = new s(pVar, xVar);
                }
                pVar = n12;
                pVar.U1();
            }
            s1.e.h(pVar.u1(), pVar, bVar);
            return pVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.a<wn.v> {

        /* renamed from: x */
        public final /* synthetic */ long f51893x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(long j10) {
            super(0);
            k.this = r1;
            this.f51893x = j10;
        }

        public final void a() {
            k.this.s0().M(this.f51893x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends jo.q implements io.p<u, f.b, u> {

        /* renamed from: x */
        public final /* synthetic */ m0.e<t> f51895x;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<c1, wn.v> {

            /* renamed from: w */
            public final /* synthetic */ a1.o f51896w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a1.o oVar) {
                super(1);
                this.f51896w = oVar;
            }

            public final void a(c1 c1Var) {
                jo.p.h(c1Var, "$this$null");
                c1Var.b("focusProperties");
                c1Var.a().b("scope", this.f51896w);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
                a(c1Var);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(m0.e<t> eVar) {
            super(2);
            k.this = r1;
            this.f51895x = eVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final u invoke(u uVar, f.b bVar) {
            jo.p.h(uVar, "lastProvider");
            jo.p.h(bVar, "mod");
            if (bVar instanceof a1.m) {
                a1.m mVar = (a1.m) bVar;
                a1.s T = k.this.T(mVar, this.f51895x);
                if (T == null) {
                    a1.o oVar = new a1.o(mVar);
                    T = new a1.s(oVar, a1.c() ? new a(oVar) : a1.a());
                }
                k.this.D(T, uVar, this.f51895x);
                uVar = k.this.F(T, uVar);
            }
            if (bVar instanceof r1.b) {
                k.this.D((r1.b) bVar, uVar, this.f51895x);
            }
            return bVar instanceof r1.d ? k.this.F((r1.d) bVar, uVar) : uVar;
        }
    }

    public k() {
        this(false, 1, null);
    }

    public k(boolean z10) {
        this.f51879w = z10;
        this.f51881y = new m0.e<>(new k[16], 0);
        this.E = g.Idle;
        this.F = new m0.e<>(new s[16], 0);
        this.H = new m0.e<>(new k[16], 0);
        this.I = true;
        this.J = f51859q0;
        this.K = new s1.i(this);
        this.L = m2.f.b(1.0f, 0.0f, 2, null);
        this.M = new n();
        this.N = m2.q.Ltr;
        this.O = f51861s0;
        this.P = new s1.l(this);
        this.R = Integer.MAX_VALUE;
        this.S = Integer.MAX_VALUE;
        i iVar = i.NotUsed;
        this.U = iVar;
        this.V = iVar;
        this.W = iVar;
        s1.h hVar = new s1.h(this);
        this.Y = hVar;
        this.Z = new w(this, hVar);
        this.f51867d0 = true;
        u uVar = new u(this, f51863u0);
        this.f51868e0 = uVar;
        this.f51869f0 = uVar;
        this.f51870g0 = x0.f.f59359u;
        this.f51878o0 = s1.j.f51857w;
    }

    public static /* synthetic */ void E0(k kVar, long j10, s1.f fVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        kVar.D0(j10, fVar, z12, z11);
    }

    public static /* synthetic */ String P(k kVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return kVar.O(i10);
    }

    public static /* synthetic */ boolean d1(k kVar, m2.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = kVar.Z.T0();
        }
        return kVar.c1(bVar);
    }

    public static /* synthetic */ void i1(k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        kVar.h1(z10);
    }

    public static /* synthetic */ void k1(k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        kVar.j1(z10);
    }

    public static final int m(k kVar, k kVar2) {
        float f10 = kVar.f51864a0;
        float f11 = kVar2.f51864a0;
        if (f10 == f11) {
            return jo.p.j(kVar.R, kVar2.R);
        }
        return Float.compare(f10, f11);
    }

    public final m0.e<k> A0() {
        if (this.f51880x == 0) {
            return this.f51881y;
        }
        b1();
        m0.e<k> eVar = this.f51882z;
        jo.p.e(eVar);
        return eVar;
    }

    public final void B0(q1.d0 d0Var) {
        jo.p.h(d0Var, "measureResult");
        this.Y.d2(d0Var);
    }

    public final boolean C0() {
        return ((Boolean) n0().o(Boolean.FALSE, new C0791k(this.f51873j0))).booleanValue();
    }

    public final void D(r1.b bVar, u uVar, m0.e<t> eVar) {
        int i10;
        t y10;
        int p10 = eVar.p();
        if (p10 > 0) {
            t[] n10 = eVar.n();
            i10 = 0;
            do {
                if (n10[i10].e() == bVar) {
                    break;
                }
                i10++;
            } while (i10 < p10);
            i10 = -1;
        } else {
            i10 = -1;
        }
        if (i10 < 0) {
            y10 = new t(uVar, bVar);
        } else {
            y10 = eVar.y(i10);
            y10.j(uVar);
        }
        uVar.e().c(y10);
    }

    public final void D0(long j10, s1.f<n1.c0> fVar, boolean z10, boolean z11) {
        jo.p.h(fVar, "hitTestResult");
        s0().M1(s1.p.S.a(), s0().s1(j10), fVar, z10, z11);
    }

    @Override // q1.l
    public int E(int i10) {
        return this.Z.E(i10);
    }

    public final u F(r1.d<?> dVar, u uVar) {
        u h10 = uVar.h();
        while (h10 != null && h10.g() != dVar) {
            h10 = h10.h();
        }
        if (h10 == null) {
            h10 = new u(this, dVar);
        } else {
            u i10 = h10.i();
            if (i10 != null) {
                i10.l(h10.h());
            }
            u h11 = h10.h();
            if (h11 != null) {
                h11.m(h10.i());
            }
        }
        h10.l(uVar.h());
        u h12 = uVar.h();
        if (h12 != null) {
            h12.m(h10);
        }
        uVar.l(h10);
        h10.m(uVar);
        return h10;
    }

    public final void F0(long j10, s1.f<w1.m> fVar, boolean z10, boolean z11) {
        jo.p.h(fVar, "hitSemanticsEntities");
        s0().M1(s1.p.S.b(), s0().s1(j10), fVar, true, z11);
    }

    @Override // q1.l
    public int G(int i10) {
        return this.Z.G(i10);
    }

    public final void H() {
        if (this.E == g.Measuring) {
            this.P.q(true);
            if (this.P.a()) {
                N0();
                return;
            }
            return;
        }
        this.P.p(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H0(int r7, s1.k r8) {
        /*
            r6 = this;
            java.lang.String r0 = "instance"
            jo.p.h(r8, r0)
            s1.k r0 = r8.B
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Ld
            r0 = r2
            goto Le
        Ld:
            r0 = r1
        Le:
            java.lang.String r3 = " Other tree: "
            java.lang.String r4 = "Cannot insert "
            r5 = 0
            if (r0 != 0) goto L48
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r8)
            java.lang.String r0 = " because it already has a parent. This tree: "
            r7.append(r0)
            java.lang.String r0 = P(r6, r1, r2, r5)
            r7.append(r0)
            r7.append(r3)
            s1.k r8 = r8.B
            if (r8 == 0) goto L37
            java.lang.String r5 = P(r8, r1, r2, r5)
        L37:
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L48:
            s1.y r0 = r8.C
            if (r0 != 0) goto L4e
            r0 = r2
            goto L4f
        L4e:
            r0 = r1
        L4f:
            if (r0 == 0) goto Lb5
            r8.B = r6
            m0.e<s1.k> r0 = r6.f51881y
            r0.a(r7, r8)
            r6.Y0()
            boolean r7 = r8.f51879w
            if (r7 == 0) goto L76
            boolean r7 = r6.f51879w
            r7 = r7 ^ r2
            if (r7 == 0) goto L6a
            int r7 = r6.f51880x
            int r7 = r7 + r2
            r6.f51880x = r7
            goto L76
        L6a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Virtual LayoutNode can't be added into a virtual parent"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L76:
            r6.K0()
            s1.p r7 = r8.s0()
            boolean r0 = r6.f51879w
            if (r0 == 0) goto L88
            s1.k r0 = r6.B
            if (r0 == 0) goto L8a
            s1.p r5 = r0.Y
            goto L8a
        L88:
            s1.p r5 = r6.Y
        L8a:
            r7.f2(r5)
            boolean r7 = r8.f51879w
            if (r7 == 0) goto Lad
            m0.e<s1.k> r7 = r8.f51881y
            int r0 = r7.p()
            if (r0 <= 0) goto Lad
            java.lang.Object[] r7 = r7.n()
        L9d:
            r3 = r7[r1]
            s1.k r3 = (s1.k) r3
            s1.p r3 = r3.s0()
            s1.p r4 = r6.Y
            r3.f2(r4)
            int r1 = r1 + r2
            if (r1 < r0) goto L9d
        Lad:
            s1.y r7 = r6.C
            if (r7 == 0) goto Lb4
            r8.I(r7)
        Lb4:
            return
        Lb5:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r8)
            java.lang.String r0 = " because it already has an owner. This tree: "
            r7.append(r0)
            java.lang.String r0 = P(r6, r1, r2, r5)
            r7.append(r0)
            r7.append(r3)
            java.lang.String r8 = P(r8, r1, r2, r5)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.k.H0(int, s1.k):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00cc A[LOOP:2: B:117:0x00ca->B:118:0x00cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(s1.y r9) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.k.I(s1.y):void");
    }

    public final void I0() {
        s1.p b02 = b0();
        if (b02 != null) {
            b02.O1();
            return;
        }
        k u02 = u0();
        if (u02 != null) {
            u02.I0();
        }
    }

    public final Map<q1.a, Integer> J() {
        if (!this.Z.S0()) {
            H();
        }
        M0();
        return this.P.b();
    }

    public final void J0() {
        s1.p s02 = s0();
        s1.p pVar = this.Y;
        while (!jo.p.c(s02, pVar)) {
            s sVar = (s) s02;
            x x12 = sVar.x1();
            if (x12 != null) {
                x12.invalidate();
            }
            s02 = sVar.H1();
        }
        x x13 = this.Y.x1();
        if (x13 != null) {
            x13.invalidate();
        }
    }

    public final void K() {
        this.W = this.V;
        this.V = i.NotUsed;
        m0.e<k> A0 = A0();
        int p10 = A0.p();
        if (p10 > 0) {
            int i10 = 0;
            k[] n10 = A0.n();
            do {
                k kVar = n10[i10];
                if (kVar.V != i.NotUsed) {
                    kVar.K();
                }
                i10++;
            } while (i10 < p10);
        }
    }

    public final void K0() {
        k u02;
        if (this.f51880x > 0) {
            this.A = true;
        }
        if (!this.f51879w || (u02 = u0()) == null) {
            return;
        }
        u02.A = true;
    }

    public final void L() {
        this.W = this.V;
        this.V = i.NotUsed;
        m0.e<k> A0 = A0();
        int p10 = A0.p();
        if (p10 > 0) {
            int i10 = 0;
            k[] n10 = A0.n();
            do {
                k kVar = n10[i10];
                if (kVar.V == i.InLayoutBlock) {
                    kVar.L();
                }
                i10++;
            } while (i10 < p10);
        }
    }

    public boolean L0() {
        return this.C != null;
    }

    @Override // q1.b0
    public q0 M(long j10) {
        if (this.V == i.NotUsed) {
            K();
        }
        return this.Z.M(j10);
    }

    public final void M0() {
        this.P.l();
        if (this.f51877n0) {
            U0();
        }
        if (this.f51877n0) {
            this.f51877n0 = false;
            this.E = g.LayingOut;
            s1.o.a(this).getSnapshotObserver().c(this, new l());
            this.E = g.Idle;
        }
        if (this.P.h()) {
            this.P.o(true);
        }
        if (this.P.a() && this.P.e()) {
            this.P.j();
        }
    }

    public final void N() {
        s1.p s02 = s0();
        s1.p pVar = this.Y;
        while (!jo.p.c(s02, pVar)) {
            s sVar = (s) s02;
            this.F.c(sVar);
            s02 = sVar.H1();
        }
    }

    public final void N0() {
        this.f51877n0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String O(int r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r8) goto L11
            java.lang.String r3 = "  "
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L11:
            java.lang.String r2 = "|-"
            r0.append(r2)
            java.lang.String r2 = r7.toString()
            r0.append(r2)
            r2 = 10
            r0.append(r2)
            m0.e r2 = r7.A0()
            int r3 = r2.p()
            if (r3 <= 0) goto L42
            java.lang.Object[] r2 = r2.n()
            r4 = r1
        L31:
            r5 = r2[r4]
            s1.k r5 = (s1.k) r5
            int r6 = r8 + 1
            java.lang.String r5 = r5.O(r6)
            r0.append(r5)
            int r4 = r4 + 1
            if (r4 < r3) goto L31
        L42:
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "tree.toString()"
            jo.p.g(r0, r2)
            if (r8 != 0) goto L5c
            int r8 = r0.length()
            int r8 = r8 + (-1)
            java.lang.String r0 = r0.substring(r1, r8)
            java.lang.String r8 = "this as java.lang.String…ing(startIndex, endIndex)"
            jo.p.g(r0, r8)
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.k.O(int):java.lang.String");
    }

    public final void O0() {
        this.f51876m0 = true;
    }

    public final void P0() {
        this.Q = true;
        s1.p H1 = this.Y.H1();
        for (s1.p s02 = s0(); !jo.p.c(s02, H1) && s02 != null; s02 = s02.H1()) {
            if (s02.w1()) {
                s02.O1();
            }
        }
        m0.e<k> A0 = A0();
        int p10 = A0.p();
        if (p10 > 0) {
            int i10 = 0;
            k[] n10 = A0.n();
            do {
                k kVar = n10[i10];
                if (kVar.R != Integer.MAX_VALUE) {
                    kVar.P0();
                    l1(kVar);
                }
                i10++;
            } while (i10 < p10);
        }
    }

    public final void Q() {
        y yVar = this.C;
        if (yVar == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            k u02 = u0();
            sb2.append(u02 != null ? P(u02, 0, 1, null) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        k u03 = u0();
        if (u03 != null) {
            u03.I0();
            k1(u03, false, 1, null);
        }
        this.P.m();
        io.l<? super y, wn.v> lVar = this.f51872i0;
        if (lVar != null) {
            lVar.invoke(yVar);
        }
        for (u uVar = this.f51868e0; uVar != null; uVar = uVar.h()) {
            uVar.c();
        }
        s1.p H1 = this.Y.H1();
        for (s1.p s02 = s0(); !jo.p.c(s02, H1) && s02 != null; s02 = s02.H1()) {
            s02.m1();
        }
        if (w1.r.j(this) != null) {
            yVar.w();
        }
        yVar.n(this);
        this.C = null;
        this.D = 0;
        m0.e<k> eVar = this.f51881y;
        int p10 = eVar.p();
        if (p10 > 0) {
            k[] n10 = eVar.n();
            int i10 = 0;
            do {
                n10[i10].Q();
                i10++;
            } while (i10 < p10);
            this.R = Integer.MAX_VALUE;
            this.S = Integer.MAX_VALUE;
            this.Q = false;
        }
        this.R = Integer.MAX_VALUE;
        this.S = Integer.MAX_VALUE;
        this.Q = false;
    }

    public final void Q0(x0.f fVar) {
        m0.e<s> eVar = this.F;
        int p10 = eVar.p();
        if (p10 > 0) {
            s[] n10 = eVar.n();
            int i10 = 0;
            do {
                n10[i10].q2(false);
                i10++;
            } while (i10 < p10);
            fVar.k(wn.v.f59242a, new m());
        }
        fVar.k(wn.v.f59242a, new m());
    }

    public final void R() {
        m0.e<wn.k<s1.p, i0>> eVar;
        int p10;
        if (this.E != g.Idle || this.f51877n0 || this.f51876m0 || !g() || (eVar = this.f51873j0) == null || (p10 = eVar.p()) <= 0) {
            return;
        }
        int i10 = 0;
        wn.k<s1.p, i0>[] n10 = eVar.n();
        do {
            wn.k<s1.p, i0> kVar = n10[i10];
            kVar.d().a0(kVar.c());
            i10++;
        } while (i10 < p10);
    }

    public final void R0() {
        if (g()) {
            int i10 = 0;
            this.Q = false;
            m0.e<k> A0 = A0();
            int p10 = A0.p();
            if (p10 > 0) {
                k[] n10 = A0.n();
                do {
                    n10[i10].R0();
                    i10++;
                } while (i10 < p10);
            }
        }
    }

    public final void S(c1.w wVar) {
        jo.p.h(wVar, "canvas");
        s0().o1(wVar);
    }

    public final void S0(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            this.f51881y.a(i10 > i11 ? i11 + i13 : (i11 + i12) - 2, this.f51881y.y(i10 > i11 ? i10 + i13 : i10));
        }
        Y0();
        K0();
        k1(this, false, 1, null);
    }

    public final a1.s T(a1.m mVar, m0.e<t> eVar) {
        t tVar;
        int p10 = eVar.p();
        if (p10 > 0) {
            t[] n10 = eVar.n();
            int i10 = 0;
            do {
                tVar = n10[i10];
                t tVar2 = tVar;
                if ((tVar2.e() instanceof a1.s) && (((a1.s) tVar2.e()).c() instanceof a1.o) && ((a1.o) ((a1.s) tVar2.e()).c()).a() == mVar) {
                    break;
                }
                i10++;
            } while (i10 < p10);
            tVar = null;
        } else {
            tVar = null;
        }
        t tVar3 = tVar;
        r1.b e10 = tVar3 != null ? tVar3.e() : null;
        if (e10 instanceof a1.s) {
            return (a1.s) e10;
        }
        return null;
    }

    public final void T0() {
        if (this.P.a()) {
            return;
        }
        this.P.n(true);
        k u02 = u0();
        if (u02 == null) {
            return;
        }
        if (this.P.i()) {
            k1(u02, false, 1, null);
        } else if (this.P.c()) {
            i1(u02, false, 1, null);
        }
        if (this.P.g()) {
            k1(this, false, 1, null);
        }
        if (this.P.f()) {
            i1(u02, false, 1, null);
        }
        u02.T0();
    }

    public final s1.l U() {
        return this.P;
    }

    public final void U0() {
        m0.e<k> A0 = A0();
        int p10 = A0.p();
        if (p10 > 0) {
            k[] n10 = A0.n();
            int i10 = 0;
            do {
                k kVar = n10[i10];
                if (kVar.f51876m0 && kVar.U == i.InMeasureBlock && d1(kVar, null, 1, null)) {
                    k1(this, false, 1, null);
                }
                i10++;
            } while (i10 < p10);
        }
    }

    public final boolean V() {
        return this.X;
    }

    public final void V0(k kVar) {
        if (this.C != null) {
            kVar.Q();
        }
        kVar.B = null;
        kVar.s0().f2(null);
        if (kVar.f51879w) {
            this.f51880x--;
            m0.e<k> eVar = kVar.f51881y;
            int p10 = eVar.p();
            if (p10 > 0) {
                int i10 = 0;
                k[] n10 = eVar.n();
                do {
                    n10[i10].s0().f2(null);
                    i10++;
                } while (i10 < p10);
            }
        }
        K0();
        Y0();
    }

    public final List<k> W() {
        return A0().g();
    }

    public final void W0() {
        k1(this, false, 1, null);
        k u02 = u0();
        if (u02 != null) {
            u02.I0();
        }
        J0();
    }

    public m2.d X() {
        return this.L;
    }

    public final void X0() {
        k u02 = u0();
        float J1 = this.Y.J1();
        s1.p s02 = s0();
        s1.p pVar = this.Y;
        while (!jo.p.c(s02, pVar)) {
            s sVar = (s) s02;
            J1 += sVar.J1();
            s02 = sVar.H1();
        }
        if (!(J1 == this.f51864a0)) {
            this.f51864a0 = J1;
            if (u02 != null) {
                u02.Y0();
            }
            if (u02 != null) {
                u02.I0();
            }
        }
        if (!g()) {
            if (u02 != null) {
                u02.I0();
            }
            P0();
        }
        if (u02 != null) {
            if (!this.f51875l0 && u02.E == g.LayingOut) {
                if (this.R == Integer.MAX_VALUE) {
                    int i10 = u02.T;
                    this.R = i10;
                    u02.T = i10 + 1;
                } else {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
            }
        } else {
            this.R = 0;
        }
        M0();
    }

    public final int Y() {
        return this.D;
    }

    public final void Y0() {
        if (this.f51879w) {
            k u02 = u0();
            if (u02 != null) {
                u02.Y0();
                return;
            }
            return;
        }
        this.I = true;
    }

    public final List<k> Z() {
        return this.f51881y.g();
    }

    public final void Z0(long j10) {
        g gVar = g.Measuring;
        this.E = gVar;
        this.f51876m0 = false;
        s1.o.a(this).getSnapshotObserver().d(this, new p(j10));
        if (this.E == gVar) {
            N0();
            this.E = g.Idle;
        }
    }

    @Override // s1.a
    public void a(q1.c0 c0Var) {
        jo.p.h(c0Var, "value");
        if (jo.p.c(this.J, c0Var)) {
            return;
        }
        this.J = c0Var;
        this.K.f(j0());
        k1(this, false, 1, null);
    }

    public int a0() {
        return this.Z.f0();
    }

    public final void a1(int i10, int i11) {
        int h10;
        m2.q g10;
        if (this.V == i.NotUsed) {
            L();
        }
        q0.a.C0733a c0733a = q0.a.f48598a;
        int l02 = this.Z.l0();
        m2.q layoutDirection = getLayoutDirection();
        h10 = c0733a.h();
        g10 = c0733a.g();
        q0.a.f48600c = l02;
        q0.a.f48599b = layoutDirection;
        q0.a.n(c0733a, this.Z, i10, i11, 0.0f, 4, null);
        q0.a.f48600c = h10;
        q0.a.f48599b = g10;
    }

    @Override // q1.s0
    public void b() {
        k1(this, false, 1, null);
        m2.b T0 = this.Z.T0();
        if (T0 != null) {
            y yVar = this.C;
            if (yVar != null) {
                yVar.q(this, T0.t());
                return;
            }
            return;
        }
        y yVar2 = this.C;
        if (yVar2 != null) {
            y.u(yVar2, false, 1, null);
        }
    }

    public final s1.p b0() {
        if (this.f51867d0) {
            s1.p pVar = this.Y;
            s1.p I1 = s0().I1();
            this.f51866c0 = null;
            while (true) {
                if (jo.p.c(pVar, I1)) {
                    break;
                }
                if ((pVar != null ? pVar.x1() : null) != null) {
                    this.f51866c0 = pVar;
                    break;
                }
                pVar = pVar != null ? pVar.I1() : null;
            }
        }
        s1.p pVar2 = this.f51866c0;
        if (pVar2 == null || pVar2.x1() != null) {
            return pVar2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void b1() {
        if (this.A) {
            int i10 = 0;
            this.A = false;
            m0.e<k> eVar = this.f51882z;
            if (eVar == null) {
                m0.e<k> eVar2 = new m0.e<>(new k[16], 0);
                this.f51882z = eVar2;
                eVar = eVar2;
            }
            eVar.h();
            m0.e<k> eVar3 = this.f51881y;
            int p10 = eVar3.p();
            if (p10 > 0) {
                k[] n10 = eVar3.n();
                do {
                    k kVar = n10[i10];
                    if (kVar.f51879w) {
                        eVar.e(eVar.p(), kVar.A0());
                    } else {
                        eVar.c(kVar);
                    }
                    i10++;
                } while (i10 < p10);
            }
        }
    }

    @Override // s1.a
    public void c(g2 g2Var) {
        jo.p.h(g2Var, "<set-?>");
        this.O = g2Var;
    }

    public final s1.p c0() {
        return this.Y;
    }

    public final boolean c1(m2.b bVar) {
        if (bVar != null) {
            if (this.V == i.NotUsed) {
                K();
            }
            return this.Z.f1(bVar.t());
        }
        return false;
    }

    @Override // q1.l
    public Object d() {
        return this.Z.d();
    }

    public final s1.i d0() {
        return this.K;
    }

    @Override // q1.l
    public int e(int i10) {
        return this.Z.e(i10);
    }

    public final i e0() {
        return this.V;
    }

    public final void e1() {
        int p10 = this.f51881y.p();
        while (true) {
            p10--;
            if (-1 < p10) {
                V0(this.f51881y.n()[p10]);
            } else {
                this.f51881y.h();
                return;
            }
        }
    }

    @Override // s1.a
    public void f(m2.d dVar) {
        jo.p.h(dVar, "value");
        if (jo.p.c(this.L, dVar)) {
            return;
        }
        this.L = dVar;
        W0();
    }

    public final boolean f0() {
        return this.f51877n0;
    }

    public final void f1(int i10, int i11) {
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("count (" + i11 + ") must be greater than 0").toString());
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            V0(this.f51881y.y(i12));
            if (i12 == i10) {
                return;
            }
            i12--;
        }
    }

    @Override // q1.v
    public boolean g() {
        return this.Q;
    }

    public final g g0() {
        return this.E;
    }

    public final void g1() {
        if (this.V == i.NotUsed) {
            L();
        }
        try {
            this.f51875l0 = true;
            this.Z.g1();
        } finally {
            this.f51875l0 = false;
        }
    }

    @Override // q1.v
    public m2.q getLayoutDirection() {
        return this.N;
    }

    @Override // s1.a
    public void h(m2.q qVar) {
        jo.p.h(qVar, "value");
        if (this.N != qVar) {
            this.N = qVar;
            W0();
        }
    }

    public final s1.m h0() {
        return s1.o.a(this).getSharedDrawScope();
    }

    public final void h1(boolean z10) {
        y yVar;
        if (this.f51879w || (yVar = this.C) == null) {
            return;
        }
        yVar.e(this, z10);
    }

    @Override // s1.y.b
    public void i() {
        for (s1.n<?, ?> nVar = this.Y.u1()[s1.e.f51834a.b()]; nVar != null; nVar = nVar.d()) {
            ((l0) ((e0) nVar).c()).T(this.Y);
        }
    }

    public final boolean i0() {
        return this.f51876m0;
    }

    @Override // q1.v
    public q1.q j() {
        return this.Y;
    }

    public q1.c0 j0() {
        return this.J;
    }

    public final void j1(boolean z10) {
        y yVar;
        if (this.G || this.f51879w || (yVar = this.C) == null) {
            return;
        }
        yVar.m(this, z10);
        this.Z.Y0(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00e2  */
    @Override // s1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(x0.f r13) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.k.k(x0.f):void");
    }

    public final q1.e0 k0() {
        return this.M;
    }

    public final i l0() {
        return this.U;
    }

    public final void l1(k kVar) {
        if (j.f51886a[kVar.E.ordinal()] == 1) {
            if (kVar.f51876m0) {
                kVar.j1(true);
                return;
            } else if (kVar.f51877n0) {
                kVar.h1(true);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException("Unexpected state " + kVar.E);
    }

    @Override // s1.z
    public boolean m0() {
        return L0();
    }

    public final void m1() {
        m0.e<k> A0 = A0();
        int p10 = A0.p();
        if (p10 > 0) {
            int i10 = 0;
            k[] n10 = A0.n();
            do {
                k kVar = n10[i10];
                i iVar = kVar.W;
                kVar.V = iVar;
                if (iVar != i.NotUsed) {
                    kVar.m1();
                }
                i10++;
            } while (i10 < p10);
        }
    }

    public x0.f n0() {
        return this.f51870g0;
    }

    public final s n1(s1.p pVar, q1.x xVar) {
        int i10;
        if (this.F.r()) {
            return null;
        }
        m0.e<s> eVar = this.F;
        int p10 = eVar.p();
        int i11 = -1;
        if (p10 > 0) {
            i10 = p10 - 1;
            s[] n10 = eVar.n();
            do {
                s sVar = n10[i10];
                if (sVar.n2() && sVar.m2() == xVar) {
                    break;
                }
                i10--;
            } while (i10 >= 0);
            i10 = -1;
        } else {
            i10 = -1;
        }
        if (i10 < 0) {
            m0.e<s> eVar2 = this.F;
            int p11 = eVar2.p();
            if (p11 > 0) {
                int i12 = p11 - 1;
                s[] n11 = eVar2.n();
                while (true) {
                    if (!(!n11[i12].n2())) {
                        i12--;
                        if (i12 < 0) {
                            break;
                        }
                    } else {
                        i11 = i12;
                        break;
                    }
                }
            }
            i10 = i11;
        }
        if (i10 < 0) {
            return null;
        }
        s y10 = this.F.y(i10);
        y10.p2(xVar);
        y10.r2(pVar);
        return y10;
    }

    public final u o0() {
        return this.f51868e0;
    }

    public final void o1(boolean z10) {
        this.X = z10;
    }

    public final u p0() {
        return this.f51869f0;
    }

    public final void p1(boolean z10) {
        this.f51867d0 = z10;
    }

    public final boolean q0() {
        return this.f51874k0;
    }

    public final void q1(i iVar) {
        jo.p.h(iVar, "<set-?>");
        this.V = iVar;
    }

    public final m0.e<wn.k<s1.p, i0>> r0() {
        m0.e<wn.k<s1.p, i0>> eVar = this.f51873j0;
        if (eVar == null) {
            m0.e<wn.k<s1.p, i0>> eVar2 = new m0.e<>(new wn.k[16], 0);
            this.f51873j0 = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public final void r1(i iVar) {
        jo.p.h(iVar, "<set-?>");
        this.U = iVar;
    }

    public final s1.p s0() {
        return this.Z.X0();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x005b A[LOOP:2: B:36:0x0059->B:37:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067 A[LOOP:3: B:39:0x0065->B:40:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s1(x0.f r6) {
        /*
            r5 = this;
            m0.e r0 = new m0.e
            r1 = 16
            s1.t[] r1 = new s1.t[r1]
            r2 = 0
            r0.<init>(r1, r2)
            s1.u r1 = r5.f51868e0
        Lc:
            if (r1 == 0) goto L25
            m0.e r3 = r1.e()
            int r4 = r0.p()
            r0.e(r4, r3)
            m0.e r3 = r1.e()
            r3.h()
            s1.u r1 = r1.h()
            goto Lc
        L25:
            s1.u r1 = r5.f51868e0
            s1.k$q r3 = new s1.k$q
            r3.<init>(r0)
            java.lang.Object r6 = r6.k(r1, r3)
            s1.u r6 = (s1.u) r6
            r5.f51869f0 = r6
            s1.u r6 = r6.h()
            s1.u r1 = r5.f51869f0
            r3 = 0
            r1.l(r3)
            boolean r1 = r5.L0()
            if (r1 == 0) goto L6f
            int r1 = r0.p()
            if (r1 <= 0) goto L59
            java.lang.Object[] r0 = r0.n()
        L4e:
            r3 = r0[r2]
            s1.t r3 = (s1.t) r3
            r3.d()
            int r2 = r2 + 1
            if (r2 < r1) goto L4e
        L59:
            if (r6 == 0) goto L63
            r6.c()
            s1.u r6 = r6.h()
            goto L59
        L63:
            s1.u r6 = r5.f51868e0
        L65:
            if (r6 == 0) goto L6f
            r6.b()
            s1.u r6 = r6.h()
            goto L65
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.k.s1(x0.f):void");
    }

    public final y t0() {
        return this.C;
    }

    public final void t1(boolean z10) {
        this.f51874k0 = z10;
    }

    public String toString() {
        return f1.a(this, null) + " children: " + W().size() + " measurePolicy: " + j0();
    }

    @Override // q1.l
    public int u(int i10) {
        return this.Z.u(i10);
    }

    public final k u0() {
        k kVar = this.B;
        boolean z10 = true;
        if (kVar == null || !kVar.f51879w) {
            z10 = false;
        }
        if (z10) {
            if (kVar != null) {
                return kVar.u0();
            }
            return null;
        }
        return kVar;
    }

    public final void u1(io.l<? super y, wn.v> lVar) {
        this.f51871h0 = lVar;
    }

    public final int v0() {
        return this.R;
    }

    public final void v1(io.l<? super y, wn.v> lVar) {
        this.f51872i0 = lVar;
    }

    public final q1.a0 w0() {
        return this.f51865b0;
    }

    public final void w1(q1.a0 a0Var) {
        this.f51865b0 = a0Var;
    }

    public g2 x0() {
        return this.O;
    }

    public final boolean x1() {
        s1.p H1 = this.Y.H1();
        for (s1.p s02 = s0(); !jo.p.c(s02, H1) && s02 != null; s02 = s02.H1()) {
            if (s02.x1() != null) {
                return false;
            }
            if (s1.e.m(s02.u1(), s1.e.f51834a.a())) {
                return true;
            }
        }
        return true;
    }

    public int y0() {
        return this.Z.r0();
    }

    public final m0.e<k> z0() {
        if (this.I) {
            this.H.h();
            m0.e<k> eVar = this.H;
            eVar.e(eVar.p(), A0());
            this.H.D(this.f51878o0);
            this.I = false;
        }
        return this.H;
    }

    public /* synthetic */ k(boolean z10, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
