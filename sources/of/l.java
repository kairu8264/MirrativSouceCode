package of;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.text.TextUtils;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.Referer;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import jf.b0;
import xn.a0;

/* loaded from: classes3.dex */
public final class l implements k {

    /* renamed from: c  reason: collision with root package name */
    public static final a f45406c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f45407d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ServerConfig f45408a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f45409b;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public l(ServerConfig serverConfig, Context context) {
        jo.p.h(serverConfig, "serverConfig");
        jo.p.h(context, "context");
        this.f45408a = serverConfig;
        this.f45409b = context;
    }

    @Override // of.k
    public b0 a(String str) {
        jo.p.h(str, "url");
        Uri parse = Uri.parse(new so.e("^https://[a-z0-9.]*mirrativ.com/").c(str, "https://mirrativ.com/"));
        UriMatcher uriMatcher = new UriMatcher(-1);
        for (String str2 : xn.s.m("mirrativ.com", "")) {
            uriMatcher.addURI(str2, "live/*", 1);
            uriMatcher.addURI(str2, "user/*", 3);
            uriMatcher.addURI(str2, "app/*", 4);
            uriMatcher.addURI(str2, "notice/*", 5);
            uriMatcher.addURI(str2, "new_followers/*", 9);
            uriMatcher.addURI(str2, "kicked_users/*", 10);
            uriMatcher.addURI(str2, "chat_message/*", 11);
            uriMatcher.addURI(str2, "download_archive/*", 12);
            uriMatcher.addURI(str2, "broadcast/live", 6);
            uriMatcher.addURI(str2, "search/live", 14);
            uriMatcher.addURI(str2, "faq_ja", 15);
            uriMatcher.addURI(str2, "gift_ranking/*", 18);
            uriMatcher.addURI(str2, "campaign_detail/*", 31);
            uriMatcher.addURI(str2, "emomo_run/*", 19);
            uriMatcher.addURI(str2, "shooter/*", 34);
            uriMatcher.addURI(str2, "photo_campaign/*", 39);
            uriMatcher.addURI(str2, "emomo_quest_ranking/*", 42);
        }
        uriMatcher.addURI("", "share/invite_campaign", 17);
        uriMatcher.addURI(Referer.WEBVIEW, "window/close", 7);
        uriMatcher.addURI(Referer.WEBVIEW, "window/open", 8);
        Integer num = null;
        uriMatcher.addURI("connect_confirm", null, 16);
        uriMatcher.addURI("", "notice_present_box", 21);
        uriMatcher.addURI("", "coin_passbook", 24);
        uriMatcher.addURI("", "emomo_view/mypage", 27);
        uriMatcher.addURI("", "giftbox_gacha", 28);
        uriMatcher.addURI("", "gift_code", 29);
        uriMatcher.addURI("", "live_request/*", 30);
        uriMatcher.addURI("", Referer.COIN_CHALLENGE, 32);
        uriMatcher.addURI("", "contract", 35);
        uriMatcher.addURI("", "contract/coin", 36);
        uriMatcher.addURI("", "upload_image", 38);
        uriMatcher.addURI("", "contract/cash", 40);
        uriMatcher.addURI("", "live_game_listing", 41);
        uriMatcher.addURI("", "emomo_quest", 43);
        uriMatcher.addURI("", "emomo_quest/*", 43);
        uriMatcher.addURI("", "live_game_detail", 45);
        uriMatcher.addURI("", "live_game_daily_ranking", 46);
        uriMatcher.addURI("", "live_game_app_ranking", 47);
        switch (uriMatcher.match(parse)) {
            case 1:
                List<String> pathSegments = parse.getPathSegments();
                jo.p.g(pathSegments, "uri.pathSegments");
                Object i02 = a0.i0(pathSegments);
                jo.p.g(i02, "uri.pathSegments.last()");
                return new b0.v(str, (String) i02);
            case 2:
            case 13:
            case 20:
            case 22:
            case 23:
            case 25:
            case 26:
            case 33:
            case 37:
            case 44:
            default:
                return new b0.l0(str);
            case 3:
                List<String> pathSegments2 = parse.getPathSegments();
                jo.p.g(pathSegments2, "uri.pathSegments");
                Object i03 = a0.i0(pathSegments2);
                jo.p.g(i03, "uri.pathSegments.last()");
                return new b0.i0(str, (String) i03, jo.p.c(parse.getQueryParameter("popup"), "true"));
            case 4:
                List<String> pathSegments3 = parse.getPathSegments();
                jo.p.g(pathSegments3, "uri.pathSegments");
                Object i04 = a0.i0(pathSegments3);
                jo.p.g(i04, "uri.pathSegments.last()");
                return new b0.a(str, (String) i04);
            case 5:
                return new b0.c0(str, this.f45408a.getServerURLwithBasicAuth() + "/notice/" + parse.getLastPathSegment() + '?' + parse.getQuery());
            case 6:
                return new b0.b(str, parse.getQueryParameter("title"), parse.getQueryParameter(MRLog.PAYLOAD_KEY_APP_ID));
            case 7:
                return new b0.j0(str);
            case 8:
                String queryParameter = parse.getQueryParameter("url");
                if (queryParameter == null) {
                    return new b0.l0(str);
                }
                return new b0.k0(str, queryParameter, jo.p.c(parse.getQueryParameter("external"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
            case 9:
                List<String> pathSegments4 = parse.getPathSegments();
                jo.p.g(pathSegments4, "uri.pathSegments");
                Object i05 = a0.i0(pathSegments4);
                jo.p.g(i05, "uri.pathSegments.last()");
                return new b0.C0526b0(str, (String) i05);
            case 10:
                List<String> pathSegments5 = parse.getPathSegments();
                jo.p.g(pathSegments5, "uri.pathSegments");
                Object i06 = a0.i0(pathSegments5);
                jo.p.g(i06, "uri.pathSegments.last()");
                return new b0.u(str, (String) i06);
            case 11:
                StringBuilder sb2 = new StringBuilder();
                List<String> pathSegments6 = parse.getPathSegments();
                jo.p.g(pathSegments6, "uri.pathSegments");
                sb2.append((String) a0.i0(pathSegments6));
                sb2.append('?');
                sb2.append(parse.getQuery());
                return new b0.d(str, sb2.toString());
            case 12:
                List<String> pathSegments7 = parse.getPathSegments();
                jo.p.g(pathSegments7, "uri.pathSegments");
                Object i07 = a0.i0(pathSegments7);
                jo.p.g(i07, "uri.pathSegments.last()");
                return new b0.k(str, (String) i07);
            case 14:
                String queryParameter2 = parse.getQueryParameter("q");
                if (queryParameter2 == null) {
                    return new b0.l0(str);
                }
                return new b0.f0(str, queryParameter2, parse.getQueryParameter(MRLog.PAYLOAD_KEY_APP_ID));
            case 15:
                return new b0.p(str);
            case 16:
                String queryParameter3 = parse.getQueryParameter("client_id");
                String queryParameter4 = parse.getQueryParameter("redirect_uri");
                String queryParameter5 = parse.getQueryParameter("response_type");
                String queryParameter6 = parse.getQueryParameter("scope");
                String queryParameter7 = parse.getQueryParameter("nonce");
                String queryParameter8 = parse.getQueryParameter("state");
                String queryParameter9 = parse.getQueryParameter("callback");
                if (queryParameter3 != null && queryParameter4 != null) {
                    return new b0.g(str, queryParameter3, queryParameter4, queryParameter5, queryParameter6, queryParameter7, queryParameter8, queryParameter9);
                }
                return new b0.l0(str);
            case 17:
                String queryParameter10 = parse.getQueryParameter(TtmlNode.ATTR_ID);
                if (queryParameter10 == null) {
                    return new b0.l0(str);
                }
                return new b0.g0(str, queryParameter10);
            case 18:
                String queryParameter11 = parse.getQueryParameter("broadcaster_id");
                String str3 = queryParameter11 != null ? queryParameter11 : "";
                List<String> pathSegments8 = parse.getPathSegments();
                jo.p.g(pathSegments8, "uri.pathSegments");
                Object i08 = a0.i0(pathSegments8);
                jo.p.g(i08, "uri.pathSegments.last()");
                return new b0.r(str, (String) i08, str3);
            case 19:
                List<String> pathSegments9 = parse.getPathSegments();
                jo.p.g(pathSegments9, "uri.pathSegments");
                Object i09 = a0.i0(pathSegments9);
                jo.p.g(i09, "uri.pathSegments.last()");
                return new b0.n(str, (String) i09);
            case 21:
                return new b0.d0(str);
            case 24:
                return new b0.f(str);
            case 27:
                return new b0.o(str, jo.p.c(parse.getQueryParameter("open_closet"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), parse.getQueryParameter("part_type"));
            case 28:
                String queryParameter12 = parse.getQueryParameter("user_giftbox_gacha_id");
                if (queryParameter12 == null) {
                    return new b0.l0(str);
                }
                return new b0.s(str, queryParameter12);
            case 29:
                String queryParameter13 = parse.getQueryParameter(TtmlNode.ATTR_ID);
                if (queryParameter13 == null) {
                    return new b0.l0(str);
                }
                return new b0.q(str, Integer.parseInt(queryParameter13));
            case 30:
                List<String> pathSegments10 = parse.getPathSegments();
                jo.p.g(pathSegments10, "uri.pathSegments");
                Object i010 = a0.i0(pathSegments10);
                jo.p.g(i010, "uri.pathSegments.last()");
                return new b0.a0(str, (String) i010);
            case 31:
                List<String> pathSegments11 = parse.getPathSegments();
                jo.p.g(pathSegments11, "uri.pathSegments");
                Object i011 = a0.i0(pathSegments11);
                jo.p.g(i011, "uri.pathSegments.last()");
                return new b0.c(str, (String) i011);
            case 32:
                return new b0.e(str);
            case 34:
                List<String> pathSegments12 = parse.getPathSegments();
                jo.p.g(pathSegments12, "uri.pathSegments");
                String str4 = (String) a0.i0(pathSegments12);
                if (!TextUtils.isDigitsOnly(str4)) {
                    return new b0.l0(str);
                }
                String queryParameter14 = parse.getQueryParameter("broadcaster_id");
                if (queryParameter14 != null && !TextUtils.isEmpty(queryParameter14) && TextUtils.isDigitsOnly(queryParameter14)) {
                    num = Integer.valueOf(Integer.parseInt(queryParameter14));
                }
                return new b0.h0(str, Integer.parseInt(str4), num);
            case 35:
                return new b0.h(str);
            case 36:
                return new b0.j(str);
            case 38:
                return new b0.e0(str);
            case 39:
                List<String> pathSegments13 = parse.getPathSegments();
                jo.p.g(pathSegments13, "uri.pathSegments");
                return new b0.t(str, (String) a0.i0(pathSegments13), parse.getQueryParameter(LogBase.USER_ID));
            case 40:
                return new b0.i(str);
            case 41:
                return new b0.z(str);
            case 42:
                List<String> pathSegments14 = parse.getPathSegments();
                jo.p.g(pathSegments14, "uri.pathSegments");
                String str5 = (String) a0.i0(pathSegments14);
                if (!TextUtils.isDigitsOnly(str5)) {
                    return new b0.l0(str);
                }
                return new b0.m(str, Integer.parseInt(str5), Boolean.parseBoolean(parse.getQueryParameter("hide_listing")));
            case 43:
                return new b0.l(str);
            case 45:
                String queryParameter15 = parse.getQueryParameter("live_game_id");
                if (queryParameter15 == null) {
                    return new b0.l0(str);
                }
                return new b0.y(str, queryParameter15);
            case 46:
                return new b0.x(str);
            case 47:
                String queryParameter16 = parse.getQueryParameter("live_game_id");
                if (queryParameter16 == null) {
                    return new b0.l0(str);
                }
                return new b0.w(str, queryParameter16);
        }
    }
}
