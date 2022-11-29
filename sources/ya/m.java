package ya;

import com.dena.mirrorman.net.api.response.campaign.CampaignDetailResponse;
import com.google.android.exoplayer2.C;
import java.util.List;
import ud.l;

/* loaded from: classes2.dex */
public final class m implements ud.l {

    /* renamed from: r  reason: collision with root package name */
    public static final a f61543r = new a(null);

    /* renamed from: s  reason: collision with root package name */
    public static final int f61544s = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f61545a;

    /* renamed from: b  reason: collision with root package name */
    public final String f61546b;

    /* renamed from: c  reason: collision with root package name */
    public final String f61547c;

    /* renamed from: d  reason: collision with root package name */
    public final String f61548d;

    /* renamed from: e  reason: collision with root package name */
    public final String f61549e;

    /* renamed from: f  reason: collision with root package name */
    public final String f61550f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f61551g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f61552h;

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f61553i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f61554j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f61555k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f61556l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f61557m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f61558n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f61559o;

    /* renamed from: p  reason: collision with root package name */
    public final int f61560p;

    /* renamed from: q  reason: collision with root package name */
    public final l.a f61561q;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m a(CampaignDetailResponse campaignDetailResponse) {
            jo.p.h(campaignDetailResponse, "campaignDetailResponse");
            return new m(campaignDetailResponse.getApp().getTitle(), campaignDetailResponse.getApp().getIconUrl(), campaignDetailResponse.getApp().getDownloadButtonLabel(), campaignDetailResponse.getApp().getOtherSite1Name(), campaignDetailResponse.getApp().getOtherSite2Name(), campaignDetailResponse.getApp().getYoutubeUrl(), campaignDetailResponse.getNotes(), campaignDetailResponse.getDisclaimers(), campaignDetailResponse.getCopyrights(), campaignDetailResponse.getApp().getDownloadUrl().length() > 0, campaignDetailResponse.getApp().getOtherSite1Name().length() > 0, campaignDetailResponse.getApp().getOtherSite2Name().length() > 0, campaignDetailResponse.getApp().getTwitterUrl().length() > 0, campaignDetailResponse.getApp().getSiteUrl().length() > 0, campaignDetailResponse.getApp().getYoutubeUrl().length() > 0, 0, null, 98304, null);
        }
    }

    public m(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, List<String> list2, List<String> list3, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, l.a aVar) {
        jo.p.h(str, "appTitleText");
        jo.p.h(str2, "appIconImageUrl");
        jo.p.h(str3, "downloadButtonLabel");
        jo.p.h(str4, "otherSite1Name");
        jo.p.h(str5, "otherSite2Name");
        jo.p.h(str6, "youtubeUrl");
        jo.p.h(list, "notes");
        jo.p.h(list2, "disclaimers");
        jo.p.h(list3, "copyrights");
        jo.p.h(aVar, "type");
        this.f61545a = str;
        this.f61546b = str2;
        this.f61547c = str3;
        this.f61548d = str4;
        this.f61549e = str5;
        this.f61550f = str6;
        this.f61551g = list;
        this.f61552h = list2;
        this.f61553i = list3;
        this.f61554j = z10;
        this.f61555k = z11;
        this.f61556l = z12;
        this.f61557m = z13;
        this.f61558n = z14;
        this.f61559o = z15;
        this.f61560p = i10;
        this.f61561q = aVar;
    }

    @Override // ud.l
    public int a() {
        return this.f61560p;
    }

    public final String b() {
        return this.f61546b;
    }

    public final String c() {
        return this.f61545a;
    }

    public final List<String> d() {
        return this.f61553i;
    }

    public final List<String> e() {
        return this.f61552h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return jo.p.c(this.f61545a, mVar.f61545a) && jo.p.c(this.f61546b, mVar.f61546b) && jo.p.c(this.f61547c, mVar.f61547c) && jo.p.c(this.f61548d, mVar.f61548d) && jo.p.c(this.f61549e, mVar.f61549e) && jo.p.c(this.f61550f, mVar.f61550f) && jo.p.c(this.f61551g, mVar.f61551g) && jo.p.c(this.f61552h, mVar.f61552h) && jo.p.c(this.f61553i, mVar.f61553i) && this.f61554j == mVar.f61554j && this.f61555k == mVar.f61555k && this.f61556l == mVar.f61556l && this.f61557m == mVar.f61557m && this.f61558n == mVar.f61558n && this.f61559o == mVar.f61559o && a() == mVar.a() && getType() == mVar.getType();
        }
        return false;
    }

    public final String f() {
        return this.f61547c;
    }

    public final List<String> g() {
        return this.f61551g;
    }

    @Override // ud.l
    public l.a getType() {
        return this.f61561q;
    }

    public final String h() {
        return this.f61548d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((this.f61545a.hashCode() * 31) + this.f61546b.hashCode()) * 31) + this.f61547c.hashCode()) * 31) + this.f61548d.hashCode()) * 31) + this.f61549e.hashCode()) * 31) + this.f61550f.hashCode()) * 31) + this.f61551g.hashCode()) * 31) + this.f61552h.hashCode()) * 31) + this.f61553i.hashCode()) * 31;
        boolean z10 = this.f61554j;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f61555k;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f61556l;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.f61557m;
        int i16 = z13;
        if (z13 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z14 = this.f61558n;
        int i18 = z14;
        if (z14 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z15 = this.f61559o;
        return ((((i19 + (z15 ? 1 : z15 ? 1 : 0)) * 31) + Integer.hashCode(a())) * 31) + getType().hashCode();
    }

    public final String i() {
        return this.f61549e;
    }

    public final String j() {
        return this.f61550f;
    }

    public final boolean k() {
        return this.f61555k;
    }

    public final boolean l() {
        return this.f61556l;
    }

    public final boolean m() {
        return this.f61554j;
    }

    public final boolean n() {
        return this.f61558n;
    }

    public final boolean o() {
        return this.f61557m;
    }

    public final boolean p() {
        return this.f61559o;
    }

    public String toString() {
        return "CampaignDetailFooterBindModel(appTitleText=" + this.f61545a + ", appIconImageUrl=" + this.f61546b + ", downloadButtonLabel=" + this.f61547c + ", otherSite1Name=" + this.f61548d + ", otherSite2Name=" + this.f61549e + ", youtubeUrl=" + this.f61550f + ", notes=" + this.f61551g + ", disclaimers=" + this.f61552h + ", copyrights=" + this.f61553i + ", isVisibleDownload=" + this.f61554j + ", isVisibleAppButton1=" + this.f61555k + ", isVisibleAppButton2=" + this.f61556l + ", isVisibleTwitter=" + this.f61557m + ", isVisibleOfficial=" + this.f61558n + ", isVisibleYouTube=" + this.f61559o + ", itemMarginTop=" + a() + ", type=" + getType() + ')';
    }

    public /* synthetic */ m(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, l.a aVar, int i11, jo.h hVar) {
        this(str, str2, str3, str4, str5, str6, list, list2, list3, z10, z11, z12, z13, z14, z15, (i11 & 32768) != 0 ? -12 : i10, (i11 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? l.a.CAMPAIGN_DETAIL_FOOTER : aVar);
    }
}
