package qn;

import androidx.compose.ui.platform.o0;
import io.p;
import io.q;
import t.d0;
import u.w;
import z.g0;

/* loaded from: classes4.dex */
public final class a {
    public static final b a(g0 g0Var, p<? super h, ? super i, Integer> pVar, float f10, l0.i iVar, int i10, int i11) {
        jo.p.h(g0Var, "lazyListState");
        iVar.x(-1050829263);
        if ((i11 & 2) != 0) {
            pVar = d.f49617a.a();
        }
        p<? super h, ? super i, Integer> pVar2 = pVar;
        if ((i11 & 4) != 0) {
            f10 = m2.g.l(0);
        }
        iVar.x(-3686552);
        boolean P = iVar.P(g0Var) | iVar.P(pVar2);
        Object y10 = iVar.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = new b(g0Var, pVar2, 0, 4, null);
            iVar.q(y10);
        }
        iVar.O();
        b bVar = (b) y10;
        bVar.o(((m2.d) iVar.G(o0.e())).X(f10));
        iVar.O();
        return bVar;
    }

    public static final e b(g0 g0Var, p<? super h, ? super i, Integer> pVar, float f10, w<Float> wVar, u.i<Float> iVar, q<? super h, ? super Integer, ? super Integer, Integer> qVar, l0.i iVar2, int i10, int i11) {
        jo.p.h(g0Var, "lazyListState");
        jo.p.h(qVar, "snapIndex");
        iVar2.x(-632875458);
        p<h, i, Integer> a10 = (i11 & 2) != 0 ? d.f49617a.a() : pVar;
        float l10 = (i11 & 4) != 0 ? m2.g.l(0) : f10;
        e a11 = g.a(a(g0Var, a10, l10, iVar2, (i10 & 14) | (i10 & 112) | (i10 & 896), 0), (i11 & 8) != 0 ? d0.b(iVar2, 0) : wVar, (i11 & 16) != 0 ? f.f49650a.b() : iVar, qVar, iVar2, ((i10 >> 6) & 7168) | 576, 0);
        iVar2.O();
        return a11;
    }
}
