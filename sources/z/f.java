package z;

import androidx.compose.ui.platform.o0;

/* loaded from: classes.dex */
public final class f {
    public static final x0.f b(x0.f fVar, g0 g0Var, j jVar, boolean z10, l0.i iVar, int i10) {
        jo.p.h(fVar, "<this>");
        jo.p.h(g0Var, "state");
        jo.p.h(jVar, "beyondBoundsInfo");
        iVar.x(1245943849);
        m2.q qVar = (m2.q) iVar.G(o0.j());
        Object[] objArr = {g0Var, jVar, Boolean.valueOf(z10), qVar};
        iVar.x(-568225417);
        boolean z11 = false;
        for (int i11 = 0; i11 < 4; i11++) {
            z11 |= iVar.P(objArr[i11]);
        }
        Object y10 = iVar.y();
        if (z11 || y10 == l0.i.f39065a.a()) {
            y10 = new k(g0Var, jVar, z10, qVar);
            iVar.q(y10);
        }
        iVar.O();
        x0.f L = fVar.L((x0.f) y10);
        iVar.O();
        return L;
    }

    public static final Void c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
    }
}
