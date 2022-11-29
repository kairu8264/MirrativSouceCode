package ai;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class le0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f6539a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6540b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6541c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6542d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6543e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6544f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6545g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6546h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6547i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6548j;

    /* renamed from: k  reason: collision with root package name */
    public final JSONObject f6549k;

    /* renamed from: l  reason: collision with root package name */
    public final String f6550l;

    /* renamed from: m  reason: collision with root package name */
    public final String f6551m;

    public le0(JSONObject jSONObject) {
        this.f6547i = jSONObject.optString("url");
        this.f6540b = jSONObject.optString("base_uri");
        this.f6541c = jSONObject.optString("post_parameters");
        this.f6543e = j(jSONObject.optString("drt_include"));
        this.f6544f = j(jSONObject.optString("cookies_include", "true"));
        this.f6545g = jSONObject.optString("request_id");
        this.f6542d = jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        this.f6539a = optString == null ? null : Arrays.asList(optString.split(","));
        this.f6548j = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f6546h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f6549k = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.f6550l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f6551m = jSONObject.optString("pool_key");
    }

    public static boolean j(String str) {
        return str != null && (str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) || str.equals("true"));
    }

    public final int a() {
        return this.f6548j;
    }

    public final List<String> b() {
        return this.f6539a;
    }

    public final String c() {
        return this.f6540b;
    }

    public final String d() {
        return this.f6541c;
    }

    public final String e() {
        return this.f6547i;
    }

    public final boolean f() {
        return this.f6543e;
    }

    public final boolean g() {
        return this.f6544f;
    }

    public final JSONObject h() {
        return this.f6549k;
    }

    public final String i() {
        return this.f6551m;
    }
}
