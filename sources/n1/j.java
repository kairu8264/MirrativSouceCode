package n1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: b  reason: collision with root package name */
    public final c0 f41441b;

    /* renamed from: c  reason: collision with root package name */
    public final m0.e<v> f41442c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<v, w> f41443d;

    /* renamed from: e  reason: collision with root package name */
    public q1.q f41444e;

    /* renamed from: f  reason: collision with root package name */
    public m f41445f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f41446g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f41447h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f41448i;

    public j(c0 c0Var) {
        jo.p.h(c0Var, "pointerInputFilter");
        this.f41441b = c0Var;
        this.f41442c = new m0.e<>(new v[16], 0);
        this.f41443d = new LinkedHashMap();
        this.f41447h = true;
        this.f41448i = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    @Override // n1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.util.Map<n1.v, n1.w> r31, q1.q r32, n1.g r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.j.a(java.util.Map, q1.q, n1.g, boolean):boolean");
    }

    @Override // n1.k
    public void b(g gVar) {
        jo.p.h(gVar, "internalPointerEvent");
        super.b(gVar);
        m mVar = this.f41445f;
        if (mVar == null) {
            return;
        }
        this.f41446g = this.f41447h;
        List<w> c10 = mVar.c();
        int size = c10.size();
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = c10.get(i10);
            if ((wVar.g() || (gVar.d(wVar.e()) && this.f41447h)) ? false : true) {
                this.f41442c.u(v.a(wVar.e()));
            }
        }
        this.f41447h = false;
        this.f41448i = p.i(mVar.f(), p.f41507a.b());
    }

    @Override // n1.k
    public void d() {
        m0.e<j> g10 = g();
        int p10 = g10.p();
        if (p10 > 0) {
            int i10 = 0;
            j[] n10 = g10.n();
            do {
                n10[i10].d();
                i10++;
            } while (i10 < p10);
            this.f41441b.P0();
        }
        this.f41441b.P0();
    }

    @Override // n1.k
    public boolean e(g gVar) {
        m0.e<j> g10;
        int p10;
        jo.p.h(gVar, "internalPointerEvent");
        boolean z10 = true;
        int i10 = 0;
        if (!this.f41443d.isEmpty() && this.f41441b.s0()) {
            m mVar = this.f41445f;
            jo.p.e(mVar);
            q1.q qVar = this.f41444e;
            jo.p.e(qVar);
            this.f41441b.e1(mVar, o.Final, qVar.a());
            if (this.f41441b.s0() && (p10 = (g10 = g()).p()) > 0) {
                j[] n10 = g10.n();
                do {
                    n10[i10].e(gVar);
                    i10++;
                } while (i10 < p10);
            }
        } else {
            z10 = false;
        }
        b(gVar);
        i();
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // n1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(java.util.Map<n1.v, n1.w> r9, q1.q r10, n1.g r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "changes"
            jo.p.h(r9, r0)
            java.lang.String r9 = "parentCoordinates"
            jo.p.h(r10, r9)
            java.lang.String r9 = "internalPointerEvent"
            jo.p.h(r11, r9)
            java.util.Map<n1.v, n1.w> r9 = r8.f41443d
            boolean r9 = r9.isEmpty()
            r10 = 1
            r0 = 0
            if (r9 == 0) goto L1b
        L19:
            r10 = r0
            goto L6f
        L1b:
            n1.c0 r9 = r8.f41441b
            boolean r9 = r9.s0()
            if (r9 != 0) goto L24
            goto L19
        L24:
            n1.m r9 = r8.f41445f
            jo.p.e(r9)
            q1.q r1 = r8.f41444e
            jo.p.e(r1)
            long r1 = r1.a()
            n1.c0 r3 = r8.f41441b
            n1.o r4 = n1.o.Initial
            r3.e1(r9, r4, r1)
            n1.c0 r3 = r8.f41441b
            boolean r3 = r3.s0()
            if (r3 == 0) goto L60
            m0.e r3 = r8.g()
            int r4 = r3.p()
            if (r4 <= 0) goto L60
            java.lang.Object[] r3 = r3.n()
        L4f:
            r5 = r3[r0]
            n1.j r5 = (n1.j) r5
            java.util.Map<n1.v, n1.w> r6 = r8.f41443d
            q1.q r7 = r8.f41444e
            jo.p.e(r7)
            r5.f(r6, r7, r11, r12)
            int r0 = r0 + r10
            if (r0 < r4) goto L4f
        L60:
            n1.c0 r11 = r8.f41441b
            boolean r11 = r11.s0()
            if (r11 == 0) goto L6f
            n1.c0 r11 = r8.f41441b
            n1.o r12 = n1.o.Main
            r11.e1(r9, r12, r1)
        L6f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.j.f(java.util.Map, q1.q, n1.g, boolean):boolean");
    }

    public final void i() {
        this.f41443d.clear();
        this.f41444e = null;
    }

    public final m0.e<v> j() {
        return this.f41442c;
    }

    public final c0 k() {
        return this.f41441b;
    }

    public final boolean l(m mVar, m mVar2) {
        if (mVar == null || mVar.c().size() != mVar2.c().size()) {
            return true;
        }
        int size = mVar2.c().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!b1.f.j(mVar.c().get(i10).f(), mVar2.c().get(i10).f())) {
                return true;
            }
        }
        return false;
    }

    public final void m() {
        this.f41447h = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.f41441b + ", children=" + g() + ", pointerIds=" + this.f41442c + ')';
    }
}
