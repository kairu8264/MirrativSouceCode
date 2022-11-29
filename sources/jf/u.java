package jf;

import com.dena.mirrorman.net.api.response.event.GiftRanking;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingBcsvrResponse;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: o  reason: collision with root package name */
    public static final a f38000o = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f38001a;

    /* renamed from: b  reason: collision with root package name */
    public final long f38002b;

    /* renamed from: c  reason: collision with root package name */
    public final String f38003c;

    /* renamed from: d  reason: collision with root package name */
    public final int f38004d;

    /* renamed from: e  reason: collision with root package name */
    public final int f38005e;

    /* renamed from: f  reason: collision with root package name */
    public final String f38006f;

    /* renamed from: g  reason: collision with root package name */
    public final String f38007g;

    /* renamed from: h  reason: collision with root package name */
    public final String f38008h;

    /* renamed from: i  reason: collision with root package name */
    public final int f38009i;

    /* renamed from: j  reason: collision with root package name */
    public final String f38010j;

    /* renamed from: k  reason: collision with root package name */
    public final int f38011k;

    /* renamed from: l  reason: collision with root package name */
    public final int f38012l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f38013m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f38014n;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u a(GiftRanking giftRanking) {
            jo.p.h(giftRanking, "response");
            return new u(giftRanking.getEventId(), giftRanking.getNanoTime(), giftRanking.getEventTitle(), giftRanking.getRankingPoint(), giftRanking.getRank(), giftRanking.getRankText(), giftRanking.getBannerIconImageUrl(), giftRanking.getBannerIconLinkUrl(), giftRanking.getTotalPoint(), giftRanking.getRewardIconUrl(), giftRanking.getRewardAchievedPoint(), giftRanking.getRewardNeedPoint(), giftRanking.isAppEvent(), giftRanking.isFocus());
        }

        public final u b(GiftRankingBcsvrResponse giftRankingBcsvrResponse) {
            jo.p.h(giftRankingBcsvrResponse, "response");
            return new u(giftRankingBcsvrResponse.getEventId(), giftRankingBcsvrResponse.getNanoTime(), giftRankingBcsvrResponse.getEventTitle(), giftRankingBcsvrResponse.getRankingPoint(), giftRankingBcsvrResponse.getRank(), giftRankingBcsvrResponse.getRankText(), giftRankingBcsvrResponse.getBannerIconImageUrl(), giftRankingBcsvrResponse.getBannerIconLinkUrl(), giftRankingBcsvrResponse.getTotalPoint(), giftRankingBcsvrResponse.getRewardIconUrl(), giftRankingBcsvrResponse.getRewardAchievedPoint(), giftRankingBcsvrResponse.getRewardNeedPoint(), giftRankingBcsvrResponse.isAppEvent(), giftRankingBcsvrResponse.isFocus());
        }
    }

    public u(int i10, long j10, String str, int i11, int i12, String str2, String str3, String str4, int i13, String str5, int i14, int i15, boolean z10, boolean z11) {
        jo.p.h(str, "eventTitle");
        jo.p.h(str2, "rankText");
        jo.p.h(str3, "bannerIconImageUrl");
        jo.p.h(str4, "bannerIconLinkUrl");
        jo.p.h(str5, "rewardIconUrl");
        this.f38001a = i10;
        this.f38002b = j10;
        this.f38003c = str;
        this.f38004d = i11;
        this.f38005e = i12;
        this.f38006f = str2;
        this.f38007g = str3;
        this.f38008h = str4;
        this.f38009i = i13;
        this.f38010j = str5;
        this.f38011k = i14;
        this.f38012l = i15;
        this.f38013m = z10;
        this.f38014n = z11;
    }

    public final u a(int i10, long j10, String str, int i11, int i12, String str2, String str3, String str4, int i13, String str5, int i14, int i15, boolean z10, boolean z11) {
        jo.p.h(str, "eventTitle");
        jo.p.h(str2, "rankText");
        jo.p.h(str3, "bannerIconImageUrl");
        jo.p.h(str4, "bannerIconLinkUrl");
        jo.p.h(str5, "rewardIconUrl");
        return new u(i10, j10, str, i11, i12, str2, str3, str4, i13, str5, i14, i15, z10, z11);
    }

    public final String c() {
        return this.f38007g;
    }

    public final String d() {
        return this.f38008h;
    }

    public final int e() {
        return this.f38001a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return this.f38001a == uVar.f38001a && this.f38002b == uVar.f38002b && jo.p.c(this.f38003c, uVar.f38003c) && this.f38004d == uVar.f38004d && this.f38005e == uVar.f38005e && jo.p.c(this.f38006f, uVar.f38006f) && jo.p.c(this.f38007g, uVar.f38007g) && jo.p.c(this.f38008h, uVar.f38008h) && this.f38009i == uVar.f38009i && jo.p.c(this.f38010j, uVar.f38010j) && this.f38011k == uVar.f38011k && this.f38012l == uVar.f38012l && this.f38013m == uVar.f38013m && this.f38014n == uVar.f38014n;
        }
        return false;
    }

    public final String f() {
        return this.f38003c;
    }

    public final long g() {
        return this.f38002b;
    }

    public final int h() {
        return this.f38005e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((Integer.hashCode(this.f38001a) * 31) + Long.hashCode(this.f38002b)) * 31) + this.f38003c.hashCode()) * 31) + Integer.hashCode(this.f38004d)) * 31) + Integer.hashCode(this.f38005e)) * 31) + this.f38006f.hashCode()) * 31) + this.f38007g.hashCode()) * 31) + this.f38008h.hashCode()) * 31) + Integer.hashCode(this.f38009i)) * 31) + this.f38010j.hashCode()) * 31) + Integer.hashCode(this.f38011k)) * 31) + Integer.hashCode(this.f38012l)) * 31;
        boolean z10 = this.f38013m;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f38014n;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String i() {
        return this.f38006f;
    }

    public final int j() {
        return this.f38004d;
    }

    public final int k() {
        return this.f38011k;
    }

    public final String l() {
        return this.f38010j;
    }

    public final int m() {
        return this.f38012l;
    }

    public final int n() {
        return this.f38009i;
    }

    public final boolean o() {
        return this.f38013m;
    }

    public final boolean p() {
        return this.f38014n;
    }

    public String toString() {
        return "GiftRankingCurrentUserRank(eventId=" + this.f38001a + ", nanoTime=" + this.f38002b + ", eventTitle=" + this.f38003c + ", rankingPoint=" + this.f38004d + ", rank=" + this.f38005e + ", rankText=" + this.f38006f + ", bannerIconImageUrl=" + this.f38007g + ", bannerIconLinkUrl=" + this.f38008h + ", totalPoint=" + this.f38009i + ", rewardIconUrl=" + this.f38010j + ", rewardAchievedPoint=" + this.f38011k + ", rewardNeedPoint=" + this.f38012l + ", isAppEvent=" + this.f38013m + ", isFocusedEvent=" + this.f38014n + ')';
    }
}
