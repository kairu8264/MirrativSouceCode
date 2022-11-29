package ai;

import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zi0 {

    /* renamed from: d  reason: collision with root package name */
    public String f12999d;

    /* renamed from: e  reason: collision with root package name */
    public String f13000e;

    /* renamed from: f  reason: collision with root package name */
    public long f13001f;

    /* renamed from: g  reason: collision with root package name */
    public JSONObject f13002g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f13003h;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13005j;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f12996a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f12997b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, u80> f12998c = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f13004i = new ArrayList();

    public zi0(String str, long j10) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.f13003h = false;
        this.f13005j = false;
        this.f13000e = str;
        this.f13001f = j10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f13002g = jSONObject;
            if (jSONObject.optInt("status", -1) != 1) {
                this.f13003h = false;
                uj0.f("App settings could not be fetched successfully.");
                return;
            }
            this.f13003h = true;
            this.f12999d = this.f13002g.optString(MRLog.PAYLOAD_KEY_APP_ID);
            JSONArray optJSONArray2 = this.f13002g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i10);
                    String optString = jSONObject2.optString("format");
                    String optString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.f12997b.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.f12998c.put(optString2, new u80(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.f13002g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i11 = 0; i11 < optJSONArray3.length(); i11++) {
                    this.f12996a.add(optJSONArray3.optString(i11));
                }
            }
            if (((Boolean) ft.c().c(ox.f7986f5)).booleanValue() && (optJSONObject2 = this.f13002g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                    this.f13004i.add(optJSONArray.get(i12).toString());
                }
            }
            if (!((Boolean) ft.c().c(ox.D4)).booleanValue() || (optJSONObject = this.f13002g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f13005j = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e10) {
            uj0.g("Exception occurred while processing app setting json", e10);
            wg.t.h().k(e10, "AppSettings.parseAppSettingsJson");
        }
    }

    public final void a(long j10) {
        this.f13001f = j10;
    }

    public final long b() {
        return this.f13001f;
    }

    public final boolean c() {
        return this.f13003h;
    }

    public final String d() {
        return this.f13000e;
    }

    public final String e() {
        return this.f12999d;
    }

    public final Map<String, u80> f() {
        return this.f12998c;
    }

    public final JSONObject g() {
        return this.f13002g;
    }

    public final List<String> h() {
        return this.f13004i;
    }

    public final boolean i() {
        return this.f13005j;
    }
}
