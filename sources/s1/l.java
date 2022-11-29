package s1;

import java.util.HashMap;
import java.util.Map;
import xn.n0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final k f51897a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f51898b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f51899c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f51900d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f51901e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f51902f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f51903g;

    /* renamed from: h  reason: collision with root package name */
    public k f51904h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<q1.a, Integer> f51905i;

    public l(k kVar) {
        jo.p.h(kVar, "layoutNode");
        this.f51897a = kVar;
        this.f51898b = true;
        this.f51905i = new HashMap();
    }

    public static final void k(l lVar, q1.a aVar, int i10, p pVar) {
        int c10;
        float f10 = i10;
        long a10 = b1.g.a(f10, f10);
        while (true) {
            a10 = pVar.i2(a10);
            pVar = pVar.I1();
            jo.p.e(pVar);
            if (jo.p.c(pVar, lVar.f51897a.c0())) {
                break;
            } else if (pVar.A1().e().containsKey(aVar)) {
                float L = pVar.L(aVar);
                a10 = b1.g.a(L, L);
            }
        }
        if (aVar instanceof q1.k) {
            c10 = lo.c.c(b1.f.n(a10));
        } else {
            c10 = lo.c.c(b1.f.m(a10));
        }
        Map<q1.a, Integer> map = lVar.f51905i;
        if (map.containsKey(aVar)) {
            c10 = q1.b.c(aVar, ((Number) n0.f(lVar.f51905i, aVar)).intValue(), c10);
        }
        map.put(aVar, Integer.valueOf(c10));
    }

    public final boolean a() {
        return this.f51898b;
    }

    public final Map<q1.a, Integer> b() {
        return this.f51905i;
    }

    public final boolean c() {
        return this.f51901e;
    }

    public final boolean d() {
        return this.f51899c || this.f51901e || this.f51902f || this.f51903g;
    }

    public final boolean e() {
        l();
        return this.f51904h != null;
    }

    public final boolean f() {
        return this.f51903g;
    }

    public final boolean g() {
        return this.f51902f;
    }

    public final boolean h() {
        return this.f51900d;
    }

    public final boolean i() {
        return this.f51899c;
    }

    public final void j() {
        this.f51905i.clear();
        m0.e<k> A0 = this.f51897a.A0();
        int p10 = A0.p();
        if (p10 > 0) {
            k[] n10 = A0.n();
            int i10 = 0;
            do {
                k kVar = n10[i10];
                if (kVar.g()) {
                    if (kVar.U().f51898b) {
                        kVar.M0();
                    }
                    for (Map.Entry<q1.a, Integer> entry : kVar.U().f51905i.entrySet()) {
                        k(this, entry.getKey(), entry.getValue().intValue(), kVar.c0());
                    }
                    p I1 = kVar.c0().I1();
                    jo.p.e(I1);
                    while (!jo.p.c(I1, this.f51897a.c0())) {
                        for (q1.a aVar : I1.A1().e().keySet()) {
                            k(this, aVar, I1.L(aVar), I1);
                        }
                        I1 = I1.I1();
                        jo.p.e(I1);
                    }
                }
                i10++;
            } while (i10 < p10);
            this.f51905i.putAll(this.f51897a.c0().A1().e());
            this.f51898b = false;
        }
        this.f51905i.putAll(this.f51897a.c0().A1().e());
        this.f51898b = false;
    }

    public final void l() {
        k kVar;
        l U;
        l U2;
        if (d()) {
            kVar = this.f51897a;
        } else {
            k u02 = this.f51897a.u0();
            if (u02 == null) {
                return;
            }
            kVar = u02.U().f51904h;
            if (kVar == null || !kVar.U().d()) {
                k kVar2 = this.f51904h;
                if (kVar2 == null || kVar2.U().d()) {
                    return;
                }
                k u03 = kVar2.u0();
                if (u03 != null && (U2 = u03.U()) != null) {
                    U2.l();
                }
                k u04 = kVar2.u0();
                kVar = (u04 == null || (U = u04.U()) == null) ? null : U.f51904h;
            }
        }
        this.f51904h = kVar;
    }

    public final void m() {
        this.f51898b = true;
        this.f51899c = false;
        this.f51901e = false;
        this.f51900d = false;
        this.f51902f = false;
        this.f51903g = false;
        this.f51904h = null;
    }

    public final void n(boolean z10) {
        this.f51898b = z10;
    }

    public final void o(boolean z10) {
        this.f51901e = z10;
    }

    public final void p(boolean z10) {
        this.f51903g = z10;
    }

    public final void q(boolean z10) {
        this.f51902f = z10;
    }

    public final void r(boolean z10) {
        this.f51900d = z10;
    }

    public final void s(boolean z10) {
        this.f51899c = z10;
    }
}
