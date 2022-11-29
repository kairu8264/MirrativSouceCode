package ai;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.internal.ads.zzehs;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cj1 {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f2844a;

    /* renamed from: b  reason: collision with root package name */
    public final qj1 f2845b;

    /* renamed from: c  reason: collision with root package name */
    public final vj1 f2846c;

    public cj1(t43 t43Var, qj1 qj1Var, vj1 vj1Var) {
        this.f2844a = t43Var;
        this.f2845b = qj1Var;
        this.f2846c = vj1Var;
    }

    public final s43<og1> a(final sl2 sl2Var, final fl2 fl2Var, final JSONObject jSONObject) {
        s43 i10;
        final s43 h10 = this.f2844a.h(new Callable(this, sl2Var, fl2Var, jSONObject) { // from class: ai.aj1

            /* renamed from: a  reason: collision with root package name */
            public final cj1 f1882a;

            /* renamed from: b  reason: collision with root package name */
            public final sl2 f1883b;

            /* renamed from: c  reason: collision with root package name */
            public final fl2 f1884c;

            /* renamed from: d  reason: collision with root package name */
            public final JSONObject f1885d;

            {
                this.f1882a = this;
                this.f1883b = sl2Var;
                this.f1884c = fl2Var;
                this.f1885d = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                sl2 sl2Var2 = this.f1883b;
                fl2 fl2Var2 = this.f1884c;
                JSONObject jSONObject2 = this.f1885d;
                og1 og1Var = new og1();
                og1Var.A(jSONObject2.optInt("template_id", -1));
                og1Var.T(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                og1Var.b0(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
                yl2 yl2Var = sl2Var2.f9875a.f8473a;
                if (yl2Var.f12653g.contains(Integer.toString(og1Var.d0()))) {
                    if (og1Var.d0() == 3) {
                        if (og1Var.q() != null) {
                            if (!yl2Var.f12654h.contains(og1Var.q())) {
                                throw new zzehs(1, "Unexpected custom template id in the response.");
                            }
                        } else {
                            throw new zzehs(1, "No custom template id for custom template ad response.");
                        }
                    }
                    og1Var.Q(jSONObject2.optDouble("rating", -1.0d));
                    String optString = jSONObject2.optString("headline", null);
                    if (fl2Var2.I) {
                        wg.t.d();
                        String c10 = yg.d2.c();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 3 + String.valueOf(optString).length());
                        sb2.append(c10);
                        sb2.append(" : ");
                        sb2.append(optString);
                        optString = sb2.toString();
                    }
                    og1Var.Y("headline", optString);
                    og1Var.Y(TtmlNode.TAG_BODY, jSONObject2.optString(TtmlNode.TAG_BODY, null));
                    og1Var.Y("call_to_action", jSONObject2.optString("call_to_action", null));
                    og1Var.Y("store", jSONObject2.optString("store", null));
                    og1Var.Y("price", jSONObject2.optString("price", null));
                    og1Var.Y("advertiser", jSONObject2.optString("advertiser", null));
                    return og1Var;
                }
                int d02 = og1Var.d0();
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append("Invalid template ID: ");
                sb3.append(d02);
                throw new zzehs(1, sb3.toString());
            }
        });
        final s43<List<wz>> b10 = this.f2845b.b(jSONObject, "images");
        final s43<rp0> c10 = this.f2845b.c(jSONObject, "images", fl2Var, sl2Var.f9876b.f9497b);
        final s43<wz> a10 = this.f2845b.a(jSONObject, "secondary_image");
        final s43<wz> a11 = this.f2845b.a(jSONObject, "app_icon");
        final s43<tz> d10 = this.f2845b.d(jSONObject, "attribution");
        final s43<rp0> e10 = this.f2845b.e(jSONObject, fl2Var, sl2Var.f9876b.f9497b);
        final qj1 qj1Var = this.f2845b;
        if (!jSONObject.optBoolean("enable_omid")) {
            i10 = j43.a(null);
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                i10 = j43.a(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    i10 = j43.a(null);
                } else {
                    i10 = j43.i(j43.a(null), new p33(qj1Var, optString) { // from class: ai.lj1

                        /* renamed from: a  reason: collision with root package name */
                        public final qj1 f6579a;

                        /* renamed from: b  reason: collision with root package name */
                        public final String f6580b;

                        {
                            this.f6579a = qj1Var;
                            this.f6580b = optString;
                        }

                        @Override // ai.p33
                        public final s43 a(Object obj) {
                            return this.f6579a.f(this.f6580b, obj);
                        }
                    }, hk0.f4882e);
                }
            }
        }
        final s43 s43Var = i10;
        final s43<List<uj1>> a12 = this.f2846c.a(jSONObject, "custom_assets");
        return j43.l(h10, b10, c10, a10, a11, d10, e10, s43Var, a12).a(new Callable(this, h10, b10, a11, a10, d10, jSONObject, e10, c10, s43Var, a12) { // from class: ai.bj1

            /* renamed from: a  reason: collision with root package name */
            public final cj1 f2362a;

            /* renamed from: b  reason: collision with root package name */
            public final s43 f2363b;

            /* renamed from: c  reason: collision with root package name */
            public final s43 f2364c;

            /* renamed from: d  reason: collision with root package name */
            public final s43 f2365d;

            /* renamed from: e  reason: collision with root package name */
            public final s43 f2366e;

            /* renamed from: f  reason: collision with root package name */
            public final s43 f2367f;

            /* renamed from: g  reason: collision with root package name */
            public final JSONObject f2368g;

            /* renamed from: h  reason: collision with root package name */
            public final s43 f2369h;

            /* renamed from: i  reason: collision with root package name */
            public final s43 f2370i;

            /* renamed from: j  reason: collision with root package name */
            public final s43 f2371j;

            /* renamed from: k  reason: collision with root package name */
            public final s43 f2372k;

            {
                this.f2362a = this;
                this.f2363b = h10;
                this.f2364c = b10;
                this.f2365d = a11;
                this.f2366e = a10;
                this.f2367f = d10;
                this.f2368g = jSONObject;
                this.f2369h = e10;
                this.f2370i = c10;
                this.f2371j = s43Var;
                this.f2372k = a12;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                s43 s43Var2 = this.f2363b;
                s43 s43Var3 = this.f2364c;
                s43 s43Var4 = this.f2365d;
                s43 s43Var5 = this.f2366e;
                s43 s43Var6 = this.f2367f;
                JSONObject jSONObject2 = this.f2368g;
                s43 s43Var7 = this.f2369h;
                s43 s43Var8 = this.f2370i;
                s43 s43Var9 = this.f2371j;
                s43 s43Var10 = this.f2372k;
                og1 og1Var = (og1) s43Var2.get();
                og1Var.L((List) s43Var3.get());
                og1Var.R((m00) s43Var4.get());
                og1Var.S((m00) s43Var5.get());
                og1Var.K((e00) s43Var6.get());
                og1Var.M(qj1.j(jSONObject2));
                og1Var.N(qj1.i(jSONObject2));
                rp0 rp0Var = (rp0) s43Var7.get();
                if (rp0Var != null) {
                    og1Var.U(rp0Var);
                    og1Var.O(rp0Var.G());
                    og1Var.J(rp0Var.e());
                }
                rp0 rp0Var2 = (rp0) s43Var8.get();
                if (rp0Var2 != null) {
                    og1Var.V(rp0Var2);
                    og1Var.P(rp0Var2.G());
                }
                rp0 rp0Var3 = (rp0) s43Var9.get();
                if (rp0Var3 != null) {
                    og1Var.W(rp0Var3);
                }
                for (uj1 uj1Var : (List) s43Var10.get()) {
                    if (uj1Var.f10722a != 1) {
                        og1Var.Z(uj1Var.f10723b, uj1Var.f10725d);
                    } else {
                        og1Var.Y(uj1Var.f10723b, uj1Var.f10724c);
                    }
                }
                return og1Var;
            }
        }, this.f2844a);
    }
}
