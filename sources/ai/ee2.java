package ai;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ee2 implements wc2<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final String f3620a;

    public ee2(String str) {
        this.f3620a = str;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(JSONObject jSONObject) {
        try {
            JSONObject g10 = yg.y0.g(jSONObject, "pii");
            if (TextUtils.isEmpty(this.f3620a)) {
                return;
            }
            g10.put("attok", this.f3620a);
        } catch (JSONException e10) {
            yg.p1.l("Failed putting attestation token.", e10);
        }
    }
}
