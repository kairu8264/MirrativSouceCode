package ud;

import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import ud.r2;

/* loaded from: classes2.dex */
public final class y2 implements r2 {

    /* renamed from: l  reason: collision with root package name */
    public static final a f55749l = new a(null);

    /* renamed from: m  reason: collision with root package name */
    public static final int f55750m = 8;

    /* renamed from: a  reason: collision with root package name */
    public final r2.a f55751a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55752b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55753c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55754d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55755e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55756f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55757g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55758h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55759i;

    /* renamed from: j  reason: collision with root package name */
    public final String f55760j;

    /* renamed from: k  reason: collision with root package name */
    public final EventBannerResponse f55761k;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y2 a(String str, EventBannerResponse eventBannerResponse) {
            jo.p.h(str, "liveId");
            jo.p.h(eventBannerResponse, "eventBanner");
            return new y2(null, str, 0, null, null, null, eventBannerResponse.getIconUrl(), eventBannerResponse.getTitle(), eventBannerResponse.getDescription(), eventBannerResponse.getButtonText(), eventBannerResponse, 61, null);
        }
    }

    public y2(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, EventBannerResponse eventBannerResponse) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "iconUrl");
        jo.p.h(str6, "titleText");
        jo.p.h(str7, "descriptionText");
        jo.p.h(str8, "buttonText");
        jo.p.h(eventBannerResponse, "eventBannerResponse");
        this.f55751a = aVar;
        this.f55752b = str;
        this.f55753c = i10;
        this.f55754d = str2;
        this.f55755e = str3;
        this.f55756f = str4;
        this.f55757g = str5;
        this.f55758h = str6;
        this.f55759i = str7;
        this.f55760j = str8;
        this.f55761k = eventBannerResponse;
    }

    @Override // ud.r2
    public String a() {
        return this.f55756f;
    }

    public final String b() {
        return this.f55760j;
    }

    @Override // ud.r2
    public String c() {
        return this.f55755e;
    }

    @Override // ud.r2
    public int d() {
        return this.f55753c;
    }

    @Override // ud.r2
    public String e() {
        return this.f55754d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y2) {
            y2 y2Var = (y2) obj;
            return getType() == y2Var.getType() && jo.p.c(i(), y2Var.i()) && d() == y2Var.d() && jo.p.c(e(), y2Var.e()) && jo.p.c(c(), y2Var.c()) && jo.p.c(a(), y2Var.a()) && jo.p.c(this.f55757g, y2Var.f55757g) && jo.p.c(this.f55758h, y2Var.f55758h) && jo.p.c(this.f55759i, y2Var.f55759i) && jo.p.c(this.f55760j, y2Var.f55760j) && jo.p.c(this.f55761k, y2Var.f55761k);
        }
        return false;
    }

    public final String f() {
        return this.f55759i;
    }

    public final EventBannerResponse g() {
        return this.f55761k;
    }

    @Override // ud.r2
    public r2.a getType() {
        return this.f55751a;
    }

    public final String h() {
        return this.f55757g;
    }

    public int hashCode() {
        return (((((((((((((((((((getType().hashCode() * 31) + i().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + this.f55757g.hashCode()) * 31) + this.f55758h.hashCode()) * 31) + this.f55759i.hashCode()) * 31) + this.f55760j.hashCode()) * 31) + this.f55761k.hashCode();
    }

    public String i() {
        return this.f55752b;
    }

    public final String j() {
        return this.f55758h;
    }

    public String toString() {
        return "PlayerLiveCommentEventNoticeBindModel(type=" + getType() + ", liveId=" + i() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", iconUrl=" + this.f55757g + ", titleText=" + this.f55758h + ", descriptionText=" + this.f55759i + ", buttonText=" + this.f55760j + ", eventBannerResponse=" + this.f55761k + ')';
    }

    public /* synthetic */ y2(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, EventBannerResponse eventBannerResponse, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? r2.a.VIEW_TYPE_EVENT_NOTICE : aVar, str, (i11 & 4) != 0 ? -103 : i10, (i11 & 8) != 0 ? "" : str2, (i11 & 16) != 0 ? "" : str3, (i11 & 32) != 0 ? "" : str4, str5, str6, str7, str8, eventBannerResponse);
    }
}
