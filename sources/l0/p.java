package l0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a */
    public static final Object f39229a = new Object();

    public static final l a(e<?> eVar, m mVar) {
        jo.p.h(eVar, "applier");
        jo.p.h(mVar, "parent");
        return new o(mVar, eVar, null, 4, null);
    }

    public static final /* synthetic */ void b(m0.b bVar, Object obj, Object obj2) {
        d(bVar, obj, obj2);
    }

    public static final /* synthetic */ Object c() {
        return f39229a;
    }

    public static final <K, V> void d(m0.b<K, m0.c<V>> bVar, K k10, V v10) {
        if (bVar.a(k10)) {
            m0.c<V> d10 = bVar.d(k10);
            if (d10 != null) {
                d10.add(v10);
                return;
            }
            return;
        }
        m0.c<V> cVar = new m0.c<>();
        cVar.add(v10);
        wn.v vVar = wn.v.f59242a;
        bVar.j(k10, cVar);
    }
}
