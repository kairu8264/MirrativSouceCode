package a1;

import a1.c;
import q1.c;

/* loaded from: classes.dex */
public final class a {
    public static final <T> T a(j jVar, int i10, io.l<? super c.a, ? extends T> lVar) {
        int c10;
        jo.p.h(jVar, "$this$searchBeyondBounds");
        jo.p.h(lVar, "block");
        q1.c c11 = jVar.c();
        if (c11 != null) {
            c.a aVar = c.f288b;
            if (c.l(i10, aVar.h())) {
                c10 = c.b.f48551a.a();
            } else if (c.l(i10, aVar.a())) {
                c10 = c.b.f48551a.d();
            } else if (c.l(i10, aVar.c())) {
                c10 = c.b.f48551a.e();
            } else if (c.l(i10, aVar.g())) {
                c10 = c.b.f48551a.f();
            } else if (c.l(i10, aVar.d())) {
                c10 = c.b.f48551a.b();
            } else if (!c.l(i10, aVar.f())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            } else {
                c10 = c.b.f48551a.c();
            }
            return (T) c11.a(c10, lVar);
        }
        return null;
    }
}
