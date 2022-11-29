package s1;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import s1.k;
import s1.y;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a */
    public final k f51933a;

    /* renamed from: b */
    public final b f51934b;

    /* renamed from: c */
    public boolean f51935c;

    /* renamed from: d */
    public final v f51936d;

    /* renamed from: e */
    public final m0.e<y.b> f51937e;

    /* renamed from: f */
    public long f51938f;

    /* renamed from: g */
    public final List<k> f51939g;

    /* renamed from: h */
    public m2.b f51940h;

    /* renamed from: i */
    public final q f51941i;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51942a;

        static {
            int[] iArr = new int[k.g.values().length];
            iArr[k.g.Measuring.ordinal()] = 1;
            iArr[k.g.LayingOut.ordinal()] = 2;
            iArr[k.g.Idle.ordinal()] = 3;
            f51942a = iArr;
        }
    }

    public r(k kVar) {
        jo.p.h(kVar, "root");
        this.f51933a = kVar;
        y.a aVar = y.f51966p;
        b bVar = new b(aVar.a());
        this.f51934b = bVar;
        this.f51936d = new v();
        this.f51937e = new m0.e<>(new y.b[16], 0);
        this.f51938f = 1L;
        ArrayList arrayList = new ArrayList();
        this.f51939g = arrayList;
        this.f51941i = aVar.a() ? new q(kVar, bVar, arrayList) : null;
    }

    public static /* synthetic */ void e(r rVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        rVar.d(z10);
    }

    public static /* synthetic */ boolean q(r rVar, k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return rVar.p(kVar, z10);
    }

    public static /* synthetic */ boolean s(r rVar, k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return rVar.r(kVar, z10);
    }

    public final void c() {
        m0.e<y.b> eVar = this.f51937e;
        int p10 = eVar.p();
        if (p10 > 0) {
            int i10 = 0;
            y.b[] n10 = eVar.n();
            do {
                n10[i10].i();
                i10++;
            } while (i10 < p10);
            this.f51937e.h();
        }
        this.f51937e.h();
    }

    public final void d(boolean z10) {
        if (z10) {
            this.f51936d.d(this.f51933a);
        }
        this.f51936d.a();
    }

    public final boolean f(k kVar, m2.b bVar) {
        boolean d12;
        if (bVar != null) {
            d12 = kVar.c1(bVar);
        } else {
            d12 = k.d1(kVar, null, 1, null);
        }
        k u02 = kVar.u0();
        if (d12 && u02 != null) {
            if (kVar.l0() == k.i.InMeasureBlock) {
                s(this, u02, false, 2, null);
            } else if (kVar.l0() == k.i.InLayoutBlock) {
                q(this, u02, false, 2, null);
            }
        }
        return d12;
    }

    public final void g(k kVar) {
        jo.p.h(kVar, "layoutNode");
        if (this.f51934b.d()) {
            return;
        }
        if (this.f51935c) {
            if (!kVar.i0()) {
                m0.e<k> A0 = kVar.A0();
                int p10 = A0.p();
                if (p10 > 0) {
                    int i10 = 0;
                    k[] n10 = A0.n();
                    do {
                        k kVar2 = n10[i10];
                        if (kVar2.i0() && this.f51934b.f(kVar2)) {
                            o(kVar2);
                        }
                        if (!kVar2.i0()) {
                            g(kVar2);
                        }
                        i10++;
                    } while (i10 < p10);
                    if (kVar.i0() || !this.f51934b.f(kVar)) {
                        return;
                    }
                    o(kVar);
                    return;
                } else if (kVar.i0()) {
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean h(k kVar) {
        return kVar.i0() && (kVar.l0() == k.i.InMeasureBlock || kVar.U().e());
    }

    public final boolean i() {
        return !this.f51934b.d();
    }

    public final long j() {
        if (this.f51935c) {
            return this.f51938f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public final boolean k(io.a<wn.v> aVar) {
        boolean z10;
        if (this.f51933a.L0()) {
            if (this.f51933a.g()) {
                if (!this.f51935c) {
                    boolean z11 = false;
                    if (this.f51940h != null) {
                        this.f51935c = true;
                        try {
                            if (!this.f51934b.d()) {
                                b bVar = this.f51934b;
                                z10 = false;
                                while (!bVar.d()) {
                                    k e10 = bVar.e();
                                    boolean o10 = o(e10);
                                    if (e10 == this.f51933a && o10) {
                                        z10 = true;
                                    }
                                }
                                if (aVar != null) {
                                    aVar.invoke();
                                }
                            } else {
                                z10 = false;
                            }
                            this.f51935c = false;
                            q qVar = this.f51941i;
                            if (qVar != null) {
                                qVar.a();
                            }
                            z11 = z10;
                        } catch (Throwable th2) {
                            this.f51935c = false;
                            throw th2;
                        }
                    }
                    c();
                    return z11;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void l(k kVar, long j10) {
        jo.p.h(kVar, "layoutNode");
        if (!jo.p.c(kVar, this.f51933a)) {
            if (this.f51933a.L0()) {
                if (this.f51933a.g()) {
                    if (!this.f51935c) {
                        if (this.f51940h != null) {
                            this.f51935c = true;
                            try {
                                this.f51934b.f(kVar);
                                f(kVar, m2.b.b(j10));
                                if (kVar.f0() && kVar.g()) {
                                    kVar.g1();
                                    this.f51936d.c(kVar);
                                }
                                this.f51935c = false;
                                q qVar = this.f51941i;
                                if (qVar != null) {
                                    qVar.a();
                                }
                            } catch (Throwable th2) {
                                this.f51935c = false;
                                throw th2;
                            }
                        }
                        c();
                        return;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void m(k kVar) {
        jo.p.h(kVar, "node");
        this.f51934b.f(kVar);
    }

    public final void n(y.b bVar) {
        jo.p.h(bVar, "listener");
        this.f51937e.c(bVar);
    }

    public final boolean o(k kVar) {
        boolean z10;
        m2.b bVar;
        if (kVar.g() || h(kVar) || kVar.U().e()) {
            if (kVar.i0()) {
                if (kVar == this.f51933a) {
                    bVar = this.f51940h;
                    jo.p.e(bVar);
                } else {
                    bVar = null;
                }
                z10 = f(kVar, bVar);
            } else {
                z10 = false;
            }
            if (kVar.f0() && kVar.g()) {
                if (kVar == this.f51933a) {
                    kVar.a1(0, 0);
                } else {
                    kVar.g1();
                }
                this.f51936d.c(kVar);
                q qVar = this.f51941i;
                if (qVar != null) {
                    qVar.a();
                }
            }
            if (!this.f51939g.isEmpty()) {
                List<k> list = this.f51939g;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    k kVar2 = list.get(i10);
                    if (kVar2.L0()) {
                        s(this, kVar2, false, 2, null);
                    }
                }
                this.f51939g.clear();
            }
            return z10;
        }
        return false;
    }

    public final boolean p(k kVar, boolean z10) {
        jo.p.h(kVar, "layoutNode");
        int i10 = a.f51942a[kVar.g0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            q qVar = this.f51941i;
            if (qVar != null) {
                qVar.a();
            }
        } else if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            if ((kVar.i0() || kVar.f0()) && !z10) {
                q qVar2 = this.f51941i;
                if (qVar2 != null) {
                    qVar2.a();
                }
            } else {
                kVar.N0();
                if (kVar.g()) {
                    k u02 = kVar.u0();
                    if (!(u02 != null && u02.f0())) {
                        if (!(u02 != null && u02.i0())) {
                            this.f51934b.a(kVar);
                        }
                    }
                }
                if (!this.f51935c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r(k kVar, boolean z10) {
        jo.p.h(kVar, "layoutNode");
        int i10 = a.f51942a[kVar.g0().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                this.f51939g.add(kVar);
                q qVar = this.f51941i;
                if (qVar != null) {
                    qVar.a();
                }
            } else if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                if (!kVar.i0() || z10) {
                    kVar.O0();
                    if (kVar.g() || h(kVar)) {
                        k u02 = kVar.u0();
                        if (!(u02 != null && u02.i0())) {
                            this.f51934b.a(kVar);
                        }
                    }
                    if (!this.f51935c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void t(long j10) {
        m2.b bVar = this.f51940h;
        if (bVar == null ? false : m2.b.g(bVar.t(), j10)) {
            return;
        }
        if (!this.f51935c) {
            this.f51940h = m2.b.b(j10);
            this.f51933a.O0();
            this.f51934b.a(this.f51933a);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
