package z9;

import android.content.Context;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingUserDetail;
import com.google.android.exoplayer2.C;
import java.util.Arrays;
import jo.i0;
import ud.a;

/* loaded from: classes.dex */
public final class c0 implements ud.a {
    public static final a N = new a(null);
    public final String A;
    public final String B;
    public final String C;
    public final float D;
    public final String E;
    public final String F;
    public final boolean G;
    public final boolean H;
    public final int I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final a.EnumC0862a M;

    /* renamed from: w  reason: collision with root package name */
    public final int f62808w;

    /* renamed from: x  reason: collision with root package name */
    public final int f62809x;

    /* renamed from: y  reason: collision with root package name */
    public final String f62810y;

    /* renamed from: z  reason: collision with root package name */
    public final String f62811z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c0 a(Context context, GiftRankingUserDetail giftRankingUserDetail, int i10, int i11, boolean z10, boolean z11) {
            jo.p.h(context, "context");
            jo.p.h(giftRankingUserDetail, "rankingUser");
            int rank = giftRankingUserDetail.getRank();
            int userId = giftRankingUserDetail.getUserId();
            String liveId = giftRankingUserDetail.getLiveId();
            String iconUrl = giftRankingUserDetail.getIconUrl();
            String badgeImageUrl = giftRankingUserDetail.getBadgeImageUrl();
            String labelImageUrl = giftRankingUserDetail.getLabelImageUrl();
            String valueOf = String.valueOf(giftRankingUserDetail.getRank());
            float f10 = context.getResources().getDisplayMetrics().scaledDensity * (giftRankingUserDetail.getRank() <= 3 ? 16.0f : 12.0f);
            String name = giftRankingUserDetail.getName();
            int i12 = q9.i.text_emomo_run_reward_amount_with_space;
            i0 i0Var = i0.f38149a;
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(giftRankingUserDetail.getGiftPoint())}, 1));
            jo.p.g(format, "format(format, *args)");
            String string = context.getString(i12, format);
            jo.p.g(string, "context.getString(R.stri…, rankingUser.giftPoint))");
            return new c0(rank, userId, liveId, iconUrl, badgeImageUrl, labelImageUrl, valueOf, f10, name, string, giftRankingUserDetail.getBadgeImageUrl().length() > 0, giftRankingUserDetail.getLabelImageUrl().length() > 0, i10, i11, z10, z11, null, C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        }
    }

    public c0(int i10, int i11, String str, String str2, String str3, String str4, String str5, float f10, String str6, String str7, boolean z10, boolean z11, int i12, int i13, boolean z12, boolean z13, a.EnumC0862a enumC0862a) {
        jo.p.h(str, "liveId");
        jo.p.h(str2, "profileImageUrl");
        jo.p.h(str3, "profileBadgeImageUrl");
        jo.p.h(str4, "catalogLabelImageUrl");
        jo.p.h(str5, "profileRankText");
        jo.p.h(str6, "profileNameText");
        jo.p.h(str7, "profilePointText");
        jo.p.h(enumC0862a, "type");
        this.f62808w = i10;
        this.f62809x = i11;
        this.f62810y = str;
        this.f62811z = str2;
        this.A = str3;
        this.B = str4;
        this.C = str5;
        this.D = f10;
        this.E = str6;
        this.F = str7;
        this.G = z10;
        this.H = z11;
        this.I = i12;
        this.J = i13;
        this.K = z12;
        this.L = z13;
        this.M = enumC0862a;
    }

    public final String a() {
        return this.B;
    }

    public final String b() {
        return this.f62810y;
    }

    public final int c() {
        return this.J;
    }

    public final String d() {
        return this.A;
    }

    public final String e() {
        return this.f62811z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return this.f62808w == c0Var.f62808w && this.f62809x == c0Var.f62809x && jo.p.c(this.f62810y, c0Var.f62810y) && jo.p.c(this.f62811z, c0Var.f62811z) && jo.p.c(this.A, c0Var.A) && jo.p.c(this.B, c0Var.B) && jo.p.c(this.C, c0Var.C) && jo.p.c(Float.valueOf(this.D), Float.valueOf(c0Var.D)) && jo.p.c(this.E, c0Var.E) && jo.p.c(this.F, c0Var.F) && this.G == c0Var.G && this.H == c0Var.H && this.I == c0Var.I && this.J == c0Var.J && this.K == c0Var.K && this.L == c0Var.L && getType() == c0Var.getType();
        }
        return false;
    }

    public final String f() {
        return this.E;
    }

    public final String g() {
        return this.F;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.M;
    }

    public final String h() {
        return this.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((Integer.hashCode(this.f62808w) * 31) + Integer.hashCode(this.f62809x)) * 31) + this.f62810y.hashCode()) * 31) + this.f62811z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + Float.hashCode(this.D)) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31;
        boolean z10 = this.G;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.H;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int hashCode2 = (((((i11 + i12) * 31) + Integer.hashCode(this.I)) * 31) + Integer.hashCode(this.J)) * 31;
        boolean z12 = this.K;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int i14 = (hashCode2 + i13) * 31;
        boolean z13 = this.L;
        return ((i14 + (z13 ? 1 : z13 ? 1 : 0)) * 31) + getType().hashCode();
    }

    public final float i() {
        return this.D;
    }

    public final int j() {
        return this.I;
    }

    public final int k() {
        return this.f62809x;
    }

    public final boolean l() {
        return this.H;
    }

    public final boolean m() {
        return this.L;
    }

    public final boolean n() {
        return this.K;
    }

    public final boolean o() {
        return this.G;
    }

    public String toString() {
        return "GiftRankingWholeRankingUserBindModel(rank=" + this.f62808w + ", userId=" + this.f62809x + ", liveId=" + this.f62810y + ", profileImageUrl=" + this.f62811z + ", profileBadgeImageUrl=" + this.A + ", catalogLabelImageUrl=" + this.B + ", profileRankText=" + this.C + ", profileRankTextSizeSp=" + this.D + ", profileNameText=" + this.E + ", profilePointText=" + this.F + ", isVisibleProfileBadgeImage=" + this.G + ", isVisibleCatalogLabelImage=" + this.H + ", rankTextColor=" + this.I + ", mainColor=" + this.J + ", isVisibleLive=" + this.K + ", isVisibleDivider=" + this.L + ", type=" + getType() + ')';
    }

    public /* synthetic */ c0(int i10, int i11, String str, String str2, String str3, String str4, String str5, float f10, String str6, String str7, boolean z10, boolean z11, int i12, int i13, boolean z12, boolean z13, a.EnumC0862a enumC0862a, int i14, jo.h hVar) {
        this(i10, i11, str, str2, str3, str4, str5, f10, str6, str7, z10, z11, i12, i13, z12, z13, (i14 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? a.EnumC0862a.GIFT_RANKING_WHOLE_RANKING_USER : enumC0862a);
    }
}
