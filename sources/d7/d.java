package d7;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class d {
    public static <T> List<g7.a<T>> a(e7.c cVar, float f10, s6.d dVar, m0<T> m0Var) throws IOException {
        return u.a(cVar, dVar, f10, m0Var, false);
    }

    public static <T> List<g7.a<T>> b(e7.c cVar, s6.d dVar, m0<T> m0Var) throws IOException {
        return u.a(cVar, dVar, 1.0f, m0Var, false);
    }

    public static z6.a c(e7.c cVar, s6.d dVar) throws IOException {
        return new z6.a(b(cVar, dVar, g.f29246a));
    }

    public static z6.j d(e7.c cVar, s6.d dVar) throws IOException {
        return new z6.j(b(cVar, dVar, i.f29251a));
    }

    public static z6.b e(e7.c cVar, s6.d dVar) throws IOException {
        return f(cVar, dVar, true);
    }

    public static z6.b f(e7.c cVar, s6.d dVar, boolean z10) throws IOException {
        return new z6.b(a(cVar, z10 ? f7.h.e() : 1.0f, dVar, l.f29269a));
    }

    public static z6.c g(e7.c cVar, s6.d dVar, int i10) throws IOException {
        return new z6.c(b(cVar, dVar, new o(i10)));
    }

    public static z6.d h(e7.c cVar, s6.d dVar) throws IOException {
        return new z6.d(b(cVar, dVar, r.f29280a));
    }

    public static z6.f i(e7.c cVar, s6.d dVar) throws IOException {
        return new z6.f(u.a(cVar, dVar, f7.h.e(), b0.f29236a, true));
    }

    public static z6.g j(e7.c cVar, s6.d dVar) throws IOException {
        return new z6.g(b(cVar, dVar, f0.f29245a));
    }

    public static z6.h k(e7.c cVar, s6.d dVar) throws IOException {
        return new z6.h(a(cVar, f7.h.e(), dVar, g0.f29247a));
    }
}
