package ai;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pe2 implements wc2<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final String f8399a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8400b;

    public pe2(String str, String str2) {
        this.f8399a = str;
        this.f8400b = str2;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(JSONObject jSONObject) {
        try {
            JSONObject g10 = yg.y0.g(jSONObject, "pii");
            g10.put("doritos", this.f8399a);
            g10.put("doritos_v2", this.f8400b);
        } catch (JSONException unused) {
            yg.p1.k("Failed putting doritos string.");
        }
    }
}
