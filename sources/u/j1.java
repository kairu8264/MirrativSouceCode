package u;

import u.f1;
import u.p;

/* loaded from: classes.dex */
public interface j1<V extends p> extends f1<V> {

    /* loaded from: classes.dex */
    public static final class a {
        public static <V extends p> V a(j1<V> j1Var, V v10, V v11, V v12) {
            jo.p.h(j1Var, "this");
            jo.p.h(v10, "initialValue");
            jo.p.h(v11, "targetValue");
            jo.p.h(v12, "initialVelocity");
            return (V) f1.a.a(j1Var, v10, v11, v12);
        }

        public static <V extends p> boolean b(j1<V> j1Var) {
            jo.p.h(j1Var, "this");
            return false;
        }
    }
}
