package uo;

/* loaded from: classes4.dex */
public final class z<T> extends k2 implements y<T>, cp.c<T> {
    public z(d2 d2Var) {
        super(true);
        q0(d2Var);
    }

    @Override // uo.y
    public boolean F(T t10) {
        return v0(t10);
    }

    @Override // uo.y
    public boolean a(Throwable th2) {
        return v0(new d0(th2, false, 2, null));
    }

    @Override // uo.y0
    public T e() {
        return (T) g0();
    }

    @Override // uo.k2
    public boolean k0() {
        return true;
    }

    @Override // cp.c
    public <R> void m(cp.d<? super R> dVar, io.p<? super T, ? super ao.d<? super R>, ? extends Object> pVar) {
        H0(dVar, pVar);
    }

    @Override // uo.y0
    public Object o(ao.d<? super T> dVar) {
        return J(dVar);
    }
}
