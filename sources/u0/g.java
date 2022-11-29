package u0;

import io.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo.p;
import so.n;
import u0.f;
import xn.n0;
import xn.s;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final l<Object, Boolean> f54253a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<Object>> f54254b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, List<io.a<Object>>> f54255c;

    /* loaded from: classes.dex */
    public static final class a implements f.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f54257b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ io.a<Object> f54258c;

        public a(String str, io.a<? extends Object> aVar) {
            this.f54257b = str;
            this.f54258c = aVar;
        }

        @Override // u0.f.a
        public void a() {
            List list = (List) g.this.f54255c.remove(this.f54257b);
            if (list != null) {
                list.remove(this.f54258c);
            }
            if (list == null || !(!list.isEmpty())) {
                return;
            }
            g.this.f54255c.put(this.f54257b, list);
        }
    }

    public g(Map<String, ? extends List<? extends Object>> map, l<Object, Boolean> lVar) {
        Map<String, List<Object>> linkedHashMap;
        p.h(lVar, "canBeSaved");
        this.f54253a = lVar;
        this.f54254b = (map == null || (linkedHashMap = n0.p(map)) == null) ? new LinkedHashMap<>() : linkedHashMap;
        this.f54255c = new LinkedHashMap();
    }

    @Override // u0.f
    public boolean a(Object obj) {
        p.h(obj, "value");
        return this.f54253a.invoke(obj).booleanValue();
    }

    @Override // u0.f
    public f.a b(String str, io.a<? extends Object> aVar) {
        p.h(str, "key");
        p.h(aVar, "valueProvider");
        if (!n.r(str)) {
            Map<String, List<io.a<Object>>> map = this.f54255c;
            List<io.a<Object>> list = map.get(str);
            if (list == null) {
                list = new ArrayList<>();
                map.put(str, list);
            }
            list.add(aVar);
            return new a(str, aVar);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }

    @Override // u0.f
    public Map<String, List<Object>> c() {
        Map<String, List<Object>> p10 = n0.p(this.f54254b);
        for (Map.Entry<String, List<io.a<Object>>> entry : this.f54255c.entrySet()) {
            String key = entry.getKey();
            List<io.a<Object>> value = entry.getValue();
            if (value.size() == 1) {
                Object invoke = value.get(0).invoke();
                if (invoke == null) {
                    continue;
                } else if (a(invoke)) {
                    p10.put(key, s.e(invoke));
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object invoke2 = value.get(i10).invoke();
                    if (invoke2 != null && !a(invoke2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(invoke2);
                }
                p10.put(key, arrayList);
            }
        }
        return p10;
    }

    @Override // u0.f
    public Object d(String str) {
        p.h(str, "key");
        List<Object> remove = this.f54254b.remove(str);
        if (remove == null || !(!remove.isEmpty())) {
            return null;
        }
        if (remove.size() > 1) {
            this.f54254b.put(str, remove.subList(1, remove.size()));
        }
        return remove.get(0);
    }
}
