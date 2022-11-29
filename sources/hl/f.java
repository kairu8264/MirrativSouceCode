package hl;

import al.q;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final q f36125a;

    public f(q qVar) {
        this.f36125a = qVar;
    }

    public static g a(int i10) {
        if (i10 != 3) {
            return new b();
        }
        return new h();
    }

    public il.e b(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt("settings_version")).a(this.f36125a, jSONObject);
    }
}
