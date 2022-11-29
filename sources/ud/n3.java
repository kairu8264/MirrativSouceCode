package ud;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;

/* loaded from: classes2.dex */
public final class n3 {

    /* renamed from: s  reason: collision with root package name */
    public static final a f55246s = new a(null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f55247t = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f55248a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55249b;

    /* renamed from: c  reason: collision with root package name */
    public final String f55250c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55251d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f55252e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55253f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55254g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f55255h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55256i;

    /* renamed from: j  reason: collision with root package name */
    public final int f55257j;

    /* renamed from: k  reason: collision with root package name */
    public final int f55258k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f55259l;

    /* renamed from: m  reason: collision with root package name */
    public final SpannableString f55260m;

    /* renamed from: n  reason: collision with root package name */
    public final SpannableString f55261n;

    /* renamed from: o  reason: collision with root package name */
    public final int f55262o;

    /* renamed from: p  reason: collision with root package name */
    public final int f55263p;

    /* renamed from: q  reason: collision with root package name */
    public final Drawable f55264q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f55265r;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x01fb  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x01fe  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ud.n3 a(android.content.Context r27, com.dena.mirrorman.net.api.response.event.ShooterUserShooterSummary r28, int r29, int r30) {
            /*
                Method dump skipped, instructions count: 553
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ud.n3.a.a(android.content.Context, com.dena.mirrorman.net.api.response.event.ShooterUserShooterSummary, int, int):ud.n3");
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

    public n3(String str, String str2, String str3, String str4, boolean z10, String str5, String str6, Drawable drawable, String str7, int i10, int i11, boolean z11, SpannableString spannableString, SpannableString spannableString2, int i12, int i13, Drawable drawable2, boolean z12) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "profileImageUrl");
        jo.p.h(str3, "badgeImageUrl");
        jo.p.h(str4, "labelImageUrl");
        jo.p.h(str5, "profileNameText");
        jo.p.h(str6, "totalScoreText");
        jo.p.h(str7, "ratingText");
        jo.p.h(spannableString, "totalScoreRankText");
        jo.p.h(spannableString2, "ratingRankText");
        this.f55248a = str;
        this.f55249b = str2;
        this.f55250c = str3;
        this.f55251d = str4;
        this.f55252e = z10;
        this.f55253f = str5;
        this.f55254g = str6;
        this.f55255h = drawable;
        this.f55256i = str7;
        this.f55257j = i10;
        this.f55258k = i11;
        this.f55259l = z11;
        this.f55260m = spannableString;
        this.f55261n = spannableString2;
        this.f55262o = i12;
        this.f55263p = i13;
        this.f55264q = drawable2;
        this.f55265r = z12;
    }

    public final String a() {
        return this.f55250c;
    }

    public final String b() {
        return this.f55251d;
    }

    public final boolean c() {
        return this.f55252e;
    }

    public final String d() {
        return this.f55249b;
    }

    public final String e() {
        return this.f55253f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n3) {
            n3 n3Var = (n3) obj;
            return jo.p.c(this.f55248a, n3Var.f55248a) && jo.p.c(this.f55249b, n3Var.f55249b) && jo.p.c(this.f55250c, n3Var.f55250c) && jo.p.c(this.f55251d, n3Var.f55251d) && this.f55252e == n3Var.f55252e && jo.p.c(this.f55253f, n3Var.f55253f) && jo.p.c(this.f55254g, n3Var.f55254g) && jo.p.c(this.f55255h, n3Var.f55255h) && jo.p.c(this.f55256i, n3Var.f55256i) && this.f55257j == n3Var.f55257j && this.f55258k == n3Var.f55258k && this.f55259l == n3Var.f55259l && jo.p.c(this.f55260m, n3Var.f55260m) && jo.p.c(this.f55261n, n3Var.f55261n) && this.f55262o == n3Var.f55262o && this.f55263p == n3Var.f55263p && jo.p.c(this.f55264q, n3Var.f55264q) && this.f55265r == n3Var.f55265r;
        }
        return false;
    }

    public final int f() {
        return this.f55258k;
    }

    public final Drawable g() {
        return this.f55255h;
    }

    public final SpannableString h() {
        return this.f55261n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f55248a.hashCode() * 31) + this.f55249b.hashCode()) * 31) + this.f55250c.hashCode()) * 31) + this.f55251d.hashCode()) * 31;
        boolean z10 = this.f55252e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((hashCode + i10) * 31) + this.f55253f.hashCode()) * 31) + this.f55254g.hashCode()) * 31;
        Drawable drawable = this.f55255h;
        int hashCode3 = (((((((hashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.f55256i.hashCode()) * 31) + Integer.hashCode(this.f55257j)) * 31) + Integer.hashCode(this.f55258k)) * 31;
        boolean z11 = this.f55259l;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int hashCode4 = (((((((((hashCode3 + i11) * 31) + this.f55260m.hashCode()) * 31) + this.f55261n.hashCode()) * 31) + Integer.hashCode(this.f55262o)) * 31) + Integer.hashCode(this.f55263p)) * 31;
        Drawable drawable2 = this.f55264q;
        int hashCode5 = (hashCode4 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        boolean z12 = this.f55265r;
        return hashCode5 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final String i() {
        return this.f55256i;
    }

    public final int j() {
        return this.f55257j;
    }

    public final SpannableString k() {
        return this.f55260m;
    }

    public final String l() {
        return this.f55254g;
    }

    public final String m() {
        return this.f55248a;
    }

    public final int n() {
        return this.f55263p;
    }

    public final int o() {
        return this.f55262o;
    }

    public final Drawable p() {
        return this.f55264q;
    }

    public final boolean q() {
        return this.f55265r;
    }

    public String toString() {
        return "ShooterEventRankingUserSummaryBindModel(userId=" + this.f55248a + ", profileImageUrl=" + this.f55249b + ", badgeImageUrl=" + this.f55250c + ", labelImageUrl=" + this.f55251d + ", labelImageVisibility=" + this.f55252e + ", profileNameText=" + this.f55253f + ", totalScoreText=" + this.f55254g + ", ratingIconImageDrawable=" + this.f55255h + ", ratingText=" + this.f55256i + ", totalScoreColor=" + this.f55257j + ", ratingColor=" + this.f55258k + ", isVisibleProfileRankHeaderText=" + this.f55259l + ", totalScoreRankText=" + ((Object) this.f55260m) + ", ratingRankText=" + ((Object) this.f55261n) + ", victoryLevel=" + this.f55262o + ", victoryCount=" + this.f55263p + ", victoryLevelImageDrawable=" + this.f55264q + ", isVisibleVictoryLevelImage=" + this.f55265r + ')';
    }
}
