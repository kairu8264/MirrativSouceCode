package c0;

import wn.v;

/* loaded from: classes.dex */
public interface e {
    static /* synthetic */ Object b(e eVar, b1.h hVar, ao.d dVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                hVar = null;
            }
            return eVar.a(hVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
    }

    Object a(b1.h hVar, ao.d<? super v> dVar);
}
