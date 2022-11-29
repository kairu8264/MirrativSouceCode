package o6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xn.a0;
import xn.n0;

/* loaded from: classes.dex */
public final class c {
    public static final <T> List<T> a(List<? extends T> list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableList(new ArrayList(list));
            }
            return Collections.singletonList(a0.X(list));
        }
        return xn.s.k();
    }

    public static final <K, V> Map<K, V> b(Map<K, ? extends V> map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableMap(new LinkedHashMap(map));
            }
            Map.Entry entry = (Map.Entry) a0.W(map.entrySet());
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        return n0.e();
    }
}
