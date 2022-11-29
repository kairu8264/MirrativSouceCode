package o7;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final Map<m7.e, l<?>> f44240a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<m7.e, l<?>> f44241b = new HashMap();

    public l<?> a(m7.e eVar, boolean z10) {
        return b(z10).get(eVar);
    }

    public final Map<m7.e, l<?>> b(boolean z10) {
        return z10 ? this.f44241b : this.f44240a;
    }

    public void c(m7.e eVar, l<?> lVar) {
        b(lVar.p()).put(eVar, lVar);
    }

    public void d(m7.e eVar, l<?> lVar) {
        Map<m7.e, l<?>> b10 = b(lVar.p());
        if (lVar.equals(b10.get(eVar))) {
            b10.remove(eVar);
        }
    }
}
