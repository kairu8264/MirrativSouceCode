package ai;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bm2 {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f2403a;

    public bm2(JSONObject jSONObject) {
        this.f2403a = jSONObject;
    }

    public final String a() {
        if (b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final int b() {
        int optInt = this.f2403a.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
