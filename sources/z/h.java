package z;

/* loaded from: classes.dex */
public interface h {
    static /* synthetic */ x0.f a(h hVar, x0.f fVar, float f10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                f10 = 1.0f;
            }
            return hVar.c(fVar, f10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
    }

    static /* synthetic */ x0.f b(h hVar, x0.f fVar, float f10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                f10 = 1.0f;
            }
            return hVar.d(fVar, f10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
    }

    x0.f c(x0.f fVar, float f10);

    x0.f d(x0.f fVar, float f10);
}
