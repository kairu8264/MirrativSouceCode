package wo;

import uo.n0;
import wo.b0;

/* loaded from: classes4.dex */
public final class u<E> extends j<E> implements v<E> {
    public u(ao.g gVar, i<E> iVar) {
        super(gVar, iVar, true, true);
    }

    @Override // uo.a
    public void W0(Throwable th2, boolean z10) {
        if (Z0().x(th2) || z10) {
            return;
        }
        n0.a(getContext(), th2);
    }

    @Override // uo.a
    /* renamed from: a1 */
    public void X0(wn.v vVar) {
        b0.a.a(Z0(), null, 1, null);
    }

    @Override // uo.a, uo.k2, uo.d2
    public boolean isActive() {
        return super.isActive();
    }
}
