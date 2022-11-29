package s8;

import android.content.Context;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.live.LiveCatalogAnnouncement;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.text.SimpleDateFormat;
import java.util.Locale;
import jo.p;
import r8.h1;
import s8.a;
import ud.u1;

/* loaded from: classes.dex */
public final class f implements s8.a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f52326h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f52327i = u1.f55560f | UserBasicParams.$stable;

    /* renamed from: j  reason: collision with root package name */
    public static final SimpleDateFormat f52328j = new SimpleDateFormat("：M月d日 HH:mm〜", Locale.JAPANESE);

    /* renamed from: b  reason: collision with root package name */
    public final UserBasicParams f52329b;

    /* renamed from: c  reason: collision with root package name */
    public final String f52330c;

    /* renamed from: d  reason: collision with root package name */
    public final String f52331d;

    /* renamed from: e  reason: collision with root package name */
    public final String f52332e;

    /* renamed from: f  reason: collision with root package name */
    public final u1 f52333f;

    /* renamed from: g  reason: collision with root package name */
    public final a.b f52334g;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f a(Context context, LiveCatalogAnnouncement liveCatalogAnnouncement) {
            String str;
            p.h(context, "context");
            p.h(liveCatalogAnnouncement, "liveAnnouncement");
            UserBasicParams broadcaster = liveCatalogAnnouncement.getBroadcaster();
            String url = liveCatalogAnnouncement.getUrl();
            String body = liveCatalogAnnouncement.getBody();
            if (liveCatalogAnnouncement.getStartAt() == 0) {
                str = context.getResources().getString(h1.f49923r);
            } else {
                str = context.getResources().getString(h1.f49923r) + f.f52328j.format(Long.valueOf(liveCatalogAnnouncement.getStartAt() * 1000));
            }
            String str2 = str;
            p.g(str2, "if (liveAnnouncement.sta…At * 1000L)\n            }");
            App.AppParams app = liveCatalogAnnouncement.getApp();
            return new f(broadcaster, url, body, str2, app != null ? u1.f55559e.a(app) : null, null, 32, null);
        }
    }

    public f(UserBasicParams userBasicParams, String str, String str2, String str3, u1 u1Var, a.b bVar) {
        p.h(userBasicParams, "broadcaster");
        p.h(str, "url");
        p.h(str2, TtmlNode.TAG_BODY);
        p.h(str3, "announcementTimeText");
        p.h(bVar, "type");
        this.f52329b = userBasicParams;
        this.f52330c = str;
        this.f52331d = str2;
        this.f52332e = str3;
        this.f52333f = u1Var;
        this.f52334g = bVar;
    }

    public final String b() {
        return this.f52332e;
    }

    public final String c() {
        return this.f52331d;
    }

    public final UserBasicParams d() {
        return this.f52329b;
    }

    public final u1 e() {
        return this.f52333f;
    }

    public final String f() {
        return this.f52330c;
    }

    @Override // s8.a
    public a.b getType() {
        return this.f52334g;
    }

    public /* synthetic */ f(UserBasicParams userBasicParams, String str, String str2, String str3, u1 u1Var, a.b bVar, int i10, jo.h hVar) {
        this(userBasicParams, str, str2, str3, u1Var, (i10 & 32) != 0 ? a.b.LIVE_ANNOUNCEMENT : bVar);
    }
}
