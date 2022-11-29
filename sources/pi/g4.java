package pi;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public final class g4 extends w5 {

    /* renamed from: x  reason: collision with root package name */
    public static final Pair<String, Long> f47822x = new Pair<>("", 0L);

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f47823c;

    /* renamed from: d  reason: collision with root package name */
    public d4 f47824d;

    /* renamed from: e  reason: collision with root package name */
    public final b4 f47825e;

    /* renamed from: f  reason: collision with root package name */
    public final b4 f47826f;

    /* renamed from: g  reason: collision with root package name */
    public final e4 f47827g;

    /* renamed from: h  reason: collision with root package name */
    public String f47828h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f47829i;

    /* renamed from: j  reason: collision with root package name */
    public long f47830j;

    /* renamed from: k  reason: collision with root package name */
    public final b4 f47831k;

    /* renamed from: l  reason: collision with root package name */
    public final z3 f47832l;

    /* renamed from: m  reason: collision with root package name */
    public final e4 f47833m;

    /* renamed from: n  reason: collision with root package name */
    public final z3 f47834n;

    /* renamed from: o  reason: collision with root package name */
    public final b4 f47835o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f47836p;

    /* renamed from: q  reason: collision with root package name */
    public final z3 f47837q;

    /* renamed from: r  reason: collision with root package name */
    public final z3 f47838r;

    /* renamed from: s  reason: collision with root package name */
    public final b4 f47839s;

    /* renamed from: t  reason: collision with root package name */
    public final e4 f47840t;

    /* renamed from: u  reason: collision with root package name */
    public final e4 f47841u;

    /* renamed from: v  reason: collision with root package name */
    public final b4 f47842v;

    /* renamed from: w  reason: collision with root package name */
    public final a4 f47843w;

    public g4(b5 b5Var) {
        super(b5Var);
        this.f47831k = new b4(this, "session_timeout", 1800000L);
        this.f47832l = new z3(this, "start_new_session", true);
        this.f47835o = new b4(this, "last_pause_time", 0L);
        this.f47833m = new e4(this, "non_personalized_ads", null);
        this.f47834n = new z3(this, "allow_remote_dynamite", false);
        this.f47825e = new b4(this, "first_open_time", 0L);
        this.f47826f = new b4(this, "app_install_time", 0L);
        this.f47827g = new e4(this, "app_instance_id", null);
        this.f47837q = new z3(this, "app_backgrounded", false);
        this.f47838r = new z3(this, "deep_link_retrieval_complete", false);
        this.f47839s = new b4(this, "deep_link_retrieval_attempts", 0L);
        this.f47840t = new e4(this, "firebase_feature_rollouts", null);
        this.f47841u = new e4(this, "deferred_attribution_cache", null);
        this.f47842v = new b4(this, "deferred_attribution_cache_timestamp", 0L);
        this.f47843w = new a4(this, "default_event_parameters", null);
    }

    @Override // pi.w5
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    public final void g() {
        SharedPreferences sharedPreferences = this.f48285a.F().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f47823c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f47836p = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f47823c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f48285a.y();
        this.f47824d = new d4(this, "health_monitor", Math.max(0L, c3.f47694d.a(null).longValue()), null);
    }

    @Override // pi.w5
    public final boolean h() {
        return true;
    }

    public final SharedPreferences m() {
        f();
        i();
        rh.p.i(this.f47823c);
        return this.f47823c;
    }

    public final Pair<String, Boolean> n(String str) {
        f();
        long elapsedRealtime = this.f48285a.c().elapsedRealtime();
        String str2 = this.f47828h;
        if (str2 != null && elapsedRealtime < this.f47830j) {
            return new Pair<>(str2, Boolean.valueOf(this.f47829i));
        }
        this.f47830j = elapsedRealtime + this.f48285a.y().p(str, c3.f47692c);
        AdvertisingIdClient.c(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f48285a.F());
            this.f47828h = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.f47828h = id2;
            }
            this.f47829i = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e10) {
            this.f48285a.r().o().b("Unable to get advertising id", e10);
            this.f47828h = "";
        }
        AdvertisingIdClient.c(false);
        return new Pair<>(this.f47828h, Boolean.valueOf(this.f47829i));
    }

    public final h o() {
        f();
        return h.b(m().getString("consent_settings", "G1"));
    }

    public final Boolean p() {
        f();
        if (m().contains("measurement_enabled")) {
            return Boolean.valueOf(m().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final void q(Boolean bool) {
        f();
        SharedPreferences.Editor edit = m().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void s(boolean z10) {
        f();
        this.f48285a.r().u().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = m().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    public final boolean t() {
        SharedPreferences sharedPreferences = this.f47823c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final boolean u(long j10) {
        return j10 - this.f47831k.a() > this.f47835o.a();
    }

    public final boolean v(int i10) {
        return h.l(i10, m().getInt("consent_source", 100));
    }
}
