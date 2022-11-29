package wo;

/* loaded from: classes4.dex */
public final class l {
    public static final <E> i<E> a(int i10, h hVar, io.l<? super E, wn.v> lVar) {
        if (i10 == -2) {
            return new e(hVar == h.SUSPEND ? i.f59275t.a() : 1, hVar, lVar);
        } else if (i10 == -1) {
            if ((hVar != h.SUSPEND ? 0 : 1) != 0) {
                return new r(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i10 == 0) {
            if (hVar == h.SUSPEND) {
                return new z(lVar);
            }
            return new e(1, hVar, lVar);
        } else if (i10 != Integer.MAX_VALUE) {
            if (i10 == 1 && hVar == h.DROP_OLDEST) {
                return new r(lVar);
            }
            return new e(i10, hVar, lVar);
        } else {
            return new s(lVar);
        }
    }

    public static /* synthetic */ i b(int i10, h hVar, io.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            hVar = h.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, hVar, lVar);
    }
}
