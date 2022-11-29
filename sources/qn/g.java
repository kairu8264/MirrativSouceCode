package qn;

import io.q;
import jo.p;
import t.d0;
import u.w;

/* loaded from: classes4.dex */
public final class g {
    public static final e a(h hVar, w<Float> wVar, u.i<Float> iVar, q<? super h, ? super Integer, ? super Integer, Integer> qVar, l0.i iVar2, int i10, int i11) {
        p.h(hVar, "layoutInfo");
        p.h(qVar, "snapIndex");
        iVar2.x(-632874525);
        int i12 = 0;
        if ((i11 & 2) != 0) {
            wVar = d0.b(iVar2, 0);
        }
        if ((i11 & 4) != 0) {
            iVar = f.f49650a.b();
        }
        Object[] objArr = {hVar, wVar, iVar, qVar};
        iVar2.x(-3685570);
        boolean z10 = false;
        while (i12 < 4) {
            Object obj = objArr[i12];
            i12++;
            z10 |= iVar2.P(obj);
        }
        Object y10 = iVar2.y();
        if (z10 || y10 == l0.i.f39065a.a()) {
            y10 = new e(hVar, wVar, iVar, qVar);
            iVar2.q(y10);
        }
        iVar2.O();
        e eVar = (e) y10;
        iVar2.O();
        return eVar;
    }
}
