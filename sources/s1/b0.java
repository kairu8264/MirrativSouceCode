package s1;

/* loaded from: classes.dex */
public final class b0 extends n<b0, n1.d0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p pVar, n1.d0 d0Var) {
        super(pVar, d0Var);
        jo.p.h(pVar, "layoutNodeWrapper");
        jo.p.h(d0Var, "modifier");
    }

    @Override // s1.n
    public void g() {
        super.g();
        c().z0().g1(b());
        c().z0().f1(true);
    }

    @Override // s1.n
    public void h() {
        super.h();
        c().z0().f1(false);
    }

    public final boolean j() {
        if (!c().z0().m0()) {
            b0 d10 = d();
            if (!(d10 != null ? d10.j() : false)) {
                return false;
            }
        }
        return true;
    }
}
