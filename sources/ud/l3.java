package ud;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.dena.mirrorman.net.api.response.event.ShooterMemberStatus;
import com.dena.mirrorman.net.api.response.event.ShooterRatingClass;
import com.dena.mirrorman.net.api.response.event.ShooterViewingUser;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import ud.j3;

/* loaded from: classes2.dex */
public final class l3 implements j3 {

    /* renamed from: y  reason: collision with root package name */
    public static final a f55147y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f55148z = 8;

    /* renamed from: a  reason: collision with root package name */
    public final j3.a f55149a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55150b;

    /* renamed from: c  reason: collision with root package name */
    public final String f55151c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55152d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55153e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55154f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f55155g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f55156h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55157i;

    /* renamed from: j  reason: collision with root package name */
    public final String f55158j;

    /* renamed from: k  reason: collision with root package name */
    public final float f55159k;

    /* renamed from: l  reason: collision with root package name */
    public final String f55160l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f55161m;

    /* renamed from: n  reason: collision with root package name */
    public final int f55162n;

    /* renamed from: o  reason: collision with root package name */
    public final int f55163o;

    /* renamed from: p  reason: collision with root package name */
    public final int f55164p;

    /* renamed from: q  reason: collision with root package name */
    public final int f55165q;

    /* renamed from: r  reason: collision with root package name */
    public final int f55166r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f55167s;

    /* renamed from: t  reason: collision with root package name */
    public final int f55168t;

    /* renamed from: u  reason: collision with root package name */
    public final int f55169u;

