package ai;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xd2 implements wc2<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f11910a;

    public xd2(JSONObject jSONObject) {
        this.f11910a = jSONObject;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(JSONObject jSONObject) {
        try {
            JSONObject g10 = yg.y0.g(jSONObject, "content_info");
            JSONObject jSONObject2 = this.f11910a;
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                g10.put(next, jSONObject2.get(next));
            }
        } catch (JSONException unused) {
            yg.p1.k("Failed putting app indexing json.");
        }
    }
}
