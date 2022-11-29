package xn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class p0 extends o0 {
    public static final <K, V> List<wn.k<K, V>> q(Map<? extends K, ? extends V> map) {
        jo.p.h(map, "<this>");
        if (map.size() == 0) {
            return s.k();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return s.k();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return r.d(new wn.k(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new wn.k(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new wn.k(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
