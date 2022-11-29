package y1;

import c1.f1;
import c1.u0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final e f61067a;

    /* renamed from: b  reason: collision with root package name */
    public final int f61068b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f61069c;

    /* renamed from: d  reason: collision with root package name */
    public final float f61070d;

    /* renamed from: e  reason: collision with root package name */
    public final float f61071e;

    /* renamed from: f  reason: collision with root package name */
    public final int f61072f;

    /* renamed from: g  reason: collision with root package name */
    public final List<b1.h> f61073g;

    /* renamed from: h  reason: collision with root package name */
    public final List<i> f61074h;

    public d(e eVar, long j10, int i10, boolean z10) {
        boolean z11;
        int m10;
        this.f61067a = eVar;
        this.f61068b = i10;
        int i11 = 0;
        if (m2.b.p(j10) == 0 && m2.b.o(j10) == 0) {
            ArrayList arrayList = new ArrayList();
            List<j> f10 = eVar.f();
            int size = f10.size();
            float f11 = 0.0f;
            int i12 = 0;
            int i13 = 0;
            while (i12 < size) {
                j jVar = f10.get(i12);
                k b10 = jVar.b();
                int n10 = m2.b.n(j10);
                if (m2.b.i(j10)) {
                    m10 = po.n.d(m2.b.m(j10) - m.d(f11), i11);
                } else {
                    m10 = m2.b.m(j10);
                }
                h c10 = m.c(b10, m2.c.b(0, n10, 0, m10, 5, null), this.f61068b - i13, z10);
                float height = f11 + c10.getHeight();
                int k10 = i13 + c10.k();
                arrayList.add(new i(c10, jVar.c(), jVar.a(), i13, k10, f11, height));
                if (c10.m() || (k10 == this.f61068b && i12 != xn.s.l(this.f61067a.f()))) {
                    i13 = k10;
                    f11 = height;
                    z11 = true;
                    break;
                }
                i12++;
                i13 = k10;
                f11 = height;
                i11 = 0;
            }
            z11 = false;
            this.f61071e = f11;
            this.f61072f = i13;
            this.f61069c = z11;
            this.f61074h = arrayList;
            this.f61070d = m2.b.n(j10);
            List<b1.h> arrayList2 = new ArrayList<>(arrayList.size());
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                i iVar = (i) arrayList.get(i14);
                List<b1.h> w10 = iVar.e().w();
                ArrayList arrayList3 = new ArrayList(w10.size());
                int size3 = w10.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    b1.h hVar = w10.get(i15);
                    arrayList3.add(hVar != null ? iVar.i(hVar) : null);
                }
                xn.x.y(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.f61067a.g().size()) {
                int size4 = this.f61067a.g().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i16 = 0; i16 < size4; i16++) {
                    arrayList4.add(null);
                }
                arrayList2 = xn.a0.o0(arrayList2, arrayList4);
            }
            this.f61073g = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    public /* synthetic */ d(e eVar, long j10, int i10, boolean z10, jo.h hVar) {
        this(eVar, j10, i10, z10);
    }

    public final void A(c1.w wVar, c1.u uVar, f1 f1Var, j2.f fVar) {
        jo.p.h(wVar, "canvas");
        jo.p.h(uVar, "brush");
        g2.b.a(this, wVar, uVar, f1Var, fVar);
    }

    public final void B(c1.w wVar, long j10, f1 f1Var, j2.f fVar) {
        jo.p.h(wVar, "canvas");
        wVar.p();
        List<i> list = this.f61074h;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = list.get(i10);
            iVar.e().x(wVar, j10, f1Var, fVar);
            wVar.b(0.0f, iVar.e().getHeight());
        }
        wVar.k();
    }

    public final void C(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < a().g().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0, " + a().length() + ')').toString());
    }

    public final void D(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= a().g().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0, " + a().length() + ']').toString());
    }

    public final void E(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f61072f) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i10 + ") is out of bounds [0, " + i10 + ')').toString());
    }

    public final a a() {
        return this.f61067a.e();
    }

    public final j2.d b(int i10) {
        int a10;
        D(i10);
        if (i10 == a().length()) {
            a10 = xn.s.l(this.f61074h);
        } else {
            a10 = g.a(this.f61074h, i10);
        }
        i iVar = this.f61074h.get(a10);
        return iVar.e().t(iVar.p(i10));
    }

    public final b1.h c(int i10) {
        C(i10);
        i iVar = this.f61074h.get(g.a(this.f61074h, i10));
        return iVar.i(iVar.e().v(iVar.p(i10)));
    }

    public final b1.h d(int i10) {
        int a10;
        D(i10);
        if (i10 == a().length()) {
            a10 = xn.s.l(this.f61074h);
        } else {
            a10 = g.a(this.f61074h, i10);
        }
        i iVar = this.f61074h.get(a10);
        return iVar.i(iVar.e().d(iVar.p(i10)));
    }

    public final boolean e() {
        return this.f61069c;
    }

    public final float f() {
        if (this.f61074h.isEmpty()) {
            return 0.0f;
        }
        return this.f61074h.get(0).e().f();
    }

    public final float g() {
        return this.f61071e;
    }

    public final float h(int i10, boolean z10) {
        int a10;
        D(i10);
        if (i10 == a().length()) {
            a10 = xn.s.l(this.f61074h);
        } else {
            a10 = g.a(this.f61074h, i10);
        }
        i iVar = this.f61074h.get(a10);
        return iVar.e().p(iVar.p(i10), z10);
    }

    public final e i() {
        return this.f61067a;
    }

    public final float j() {
        if (this.f61074h.isEmpty()) {
            return 0.0f;
        }
        i iVar = (i) xn.a0.i0(this.f61074h);
        return iVar.n(iVar.e().r());
    }

    public final float k(int i10) {
        E(i10);
        i iVar = this.f61074h.get(g.b(this.f61074h, i10));
        return iVar.n(iVar.e().u(iVar.q(i10)));
    }

    public final int l() {
        return this.f61072f;
    }

    public final int m(int i10, boolean z10) {
        E(i10);
        i iVar = this.f61074h.get(g.b(this.f61074h, i10));
        return iVar.l(iVar.e().j(iVar.q(i10), z10));
    }

    public final int n(int i10) {
        int a10;
        D(i10);
        if (i10 == a().length()) {
            a10 = xn.s.l(this.f61074h);
        } else {
            a10 = g.a(this.f61074h, i10);
        }
        i iVar = this.f61074h.get(a10);
        return iVar.m(iVar.e().s(iVar.p(i10)));
    }

    public final int o(float f10) {
        int l10;
        if (f10 <= 0.0f) {
            l10 = 0;
        } else {
            l10 = f10 >= this.f61071e ? xn.s.l(this.f61074h) : g.c(this.f61074h, f10);
        }
        i iVar = this.f61074h.get(l10);
        if (iVar.d() == 0) {
            return Math.max(0, iVar.f() - 1);
        }
        return iVar.m(iVar.e().n(iVar.r(f10)));
    }

    public final float p(int i10) {
        E(i10);
        i iVar = this.f61074h.get(g.b(this.f61074h, i10));
        return iVar.e().q(iVar.q(i10));
    }

    public final float q(int i10) {
        E(i10);
        i iVar = this.f61074h.get(g.b(this.f61074h, i10));
        return iVar.e().l(iVar.q(i10));
    }

    public final int r(int i10) {
        E(i10);
        i iVar = this.f61074h.get(g.b(this.f61074h, i10));
        return iVar.l(iVar.e().i(iVar.q(i10)));
    }

    public final float s(int i10) {
        E(i10);
        i iVar = this.f61074h.get(g.b(this.f61074h, i10));
        return iVar.n(iVar.e().c(iVar.q(i10)));
    }

    public final int t(long j10) {
        int l10;
        if (b1.f.n(j10) <= 0.0f) {
            l10 = 0;
        } else {
            l10 = b1.f.n(j10) >= this.f61071e ? xn.s.l(this.f61074h) : g.c(this.f61074h, b1.f.n(j10));
        }
        i iVar = this.f61074h.get(l10);
        if (iVar.d() == 0) {
            return Math.max(0, iVar.f() - 1);
        }
        return iVar.l(iVar.e().h(iVar.o(j10)));
    }

    public final j2.d u(int i10) {
        int a10;
        D(i10);
        if (i10 == a().length()) {
            a10 = xn.s.l(this.f61074h);
        } else {
            a10 = g.a(this.f61074h, i10);
        }
        i iVar = this.f61074h.get(a10);
        return iVar.e().b(iVar.p(i10));
    }

    public final List<i> v() {
        return this.f61074h;
    }

    public final u0 w(int i10, int i11) {
        boolean z10 = true;
        if (!((!(i10 >= 0 && i10 <= i11) || i11 > a().g().length()) ? false : false)) {
            throw new IllegalArgumentException(("Start(" + i10 + ") or End(" + i11 + ") is out of range [0.." + a().g().length() + "), or start > end!").toString());
        } else if (i10 == i11) {
            return c1.n.a();
        } else {
            u0 a10 = c1.n.a();
            int size = this.f61074h.size();
            for (int a11 = g.a(this.f61074h, i10); a11 < size; a11++) {
                i iVar = this.f61074h.get(a11);
                if (iVar.f() >= i11) {
                    break;
                }
                if (iVar.f() != iVar.b()) {
                    u0.a(a10, iVar.j(iVar.e().o(iVar.p(i10), iVar.p(i11))), 0L, 2, null);
                }
            }
            return a10;
        }
    }

    public final List<b1.h> x() {
        return this.f61073g;
    }

    public final float y() {
        return this.f61070d;
    }

    public final long z(int i10) {
        int a10;
        D(i10);
        if (i10 == a().length()) {
            a10 = xn.s.l(this.f61074h);
        } else {
            a10 = g.a(this.f61074h, i10);
        }
        i iVar = this.f61074h.get(a10);
        return iVar.k(iVar.e().e(iVar.p(i10)));
    }
}
