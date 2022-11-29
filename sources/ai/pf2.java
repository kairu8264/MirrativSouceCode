package ai;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pf2 implements wc2<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f8406a;

    public pf2(Map<String, Object> map) {
        this.f8406a = map;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(JSONObject jSONObject) {
        try {
            jSONObject.put("video_decoders", wg.t.d().Q(this.f8406a));
        } catch (JSONException e10) {
            String valueOf = String.valueOf(e10.getMessage());
            yg.p1.k(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
