package yo;

import kotlinx.coroutines.flow.internal.ChildCancelledException;
import zo.g0;

/* loaded from: classes4.dex */
public final class k<T> extends g0<T> {
    public k(ao.g gVar, ao.d<? super T> dVar) {
        super(gVar, dVar);
    }

    @Override // uo.k2
    public boolean a0(Throwable th2) {
        if (th2 instanceof ChildCancelledException) {
            return true;
        }
        return V(th2);
    }
}
