package ai;

import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.Referer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class u80 {

    /* renamed from: a  reason: collision with root package name */
    public final List<t80> f10646a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f10647b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f10648c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f10649d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f10650e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f10651f;

    /* renamed from: g  reason: collision with root package name */
    public final String f10652g;

    /* renamed from: h  reason: collision with root package name */
    public final String f10653h;

    public u80(JSONObject jSONObject) throws JSONException {
        if (uj0.j(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            yg.p1.k(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i10 = -1;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                t80 t80Var = new t80(jSONArray.getJSONObject(i11));
                MRLog.TARGET_TYPE_BANNER.equalsIgnoreCase(t80Var.f10196v);
                arrayList.add(t80Var);
                if (i10 < 0) {
                    Iterator<String> it = t80Var.f10177c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i10 = i11;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f10646a = Collections.unmodifiableList(arrayList);
        this.f10652g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject(Referer.SETTINGS);
        if (optJSONObject == null) {
            this.f10647b = null;
            this.f10648c = null;
            this.f10649d = null;
            this.f10650e = null;
            this.f10651f = null;
            this.f10653h = null;
            return;
        }
        optJSONObject.optLong("ad_network_timeout_millis", -1L);
        wg.t.v();
        this.f10647b = v80.a(optJSONObject, "click_urls");
        wg.t.v();
        this.f10648c = v80.a(optJSONObject, "imp_urls");
        wg.t.v();
        this.f10649d = v80.a(optJSONObject, "downloaded_imp_urls");
        wg.t.v();
        this.f10650e = v80.a(optJSONObject, "nofill_urls");
        wg.t.v();
        this.f10651f = v80.a(optJSONObject, "remote_ping_urls");
        optJSONObject.optBoolean("render_in_browser", false);
        optJSONObject.optLong("refresh", -1L);
        lf0 p10 = lf0.p(optJSONObject.optJSONArray("rewards"));
        if (p10 == null) {
            this.f10653h = null;
        } else {
            this.f10653h = p10.f6553w;
        }
        optJSONObject.optBoolean("use_displayed_impression", false);
        optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        optJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
