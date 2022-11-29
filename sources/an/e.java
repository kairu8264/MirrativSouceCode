package an;

import xm.p;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public final class e implements u {

    /* renamed from: w  reason: collision with root package name */
    public final zm.c f13936w;

    public e(zm.c cVar) {
        this.f13936w = cVar;
    }

    public t<?> a(zm.c cVar, xm.e eVar, en.a<?> aVar, ym.b bVar) {
        t<?> lVar;
        Object a10 = cVar.a(en.a.get((Class) bVar.value())).a();
        if (a10 instanceof t) {
            lVar = (t) a10;
        } else if (a10 instanceof u) {
            lVar = ((u) a10).b(eVar, aVar);
        } else {
            boolean z10 = a10 instanceof p;
            if (!z10 && !(a10 instanceof xm.j)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a10.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            lVar = new l<>(z10 ? (p) a10 : null, a10 instanceof xm.j ? (xm.j) a10 : null, eVar, aVar, null);
        }
        return (lVar == null || !bVar.nullSafe()) ? lVar : lVar.nullSafe();
    }

    @Override // xm.u
    public <T> t<T> b(xm.e eVar, en.a<T> aVar) {
        ym.b bVar = (ym.b) aVar.getRawType().getAnnotation(ym.b.class);
        if (bVar == null) {
            return null;
        }
        return (t<T>) a(this.f13936w, eVar, aVar, bVar);
    }
}
