package zq;

import io.l;
import jo.p;
import wn.v;

/* loaded from: classes4.dex */
public final class b {
    public static final tq.a a(boolean z10, l<? super tq.a, v> lVar) {
        p.h(lVar, "moduleDeclaration");
        tq.a aVar = new tq.a(z10);
        lVar.invoke(aVar);
        return aVar;
    }

    public static /* synthetic */ tq.a b(boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10, lVar);
    }
}
