package ai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class a03<K, V> extends f03<K, V> {
    public final a03<K, V> a(K k10, V... vArr) {
        List<V> asList = Arrays.asList(vArr);
        Collection<V> collection = this.f3872a.get(k10);
        if (collection != null) {
            for (V v10 : asList) {
                xy2.a(k10, v10);
                collection.add(v10);
            }
        } else {
            Iterator it = asList.iterator();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    Object next = it.next();
                    xy2.a(k10, next);
                    arrayList.add(next);
                }
                this.f3872a.put(k10, arrayList);
            }
        }
        return this;
    }

    public final b03<K, V> b() {
        Set<Map.Entry<K, Collection<V>>> entrySet = this.f3872a.entrySet();
        if (entrySet.isEmpty()) {
            return oz2.B;
        }
        c03 c03Var = new c03(entrySet.size());
        int i10 = 0;
        for (Map.Entry<K, Collection<V>> entry : entrySet) {
            K key = entry.getKey();
            zz2 A = zz2.A(entry.getValue());
            if (!A.isEmpty()) {
                c03Var.a(key, A);
                i10 += A.size();
            }
        }
        return new b03<>(c03Var.c(), i10);
    }
}
