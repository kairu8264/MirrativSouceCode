package ud;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.dena.mirrorman.net.api.response.event.ShooterMemberStatus;
import com.dena.mirrorman.net.api.response.event.ShooterRatingClass;
import com.dena.mirrorman.net.api.response.event.ShooterViewingUser;

/* loaded from: classes2.dex */
public final class p3 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f55333j = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public static final int f55334k = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f55335a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55336b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f55337c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f55338d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f55339e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f55340f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f55341g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f55342h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55343i;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p3 a(Context context, ShooterViewingUser shooterViewingUser, ShooterMemberStatus shooterMemberStatus) {
            jo.p.h(context, "context");
            jo.p.h(shooterViewingUser, "viewingUser");
            jo.p.h(shooterMemberStatus, "status");
            String userId = shooterViewingUser.getUserId();
            String iconUrl = shooterViewingUser.getIconUrl();
            ShooterMemberStatus shooterMemberStatus2 = ShooterMemberStatus.INVITING;
            ShooterMemberStatus shooterMemberStatus3 = ShooterMemberStatus.INVITED;
            boolean contains = xn.s.m(shooterMemberStatus2, shooterMemberStatus3).contains(shooterMemberStatus);
            boolean contains2 = xn.s.m(shooterMemberStatus2, shooterMemberStatus3, ShooterMemberStatus.APPROVED).contains(shooterMemberStatus);
            boolean z10 = !xn.s.m(shooterMemberStatus2, shooterMemberStatus3).contains(shooterMemberStatus);
            String valueOf = String.valueOf(shooterViewingUser.getRatingPoint());
            ShooterRatingClass ratingClass = shooterViewingUser.getRatingClass();
            return new p3(userId, iconUrl, true, false, contains, contains2, z10, d(context, ratingClass != null ? ratingClass.getIconType() : 0), valueOf);
        }

        public final p3 b() {
            return new p3("", "", false, true, false, false, false, null, "");
        }

        public final p3 c(Context context, String str, String str2, int i10, int i11) {
            jo.p.h(context, "context");
            jo.p.h(str, "userId");
            jo.p.h(str2, "profileImageUrl");
            return new p3(str, str2, true, false, false, false, true, d(context, i11), String.valueOf(i10));
        }

        public final Drawable d(Context context, int i10) {
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
    }

    public p3(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Drawable drawable, String str3) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "profileImageUrl");
        jo.p.h(str3, "ratingText");
        this.f55335a = str;
        this.f55336b = str2;
        this.f55337c = z10;
        this.f55338d = z11;
        this.f55339e = z12;
        this.f55340f = z13;
        this.f55341g = z14;
        this.f55342h = drawable;
        this.f55343i = str3;
    }

    public final String a() {
        return this.f55336b;
    }

    public final Drawable b() {
        return this.f55342h;
    }

    public final String c() {
        return this.f55343i;
    }

    public final String d() {
        return this.f55335a;
    }

    public final boolean e() {
        return this.f55339e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p3) {
            p3 p3Var = (p3) obj;
            return jo.p.c(this.f55335a, p3Var.f55335a) && jo.p.c(this.f55336b, p3Var.f55336b) && this.f55337c == p3Var.f55337c && this.f55338d == p3Var.f55338d && this.f55339e == p3Var.f55339e && this.f55340f == p3Var.f55340f && this.f55341g == p3Var.f55341g && jo.p.c(this.f55342h, p3Var.f55342h) && jo.p.c(this.f55343i, p3Var.f55343i);
        }
        return false;
    }

    public final boolean f() {
        return this.f55338d;
    }

    public final boolean g() {
        return this.f55337c;
    }

    public final boolean h() {
        return this.f55341g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f55335a.hashCode() * 31) + this.f55336b.hashCode()) * 31;
        boolean z10 = this.f55337c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f55338d;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f55339e;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.f55340f;
        int i16 = z13;
        if (z13 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z14 = this.f55341g;
        int i18 = (i17 + (z14 ? 1 : z14 ? 1 : 0)) * 31;
        Drawable drawable = this.f55342h;
        return ((i18 + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.f55343i.hashCode();
    }

    public final boolean i() {
        return this.f55340f;
    }

    public String toString() {
        return "ShooterInvitedViewerBindModel(userId=" + this.f55335a + ", profileImageUrl=" + this.f55336b + ", isVisibleProfileImageView=" + this.f55337c + ", isVisibleProfileImagePlaceHolder=" + this.f55338d + ", isVisibleLoadingView=" + this.f55339e + ", isVisibleRejectButton=" + this.f55340f + ", isVisibleRating=" + this.f55341g + ", ratingIconImageDrawable=" + this.f55342h + ", ratingText=" + this.f55343i + ')';
    }
}
