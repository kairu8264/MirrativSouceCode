package yo;

/* loaded from: classes4.dex */
public interface n<T> extends xo.c<T> {

    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ xo.c a(n nVar, ao.g gVar, int i10, wo.h hVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    gVar = ao.h.f16651w;
                }
                if ((i11 & 2) != 0) {
                    i10 = -3;
                }
                if ((i11 & 4) != 0) {
                    hVar = wo.h.SUSPEND;
                }
                return nVar.d(gVar, i10, hVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    xo.c<T> d(ao.g gVar, int i10, wo.h hVar);
}
