package ud;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;

/* loaded from: classes2.dex */
public final class m3 {

    /* renamed from: s  reason: collision with root package name */
    public static final a f55205s = new a(null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f55206t = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f55207a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55208b;

    /* renamed from: c  reason: collision with root package name */
    public final String f55209c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55210d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f55211e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55212f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55213g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f55214h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55215i;

    /* renamed from: j  reason: collision with root package name */
    public final int f55216j;

    /* renamed from: k  reason: collision with root package name */
    public final int f55217k;

    /* renamed from: l  reason: collision with root package name */
    public final int f55218l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f55219m;

    /* renamed from: n  reason: collision with root package name */
    public final SpannableString f55220n;

    /* renamed from: o  reason: collision with root package name */
    public final int f55221o;

    /* renamed from: p  reason: collision with root package name */
    public final int f55222p;

    /* renamed from: q  reason: collision with root package name */
    public final Drawable f55223q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f55224r;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x011d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ud.m3 a(android.content.Context r25, com.dena.mirrorman.net.api.response.event.ShooterUserDetail r26, int r27, int r28) {
            /*
                Method dump skipped, instructions count: 326
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ud.m3.a.a(android.content.Context, com.dena.mirrorman.net.api.response.event.ShooterUserDetail, int, int):ud.m3");
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

    public m3(String str, String str2, String str3, String str4, boolean z10, String str5, String str6, Drawable drawable, String str7, int i10, int i11, int i12, boolean z11, SpannableString spannableString, int i13, int i14, Drawable drawable2, boolean z12) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "profileImageUrl");
        jo.p.h(str3, "badgeImageUrl");
        jo.p.h(str4, "labelImageUrl");
        jo.p.h(str5, "profileNameText");
        jo.p.h(str6, "totalScoreText");
        jo.p.h(str7, "ratingText");
        jo.p.h(spannableString, "rankText");
        this.f55207a = str;
        this.f55208b = str2;
        this.f55209c = str3;
        this.f55210d = str4;
        this.f55211e = z10;
        this.f55212f = str5;
        this.f55213g = str6;
        this.f55214h = drawable;
        this.f55215i = str7;
        this.f55216j = i10;
        this.f55217k = i11;
        this.f55218l = i12;
        this.f55219m = z11;
        this.f55220n = spannableString;
        this.f55221o = i13;
        this.f55222p = i14;
        this.f55223q = drawable2;
        this.f55224r = z12;
    }

    public final String a() {
        return this.f55209c;
    }

    public final String b() {
        return this.f55210d;
    }

    public final boolean c() {
        return this.f55211e;
    }

    public final String d() {
        return this.f55208b;
    }

    public final String e() {
        return this.f55212f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m3) {
            m3 m3Var = (m3) obj;
            return jo.p.c(this.f55207a, m3Var.f55207a) && jo.p.c(this.f55208b, m3Var.f55208b) && jo.p.c(this.f55209c, m3Var.f55209c) && jo.p.c(this.f55210d, m3Var.f55210d) && this.f55211e == m3Var.f55211e && jo.p.c(this.f55212f, m3Var.f55212f) && jo.p.c(this.f55213g, m3Var.f55213g) && jo.p.c(this.f55214h, m3Var.f55214h) && jo.p.c(this.f55215i, m3Var.f55215i) && this.f55216j == m3Var.f55216j && this.f55217k == m3Var.f55217k && this.f55218l == m3Var.f55218l && this.f55219m == m3Var.f55219m && jo.p.c(this.f55220n, m3Var.f55220n) && this.f55221o == m3Var.f55221o && this.f55222p == m3Var.f55222p && jo.p.c(this.f55223q, m3Var.f55223q) && this.f55224r == m3Var.f55224r;
        }
        return false;
    }

    public final int f() {
        return this.f55218l;
    }

    public final SpannableString g() {
        return this.f55220n;
    }

    public final int h() {
        return this.f55217k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f55207a.hashCode() * 31) + this.f55208b.hashCode()) * 31) + this.f55209c.hashCode()) * 31) + this.f55210d.hashCode()) * 31;
        boolean z10 = this.f55211e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((hashCode + i10) * 31) + this.f55212f.hashCode()) * 31) + this.f55213g.hashCode()) * 31;
        Drawable drawable = this.f55214h;
        int hashCode3 = (((((((((hashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.f55215i.hashCode()) * 31) + Integer.hashCode(this.f55216j)) * 31) + Integer.hashCode(this.f55217k)) * 31) + Integer.hashCode(this.f55218l)) * 31;
        boolean z11 = this.f55219m;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int hashCode4 = (((((((hashCode3 + i11) * 31) + this.f55220n.hashCode()) * 31) + Integer.hashCode(this.f55221o)) * 31) + Integer.hashCode(this.f55222p)) * 31;
        Drawable drawable2 = this.f55223q;
        int hashCode5 = (hashCode4 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        boolean z12 = this.f55224r;
        return hashCode5 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final Drawable i() {
        return this.f55214h;
    }

    public final String j() {
        return this.f55215i;
    }

    public final int k() {
        return this.f55216j;
    }

    public final String l() {
        return this.f55213g;
    }

    public final String m() {
        return this.f55207a;
    }

    public final int n() {
        return this.f55222p;
    }

    public final int o() {
        return this.f55221o;
    }

    public final Drawable p() {
        return this.f55223q;
    }

    public final boolean q() {
        return this.f55219m;
    }

    public final boolean r() {
        return this.f55224r;
    }

    public String toString() {
        return "ShooterEventRankingInfoBindModel(userId=" + this.f55207a + ", profileImageUrl=" + this.f55208b + ", badgeImageUrl=" + this.f55209c + ", labelImageUrl=" + this.f55210d + ", labelImageVisibility=" + this.f55211e + ", profileNameText=" + this.f55212f + ", totalScoreText=" + this.f55213g + ", ratingIconImageDrawable=" + this.f55214h + ", ratingText=" + this.f55215i + ", totalScoreColor=" + this.f55216j + ", ratingColor=" + this.f55217k + ", rankHighlightColor=" + this.f55218l + ", isVisibleProfileRankHeaderText=" + this.f55219m + ", rankText=" + ((Object) this.f55220n) + ", victoryLevel=" + this.f55221o + ", victoryCount=" + this.f55222p + ", victoryLevelImageDrawable=" + this.f55223q + ", isVisibleVictoryLevelImage=" + this.f55224r + ')';
    }
}
