package ao;

import ao.e;
import io.p;
import jo.q;

/* loaded from: classes4.dex */
public interface g {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: ao.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0088a extends q implements p<g, b, g> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0088a f16650w = new C0088a();

            public C0088a() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final g invoke(g gVar, b bVar) {
                ao.c cVar;
                jo.p.h(gVar, "acc");
                jo.p.h(bVar, "element");
                g minusKey = gVar.minusKey(bVar.getKey());
                h hVar = h.f16651w;
                if (minusKey == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.f16648d;
                e eVar = (e) minusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new ao.c(minusKey, bVar);
                } else {
                    g minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == hVar) {
                        return new ao.c(bVar, eVar);
                    }
                    cVar = new ao.c(new ao.c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            jo.p.h(gVar2, "context");
            return gVar2 == h.f16651w ? gVar : (g) gVar2.fold(gVar, C0088a.f16650w);
        }
    }

    /* loaded from: classes4.dex */
    public interface b extends g {

        /* loaded from: classes4.dex */
        public static final class a {
            public static <R> R a(b bVar, R r10, p<? super R, ? super b, ? extends R> pVar) {
                jo.p.h(pVar, "operation");
                return pVar.invoke(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                jo.p.h(cVar, "key");
                if (jo.p.c(bVar.getKey(), cVar)) {
                    jo.p.f(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            public static g c(b bVar, c<?> cVar) {
                jo.p.h(cVar, "key");
                return jo.p.c(bVar.getKey(), cVar) ? h.f16651w : bVar;
            }

            public static g d(b bVar, g gVar) {
                jo.p.h(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        @Override // ao.g
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* loaded from: classes4.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r10, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}
