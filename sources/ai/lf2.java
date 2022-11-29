package ai;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lf2 implements wc2<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final String f6556a;

    public lf2(String str) {
        this.f6556a = str;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        try {
            if (TextUtils.isEmpty(this.f6556a)) {
                return;
            }
            yg.y0.g(jSONObject2, "pii").put("adsid", this.f6556a);
        } catch (JSONException e10) {
            uj0.g("Failed putting trustless token.", e10);
        }
    }
}
