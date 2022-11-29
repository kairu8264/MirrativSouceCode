package ai;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class b2<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, AtomicReference<T>> f2199a = new HashMap();

    public final AtomicReference<T> a(String str) {
        synchronized (this) {
            if (!this.f2199a.containsKey(str)) {
                this.f2199a.put(str, new AtomicReference<>());
            }
        }
        return this.f2199a.get(str);
    }
}
