package ai;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sg1 extends tg1 {

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f9824b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9825c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9826d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9827e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9828f;

    /* renamed from: g  reason: collision with root package name */
    public final String f9829g;

    public sg1(fl2 fl2Var, JSONObject jSONObject) {
        super(fl2Var);
        this.f9824b = yg.y0.h(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f9825c = yg.y0.i(false, jSONObject, "allow_pub_owned_ad_view");
        this.f9826d = yg.y0.i(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f9827e = yg.y0.i(false, jSONObject, "enable_omid");
        this.f9829g = yg.y0.j("", jSONObject, "watermark_overlay_png_base64");
        this.f9828f = jSONObject.optJSONObject("overlay") != null;
    }

    @Override // ai.tg1
    public final JSONObject a() {
        JSONObject jSONObject = this.f9824b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f10288a.f4115z);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // ai.tg1
    public final boolean b() {
        return this.f9828f;
    }

    @Override // ai.tg1
    public final boolean c() {
        return this.f9825c;
    }

    @Override // ai.tg1
    public final boolean d() {
        return this.f9827e;
    }

    @Override // ai.tg1
    public final boolean e() {
        return this.f9826d;
    }

    @Override // ai.tg1
    public final String f() {
        return this.f9829g;
    }
}
