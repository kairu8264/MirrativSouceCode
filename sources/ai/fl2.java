package ai;

import android.util.JsonReader;
import com.dena.mirrorman.clientlog.logs.AdLogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fl2 {
    public final tg0 A;
    public final String B;
    public final JSONObject C;
    public final JSONObject D;
    public final String E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final int M;
    public final int N;
    public final boolean O;
    public final boolean P;
    public final String Q;
    public final bm2 R;
    public final boolean S;
    public final boolean T;
    public final int U;
    public final String V;
    public final int W;
    public final String X;
    public final boolean Y;
    public final wc0 Z;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f4080a;

    /* renamed from: a0  reason: collision with root package name */
    public final boolean f4081a0;

    /* renamed from: b  reason: collision with root package name */
    public final int f4082b;

    /* renamed from: b0  reason: collision with root package name */
    public final hs f4083b0;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f4084c;

    /* renamed from: c0  reason: collision with root package name */
    public final String f4085c0;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f4086d;

    /* renamed from: d0  reason: collision with root package name */
    public final boolean f4087d0;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f4088e;

    /* renamed from: e0  reason: collision with root package name */
    public final JSONObject f4089e0;

    /* renamed from: f  reason: collision with root package name */
    public final int f4090f;

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f4091f0;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f4092g;

    /* renamed from: g0  reason: collision with root package name */
    public final JSONObject f4093g0;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f4094h;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f4095h0;

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f4096i;

    /* renamed from: i0  reason: collision with root package name */
    public final String f4097i0;

    /* renamed from: j  reason: collision with root package name */
    public final List<String> f4098j;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f4099j0;

    /* renamed from: k  reason: collision with root package name */
    public final String f4100k;

    /* renamed from: l  reason: collision with root package name */
    public final String f4101l;

    /* renamed from: m  reason: collision with root package name */
    public final lf0 f4102m;

    /* renamed from: n  reason: collision with root package name */
    public final List<String> f4103n;

    /* renamed from: o  reason: collision with root package name */
    public final List<String> f4104o;

    /* renamed from: p  reason: collision with root package name */
    public final List<String> f4105p;

    /* renamed from: q  reason: collision with root package name */
    public final int f4106q;

    /* renamed from: r  reason: collision with root package name */
    public final List<il2> f4107r;

    /* renamed from: s  reason: collision with root package name */
    public final ll2 f4108s;

    /* renamed from: t  reason: collision with root package name */
    public final List<String> f4109t;

    /* renamed from: u  reason: collision with root package name */
    public final List<il2> f4110u;

    /* renamed from: v  reason: collision with root package name */
    public final JSONObject f4111v;

    /* renamed from: w  reason: collision with root package name */
    public final String f4112w;

    /* renamed from: x  reason: collision with root package name */
    public final String f4113x;

    /* renamed from: y  reason: collision with root package name */
    public final String f4114y;

    /* renamed from: z  reason: collision with root package name */
    public final String f4115z;

    /* JADX WARN: Multi-variable type inference failed */
    public fl2(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> list;
        List<String> list2;
        char c10;
        List<String> emptyList = Collections.emptyList();
        List<String> emptyList2 = Collections.emptyList();
        List<String> emptyList3 = Collections.emptyList();
        List<String> emptyList4 = Collections.emptyList();
        List<String> emptyList5 = Collections.emptyList();
        Collections.emptyList();
        List<String> emptyList6 = Collections.emptyList();
        List<String> emptyList7 = Collections.emptyList();
        List<String> emptyList8 = Collections.emptyList();
        List<String> emptyList9 = Collections.emptyList();
        List<String> emptyList10 = Collections.emptyList();
        List<il2> emptyList11 = Collections.emptyList();
        List<String> emptyList12 = Collections.emptyList();
        List<il2> emptyList13 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        List r10 = zz2.r();
        jsonReader.beginObject();
        JSONObject jSONObject7 = jSONObject3;
        JSONObject jSONObject8 = jSONObject4;
        JSONObject jSONObject9 = jSONObject5;
        JSONObject jSONObject10 = jSONObject6;
        List list3 = r10;
        boolean z10 = true;
        int i10 = -1;
        int i11 = -1;
        ll2 ll2Var = null;
        tg0 tg0Var = null;
        wc0 wc0Var = null;
        hs hsVar = null;
        String str = null;
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        int i12 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int i13 = 0;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        int i14 = 0;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        boolean z25 = false;
        boolean z26 = false;
        List<String> list4 = emptyList12;
        List<il2> list5 = emptyList13;
        JSONObject jSONObject11 = jSONObject;
        JSONObject jSONObject12 = jSONObject2;
        lf0 lf0Var = null;
        String str12 = str11;
        int i15 = 0;
        int i16 = 0;
        List<il2> list6 = emptyList11;
        String str13 = str12;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str14 = nextName == null ? "" : nextName;
            switch (str14.hashCode()) {
                case -1980587809:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("debug_signals")) {
                        c10 = 28;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1965512151:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("omid_settings")) {
                        c10 = ')';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1812055556:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("play_prewarm_options")) {
                        c10 = '1';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1662989631:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_interscroller")) {
                        c10 = '5';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1620470467:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("backend_query_id")) {
                        c10 = '/';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1440104884:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_custom_close_blocked")) {
                        c10 = '#';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1439500848:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("orientation")) {
                        c10 = '%';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1428969291:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("enable_omid")) {
                        c10 = '\'';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1406227629:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("buffer_click_url_as_ready_to_ping")) {
                        c10 = '>';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1403779768:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("showable_impression_type")) {
                        c10 = ',';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1375413093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_cover")) {
                        c10 = '6';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1360811658:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_sizes")) {
                        c10 = 19;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1306015996:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("adapters")) {
                        c10 = 20;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1303332046:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("test_mode_enabled")) {
                        c10 = '\"';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1289032093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("extras")) {
                        c10 = 29;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1240082064:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_event_value")) {
                        c10 = '3';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1234181075:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allow_pub_rendered_attribution")) {
                        c10 = 30;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1168140544:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("presentation_error_urls")) {
                        c10 = 14;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1152230954:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_type")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1146534047:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_scroll_aware")) {
                        c10 = '+';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1115838944:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("fill_urls")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1081936678:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allocation_id")) {
                        c10 = 21;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1078050970:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("video_complete_urls")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1051269058:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("active_view")) {
                        c10 = 25;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -982608540:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("valid_from_timestamp")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -776859333:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("click_urls")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -544216775:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("safe_browsing")) {
                        c10 = 26;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -437057161:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("imp_urls")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -404433734:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("rtb_native_required_assets")) {
                        c10 = '9';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -404326515:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("render_timeout_ms")) {
                        c10 = '&';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -397704715:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_close_time_ms")) {
                        c10 = '-';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -388807511:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("content_url")) {
                        c10 = ';';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -369773488:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_close_button_enabled")) {
                        c10 = '2';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -213449460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("force_disable_hardware_acceleration")) {
                        c10 = '<';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -213424028:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("watermark")) {
                        c10 = '.';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -180214626:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("native_required_asset_viewability")) {
                        c10 = ':';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -154616268:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_offline_ad")) {
                        c10 = '8';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -29338502:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allow_custom_click_gesture")) {
                        c10 = ' ';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3107:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals(AdLogBase.AD)) {
                        c10 = 18;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3355:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals(TtmlNode.ATTR_ID)) {
                        c10 = 23;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3076010:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("data")) {
                        c10 = 22;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 63195984:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("render_test_label")) {
                        c10 = '!';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 107433883:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("qdata")) {
                        c10 = 24;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 230323073:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_load_urls")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 418392395:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_closable_area_disabled")) {
                        c10 = '$';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 549176928:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("presentation_error_timeout_ms")) {
                        c10 = 16;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 597473788:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("debug_dialog_string")) {
                        c10 = 27;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 673261304:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("reward_granted_urls")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 754887508:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("container_sizes")) {
                        c10 = 17;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 791122864:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("impression_type")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1010584092:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("transaction_id")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1100650276:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("rewards")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1186014765:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("cache_hit_urls")) {
                        c10 = '=';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1321720943:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allow_pub_owned_ad_view")) {
                        c10 = 31;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1637553475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("bid_response")) {
                        c10 = '(';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1638957285:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("video_start_urls")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1686319423:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_network_class_name")) {
                        c10 = '7';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1688341040:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("video_reward_urls")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1799285870:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("use_third_party_container_height")) {
                        c10 = '0';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1839650832:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("renderers")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1875425491:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_analytics_logging_enabled")) {
                        c10 = '*';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2068142375:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("rule_line_external_id")) {
                        c10 = '4';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2072888499:
                    list2 = emptyList10;
                    list = emptyList9;
                    if (str14.equals("manual_tracking_urls")) {
                        c10 = 15;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    list = emptyList9;
                    list2 = emptyList10;
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    emptyList = yg.y0.b(jsonReader);
                    break;
                case 1:
                    i16 = b(jsonReader.nextString());
                    break;
                case 2:
                    emptyList2 = yg.y0.b(jsonReader);
                    break;
                case 3:
                    emptyList3 = yg.y0.b(jsonReader);
                    break;
                case 4:
                    emptyList4 = yg.y0.b(jsonReader);
                    break;
                case 5:
                    i15 = c(jsonReader.nextInt());
                    break;
                case 6:
                    emptyList5 = yg.y0.b(jsonReader);
                    break;
                case 7:
                    yg.y0.b(jsonReader);
                    break;
                case '\b':
                    emptyList6 = yg.y0.b(jsonReader);
                    break;
                case '\t':
                    emptyList7 = yg.y0.b(jsonReader);
                    break;
                case '\n':
                    str12 = jsonReader.nextString();
                    break;
                case 11:
                    str13 = jsonReader.nextString();
                    break;
                case '\f':
                    lf0Var = lf0.p(yg.y0.d(jsonReader));
                    break;
                case '\r':
                    emptyList8 = yg.y0.b(jsonReader);
                    break;
                case 14:
                    emptyList9 = yg.y0.b(jsonReader);
                    continue;
                    emptyList10 = list2;
                case 15:
                    list2 = yg.y0.b(jsonReader);
                    break;
                case 16:
                    i12 = jsonReader.nextInt();
                    break;
                case 17:
                    list6 = il2.a(jsonReader);
                    break;
                case 18:
                    ll2Var = new ll2(jsonReader);
                    break;
                case 19:
                    list5 = il2.a(jsonReader);
                    break;
                case 20:
                    list4 = yg.y0.b(jsonReader);
                    break;
                case 21:
                    str2 = jsonReader.nextString();
                    break;
                case 22:
                    jSONObject11 = yg.y0.c(jsonReader);
                    break;
                case 23:
                    str3 = jsonReader.nextString();
                    break;
                case 24:
                    str4 = jsonReader.nextString();
                    break;
                case 25:
                    str5 = yg.y0.c(jsonReader).toString();
                    break;
                case 26:
                    tg0Var = tg0.p(yg.y0.c(jsonReader));
                    break;
                case 27:
                    str6 = jsonReader.nextString();
                    break;
                case 28:
                    jSONObject12 = yg.y0.c(jsonReader);
                    break;
                case 29:
                    jSONObject7 = yg.y0.c(jsonReader);
                    break;
                case 30:
                    z11 = jsonReader.nextBoolean();
                    break;
                case 31:
                    z12 = jsonReader.nextBoolean();
                    break;
                case ' ':
                    z13 = jsonReader.nextBoolean();
                    break;
                case '!':
                    z14 = jsonReader.nextBoolean();
                    break;
                case '\"':
                    z15 = jsonReader.nextBoolean();
                    break;
                case '#':
                    z16 = jsonReader.nextBoolean();
                    break;
                case '$':
                    z17 = jsonReader.nextBoolean();
                    break;
                case '%':
                    i10 = d(jsonReader.nextString());
                    break;
                case '&':
                    i13 = jsonReader.nextInt();
                    break;
                case '\'':
                    z18 = jsonReader.nextBoolean();
                    break;
                case '(':
                    str7 = jsonReader.nextString();
                    break;
                case ')':
                    jSONObject8 = yg.y0.c(jsonReader);
                    break;
                case '*':
                    z19 = jsonReader.nextBoolean();
                    break;
                case '+':
                    z20 = jsonReader.nextBoolean();
                    break;
                case ',':
                    i14 = jsonReader.nextInt();
                    break;
                case '-':
                    i11 = jsonReader.nextInt();
                    break;
                case '.':
                    str8 = jsonReader.nextString();
                    break;
                case '/':
                    str9 = jsonReader.nextString();
                    break;
                case '0':
                    z21 = jsonReader.nextBoolean();
                    break;
                case '1':
                    wc0Var = wc0.a(yg.y0.c(jsonReader));
                    break;
                case '2':
                    z10 = jsonReader.nextBoolean();
                    break;
                case '3':
                    hsVar = hs.p(yg.y0.c(jsonReader));
                    break;
                case '4':
                    str10 = jsonReader.nextString();
                    break;
                case '5':
                    z22 = jsonReader.nextBoolean();
                    break;
                case '6':
                    jSONObject9 = yg.y0.c(jsonReader);
                    break;
                case '7':
                    str11 = jsonReader.nextString();
                    break;
                case '8':
                    z23 = jsonReader.nextBoolean();
                    break;
                case '9':
                    jSONObject10 = yg.y0.c(jsonReader);
                    break;
                case ':':
                    z24 = jsonReader.nextBoolean();
                    break;
                case ';':
                    str = jsonReader.nextString();
                    break;
                case '<':
                    z25 = jsonReader.nextBoolean();
                    break;
                case '=':
                    list3 = yg.y0.b(jsonReader);
                    break;
                case '>':
                    z26 = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            emptyList9 = list;
            emptyList10 = list2;
        }
        jsonReader.endObject();
        this.f4080a = emptyList;
        this.f4082b = i16;
        this.f4084c = emptyList2;
        this.f4086d = emptyList3;
        this.f4092g = emptyList4;
        this.f4090f = i15;
        this.f4094h = emptyList5;
        this.f4096i = emptyList6;
        this.f4098j = emptyList7;
        this.f4100k = str12;
        this.f4101l = str13;
        this.f4102m = lf0Var;
        this.f4103n = emptyList8;
        this.f4104o = emptyList9;
        this.f4105p = emptyList10;
        this.f4106q = i12;
        this.f4107r = list6;
        this.f4108s = ll2Var;
        this.f4109t = list4;
        this.f4110u = list5;
        this.f4112w = str2;
        this.f4111v = jSONObject11;
        this.f4113x = str3;
        this.f4114y = str4;
        this.f4115z = str5;
        this.A = tg0Var;
        this.B = str6;
        this.C = jSONObject12;
        this.D = jSONObject7;
        this.F = z11;
        this.G = z12;
        this.H = z13;
        this.I = z14;
        this.J = z15;
        this.K = z16;
        this.L = z17;
        this.M = i10;
        this.N = i13;
        this.P = z18;
        this.Q = str7;
        this.R = new bm2(jSONObject8);
        this.S = z19;
        this.T = z20;
        this.U = i14;
        this.V = str8;
        this.W = i11;
        this.X = str9;
        this.Y = z21;
        this.Z = wc0Var;
        this.f4081a0 = z10;
        this.f4083b0 = hsVar;
        this.f4085c0 = str10;
        this.f4087d0 = z22;
        this.f4089e0 = jSONObject9;
        this.E = str11;
        this.f4091f0 = z23;
        this.f4093g0 = jSONObject10;
        this.f4095h0 = z24;
        this.f4097i0 = str;
        this.f4099j0 = z25;
        this.f4088e = list3;
        this.O = z26;
    }

    public static String a(int i10) {
        switch (i10) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    public static int b(String str) {
        if (MRLog.TARGET_TYPE_BANNER.equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str) || "app_open_ad_v2".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    public static int c(int i10) {
        if (i10 == 0 || i10 == 1) {
            return i10;
        }
        return 0;
    }

    public static final int d(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}
