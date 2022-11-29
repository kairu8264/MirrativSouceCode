package u;

import u.p;

/* loaded from: classes.dex */
public interface d<T, V extends p> {

    /* loaded from: classes.dex */
    public static final class a {
        public static <T, V extends p> boolean a(d<T, V> dVar, long j10) {
            jo.p.h(dVar, "this");
            return j10 >= dVar.d();
        }
    }

    boolean a();

    V b(long j10);

    boolean c(long j10);

    long d();

    c1<T, V> e();

    T f(long j10);

    T g();
}
