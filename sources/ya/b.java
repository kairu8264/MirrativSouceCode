package ya;

import android.content.res.Resources;
import com.dena.mirrorman.net.api.response.campaign.CampaignDetailResponse;
import nd.f1;
import ud.l;

/* loaded from: classes2.dex */
public final class b implements ud.l {

    /* renamed from: f  reason: collision with root package name */
    public static final a f61393f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f61394a;

    /* renamed from: b  reason: collision with root package name */
    public final String f61395b;

    /* renamed from: c  reason: collision with root package name */
    public final String f61396c;

    /* renamed from: d  reason: collision with root package name */
    public final int f61397d;

    /* renamed from: e  reason: collision with root package name */
    public final l.a f61398e;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b a(Resources resources, CampaignDetailResponse campaignDetailResponse, boolean z10) {
            String appUserId;
            jo.p.h(resources, "resources");
            jo.p.h(campaignDetailResponse, "campaignDetailResponse");
            String iconUrl = campaignDetailResponse.getApp().getIconUrl();
            String string = resources.getString(f1.text_broadcast_game_id_v2, campaignDetailResponse.getApp().getAppUserIdLabel());
            jo.p.g(string, "resources.getString(R.st…ponse.app.appUserIdLabel)");
            if (z10) {
                appUserId = resources.getString(f1.text_app_user_id_user_id_hidden);
            } else {
                appUserId = campaignDetailResponse.getApp().getAppUserId();
            }
            String str = appUserId;
            jo.p.g(str, "if (requireAppUserIdHidd…p.appUserId\n            }");
            return new b(iconUrl, string, str, 0, null, 24, null);
        }
    }

    public b(String str, String str2, String str3, int i10, l.a aVar) {
        jo.p.h(str, "appIconUrl");
        jo.p.h(str2, "appUserIdLabelText");
        jo.p.h(str3, "appUserId");
        jo.p.h(aVar, "type");
        this.f61394a = str;
        this.f61395b = str2;
        this.f61396c = str3;
        this.f61397d = i10;
        this.f61398e = aVar;
    }

    @Override // ud.l
    public int a() {
        return this.f61397d;
    }

    public final String b() {
        return this.f61394a;
    }

    public final String c() {
        return this.f61396c;
    }

    public final String d() {
        return this.f61395b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return jo.p.c(this.f61394a, bVar.f61394a) && jo.p.c(this.f61395b, bVar.f61395b) && jo.p.c(this.f61396c, bVar.f61396c) && a() == bVar.a() && getType() == bVar.getType();
        }
        return false;
    }

    @Override // ud.l
    public l.a getType() {
        return this.f61398e;
    }

    public int hashCode() {
        return (((((((this.f61394a.hashCode() * 31) + this.f61395b.hashCode()) * 31) + this.f61396c.hashCode()) * 31) + Integer.hashCode(a())) * 31) + getType().hashCode();
    }

    public String toString() {
        return "CampaignDetailAppUserIdEditBindModel(appIconUrl=" + this.f61394a + ", appUserIdLabelText=" + this.f61395b + ", appUserId=" + this.f61396c + ", itemMarginTop=" + a() + ", type=" + getType() + ')';
    }

    public /* synthetic */ b(String str, String str2, String str3, int i10, l.a aVar, int i11, jo.h hVar) {
        this(str, str2, str3, (i11 & 8) != 0 ? -24 : i10, (i11 & 16) != 0 ? l.a.CAMPAIGN_DETAIL_APP_USER_ID_EDIT : aVar);
    }
}
