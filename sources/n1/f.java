package n1;

import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final q1.q f41418a;

    /* renamed from: b  reason: collision with root package name */
    public final k f41419b;

    public f(q1.q qVar) {
        jo.p.h(qVar, "rootCoordinates");
        this.f41418a = qVar;
        this.f41419b = new k();
    }

    public final void a(long j10, List<? extends c0> list) {
        j jVar;
        jo.p.h(list, "pointerInputFilters");
        k kVar = this.f41419b;
        int size = list.size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = list.get(i10);
            if (z10) {
                m0.e<j> g10 = kVar.g();
                int p10 = g10.p();
                if (p10 > 0) {
                    j[] n10 = g10.n();
                    int i11 = 0;
                    do {
                        jVar = n10[i11];
                        if (jo.p.c(jVar.k(), c0Var)) {
                            break;
                        }
                        i11++;
                    } while (i11 < p10);
                    jVar = null;
                } else {
                    jVar = null;
                }
                j jVar2 = jVar;
                if (jVar2 != null) {
                    jVar2.m();
                    if (!jVar2.j().j(v.a(j10))) {
                        jVar2.j().c(v.a(j10));
                    }
                    kVar = jVar2;
                } else {
                    z10 = false;
                }
            }
            j jVar3 = new j(c0Var);
            jVar3.j().c(v.a(j10));
            kVar.g().c(jVar3);
            kVar = jVar3;
        }
    }

    public final boolean b(g gVar, boolean z10) {
        jo.p.h(gVar, "internalPointerEvent");
        if (this.f41419b.a(gVar.a(), this.f41418a, gVar, z10)) {
            return this.f41419b.e(gVar) || this.f41419b.f(gVar.a(), this.f41418a, gVar, z10);
        }
        return false;
    }

    public final void c() {
        this.f41419b.d();
        this.f41419b.c();
    }

    public final void d() {
        this.f41419b.h();
    }
}
