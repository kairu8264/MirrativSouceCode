package qq;

import jo.p;

/* loaded from: classes4.dex */
public final class b {
    public static final String a(qo.b<?> bVar, vq.a aVar, vq.a aVar2) {
        String value;
        p.h(bVar, "clazz");
        p.h(aVar2, "scopeQualifier");
        String str = "";
        if (aVar != null && (value = aVar.getValue()) != null) {
            str = value;
        }
        return ar.a.a(bVar) + ':' + str + ':' + aVar2;
    }
}
