package y;

import x0.a;

/* loaded from: classes.dex */
public interface q {
    static /* synthetic */ x0.f c(q qVar, x0.f fVar, float f10, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return qVar.a(fVar, f10, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
    }

    x0.f a(x0.f fVar, float f10, boolean z10);

    x0.f b(x0.f fVar, a.b bVar);
}
