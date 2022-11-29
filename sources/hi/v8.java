package hi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class v8 extends j {

    /* renamed from: y  reason: collision with root package name */
    public final c f36030y;

    public v8(c cVar) {
        super("internal.eventLogger");
        this.f36030y = cVar;
    }

    @Override // hi.j
    public final q a(u4 u4Var, List<q> list) {
        Map<String, Object> hashMap;
        v5.h(this.f35817w, 3, list);
        String h10 = u4Var.b(list.get(0)).h();
        long a10 = (long) v5.a(u4Var.b(list.get(1)).e().doubleValue());
        q b10 = u4Var.b(list.get(2));
        if (b10 instanceof n) {
            hashMap = v5.g((n) b10);
        } else {
            hashMap = new HashMap<>();
        }
        this.f36030y.e(h10, a10, hashMap);
        return q.f35921f;
    }
}
