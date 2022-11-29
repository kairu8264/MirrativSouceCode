package ud;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.ThumbnailFrame;
import com.dena.mirrorman.net.api.response.live.ViewHistoryParams;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import java.util.List;
import ud.a;

/* loaded from: classes2.dex */
public final class b5 implements ud.a {

    /* renamed from: c0  reason: collision with root package name */
    public static final a f54796c0 = new a(null);

    /* renamed from: d0  reason: collision with root package name */
    public static final int f54797d0 = 8;
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final jf.y E;
    public final long F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final String N;
    public final int O;
    public final int P;
    public final int Q;
    public final String R;
    public final String S;
    public final String T;
    public final String U;
    public final String V;
    public final int W;
    public final int X;
    public final int Y;
    public final int Z;

    /* renamed from: a0  reason: collision with root package name */
    public final String f54798a0;

    /* renamed from: b0  reason: collision with root package name */
    public final a.EnumC0862a f54799b0;

    /* renamed from: w  reason: collision with root package name */
    public final String f54800w;

    /* renamed from: x  reason: collision with root package name */
    public final SpannableString f54801x;

    /* renamed from: y  reason: collision with root package name */
    public final int f54802y;

    /* renamed from: z  reason: collision with root package name */
    public final String f54803z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b5 a(Context context, ViewHistoryParams viewHistoryParams) {
            jo.p.h(context, "context");
            jo.p.h(viewHistoryParams, MRLog.TARGET_TYPE_LIVE);
            boolean z10 = viewHistoryParams.isLive() || viewHistoryParams.isArchive();
            String liveId = viewHistoryParams.getLiveId();
            String title = viewHistoryParams.getTitle();
            if (title == null) {
                title = "";
            }
            SpannableString b10 = b(context, title, false);
            int d10 = c3.a.d(context, nd.w0.f42240r0);
            String image_url = viewHistoryParams.getImage_url();
            String profileImageUrl = viewHistoryParams.getOwner().getProfileImageUrl();
            String userId = viewHistoryParams.getOwner().getUserId();
            String name = viewHistoryParams.getOwner().getName();
            List<String> appIconUrls = viewHistoryParams.getAppIconUrls();
            if (appIconUrls == null) {
                appIconUrls = xn.s.k();
            }
            String str = (String) xn.a0.Z(appIconUrls);
            jf.y a10 = jf.y.f38026d.a(viewHistoryParams);
            long viewingTime = viewHistoryParams.getViewingTime();
            boolean z11 = viewHistoryParams.isLive() && viewHistoryParams.getCollabUserProfileImageUrls().isEmpty();
            boolean z12 = !z10;
            boolean z13 = viewHistoryParams.isLive() && (viewHistoryParams.getCollabUserProfileImageUrls().isEmpty() ^ true);
            boolean isFollow = viewHistoryParams.isFollow();
            boolean z14 = !viewHistoryParams.isArchive();
            String f10 = of.c.f45387a.f(context, System.currentTimeMillis(), viewHistoryParams.getStartedAt() * 1000);
            int appNum = viewHistoryParams.getAppNum();
            int totalViewerNum = viewHistoryParams.getTotalViewerNum();
            int giftPoint = viewHistoryParams.getGiftPoint();
            ThumbnailFrame thumbnailFrame = viewHistoryParams.getThumbnailFrame();
            String leftThumbnailImageUrl = thumbnailFrame != null ? thumbnailFrame.getLeftThumbnailImageUrl() : null;
            ThumbnailFrame thumbnailFrame2 = viewHistoryParams.getThumbnailFrame();
            String rightThumbnailImageUrl = thumbnailFrame2 != null ? thumbnailFrame2.getRightThumbnailImageUrl() : null;
            ThumbnailFrame thumbnailFrame3 = viewHistoryParams.getThumbnailFrame();
            String rightThumbnailAnimationUrl = thumbnailFrame3 != null ? thumbnailFrame3.getRightThumbnailAnimationUrl() : null;
            UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) xn.a0.a0(viewHistoryParams.getOwner().getBadges(), 0);
            String imageUrl = userBadgeImageUrl != null ? userBadgeImageUrl.getImageUrl() : null;
            String userLabelImageUrl = viewHistoryParams.getUserLabelImageUrl();
            String str2 = userLabelImageUrl.length() > 0 ? userLabelImageUrl : null;
            int i10 = viewHistoryParams.isFollow() ? nd.w0.f42242u0 : nd.w0.U0;
            int i11 = viewHistoryParams.isFollow() ? nd.w0.U0 : nd.w0.f42242u0;
            int i12 = nd.w0.f42242u0;
            String string = context.getString(viewHistoryParams.isFollow() ? nd.f1.text_status_following : nd.f1.f41967d2);
            int i13 = viewHistoryParams.isFollow() ? nd.w0.U0 : i12;
            jo.p.g(string, "if (live.isFollow) conte…ing(R.string.text_follow)");
            return new b5(liveId, b10, d10, image_url, profileImageUrl, userId, name, str, a10, viewingTime, z11, z12, z10, z13, z10, isFollow, z14, f10, appNum, totalViewerNum, giftPoint, leftThumbnailImageUrl, rightThumbnailImageUrl, rightThumbnailAnimationUrl, imageUrl, str2, i10, i11, i13, i12, string, null, Integer.MIN_VALUE, null);
        }

        public final SpannableString b(Context context, String str, boolean z10) {
            if (z10) {
                String string = context.getString(nd.f1.hidden_live_title_prefix);
                jo.p.g(string, "context.getString(R.stri…hidden_live_title_prefix)");
                SpannableString spannableString = new SpannableString(string + ' ' + str);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#32a7df")), 0, string.length(), 33);
                return spannableString;
            }
            return new SpannableString(str);
        }
    }

    public b5(String str, SpannableString spannableString, int i10, String str2, String str3, String str4, String str5, String str6, jf.y yVar, long j10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str7, int i11, int i12, int i13, String str8, String str9, String str10, String str11, String str12, int i14, int i15, int i16, int i17, String str13, a.EnumC0862a enumC0862a) {
        jo.p.h(str, "liveId");
        jo.p.h(spannableString, "liveTitle");
        jo.p.h(str2, "previewImageUrl");
        jo.p.h(str3, "profileImageUrl");
        jo.p.h(str4, "userId");
        jo.p.h(str5, "userName");
        jo.p.h(yVar, "liveTime");
        jo.p.h(str13, "followButtonText");
        jo.p.h(enumC0862a, "type");
        this.f54800w = str;
        this.f54801x = spannableString;
        this.f54802y = i10;
        this.f54803z = str2;
        this.A = str3;
        this.B = str4;
        this.C = str5;
        this.D = str6;
        this.E = yVar;
        this.F = j10;
        this.G = z10;
        this.H = z11;
        this.I = z12;
        this.J = z13;
        this.K = z14;
        this.L = z15;
        this.M = z16;
        this.N = str7;
        this.O = i11;
        this.P = i12;
        this.Q = i13;
        this.R = str8;
        this.S = str9;
        this.T = str10;
        this.U = str11;
        this.V = str12;
        this.W = i14;
        this.X = i15;
        this.Y = i16;
        this.Z = i17;
        this.f54798a0 = str13;
        this.f54799b0 = enumC0862a;
    }

    public final boolean A() {
        return this.J;
    }

    public final boolean B() {
        return this.H;
    }

    public final boolean C() {
        return this.G;
    }

    public final boolean D() {
        return this.I;
    }

    public final boolean E() {
        return this.M;
    }

    public final String a() {
        return this.D;
    }

    public final String b() {
        return this.U;
    }

    public final String c() {
        return this.V;
    }

    public final int d() {
        return this.W;
    }

    public final int e() {
        return this.Z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b5) {
            b5 b5Var = (b5) obj;
            return jo.p.c(this.f54800w, b5Var.f54800w) && jo.p.c(this.f54801x, b5Var.f54801x) && this.f54802y == b5Var.f54802y && jo.p.c(this.f54803z, b5Var.f54803z) && jo.p.c(this.A, b5Var.A) && jo.p.c(this.B, b5Var.B) && jo.p.c(this.C, b5Var.C) && jo.p.c(this.D, b5Var.D) && jo.p.c(this.E, b5Var.E) && this.F == b5Var.F && this.G == b5Var.G && this.H == b5Var.H && this.I == b5Var.I && this.J == b5Var.J && this.K == b5Var.K && this.L == b5Var.L && this.M == b5Var.M && jo.p.c(this.N, b5Var.N) && this.O == b5Var.O && this.P == b5Var.P && this.Q == b5Var.Q && jo.p.c(this.R, b5Var.R) && jo.p.c(this.S, b5Var.S) && jo.p.c(this.T, b5Var.T) && jo.p.c(this.U, b5Var.U) && jo.p.c(this.V, b5Var.V) && this.W == b5Var.W && this.X == b5Var.X && this.Y == b5Var.Y && this.Z == b5Var.Z && jo.p.c(this.f54798a0, b5Var.f54798a0) && getType() == b5Var.getType();
        }
        return false;
    }

    public final int f() {
        return this.X;
    }

    public final String g() {
        return this.f54798a0;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54799b0;
    }

    public final int h() {
        return this.Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((this.f54800w.hashCode() * 31) + this.f54801x.hashCode()) * 31) + Integer.hashCode(this.f54802y)) * 31) + this.f54803z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31;
        String str = this.D;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.E.hashCode()) * 31) + Long.hashCode(this.F)) * 31;
        boolean z10 = this.G;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z11 = this.H;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.I;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.J;
        int i16 = z13;
        if (z13 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z14 = this.K;
        int i18 = z14;
        if (z14 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z15 = this.L;
        int i20 = z15;
        if (z15 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        boolean z16 = this.M;
        int i22 = (i21 + (z16 ? 1 : z16 ? 1 : 0)) * 31;
        String str2 = this.N;
        int hashCode3 = (((((((i22 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.O)) * 31) + Integer.hashCode(this.P)) * 31) + Integer.hashCode(this.Q)) * 31;
        String str3 = this.R;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.S;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.T;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.U;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.V;
        return ((((((((((((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + Integer.hashCode(this.W)) * 31) + Integer.hashCode(this.X)) * 31) + Integer.hashCode(this.Y)) * 31) + Integer.hashCode(this.Z)) * 31) + this.f54798a0.hashCode()) * 31) + getType().hashCode();
    }

    public final int i() {
        return this.O;
    }

    public final String j() {
        return this.f54800w;
    }

    public final String k() {
        return this.N;
    }

    public final jf.y l() {
        return this.E;
    }

    public final SpannableString m() {
        return this.f54801x;
    }

    public final int n() {
        return this.f54802y;
    }

    public final String o() {
        return this.f54803z;
    }

    public final String p() {
        return this.A;
    }

    public final int q() {
        return this.Q;
    }

    public final String r() {
        return this.R;
    }

    public final String s() {
        return this.T;
    }

    public final String t() {
        return this.S;
    }

    public String toString() {
        return "ViewHistoryBindModel(liveId=" + this.f54800w + ", liveTitle=" + ((Object) this.f54801x) + ", liveTitleColor=" + this.f54802y + ", previewImageUrl=" + this.f54803z + ", profileImageUrl=" + this.A + ", userId=" + this.B + ", userName=" + this.C + ", appImageUrl=" + this.D + ", liveTime=" + this.E + ", viewingTime=" + this.F + ", isVisibleLiveBadge=" + this.G + ", isVisibleExpiredLiveOverlayView=" + this.H + ", isVisibleLiveTime=" + this.I + ", isVisibleCollabLive=" + this.J + ", isClickableItem=" + this.K + ", isFollowing=" + this.L + ", isVisibleViewingTime=" + this.M + ", liveStartTimeString=" + this.N + ", liveAppCount=" + this.O + ", totalViewerCount=" + this.P + ", sentGiftPoint=" + this.Q + ", thumbnailLeftTopImageUrl=" + this.R + ", thumbnailRightBottomImageUrl=" + this.S + ", thumbnailRightBottomAnimationImageUrl=" + this.T + ", continuousStreamerBadgeImageUrl=" + this.U + ", continuousStreamerLabelImageUrl=" + this.V + ", followButtonBackgroundColorResId=" + this.W + ", followButtonRippleOverlayColorResId=" + this.X + ", followButtonTitleColorResId=" + this.Y + ", followButtonBorderColorResId=" + this.Z + ", followButtonText=" + this.f54798a0 + ", type=" + getType() + ')';
    }

    public final int u() {
        return this.P;
    }

    public final String v() {
        return this.B;
    }

    public final String w() {
        return this.C;
    }

    public final long x() {
        return this.F;
    }

    public final boolean y() {
        return this.K;
    }

    public final boolean z() {
        return this.L;
    }

    public /* synthetic */ b5(String str, SpannableString spannableString, int i10, String str2, String str3, String str4, String str5, String str6, jf.y yVar, long j10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str7, int i11, int i12, int i13, String str8, String str9, String str10, String str11, String str12, int i14, int i15, int i16, int i17, String str13, a.EnumC0862a enumC0862a, int i18, jo.h hVar) {
        this(str, spannableString, i10, str2, str3, str4, str5, str6, yVar, j10, z10, z11, z12, z13, z14, z15, z16, str7, i11, i12, i13, str8, str9, str10, (i18 & 16777216) != 0 ? null : str11, (i18 & 33554432) != 0 ? null : str12, (i18 & 67108864) != 0 ? nd.w0.f42242u0 : i14, (i18 & 134217728) != 0 ? nd.w0.U0 : i15, (i18 & 268435456) != 0 ? nd.w0.U0 : i16, (i18 & 536870912) != 0 ? nd.w0.f42242u0 : i17, (i18 & 1073741824) != 0 ? "" : str13, (i18 & Integer.MIN_VALUE) != 0 ? a.EnumC0862a.VIEW_HISTORY : enumC0862a);
    }
}
