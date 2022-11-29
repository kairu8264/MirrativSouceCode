package ai;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class x03 {
    public static <V> V a(Map<?, V> map, Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }
}
