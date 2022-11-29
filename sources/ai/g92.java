package ai;

import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g92 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f4368a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f4369b;

    public g92(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f4368a = jSONObject;
        this.f4369b = jSONObject2;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        JSONObject jSONObject = this.f4368a;
        if (jSONObject != null) {
            bundle2.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f4369b;
        if (jSONObject2 != null) {
            bundle2.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
