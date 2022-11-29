package ai;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ud2 implements wc2<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final String f10677a;

    public ud2(String str) {
        this.f10677a = str;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(JSONObject jSONObject) {
        try {
            jSONObject.put("ms", this.f10677a);
        } catch (JSONException e10) {
            yg.p1.l("Failed putting Ad ID.", e10);
        }
    }
}
