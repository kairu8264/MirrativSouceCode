package a1;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.d1;
import q1.l0;

/* loaded from: classes.dex */
public final class j extends d1 implements r1.b, r1.d<j>, s1.z, l0 {
    public static final b M = new b(null);
    public static final io.l<j, wn.v> N = a.f322w;
    public j A;
    public f B;
    public k1.b<p1.b> C;
    public r1.e D;
    public q1.c E;
    public s F;
    public final p G;
    public w H;
    public s1.p I;
    public boolean J;
    public l1.e K;
    public final m0.e<l1.e> L;

    /* renamed from: x  reason: collision with root package name */
    public j f319x;

    /* renamed from: y  reason: collision with root package name */
    public final m0.e<j> f320y;

    /* renamed from: z  reason: collision with root package name */
    public y f321z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<j, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f322w = new a();

        public a() {
            super(1);
        }

        public final void a(j jVar) {
            jo.p.h(jVar, "focusModifier");
            r.d(jVar);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(j jVar) {
            a(jVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }

        public final io.l<j, wn.v> a() {
            return j.N;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f323a;

        static {
            int[] iArr = new int[y.values().length];
            iArr[y.Active.ordinal()] = 1;
            iArr[y.Captured.ordinal()] = 2;
            iArr[y.ActiveParent.ordinal()] = 3;
            iArr[y.DeactivatedParent.ordinal()] = 4;
            iArr[y.Deactivated.ordinal()] = 5;
            iArr[y.Inactive.ordinal()] = 6;
            f323a = iArr;
        }
    }

    public /* synthetic */ j(y yVar, io.l lVar, int i10, jo.h hVar) {
        this(yVar, (i10 & 2) != 0 ? a1.a() : lVar);
    }

    public final void A(j jVar) {
        this.A = jVar;
    }

    public final void B(r1.e eVar) {
        jo.p.h(eVar, "<set-?>");
        this.D = eVar;
    }

    @Override // q1.l0
    public void T(q1.q qVar) {
        jo.p.h(qVar, "coordinates");
        boolean z10 = this.I == null;
        this.I = (s1.p) qVar;
        if (z10) {
            r.d(this);
        }
        if (this.J) {
            this.J = false;
            z.h(this);
        }
    }

    public final q1.c c() {
        return this.E;
    }

    public final m0.e<j> f() {
        return this.f320y;
    }

    public final f g() {
        return this.B;
    }

    @Override // r1.d
    public r1.f<j> getKey() {
        return k.c();
    }

    public final p i() {
        return this.G;
    }

    public final s j() {
        return this.F;
    }

    @Override // r1.b
    public void j0(r1.e eVar) {
        m0.e<j> eVar2;
        m0.e<j> eVar3;
        s1.p pVar;
        s1.k z12;
        s1.y t02;
        g focusManager;
        jo.p.h(eVar, "scope");
        B(eVar);
        j jVar = (j) eVar.a(k.c());
        if (!jo.p.c(jVar, this.f319x)) {
            if (jVar == null) {
                int i10 = c.f323a[this.f321z.ordinal()];
                if ((i10 == 1 || i10 == 2) && (pVar = this.I) != null && (z12 = pVar.z1()) != null && (t02 = z12.t0()) != null && (focusManager = t02.getFocusManager()) != null) {
                    focusManager.c(true);
                }
            }
            j jVar2 = this.f319x;
            if (jVar2 != null && (eVar3 = jVar2.f320y) != null) {
                eVar3.u(this);
            }
            if (jVar != null && (eVar2 = jVar.f320y) != null) {
                eVar2.c(this);
            }
        }
        this.f319x = jVar;
        f fVar = (f) eVar.a(e.a());
        if (!jo.p.c(fVar, this.B)) {
            f fVar2 = this.B;
            if (fVar2 != null) {
                fVar2.i(this);
            }
            if (fVar != null) {
                fVar.a(this);
            }
        }
        this.B = fVar;
        w wVar = (w) eVar.a(v.b());
        if (!jo.p.c(wVar, this.H)) {
            w wVar2 = this.H;
            if (wVar2 != null) {
                wVar2.g(this);
            }
            if (wVar != null) {
                wVar.a(this);
            }
        }
        this.H = wVar;
        this.C = (k1.b) eVar.a(p1.a.b());
        this.E = (q1.c) eVar.a(q1.d.a());
        this.K = (l1.e) eVar.a(l1.f.a());
        this.F = (s) eVar.a(r.c());
        r.d(this);
    }

    public final y l() {
        return this.f321z;
    }

    public final j m() {
        return this.A;
    }

    @Override // s1.z
    public boolean m0() {
        return this.f319x != null;
    }

    public final m0.e<l1.e> n() {
        return this.L;
    }

    public final l1.e p() {
        return this.K;
    }

    public final s1.p r() {
        return this.I;
    }

    public final j s() {
        return this.f319x;
    }

    @Override // r1.d
    /* renamed from: t */
    public j getValue() {
        return this;
    }

    public final boolean v(p1.b bVar) {
        jo.p.h(bVar, "event");
        k1.b<p1.b> bVar2 = this.C;
        if (bVar2 != null) {
            return bVar2.c(bVar);
        }
        return false;
    }

    public final void x(boolean z10) {
        this.J = z10;
    }

    public final void y(y yVar) {
        jo.p.h(yVar, "value");
        this.f321z = yVar;
        z.k(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(y yVar, io.l<? super c1, wn.v> lVar) {
        super(lVar);
        jo.p.h(yVar, "initialFocus");
        jo.p.h(lVar, "inspectorInfo");
        this.f320y = new m0.e<>(new j[16], 0);
        this.f321z = yVar;
        this.G = new q();
        this.L = new m0.e<>(new l1.e[16], 0);
    }
}
