package ai;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sq1 {

    /* renamed from: a  reason: collision with root package name */
    public Long f9907a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9908b;

    /* renamed from: c  reason: collision with root package name */
    public String f9909c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f9910d;

    /* renamed from: e  reason: collision with root package name */
    public String f9911e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f9912f;

    public /* synthetic */ sq1(String str, tq1 tq1Var) {
        this.f9908b = str;
    }

    public static /* synthetic */ String f(sq1 sq1Var) {
        String str = (String) ft.c().c(ox.M6);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", sq1Var.f9907a);
            jSONObject.put("eventCategory", sq1Var.f9908b);
            jSONObject.putOpt("event", sq1Var.f9909c);
            jSONObject.putOpt("errorCode", sq1Var.f9910d);
            jSONObject.putOpt("rewardType", sq1Var.f9911e);
            jSONObject.putOpt("rewardAmount", sq1Var.f9912f);
        } catch (JSONException unused) {
            uj0.f("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(jSONObject2).length());
        sb2.append(str);
        sb2.append("(\"h5adsEvent\",");
        sb2.append(jSONObject2);
        sb2.append(");");
        return sb2.toString();
    }
}
