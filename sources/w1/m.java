package w1;

/* loaded from: classes.dex */
public final class m extends s1.n<m, n> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s1.p pVar, n nVar) {
        super(pVar, nVar);
        jo.p.h(pVar, "wrapped");
        jo.p.h(nVar, "modifier");
    }

    @Override // s1.n
    public void g() {
        super.g();
        s1.y t02 = a().t0();
        if (t02 != null) {
            t02.w();
        }
    }

    @Override // s1.n
    public void h() {
        super.h();
        s1.y t02 = a().t0();
        if (t02 != null) {
            t02.w();
        }
    }

    public final k j() {
        m d10 = d();
        m mVar = null;
        if (d10 == null) {
            s1.p H1 = b().H1();
            if (H1 != null) {
                while (H1 != null && !s1.e.m(H1.u1(), s1.e.f51834a.f())) {
                    H1 = H1.H1();
                }
                if (H1 != null && (d10 = (m) s1.e.n(H1.u1(), s1.e.f51834a.f())) != null) {
                    s1.p b10 = d10.b();
                    while (b10 != null) {
                        if (d10 != null) {
                            mVar = d10;
                            break;
                        }
                        b10 = b10.H1();
                        d10 = b10 != null ? (m) s1.e.n(b10.u1(), s1.e.f51834a.f()) : null;
                    }
                }
            }
        } else {
            s1.p b11 = d10.b();
            while (b11 != null) {
                if (d10 != null) {
                    mVar = d10;
                    break;
                }
                b11 = b11.H1();
                d10 = b11 != null ? (m) s1.e.n(b11.u1(), s1.e.f51834a.f()) : null;
            }
        }
        if (mVar != null && !c().a1().r()) {
            k j10 = c().a1().j();
            j10.f(mVar.j());
            return j10;
        }
        return c().a1();
    }

    public final boolean k() {
        return l.a(c().a1(), j.f57906a.h()) != null;
    }

    public final b1.h l() {
        if (!f()) {
            return b1.h.f16726e.a();
        }
        if (!k()) {
            return q1.r.b(b());
        }
        return b().j2();
    }

    public String toString() {
        return super.toString() + " id: " + c().getId() + " config: " + c().a1();
    }
}
