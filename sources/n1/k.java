package n1;

import java.util.Map;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public final m0.e<j> f41455a = new m0.e<>(new j[16], 0);

    public boolean a(Map<v, w> map, q1.q qVar, g gVar, boolean z10) {
        jo.p.h(map, "changes");
        jo.p.h(qVar, "parentCoordinates");
        jo.p.h(gVar, "internalPointerEvent");
        m0.e<j> eVar = this.f41455a;
        int p10 = eVar.p();
        if (p10 > 0) {
            j[] n10 = eVar.n();
            int i10 = 0;
            boolean z11 = false;
            do {
                z11 = n10[i10].a(map, qVar, gVar, z10) || z11;
                i10++;
            } while (i10 < p10);
            return z11;
        }
        return false;
    }

    public void b(g gVar) {
        jo.p.h(gVar, "internalPointerEvent");
        int p10 = this.f41455a.p();
        while (true) {
            p10--;
            if (-1 >= p10) {
                return;
            }
            if (this.f41455a.n()[p10].j().r()) {
                this.f41455a.y(p10);
            }
        }
    }

    public final void c() {
        this.f41455a.h();
    }

    public void d() {
        m0.e<j> eVar = this.f41455a;
        int p10 = eVar.p();
        if (p10 > 0) {
            int i10 = 0;
            j[] n10 = eVar.n();
            do {
                n10[i10].d();
                i10++;
            } while (i10 < p10);
        }
    }

    public boolean e(g gVar) {
        jo.p.h(gVar, "internalPointerEvent");
        m0.e<j> eVar = this.f41455a;
        int p10 = eVar.p();
        boolean z10 = false;
        if (p10 > 0) {
            j[] n10 = eVar.n();
            int i10 = 0;
            boolean z11 = false;
            do {
                z11 = n10[i10].e(gVar) || z11;
                i10++;
            } while (i10 < p10);
            z10 = z11;
        }
        b(gVar);
        return z10;
    }

    public boolean f(Map<v, w> map, q1.q qVar, g gVar, boolean z10) {
        jo.p.h(map, "changes");
        jo.p.h(qVar, "parentCoordinates");
        jo.p.h(gVar, "internalPointerEvent");
        m0.e<j> eVar = this.f41455a;
        int p10 = eVar.p();
        if (p10 > 0) {
            j[] n10 = eVar.n();
            int i10 = 0;
            boolean z11 = false;
            do {
                z11 = n10[i10].f(map, qVar, gVar, z10) || z11;
                i10++;
            } while (i10 < p10);
            return z11;
        }
        return false;
    }

    public final m0.e<j> g() {
        return this.f41455a;
    }

    public final void h() {
        int i10 = 0;
        while (i10 < this.f41455a.p()) {
            j jVar = this.f41455a.n()[i10];
            if (!jVar.k().s0()) {
                this.f41455a.y(i10);
                jVar.d();
            } else {
                i10++;
                jVar.h();
            }
        }
    }
}
