package ai;

import java.lang.Throwable;

/* loaded from: classes3.dex */
public final class k23<V, X extends Throwable> extends l23<V, X, bx2<? super X, ? extends V>, V> {
    public k23(s43<? extends V> s43Var, Class<X> cls, bx2<? super X, ? extends V> bx2Var) {
        super(s43Var, cls, bx2Var);
    }

    @Override // ai.l23
    public final void F(V v10) {
        u(v10);
    }

    @Override // ai.l23
    public final /* bridge */ /* synthetic */ Object G(Object obj, Throwable th2) throws Exception {
        return ((bx2) obj).apply(th2);
    }
}
