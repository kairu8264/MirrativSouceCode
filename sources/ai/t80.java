package ai;

import com.dena.mirrorman.clientlog.logs.AdLogBase;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t80 {

    /* renamed from: a  reason: collision with root package name */
    public final String f10175a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10176b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f10177c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10178d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10179e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f10180f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f10181g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f10182h;

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f10183i;

    /* renamed from: j  reason: collision with root package name */
    public final List<String> f10184j;

    /* renamed from: k  reason: collision with root package name */
    public final String f10185k;

    /* renamed from: l  reason: collision with root package name */
    public final List<String> f10186l;

    /* renamed from: m  reason: collision with root package name */
    public final List<String> f10187m;

    /* renamed from: n  reason: collision with root package name */
    public final List<String> f10188n;

    /* renamed from: o  reason: collision with root package name */
    public final String f10189o;

    /* renamed from: p  reason: collision with root package name */
    public final String f10190p;

    /* renamed from: q  reason: collision with root package name */
    public final String f10191q;

    /* renamed from: r  reason: collision with root package name */
    public final String f10192r;

    /* renamed from: s  reason: collision with root package name */
    public final String f10193s;

    /* renamed from: t  reason: collision with root package name */
    public final List<String> f10194t;

    /* renamed from: u  reason: collision with root package name */
    public final String f10195u;

    /* renamed from: v  reason: collision with root package name */
    public final String f10196v;

    public t80(JSONObject jSONObject) throws JSONException {
        List<String> list;
        this.f10176b = jSONObject.optString(TtmlNode.ATTR_ID);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        this.f10177c = Collections.unmodifiableList(arrayList);
        this.f10178d = jSONObject.optString("allocation_id", null);
        wg.t.v();
        this.f10180f = v80.a(jSONObject, "clickurl");
        wg.t.v();
        this.f10181g = v80.a(jSONObject, "imp_urls");
        wg.t.v();
        this.f10182h = v80.a(jSONObject, "downloaded_imp_urls");
        wg.t.v();
        this.f10184j = v80.a(jSONObject, "fill_urls");
        wg.t.v();
        this.f10186l = v80.a(jSONObject, "video_start_urls");
        wg.t.v();
        this.f10188n = v80.a(jSONObject, "video_complete_urls");
        wg.t.v();
        this.f10187m = v80.a(jSONObject, "video_reward_urls");
        this.f10189o = jSONObject.optString("transaction_id");
        this.f10190p = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject(AdLogBase.AD);
        if (optJSONObject != null) {
            wg.t.v();
            list = v80.a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f10183i = list;
        this.f10175a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f10185k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f10179e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f10191q = jSONObject.optString("html_template", null);
        this.f10192r = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.f10193s = optJSONObject3 != null ? optJSONObject3.toString() : null;
        wg.t.v();
        this.f10194t = v80.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f10195u = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.f10196v = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
