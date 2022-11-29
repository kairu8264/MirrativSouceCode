package ud;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.event.ShooterRankingUser;
import com.dena.mirrorman.net.api.response.event.ShooterRatingClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ud.a;

/* loaded from: classes2.dex */
public final class x3 implements ud.a {
    public static final a Y = new a(null);
    public static final int Z = 8;
    public final boolean A;
    public final String B;
    public final boolean C;
    public final String D;
    public final int E;
    public final int F;
    public final String G;
    public final String H;
    public final int I;
    public final Drawable J;
    public final String K;
    public final boolean L;
    public final int M;
    public final int N;
    public final int O;
    public final List<String> P;
    public final boolean Q;
    public final List<Drawable> R;
    public final boolean S;
    public final int T;
    public final int U;
    public final Drawable V;
    public final boolean W;
    public final a.EnumC0862a X;

    /* renamed from: w  reason: collision with root package name */
    public final int f55699w;

    /* renamed from: x  reason: collision with root package name */
    public final String f55700x;

    /* renamed from: y  reason: collision with root package name */
    public final String f55701y;

    /* renamed from: z  reason: collision with root package name */
    public final String f55702z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final x3 a(Context context, ShooterRankingUser shooterRankingUser, String str, int i10, int i11, int i12, boolean z10, boolean z11) {
            int d10;
            jo.p.h(context, "context");
            jo.p.h(shooterRankingUser, MRLog.TARGET_TYPE_USER);
            jo.p.h(str, "ratingText");
            int userId = shooterRankingUser.getUserId();
            String liveId = shooterRankingUser.getLiveId();
            String iconUrl = shooterRankingUser.getIconUrl();
            String badgeImageUrl = shooterRankingUser.getBadgeImageUrl();
            boolean z12 = shooterRankingUser.getBadgeImageUrl().length() > 0;
            String labelImageUrl = shooterRankingUser.getLabelImageUrl();
            boolean z13 = shooterRankingUser.getLabelImageUrl().length() > 0;
            String valueOf = String.valueOf(shooterRankingUser.getRank());
            int rank = shooterRankingUser.getRank();
            if (rank == 1) {
                d10 = c3.a.d(context, nd.w0.f42225a0);
            } else if (rank == 2) {
                d10 = c3.a.d(context, nd.w0.f42227b0);
            } else if (rank != 3) {
                d10 = c3.a.d(context, nd.w0.f42229d);
            } else {
                d10 = c3.a.d(context, nd.w0.f42228c0);
            }
            int i13 = d10;
            int i14 = shooterRankingUser.getRank() <= 3 ? 16 : 12;
            String name = shooterRankingUser.getName();
            int i15 = nd.f1.text_shooter_total_score;
            jo.i0 i0Var = jo.i0.f38149a;
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(shooterRankingUser.getScore())}, 1));
            jo.p.g(format, "format(format, *args)");
            String string = context.getString(i15, format);
            int i16 = 7 <= String.valueOf(shooterRankingUser.getScore()).length() ? 8 : 10;
            ShooterRatingClass ratingClass = shooterRankingUser.getRatingClass();
            Drawable b10 = b(context, ratingClass != null ? ratingClass.getIconType() : 0);
            boolean z14 = z10 && !TextUtils.isEmpty(shooterRankingUser.getLiveId());
            List<String> memberImageUrls = shooterRankingUser.getMemberImageUrls();
            boolean z15 = !shooterRankingUser.getMemberImageUrls().isEmpty();
            List<Integer> memberVictoryLevels = shooterRankingUser.getMemberVictoryLevels();
            ArrayList arrayList = new ArrayList(xn.t.u(memberVictoryLevels, 10));
            for (Number number : memberVictoryLevels) {
                arrayList.add(x3.Y.c(context, number.intValue()));
            }
            int victoryLevel = shooterRankingUser.getVictoryLevel();
            int victoryCount = shooterRankingUser.getVictoryCount();
            Drawable c10 = c(context, shooterRankingUser.getVictoryLevel());
            boolean z16 = shooterRankingUser.getVictoryLevel() > 0;
            jo.p.g(string, "getString(\n             …user.score)\n            )");
            return new x3(userId, liveId, iconUrl, badgeImageUrl, z12, labelImageUrl, z13, valueOf, i13, i14, name, string, i16, b10, str, z14, i10, i11, i12, memberImageUrls, z15, arrayList, z11, victoryLevel, victoryCount, c10, z16, null, 134217728, null);
        }

        public final Drawable b(Context context, int i10) {
            switch (i10) {
                case 1:
                    return c3.a.f(context, nd.y0.ic_shooter_rating_bronze_c);
                case 2:
                    return c3.a.f(context, nd.y0.ic_shooter_rating_bronze_b);
                case 3:
                    return c3.a.f(context, nd.y0.ic_shooter_rating_bronze_a);
                case 4:
                    return c3.a.f(context, nd.y0.ic_shooter_rating_silver_c);
                case 5:
                    return c3.a.f(context, nd.y0.ic_shooter_rating_silver_b);
                case 6:
                    return c3.a.f(context, nd.y0.ic_shooter_rating_silver_a);
                case 7:
                    return c3.a.f(context, nd.y0.ic_shooter_rating_gold_c);
                case 8:
                    return c3.a.f(context, nd.y0.ic_shooter_rating_gold_b);
                case 9:
                    return c3.a.f(context, nd.y0.ic_shooter_rating_gold_a);
                case 10:
                    return c3.a.f(context, nd.y0.ic_shooter_rating_platinum_c);
                case 11:
                    return c3.a.f(context, nd.y0.ic_shooter_rating_platinum_b);
                case 12:
                    return c3.a.f(context, nd.y0.ic_shooter_rating_platinum_a);
                case 13:
                    return c3.a.f(context, nd.y0.ic_shooter_rating_legend);
                default:
                    return null;
            }
        }

        public final Drawable c(Context context, int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return c3.a.f(context, nd.y0.img_shooter_victory_3);
                }
                return c3.a.f(context, nd.y0.img_shooter_victory_2);
            }
            return c3.a.f(context, nd.y0.img_shooter_victory_1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x3(int i10, String str, String str2, String str3, boolean z10, String str4, boolean z11, String str5, int i11, int i12, String str6, String str7, int i13, Drawable drawable, String str8, boolean z12, int i14, int i15, int i16, List<String> list, boolean z13, List<? extends Drawable> list2, boolean z14, int i17, int i18, Drawable drawable2, boolean z15, a.EnumC0862a enumC0862a) {
        jo.p.h(str, "liveId");
        jo.p.h(str2, "profileImageUrl");
        jo.p.h(str3, "profileBadgeImageUrl");
        jo.p.h(str4, "catalogLabelImageUrl");
        jo.p.h(str5, "rankText");
        jo.p.h(str6, "profileNameText");
        jo.p.h(str7, "totalScoreText");
        jo.p.h(str8, "ratingText");
        jo.p.h(list, "membersImages");
        jo.p.h(list2, "memberVictoryLevelImageDrawables");
        jo.p.h(enumC0862a, "type");
        this.f55699w = i10;
        this.f55700x = str;
        this.f55701y = str2;
        this.f55702z = str3;
        this.A = z10;
        this.B = str4;
        this.C = z11;
        this.D = str5;
        this.E = i11;
        this.F = i12;
        this.G = str6;
        this.H = str7;
        this.I = i13;
        this.J = drawable;
        this.K = str8;
        this.L = z12;
        this.M = i14;
        this.N = i15;
        this.O = i16;
        this.P = list;
        this.Q = z13;
        this.R = list2;
        this.S = z14;
        this.T = i17;
        this.U = i18;
        this.V = drawable2;
        this.W = z15;
        this.X = enumC0862a;
    }

    public final String a() {
        return this.B;
    }

    public final String b() {
        return this.f55700x;
    }

    public final List<Drawable> c() {
        return this.R;
    }

    public final List<String> d() {
        return this.P;
    }

    public final String e() {
        return this.f55702z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x3) {
            x3 x3Var = (x3) obj;
            return this.f55699w == x3Var.f55699w && jo.p.c(this.f55700x, x3Var.f55700x) && jo.p.c(this.f55701y, x3Var.f55701y) && jo.p.c(this.f55702z, x3Var.f55702z) && this.A == x3Var.A && jo.p.c(this.B, x3Var.B) && this.C == x3Var.C && jo.p.c(this.D, x3Var.D) && this.E == x3Var.E && this.F == x3Var.F && jo.p.c(this.G, x3Var.G) && jo.p.c(this.H, x3Var.H) && this.I == x3Var.I && jo.p.c(this.J, x3Var.J) && jo.p.c(this.K, x3Var.K) && this.L == x3Var.L && this.M == x3Var.M && this.N == x3Var.N && this.O == x3Var.O && jo.p.c(this.P, x3Var.P) && this.Q == x3Var.Q && jo.p.c(this.R, x3Var.R) && this.S == x3Var.S && this.T == x3Var.T && this.U == x3Var.U && jo.p.c(this.V, x3Var.V) && this.W == x3Var.W && getType() == x3Var.getType();
        }
        return false;
    }

    public final String f() {
        return this.f55701y;
    }

    public final String g() {
        return this.G;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.X;
    }

    public final String h() {
        return this.D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f55699w) * 31) + this.f55700x.hashCode()) * 31) + this.f55701y.hashCode()) * 31) + this.f55702z.hashCode()) * 31;
        boolean z10 = this.A;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((hashCode + i10) * 31) + this.B.hashCode()) * 31;
        boolean z11 = this.C;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int hashCode3 = (((((((((((((hashCode2 + i11) * 31) + this.D.hashCode()) * 31) + Integer.hashCode(this.E)) * 31) + Integer.hashCode(this.F)) * 31) + this.G.hashCode()) * 31) + this.H.hashCode()) * 31) + Integer.hashCode(this.I)) * 31;
        Drawable drawable = this.J;
        int hashCode4 = (((hashCode3 + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.K.hashCode()) * 31;
        boolean z12 = this.L;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int hashCode5 = (((((((((hashCode4 + i12) * 31) + Integer.hashCode(this.M)) * 31) + Integer.hashCode(this.N)) * 31) + Integer.hashCode(this.O)) * 31) + this.P.hashCode()) * 31;
        boolean z13 = this.Q;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int hashCode6 = (((hashCode5 + i13) * 31) + this.R.hashCode()) * 31;
        boolean z14 = this.S;
        int i14 = z14;
        if (z14 != 0) {
            i14 = 1;
        }
        int hashCode7 = (((((hashCode6 + i14) * 31) + Integer.hashCode(this.T)) * 31) + Integer.hashCode(this.U)) * 31;
        Drawable drawable2 = this.V;
        int hashCode8 = (hashCode7 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        boolean z15 = this.W;
        return ((hashCode8 + (z15 ? 1 : z15 ? 1 : 0)) * 31) + getType().hashCode();
    }

    public final int i() {
        return this.E;
    }

    public final int j() {
        return this.F;
    }

    public final int k() {
        return this.O;
    }

    public final Drawable l() {
        return this.J;
    }

    public final String m() {
        return this.K;
    }

    public final int n() {
        return this.N;
    }

    public final String o() {
        return this.H;
    }

    public final int p() {
        return this.I;
    }

    public final int q() {
        return this.f55699w;
    }

    public final int r() {
        return this.U;
    }

    public final int s() {
        return this.T;
    }

    public final Drawable t() {
        return this.V;
    }

    public String toString() {
        return "ShooterRankingUserBindModel(userId=" + this.f55699w + ", liveId=" + this.f55700x + ", profileImageUrl=" + this.f55701y + ", profileBadgeImageUrl=" + this.f55702z + ", isVisibleProfileBadgeImage=" + this.A + ", catalogLabelImageUrl=" + this.B + ", isVisibleCatalogLabelImage=" + this.C + ", rankText=" + this.D + ", rankTextColor=" + this.E + ", rankTextSize=" + this.F + ", profileNameText=" + this.G + ", totalScoreText=" + this.H + ", totalScoreTextSize=" + this.I + ", ratingIconImageDrawable=" + this.J + ", ratingText=" + this.K + ", isVisibleLive=" + this.L + ", scoreColor=" + this.M + ", totalScoreColor=" + this.N + ", ratingColor=" + this.O + ", membersImages=" + this.P + ", isVisibleMembers=" + this.Q + ", memberVictoryLevelImageDrawables=" + this.R + ", isVisibleDivider=" + this.S + ", victoryLevel=" + this.T + ", victoryCount=" + this.U + ", VictoryLevelImageDrawable=" + this.V + ", isVisibleVictoryLevelImage=" + this.W + ", type=" + getType() + ')';
    }

    public final boolean u() {
        return this.C;
    }

    public final boolean v() {
        return this.S;
    }

    public final boolean w() {
        return this.L;
    }

    public final boolean x() {
        return this.Q;
    }

    public final boolean y() {
        return this.A;
    }

    public final boolean z() {
        return this.W;
    }

    public /* synthetic */ x3(int i10, String str, String str2, String str3, boolean z10, String str4, boolean z11, String str5, int i11, int i12, String str6, String str7, int i13, Drawable drawable, String str8, boolean z12, int i14, int i15, int i16, List list, boolean z13, List list2, boolean z14, int i17, int i18, Drawable drawable2, boolean z15, a.EnumC0862a enumC0862a, int i19, jo.h hVar) {
        this(i10, str, str2, str3, z10, str4, z11, str5, i11, i12, str6, str7, i13, drawable, str8, z12, i14, i15, i16, list, z13, list2, z14, i17, i18, drawable2, z15, (i19 & 134217728) != 0 ? a.EnumC0862a.SHOOTER_RANKING_USER : enumC0862a);
    }
}
