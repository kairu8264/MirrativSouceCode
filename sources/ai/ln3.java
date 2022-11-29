package ai;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public class ln3<K, V, V2> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, eo3<V>> f6629a;

    public ln3(int i10) {
        this.f6629a = nn3.c(i10);
    }

    public final ln3<K, V, V2> a(K k10, eo3<V> eo3Var) {
        LinkedHashMap<K, eo3<V>> linkedHashMap = this.f6629a;
        zn3.a(k10, "key");
        zn3.a(eo3Var, "provider");
        linkedHashMap.put(k10, eo3Var);
        return this;
    }
}
