package ya;

import android.content.res.Resources;
import com.dena.mirrorman.net.api.response.campaign.CampaignDetailResponse;
import nd.f1;
import ud.l;

/* loaded from: classes2.dex */
public final class d implements ud.l {

    /* renamed from: f  reason: collision with root package name */
    public static final a f61408f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f61409a;

    /* renamed from: b  reason: collision with root package name */
    public final String f61410b;

    /* renamed from: c  reason: collision with root package name */
    public final String f61411c;

    /* renamed from: d  reason: collision with root package name */
    public final int f61412d;

    /* renamed from: e  reason: collision with root package name */
    public final l.a f61413e;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d a(Resources resources, CampaignDetailResponse campaignDetailResponse) {
            jo.p.h(resources, "resources");
            jo.p.h(campaignDetailResponse, "campaignDetailResponse");
            String iconUrl = campaignDetailResponse.getApp().getIconUrl();
            String string = resources.getString(f1.S3, campaignDetailResponse.getApp().getAppUserIdLabel());
            jo.p.g(string, "resources.getString(R.st…ponse.app.appUserIdLabel)");
            return new d(iconUrl, string, campaignDetailResponse.getAppUserIdRegistrationNotes(), 0, null, 24, null);
        }
    }

    public d(String str, String str2, String str3, int i10, l.a aVar) {
        jo.p.h(str, "appIconUrl");
        jo.p.h(str2, "registerAppUserUdText");
        jo.p.h(str3, "appUserIdRegistrationNotesText");
        jo.p.h(aVar, "type");
        this.f61409a = str;
        this.f61410b = str2;
        this.f61411c = str3;
        this.f61412d = i10;
        this.f61413e = aVar;
    }

    @Override // ud.l
    public int a() {
        return this.f61412d;
    }

    public final String b() {
        return this.f61409a;
    }

    public final String c() {
        return this.f61411c;
    }

    public final String d() {
        return this.f61410b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return jo.p.c(this.f61409a, dVar.f61409a) && jo.p.c(this.f61410b, dVar.f61410b) && jo.p.c(this.f61411c, dVar.f61411c) && a() == dVar.a() && getType() == dVar.getType();
        }
        return false;
    }

    @Override // ud.l
    public l.a getType() {
        return this.f61413e;
    }

    public int hashCode() {
        return (((((((this.f61409a.hashCode() * 31) + this.f61410b.hashCode()) * 31) + this.f61411c.hashCode()) * 31) + Integer.hashCode(a())) * 31) + getType().hashCode();
    }

    public String toString() {
        return "CampaignDetailAppUserIdSettingBindModel(appIconUrl=" + this.f61409a + ", registerAppUserUdText=" + this.f61410b + ", appUserIdRegistrationNotesText=" + this.f61411c + ", itemMarginTop=" + a() + ", type=" + getType() + ')';
    }

    public /* synthetic */ d(String str, String str2, String str3, int i10, l.a aVar, int i11, jo.h hVar) {
        this(str, str2, str3, (i11 & 8) != 0 ? -24 : i10, (i11 & 16) != 0 ? l.a.CAMPAIGN_DETAIL_APP_USER_ID_SETTING : aVar);
    }
}
