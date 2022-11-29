package ai;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class te2 implements wc2<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f10276a;

    public te2(List<String> list) {
        this.f10276a = list;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(JSONObject jSONObject) {
        try {
            jSONObject.put("eid", TextUtils.join(",", this.f10276a));
        } catch (JSONException unused) {
            yg.p1.k("Failed putting experiment ids.");
        }
    }
}
