package ya;

import ud.l;

/* loaded from: classes2.dex */
public final class v implements ud.l {

    /* renamed from: m  reason: collision with root package name */
    public static final a f61570m = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f61571a;

    /* renamed from: b  reason: collision with root package name */
    public final String f61572b;

    /* renamed from: c  reason: collision with root package name */
    public final String f61573c;

    /* renamed from: d  reason: collision with root package name */
    public final String f61574d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f61575e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f61576f;

    /* renamed from: g  reason: collision with root package name */
    public final String f61577g;

    /* renamed from: h  reason: collision with root package name */
    public final String f61578h;

    /* renamed from: i  reason: collision with root package name */
    public final String f61579i;

    /* renamed from: j  reason: collision with root package name */
    public final String f61580j;

    /* renamed from: k  reason: collision with root package name */
    public final int f61581k;

    /* renamed from: l  reason: collision with root package name */
    public final l.a f61582l;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
            if ((r9.length() > 0) == true) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ya.v a(com.dena.mirrorman.net.api.response.campaign.CampaignDetailResponse r18) {
            /*
                r17 = this;
                java.lang.String r0 = "campaignDetailResponse"
                r1 = r18
                jo.p.h(r1, r0)
                ya.v r0 = new ya.v
                java.lang.String r2 = r18.getTitleImageUrl()
                java.lang.String r3 = r18.getTitle()
                java.lang.String r4 = r18.getPeriod()
                java.lang.String r5 = r18.getPeriodNotes()
                com.dena.mirrorman.net.api.response.campaign.CampaignLink r6 = r18.getLink()
                r7 = 1
                r8 = 0
                if (r6 == 0) goto L23
                r6 = r7
                goto L24
            L23:
                r6 = r8
            L24:
                com.dena.mirrorman.net.api.response.campaign.CampaignLink r9 = r18.getLink()
                if (r9 == 0) goto L3c
                java.lang.String r9 = r9.getTitle()
                if (r9 == 0) goto L3c
                int r9 = r9.length()
                if (r9 <= 0) goto L38
                r9 = r7
                goto L39
            L38:
                r9 = r8
            L39:
                if (r9 != r7) goto L3c
                goto L3d
            L3c:
                r7 = r8
            L3d:
                com.dena.mirrorman.net.api.response.campaign.CampaignLink r8 = r18.getLink()
                java.lang.String r9 = ""
                if (r8 == 0) goto L4b
                java.lang.String r8 = r8.getTitle()
                if (r8 != 0) goto L4c
            L4b:
                r8 = r9
            L4c:
                com.dena.mirrorman.net.api.response.campaign.CampaignLink r10 = r18.getLink()
                if (r10 == 0) goto L58
                java.lang.String r10 = r10.getDescription()
                if (r10 != 0) goto L59
            L58:
                r10 = r9
            L59:
                com.dena.mirrorman.net.api.response.campaign.CampaignLink r11 = r18.getLink()
                if (r11 == 0) goto L65
                java.lang.String r11 = r11.getLabel()
                if (r11 != 0) goto L66
            L65:
                r11 = r9
            L66:
                com.dena.mirrorman.net.api.response.campaign.CampaignLink r1 = r18.getLink()
                if (r1 == 0) goto L75
                java.lang.String r1 = r1.getUrl()
                if (r1 != 0) goto L73
                goto L75
            L73:
                r12 = r1
                goto L76
            L75:
                r12 = r9
            L76:
                r13 = 0
                r14 = 0
                r15 = 3072(0xc00, float:4.305E-42)
                r16 = 0
                r1 = r0
                r9 = r10
                r10 = r11
                r11 = r12
                r12 = r13
                r13 = r14
                r14 = r15
                r15 = r16
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ya.v.a.a(com.dena.mirrorman.net.api.response.campaign.CampaignDetailResponse):ya.v");
        }
    }

    public v(String str, String str2, String str3, String str4, boolean z10, boolean z11, String str5, String str6, String str7, String str8, int i10, l.a aVar) {
        jo.p.h(str, "headerImageUrl");
        jo.p.h(str2, "titleText");
        jo.p.h(str3, "periodText");
        jo.p.h(str4, "periodNotesText");
        jo.p.h(str5, "linkTitle");
        jo.p.h(str6, "linkDescription");
        jo.p.h(str7, "linkLabel");
        jo.p.h(str8, "linkUrl");
        jo.p.h(aVar, "type");
        this.f61571a = str;
        this.f61572b = str2;
        this.f61573c = str3;
        this.f61574d = str4;
        this.f61575e = z10;
        this.f61576f = z11;
        this.f61577g = str5;
        this.f61578h = str6;
        this.f61579i = str7;
        this.f61580j = str8;
        this.f61581k = i10;
        this.f61582l = aVar;
    }

    @Override // ud.l
    public int a() {
        return this.f61581k;
    }

    public final String b() {
        return this.f61571a;
    }

    public final String c() {
        return this.f61578h;
    }

    public final String d() {
        return this.f61579i;
    }

    public final String e() {
        return this.f61577g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return jo.p.c(this.f61571a, vVar.f61571a) && jo.p.c(this.f61572b, vVar.f61572b) && jo.p.c(this.f61573c, vVar.f61573c) && jo.p.c(this.f61574d, vVar.f61574d) && this.f61575e == vVar.f61575e && this.f61576f == vVar.f61576f && jo.p.c(this.f61577g, vVar.f61577g) && jo.p.c(this.f61578h, vVar.f61578h) && jo.p.c(this.f61579i, vVar.f61579i) && jo.p.c(this.f61580j, vVar.f61580j) && a() == vVar.a() && getType() == vVar.getType();
        }
        return false;
    }

    public final String f() {
        return this.f61580j;
    }

    public final String g() {
        return this.f61574d;
    }

    @Override // ud.l
    public l.a getType() {
        return this.f61582l;
    }

    public final String h() {
        return this.f61573c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f61571a.hashCode() * 31) + this.f61572b.hashCode()) * 31) + this.f61573c.hashCode()) * 31) + this.f61574d.hashCode()) * 31;
        boolean z10 = this.f61575e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f61576f;
        return ((((((((((((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.f61577g.hashCode()) * 31) + this.f61578h.hashCode()) * 31) + this.f61579i.hashCode()) * 31) + this.f61580j.hashCode()) * 31) + Integer.hashCode(a())) * 31) + getType().hashCode();
    }

    public final String i() {
        return this.f61572b;
    }

    public final boolean j() {
        return this.f61575e;
    }

    public final boolean k() {
        return this.f61576f;
    }

    public String toString() {
        return "CampaignDetailHeaderBindModel(headerImageUrl=" + this.f61571a + ", titleText=" + this.f61572b + ", periodText=" + this.f61573c + ", periodNotesText=" + this.f61574d + ", isVisibleLink=" + this.f61575e + ", isVisibleLinkTitle=" + this.f61576f + ", linkTitle=" + this.f61577g + ", linkDescription=" + this.f61578h + ", linkLabel=" + this.f61579i + ", linkUrl=" + this.f61580j + ", itemMarginTop=" + a() + ", type=" + getType() + ')';
    }

    public /* synthetic */ v(String str, String str2, String str3, String str4, boolean z10, boolean z11, String str5, String str6, String str7, String str8, int i10, l.a aVar, int i11, jo.h hVar) {
        this(str, str2, str3, str4, z10, z11, str5, str6, str7, str8, (i11 & 1024) != 0 ? 0 : i10, (i11 & 2048) != 0 ? l.a.CAMPAIGN_DETAIL_HEADER : aVar);
    }
}
