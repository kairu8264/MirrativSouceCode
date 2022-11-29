package v4;

/* loaded from: classes.dex */
public abstract class s<T> extends w0 {
    public s(q0 q0Var) {
        super(q0Var);
    }

    public abstract void g(z4.k kVar, T t10);

    public final void h(T t10) {
        z4.k a10 = a();
        try {
            g(a10, t10);
            a10.K0();
        } finally {
            f(a10);
        }
    }
}
