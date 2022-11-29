package ai;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class p20 implements r30<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final q20 f8250a;

    public p20(q20 q20Var) {
        this.f8250a = q20Var;
    }

    @Override // ai.r30
    public final void a(Object obj, Map<String, String> map) {
        if (this.f8250a == null) {
            return;
        }
        String str = map.get("name");
        if (str == null) {
            uj0.e("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = yg.y0.k(new JSONObject(map.get("info")));
            } catch (JSONException e10) {
                uj0.d("Failed to convert ad metadata to JSON.", e10);
            }
        }
        if (bundle == null) {
            uj0.c("Failed to convert ad metadata to Bundle.");
        } else {
            this.f8250a.B(str, bundle);
        }
    }
}
