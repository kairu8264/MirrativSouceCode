package hl;

import al.q;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b implements g {
    public static il.a b(JSONObject jSONObject) throws JSONException {
        return new il.a(jSONObject.getString("status"), jSONObject.getString("url"), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false));
    }

    public static il.b c(JSONObject jSONObject) {
        return new il.b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    public static il.c d(JSONObject jSONObject) {
        return new il.c(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    public static il.d e(q qVar) {
        JSONObject jSONObject = new JSONObject();
        return new il.e(f(qVar, 3600L, jSONObject), null, d(jSONObject), c(jSONObject), 0, 3600);
    }

    public static long f(q qVar, long j10, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return qVar.a() + (j10 * 1000);
    }

    @Override // hl.g
    public il.e a(q qVar, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new il.e(f(qVar, optInt2, jSONObject), b(jSONObject.getJSONObject("app")), d(jSONObject.getJSONObject("session")), c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
