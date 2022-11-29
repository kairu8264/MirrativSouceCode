package ai;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dm0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3335a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3336b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3337c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3338d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3339e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3340f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3341g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3342h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3343i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3344j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3345k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f3346l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f3347m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f3348n;

    public dm0(String str) {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f3335a = a(jSONObject, "aggressive_media_codec_release", ox.D);
        this.f3336b = b(jSONObject, "byte_buffer_precache_limit", ox.f8012j);
        this.f3337c = b(jSONObject, "exo_cache_buffer_size", ox.f8076r);
        this.f3338d = b(jSONObject, "exo_connect_timeout_millis", ox.f7980f);
        gx<String> gxVar = ox.f7972e;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.f3339e = string;
            this.f3340f = b(jSONObject, "exo_read_timeout_millis", ox.f7988g);
            this.f3341g = b(jSONObject, "load_check_interval_bytes", ox.f7996h);
            this.f3342h = b(jSONObject, "player_precache_limit", ox.f8004i);
            this.f3343i = b(jSONObject, "socket_receive_buffer_size", ox.f8020k);
            this.f3344j = a(jSONObject, "use_cache_data_source", ox.H2);
            this.f3345k = b(jSONObject, "min_retry_count", ox.f8028l);
            this.f3346l = a(jSONObject, "treat_load_exception_as_non_fatal", ox.f8052o);
            this.f3347m = a(jSONObject, "using_official_simple_exo_player", ox.f8038m1);
            this.f3348n = a(jSONObject, "enable_multiple_video_playback", ox.f8046n1);
        }
        string = (String) ft.c().c(gxVar);
        this.f3339e = string;
        this.f3340f = b(jSONObject, "exo_read_timeout_millis", ox.f7988g);
        this.f3341g = b(jSONObject, "load_check_interval_bytes", ox.f7996h);
        this.f3342h = b(jSONObject, "player_precache_limit", ox.f8004i);
        this.f3343i = b(jSONObject, "socket_receive_buffer_size", ox.f8020k);
        this.f3344j = a(jSONObject, "use_cache_data_source", ox.H2);
        this.f3345k = b(jSONObject, "min_retry_count", ox.f8028l);
        this.f3346l = a(jSONObject, "treat_load_exception_as_non_fatal", ox.f8052o);
        this.f3347m = a(jSONObject, "using_official_simple_exo_player", ox.f8038m1);
        this.f3348n = a(jSONObject, "enable_multiple_video_playback", ox.f8046n1);
    }

    public static final boolean a(JSONObject jSONObject, String str, gx<Boolean> gxVar) {
        boolean booleanValue = ((Boolean) ft.c().c(gxVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
                return booleanValue;
            }
        }
        return booleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, gx<Integer> gxVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) ft.c().c(gxVar)).intValue();
    }
}
