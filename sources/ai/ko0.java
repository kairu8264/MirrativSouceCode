package ai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ko0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<xi> f6292a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f6293b;

    public final long a() {
        Iterator<xi> it = this.f6292a.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> c10 = it.next().c();
            if (c10 != null) {
                for (Map.Entry<String, List<String>> entry : c10.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase(entry.getKey())) {
                            this.f6293b = Math.max(this.f6293b, Long.parseLong(entry.getValue().get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f6293b;
    }

    public final void b(xi xiVar) {
        this.f6292a.add(xiVar);
    }
}
