package wg;

import ai.j43;
import ai.p33;
import ai.s43;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements p33 {

    /* renamed from: a  reason: collision with root package name */
    public static final p33 f58703a = new d();

    @Override // ai.p33
    public final s43 a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            t.h().p().V(jSONObject.getString("appSettingsJson"));
        }
        return j43.a(null);
    }
}
