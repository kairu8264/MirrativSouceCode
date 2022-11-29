package u;

import u.p;

/* loaded from: classes.dex */
public interface f1<V extends p> {

    /* loaded from: classes.dex */
    public static final class a {
        public static <V extends p> V a(f1<V> f1Var, V v10, V v11, V v12) {
            jo.p.h(f1Var, "this");
            jo.p.h(v10, "initialValue");
            jo.p.h(v11, "targetValue");
            jo.p.h(v12, "initialVelocity");
            return f1Var.e(f1Var.g(v10, v11, v12), v10, v11, v12);
        }
    }

    boolean a();

    V d(V v10, V v11, V v12);

    V e(long j10, V v10, V v11, V v12);

    V f(long j10, V v10, V v11, V v12);

    long g(V v10, V v11, V v12);
}
