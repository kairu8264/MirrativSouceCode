package u2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t2.e;
import u2.b;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public t2.f f54294a;

    /* renamed from: d  reason: collision with root package name */
    public t2.f f54297d;

    /* renamed from: b  reason: collision with root package name */
    public boolean f54295b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f54296c = true;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<p> f54298e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<m> f54299f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public b.InterfaceC0853b f54300g = null;

    /* renamed from: h  reason: collision with root package name */
    public b.a f54301h = new b.a();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<m> f54302i = new ArrayList<>();

    public e(t2.f fVar) {
        this.f54294a = fVar;
        this.f54297d = fVar;
    }

    public final void a(f fVar, int i10, int i11, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f54306d;
        if (pVar.f54349c == null) {
            t2.f fVar3 = this.f54294a;
            if (pVar == fVar3.f53061e || pVar == fVar3.f53063f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            pVar.f54349c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f54354h.f54313k) {
                if (dVar instanceof f) {
                    a((f) dVar, i10, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f54355i.f54313k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i10, 1, fVar2, arrayList, mVar);
                }
            }
            if (i10 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f54329k.f54313k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i10, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f54354h.f54314l) {
                if (fVar4 == fVar2) {
                    mVar.f54323b = true;
                }
                a(fVar4, i10, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f54355i.f54314l) {
                if (fVar5 == fVar2) {
                    mVar.f54323b = true;
                }
                a(fVar5, i10, 1, fVar2, arrayList, mVar);
            }
            if (i10 == 1 && (pVar instanceof n)) {
                for (f fVar6 : ((n) pVar).f54329k.f54314l) {
                    a(fVar6, i10, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    public final boolean b(t2.f fVar) {
        int i10;
        e.b bVar;
        int i11;
        e.b bVar2;
        e.b bVar3;
        e.b bVar4;
        Iterator<t2.e> it = fVar.J0.iterator();
        while (it.hasNext()) {
            t2.e next = it.next();
            e.b[] bVarArr = next.Y;
            e.b bVar5 = bVarArr[0];
            e.b bVar6 = bVarArr[1];
            if (next.Q() == 8) {
                next.f53053a = true;
            } else {
                if (next.A < 1.0f && bVar5 == e.b.MATCH_CONSTRAINT) {
                    next.f53095v = 2;
                }
                if (next.D < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    next.f53097w = 2;
                }
                if (next.t() > 0.0f) {
                    e.b bVar7 = e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        next.f53095v = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == e.b.WRAP_CONTENT || bVar5 == e.b.FIXED)) {
                        next.f53097w = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.f53095v == 0) {
                            next.f53095v = 3;
                        }
                        if (next.f53097w == 0) {
                            next.f53097w = 3;
                        }
                    }
                }
                e.b bVar8 = e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.f53095v == 1 && (next.N.f53048f == null || next.P.f53048f == null)) {
                    bVar5 = e.b.WRAP_CONTENT;
                }
                e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.f53097w == 1 && (next.O.f53048f == null || next.Q.f53048f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                e.b bVar10 = bVar6;
                l lVar = next.f53061e;
                lVar.f54350d = bVar9;
                int i12 = next.f53095v;
                lVar.f54347a = i12;
                n nVar = next.f53063f;
                nVar.f54350d = bVar10;
                int i13 = next.f53097w;
                nVar.f54347a = i13;
                e.b bVar11 = e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == e.b.FIXED || bVar9 == e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == e.b.FIXED || bVar10 == e.b.WRAP_CONTENT)) {
                    int R = next.R();
                    if (bVar9 == bVar11) {
                        i10 = (fVar.R() - next.N.f53049g) - next.P.f53049g;
                        bVar = e.b.FIXED;
                    } else {
                        i10 = R;
                        bVar = bVar9;
                    }
                    int v10 = next.v();
                    if (bVar10 == bVar11) {
                        i11 = (fVar.v() - next.O.f53049g) - next.Q.f53049g;
                        bVar2 = e.b.FIXED;
                    } else {
                        i11 = v10;
                        bVar2 = bVar10;
                    }
                    l(next, bVar, i10, bVar2, i11);
                    next.f53061e.f54351e.d(next.R());
                    next.f53063f.f54351e.d(next.v());
                    next.f53053a = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = e.b.WRAP_CONTENT) || bVar10 == e.b.FIXED)) {
                        if (i12 == 3) {
                            if (bVar10 == bVar4) {
                                l(next, bVar4, 0, bVar4, 0);
                            }
                            int v11 = next.v();
                            e.b bVar12 = e.b.FIXED;
                            l(next, bVar12, (int) ((v11 * next.f53058c0) + 0.5f), bVar12, v11);
                            next.f53061e.f54351e.d(next.R());
                            next.f53063f.f54351e.d(next.v());
                            next.f53053a = true;
                        } else if (i12 == 1) {
                            l(next, bVar4, 0, bVar10, 0);
                            next.f53061e.f54351e.f54315m = next.R();
                        } else if (i12 == 2) {
                            e.b[] bVarArr2 = fVar.Y;
                            e.b bVar13 = bVarArr2[0];
                            e.b bVar14 = e.b.FIXED;
                            if (bVar13 == bVar14 || bVarArr2[0] == bVar11) {
                                l(next, bVar14, (int) ((next.A * fVar.R()) + 0.5f), bVar10, next.v());
                                next.f53061e.f54351e.d(next.R());
                                next.f53063f.f54351e.d(next.v());
                                next.f53053a = true;
                            }
                        } else {
                            t2.d[] dVarArr = next.V;
                            if (dVarArr[0].f53048f == null || dVarArr[1].f53048f == null) {
                                l(next, bVar4, 0, bVar10, 0);
                                next.f53061e.f54351e.d(next.R());
                                next.f53063f.f54351e.d(next.v());
                                next.f53053a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = e.b.WRAP_CONTENT) || bVar9 == e.b.FIXED)) {
                        if (i13 == 3) {
                            if (bVar9 == bVar3) {
                                l(next, bVar3, 0, bVar3, 0);
                            }
                            int R2 = next.R();
                            float f10 = next.f53058c0;
                            if (next.u() == -1) {
                                f10 = 1.0f / f10;
                            }
                            e.b bVar15 = e.b.FIXED;
                            l(next, bVar15, R2, bVar15, (int) ((R2 * f10) + 0.5f));
                            next.f53061e.f54351e.d(next.R());
                            next.f53063f.f54351e.d(next.v());
                            next.f53053a = true;
                        } else if (i13 == 1) {
                            l(next, bVar9, 0, bVar3, 0);
                            next.f53063f.f54351e.f54315m = next.v();
                        } else if (i13 == 2) {
                            e.b[] bVarArr3 = fVar.Y;
                            e.b bVar16 = bVarArr3[1];
                            e.b bVar17 = e.b.FIXED;
                            if (bVar16 == bVar17 || bVarArr3[1] == bVar11) {
                                l(next, bVar9, next.R(), bVar17, (int) ((next.D * fVar.v()) + 0.5f));
                                next.f53061e.f54351e.d(next.R());
                                next.f53063f.f54351e.d(next.v());
                                next.f53053a = true;
                            }
                        } else {
                            t2.d[] dVarArr2 = next.V;
                            if (dVarArr2[2].f53048f == null || dVarArr2[3].f53048f == null) {
                                l(next, bVar3, 0, bVar10, 0);
                                next.f53061e.f54351e.d(next.R());
                                next.f53063f.f54351e.d(next.v());
                                next.f53053a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i12 == 1 || i13 == 1) {
                            e.b bVar18 = e.b.WRAP_CONTENT;
                            l(next, bVar18, 0, bVar18, 0);
                            next.f53061e.f54351e.f54315m = next.R();
                            next.f53063f.f54351e.f54315m = next.v();
                        } else if (i13 == 2 && i12 == 2) {
                            e.b[] bVarArr4 = fVar.Y;
                            e.b bVar19 = bVarArr4[0];
                            e.b bVar20 = e.b.FIXED;
                            if (bVar19 == bVar20 && bVarArr4[1] == bVar20) {
                                l(next, bVar20, (int) ((next.A * fVar.R()) + 0.5f), bVar20, (int) ((next.D * fVar.v()) + 0.5f));
                                next.f53061e.f54351e.d(next.R());
                                next.f53063f.f54351e.d(next.v());
                                next.f53053a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void c() {
        d(this.f54298e);
        this.f54302i.clear();
        m.f54321h = 0;
        i(this.f54294a.f53061e, 0, this.f54302i);
        i(this.f54294a.f53063f, 1, this.f54302i);
        this.f54295b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f54297d.f53061e.f();
        this.f54297d.f53063f.f();
        arrayList.add(this.f54297d.f53061e);
        arrayList.add(this.f54297d.f53063f);
        Iterator<t2.e> it = this.f54297d.J0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            t2.e next = it.next();
            if (next instanceof t2.g) {
                arrayList.add(new j(next));
            } else {
                if (next.d0()) {
                    if (next.f53057c == null) {
                        next.f53057c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f53057c);
                } else {
                    arrayList.add(next.f53061e);
                }
                if (next.f0()) {
                    if (next.f53059d == null) {
                        next.f53059d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f53059d);
                } else {
                    arrayList.add(next.f53063f);
                }
                if (next instanceof t2.i) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f54348b != this.f54297d) {
                next2.d();
            }
        }
    }

    public final int e(t2.f fVar, int i10) {
        int size = this.f54302i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, this.f54302i.get(i11).b(fVar, i10));
        }
        return (int) j10;
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        if (this.f54295b || this.f54296c) {
            Iterator<t2.e> it = this.f54294a.J0.iterator();
            while (it.hasNext()) {
                t2.e next = it.next();
                next.l();
                next.f53053a = false;
                next.f53061e.r();
                next.f53063f.q();
            }
            this.f54294a.l();
            t2.f fVar = this.f54294a;
            fVar.f53053a = false;
            fVar.f53061e.r();
            this.f54294a.f53063f.q();
            this.f54296c = false;
        }
        if (b(this.f54297d)) {
            return false;
        }
        this.f54294a.d1(0);
        this.f54294a.e1(0);
        e.b s10 = this.f54294a.s(0);
        e.b s11 = this.f54294a.s(1);
        if (this.f54295b) {
            c();
        }
        int S = this.f54294a.S();
        int T = this.f54294a.T();
        this.f54294a.f53061e.f54354h.d(S);
        this.f54294a.f53063f.f54354h.d(T);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (s10 == bVar || s11 == bVar) {
            if (z13) {
                Iterator<p> it2 = this.f54298e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().m()) {
                        z13 = false;
                        break;
                    }
                }
            }
            if (z13 && s10 == e.b.WRAP_CONTENT) {
                this.f54294a.G0(e.b.FIXED);
                t2.f fVar2 = this.f54294a;
                fVar2.b1(e(fVar2, 0));
                t2.f fVar3 = this.f54294a;
                fVar3.f53061e.f54351e.d(fVar3.R());
            }
            if (z13 && s11 == e.b.WRAP_CONTENT) {
                this.f54294a.X0(e.b.FIXED);
                t2.f fVar4 = this.f54294a;
                fVar4.C0(e(fVar4, 1));
                t2.f fVar5 = this.f54294a;
                fVar5.f53063f.f54351e.d(fVar5.v());
            }
        }
        t2.f fVar6 = this.f54294a;
        e.b[] bVarArr = fVar6.Y;
        e.b bVar2 = bVarArr[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == e.b.MATCH_PARENT) {
            int R = fVar6.R() + S;
            this.f54294a.f53061e.f54355i.d(R);
            this.f54294a.f53061e.f54351e.d(R - S);
            m();
            t2.f fVar7 = this.f54294a;
            e.b[] bVarArr2 = fVar7.Y;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == e.b.MATCH_PARENT) {
                int v10 = fVar7.v() + T;
                this.f54294a.f53063f.f54355i.d(v10);
                this.f54294a.f53063f.f54351e.d(v10 - T);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<p> it3 = this.f54298e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f54348b != this.f54294a || next2.f54353g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f54298e.iterator();
        while (it4.hasNext()) {
            p next3 = it4.next();
            if (z11 || next3.f54348b != this.f54294a) {
                if (!next3.f54354h.f54312j || ((!next3.f54355i.f54312j && !(next3 instanceof j)) || (!next3.f54351e.f54312j && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f54294a.G0(s10);
        this.f54294a.X0(s11);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f54295b) {
            Iterator<t2.e> it = this.f54294a.J0.iterator();
            while (it.hasNext()) {
                t2.e next = it.next();
                next.l();
                next.f53053a = false;
                l lVar = next.f53061e;
                lVar.f54351e.f54312j = false;
                lVar.f54353g = false;
                lVar.r();
                n nVar = next.f53063f;
                nVar.f54351e.f54312j = false;
                nVar.f54353g = false;
                nVar.q();
            }
            this.f54294a.l();
            t2.f fVar = this.f54294a;
            fVar.f53053a = false;
            l lVar2 = fVar.f53061e;
            lVar2.f54351e.f54312j = false;
            lVar2.f54353g = false;
            lVar2.r();
            n nVar2 = this.f54294a.f53063f;
            nVar2.f54351e.f54312j = false;
            nVar2.f54353g = false;
            nVar2.q();
            c();
        }
        if (b(this.f54297d)) {
            return false;
        }
        this.f54294a.d1(0);
        this.f54294a.e1(0);
        this.f54294a.f53061e.f54354h.d(0);
        this.f54294a.f53063f.f54354h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        boolean z12 = true;
        boolean z13 = z10 & true;
        e.b s10 = this.f54294a.s(0);
        e.b s11 = this.f54294a.s(1);
        int S = this.f54294a.S();
        int T = this.f54294a.T();
        if (z13 && (s10 == (bVar = e.b.WRAP_CONTENT) || s11 == bVar)) {
            Iterator<p> it = this.f54298e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f54352f == i10 && !next.m()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && s10 == e.b.WRAP_CONTENT) {
                    this.f54294a.G0(e.b.FIXED);
                    t2.f fVar = this.f54294a;
                    fVar.b1(e(fVar, 0));
                    t2.f fVar2 = this.f54294a;
                    fVar2.f53061e.f54351e.d(fVar2.R());
                }
            } else if (z13 && s11 == e.b.WRAP_CONTENT) {
                this.f54294a.X0(e.b.FIXED);
                t2.f fVar3 = this.f54294a;
                fVar3.C0(e(fVar3, 1));
                t2.f fVar4 = this.f54294a;
                fVar4.f53063f.f54351e.d(fVar4.v());
            }
        }
        if (i10 == 0) {
            t2.f fVar5 = this.f54294a;
            e.b[] bVarArr = fVar5.Y;
            if (bVarArr[0] == e.b.FIXED || bVarArr[0] == e.b.MATCH_PARENT) {
                int R = fVar5.R() + S;
                this.f54294a.f53061e.f54355i.d(R);
                this.f54294a.f53061e.f54351e.d(R - S);
                z11 = true;
            }
            z11 = false;
        } else {
            t2.f fVar6 = this.f54294a;
            e.b[] bVarArr2 = fVar6.Y;
            if (bVarArr2[1] == e.b.FIXED || bVarArr2[1] == e.b.MATCH_PARENT) {
                int v10 = fVar6.v() + T;
                this.f54294a.f53063f.f54355i.d(v10);
                this.f54294a.f53063f.f54351e.d(v10 - T);
                z11 = true;
            }
            z11 = false;
        }
        m();
        Iterator<p> it2 = this.f54298e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f54352f == i10 && (next2.f54348b != this.f54294a || next2.f54353g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f54298e.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f54352f == i10 && (z11 || next3.f54348b != this.f54294a)) {
                if (!next3.f54354h.f54312j || !next3.f54355i.f54312j || (!(next3 instanceof c) && !next3.f54351e.f54312j)) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f54294a.G0(s10);
        this.f54294a.X0(s11);
        return z12;
    }

    public final void i(p pVar, int i10, ArrayList<m> arrayList) {
        for (d dVar : pVar.f54354h.f54313k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f54355i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f54354h, i10, 0, pVar.f54355i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f54355i.f54313k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f54354h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f54355i, i10, 1, pVar.f54354h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((n) pVar).f54329k.f54313k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    public void j() {
        this.f54295b = true;
    }

    public void k() {
        this.f54296c = true;
    }

    public final void l(t2.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f54301h;
        aVar.f54282a = bVar;
        aVar.f54283b = bVar2;
        aVar.f54284c = i10;
        aVar.f54285d = i11;
        this.f54300g.b(eVar, aVar);
        eVar.b1(this.f54301h.f54286e);
        eVar.C0(this.f54301h.f54287f);
        eVar.B0(this.f54301h.f54289h);
        eVar.r0(this.f54301h.f54288g);
    }

    public void m() {
        g gVar;
        Iterator<t2.e> it = this.f54294a.J0.iterator();
        while (it.hasNext()) {
            t2.e next = it.next();
            if (!next.f53053a) {
                e.b[] bVarArr = next.Y;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = next.f53095v;
                int i11 = next.f53097w;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = next.f53061e.f54351e;
                boolean z12 = gVar2.f54312j;
                g gVar3 = next.f53063f.f54351e;
                boolean z13 = gVar3.f54312j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    l(next, bVar4, gVar2.f54309g, bVar4, gVar3.f54309g);
                    next.f53053a = true;
                } else if (z12 && z10) {
                    l(next, e.b.FIXED, gVar2.f54309g, bVar3, gVar3.f54309g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f53063f.f54351e.f54315m = next.v();
                    } else {
                        next.f53063f.f54351e.d(next.v());
                        next.f53053a = true;
                    }
                } else if (z13 && z11) {
                    l(next, bVar3, gVar2.f54309g, e.b.FIXED, gVar3.f54309g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f53061e.f54351e.f54315m = next.R();
                    } else {
                        next.f53061e.f54351e.d(next.R());
                        next.f53053a = true;
                    }
                }
                if (next.f53053a && (gVar = next.f53063f.f54330l) != null) {
                    gVar.d(next.n());
                }
            }
        }
    }

    public void n(b.InterfaceC0853b interfaceC0853b) {
        this.f54300g = interfaceC0853b;
    }
}
