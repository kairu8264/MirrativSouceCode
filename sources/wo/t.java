package wo;

import uo.j0;
import uo.q0;
import uo.s0;

/* loaded from: classes4.dex */
public final class t {
    public static final <E> x<E> a(q0 q0Var, ao.g gVar, int i10, h hVar, s0 s0Var, io.l<? super Throwable, wn.v> lVar, io.p<? super v<? super E>, ? super ao.d<? super wn.v>, ? extends Object> pVar) {
        u uVar = new u(j0.e(q0Var, gVar), l.b(i10, hVar, null, 4, null));
        if (lVar != null) {
            uVar.p(lVar);
        }
        uVar.Y0(s0Var, uVar, pVar);
        return uVar;
    }

    public static /* synthetic */ x b(q0 q0Var, ao.g gVar, int i10, h hVar, s0 s0Var, io.l lVar, io.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = ao.h.f16651w;
        }
        ao.g gVar2 = gVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            hVar = h.SUSPEND;
        }
        h hVar2 = hVar;
        if ((i11 & 8) != 0) {
            s0Var = s0.DEFAULT;
        }
        s0 s0Var2 = s0Var;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        return a(q0Var, gVar2, i12, hVar2, s0Var2, lVar, pVar);
    }
}
