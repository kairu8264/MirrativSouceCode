package ai;

import java.lang.Throwable;

/* loaded from: classes3.dex */
public final class j23<V, X extends Throwable> extends l23<V, X, p33<? super X, ? extends V>, s43<? extends V>> {
    public j23(s43<? extends V> s43Var, Class<X> cls, p33<? super X, ? extends V> p33Var) {
        super(s43Var, cls, p33Var);
    }

    @Override // ai.l23
    public final /* bridge */ /* synthetic */ void F(Object obj) {
        w((s43) obj);
    }

    @Override // ai.l23
    public final /* bridge */ /* synthetic */ Object G(Object obj, Throwable th2) throws Exception {
        p33 p33Var = (p33) obj;
        s43 a10 = p33Var.a(th2);
        lx2.d(a10, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", p33Var);
        return a10;
    }
}
