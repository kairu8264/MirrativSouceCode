package yo;

import jo.j0;
import zo.o0;

/* loaded from: classes4.dex */
public final class e {
    public static final /* synthetic */ xo.d a(xo.d dVar, ao.g gVar) {
        return d(dVar, gVar);
    }

    public static final <T, V> Object b(ao.g gVar, V v10, Object obj, io.p<? super V, ? super ao.d<? super T>, ? extends Object> pVar, ao.d<? super T> dVar) {
        Object c10 = o0.c(gVar, obj);
        try {
            Object invoke = ((io.p) j0.e(pVar, 2)).invoke(v10, new v(dVar, gVar));
            o0.a(gVar, c10);
            if (invoke == bo.c.c()) {
                co.h.c(dVar);
            }
            return invoke;
        } catch (Throwable th2) {
            o0.a(gVar, c10);
            throw th2;
        }
    }

    public static /* synthetic */ Object c(ao.g gVar, Object obj, Object obj2, io.p pVar, ao.d dVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = o0.b(gVar);
        }
        return b(gVar, obj, obj2, pVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> xo.d<T> d(xo.d<? super T> dVar, ao.g gVar) {
        return dVar instanceof u ? true : dVar instanceof p ? dVar : new x(dVar, gVar);
    }
}
