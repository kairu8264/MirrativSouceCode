package ai;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jv0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, mv0> f5932a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, lv0> f5933b;

    public jv0(Map<String, mv0> map, Map<String, lv0> map2) {
        this.f5932a = map;
        this.f5933b = map2;
    }

    public final void a(sl2 sl2Var) throws Exception {
        for (ql2 ql2Var : sl2Var.f9876b.f9498c) {
            if (this.f5932a.containsKey(ql2Var.f9004a)) {
                this.f5932a.get(ql2Var.f9004a).u(ql2Var.f9005b);
            } else if (this.f5933b.containsKey(ql2Var.f9004a)) {
                lv0 lv0Var = this.f5933b.get(ql2Var.f9004a);
                JSONObject jSONObject = ql2Var.f9005b;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                lv0Var.a(hashMap);
            }
        }
    }
}
