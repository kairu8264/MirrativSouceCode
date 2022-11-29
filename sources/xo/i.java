package xo;

import yo.n;

/* loaded from: classes4.dex */
public final /* synthetic */ class i {
    public static final <T> c<T> a(c<? extends T> cVar, int i10, wo.h hVar) {
        int i11;
        wo.h hVar2;
        boolean z10 = true;
        if (i10 >= 0 || i10 == -2 || i10 == -1) {
            if (i10 == -1 && hVar != wo.h.SUSPEND) {
                z10 = false;
            }
            if (z10) {
                if (i10 == -1) {
                    hVar2 = wo.h.DROP_OLDEST;
                    i11 = 0;
                } else {
                    i11 = i10;
                    hVar2 = hVar;
                }
                return cVar instanceof yo.n ? n.a.a((yo.n) cVar, null, i11, hVar2, 1, null) : new yo.g(cVar, null, i11, hVar2, 2, null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(jo.p.o("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", Integer.valueOf(i10)).toString());
    }

    public static /* synthetic */ c b(c cVar, int i10, wo.h hVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            hVar = wo.h.SUSPEND;
        }
        return e.d(cVar, i10, hVar);
    }
}
