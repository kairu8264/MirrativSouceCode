package ud;

import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import ud.d4;

/* loaded from: classes2.dex */
public final class o4 implements d4 {

    /* renamed from: o  reason: collision with root package name */
    public static final a f55293o = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public static final int f55294p = 8;

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f55295a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55296b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55297c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55298d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55299e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55300f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55301g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55302h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55303i;

    /* renamed from: j  reason: collision with root package name */
    public final String f55304j;

    /* renamed from: k  reason: collision with root package name */
    public final String f55305k;

    /* renamed from: l  reason: collision with root package name */
    public final String f55306l;

    /* renamed from: m  reason: collision with root package name */
    public final String f55307m;

    /* renamed from: n  reason: collision with root package name */
    public final EventBannerResponse f55308n;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final o4 a(String str, EventBannerResponse eventBannerResponse) {
            jo.p.h(str, "liveId");
            jo.p.h(eventBannerResponse, "eventBanner");
            return new o4(null, str, 0, null, null, null, null, null, null, eventBannerResponse.getIconUrl(), eventBannerResponse.getTitle(), eventBannerResponse.getDescription(), eventBannerResponse.getButtonText(), eventBannerResponse, 509, null);
        }
    }

    public o4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, EventBannerResponse eventBannerResponse) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        jo.p.h(str8, "iconUrl");
        jo.p.h(str9, "titleText");
        jo.p.h(str10, "descriptionText");
        jo.p.h(str11, "buttonText");
        jo.p.h(eventBannerResponse, "eventBannerResponse");
        this.f55295a = aVar;
        this.f55296b = str;
        this.f55297c = i10;
        this.f55298d = str2;
        this.f55299e = str3;
        this.f55300f = str4;
        this.f55301g = str5;
        this.f55302h = str6;
        this.f55303i = str7;
        this.f55304j = str8;
        this.f55305k = str9;
        this.f55306l = str10;
        this.f55307m = str11;
        this.f55308n = eventBannerResponse;
    }

    @Override // ud.d4
    public String a() {
        return this.f55300f;
    }

    @Override // ud.d4
    public String b() {
        return this.f55296b;
    }

    @Override // ud.d4
    public String c() {
        return this.f55299e;
    }

    @Override // ud.d4
    public int d() {
        return this.f55297c;
    }

    @Override // ud.d4
    public String e() {
        return this.f55298d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o4) {
            o4 o4Var = (o4) obj;
            return getType() == o4Var.getType() && jo.p.c(b(), o4Var.b()) && d() == o4Var.d() && jo.p.c(e(), o4Var.e()) && jo.p.c(c(), o4Var.c()) && jo.p.c(a(), o4Var.a()) && jo.p.c(h(), o4Var.h()) && jo.p.c(f(), o4Var.f()) && jo.p.c(g(), o4Var.g()) && jo.p.c(this.f55304j, o4Var.f55304j) && jo.p.c(this.f55305k, o4Var.f55305k) && jo.p.c(this.f55306l, o4Var.f55306l) && jo.p.c(this.f55307m, o4Var.f55307m) && jo.p.c(this.f55308n, o4Var.f55308n);
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f55302h;
    }

    @Override // ud.d4
    public String g() {
        return this.f55303i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f55295a;
    }

    @Override // ud.d4
    public String h() {
        return this.f55301g;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode()) * 31) + this.f55304j.hashCode()) * 31) + this.f55305k.hashCode()) * 31) + this.f55306l.hashCode()) * 31) + this.f55307m.hashCode()) * 31) + this.f55308n.hashCode();
    }

    public final String i() {
        return this.f55307m;
    }

    public final String j() {
        return this.f55306l;
    }

    public final EventBannerResponse k() {
        return this.f55308n;
    }

    public final String l() {
        return this.f55304j;
    }

    public final String m() {
        return this.f55305k;
    }

    public String toString() {
        return "StreamingLiveCommentEventNoticeBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ", iconUrl=" + this.f55304j + ", titleText=" + this.f55305k + ", descriptionText=" + this.f55306l + ", buttonText=" + this.f55307m + ", eventBannerResponse=" + this.f55308n + ')';
    }

    public /* synthetic */ o4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, EventBannerResponse eventBannerResponse, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? d4.a.VIEW_TYPE_EVENT_NOTICE : aVar, str, (i11 & 4) != 0 ? -103 : i10, (i11 & 8) != 0 ? "" : str2, (i11 & 16) != 0 ? "" : str3, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? "" : str6, (i11 & 256) != 0 ? "" : str7, str8, str9, str10, str11, eventBannerResponse);
    }
}
