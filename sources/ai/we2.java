package ai;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class we2 implements wc2<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f11581a;

    public we2(Bundle bundle) {
        this.f11581a = bundle;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (this.f11581a != null) {
            try {
                yg.y0.g(yg.y0.g(jSONObject2, "device"), "play_store").put("parental_controls", wg.t.d().S(this.f11581a));
            } catch (JSONException unused) {
                yg.p1.k("Failed putting parental controls bundle.");
            }
        }
    }
}
