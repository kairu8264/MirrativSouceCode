package ao;

import ao.g;
import jo.p;

/* loaded from: classes4.dex */
public interface e extends g.b {

    /* renamed from: d  reason: collision with root package name */
    public static final b f16648d = b.f16649w;

    /* loaded from: classes4.dex */
    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> cVar) {
            p.h(cVar, "key");
            if (cVar instanceof ao.b) {
                ao.b bVar = (ao.b) cVar;
                if (bVar.a(eVar.getKey())) {
                    E e10 = (E) bVar.b(eVar);
                    if (e10 instanceof g.b) {
                        return e10;
                    }
                    return null;
                }
                return null;
            } else if (e.f16648d == cVar) {
                p.f(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            } else {
                return null;
            }
        }

        public static g b(e eVar, g.c<?> cVar) {
            p.h(cVar, "key");
            if (!(cVar instanceof ao.b)) {
                return e.f16648d == cVar ? h.f16651w : eVar;
            }
            ao.b bVar = (ao.b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f16651w;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements g.c<e> {

        /* renamed from: w  reason: collision with root package name */
        public static final /* synthetic */ b f16649w = new b();
    }

    <T> d<T> U(d<? super T> dVar);

    void v(d<?> dVar);
}
