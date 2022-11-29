package s1;

import c1.i0;
import q1.q0;
import s1.k;

/* loaded from: classes.dex */
public final class w extends q0 implements q1.b0 {
    public final k A;
    public p B;
    public boolean C;
    public boolean D;
    public boolean E;
    public long F;
    public io.l<? super i0, wn.v> G;
    public float H;
    public Object I;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f51960a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f51961b;

        static {
            int[] iArr = new int[k.g.values().length];
            iArr[k.g.Measuring.ordinal()] = 1;
            iArr[k.g.LayingOut.ordinal()] = 2;
            f51960a = iArr;
            int[] iArr2 = new int[k.i.values().length];
            iArr2[k.i.InMeasureBlock.ordinal()] = 1;
            iArr2[k.i.InLayoutBlock.ordinal()] = 2;
            f51961b = iArr2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f51963x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f51964y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<i0, wn.v> f51965z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j10, float f10, io.l<? super i0, wn.v> lVar) {
            super(0);
            this.f51963x = j10;
            this.f51964y = f10;
            this.f51965z = lVar;
        }

        public final void a() {
            w.this.a1(this.f51963x, this.f51964y, this.f51965z);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public w(k kVar, p pVar) {
        jo.p.h(kVar, "layoutNode");
        jo.p.h(pVar, "outerWrapper");
        this.A = kVar;
        this.B = pVar;
        this.F = m2.k.f40528b.a();
    }

    @Override // q1.l
    public int E(int i10) {
        Z0();
        return this.B.E(i10);
    }

    @Override // q1.l
    public int G(int i10) {
        Z0();
        return this.B.G(i10);
    }

    @Override // q1.f0
    public int L(q1.a aVar) {
        jo.p.h(aVar, "alignmentLine");
        k u02 = this.A.u0();
        if ((u02 != null ? u02.g0() : null) == k.g.Measuring) {
            this.A.U().s(true);
        } else {
            k u03 = this.A.u0();
            if ((u03 != null ? u03.g0() : null) == k.g.LayingOut) {
                this.A.U().r(true);
            }
        }
        this.E = true;
        int L = this.B.L(aVar);
        this.E = false;
        return L;
    }

    @Override // q1.b0
    public q0 M(long j10) {
        k.i iVar;
        k u02 = this.A.u0();
        if (u02 != null) {
            if (this.A.l0() == k.i.NotUsed || this.A.V()) {
                k kVar = this.A;
                int i10 = a.f51960a[u02.g0().ordinal()];
                if (i10 == 1) {
                    iVar = k.i.InMeasureBlock;
                } else if (i10 == 2) {
                    iVar = k.i.InLayoutBlock;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block.Parents state is " + u02.g0());
                }
                kVar.r1(iVar);
            } else {
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + this.A.l0() + ". Parent state " + u02.g0() + '.').toString());
            }
        } else {
            this.A.r1(k.i.NotUsed);
        }
        f1(j10);
        return this;
    }

    public final boolean S0() {
        return this.E;
    }

    public final m2.b T0() {
        if (this.C) {
            return m2.b.b(p0());
        }
        return null;
    }

    public final p X0() {
        return this.B;
    }

    public final void Y0(boolean z10) {
        k u02;
        k u03 = this.A.u0();
        k.i e02 = this.A.e0();
        if (u03 == null || e02 == k.i.NotUsed) {
            return;
        }
        while (u03.e0() == e02 && (u02 = u03.u0()) != null) {
            u03 = u02;
        }
        int i10 = a.f51961b[e02.ordinal()];
        if (i10 == 1) {
            u03.j1(z10);
        } else if (i10 == 2) {
            u03.h1(z10);
        } else {
            throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
        }
    }

    public final void Z0() {
        k.i iVar;
        k.k1(this.A, false, 1, null);
        k u02 = this.A.u0();
        if (u02 == null || this.A.e0() != k.i.NotUsed) {
            return;
        }
        k kVar = this.A;
        int i10 = a.f51960a[u02.g0().ordinal()];
        if (i10 == 1) {
            iVar = k.i.InMeasureBlock;
        } else if (i10 != 2) {
            iVar = u02.e0();
        } else {
            iVar = k.i.InLayoutBlock;
        }
        kVar.q1(iVar);
    }

    public final void a1(long j10, float f10, io.l<? super i0, wn.v> lVar) {
        q0.a.C0733a c0733a = q0.a.f48598a;
        if (lVar == null) {
            c0733a.k(this.B, j10, f10);
        } else {
            c0733a.w(this.B, j10, f10, lVar);
        }
    }

    @Override // q1.f0, q1.l
    public Object d() {
        return this.I;
    }

    @Override // q1.l
    public int e(int i10) {
        Z0();
        return this.B.e(i10);
    }

    public final void e1() {
        this.I = this.B.d();
    }

    public final boolean f1(long j10) {
        long a10;
        y a11 = o.a(this.A);
        k u02 = this.A.u0();
        k kVar = this.A;
        boolean z10 = true;
        kVar.o1(kVar.V() || (u02 != null && u02.V()));
        if (!this.A.i0() && m2.b.g(p0(), j10)) {
            a11.y(this.A);
            this.A.m1();
            return false;
        }
        this.A.U().q(false);
        m0.e<k> A0 = this.A.A0();
        int p10 = A0.p();
        if (p10 > 0) {
            k[] n10 = A0.n();
            int i10 = 0;
            do {
                n10[i10].U().s(false);
                i10++;
            } while (i10 < p10);
            this.C = true;
            a10 = this.B.a();
            E0(j10);
            this.A.Z0(j10);
            if (m2.o.e(this.B.a(), a10) && this.B.r0() == r0() && this.B.f0() == f0()) {
                z10 = false;
            }
            z0(m2.p.a(this.B.r0(), this.B.f0()));
            return z10;
        }
        this.C = true;
        a10 = this.B.a();
        E0(j10);
        this.A.Z0(j10);
        if (m2.o.e(this.B.a(), a10)) {
            z10 = false;
        }
        z0(m2.p.a(this.B.r0(), this.B.f0()));
        return z10;
    }

    @Override // q1.q0
    public int g0() {
        return this.B.g0();
    }

    public final void g1() {
        if (this.D) {
            v0(this.F, this.H, this.G);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void h1(p pVar) {
        jo.p.h(pVar, "<set-?>");
        this.B = pVar;
    }

    @Override // q1.q0
    public int l0() {
        return this.B.l0();
    }

    @Override // q1.l
    public int u(int i10) {
        Z0();
        return this.B.u(i10);
    }

    @Override // q1.q0
    public void v0(long j10, float f10, io.l<? super i0, wn.v> lVar) {
        this.F = j10;
        this.H = f10;
        this.G = lVar;
        p I1 = this.B.I1();
        if (I1 != null && I1.R1()) {
            a1(j10, f10, lVar);
            return;
        }
        this.D = true;
        this.A.U().p(false);
        o.a(this.A).getSnapshotObserver().b(this.A, new b(j10, f10, lVar));
    }
}
