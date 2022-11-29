package ai;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class le2 implements xc2<wc2<JSONObject>> {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f6552a;

    public le2(Context context) {
        this.f6552a = se0.b(context);
    }

    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f6552a);
        } catch (JSONException unused) {
            yg.p1.k("Failed putting version constants.");
        }
    }

    @Override // ai.xc2
    public final s43<wc2<JSONObject>> zza() {
        return j43.a(new wc2(this) { // from class: ai.ke2

            /* renamed from: a  reason: collision with root package name */
            public final le2 f6184a;

            {
                this.f6184a = this;
            }

            @Override // ai.wc2
            public final void d(Object obj) {
                this.f6184a.a((JSONObject) obj);
            }
        });
    }
}
