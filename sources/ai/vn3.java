package ai;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class vn3<K, V> extends mn3<K, V, V> {

    /* renamed from: b  reason: collision with root package name */
    public static final eo3<Map<Object, Object>> f11136b = sn3.a(Collections.emptyMap());

    public /* synthetic */ vn3(Map map, tn3 tn3Var) {
        super(map);
    }

    public static <K, V> un3<K, V> b(int i10) {
        return new un3<>(i10, null);
    }

    @Override // ai.eo3
    /* renamed from: c */
    public final Map<K, V> zzb() {
        LinkedHashMap c10 = nn3.c(a().size());
        for (Map.Entry<K, eo3<V>> entry : a().entrySet()) {
            c10.put(entry.getKey(), entry.getValue().zzb());
        }
        return Collections.unmodifiableMap(c10);
    }
}
