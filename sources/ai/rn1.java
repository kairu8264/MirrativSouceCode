package ai;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rn1 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Map<String, JSONObject>> f9508a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f9509b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f9510c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9511d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f9512e;

    public rn1(Executor executor) {
        this.f9510c = executor;
    }

    public final void a() {
        wg.t.h().p().f(new Runnable(this) { // from class: ai.on1

            /* renamed from: w  reason: collision with root package name */
            public final rn1 f7867w;

            {
                this.f7867w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7867w.e();
            }
        });
        this.f9510c.execute(new Runnable(this) { // from class: ai.pn1

            /* renamed from: w  reason: collision with root package name */
            public final rn1 f8481w;

            {
                this.f8481w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8481w.d();
            }
        });
    }

    public final JSONObject b(String str, String str2) {
        if (!((Boolean) ft.c().c(ox.f8103u2)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f9511d) {
            f();
        }
        Map<String, JSONObject> map = this.f9508a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String a10 = tn1.a(this.f9512e, str, str2);
        if (a10 == null) {
            return null;
        }
        return map.get(a10);
    }

    public final JSONObject c() {
        if (((Boolean) ft.c().c(ox.f8111v2)).booleanValue()) {
            return this.f9509b;
        }
        return null;
    }

    public final /* synthetic */ void e() {
        this.f9510c.execute(new Runnable(this) { // from class: ai.qn1

            /* renamed from: w  reason: collision with root package name */
            public final rn1 f9015w;

            {
                this.f9015w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9015w.f();
            }
        });
    }

    /* renamed from: g */
    public final synchronized void f() {
        Map<String, JSONObject> map;
        this.f9511d = true;
        zi0 n10 = wg.t.h().p().n();
        if (n10 == null) {
            return;
        }
        JSONObject g10 = n10.g();
        if (g10 == null) {
            return;
        }
        this.f9509b = ((Boolean) ft.c().c(ox.f8111v2)).booleanValue() ? g10.optJSONObject("common_settings") : null;
        this.f9512e = g10.optJSONObject("ad_unit_patterns");
        JSONArray optJSONArray = g10.optJSONArray("ad_unit_id_settings");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("ad_unit_id");
                    String optString2 = optJSONObject.optString("format");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                    if (optString != null && optJSONObject2 != null && optString2 != null) {
                        if (this.f9508a.containsKey(optString2)) {
                            map = this.f9508a.get(optString2);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            this.f9508a.put(optString2, concurrentHashMap);
                            map = concurrentHashMap;
                        }
                        map.put(optString, optJSONObject2);
                    }
                }
            }
        }
    }
}
