package ai;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class se0 extends te0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9805a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Context f9806b;

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f9807c;

    /* renamed from: d  reason: collision with root package name */
    public final n70<JSONObject, JSONObject> f9808d;

    public se0(Context context, n70<JSONObject, JSONObject> n70Var) {
        this.f9806b = context.getApplicationContext();
        this.f9808d = n70Var;
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zj0.p().f13013w);
            jSONObject.put("mf", cz.f3076a.e());
            jSONObject.put("cl", "407425155");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", nh.g.f43544a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", nh.g.f43544a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // ai.te0
    public final s43<Void> a() {
        synchronized (this.f9805a) {
            if (this.f9807c == null) {
                this.f9807c = this.f9806b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (wg.t.k().currentTimeMillis() - this.f9807c.getLong("js_last_update", 0L) < cz.f3077b.e().longValue()) {
            return j43.a(null);
        }
        return j43.j(this.f9808d.b(b(this.f9806b)), new bx2(this) { // from class: ai.re0

            /* renamed from: a  reason: collision with root package name */
            public final se0 f9412a;

            {
                this.f9412a = this;
            }

            @Override // ai.bx2
            public final Object apply(Object obj) {
                this.f9412a.c((JSONObject) obj);
                return null;
            }
        }, hk0.f4883f);
    }

    public final /* synthetic */ Void c(JSONObject jSONObject) {
        ox.b(this.f9806b, 1, jSONObject);
        this.f9807c.edit().putLong("js_last_update", wg.t.k().currentTimeMillis()).apply();
        return null;
    }
}
