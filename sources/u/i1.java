package u;

import u.j1;
import u.p;

/* loaded from: classes.dex */
public interface i1<V extends p> extends j1<V> {

    /* loaded from: classes.dex */
    public static final class a {
        public static <V extends p> long a(i1<V> i1Var, V v10, V v11, V v12) {
            jo.p.h(i1Var, "this");
            jo.p.h(v10, "initialValue");
            jo.p.h(v11, "targetValue");
            jo.p.h(v12, "initialVelocity");
            return (i1Var.b() + i1Var.c()) * 1000000;
        }

        public static <V extends p> V b(i1<V> i1Var, V v10, V v11, V v12) {
            jo.p.h(i1Var, "this");
            jo.p.h(v10, "initialValue");
            jo.p.h(v11, "targetValue");
            jo.p.h(v12, "initialVelocity");
            return (V) j1.a.a(i1Var, v10, v11, v12);
        }

        public static <V extends p> boolean c(i1<V> i1Var) {
            jo.p.h(i1Var, "this");
            return j1.a.b(i1Var);
        }
    }

    int b();

    int c();
}
