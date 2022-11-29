package ai;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.internal.ads.zzehs;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fu1 {

    /* renamed from: a  reason: collision with root package name */
    public final or0 f4205a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4206b;

    /* renamed from: c  reason: collision with root package name */
    public final zj0 f4207c;

    /* renamed from: d  reason: collision with root package name */
    public final yl2 f4208d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f4209e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4210f;

    /* renamed from: g  reason: collision with root package name */
    public final p71 f4211g;

    /* renamed from: h  reason: collision with root package name */
    public final t71 f4212h;

    public fu1(or0 or0Var, Context context, zj0 zj0Var, yl2 yl2Var, Executor executor, String str, p71 p71Var, t71 t71Var) {
        this.f4205a = or0Var;
        this.f4206b = context;
        this.f4207c = zj0Var;
        this.f4208d = yl2Var;
        this.f4209e = executor;
        this.f4210f = str;
        this.f4211g = p71Var;
        this.f4212h = t71Var;
    }

    public static final String g(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final s43<sl2> c() {
        String str = this.f4208d.f12650d.T;
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) ft.c().c(ox.f8010i5)).booleanValue()) {
                String g10 = g(str);
                if (TextUtils.isEmpty(g10)) {
                    if (((Boolean) ft.c().c(ox.f8034l5)).booleanValue()) {
                        this.f4212h.h(true);
                    }
                    return j43.c(new zzehs(15, "Invalid ad string."));
                }
                String c10 = this.f4205a.z().c(g10);
                if (!TextUtils.isEmpty(c10)) {
                    return e(str, f(c10));
                }
            }
        }
        qr qrVar = this.f4208d.f12650d.O;
        if (qrVar != null) {
            if (((Boolean) ft.c().c(ox.f7994g5)).booleanValue()) {
                String g11 = g(qrVar.f9064w);
                String g12 = g(qrVar.f9065x);
                if (!TextUtils.isEmpty(g12) && g11.equals(g12)) {
                    this.f4205a.z().d(g11);
                }
            }
            return e(qrVar.f9064w, f(qrVar.f9065x));
        }
        if (((Boolean) ft.c().c(ox.f8034l5)).booleanValue()) {
            this.f4212h.h(true);
        }
        return j43.c(new zzehs(14, "Mismatch request IDs."));
    }

    public final /* synthetic */ s43 d(JSONObject jSONObject) throws Exception {
        return j43.a(new sl2(new pl2(this.f4208d), rl2.a(new StringReader(jSONObject.toString()))));
    }

    public final s43<sl2> e(final String str, final String str2) {
        y70 b10 = wg.t.q().b(this.f4206b, this.f4207c);
        s70<JSONObject> s70Var = v70.f10994b;
        final n70 a10 = b10.a("google.afma.response.normalize", s70Var, s70Var);
        s43<sl2> i10 = j43.i(j43.i(j43.i(j43.a(""), new p33(this, str, str2) { // from class: ai.bu1

            /* renamed from: a  reason: collision with root package name */
            public final fu1 f2550a;

            /* renamed from: b  reason: collision with root package name */
            public final String f2551b;

            /* renamed from: c  reason: collision with root package name */
            public final String f2552c;

            {
                this.f2550a = this;
                this.f2551b = str;
                this.f2552c = str2;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                String str3 = this.f2551b;
                String str4 = this.f2552c;
                String str5 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put(TtmlNode.TAG_BODY, str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return j43.a(jSONObject);
                } catch (JSONException e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    throw new JSONException(valueOf.length() != 0 ? "Preloaded loader: ".concat(valueOf) : new String("Preloaded loader: "));
                }
            }
        }, this.f4209e), new p33(a10) { // from class: ai.cu1

            /* renamed from: a  reason: collision with root package name */
            public final n70 f3037a;

            {
                this.f3037a = a10;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f3037a.b((JSONObject) obj);
            }
        }, this.f4209e), new p33(this) { // from class: ai.du1

            /* renamed from: a  reason: collision with root package name */
            public final fu1 f3408a;

            {
                this.f3408a = this;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f3408a.d((JSONObject) obj);
            }
        }, this.f4209e);
        if (((Boolean) ft.c().c(ox.f8034l5)).booleanValue()) {
            j43.p(i10, new eu1(this), hk0.f4883f);
        }
        return i10;
    }

    public final String f(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f4210f));
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            uj0.f("Failed to update the ad types for rendering. ".concat(e10.toString()));
            return str;
        }
    }
}
