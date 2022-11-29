package ud;

import com.dena.mirrorman.net.bcsvr.response.GiftRankingNearbyRankedUser;
import ud.a;

/* loaded from: classes2.dex */
public final class e1 implements ud.a {
    public static final a M = new a(null);
    public final String A;
    public final String B;
    public final String C;
    public final int D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final a.EnumC0862a L;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f54879w;

    /* renamed from: x  reason: collision with root package name */
    public final String f54880x;

    /* renamed from: y  reason: collision with root package name */
    public final String f54881y;

    /* renamed from: z  reason: collision with root package name */
    public final String f54882z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e1 a(GiftRankingNearbyRankedUser giftRankingNearbyRankedUser, boolean z10, boolean z11) {
            jo.p.h(giftRankingNearbyRankedUser, "response");
            String valueOf = String.valueOf(giftRankingNearbyRankedUser.getRank());
            String userId = giftRankingNearbyRankedUser.getUserId();
            String iconUrl = giftRankingNearbyRankedUser.getIconUrl();
            String badgeImageUrl = giftRankingNearbyRankedUser.getBadgeImageUrl();
            String labelImageUrl = giftRankingNearbyRankedUser.getLabelImageUrl();
            String name = giftRankingNearbyRankedUser.getName();
            int giftPoint = giftRankingNearbyRankedUser.getGiftPoint();
            boolean z12 = !z10;
            boolean z13 = !z10;
            String badgeImageUrl2 = giftRankingNearbyRankedUser.getBadgeImageUrl();
            boolean z14 = ((badgeImageUrl2 == null || badgeImageUrl2.length() == 0) || z10) ? false : true;
            String labelImageUrl2 = giftRankingNearbyRankedUser.getLabelImageUrl();
            return new e1(z10, valueOf, userId, iconUrl, badgeImageUrl, labelImageUrl, name, giftPoint, z12, z13, z14, ((labelImageUrl2 == null || labelImageUrl2.length() == 0) || z10) ? false : true, !z10, (z10 || z11) ? false : true, !z10, null, 32768, null);
        }
    }

    public e1(boolean z10, String str, String str2, String str3, String str4, String str5, String str6, int i10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, a.EnumC0862a enumC0862a) {
        jo.p.h(str, "rankText");
        jo.p.h(str2, "userId");
        jo.p.h(str6, "profileNameText");
        jo.p.h(enumC0862a, "type");
        this.f54879w = z10;
        this.f54880x = str;
        this.f54881y = str2;
        this.f54882z = str3;
        this.A = str4;
        this.B = str5;
        this.C = str6;
        this.D = i10;
        this.E = z11;
        this.F = z12;
        this.G = z13;
        this.H = z14;
        this.I = z15;
        this.J = z16;
        this.K = z17;
        this.L = enumC0862a;
    }

    public final String a() {
        return this.B;
    }

    public final String b() {
        return this.A;
    }

    public final int c() {
        return this.D;
    }

    public final String d() {
        return this.f54882z;
    }

    public final String e() {
        return this.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1) {
            e1 e1Var = (e1) obj;
            return this.f54879w == e1Var.f54879w && jo.p.c(this.f54880x, e1Var.f54880x) && jo.p.c(this.f54881y, e1Var.f54881y) && jo.p.c(this.f54882z, e1Var.f54882z) && jo.p.c(this.A, e1Var.A) && jo.p.c(this.B, e1Var.B) && jo.p.c(this.C, e1Var.C) && this.D == e1Var.D && this.E == e1Var.E && this.F == e1Var.F && this.G == e1Var.G && this.H == e1Var.H && this.I == e1Var.I && this.J == e1Var.J && this.K == e1Var.K && getType() == e1Var.getType();
        }
        return false;
    }

    public final String f() {
        return this.f54880x;
    }

    public final boolean g() {
        return this.f54879w;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.L;
    }

    public final boolean h() {
        return this.H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean z10 = this.f54879w;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode = ((((i10 * 31) + this.f54880x.hashCode()) * 31) + this.f54881y.hashCode()) * 31;
        String str = this.f54882z;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.B;
        int hashCode4 = (((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.C.hashCode()) * 31) + Integer.hashCode(this.D)) * 31;
        boolean z11 = this.E;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode4 + i11) * 31;
        boolean z12 = this.F;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z13 = this.G;
        int i15 = z13;
        if (z13 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z14 = this.H;
        int i17 = z14;
        if (z14 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        boolean z15 = this.I;
        int i19 = z15;
        if (z15 != 0) {
            i19 = 1;
        }
        int i20 = (i18 + i19) * 31;
        boolean z16 = this.J;
        int i21 = z16;
        if (z16 != 0) {
            i21 = 1;
        }
        int i22 = (i20 + i21) * 31;
        boolean z17 = this.K;
        return ((i22 + (z17 ? 1 : z17 ? 1 : 0)) * 31) + getType().hashCode();
    }

    public final boolean i() {
        return this.G;
    }

    public final boolean j() {
        return this.J;
    }

    public final boolean k() {
        return this.K;
    }

    public final boolean l() {
        return this.F;
    }

    public final boolean m() {
        return this.I;
    }

    public final boolean n() {
        return this.E;
    }

    public String toString() {
        return "GiftRankingRankUpRouletteUserBindModel(isRankUpUser=" + this.f54879w + ", rankText=" + this.f54880x + ", userId=" + this.f54881y + ", profileImageUrl=" + this.f54882z + ", profileBadgeImageUrl=" + this.A + ", catalogLabelImageUrl=" + this.B + ", profileNameText=" + this.C + ", profileGiftPoint=" + this.D + ", isVisibleRankText=" + this.E + ", isVisibleProfileImage=" + this.F + ", isVisibleProfileBadgeImage=" + this.G + ", isVisibleCatalogLabelImage=" + this.H + ", isVisibleProfileNameText=" + this.I + ", isVisibleProfileGiftBoxImage=" + this.J + ", isVisibleProfileGiftPointText=" + this.K + ", type=" + getType() + ')';
    }

    public /* synthetic */ e1(boolean z10, String str, String str2, String str3, String str4, String str5, String str6, int i10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, a.EnumC0862a enumC0862a, int i11, jo.h hVar) {
        this(z10, str, str2, str3, str4, str5, str6, i10, z11, z12, z13, z14, z15, z16, z17, (i11 & 32768) != 0 ? a.EnumC0862a.GIFT_RANKING_RANK_UP_NEARBY_USER : enumC0862a);
    }
}