    /* renamed from: v  reason: collision with root package name */
    public final Drawable f55170v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f55171w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f55172x;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l3 a(Context context, ShooterViewingUser shooterViewingUser, ShooterMemberStatus shooterMemberStatus, boolean z10) {
            jo.p.h(context, "context");
            jo.p.h(shooterViewingUser, "viewingUser");
            jo.p.h(shooterMemberStatus, "status");
            String userId = shooterViewingUser.getUserId();
            String name = shooterViewingUser.getName();
            String iconUrl = shooterViewingUser.getIconUrl();
            String labelImageUrl = shooterViewingUser.getLabelImageUrl();
            if (labelImageUrl == null) {
                labelImageUrl = "";
            }
            String badgeImageUrl = shooterViewingUser.getBadgeImageUrl();
            if (badgeImageUrl == null) {
                badgeImageUrl = "";
            }
            String labelImageUrl2 = shooterViewingUser.getLabelImageUrl();
            if (labelImageUrl2 == null) {
                labelImageUrl2 = "";
            }
            boolean z11 = labelImageUrl2.length() > 0;
            String valueOf = String.valueOf(shooterViewingUser.getRatingPoint());
            ShooterRatingClass ratingClass = shooterViewingUser.getRatingClass();
            Drawable e10 = e(context, ratingClass != null ? ratingClass.getIconType() : 0);
            String nextRewardIconUrl = shooterViewingUser.getNextRewardIconUrl();
            if (nextRewardIconUrl == null) {
                nextRewardIconUrl = "";
            }
            float floatValue = new BigDecimal(String.valueOf(shooterViewingUser.getScore() / Math.max(1, shooterViewingUser.getNextRewardThreshold()))).setScale(3, RoundingMode.DOWN).floatValue();
            jo.i0 i0Var = jo.i0.f38149a;
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(shooterViewingUser.getNextRewardThreshold() - shooterViewingUser.getScore())}, 1));
            jo.p.g(format, "format(format, *args)");
            return new l3(null, userId, name, iconUrl, labelImageUrl, badgeImageUrl, z11, e10, valueOf, nextRewardIconUrl, floatValue, format, shooterViewingUser.isCompleted(), shooterViewingUser.isCompleted() ? 0 : 8, shooterViewingUser.isCompleted() ? 8 : 0, c(shooterMemberStatus, z10), b(shooterMemberStatus, z10), d(z10), z10, shooterViewingUser.getVictoryLevel(), shooterViewingUser.getVictoryCount(), f(context, shooterViewingUser.getVictoryLevel()), shooterViewingUser.getVictoryLevel() > 0, shooterViewingUser.isMatchingViewer(), 1, null);
        }

        public final int b(ShooterMemberStatus shooterMemberStatus, boolean z10) {
            if (z10) {
                return nd.w0.U0;
            }
            return shooterMemberStatus == ShooterMemberStatus.NONE ? nd.w0.f42242u0 : xn.s.m(ShooterMemberStatus.INVITING, ShooterMemberStatus.INVITED).contains(shooterMemberStatus) ? nd.w0.blackThree20 : shooterMemberStatus == ShooterMemberStatus.APPROVED ? nd.w0.S : nd.w0.f42242u0;
        }

        public final int c(ShooterMemberStatus shooterMemberStatus, boolean z10) {
            if (shooterMemberStatus == ShooterMemberStatus.BUSY) {
                return nd.f1.text_shooter_member_busy;
            }
            if (z10) {
                return nd.f1.text_shooter_member_canceled;
            }
            return shooterMemberStatus == ShooterMemberStatus.NONE ? nd.f1.text_shooter_member_invite : xn.s.m(ShooterMemberStatus.INVITING, ShooterMemberStatus.INVITED).contains(shooterMemberStatus) ? nd.f1.text_shooter_member_inviting : shooterMemberStatus == ShooterMemberStatus.APPROVED ? nd.f1.text_shooter_member_joined : nd.f1.text_shooter_member_invite;
        }

        public final int d(boolean z10) {
            if (z10) {
                return nd.w0.f42229d;
            }
            return nd.w0.U0;
        }

        public final Drawable e(Context context, int i10) {
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

        public final Drawable f(Context context, int i10) {
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

    public l3(j3.a aVar, String str, String str2, String str3, String str4, String str5, boolean z10, Drawable drawable, String str6, String str7, float f10, String str8, boolean z11, int i10, int i11, int i12, int i13, int i14, boolean z12, int i15, int i16, Drawable drawable2, boolean z13, boolean z14) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "userId");
        jo.p.h(str2, "userName");
        jo.p.h(str3, "profileImageUrl");
        jo.p.h(str4, "continuousStreamerLabelImageUrl");
        jo.p.h(str5, "continuousStreamerBadgeImageUrl");
        jo.p.h(str6, "ratingText");
        jo.p.h(str7, "nextRewardImageUrl");
        jo.p.h(str8, "nextRewardRemainingPointText");
        this.f55149a = aVar;
        this.f55150b = str;
        this.f55151c = str2;
        this.f55152d = str3;
        this.f55153e = str4;
        this.f55154f = str5;
        this.f55155g = z10;
        this.f55156h = drawable;
        this.f55157i = str6;
        this.f55158j = str7;
        this.f55159k = f10;
        this.f55160l = str8;
        this.f55161m = z11;
        this.f55162n = i10;
        this.f55163o = i11;
        this.f55164p = i12;
        this.f55165q = i13;
        this.f55166r = i14;
        this.f55167s = z12;
        this.f55168t = i15;
        this.f55169u = i16;
        this.f55170v = drawable2;
        this.f55171w = z13;
        this.f55172x = z14;
    }

    public final String a() {
        return this.f55154f;
    }

    public final String b() {
        return this.f55153e;
    }

    public final boolean c() {
        return this.f55167s;
    }

    public final int d() {
        return this.f55165q;
    }

    public final int e() {
        return this.f55164p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l3) {
            l3 l3Var = (l3) obj;
            return getType() == l3Var.getType() && jo.p.c(this.f55150b, l3Var.f55150b) && jo.p.c(this.f55151c, l3Var.f55151c) && jo.p.c(this.f55152d, l3Var.f55152d) && jo.p.c(this.f55153e, l3Var.f55153e) && jo.p.c(this.f55154f, l3Var.f55154f) && this.f55155g == l3Var.f55155g && jo.p.c(this.f55156h, l3Var.f55156h) && jo.p.c(this.f55157i, l3Var.f55157i) && jo.p.c(this.f55158j, l3Var.f55158j) && jo.p.c(Float.valueOf(this.f55159k), Float.valueOf(l3Var.f55159k)) && jo.p.c(this.f55160l, l3Var.f55160l) && this.f55161m == l3Var.f55161m && this.f55162n == l3Var.f55162n && this.f55163o == l3Var.f55163o && this.f55164p == l3Var.f55164p && this.f55165q == l3Var.f55165q && this.f55166r == l3Var.f55166r && this.f55167s == l3Var.f55167s && this.f55168t == l3Var.f55168t && this.f55169u == l3Var.f55169u && jo.p.c(this.f55170v, l3Var.f55170v) && this.f55171w == l3Var.f55171w && this.f55172x == l3Var.f55172x;
        }
        return false;
    }

    public final int f() {
        return this.f55166r;
    }

    public final float g() {
        return this.f55159k;
    }

    @Override // ud.j3
    public j3.a getType() {
        return this.f55149a;
    }

    public final String h() {
        return this.f55158j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((getType().hashCode() * 31) + this.f55150b.hashCode()) * 31) + this.f55151c.hashCode()) * 31) + this.f55152d.hashCode()) * 31) + this.f55153e.hashCode()) * 31) + this.f55154f.hashCode()) * 31;
        boolean z10 = this.f55155g;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        Drawable drawable = this.f55156h;
        int hashCode2 = (((((((((i11 + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.f55157i.hashCode()) * 31) + this.f55158j.hashCode()) * 31) + Float.hashCode(this.f55159k)) * 31) + this.f55160l.hashCode()) * 31;
        boolean z11 = this.f55161m;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int hashCode3 = (((((((((((hashCode2 + i12) * 31) + Integer.hashCode(this.f55162n)) * 31) + Integer.hashCode(this.f55163o)) * 31) + Integer.hashCode(this.f55164p)) * 31) + Integer.hashCode(this.f55165q)) * 31) + Integer.hashCode(this.f55166r)) * 31;
        boolean z12 = this.f55167s;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int hashCode4 = (((((hashCode3 + i13) * 31) + Integer.hashCode(this.f55168t)) * 31) + Integer.hashCode(this.f55169u)) * 31;
        Drawable drawable2 = this.f55170v;
        int hashCode5 = (hashCode4 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        boolean z13 = this.f55171w;
        int i14 = z13;
        if (z13 != 0) {
            i14 = 1;
        }
        int i15 = (hashCode5 + i14) * 31;
        boolean z14 = this.f55172x;
        return i15 + (z14 ? 1 : z14 ? 1 : 0);
    }

    public final int i() {
        return this.f55162n;
    }

    public final String j() {
        return this.f55160l;
    }

    public final int k() {
        return this.f55163o;
    }

    public final String l() {
        return this.f55152d;
    }

    public final Drawable m() {
        return this.f55156h;
    }

    public final String n() {
        return this.f55157i;
    }

    public final String o() {
        return this.f55150b;
    }

    public final String p() {
        return this.f55151c;
    }

    public final int q() {
        return this.f55169u;
    }

    public final int r() {
        return this.f55168t;
    }

    public final Drawable s() {
        return this.f55170v;
    }

    public final boolean t() {
        return this.f55155g;
    }

    public String toString() {
        return "ShooterCandidateViewerBindModel(type=" + getType() + ", userId=" + this.f55150b + ", userName=" + this.f55151c + ", profileImageUrl=" + this.f55152d + ", continuousStreamerLabelImageUrl=" + this.f55153e + ", continuousStreamerBadgeImageUrl=" + this.f55154f + ", isVisibleContinuousStreamerLabel=" + this.f55155g + ", ratingIconImageDrawable=" + this.f55156h + ", ratingText=" + this.f55157i + ", nextRewardImageUrl=" + this.f55158j + ", nextRewardGaugeProgress=" + this.f55159k + ", nextRewardRemainingPointText=" + this.f55160l + ", isCompleted=" + this.f55161m + ", nextRewardIsCompletedViewVisibility=" + this.f55162n + ", nextRewardViewVisibility=" + this.f55163o + ", inviteButtonLabelTextResInt=" + this.f55164p + ", inviteButtonBackgroundColorResInt=" + this.f55165q + ", inviteButtonTextColorResInt=" + this.f55166r + ", didNotRespond=" + this.f55167s + ", victoryLevel=" + this.f55168t + ", victoryCount=" + this.f55169u + ", VictoryLevelImageDrawable=" + this.f55170v + ", isVisibleVictoryLevelImage=" + this.f55171w + ", isVisibleMatchingViewerImageView=" + this.f55172x + ')';
    }

    public final boolean u() {
        return this.f55172x;
    }

    public final boolean v() {
        return this.f55171w;
    }

    public /* synthetic */ l3(j3.a aVar, String str, String str2, String str3, String str4, String str5, boolean z10, Drawable drawable, String str6, String str7, float f10, String str8, boolean z11, int i10, int i11, int i12, int i13, int i14, boolean z12, int i15, int i16, Drawable drawable2, boolean z13, boolean z14, int i17, jo.h hVar) {
        this((i17 & 1) != 0 ? j3.a.VIEWER : aVar, str, str2, (i17 & 8) != 0 ? "" : str3, (i17 & 16) != 0 ? "" : str4, (i17 & 32) != 0 ? "" : str5, z10, drawable, str6, (i17 & 512) != 0 ? "" : str7, f10, str8, z11, i10, i11, i12, i13, i14, z12, i15, i16, drawable2, z13, z14);
    }
}
