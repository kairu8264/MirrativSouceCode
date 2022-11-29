package rg;

import ai.js;
import ai.sr;
import androidx.annotation.RecentlyNonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final js f51369a;

    /* renamed from: b  reason: collision with root package name */
    public final a f51370b;

    public j(js jsVar) {
        this.f51369a = jsVar;
        sr srVar = jsVar.f5906y;
        this.f51370b = srVar == null ? null : srVar.p();
    }

    public static j a(js jsVar) {
        if (jsVar != null) {
            return new j(jsVar);
        }
        return null;
    }

    @RecentlyNonNull
    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f51369a.f5904w);
        jSONObject.put("Latency", this.f51369a.f5905x);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f51369a.f5907z.keySet()) {
            jSONObject2.put(str, this.f51369a.f5907z.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        a aVar = this.f51370b;
        if (aVar == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", aVar.e());
        }
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
