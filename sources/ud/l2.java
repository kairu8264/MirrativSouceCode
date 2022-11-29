package ud;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import com.dena.mirrorman.net.api.response.user.UserLink;
import com.dena.mirrorman.net.api.response.user.UserMe;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class l2 {
    public final androidx.lifecycle.e0<Boolean> A;
    public final androidx.lifecycle.e0<Boolean> B;
    public final androidx.lifecycle.e0<Boolean> C;
    public final androidx.lifecycle.e0<Boolean> D;
    public final androidx.lifecycle.e0<Boolean> E;
    public final androidx.lifecycle.e0<Boolean> F;
    public final androidx.lifecycle.e0<Boolean> G;
    public final androidx.lifecycle.e0<Boolean> H;
    public final androidx.lifecycle.e0<Boolean> I;
    public final androidx.lifecycle.e0<Boolean> J;
    public final androidx.lifecycle.e0<Boolean> K;
    public final androidx.lifecycle.e0<Boolean> L;
    public final androidx.lifecycle.e0<Boolean> M;
    public final androidx.lifecycle.e0<String> N;
    public final androidx.lifecycle.e0<Integer> O;
    public final androidx.lifecycle.e0<Integer> P;
    public final androidx.lifecycle.e0<int[]> Q;
    public final androidx.lifecycle.e0<String> R;
    public final androidx.lifecycle.e0<String> S;
    public final androidx.lifecycle.e0<Float> T;
    public boolean U;

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55121a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55122b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55123c;

    /* renamed from: d  reason: collision with root package name */
    public final int f55124d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55125e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55126f;

    /* renamed from: g  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55127g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55128h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55129i;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55130j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.lifecycle.e0<Bitmap> f55131k;

    /* renamed from: l  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55132l;

    /* renamed from: m  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55133m;

    /* renamed from: n  reason: collision with root package name */
    public final androidx.lifecycle.e0<Long> f55134n;

    /* renamed from: o  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55135o;

    /* renamed from: p  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<String>> f55136p;

    /* renamed from: q  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<EventBannerResponse>> f55137q;

    /* renamed from: r  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55138r;

    /* renamed from: s  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55139s;

    /* renamed from: t  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55140t;

    /* renamed from: u  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55141u;

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55142v;

    /* renamed from: w  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55143w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55144x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55145y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55146z;

    public l2() {
        this(null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1, 32767, null);
    }

    public l2(androidx.lifecycle.e0<String> e0Var, androidx.lifecycle.e0<String> e0Var2, androidx.lifecycle.e0<String> e0Var3, int i10, androidx.lifecycle.e0<String> e0Var4, androidx.lifecycle.e0<String> e0Var5, androidx.lifecycle.e0<String> e0Var6, androidx.lifecycle.e0<Boolean> e0Var7, androidx.lifecycle.e0<Integer> e0Var8, androidx.lifecycle.e0<Integer> e0Var9, androidx.lifecycle.e0<Bitmap> e0Var10, androidx.lifecycle.e0<Integer> e0Var11, androidx.lifecycle.e0<String> e0Var12, androidx.lifecycle.e0<Long> e0Var13, androidx.lifecycle.e0<Integer> e0Var14, androidx.lifecycle.e0<List<String>> e0Var15, androidx.lifecycle.e0<List<EventBannerResponse>> e0Var16, androidx.lifecycle.e0<Integer> e0Var17, androidx.lifecycle.e0<String> e0Var18, androidx.lifecycle.e0<Boolean> e0Var19, androidx.lifecycle.e0<Boolean> e0Var20, androidx.lifecycle.e0<Boolean> e0Var21, androidx.lifecycle.e0<Boolean> e0Var22, androidx.lifecycle.e0<Boolean> e0Var23, androidx.lifecycle.e0<Boolean> e0Var24, androidx.lifecycle.e0<Boolean> e0Var25, androidx.lifecycle.e0<Boolean> e0Var26, androidx.lifecycle.e0<Boolean> e0Var27, androidx.lifecycle.e0<Boolean> e0Var28, androidx.lifecycle.e0<Boolean> e0Var29, androidx.lifecycle.e0<Boolean> e0Var30, androidx.lifecycle.e0<Boolean> e0Var31, androidx.lifecycle.e0<Boolean> e0Var32, androidx.lifecycle.e0<Boolean> e0Var33, androidx.lifecycle.e0<Boolean> e0Var34, androidx.lifecycle.e0<Boolean> e0Var35, androidx.lifecycle.e0<Boolean> e0Var36, androidx.lifecycle.e0<Boolean> e0Var37, androidx.lifecycle.e0<Boolean> e0Var38, androidx.lifecycle.e0<String> e0Var39, androidx.lifecycle.e0<Integer> e0Var40, androidx.lifecycle.e0<Integer> e0Var41, androidx.lifecycle.e0<int[]> e0Var42, androidx.lifecycle.e0<String> e0Var43, androidx.lifecycle.e0<String> e0Var44, androidx.lifecycle.e0<Float> e0Var45, boolean z10) {
        jo.p.h(e0Var, "userName");
        jo.p.h(e0Var2, "userId");
        jo.p.h(e0Var3, "bio");
        jo.p.h(e0Var4, "profileImageUrl");
        jo.p.h(e0Var5, "continuousBadgeImageUrl");
        jo.p.h(e0Var6, "ribbonImageUrl");
        jo.p.h(e0Var7, "isVisibleRibbon");
        jo.p.h(e0Var8, "followCount");
        jo.p.h(e0Var9, "followerCount");
        jo.p.h(e0Var10, "avatarBackgroundImage");
        jo.p.h(e0Var11, "totalViewerCount");
        jo.p.h(e0Var12, "link");
        jo.p.h(e0Var13, "registeredAt");
        jo.p.h(e0Var14, "numberOfCoins");
        jo.p.h(e0Var15, "ribbons");
        jo.p.h(e0Var16, "eventBanners");
        jo.p.h(e0Var17, "twitterLinkImageResourceId");
        jo.p.h(e0Var18, "birthday");
        jo.p.h(e0Var19, "isLoading");
        jo.p.h(e0Var20, "isVisibleBroadcastRequest");
        jo.p.h(e0Var21, "isVisibleBio");
        jo.p.h(e0Var22, "isVisibleTotalViewerCount");
        jo.p.h(e0Var23, "isVisibleLink");
        jo.p.h(e0Var24, "isVisibleRibbons");
        jo.p.h(e0Var25, "isVisibleEventBanners");
        jo.p.h(e0Var26, "isVisibleCreateEmomoButton");
        jo.p.h(e0Var27, "isVisibleDressUpButton");
        jo.p.h(e0Var28, "isVisibleDressUpButtonNewBadge");
        jo.p.h(e0Var29, "isVisibleCreateRoomBalloon");
        jo.p.h(e0Var30, "isVisibleCurrency");
        jo.p.h(e0Var31, "isVisibleContinuousStreamBalloon");
        jo.p.h(e0Var32, "isVisibleStreamHolidayBalloon");
        jo.p.h(e0Var33, "isVisibleBeginnerStreamHolidayBalloon");
        jo.p.h(e0Var34, "isVisibleBirthday");
        jo.p.h(e0Var35, "isVisibleBirthdayBalloon");
        jo.p.h(e0Var36, "isVisibleAnniversaryStreamBalloon");
        jo.p.h(e0Var37, "isVisibleAnniversaryFollowBalloon");
        jo.p.h(e0Var38, "isVisibleMyPageContinuousLivePromotionView");
        jo.p.h(e0Var39, "userLevel");
        jo.p.h(e0Var40, "userLevelColor");
        jo.p.h(e0Var41, "userLevelBorderColor");
        jo.p.h(e0Var42, "userLevelGaugeColors");
        jo.p.h(e0Var43, "userLevelImageUrl");
        jo.p.h(e0Var44, "userLevelExPoint");
        jo.p.h(e0Var45, "userLevelExPointProgress");
        this.f55121a = e0Var;
        this.f55122b = e0Var2;
        this.f55123c = e0Var3;
        this.f55124d = i10;
        this.f55125e = e0Var4;
        this.f55126f = e0Var5;
        this.f55127g = e0Var6;
        this.f55128h = e0Var7;
        this.f55129i = e0Var8;
        this.f55130j = e0Var9;
        this.f55131k = e0Var10;
        this.f55132l = e0Var11;
        this.f55133m = e0Var12;
        this.f55134n = e0Var13;
        this.f55135o = e0Var14;
        this.f55136p = e0Var15;
        this.f55137q = e0Var16;
        this.f55138r = e0Var17;
        this.f55139s = e0Var18;
        this.f55140t = e0Var19;
        this.f55141u = e0Var20;
        this.f55142v = e0Var21;
        this.f55143w = e0Var22;
        this.f55144x = e0Var23;
        this.f55145y = e0Var24;
        this.f55146z = e0Var25;
        this.A = e0Var26;
        this.B = e0Var27;
        this.C = e0Var28;
        this.D = e0Var29;
        this.E = e0Var30;
        this.F = e0Var31;
        this.G = e0Var32;
        this.H = e0Var33;
        this.I = e0Var34;
        this.J = e0Var35;
        this.K = e0Var36;
        this.L = e0Var37;
        this.M = e0Var38;
        this.N = e0Var39;
        this.O = e0Var40;
        this.P = e0Var41;
        this.Q = e0Var42;
        this.R = e0Var43;
        this.S = e0Var44;
        this.T = e0Var45;
        this.U = z10;
    }

    public final androidx.lifecycle.e0<Boolean> A() {
        return this.A;
    }

    public final androidx.lifecycle.e0<Boolean> B() {
        return this.D;
    }

    public final androidx.lifecycle.e0<Boolean> C() {
        return this.E;
    }

    public final androidx.lifecycle.e0<Boolean> D() {
        return this.B;
    }

    public final androidx.lifecycle.e0<Boolean> E() {
        return this.C;
    }

    public final androidx.lifecycle.e0<Boolean> F() {
        return this.f55146z;
    }

    public final androidx.lifecycle.e0<Boolean> G() {
        return this.f55144x;
    }

    public final androidx.lifecycle.e0<Boolean> H() {
        return this.M;
    }

    public final androidx.lifecycle.e0<Boolean> I() {
        return this.f55128h;
    }

    public final androidx.lifecycle.e0<Boolean> J() {
        return this.f55145y;
    }

    public final androidx.lifecycle.e0<Boolean> K() {
        return this.G;
    }

    public final androidx.lifecycle.e0<Boolean> L() {
        return this.f55143w;
    }

    public final void M(boolean z10) {
        this.U = z10;
    }

    public final void a(UserMe userMe, String str) {
        Object obj;
        Integer valueOf;
        UserLink userLink;
        jo.p.h(userMe, "userMe");
        jo.p.h(str, "birthdayText");
        this.f55140t.p(Boolean.FALSE);
        this.f55121a.p(userMe.getName());
        this.f55122b.p(userMe.getUserId());
        this.f55125e.p(userMe.getProfileImageUrl());
        this.f55145y.p(Boolean.valueOf(!userMe.getRibbons().isEmpty()));
        androidx.lifecycle.e0<String> e0Var = this.f55126f;
        UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) xn.a0.a0(userMe.getBadges(), 0);
        e0Var.p(userBadgeImageUrl != null ? userBadgeImageUrl.getSmallImageUrl() : null);
        Iterator<T> it = userMe.getRibbons().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((RibbonResponse) obj).isLabel()) {
                break;
            }
        }
        RibbonResponse ribbonResponse = (RibbonResponse) obj;
        String imageUrl = ribbonResponse != null ? ribbonResponse.getImageUrl() : null;
        this.f55127g.p(imageUrl);
        this.f55128h.p(Boolean.valueOf(!(imageUrl == null || imageUrl.length() == 0)));
        this.f55141u.p(Boolean.valueOf(userMe.getLiveRequestNum() > 0));
        this.f55123c.p(userMe.getDescription());
        this.f55142v.p(Boolean.valueOf(userMe.getDescription().length() > 0));
        this.f55130j.p(Integer.valueOf(userMe.getFollowerNum()));
        this.f55132l.p(Integer.valueOf(userMe.getTotalViewerNum()));
        androidx.lifecycle.e0<String> e0Var2 = this.f55133m;
        List<UserLink> links = userMe.getLinks();
        e0Var2.p((links == null || (userLink = (UserLink) xn.a0.Z(links)) == null || (r1 = userLink.getUrl()) == null) ? "" : "");
        androidx.lifecycle.e0<Boolean> e0Var3 = this.f55144x;
        List<UserLink> links2 = userMe.getLinks();
        e0Var3.p(Boolean.valueOf(links2 != null && (links2.isEmpty() ^ true)));
        androidx.lifecycle.e0<Integer> e0Var4 = this.f55138r;
        if (TextUtils.isEmpty(userMe.getTwitterScreenName())) {
            valueOf = Integer.valueOf(nd.y0.ic_twitter_grey);
        } else {
            valueOf = Integer.valueOf(nd.y0.ic_twitter_circle);
        }
        e0Var4.p(valueOf);
        this.f55134n.p(Long.valueOf(userMe.getRegisteredAt()));
        this.f55143w.p(Boolean.valueOf(userMe.getTotalViewerNum() != 0));
        this.f55139s.p(str);
        this.I.p(Boolean.valueOf(userMe.isVisibleBirthday() && !TextUtils.isEmpty(userMe.getBirthday())));
        this.N.p(String.valueOf(userMe.getUserLevel().getLevel()));
        this.O.p(Integer.valueOf(userMe.getUserLevel().getLevelColor()));
        this.P.p(Integer.valueOf(userMe.getUserLevel().getLevelBorderColor()));
        this.Q.p(userMe.getUserLevel().getLevelGaugeColors());
        this.R.p(userMe.getUserLevel().getLevelImageUrl());
        androidx.lifecycle.e0<String> e0Var5 = this.S;
        StringBuilder sb2 = new StringBuilder();
        jo.i0 i0Var = jo.i0.f38149a;
        String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(userMe.getUserLevel().getExPoint())}, 1));
        jo.p.g(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(" / ");
        String format2 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(userMe.getUserLevel().getNextLevelExPoint())}, 1));
        jo.p.g(format2, "format(format, *args)");
        sb2.append(format2);
        e0Var5.p(sb2.toString());
        this.T.p(Float.valueOf(userMe.getUserLevel().getExPointPercentage()));
    }

    public final androidx.lifecycle.e0<Bitmap> b() {
        return this.f55131k;
    }

    public final androidx.lifecycle.e0<String> c() {
        return this.f55123c;
    }

    public final androidx.lifecycle.e0<String> d() {
        return this.f55139s;
    }

    public final androidx.lifecycle.e0<String> e() {
        return this.f55126f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l2) {
            l2 l2Var = (l2) obj;
            return jo.p.c(this.f55121a, l2Var.f55121a) && jo.p.c(this.f55122b, l2Var.f55122b) && jo.p.c(this.f55123c, l2Var.f55123c) && this.f55124d == l2Var.f55124d && jo.p.c(this.f55125e, l2Var.f55125e) && jo.p.c(this.f55126f, l2Var.f55126f) && jo.p.c(this.f55127g, l2Var.f55127g) && jo.p.c(this.f55128h, l2Var.f55128h) && jo.p.c(this.f55129i, l2Var.f55129i) && jo.p.c(this.f55130j, l2Var.f55130j) && jo.p.c(this.f55131k, l2Var.f55131k) && jo.p.c(this.f55132l, l2Var.f55132l) && jo.p.c(this.f55133m, l2Var.f55133m) && jo.p.c(this.f55134n, l2Var.f55134n) && jo.p.c(this.f55135o, l2Var.f55135o) && jo.p.c(this.f55136p, l2Var.f55136p) && jo.p.c(this.f55137q, l2Var.f55137q) && jo.p.c(this.f55138r, l2Var.f55138r) && jo.p.c(this.f55139s, l2Var.f55139s) && jo.p.c(this.f55140t, l2Var.f55140t) && jo.p.c(this.f55141u, l2Var.f55141u) && jo.p.c(this.f55142v, l2Var.f55142v) && jo.p.c(this.f55143w, l2Var.f55143w) && jo.p.c(this.f55144x, l2Var.f55144x) && jo.p.c(this.f55145y, l2Var.f55145y) && jo.p.c(this.f55146z, l2Var.f55146z) && jo.p.c(this.A, l2Var.A) && jo.p.c(this.B, l2Var.B) && jo.p.c(this.C, l2Var.C) && jo.p.c(this.D, l2Var.D) && jo.p.c(this.E, l2Var.E) && jo.p.c(this.F, l2Var.F) && jo.p.c(this.G, l2Var.G) && jo.p.c(this.H, l2Var.H) && jo.p.c(this.I, l2Var.I) && jo.p.c(this.J, l2Var.J) && jo.p.c(this.K, l2Var.K) && jo.p.c(this.L, l2Var.L) && jo.p.c(this.M, l2Var.M) && jo.p.c(this.N, l2Var.N) && jo.p.c(this.O, l2Var.O) && jo.p.c(this.P, l2Var.P) && jo.p.c(this.Q, l2Var.Q) && jo.p.c(this.R, l2Var.R) && jo.p.c(this.S, l2Var.S) && jo.p.c(this.T, l2Var.T) && this.U == l2Var.U;
        }
        return false;
    }

    public final androidx.lifecycle.e0<Integer> f() {
        return this.f55129i;
    }

    public final androidx.lifecycle.e0<Integer> g() {
        return this.f55130j;
    }

    public final androidx.lifecycle.e0<String> h() {
        return this.f55133m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f55121a.hashCode() * 31) + this.f55122b.hashCode()) * 31) + this.f55123c.hashCode()) * 31) + Integer.hashCode(this.f55124d)) * 31) + this.f55125e.hashCode()) * 31) + this.f55126f.hashCode()) * 31) + this.f55127g.hashCode()) * 31) + this.f55128h.hashCode()) * 31) + this.f55129i.hashCode()) * 31) + this.f55130j.hashCode()) * 31) + this.f55131k.hashCode()) * 31) + this.f55132l.hashCode()) * 31) + this.f55133m.hashCode()) * 31) + this.f55134n.hashCode()) * 31) + this.f55135o.hashCode()) * 31) + this.f55136p.hashCode()) * 31) + this.f55137q.hashCode()) * 31) + this.f55138r.hashCode()) * 31) + this.f55139s.hashCode()) * 31) + this.f55140t.hashCode()) * 31) + this.f55141u.hashCode()) * 31) + this.f55142v.hashCode()) * 31) + this.f55143w.hashCode()) * 31) + this.f55144x.hashCode()) * 31) + this.f55145y.hashCode()) * 31) + this.f55146z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + this.G.hashCode()) * 31) + this.H.hashCode()) * 31) + this.I.hashCode()) * 31) + this.J.hashCode()) * 31) + this.K.hashCode()) * 31) + this.L.hashCode()) * 31) + this.M.hashCode()) * 31) + this.N.hashCode()) * 31) + this.O.hashCode()) * 31) + this.P.hashCode()) * 31) + this.Q.hashCode()) * 31) + this.R.hashCode()) * 31) + this.S.hashCode()) * 31) + this.T.hashCode()) * 31;
        boolean z10 = this.U;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final int i() {
        return this.f55124d;
    }

    public final androidx.lifecycle.e0<Integer> j() {
        return this.f55135o;
    }

    public final androidx.lifecycle.e0<String> k() {
        return this.f55125e;
    }

    public final androidx.lifecycle.e0<Long> l() {
        return this.f55134n;
    }

    public final androidx.lifecycle.e0<String> m() {
        return this.f55127g;
    }

    public final boolean n() {
        return this.U;
    }

    public final androidx.lifecycle.e0<Integer> o() {
        return this.f55132l;
    }

    public final androidx.lifecycle.e0<Integer> p() {
        return this.f55138r;
    }

    public final androidx.lifecycle.e0<String> q() {
        return this.f55122b;
    }

    public final androidx.lifecycle.e0<String> r() {
        return this.f55121a;
    }

    public final androidx.lifecycle.e0<Boolean> s() {
        return this.f55140t;
    }

    public final androidx.lifecycle.e0<Boolean> t() {
        return this.L;
    }

    public String toString() {
        return "MyPageBindModel(userName=" + this.f55121a + ", userId=" + this.f55122b + ", bio=" + this.f55123c + ", maxLinesBio=" + this.f55124d + ", profileImageUrl=" + this.f55125e + ", continuousBadgeImageUrl=" + this.f55126f + ", ribbonImageUrl=" + this.f55127g + ", isVisibleRibbon=" + this.f55128h + ", followCount=" + this.f55129i + ", followerCount=" + this.f55130j + ", avatarBackgroundImage=" + this.f55131k + ", totalViewerCount=" + this.f55132l + ", link=" + this.f55133m + ", registeredAt=" + this.f55134n + ", numberOfCoins=" + this.f55135o + ", ribbons=" + this.f55136p + ", eventBanners=" + this.f55137q + ", twitterLinkImageResourceId=" + this.f55138r + ", birthday=" + this.f55139s + ", isLoading=" + this.f55140t + ", isVisibleBroadcastRequest=" + this.f55141u + ", isVisibleBio=" + this.f55142v + ", isVisibleTotalViewerCount=" + this.f55143w + ", isVisibleLink=" + this.f55144x + ", isVisibleRibbons=" + this.f55145y + ", isVisibleEventBanners=" + this.f55146z + ", isVisibleCreateEmomoButton=" + this.A + ", isVisibleDressUpButton=" + this.B + ", isVisibleDressUpButtonNewBadge=" + this.C + ", isVisibleCreateRoomBalloon=" + this.D + ", isVisibleCurrency=" + this.E + ", isVisibleContinuousStreamBalloon=" + this.F + ", isVisibleStreamHolidayBalloon=" + this.G + ", isVisibleBeginnerStreamHolidayBalloon=" + this.H + ", isVisibleBirthday=" + this.I + ", isVisibleBirthdayBalloon=" + this.J + ", isVisibleAnniversaryStreamBalloon=" + this.K + ", isVisibleAnniversaryFollowBalloon=" + this.L + ", isVisibleMyPageContinuousLivePromotionView=" + this.M + ", userLevel=" + this.N + ", userLevelColor=" + this.O + ", userLevelBorderColor=" + this.P + ", userLevelGaugeColors=" + this.Q + ", userLevelImageUrl=" + this.R + ", userLevelExPoint=" + this.S + ", userLevelExPointProgress=" + this.T + ", shouldShowContinuousBalloonAutomatically=" + this.U + ')';
    }

    public final androidx.lifecycle.e0<Boolean> u() {
        return this.K;
    }

    public final androidx.lifecycle.e0<Boolean> v() {
        return this.H;
    }

    public final androidx.lifecycle.e0<Boolean> w() {
        return this.f55142v;
    }

    public final androidx.lifecycle.e0<Boolean> x() {
        return this.I;
    }

    public final androidx.lifecycle.e0<Boolean> y() {
        return this.J;
    }

    public final androidx.lifecycle.e0<Boolean> z() {
        return this.F;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ l2(androidx.lifecycle.e0 r48, androidx.lifecycle.e0 r49, androidx.lifecycle.e0 r50, int r51, androidx.lifecycle.e0 r52, androidx.lifecycle.e0 r53, androidx.lifecycle.e0 r54, androidx.lifecycle.e0 r55, androidx.lifecycle.e0 r56, androidx.lifecycle.e0 r57, androidx.lifecycle.e0 r58, androidx.lifecycle.e0 r59, androidx.lifecycle.e0 r60, androidx.lifecycle.e0 r61, androidx.lifecycle.e0 r62, androidx.lifecycle.e0 r63, androidx.lifecycle.e0 r64, androidx.lifecycle.e0 r65, androidx.lifecycle.e0 r66, androidx.lifecycle.e0 r67, androidx.lifecycle.e0 r68, androidx.lifecycle.e0 r69, androidx.lifecycle.e0 r70, androidx.lifecycle.e0 r71, androidx.lifecycle.e0 r72, androidx.lifecycle.e0 r73, androidx.lifecycle.e0 r74, androidx.lifecycle.e0 r75, androidx.lifecycle.e0 r76, androidx.lifecycle.e0 r77, androidx.lifecycle.e0 r78, androidx.lifecycle.e0 r79, androidx.lifecycle.e0 r80, androidx.lifecycle.e0 r81, androidx.lifecycle.e0 r82, androidx.lifecycle.e0 r83, androidx.lifecycle.e0 r84, androidx.lifecycle.e0 r85, androidx.lifecycle.e0 r86, androidx.lifecycle.e0 r87, androidx.lifecycle.e0 r88, androidx.lifecycle.e0 r89, androidx.lifecycle.e0 r90, androidx.lifecycle.e0 r91, androidx.lifecycle.e0 r92, androidx.lifecycle.e0 r93, boolean r94, int r95, int r96, jo.h r97) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.l2.<init>(androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, int, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, boolean, int, int, jo.h):void");
    }
}
