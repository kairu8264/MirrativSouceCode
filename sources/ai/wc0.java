package ai;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wc0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11545a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11546b;

    public wc0(boolean z10, String str) {
        this.f11545a = z10;
        this.f11546b = str;
    }

    public static wc0 a(JSONObject jSONObject) {
        return new wc0(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
