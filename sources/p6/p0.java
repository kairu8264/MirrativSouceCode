package p6;

import android.content.ContentResolver;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.net.api.Referer;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p0 {

    /* renamed from: v  reason: collision with root package name */
    public static z f46021v = k.h();

    /* renamed from: a  reason: collision with root package name */
    public long f46022a;

    /* renamed from: b  reason: collision with root package name */
    public u f46023b;

    /* renamed from: c  reason: collision with root package name */
    public g f46024c;

    /* renamed from: d  reason: collision with root package name */
    public a f46025d;

    /* renamed from: e  reason: collision with root package name */
    public y0 f46026e;

    /* renamed from: f  reason: collision with root package name */
    public long f46027f = -1;

    /* renamed from: g  reason: collision with root package name */
    public long f46028g = -1;

    /* renamed from: h  reason: collision with root package name */
    public long f46029h = -1;

    /* renamed from: i  reason: collision with root package name */
    public long f46030i = -1;

    /* renamed from: j  reason: collision with root package name */
    public long f46031j = -1;

    /* renamed from: k  reason: collision with root package name */
    public String f46032k;

    /* renamed from: l  reason: collision with root package name */
    public String f46033l;

    /* renamed from: m  reason: collision with root package name */
    public String f46034m;

    /* renamed from: n  reason: collision with root package name */
    public String f46035n;

    /* renamed from: o  reason: collision with root package name */
    public String f46036o;

    /* renamed from: p  reason: collision with root package name */
    public String f46037p;

    /* renamed from: q  reason: collision with root package name */
    public String f46038q;

    /* renamed from: r  reason: collision with root package name */
    public String f46039r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f46040s;

    /* renamed from: t  reason: collision with root package name */
    public f f46041t;

    /* renamed from: u  reason: collision with root package name */
    public Map<String, String> f46042u;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f46043a;

        /* renamed from: b  reason: collision with root package name */
        public int f46044b;

        /* renamed from: c  reason: collision with root package name */
        public int f46045c;

        /* renamed from: d  reason: collision with root package name */
        public long f46046d;

        /* renamed from: e  reason: collision with root package name */
        public long f46047e;

        /* renamed from: f  reason: collision with root package name */
        public long f46048f;

        /* renamed from: g  reason: collision with root package name */
        public String f46049g;

        /* renamed from: h  reason: collision with root package name */
        public String f46050h;

        public a(d dVar) {
            this.f46043a = -1;
            this.f46044b = -1;
            this.f46045c = -1;
            this.f46046d = -1L;
            this.f46047e = -1L;
            this.f46048f = -1L;
            this.f46049g = null;
            this.f46050h = null;
            if (dVar == null) {
                return;
            }
            this.f46043a = dVar.C;
            this.f46044b = dVar.D;
            this.f46045c = dVar.E;
            this.f46046d = dVar.G;
            this.f46047e = dVar.I;
            this.f46048f = dVar.F;
            this.f46049g = dVar.f45899x;
            this.f46050h = dVar.L;
        }
    }

    public p0(g gVar, u uVar, d dVar, y0 y0Var, long j10) {
        this.f46022a = j10;
        this.f46023b = uVar;
        this.f46024c = gVar;
        this.f46025d = new a(dVar);
        this.f46026e = y0Var;
    }

    public static void a(Map<String, String> map, String str, Boolean bool) {
        if (bool == null) {
            return;
        }
        g(map, str, bool.booleanValue() ? 1L : 0L);
    }

    public static void b(Map<String, String> map, String str, Date date) {
        if (date == null) {
            return;
        }
        i(map, str, c1.f45891b.format(date));
    }

    public static void c(Map<String, String> map, String str, long j10) {
        if (j10 <= 0) {
            return;
        }
        b(map, str, new Date(j10));
    }

    public static void d(Map<String, String> map, String str, long j10) {
        if (j10 <= 0) {
            return;
        }
        b(map, str, new Date(j10 * 1000));
    }

    public static void e(Map<String, String> map, String str, Double d10) {
        if (d10 == null) {
            return;
        }
        i(map, str, c1.k("%.5f", d10));
    }

    public static void f(Map<String, String> map, String str, long j10) {
        if (j10 < 0) {
            return;
        }
        g(map, str, (j10 + 500) / 1000);
    }

    public static void g(Map<String, String> map, String str, long j10) {
        if (j10 < 0) {
            return;
        }
        i(map, str, Long.toString(j10));
    }

    public static void h(Map<String, String> map, String str, Map map2) {
        if (map2 == null || map2.size() == 0) {
            return;
        }
        i(map, str, new JSONObject(map2).toString());
    }

    public static void i(Map<String, String> map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final String A(h hVar) {
        Double d10 = hVar.f45954b;
        return d10 == null ? c1.k("'%s'", hVar.f45953a) : c1.k("(%.5f %s, '%s')", d10, hVar.f45955c, hVar.f45953a);
    }

    public final Map<String, String> B() {
        ContentResolver contentResolver = this.f46024c.f45929d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f10 = u0.f(this.f46024c.f45929d, f46021v);
        if (f10 != null) {
            hashMap.putAll(f10);
        }
        Map<String, String> g10 = u0.g(this.f46024c.f45929d, f46021v);
        if (g10 != null) {
            hashMap.putAll(g10);
        }
        this.f46023b.A(this.f46024c.f45929d);
        i(hashMap, "android_uuid", this.f46025d.f46049g);
        i(hashMap, "gps_adid", this.f46023b.f46095a);
        g(hashMap, "gps_adid_attempt", this.f46023b.f46097c);
        i(hashMap, "gps_adid_src", this.f46023b.f46096b);
        a(hashMap, "tracking_enabled", this.f46023b.f46098d);
        i(hashMap, "fire_adid", c1.p(contentResolver));
        a(hashMap, "fire_tracking_enabled", c1.q(contentResolver));
        if (!u(hashMap) && !t(hashMap)) {
            f46021v.b("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f46023b.z(this.f46024c.f45929d);
            i(hashMap, "android_id", this.f46023b.f46102h);
            i(hashMap, "mac_md5", this.f46023b.f46101g);
            i(hashMap, "mac_sha1", this.f46023b.f46100f);
        }
        i(hashMap, "api_level", this.f46023b.f46112r);
        i(hashMap, "app_secret", this.f46024c.B);
        i(hashMap, "app_token", this.f46024c.f45930e);
        i(hashMap, "app_version", this.f46023b.f46106l);
        Boolean bool = Boolean.TRUE;
        a(hashMap, "attribution_deeplink", bool);
        c(hashMap, LogBase.CREATED_AT, this.f46022a);
        a(hashMap, "device_known", this.f46024c.f45937l);
        a(hashMap, "needs_cost", this.f46024c.E);
        i(hashMap, "device_name", this.f46023b.f46108n);
        i(hashMap, "device_type", this.f46023b.f46107m);
        g(hashMap, "ui_mode", this.f46023b.E);
        i(hashMap, "environment", this.f46024c.f45931f);
        a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f46024c.f45934i));
        i(hashMap, "external_device_id", this.f46024c.C);
        a(hashMap, "needs_response_details", bool);
        i(hashMap, "os_name", this.f46023b.f46110p);
        i(hashMap, "os_version", this.f46023b.f46111q);
        i(hashMap, "package_name", this.f46023b.f46105k);
        i(hashMap, "push_token", this.f46025d.f46050h);
        i(hashMap, "secret_id", this.f46024c.A);
        s(hashMap);
        return hashMap;
    }

    public final Map<String, String> C(String str) {
        ContentResolver contentResolver = this.f46024c.f45929d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f10 = u0.f(this.f46024c.f45929d, f46021v);
        if (f10 != null) {
            hashMap.putAll(f10);
        }
        Map<String, String> g10 = u0.g(this.f46024c.f45929d, f46021v);
        if (g10 != null) {
            hashMap.putAll(g10);
        }
        this.f46023b.A(this.f46024c.f45929d);
        i(hashMap, "android_uuid", this.f46025d.f46049g);
        i(hashMap, "gps_adid", this.f46023b.f46095a);
        g(hashMap, "gps_adid_attempt", this.f46023b.f46097c);
        i(hashMap, "gps_adid_src", this.f46023b.f46096b);
        a(hashMap, "tracking_enabled", this.f46023b.f46098d);
        i(hashMap, "fire_adid", c1.p(contentResolver));
        a(hashMap, "fire_tracking_enabled", c1.q(contentResolver));
        if (!u(hashMap) && !t(hashMap)) {
            f46021v.b("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f46023b.z(this.f46024c.f45929d);
            i(hashMap, "android_id", this.f46023b.f46102h);
            i(hashMap, "mac_md5", this.f46023b.f46101g);
            i(hashMap, "mac_sha1", this.f46023b.f46100f);
        }
        i(hashMap, "app_secret", this.f46024c.B);
        i(hashMap, "app_token", this.f46024c.f45930e);
        Boolean bool = Boolean.TRUE;
        a(hashMap, "attribution_deeplink", bool);
        c(hashMap, LogBase.CREATED_AT, this.f46022a);
        a(hashMap, "device_known", this.f46024c.f45937l);
        a(hashMap, "needs_cost", this.f46024c.E);
        i(hashMap, "environment", this.f46024c.f45931f);
        a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f46024c.f45934i));
        i(hashMap, "external_device_id", this.f46024c.C);
        a(hashMap, "needs_response_details", bool);
        i(hashMap, "push_token", this.f46025d.f46050h);
        i(hashMap, "secret_id", this.f46024c.A);
        i(hashMap, "source", str);
        s(hashMap);
        return hashMap;
    }

    public final Map<String, String> D(boolean z10) {
        ContentResolver contentResolver = this.f46024c.f45929d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f10 = u0.f(this.f46024c.f45929d, f46021v);
        if (f10 != null) {
            hashMap.putAll(f10);
        }
        Map<String, String> g10 = u0.g(this.f46024c.f45929d, f46021v);
        if (g10 != null) {
            hashMap.putAll(g10);
        }
        i(hashMap, "measurement", z10 ? "enable" : "disable");
        this.f46023b.A(this.f46024c.f45929d);
        i(hashMap, "android_uuid", this.f46025d.f46049g);
        i(hashMap, "gps_adid", this.f46023b.f46095a);
        g(hashMap, "gps_adid_attempt", this.f46023b.f46097c);
        i(hashMap, "gps_adid_src", this.f46023b.f46096b);
        a(hashMap, "tracking_enabled", this.f46023b.f46098d);
        i(hashMap, "fire_adid", c1.p(contentResolver));
        a(hashMap, "fire_tracking_enabled", c1.q(contentResolver));
        if (!u(hashMap) && !t(hashMap)) {
            f46021v.b("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f46023b.z(this.f46024c.f45929d);
            i(hashMap, "android_id", this.f46023b.f46102h);
            i(hashMap, "mac_md5", this.f46023b.f46101g);
            i(hashMap, "mac_sha1", this.f46023b.f46100f);
        }
        i(hashMap, "api_level", this.f46023b.f46112r);
        i(hashMap, "app_secret", this.f46024c.B);
        i(hashMap, "app_token", this.f46024c.f45930e);
        i(hashMap, "app_version", this.f46023b.f46106l);
        Boolean bool = Boolean.TRUE;
        a(hashMap, "attribution_deeplink", bool);
        c(hashMap, LogBase.CREATED_AT, this.f46022a);
        a(hashMap, "device_known", this.f46024c.f45937l);
        i(hashMap, "device_name", this.f46023b.f46108n);
        i(hashMap, "device_type", this.f46023b.f46107m);
        g(hashMap, "ui_mode", this.f46023b.E);
        i(hashMap, "environment", this.f46024c.f45931f);
        a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f46024c.f45934i));
        i(hashMap, "external_device_id", this.f46024c.C);
        a(hashMap, "needs_response_details", bool);
        i(hashMap, "os_name", this.f46023b.f46110p);
        i(hashMap, "os_version", this.f46023b.f46111q);
        i(hashMap, "package_name", this.f46023b.f46105k);
        i(hashMap, "push_token", this.f46025d.f46050h);
        i(hashMap, "secret_id", this.f46024c.A);
        s(hashMap);
        return hashMap;
    }

    public final Map<String, String> E(boolean z10) {
        ContentResolver contentResolver = this.f46024c.f45929d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f10 = u0.f(this.f46024c.f45929d, f46021v);
        if (f10 != null) {
            hashMap.putAll(f10);
        }
        Map<String, String> g10 = u0.g(this.f46024c.f45929d, f46021v);
        if (g10 != null) {
            hashMap.putAll(g10);
        }
        if (!z10) {
            h(hashMap, "callback_params", this.f46026e.f46170a);
            h(hashMap, "partner_params", this.f46026e.f46171b);
        }
        this.f46023b.A(this.f46024c.f45929d);
        i(hashMap, "android_uuid", this.f46025d.f46049g);
        i(hashMap, "gps_adid", this.f46023b.f46095a);
        g(hashMap, "gps_adid_attempt", this.f46023b.f46097c);
        i(hashMap, "gps_adid_src", this.f46023b.f46096b);
        a(hashMap, "tracking_enabled", this.f46023b.f46098d);
        i(hashMap, "fire_adid", c1.p(contentResolver));
        a(hashMap, "fire_tracking_enabled", c1.q(contentResolver));
        if (!u(hashMap) && !t(hashMap)) {
            f46021v.b("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f46023b.z(this.f46024c.f45929d);
            i(hashMap, "android_id", this.f46023b.f46102h);
            i(hashMap, "mac_md5", this.f46023b.f46101g);
            i(hashMap, "mac_sha1", this.f46023b.f46100f);
        }
        i(hashMap, "api_level", this.f46023b.f46112r);
        i(hashMap, "app_secret", this.f46024c.B);
        i(hashMap, "app_token", this.f46024c.f45930e);
        i(hashMap, "app_version", this.f46023b.f46106l);
        Boolean bool = Boolean.TRUE;
        a(hashMap, "attribution_deeplink", bool);
        g(hashMap, "connectivity_type", c1.n(this.f46024c.f45929d));
        i(hashMap, "country", this.f46023b.f46114t);
        i(hashMap, "cpu_type", this.f46023b.A);
        c(hashMap, LogBase.CREATED_AT, this.f46022a);
        i(hashMap, "default_tracker", this.f46024c.f45935j);
        a(hashMap, "device_known", this.f46024c.f45937l);
        a(hashMap, "needs_cost", this.f46024c.E);
        i(hashMap, "device_manufacturer", this.f46023b.f46109o);
        i(hashMap, "device_name", this.f46023b.f46108n);
        i(hashMap, "device_type", this.f46023b.f46107m);
        g(hashMap, "ui_mode", this.f46023b.E);
        i(hashMap, "display_height", this.f46023b.f46119y);
        i(hashMap, "display_width", this.f46023b.f46118x);
        i(hashMap, "environment", this.f46024c.f45931f);
        a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f46024c.f45934i));
        i(hashMap, "external_device_id", this.f46024c.C);
        i(hashMap, "fb_id", this.f46023b.f46103i);
        i(hashMap, "hardware_name", this.f46023b.f46120z);
        i(hashMap, "installed_at", this.f46023b.C);
        i(hashMap, "language", this.f46023b.f46113s);
        f(hashMap, "last_interval", this.f46025d.f46047e);
        i(hashMap, "mcc", c1.u(this.f46024c.f45929d));
        i(hashMap, "mnc", c1.v(this.f46024c.f45929d));
        a(hashMap, "needs_response_details", bool);
        g(hashMap, LogBase.NETWORK_TYPE, c1.w(this.f46024c.f45929d));
        i(hashMap, "os_build", this.f46023b.B);
        i(hashMap, "os_name", this.f46023b.f46110p);
        i(hashMap, "os_version", this.f46023b.f46111q);
        i(hashMap, "package_name", this.f46023b.f46105k);
        i(hashMap, "push_token", this.f46025d.f46050h);
        i(hashMap, "screen_density", this.f46023b.f46117w);
        i(hashMap, "screen_format", this.f46023b.f46116v);
        i(hashMap, "screen_size", this.f46023b.f46115u);
        i(hashMap, "secret_id", this.f46024c.A);
        g(hashMap, "session_count", this.f46025d.f46044b);
        f(hashMap, "session_length", this.f46025d.f46048f);
        g(hashMap, "subsession_count", this.f46025d.f46045c);
        f(hashMap, "time_spent", this.f46025d.f46046d);
        i(hashMap, "updated_at", this.f46023b.D);
        s(hashMap);
        return hashMap;
    }

    public final Map<String, String> F(p pVar) {
        ContentResolver contentResolver = this.f46024c.f45929d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f10 = u0.f(this.f46024c.f45929d, f46021v);
        if (f10 != null) {
            hashMap.putAll(f10);
        }
        Map<String, String> g10 = u0.g(this.f46024c.f45929d, f46021v);
        if (g10 != null) {
            hashMap.putAll(g10);
        }
        Boolean bool = pVar.f46019a;
        if (bool != null) {
            i(hashMap, "sharing", bool.booleanValue() ? "enable" : "disable");
        }
        h(hashMap, "granular_third_party_sharing_options", pVar.f46020b);
        this.f46023b.A(this.f46024c.f45929d);
        i(hashMap, "android_uuid", this.f46025d.f46049g);
        i(hashMap, "gps_adid", this.f46023b.f46095a);
        g(hashMap, "gps_adid_attempt", this.f46023b.f46097c);
        i(hashMap, "gps_adid_src", this.f46023b.f46096b);
        a(hashMap, "tracking_enabled", this.f46023b.f46098d);
        i(hashMap, "fire_adid", c1.p(contentResolver));
        a(hashMap, "fire_tracking_enabled", c1.q(contentResolver));
        if (!u(hashMap) && !t(hashMap)) {
            f46021v.b("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f46023b.z(this.f46024c.f45929d);
            i(hashMap, "android_id", this.f46023b.f46102h);
            i(hashMap, "mac_md5", this.f46023b.f46101g);
            i(hashMap, "mac_sha1", this.f46023b.f46100f);
        }
        i(hashMap, "api_level", this.f46023b.f46112r);
        i(hashMap, "app_secret", this.f46024c.B);
        i(hashMap, "app_token", this.f46024c.f45930e);
        i(hashMap, "app_version", this.f46023b.f46106l);
        Boolean bool2 = Boolean.TRUE;
        a(hashMap, "attribution_deeplink", bool2);
        c(hashMap, LogBase.CREATED_AT, this.f46022a);
        a(hashMap, "device_known", this.f46024c.f45937l);
        i(hashMap, "device_name", this.f46023b.f46108n);
        i(hashMap, "device_type", this.f46023b.f46107m);
        g(hashMap, "ui_mode", this.f46023b.E);
        i(hashMap, "environment", this.f46024c.f45931f);
        a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f46024c.f45934i));
        i(hashMap, "external_device_id", this.f46024c.C);
        a(hashMap, "needs_response_details", bool2);
        i(hashMap, "os_name", this.f46023b.f46110p);
        i(hashMap, "os_version", this.f46023b.f46111q);
        i(hashMap, "package_name", this.f46023b.f46105k);
        i(hashMap, "push_token", this.f46025d.f46050h);
        i(hashMap, "secret_id", this.f46024c.A);
        s(hashMap);
        return hashMap;
    }

    public c j(String str) {
        Map<String, String> v10 = v(str);
        b bVar = b.ATTRIBUTION;
        c x10 = x(bVar);
        x10.D("attribution");
        x10.E("");
        String bVar2 = bVar.toString();
        String f10 = x10.f();
        g gVar = this.f46024c;
        o.c(v10, bVar2, f10, gVar.f45929d, gVar.f45947v);
        x10.B(v10);
        return x10;
    }

    public c k(String str) {
        Map<String, String> w10 = w(str);
        b bVar = b.CLICK;
        c x10 = x(bVar);
        x10.D("/sdk_click");
        x10.E("");
        x10.t(this.f46028g);
        x10.u(this.f46027f);
        x10.y(this.f46029h);
        x10.v(this.f46030i);
        x10.z(this.f46031j);
        x10.A(this.f46035n);
        x10.x(this.f46040s);
        String bVar2 = bVar.toString();
        String f10 = x10.f();
        g gVar = this.f46024c;
        o.c(w10, bVar2, f10, gVar.f45929d, gVar.f45947v);
        x10.B(w10);
        return x10;
    }

    public c l() {
        Map<String, String> y10 = y();
        b bVar = b.DISABLE_THIRD_PARTY_SHARING;
        c x10 = x(bVar);
        x10.D("/disable_third_party_sharing");
        x10.E("");
        String bVar2 = bVar.toString();
        String f10 = x10.f();
        g gVar = this.f46024c;
        o.c(y10, bVar2, f10, gVar.f45929d, gVar.f45947v);
        x10.B(y10);
        return x10;
    }

    public c m(h hVar, boolean z10) {
        Map<String, String> z11 = z(hVar, z10);
        b bVar = b.EVENT;
        c x10 = x(bVar);
        x10.D("/event");
        x10.E(A(hVar));
        String bVar2 = bVar.toString();
        String f10 = x10.f();
        g gVar = this.f46024c;
        o.c(z11, bVar2, f10, gVar.f45929d, gVar.f45947v);
        x10.B(z11);
        if (z10) {
            x10.s(hVar.f45956d);
            x10.C(hVar.f45957e);
        }
        return x10;
    }

    public c n() {
        Map<String, String> B = B();
        b bVar = b.GDPR;
        c x10 = x(bVar);
        x10.D("/gdpr_forget_device");
        x10.E("");
        String bVar2 = bVar.toString();
        String f10 = x10.f();
        g gVar = this.f46024c;
        o.c(B, bVar2, f10, gVar.f45929d, gVar.f45947v);
        x10.B(B);
        return x10;
    }

    public c o(String str) {
        Map<String, String> C = C(str);
        b bVar = b.INFO;
        c x10 = x(bVar);
        x10.D("/sdk_info");
        x10.E("");
        String bVar2 = bVar.toString();
        String f10 = x10.f();
        g gVar = this.f46024c;
        o.c(C, bVar2, f10, gVar.f45929d, gVar.f45947v);
        x10.B(C);
        return x10;
    }

    public c p(boolean z10) {
        Map<String, String> D = D(z10);
        b bVar = b.MEASUREMENT_CONSENT;
        c x10 = x(bVar);
        x10.D("/measurement_consent");
        x10.E("");
        String bVar2 = bVar.toString();
        String f10 = x10.f();
        g gVar = this.f46024c;
        o.c(D, bVar2, f10, gVar.f45929d, gVar.f45947v);
        x10.B(D);
        return x10;
    }

    public c q(boolean z10) {
        Map<String, String> E = E(z10);
        b bVar = b.SESSION;
        c x10 = x(bVar);
        x10.D("/session");
        x10.E("");
        String bVar2 = bVar.toString();
        String f10 = x10.f();
        g gVar = this.f46024c;
        o.c(E, bVar2, f10, gVar.f45929d, gVar.f45947v);
        x10.B(E);
        return x10;
    }

    public c r(p pVar) {
        Map<String, String> F = F(pVar);
        b bVar = b.THIRD_PARTY_SHARING;
        c x10 = x(bVar);
        x10.D("/third_party_sharing");
        x10.E("");
        String bVar2 = bVar.toString();
        String f10 = x10.f();
        g gVar = this.f46024c;
        o.c(F, bVar2, f10, gVar.f45929d, gVar.f45947v);
        x10.B(F);
        return x10;
    }

    public final void s(Map<String, String> map) {
        if (map == null || map.containsKey("mac_sha1") || map.containsKey("mac_md5") || map.containsKey("android_id") || map.containsKey("gps_adid") || map.containsKey("fire_adid") || map.containsKey("oaid") || map.containsKey("imei") || map.containsKey("meid") || map.containsKey("device_id") || map.containsKey("imeis") || map.containsKey("meids") || map.containsKey("device_ids")) {
            return;
        }
        f46021v.c("Missing device id's. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
    }

    public final boolean t(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        return map.containsKey("fire_adid");
    }

    public final boolean u(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        return map.containsKey("gps_adid");
    }

    public final Map<String, String> v(String str) {
        ContentResolver contentResolver = this.f46024c.f45929d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f10 = u0.f(this.f46024c.f45929d, f46021v);
        if (f10 != null) {
            hashMap.putAll(f10);
        }
        Map<String, String> g10 = u0.g(this.f46024c.f45929d, f46021v);
        if (g10 != null) {
            hashMap.putAll(g10);
        }
        this.f46023b.A(this.f46024c.f45929d);
        i(hashMap, "android_uuid", this.f46025d.f46049g);
        i(hashMap, "gps_adid", this.f46023b.f46095a);
        g(hashMap, "gps_adid_attempt", this.f46023b.f46097c);
        i(hashMap, "gps_adid_src", this.f46023b.f46096b);
        a(hashMap, "tracking_enabled", this.f46023b.f46098d);
        i(hashMap, "fire_adid", c1.p(contentResolver));
        a(hashMap, "fire_tracking_enabled", c1.q(contentResolver));
        if (!u(hashMap) && !t(hashMap)) {
            f46021v.b("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f46023b.z(this.f46024c.f45929d);
            i(hashMap, "android_id", this.f46023b.f46102h);
            i(hashMap, "mac_md5", this.f46023b.f46101g);
            i(hashMap, "mac_sha1", this.f46023b.f46100f);
        }
        i(hashMap, "api_level", this.f46023b.f46112r);
        i(hashMap, "app_secret", this.f46024c.B);
        i(hashMap, "app_token", this.f46024c.f45930e);
        i(hashMap, "app_version", this.f46023b.f46106l);
        Boolean bool = Boolean.TRUE;
        a(hashMap, "attribution_deeplink", bool);
        c(hashMap, LogBase.CREATED_AT, this.f46022a);
        a(hashMap, "device_known", this.f46024c.f45937l);
        a(hashMap, "needs_cost", this.f46024c.E);
        i(hashMap, "device_name", this.f46023b.f46108n);
        i(hashMap, "device_type", this.f46023b.f46107m);
        g(hashMap, "ui_mode", this.f46023b.E);
        i(hashMap, "environment", this.f46024c.f45931f);
        a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f46024c.f45934i));
        i(hashMap, "external_device_id", this.f46024c.C);
        i(hashMap, "initiated_by", str);
        a(hashMap, "needs_response_details", bool);
        i(hashMap, "os_name", this.f46023b.f46110p);
        i(hashMap, "os_version", this.f46023b.f46111q);
        i(hashMap, "package_name", this.f46023b.f46105k);
        i(hashMap, "push_token", this.f46025d.f46050h);
        i(hashMap, "secret_id", this.f46024c.A);
        s(hashMap);
        return hashMap;
    }

    public final Map<String, String> w(String str) {
        ContentResolver contentResolver = this.f46024c.f45929d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f10 = u0.f(this.f46024c.f45929d, f46021v);
        if (f10 != null) {
            hashMap.putAll(f10);
        }
        Map<String, String> g10 = u0.g(this.f46024c.f45929d, f46021v);
        if (g10 != null) {
            hashMap.putAll(g10);
        }
        this.f46023b.A(this.f46024c.f45929d);
        i(hashMap, "android_uuid", this.f46025d.f46049g);
        i(hashMap, "gps_adid", this.f46023b.f46095a);
        g(hashMap, "gps_adid_attempt", this.f46023b.f46097c);
        i(hashMap, "gps_adid_src", this.f46023b.f46096b);
        a(hashMap, "tracking_enabled", this.f46023b.f46098d);
        i(hashMap, "fire_adid", c1.p(contentResolver));
        a(hashMap, "fire_tracking_enabled", c1.q(contentResolver));
        if (!u(hashMap) && !t(hashMap)) {
            f46021v.b("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f46023b.z(this.f46024c.f45929d);
            i(hashMap, "android_id", this.f46023b.f46102h);
            i(hashMap, "mac_md5", this.f46023b.f46101g);
            i(hashMap, "mac_sha1", this.f46023b.f46100f);
        }
        f fVar = this.f46041t;
        if (fVar != null) {
            i(hashMap, "tracker", fVar.f45923x);
            i(hashMap, "campaign", this.f46041t.f45925z);
            i(hashMap, "adgroup", this.f46041t.A);
            i(hashMap, "creative", this.f46041t.B);
        }
        i(hashMap, "api_level", this.f46023b.f46112r);
        i(hashMap, "app_secret", this.f46024c.B);
        i(hashMap, "app_token", this.f46024c.f45930e);
        i(hashMap, "app_version", this.f46023b.f46106l);
        Boolean bool = Boolean.TRUE;
        a(hashMap, "attribution_deeplink", bool);
        h(hashMap, "callback_params", this.f46026e.f46170a);
        c(hashMap, "click_time", this.f46028g);
        d(hashMap, "click_time", this.f46027f);
        d(hashMap, "click_time_server", this.f46030i);
        g(hashMap, "connectivity_type", c1.n(this.f46024c.f45929d));
        i(hashMap, "country", this.f46023b.f46114t);
        i(hashMap, "cpu_type", this.f46023b.A);
        c(hashMap, LogBase.CREATED_AT, this.f46022a);
        i(hashMap, Referer.DEEPLINK, this.f46033l);
        a(hashMap, "device_known", this.f46024c.f45937l);
        a(hashMap, "needs_cost", this.f46024c.E);
        i(hashMap, "device_manufacturer", this.f46023b.f46109o);
        i(hashMap, "device_name", this.f46023b.f46108n);
        i(hashMap, "device_type", this.f46023b.f46107m);
        g(hashMap, "ui_mode", this.f46023b.E);
        i(hashMap, "display_height", this.f46023b.f46119y);
        i(hashMap, "display_width", this.f46023b.f46118x);
        i(hashMap, "environment", this.f46024c.f45931f);
        a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f46024c.f45934i));
        i(hashMap, "external_device_id", this.f46024c.C);
        i(hashMap, "fb_id", this.f46023b.f46103i);
        a(hashMap, "google_play_instant", this.f46040s);
        i(hashMap, "hardware_name", this.f46023b.f46120z);
        d(hashMap, "install_begin_time", this.f46029h);
        d(hashMap, "install_begin_time_server", this.f46031j);
        i(hashMap, "install_version", this.f46035n);
        i(hashMap, "installed_at", this.f46023b.C);
        i(hashMap, "language", this.f46023b.f46113s);
        f(hashMap, "last_interval", this.f46025d.f46047e);
        i(hashMap, "mcc", c1.u(this.f46024c.f45929d));
        i(hashMap, "mnc", c1.v(this.f46024c.f45929d));
        a(hashMap, "needs_response_details", bool);
        g(hashMap, LogBase.NETWORK_TYPE, c1.w(this.f46024c.f45929d));
        i(hashMap, "os_build", this.f46023b.B);
        i(hashMap, "os_name", this.f46023b.f46110p);
        i(hashMap, "os_version", this.f46023b.f46111q);
        i(hashMap, "package_name", this.f46023b.f46105k);
        h(hashMap, "params", this.f46042u);
        h(hashMap, "partner_params", this.f46026e.f46171b);
        i(hashMap, "push_token", this.f46025d.f46050h);
        i(hashMap, "raw_referrer", this.f46036o);
        i(hashMap, "referrer", this.f46034m);
        i(hashMap, "referrer_api", this.f46037p);
        i(hashMap, "reftag", this.f46032k);
        i(hashMap, "screen_density", this.f46023b.f46117w);
        i(hashMap, "screen_format", this.f46023b.f46116v);
        i(hashMap, "screen_size", this.f46023b.f46115u);
        i(hashMap, "secret_id", this.f46024c.A);
        g(hashMap, "session_count", this.f46025d.f46044b);
        f(hashMap, "session_length", this.f46025d.f46048f);
        i(hashMap, "source", str);
        g(hashMap, "subsession_count", this.f46025d.f46045c);
        f(hashMap, "time_spent", this.f46025d.f46046d);
        i(hashMap, "updated_at", this.f46023b.D);
        i(hashMap, "payload", this.f46038q);
        i(hashMap, "found_location", this.f46039r);
        s(hashMap);
        return hashMap;
    }

    public final c x(b bVar) {
        c cVar = new c(bVar);
        cVar.w(this.f46023b.f46104j);
        return cVar;
    }

    public final Map<String, String> y() {
        ContentResolver contentResolver = this.f46024c.f45929d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f10 = u0.f(this.f46024c.f45929d, f46021v);
        if (f10 != null) {
            hashMap.putAll(f10);
        }
        Map<String, String> g10 = u0.g(this.f46024c.f45929d, f46021v);
        if (g10 != null) {
            hashMap.putAll(g10);
        }
        this.f46023b.A(this.f46024c.f45929d);
        i(hashMap, "android_uuid", this.f46025d.f46049g);
        i(hashMap, "gps_adid", this.f46023b.f46095a);
        g(hashMap, "gps_adid_attempt", this.f46023b.f46097c);
        i(hashMap, "gps_adid_src", this.f46023b.f46096b);
        a(hashMap, "tracking_enabled", this.f46023b.f46098d);
        i(hashMap, "fire_adid", c1.p(contentResolver));
        a(hashMap, "fire_tracking_enabled", c1.q(contentResolver));
        if (!u(hashMap) && !t(hashMap)) {
            f46021v.b("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f46023b.z(this.f46024c.f45929d);
            i(hashMap, "android_id", this.f46023b.f46102h);
            i(hashMap, "mac_md5", this.f46023b.f46101g);
            i(hashMap, "mac_sha1", this.f46023b.f46100f);
        }
        i(hashMap, "api_level", this.f46023b.f46112r);
        i(hashMap, "app_secret", this.f46024c.B);
        i(hashMap, "app_token", this.f46024c.f45930e);
        i(hashMap, "app_version", this.f46023b.f46106l);
        Boolean bool = Boolean.TRUE;
        a(hashMap, "attribution_deeplink", bool);
        c(hashMap, LogBase.CREATED_AT, this.f46022a);
        a(hashMap, "device_known", this.f46024c.f45937l);
        a(hashMap, "needs_cost", this.f46024c.E);
        i(hashMap, "device_name", this.f46023b.f46108n);
        i(hashMap, "device_type", this.f46023b.f46107m);
        g(hashMap, "ui_mode", this.f46023b.E);
        i(hashMap, "environment", this.f46024c.f45931f);
        a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f46024c.f45934i));
        i(hashMap, "external_device_id", this.f46024c.C);
        a(hashMap, "needs_response_details", bool);
        i(hashMap, "os_name", this.f46023b.f46110p);
        i(hashMap, "os_version", this.f46023b.f46111q);
        i(hashMap, "package_name", this.f46023b.f46105k);
        i(hashMap, "push_token", this.f46025d.f46050h);
        i(hashMap, "secret_id", this.f46024c.A);
        s(hashMap);
        return hashMap;
    }

    public Map<String, String> z(h hVar, boolean z10) {
        ContentResolver contentResolver = this.f46024c.f45929d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f10 = u0.f(this.f46024c.f45929d, f46021v);
        if (f10 != null) {
            hashMap.putAll(f10);
        }
        Map<String, String> g10 = u0.g(this.f46024c.f45929d, f46021v);
        if (g10 != null) {
            hashMap.putAll(g10);
        }
        if (!z10) {
            h(hashMap, "callback_params", c1.T(this.f46026e.f46170a, hVar.f45956d, "Callback"));
            h(hashMap, "partner_params", c1.T(this.f46026e.f46171b, hVar.f45957e, "Partner"));
        }
        this.f46023b.A(this.f46024c.f45929d);
        i(hashMap, "android_uuid", this.f46025d.f46049g);
        i(hashMap, "gps_adid", this.f46023b.f46095a);
        g(hashMap, "gps_adid_attempt", this.f46023b.f46097c);
        i(hashMap, "gps_adid_src", this.f46023b.f46096b);
        a(hashMap, "tracking_enabled", this.f46023b.f46098d);
        i(hashMap, "fire_adid", c1.p(contentResolver));
        a(hashMap, "fire_tracking_enabled", c1.q(contentResolver));
        if (!u(hashMap) && !t(hashMap)) {
            f46021v.b("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f46023b.z(this.f46024c.f45929d);
            i(hashMap, "android_id", this.f46023b.f46102h);
            i(hashMap, "mac_md5", this.f46023b.f46101g);
            i(hashMap, "mac_sha1", this.f46023b.f46100f);
        }
        i(hashMap, "api_level", this.f46023b.f46112r);
        i(hashMap, "app_secret", this.f46024c.B);
        i(hashMap, "app_token", this.f46024c.f45930e);
        i(hashMap, "app_version", this.f46023b.f46106l);
        Boolean bool = Boolean.TRUE;
        a(hashMap, "attribution_deeplink", bool);
        g(hashMap, "connectivity_type", c1.n(this.f46024c.f45929d));
        i(hashMap, "country", this.f46023b.f46114t);
        i(hashMap, "cpu_type", this.f46023b.A);
        c(hashMap, LogBase.CREATED_AT, this.f46022a);
        i(hashMap, "currency", hVar.f45955c);
        a(hashMap, "device_known", this.f46024c.f45937l);
        a(hashMap, "needs_cost", this.f46024c.E);
        i(hashMap, "device_manufacturer", this.f46023b.f46109o);
        i(hashMap, "device_name", this.f46023b.f46108n);
        i(hashMap, "device_type", this.f46023b.f46107m);
        g(hashMap, "ui_mode", this.f46023b.E);
        i(hashMap, "display_height", this.f46023b.f46119y);
        i(hashMap, "display_width", this.f46023b.f46118x);
        i(hashMap, "environment", this.f46024c.f45931f);
        i(hashMap, "event_callback_id", hVar.f45959g);
        g(hashMap, "event_count", this.f46025d.f46043a);
        a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f46024c.f45934i));
        i(hashMap, "event_token", hVar.f45953a);
        i(hashMap, "external_device_id", this.f46024c.C);
        i(hashMap, "fb_id", this.f46023b.f46103i);
        i(hashMap, "hardware_name", this.f46023b.f46120z);
        i(hashMap, "language", this.f46023b.f46113s);
        i(hashMap, "mcc", c1.u(this.f46024c.f45929d));
        i(hashMap, "mnc", c1.v(this.f46024c.f45929d));
        a(hashMap, "needs_response_details", bool);
        g(hashMap, LogBase.NETWORK_TYPE, c1.w(this.f46024c.f45929d));
        i(hashMap, "os_build", this.f46023b.B);
        i(hashMap, "os_name", this.f46023b.f46110p);
        i(hashMap, "os_version", this.f46023b.f46111q);
        i(hashMap, "package_name", this.f46023b.f46105k);
        i(hashMap, "push_token", this.f46025d.f46050h);
        e(hashMap, "revenue", hVar.f45954b);
        i(hashMap, "screen_density", this.f46023b.f46117w);
        i(hashMap, "screen_format", this.f46023b.f46116v);
        i(hashMap, "screen_size", this.f46023b.f46115u);
        i(hashMap, "secret_id", this.f46024c.A);
        g(hashMap, "session_count", this.f46025d.f46044b);
        f(hashMap, "session_length", this.f46025d.f46048f);
        g(hashMap, "subsession_count", this.f46025d.f46045c);
        f(hashMap, "time_spent", this.f46025d.f46046d);
        s(hashMap);
        return hashMap;
    }
}
