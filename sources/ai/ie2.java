package ai;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ie2 implements wc2<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f5206a;

    public ie2(JSONObject jSONObject) {
        this.f5206a = jSONObject;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(JSONObject jSONObject) {
        try {
            jSONObject.put("cache_state", this.f5206a);
        } catch (JSONException unused) {
            yg.p1.k("Unable to get cache_state");
        }
    }
}
