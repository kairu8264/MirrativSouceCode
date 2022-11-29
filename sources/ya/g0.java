package ya;

import com.dena.mirrorman.net.api.response.campaign.CampaignPrize;

/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f61438c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f61439a;

    /* renamed from: b  reason: collision with root package name */
    public final String f61440b;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g0 a(CampaignPrize campaignPrize) {
            jo.p.h(campaignPrize, "prize");
            return new g0(campaignPrize.getPrizeImageUrl(), campaignPrize.getPrizeNum());
        }
    }

    public g0(String str, String str2) {
        jo.p.h(str, "imageUrl");
        jo.p.h(str2, "countText");
        this.f61439a = str;
        this.f61440b = str2;
    }

    public final String a() {
        return this.f61440b;
    }

    public final String b() {
        return this.f61439a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return jo.p.c(this.f61439a, g0Var.f61439a) && jo.p.c(this.f61440b, g0Var.f61440b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f61439a.hashCode() * 31) + this.f61440b.hashCode();
    }

    public String toString() {
        return "CampaignPrizeBindModel(imageUrl=" + this.f61439a + ", countText=" + this.f61440b + ')';
    }
}
