package ai;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aw1 implements q70<bw1> {
    @Override // ai.q70
    public final /* bridge */ /* synthetic */ JSONObject b(bw1 bw1Var) throws JSONException {
        bw1 bw1Var2 = bw1Var;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", bw1Var2.f2571c.c());
        jSONObject2.put("signals", bw1Var2.f2570b);
        jSONObject3.put(TtmlNode.TAG_BODY, bw1Var2.f2569a.f4228c);
        jSONObject3.put("headers", wg.t.d().Q(bw1Var2.f2569a.f4227b));
        jSONObject3.put("response_code", bw1Var2.f2569a.f4226a);
        jSONObject3.put("latency", bw1Var2.f2569a.f4229d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", bw1Var2.f2571c.h());
        return jSONObject;
    }
}
