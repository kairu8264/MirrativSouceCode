package md;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import com.dena.mirrorman.net.api.response.user.UserLink;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class i0 {
    public final androidx.lifecycle.e0<Boolean> A;
    public final androidx.lifecycle.e0<Boolean> B;
    public final androidx.lifecycle.e0<Boolean> C;
    public final androidx.lifecycle.e0<Boolean> D;
    public final androidx.lifecycle.e0<Boolean> E;
    public final androidx.lifecycle.e0<Boolean> F;
    public final androidx.lifecycle.e0<String> G;
    public final androidx.lifecycle.e0<Integer> H;
    public final androidx.lifecycle.e0<Integer> I;
    public final androidx.lifecycle.e0<String> J;
    public boolean K;

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f40950a = new androidx.lifecycle.e0<>("");

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f40951b = new androidx.lifecycle.e0<>("");

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f40952c = new androidx.lifecycle.e0<>("");

    /* renamed from: d  reason: collision with root package name */
    public final int f40953d = 3;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.lifecycle.e0<Bitmap> f40954e = new androidx.lifecycle.e0<>(null);

    /* renamed from: f  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f40955f = new androidx.lifecycle.e0<>(null);

    /* renamed from: g  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f40956g = new androidx.lifecycle.e0<>(null);

    /* renamed from: h  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f40957h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f40958i;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f40959j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f40960k;

    /* renamed from: l  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f40961l;

    /* renamed from: m  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f40962m;

    /* renamed from: n  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f40963n;

    /* renamed from: o  reason: collision with root package name */
    public final androidx.lifecycle.e0<Bitmap> f40964o;

    /* renamed from: p  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f40965p;

    /* renamed from: q  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f40966q;

    /* renamed from: r  reason: collision with root package name */
    public final androidx.lifecycle.e0<Long> f40967r;

    /* renamed from: s  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<ud.a>> f40968s;

    /* renamed from: t  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f40969t;

    /* renamed from: u  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f40970u;

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f40971v;

    /* renamed from: w  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f40972w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f40973x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f40974y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f40975z;

    public i0() {
        Boolean bool = Boolean.FALSE;
        this.f40957h = new androidx.lifecycle.e0<>(bool);
        this.f40958i = new androidx.lifecycle.e0<>(0);
        this.f40959j = new androidx.lifecycle.e0<>(0);
        this.f40960k = new androidx.lifecycle.e0<>(bool);
        this.f40961l = new androidx.lifecycle.e0<>(Boolean.TRUE);
        this.f40962m = new androidx.lifecycle.e0<>(bool);
        this.f40963n = new androidx.lifecycle.e0<>("");
        this.f40964o = new androidx.lifecycle.e0<>(null);
        this.f40965p = new androidx.lifecycle.e0<>(0);
        this.f40966q = new androidx.lifecycle.e0<>("");
        this.f40967r = new androidx.lifecycle.e0<>(0L);
        this.f40968s = new androidx.lifecycle.e0<>(xn.s.k());
        this.f40969t = new androidx.lifecycle.e0<>(bool);
        this.f40970u = new androidx.lifecycle.e0<>(bool);
        this.f40971v = new androidx.lifecycle.e0<>(bool);
        this.f40972w = new androidx.lifecycle.e0<>(bool);
        this.f40973x = new androidx.lifecycle.e0<>(bool);
        this.f40974y = new androidx.lifecycle.e0<>(bool);
        this.f40975z = new androidx.lifecycle.e0<>(bool);
        this.A = new androidx.lifecycle.e0<>(bool);
        this.B = new androidx.lifecycle.e0<>(bool);
        this.C = new androidx.lifecycle.e0<>(bool);
        this.D = new androidx.lifecycle.e0<>(bool);
        this.E = new androidx.lifecycle.e0<>(bool);
        this.F = new androidx.lifecycle.e0<>(bool);
        this.G = new androidx.lifecycle.e0<>("");
        this.H = new androidx.lifecycle.e0<>(-16777216);
        this.I = new androidx.lifecycle.e0<>(-16777216);
        this.J = new androidx.lifecycle.e0<>("");
    }

    public final androidx.lifecycle.e0<Boolean> A() {
        return this.A;
    }

    public final androidx.lifecycle.e0<Boolean> B() {
        return this.F;
    }

    public final androidx.lifecycle.e0<Boolean> C() {
        return this.f40972w;
    }

    public final androidx.lifecycle.e0<Boolean> D() {
        return this.f40957h;
    }

    public final androidx.lifecycle.e0<Boolean> E() {
        return this.f40975z;
    }

    public final androidx.lifecycle.e0<Boolean> F() {
        return this.f40969t;
    }

    public final androidx.lifecycle.e0<Boolean> G() {
        return this.f40973x;
    }

    public final void H(boolean z10) {
        this.K = z10;
    }

    public final void a(UserProfile userProfile, String str) {
        Object obj;
        UserLink userLink;
        jo.p.h(userProfile, "userProfile");
        jo.p.h(str, "birthdayText");
        this.f40950a.p(userProfile.getName());
        this.f40951b.p(userProfile.getUserId());
        androidx.lifecycle.e0<String> e0Var = this.f40955f;
        UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) xn.a0.a0(userProfile.getBadges(), 0);
        e0Var.p(userBadgeImageUrl != null ? userBadgeImageUrl.getSmallImageUrl() : null);
        Iterator<T> it = userProfile.getRibbons().iterator();
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
        this.f40956g.p(imageUrl);
        this.f40957h.p(Boolean.valueOf(!(imageUrl == null || imageUrl.length() == 0)));
        this.f40952c.p(userProfile.getDescription());
        this.f40971v.p(Boolean.valueOf(userProfile.getDescription().length() > 0));
        this.f40958i.p(Integer.valueOf(userProfile.getFollowingNum()));
        this.f40959j.p(Integer.valueOf(userProfile.getFollowerNum()));
        this.f40965p.p(Integer.valueOf(userProfile.getTotalViewerNum()));
        this.f40970u.p(Boolean.valueOf(userProfile.isBlocking()));
        this.f40969t.p(Boolean.valueOf(userProfile.getTotalViewerNum() != 0));
        this.f40962m.p(Boolean.valueOf(userProfile.isFollower()));
        this.f40963n.p(str);
        this.f40973x.p(Boolean.valueOf(!TextUtils.isEmpty(userProfile.getTwitterScreenName())));
        List<UserLink> links = userProfile.getLinks();
        String str2 = (links == null || (userLink = (UserLink) xn.a0.Z(links)) == null || (str2 = userLink.getUrl()) == null) ? "" : "";
        this.f40966q.p(str2);
        this.f40967r.p(Long.valueOf(userProfile.getRegisteredAt()));
        this.f40972w.p(Boolean.valueOf(str2.length() > 0));
        this.f40975z.p(Boolean.valueOf(!userProfile.getRibbons().isEmpty()));
        this.B.p(Boolean.valueOf(!TextUtils.isEmpty(this.f40963n.f())));
        this.f40961l.p(Boolean.FALSE);
        this.G.p(String.valueOf(userProfile.getUserLevel().getLevel()));
        this.H.p(Integer.valueOf(userProfile.getUserLevel().getLevelColor()));
        this.I.p(Integer.valueOf(userProfile.getUserLevel().getLevelBorderColor()));
        this.J.p(userProfile.getUserLevel().getLevelImageUrl());
        this.F.p(Boolean.TRUE);
    }

    public final androidx.lifecycle.e0<Bitmap> b() {
        return this.f40964o;
    }

    public final androidx.lifecycle.e0<String> c() {
        return this.f40952c;
    }

    public final androidx.lifecycle.e0<String> d() {
        return this.f40963n;
    }

    public final androidx.lifecycle.e0<String> e() {
        return this.f40955f;
    }

    public final androidx.lifecycle.e0<Integer> f() {
        return this.f40958i;
    }

    public final androidx.lifecycle.e0<Integer> g() {
        return this.f40959j;
    }

    public final androidx.lifecycle.e0<String> h() {
        return this.f40966q;
    }

    public final int i() {
        return this.f40953d;
    }

    public final androidx.lifecycle.e0<Bitmap> j() {
        return this.f40954e;
    }

    public final androidx.lifecycle.e0<Long> k() {
        return this.f40967r;
    }

    public final androidx.lifecycle.e0<String> l() {
        return this.f40956g;
    }

    public final boolean m() {
        return this.K;
    }

    public final androidx.lifecycle.e0<Integer> n() {
        return this.f40965p;
    }

    public final androidx.lifecycle.e0<String> o() {
        return this.f40951b;
    }

    public final androidx.lifecycle.e0<String> p() {
        return this.f40950a;
    }

    public final androidx.lifecycle.e0<Boolean> q() {
        return this.f40962m;
    }

    public final androidx.lifecycle.e0<Boolean> r() {
        return this.f40960k;
    }

    public final androidx.lifecycle.e0<Boolean> s() {
        return this.f40961l;
    }

    public final androidx.lifecycle.e0<Boolean> t() {
        return this.E;
    }

    public final androidx.lifecycle.e0<Boolean> u() {
        return this.D;
    }

    public final androidx.lifecycle.e0<Boolean> v() {
        return this.f40974y;
    }

    public final androidx.lifecycle.e0<Boolean> w() {
        return this.f40971v;
    }

    public final androidx.lifecycle.e0<Boolean> x() {
        return this.B;
    }

    public final androidx.lifecycle.e0<Boolean> y() {
        return this.C;
    }

    public final androidx.lifecycle.e0<Boolean> z() {
        return this.f40970u;
    }
}
