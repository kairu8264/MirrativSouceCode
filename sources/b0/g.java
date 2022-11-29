package b0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import q1.a1;

/* loaded from: classes.dex */
public final class g implements a1 {

    /* renamed from: a  reason: collision with root package name */
    public final e f16684a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Object, Integer> f16685b;

    public g(e eVar) {
        jo.p.h(eVar, "factory");
        this.f16684a = eVar;
        this.f16685b = new LinkedHashMap();
    }

    @Override // q1.a1
    public void a(a1.a aVar) {
        jo.p.h(aVar, "slotIds");
        this.f16685b.clear();
        Iterator<Object> it = aVar.iterator();
        while (it.hasNext()) {
            Object c10 = this.f16684a.c(it.next());
            Integer num = this.f16685b.get(c10);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                this.f16685b.put(c10, Integer.valueOf(intValue + 1));
            }
        }
    }

    @Override // q1.a1
    public boolean b(Object obj, Object obj2) {
        return jo.p.c(this.f16684a.c(obj), this.f16684a.c(obj2));
    }
}
