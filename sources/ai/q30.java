package ai;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.internal.ads.zzaat;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class q30 {

    /* renamed from: a  reason: collision with root package name */
    public static final r30<rp0> f8779a = u20.f10573a;

    /* renamed from: b  reason: collision with root package name */
    public static final r30<rp0> f8780b = v20.f10934a;

    /* renamed from: c  reason: collision with root package name */
    public static final r30<rp0> f8781c = w20.f11465a;

    /* renamed from: d  reason: collision with root package name */
    public static final r30<rp0> f8782d = new i30();

    /* renamed from: e  reason: collision with root package name */
    public static final r30<rp0> f8783e = new j30();

    /* renamed from: f  reason: collision with root package name */
    public static final r30<rp0> f8784f = c30.f2684a;

    /* renamed from: g  reason: collision with root package name */
    public static final r30<Object> f8785g = new k30();

    /* renamed from: h  reason: collision with root package name */
    public static final r30<rp0> f8786h = new l30();

    /* renamed from: i  reason: collision with root package name */
    public static final r30<rp0> f8787i = d30.f3114a;

    /* renamed from: j  reason: collision with root package name */
    public static final r30<rp0> f8788j = new m30();

    /* renamed from: k  reason: collision with root package name */
    public static final r30<rp0> f8789k = new n30();

    /* renamed from: l  reason: collision with root package name */
    public static final r30<em0> f8790l = new sn0();

    /* renamed from: m  reason: collision with root package name */
    public static final r30<em0> f8791m = new tn0();

    /* renamed from: n  reason: collision with root package name */
    public static final r30<rp0> f8792n = new t20();

    /* renamed from: o  reason: collision with root package name */
    public static final g40 f8793o = new g40();

    /* renamed from: p  reason: collision with root package name */
    public static final r30<rp0> f8794p = new o30();

    /* renamed from: q  reason: collision with root package name */
    public static final r30<rp0> f8795q = new p30();

    /* renamed from: r  reason: collision with root package name */
    public static final r30<rp0> f8796r = new e30();

    /* renamed from: s  reason: collision with root package name */
    public static final r30<rp0> f8797s = new f30();

    /* renamed from: t  reason: collision with root package name */
    public static final r30<rp0> f8798t = new g30();

    public static s43<String> a(rp0 rp0Var, String str) {
        Uri parse = Uri.parse(str);
        try {
            u w10 = rp0Var.w();
            if (w10 != null && w10.a(parse)) {
                parse = w10.e(parse, rp0Var.getContext(), rp0Var.G(), rp0Var.g());
            }
        } catch (zzaat unused) {
            uj0.f(str.length() != 0 ? "Unable to append parameter to URL: ".concat(str) : new String("Unable to append parameter to URL: "));
        }
        final String b10 = ci0.b(parse, rp0Var.getContext());
        long longValue = bz.f2630e.e().longValue();
        if (longValue > 0 && longValue <= 213806100) {
            z33 E = z33.E(rp0Var.X());
            bx2 bx2Var = x20.f11841a;
            t43 t43Var = hk0.f4883f;
            return j43.f(j43.j(j43.f(E, Throwable.class, bx2Var, t43Var), new bx2(b10) { // from class: ai.y20

                /* renamed from: a  reason: collision with root package name */
                public final String f12423a;

                {
                    this.f12423a = b10;
                }

                @Override // ai.bx2
                public final Object apply(Object obj) {
                    String str2 = this.f12423a;
                    String str3 = (String) obj;
                    r30<rp0> r30Var = q30.f8779a;
                    if (str3 != null) {
                        if (bz.f2631f.e().booleanValue()) {
                            String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                            String host = Uri.parse(str2).getHost();
                            for (int i10 = 0; i10 < 3; i10++) {
                                if (!host.endsWith(strArr[i10])) {
                                }
                            }
                        }
                        String e10 = bz.f2626a.e();
                        String e11 = bz.f2627b.e();
                        if (!TextUtils.isEmpty(e10)) {
                            str2 = str2.replace(e10, str3);
                        }
                        if (!TextUtils.isEmpty(e11)) {
                            Uri parse2 = Uri.parse(str2);
                            if (TextUtils.isEmpty(parse2.getQueryParameter(e11))) {
                                return parse2.buildUpon().appendQueryParameter(e11, str3).toString();
                            }
                        }
                    }
                    return str2;
                }
            }, t43Var), Throwable.class, new bx2(b10) { // from class: ai.a30

                /* renamed from: a  reason: collision with root package name */
                public final String f1713a;

                {
                    this.f1713a = b10;
                }

                @Override // ai.bx2
                public final Object apply(Object obj) {
                    String str2 = this.f1713a;
                    Throwable th2 = (Throwable) obj;
                    r30<rp0> r30Var = q30.f8779a;
                    if (bz.f2636k.e().booleanValue()) {
                        wg.t.h().k(th2, "prepareClickUrl.attestation2");
                    }
                    return str2;
                }
            }, t43Var);
        }
        return j43.a(b10);
    }

    public static r30<rp0> b(final nc1 nc1Var) {
        return new r30(nc1Var) { // from class: ai.b30

            /* renamed from: a  reason: collision with root package name */
            public final nc1 f2214a;

            {
                this.f2214a = nc1Var;
            }

            @Override // ai.r30
            public final void a(Object obj, Map map) {
                rp0 rp0Var = (rp0) obj;
                q30.c(map, this.f2214a);
                String str = (String) map.get("u");
                if (str == null) {
                    uj0.f("URL missing from click GMSG.");
                } else {
                    j43.p(q30.a(rp0Var, str), new h30(rp0Var), hk0.f4878a);
                }
            }
        };
    }

    public static void c(Map<String, String> map, nc1 nc1Var) {
        if (((Boolean) ft.c().c(ox.f7945a7)).booleanValue() && map.containsKey("sc") && map.get("sc").equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) && nc1Var != null) {
            nc1Var.zzb();
        }
    }

    public static final /* synthetic */ void d(tq0 tq0Var, Map map) {
        PackageManager packageManager = tq0Var.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        String optString = jSONObject2.optString(TtmlNode.ATTR_ID);
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString(TopicConstant.EXTEND_AVC_IDR);
                        String optString4 = jSONObject2.optString(TopicConstant.PACKET_TYPE_META);
                        String optString5 = jSONObject2.optString(TtmlNode.TAG_P);
                        String optString6 = jSONObject2.optString("c");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e10) {
                                String valueOf = String.valueOf(optString7);
                                uj0.d(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e10);
                            }
                        }
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        try {
                            jSONObject.put(optString, packageManager.resolveActivity(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE) != null);
                        } catch (JSONException e11) {
                            uj0.d("Error constructing openable urls response.", e11);
                        }
                    } catch (JSONException e12) {
                        uj0.d("Error parsing the intent data.", e12);
                    }
                }
                ((z50) tq0Var).c("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((z50) tq0Var).c("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((z50) tq0Var).c("openableIntents", new JSONObject());
        }
    }
}
