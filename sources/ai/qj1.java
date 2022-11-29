package ai;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzehs;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qj1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8971a;

    /* renamed from: b  reason: collision with root package name */
    public final yi1 f8972b;

    /* renamed from: c  reason: collision with root package name */
    public final u f8973c;

    /* renamed from: d  reason: collision with root package name */
    public final zj0 f8974d;

    /* renamed from: e  reason: collision with root package name */
    public final wg.a f8975e;

    /* renamed from: f  reason: collision with root package name */
    public final qn f8976f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f8977g;

    /* renamed from: h  reason: collision with root package name */
    public final a00 f8978h;

    /* renamed from: i  reason: collision with root package name */
    public final jk1 f8979i;

    /* renamed from: j  reason: collision with root package name */
    public final ym1 f8980j;

    /* renamed from: k  reason: collision with root package name */
    public final ScheduledExecutorService f8981k;

    /* renamed from: l  reason: collision with root package name */
    public final tl1 f8982l;

    /* renamed from: m  reason: collision with root package name */
    public final pp1 f8983m;

    /* renamed from: n  reason: collision with root package name */
    public final nq2 f8984n;

    /* renamed from: o  reason: collision with root package name */
    public final fr2 f8985o;

    /* renamed from: p  reason: collision with root package name */
    public final ey1 f8986p;

    public qj1(Context context, yi1 yi1Var, u uVar, zj0 zj0Var, wg.a aVar, qn qnVar, Executor executor, yl2 yl2Var, jk1 jk1Var, ym1 ym1Var, ScheduledExecutorService scheduledExecutorService, pp1 pp1Var, nq2 nq2Var, fr2 fr2Var, ey1 ey1Var, tl1 tl1Var) {
        this.f8971a = context;
        this.f8972b = yi1Var;
        this.f8973c = uVar;
        this.f8974d = zj0Var;
        this.f8975e = aVar;
        this.f8976f = qnVar;
        this.f8977g = executor;
        this.f8978h = yl2Var.f12655i;
        this.f8979i = jk1Var;
        this.f8980j = ym1Var;
        this.f8981k = scheduledExecutorService;
        this.f8983m = pp1Var;
        this.f8984n = nq2Var;
        this.f8985o = fr2Var;
        this.f8986p = ey1Var;
        this.f8982l = tl1Var;
    }

    public static final bw i(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return r(optJSONObject);
    }

    public static final List<bw> j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zz2.r();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                bw r10 = r(optJSONArray.optJSONObject(i10));
                if (r10 != null) {
                    arrayList.add(r10);
                }
            }
            return zz2.A(arrayList);
        }
        return zz2.r();
    }

    public static Integer m(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt(TopicConstant.EXTEND_AAC_RAW), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static <T> s43<T> o(s43<T> s43Var, T t10) {
        return j43.g(s43Var, Exception.class, new p33(null) { // from class: ai.nj1
            @Override // ai.p33
            public final s43 a(Object obj) {
                yg.p1.l("Error during loading assets.", (Exception) obj);
                return j43.a(null);
            }
        }, hk0.f4883f);
    }

    public static <T> s43<T> p(boolean z10, final s43<T> s43Var, T t10) {
        if (z10) {
            return j43.i(s43Var, new p33(s43Var) { // from class: ai.oj1

                /* renamed from: a  reason: collision with root package name */
                public final s43 f7831a;

                {
                    this.f7831a = s43Var;
                }

                @Override // ai.p33
                public final s43 a(Object obj) {
                    return obj != null ? this.f7831a : j43.c(new zzehs(1, "Retrieve required value in native ad response failed."));
                }
            }, hk0.f4883f);
        }
        return o(s43Var, null);
    }

    public static final bw r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new bw(optString, optString2);
    }

    public final s43<wz> a(JSONObject jSONObject, String str) {
        return l(jSONObject.optJSONObject(str), this.f8978h.f1655x);
    }

    public final s43<List<wz>> b(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        a00 a00Var = this.f8978h;
        return k(optJSONArray, a00Var.f1655x, a00Var.f1657z);
    }

    public final s43<rp0> c(JSONObject jSONObject, String str, final fl2 fl2Var, final kl2 kl2Var) {
        if (!((Boolean) ft.c().c(ox.O6)).booleanValue()) {
            return j43.a(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(0);
            if (optJSONObject == null) {
                return j43.a(null);
            }
            final String optString = optJSONObject.optString("base_url");
            final String optString2 = optJSONObject.optString("html");
            final fs q10 = q(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
            if (TextUtils.isEmpty(optString2)) {
                return j43.a(null);
            }
            final s43 i10 = j43.i(j43.a(null), new p33(this, q10, fl2Var, kl2Var, optString, optString2) { // from class: ai.ij1

                /* renamed from: a  reason: collision with root package name */
                public final qj1 f5252a;

                /* renamed from: b  reason: collision with root package name */
                public final fs f5253b;

                /* renamed from: c  reason: collision with root package name */
                public final fl2 f5254c;

                /* renamed from: d  reason: collision with root package name */
                public final kl2 f5255d;

                /* renamed from: e  reason: collision with root package name */
                public final String f5256e;

                /* renamed from: f  reason: collision with root package name */
                public final String f5257f;

                {
                    this.f5252a = this;
                    this.f5253b = q10;
                    this.f5254c = fl2Var;
                    this.f5255d = kl2Var;
                    this.f5256e = optString;
                    this.f5257f = optString2;
                }

                @Override // ai.p33
                public final s43 a(Object obj) {
                    return this.f5252a.h(this.f5253b, this.f5254c, this.f5255d, this.f5256e, this.f5257f, obj);
                }
            }, hk0.f4882e);
            return j43.i(i10, new p33(i10) { // from class: ai.jj1

                /* renamed from: a  reason: collision with root package name */
                public final s43 f5814a;

                {
                    this.f5814a = i10;
                }

                @Override // ai.p33
                public final s43 a(Object obj) {
                    s43 s43Var = this.f5814a;
                    if (((rp0) obj) != null) {
                        return s43Var;
                    }
                    throw new zzehs(1, "Retrieve Web View from image ad response failed.");
                }
            }, hk0.f4883f);
        }
        return j43.a(null);
    }

    public final s43<tz> d(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return j43.a(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return p(optJSONObject.optBoolean("require"), j43.j(k(optJSONArray, false, true), new bx2(this, optJSONObject) { // from class: ai.kj1

            /* renamed from: a  reason: collision with root package name */
            public final qj1 f6246a;

            /* renamed from: b  reason: collision with root package name */
            public final JSONObject f6247b;

            {
                this.f6246a = this;
                this.f6247b = optJSONObject;
            }

            @Override // ai.bx2
            public final Object apply(Object obj) {
                return this.f6246a.g(this.f6247b, (List) obj);
            }
        }, this.f8977g), null);
    }

    public final s43<rp0> e(JSONObject jSONObject, fl2 fl2Var, kl2 kl2Var) {
        s43<rp0> a10;
        JSONObject h10 = yg.y0.h(jSONObject, "html_containers", "instream");
        if (h10 == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return j43.a(null);
            }
            String optString = optJSONObject.optString("vast_xml");
            boolean z10 = false;
            if (((Boolean) ft.c().c(ox.N6)).booleanValue() && optJSONObject.has("html")) {
                z10 = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z10) {
                    uj0.f("Required field 'vast_xml' or 'html' is missing");
                    return j43.a(null);
                }
            } else if (!z10) {
                a10 = this.f8979i.a(optJSONObject);
                return o(j43.h(a10, ((Integer) ft.c().c(ox.f8031l2)).intValue(), TimeUnit.SECONDS, this.f8981k), null);
            }
            a10 = n(optJSONObject, fl2Var, kl2Var);
            return o(j43.h(a10, ((Integer) ft.c().c(ox.f8031l2)).intValue(), TimeUnit.SECONDS, this.f8981k), null);
        }
        return n(h10, fl2Var, kl2Var);
    }

    public final /* synthetic */ s43 f(String str, Object obj) throws Exception {
        wg.t.e();
        rp0 a10 = cq0.a(this.f8971a, ir0.b(), "native-omid", false, false, this.f8973c, null, this.f8974d, null, null, this.f8975e, this.f8976f, null, null);
        final lk0 f10 = lk0.f(a10);
        a10.i0().b1(new dr0(f10) { // from class: ai.pj1

            /* renamed from: w  reason: collision with root package name */
            public final lk0 f8442w;

            {
                this.f8442w = f10;
            }

            @Override // ai.dr0
            public final void b(boolean z10) {
                this.f8442w.g();
            }
        });
        if (((Boolean) ft.c().c(ox.f8128x3)).booleanValue()) {
            a10.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            a10.loadData(str, "text/html", C.UTF8_NAME);
        }
        return f10;
    }

    public final /* synthetic */ tz g(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer m10 = m(jSONObject, "bg_color");
        Integer m11 = m(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new tz(optString, list, m10, m11, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.f8978h.A, optBoolean);
    }

    public final /* synthetic */ s43 h(fs fsVar, fl2 fl2Var, kl2 kl2Var, String str, String str2, Object obj) throws Exception {
        rp0 b10 = this.f8980j.b(fsVar, fl2Var, kl2Var);
        final lk0 f10 = lk0.f(b10);
        ql1 b11 = this.f8982l.b();
        b10.i0().L0(b11, b11, b11, b11, b11, false, null, new wg.b(this.f8971a, null, null), null, null, this.f8986p, this.f8985o, this.f8983m, this.f8984n, null, b11);
        if (((Boolean) ft.c().c(ox.f8023k2)).booleanValue()) {
            b10.c1("/getNativeAdViewSignals", q30.f8797s);
        }
        b10.c1("/getNativeClickMeta", q30.f8798t);
        b10.i0().b1(new dr0(f10) { // from class: ai.gj1

            /* renamed from: w  reason: collision with root package name */
            public final lk0 f4484w;

            {
                this.f4484w = f10;
            }

            @Override // ai.dr0
            public final void b(boolean z10) {
                lk0 lk0Var = this.f4484w;
                if (z10) {
                    lk0Var.g();
                } else {
                    lk0Var.e(new zzehs(1, "Image Web View failed to load."));
                }
            }
        });
        b10.Z0(str, str2, null);
        return f10;
    }

    public final s43<List<wz>> k(JSONArray jSONArray, boolean z10, boolean z11) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int length = z11 ? jSONArray.length() : 1;
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(l(jSONArray.optJSONObject(i10), z10));
            }
            return j43.j(j43.k(arrayList), fj1.f4059a, this.f8977g);
        }
        return j43.a(Collections.emptyList());
    }

    public final s43<wz> l(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return j43.a(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return j43.a(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z10) {
            return j43.a(new wz(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return p(jSONObject.optBoolean("require"), j43.j(this.f8972b.a(optString, optDouble, optBoolean), new bx2(optString, optDouble, optInt, optInt2) { // from class: ai.hj1

            /* renamed from: a  reason: collision with root package name */
            public final String f4863a;

            /* renamed from: b  reason: collision with root package name */
            public final double f4864b;

            /* renamed from: c  reason: collision with root package name */
            public final int f4865c;

            /* renamed from: d  reason: collision with root package name */
            public final int f4866d;

            {
                this.f4863a = optString;
                this.f4864b = optDouble;
                this.f4865c = optInt;
                this.f4866d = optInt2;
            }

            @Override // ai.bx2
            public final Object apply(Object obj) {
                String str = this.f4863a;
                return new wz(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f4864b, this.f4865c, this.f4866d);
            }
        }, this.f8977g), null);
    }

    public final s43<rp0> n(JSONObject jSONObject, fl2 fl2Var, kl2 kl2Var) {
        final s43<rp0> b10 = this.f8979i.b(jSONObject.optString("base_url"), jSONObject.optString("html"), fl2Var, kl2Var, q(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return j43.i(b10, new p33(b10) { // from class: ai.mj1

            /* renamed from: a  reason: collision with root package name */
            public final s43 f6958a;

            {
                this.f6958a = b10;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                s43 s43Var = this.f6958a;
                rp0 rp0Var = (rp0) obj;
                if (rp0Var == null || rp0Var.e() == null) {
                    throw new zzehs(1, "Retrieve video view in html5 ad response failed.");
                }
                return s43Var;
            }
        }, hk0.f4883f);
    }

    public final fs q(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return fs.P();
            }
            i10 = 0;
        }
        return new fs(this.f8971a, new rg.g(i10, i11));
    }
}
