package uo;

/* loaded from: classes4.dex */
public final /* synthetic */ class k {
    public static final <T> T a(ao.g gVar, io.p<? super q0, ? super ao.d<? super T>, ? extends Object> pVar) throws InterruptedException {
        m1 a10;
        ao.g e10;
        Thread currentThread = Thread.currentThread();
        ao.e eVar = (ao.e) gVar.get(ao.e.f16648d);
        if (eVar == null) {
            a10 = d3.f56003a.b();
            e10 = j0.e(v1.f56093w, gVar.plus(a10));
        } else {
            m1 m1Var = null;
            m1 m1Var2 = eVar instanceof m1 ? (m1) eVar : null;
            if (m1Var2 != null && m1Var2.D0()) {
                m1Var = m1Var2;
            }
            a10 = m1Var == null ? d3.f56003a.a() : m1Var;
            e10 = j0.e(v1.f56093w, gVar);
        }
        h hVar = new h(e10, currentThread, a10);
        hVar.Y0(s0.DEFAULT, hVar, pVar);
        return (T) hVar.Z0();
    }
}
