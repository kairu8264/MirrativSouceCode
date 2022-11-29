package ud;

import android.content.Context;
import com.dena.mirrorman.net.bcsvr.response.LiveGameConnectBcsvrResponse;
import ud.r2;

/* loaded from: classes2.dex */
public final class a3 implements r2 {

    /* renamed from: k  reason: collision with root package name */
    public static final a f54739k = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final r2.a f54740a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54741b;

    /* renamed from: c  reason: collision with root package name */
    public final int f54742c;

    /* renamed from: d  reason: collision with root package name */
    public final String f54743d;

    /* renamed from: e  reason: collision with root package name */
    public final String f54744e;

    /* renamed from: f  reason: collision with root package name */
    public final String f54745f;

    /* renamed from: g  reason: collision with root package name */
    public final String f54746g;

    /* renamed from: h  reason: collision with root package name */
    public final String f54747h;

    /* renamed from: i  reason: collision with root package name */
    public final String f54748i;

    /* renamed from: j  reason: collision with root package name */
    public final String f54749j;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final a3 a(Context context, String str, LiveGameConnectBcsvrResponse liveGameConnectBcsvrResponse) {
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            jo.p.h(liveGameConnectBcsvrResponse, "liveGameConnectBcsvrResponse");
            String requestUserName = liveGameConnectBcsvrResponse.getRequestUserName();
            String requestUserId = liveGameConnectBcsvrResponse.getRequestUserId();
            String string = context.getString(nd.f1.text_received_live_game_invitation, liveGameConnectBcsvrResponse.getTitle());
            String liveGameId = liveGameConnectBcsvrResponse.getLiveGameId();
            String playId = liveGameConnectBcsvrResponse.getPlayId();
            int type = liveGameConnectBcsvrResponse.getType();
            String requestUserImageUrl = liveGameConnectBcsvrResponse.getRequestUserImageUrl();
            String requestUserBadgeUrl = liveGameConnectBcsvrResponse.getRequestUserBadgeUrl();
            jo.p.g(string, "getString(R.string.text_…nnectBcsvrResponse.title)");
            return new a3(null, str, type, requestUserId, requestUserName, string, liveGameId, playId, requestUserImageUrl, requestUserBadgeUrl, 1, null);
        }
    }

    public a3(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "liveGameId");
        jo.p.h(str6, "playId");
        jo.p.h(str7, "profileImageUrl");
        this.f54740a = aVar;
        this.f54741b = str;
        this.f54742c = i10;
        this.f54743d = str2;
        this.f54744e = str3;
        this.f54745f = str4;
        this.f54746g = str5;
        this.f54747h = str6;
        this.f54748i = str7;
        this.f54749j = str8;
    }

    @Override // ud.r2
    public String a() {
        return this.f54745f;
    }

    public final String b() {
        return this.f54749j;
    }

    @Override // ud.r2
    public String c() {
        return this.f54744e;
    }

    @Override // ud.r2
    public int d() {
        return this.f54742c;
    }

    @Override // ud.r2
    public String e() {
        return this.f54743d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a3) {
            a3 a3Var = (a3) obj;
            return getType() == a3Var.getType() && jo.p.c(g(), a3Var.g()) && d() == a3Var.d() && jo.p.c(e(), a3Var.e()) && jo.p.c(c(), a3Var.c()) && jo.p.c(a(), a3Var.a()) && jo.p.c(this.f54746g, a3Var.f54746g) && jo.p.c(this.f54747h, a3Var.f54747h) && jo.p.c(this.f54748i, a3Var.f54748i) && jo.p.c(this.f54749j, a3Var.f54749j);
        }
        return false;
    }

    public final String f() {
        return this.f54746g;
    }

    public String g() {
        return this.f54741b;
    }

    @Override // ud.r2
    public r2.a getType() {
        return this.f54740a;
    }

    public final String h() {
        return this.f54747h;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((getType().hashCode() * 31) + g().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + this.f54746g.hashCode()) * 31) + this.f54747h.hashCode()) * 31) + this.f54748i.hashCode()) * 31;
        String str = this.f54749j;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String i() {
        return this.f54748i;
    }

    public String toString() {
        return "PlayerLiveCommentLiveGameInvitedBindModel(type=" + getType() + ", liveId=" + g() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", liveGameId=" + this.f54746g + ", playId=" + this.f54747h + ", profileImageUrl=" + this.f54748i + ", badgeImageUrl=" + this.f54749j + ')';
    }

    public /* synthetic */ a3(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? r2.a.VIEW_TYPE_LIVE_GAME_INVITED : aVar, str, i10, str2, str3, str4, str5, str6, str7, str8);
    }
}
