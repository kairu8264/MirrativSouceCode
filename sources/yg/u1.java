package yg;

import ai.ft;
import ai.hk0;
import ai.ox;
import ai.s43;
import ai.uj0;
import ai.vl;
import ai.wy;
import ai.zi0;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class u1 implements r1 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f61951b;

    /* renamed from: d  reason: collision with root package name */
    public s43<?> f61953d;

    /* renamed from: f  reason: collision with root package name */
    public SharedPreferences f61955f;

    /* renamed from: g  reason: collision with root package name */
    public SharedPreferences.Editor f61956g;

    /* renamed from: i  reason: collision with root package name */
    public String f61958i;

    /* renamed from: j  reason: collision with root package name */
    public String f61959j;

    /* renamed from: a  reason: collision with root package name */
    public final Object f61950a = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final List<Runnable> f61952c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public vl f61954e = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f61957h = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f61960k = true;

    /* renamed from: l  reason: collision with root package name */
    public zi0 f61961l = new zi0("", 0);

    /* renamed from: m  reason: collision with root package name */
    public long f61962m = 0;

    /* renamed from: n  reason: collision with root package name */
    public long f61963n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f61964o = -1;

    /* renamed from: p  reason: collision with root package name */
    public int f61965p = 0;

    /* renamed from: q  reason: collision with root package name */
    public Set<String> f61966q = Collections.emptySet();

    /* renamed from: r  reason: collision with root package name */
    public JSONObject f61967r = new JSONObject();

    /* renamed from: s  reason: collision with root package name */
    public boolean f61968s = true;

    /* renamed from: t  reason: collision with root package name */
    public boolean f61969t = true;

    /* renamed from: u  reason: collision with root package name */
    public String f61970u = null;

    /* renamed from: v  reason: collision with root package name */
    public String f61971v = "";

    /* renamed from: w  reason: collision with root package name */
    public boolean f61972w = false;

    /* renamed from: x  reason: collision with root package name */
    public String f61973x = "";

    /* renamed from: y  reason: collision with root package name */
    public int f61974y = -1;

    /* renamed from: z  reason: collision with root package name */
    public int f61975z = -1;
    public long A = 0;

    public final void A() {
        s43<?> s43Var = this.f61953d;
        if (s43Var == null || s43Var.isDone()) {
            return;
        }
        try {
            this.f61953d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            uj0.g("Interrupted while waiting for preferences loaded.", e10);
        } catch (CancellationException e11) {
            e = e11;
            uj0.d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e12) {
            e = e12;
            uj0.d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e13) {
            e = e13;
            uj0.d("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void B() {
        hk0.f4878a.execute(new Runnable(this) { // from class: yg.t1

            /* renamed from: w  reason: collision with root package name */
            public final u1 f61948w;

            {
                this.f61948w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f61948w.zzb();
            }
        });
    }

    @Override // yg.r1
    public final long C() {
        long j10;
        A();
        synchronized (this.f61950a) {
            j10 = this.f61963n;
        }
        return j10;
    }

    @Override // yg.r1
    public final void H(String str) {
        A();
        synchronized (this.f61950a) {
            if (str.equals(this.f61958i)) {
                return;
            }
            this.f61958i = str;
            SharedPreferences.Editor editor = this.f61956g;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.f61956g.apply();
            }
            B();
        }
    }

    @Override // yg.r1
    public final void H0(String str) {
        A();
        synchronized (this.f61950a) {
            if (str.equals(this.f61959j)) {
                return;
            }
            this.f61959j = str;
            SharedPreferences.Editor editor = this.f61956g;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.f61956g.apply();
            }
            B();
        }
    }

    @Override // yg.r1
    public final String I() {
        String str;
        A();
        synchronized (this.f61950a) {
            str = this.f61971v;
        }
        return str;
    }

    @Override // yg.r1
    public final long M() {
        long j10;
        A();
        synchronized (this.f61950a) {
            j10 = this.A;
        }
        return j10;
    }

    @Override // yg.r1
    public final JSONObject N() {
        JSONObject jSONObject;
        A();
        synchronized (this.f61950a) {
            jSONObject = this.f61967r;
        }
        return jSONObject;
    }

    @Override // yg.r1
    public final boolean Q() {
        boolean z10;
        A();
        synchronized (this.f61950a) {
            z10 = this.f61972w;
        }
        return z10;
    }

    @Override // yg.r1
    public final void V(String str) {
        A();
        synchronized (this.f61950a) {
            long currentTimeMillis = wg.t.k().currentTimeMillis();
            if (str != null && !str.equals(this.f61961l.d())) {
                this.f61961l = new zi0(str, currentTimeMillis);
                SharedPreferences.Editor editor = this.f61956g;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.f61956g.putLong("app_settings_last_update_ms", currentTimeMillis);
                    this.f61956g.apply();
                }
                B();
                for (Runnable runnable : this.f61952c) {
                    runnable.run();
                }
                return;
            }
            this.f61961l.a(currentTimeMillis);
        }
    }

    @Override // yg.r1
    public final String W() {
        String str;
        A();
        synchronized (this.f61950a) {
            str = this.f61973x;
        }
        return str;
    }

    @Override // yg.r1
    public final String a() {
        String str;
        A();
        synchronized (this.f61950a) {
            str = this.f61958i;
        }
        return str;
    }

    @Override // yg.r1
    public final void b(boolean z10) {
        A();
        synchronized (this.f61950a) {
            if (this.f61968s == z10) {
                return;
            }
            this.f61968s = z10;
            SharedPreferences.Editor editor = this.f61956g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z10);
                this.f61956g.apply();
            }
            B();
        }
    }

    @Override // yg.r1
    public final void b0(boolean z10) {
        A();
        synchronized (this.f61950a) {
            if (this.f61969t == z10) {
                return;
            }
            this.f61969t = z10;
            SharedPreferences.Editor editor = this.f61956g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z10);
                this.f61956g.apply();
            }
            B();
        }
    }

    @Override // yg.r1
    public final void c(boolean z10) {
        A();
        synchronized (this.f61950a) {
            if (z10 == this.f61960k) {
                return;
            }
            this.f61960k = z10;
            SharedPreferences.Editor editor = this.f61956g;
            if (editor != null) {
                editor.putBoolean("gad_idless", z10);
                this.f61956g.apply();
            }
            B();
        }
    }

    @Override // yg.r1
    public final boolean d() {
        boolean z10;
        A();
        synchronized (this.f61950a) {
            z10 = this.f61968s;
        }
        return z10;
    }

    @Override // yg.r1
    public final boolean e() {
        boolean z10;
        A();
        synchronized (this.f61950a) {
            z10 = this.f61969t;
        }
        return z10;
    }

    @Override // yg.r1
    public final void f(Runnable runnable) {
        this.f61952c.add(runnable);
    }

    @Override // yg.r1
    public final void f0(int i10) {
        A();
        synchronized (this.f61950a) {
            if (this.f61965p == i10) {
                return;
            }
            this.f61965p = i10;
            SharedPreferences.Editor editor = this.f61956g;
            if (editor != null) {
                editor.putInt("version_code", i10);
                this.f61956g.apply();
            }
            B();
        }
    }

    @Override // yg.r1
    public final String g() {
        String str;
        A();
        synchronized (this.f61950a) {
            str = this.f61959j;
        }
        return str;
    }

    @Override // yg.r1
    public final void h(int i10) {
        A();
        synchronized (this.f61950a) {
            if (this.f61975z == i10) {
                return;
            }
            this.f61975z = i10;
            SharedPreferences.Editor editor = this.f61956g;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i10);
                this.f61956g.apply();
            }
            B();
        }
    }

    @Override // yg.r1
    public final void i(String str) {
        if (((Boolean) ft.c().c(ox.E6)).booleanValue()) {
            A();
            synchronized (this.f61950a) {
                if (this.f61973x.equals(str)) {
                    return;
                }
                this.f61973x = str;
                SharedPreferences.Editor editor = this.f61956g;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.f61956g.apply();
                }
                B();
            }
        }
    }

    @Override // yg.r1
    public final int j() {
        int i10;
        A();
        synchronized (this.f61950a) {
            i10 = this.f61965p;
        }
        return i10;
    }

    @Override // yg.r1
    public final void k(long j10) {
        A();
        synchronized (this.f61950a) {
            if (this.f61963n == j10) {
                return;
            }
            this.f61963n = j10;
            SharedPreferences.Editor editor = this.f61956g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j10);
                this.f61956g.apply();
            }
            B();
        }
    }

    @Override // yg.r1
    public final void l(String str, String str2, boolean z10) {
        A();
        synchronized (this.f61950a) {
            JSONArray optJSONArray = this.f61967r.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z10 && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    }
                    length = i10;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z10);
                jSONObject.put("timestamp_ms", wg.t.k().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.f61967r.put(str, optJSONArray);
            } catch (JSONException e10) {
                uj0.g("Could not update native advanced settings", e10);
            }
            SharedPreferences.Editor editor = this.f61956g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f61967r.toString());
                this.f61956g.apply();
            }
            B();
        }
    }

    @Override // yg.r1
    public final int m() {
        int i10;
        A();
        synchronized (this.f61950a) {
            i10 = this.f61964o;
        }
        return i10;
    }

    @Override // yg.r1
    public final void m0(int i10) {
        A();
        synchronized (this.f61950a) {
            if (this.f61964o == i10) {
                return;
            }
            this.f61964o = i10;
            SharedPreferences.Editor editor = this.f61956g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i10);
                this.f61956g.apply();
            }
            B();
        }
    }

    @Override // yg.r1
    public final zi0 n() {
        zi0 zi0Var;
        A();
        synchronized (this.f61950a) {
            zi0Var = this.f61961l;
        }
        return zi0Var;
    }

    @Override // yg.r1
    public final zi0 o() {
        zi0 zi0Var;
        synchronized (this.f61950a) {
            zi0Var = this.f61961l;
        }
        return zi0Var;
    }

    @Override // yg.r1
    public final void p(final Context context) {
        synchronized (this.f61950a) {
            if (this.f61955f != null) {
                return;
            }
            this.f61953d = hk0.f4878a.q(new Runnable(this, context, "admob") { // from class: yg.s1

                /* renamed from: w  reason: collision with root package name */
                public final u1 f61944w;

                /* renamed from: x  reason: collision with root package name */
                public final Context f61945x;

                /* renamed from: y  reason: collision with root package name */
                public final String f61946y = "admob";

                {
                    this.f61944w = this;
                    this.f61945x = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f61944w.y(this.f61945x, this.f61946y);
                }
            });
            this.f61951b = true;
        }
    }

    @Override // yg.r1
    public final void q(long j10) {
        A();
        synchronized (this.f61950a) {
            if (this.A == j10) {
                return;
            }
            this.A = j10;
            SharedPreferences.Editor editor = this.f61956g;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j10);
                this.f61956g.apply();
            }
            B();
        }
    }

    @Override // yg.r1
    public final void r(boolean z10) {
        if (((Boolean) ft.c().c(ox.E6)).booleanValue()) {
            A();
            synchronized (this.f61950a) {
                if (this.f61972w == z10) {
                    return;
                }
                this.f61972w = z10;
                SharedPreferences.Editor editor = this.f61956g;
                if (editor != null) {
                    editor.putBoolean("linked_device", z10);
                    this.f61956g.apply();
                }
                B();
            }
        }
    }

    @Override // yg.r1
    public final void s(String str) {
        A();
        synchronized (this.f61950a) {
            if (TextUtils.equals(this.f61970u, str)) {
                return;
            }
            this.f61970u = str;
            SharedPreferences.Editor editor = this.f61956g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.f61956g.apply();
            }
            B();
        }
    }

    @Override // yg.r1
    public final void t(long j10) {
        A();
        synchronized (this.f61950a) {
            if (this.f61962m == j10) {
                return;
            }
            this.f61962m = j10;
            SharedPreferences.Editor editor = this.f61956g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j10);
                this.f61956g.apply();
            }
            B();
        }
    }

    @Override // yg.r1
    public final String u() {
        String str;
        A();
        synchronized (this.f61950a) {
            str = this.f61970u;
        }
        return str;
    }

    @Override // yg.r1
    public final void v(String str) {
        if (((Boolean) ft.c().c(ox.f8067p6)).booleanValue()) {
            A();
            synchronized (this.f61950a) {
                if (this.f61971v.equals(str)) {
                    return;
                }
                this.f61971v = str;
                SharedPreferences.Editor editor = this.f61956g;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.f61956g.apply();
                }
                B();
            }
        }
    }

    @Override // yg.r1
    public final long w() {
        long j10;
        A();
        synchronized (this.f61950a) {
            j10 = this.f61962m;
        }
        return j10;
    }

    @Override // yg.r1
    public final boolean x() {
        boolean z10;
        if (((Boolean) ft.c().c(ox.f8053o0)).booleanValue()) {
            A();
            synchronized (this.f61950a) {
                z10 = this.f61960k;
            }
            return z10;
        }
        return false;
    }

    public final /* synthetic */ void y(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f61950a) {
            this.f61955f = sharedPreferences;
            this.f61956g = edit;
            if (vh.n.i()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.f61957h = this.f61955f.getBoolean("use_https", this.f61957h);
            this.f61968s = this.f61955f.getBoolean("content_url_opted_out", this.f61968s);
            this.f61958i = this.f61955f.getString("content_url_hashes", this.f61958i);
            this.f61960k = this.f61955f.getBoolean("gad_idless", this.f61960k);
            this.f61969t = this.f61955f.getBoolean("content_vertical_opted_out", this.f61969t);
            this.f61959j = this.f61955f.getString("content_vertical_hashes", this.f61959j);
            this.f61965p = this.f61955f.getInt("version_code", this.f61965p);
            this.f61961l = new zi0(this.f61955f.getString("app_settings_json", this.f61961l.d()), this.f61955f.getLong("app_settings_last_update_ms", this.f61961l.b()));
            this.f61962m = this.f61955f.getLong("app_last_background_time_ms", this.f61962m);
            this.f61964o = this.f61955f.getInt("request_in_session_count", this.f61964o);
            this.f61963n = this.f61955f.getLong("first_ad_req_time_ms", this.f61963n);
            this.f61966q = this.f61955f.getStringSet("never_pool_slots", this.f61966q);
            this.f61970u = this.f61955f.getString("display_cutout", this.f61970u);
            this.f61974y = this.f61955f.getInt("app_measurement_npa", this.f61974y);
            this.f61975z = this.f61955f.getInt("sd_app_measure_npa", this.f61975z);
            this.A = this.f61955f.getLong("sd_app_measure_npa_ts", this.A);
            this.f61971v = this.f61955f.getString("inspector_info", this.f61971v);
            this.f61972w = this.f61955f.getBoolean("linked_device", this.f61972w);
            this.f61973x = this.f61955f.getString("linked_ad_unit", this.f61973x);
            try {
                this.f61967r = new JSONObject(this.f61955f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e10) {
                uj0.g("Could not convert native advanced settings to json object", e10);
            }
            B();
        }
    }

    @Override // yg.r1
    public final void z() {
        A();
        synchronized (this.f61950a) {
            this.f61967r = new JSONObject();
            SharedPreferences.Editor editor = this.f61956g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f61956g.apply();
            }
            B();
        }
    }

    @Override // yg.r1
    public final vl zzb() {
        if (this.f61951b) {
            if (!(d() && e()) && wy.f11798b.e().booleanValue()) {
                synchronized (this.f61950a) {
                    if (Looper.getMainLooper() == null) {
                        return null;
                    }
                    if (this.f61954e == null) {
                        this.f61954e = new vl();
                    }
                    this.f61954e.a();
                    uj0.e("start fetching content...");
                    return this.f61954e;
                }
            }
            return null;
        }
        return null;
    }
}
