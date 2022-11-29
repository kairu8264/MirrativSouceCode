package yk;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements b, zk.b {

    /* renamed from: a  reason: collision with root package name */
    public zk.a f62044a;

    public static String b(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // zk.b
    public void a(zk.a aVar) {
        this.f62044a = aVar;
        xk.f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // yk.b
    public void onEvent(String str, Bundle bundle) {
        zk.a aVar = this.f62044a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                xk.f.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
