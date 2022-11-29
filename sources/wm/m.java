package wm;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public final xl.b<tk.a> f59213a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f59214b = Collections.synchronizedMap(new HashMap());

    public m(xl.b<tk.a> bVar) {
        this.f59213a = bVar;
    }

    public void a(String str, com.google.firebase.remoteconfig.internal.a aVar) {
        JSONObject optJSONObject;
        tk.a aVar2 = this.f59213a.get();
        if (aVar2 == null) {
            return;
        }
        JSONObject f10 = aVar.f();
        if (f10.length() < 1) {
            return;
        }
        JSONObject d10 = aVar.d();
        if (d10.length() >= 1 && (optJSONObject = f10.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString("choiceId");
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.f59214b) {
                if (optString.equals(this.f59214b.get(str))) {
                    return;
                }
                this.f59214b.put(str, optString);
                Bundle bundle = new Bundle();
                bundle.putString("arm_key", str);
                bundle.putString("arm_value", d10.optString(str));
                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                bundle.putString("group", optJSONObject.optString("group"));
                aVar2.b("fp", "personalization_assignment", bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putString("_fpid", optString);
                aVar2.b("fp", "_fpc", bundle2);
            }
        }
    }
}
