package ai;

/* loaded from: classes3.dex */
public final class c33<I, O> extends f33<I, O, p33<? super I, ? extends O>, s43<? extends O>> {
    public c33(s43<? extends I> s43Var, p33<? super I, ? extends O> p33Var) {
        super(s43Var, p33Var);
    }

    @Override // ai.f33
    public final /* bridge */ /* synthetic */ void F(Object obj) {
        w((s43) obj);
    }

    @Override // ai.f33
    public final /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) throws Exception {
        p33 p33Var = (p33) obj;
        s43<O> a10 = p33Var.a(obj2);
        lx2.d(a10, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", p33Var);
        return a10;
    }
}
