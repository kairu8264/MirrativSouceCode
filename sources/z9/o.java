package z9;

import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingBroadcasterRank;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingRank;
import z9.p;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: k  reason: collision with root package name */
    public static final a f62863k = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f62864a;

    /* renamed from: b  reason: collision with root package name */
    public final String f62865b;

    /* renamed from: c  reason: collision with root package name */
    public final String f62866c;

    /* renamed from: d  reason: collision with root package name */
    public final String f62867d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f62868e;

    /* renamed from: f  reason: collision with root package name */
    public final String f62869f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f62870g;

    /* renamed from: h  reason: collision with root package name */
    public final p f62871h;

    /* renamed from: i  reason: collision with root package name */
    public final p f62872i;

    /* renamed from: j  reason: collision with root package name */
    public final p f62873j;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final o a(GiftRankingBroadcasterRank giftRankingBroadcasterRank) {
            jo.p.h(giftRankingBroadcasterRank, "response");
            String name = giftRankingBroadcasterRank.getName();
            String userGrade = giftRankingBroadcasterRank.getUserGrade();
            String iconUrl = giftRankingBroadcasterRank.getIconUrl();
            String labelImageUrl = giftRankingBroadcasterRank.getLabelImageUrl();
            boolean z10 = giftRankingBroadcasterRank.getLabelImageUrl().length() > 0;
            String badgeImageUrl = giftRankingBroadcasterRank.getBadgeImageUrl();
            boolean z11 = giftRankingBroadcasterRank.getBadgeImageUrl().length() > 0;
            p.a aVar = p.f62874m;
            p a10 = aVar.a(giftRankingBroadcasterRank.getGiftPoint(), giftRankingBroadcasterRank.getRank());
            GiftRankingRank upperUser = giftRankingBroadcasterRank.getUpperUser();
            p b10 = upperUser != null ? aVar.b(upperUser.getGiftPoint(), upperUser.getRank(), giftRankingBroadcasterRank.getGiftPoint(), p.b.UpperRank) : null;
            GiftRankingRank lowerUser = giftRankingBroadcasterRank.getLowerUser();
            return new o(name, userGrade, iconUrl, labelImageUrl, z10, badgeImageUrl, z11, a10, b10, lowerUser != null ? aVar.b(lowerUser.getGiftPoint(), lowerUser.getRank(), giftRankingBroadcasterRank.getGiftPoint(), p.b.LowerRank) : null);
        }
    }

    public o(String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, p pVar, p pVar2, p pVar3) {
        jo.p.h(str, "name");
        jo.p.h(str2, "gradeText");
        jo.p.h(str3, "iconUrl");
        jo.p.h(str4, "labelImageUrl");
        jo.p.h(str5, "badgeImageUrl");
        jo.p.h(pVar, "myRank");
        this.f62864a = str;
        this.f62865b = str2;
        this.f62866c = str3;
        this.f62867d = str4;
        this.f62868e = z10;
        this.f62869f = str5;
        this.f62870g = z11;
        this.f62871h = pVar;
        this.f62872i = pVar2;
        this.f62873j = pVar3;
    }

    public final String a() {
        return this.f62869f;
    }

    public final String b() {
        return this.f62865b;
    }

    public final String c() {
        return this.f62866c;
    }

    public final String d() {
        return this.f62867d;
    }

    public final p e() {
        return this.f62873j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return jo.p.c(this.f62864a, oVar.f62864a) && jo.p.c(this.f62865b, oVar.f62865b) && jo.p.c(this.f62866c, oVar.f62866c) && jo.p.c(this.f62867d, oVar.f62867d) && this.f62868e == oVar.f62868e && jo.p.c(this.f62869f, oVar.f62869f) && this.f62870g == oVar.f62870g && jo.p.c(this.f62871h, oVar.f62871h) && jo.p.c(this.f62872i, oVar.f62872i) && jo.p.c(this.f62873j, oVar.f62873j);
        }
        return false;
    }

    public final p f() {
        return this.f62871h;
    }

    public final String g() {
        return this.f62864a;
    }

    public final p h() {
        return this.f62872i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f62864a.hashCode() * 31) + this.f62865b.hashCode()) * 31) + this.f62866c.hashCode()) * 31) + this.f62867d.hashCode()) * 31;
        boolean z10 = this.f62868e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((hashCode + i10) * 31) + this.f62869f.hashCode()) * 31;
        boolean z11 = this.f62870g;
        int hashCode3 = (((hashCode2 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.f62871h.hashCode()) * 31;
        p pVar = this.f62872i;
        int hashCode4 = (hashCode3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        p pVar2 = this.f62873j;
        return hashCode4 + (pVar2 != null ? pVar2.hashCode() : 0);
    }

    public final boolean i() {
        return this.f62870g;
    }

    public final boolean j() {
        return this.f62868e;
    }

    public String toString() {
        return "GiftRankingImmediateRankBindModel(name=" + this.f62864a + ", gradeText=" + this.f62865b + ", iconUrl=" + this.f62866c + ", labelImageUrl=" + this.f62867d + ", isVisibleLabelImageView=" + this.f62868e + ", badgeImageUrl=" + this.f62869f + ", isVisibleBadgeImageView=" + this.f62870g + ", myRank=" + this.f62871h + ", upperRank=" + this.f62872i + ", lowerRank=" + this.f62873j + ')';
    }
}
