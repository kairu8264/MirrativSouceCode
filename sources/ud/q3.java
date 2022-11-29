package ud;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import com.dena.mirrorman.net.api.response.user.MutualFollowee;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class q3 {
    public final androidx.lifecycle.e0<Boolean> A;
    public final androidx.lifecycle.e0<Boolean> B;
    public final androidx.lifecycle.e0<String> C;
    public final androidx.lifecycle.e0<Boolean> D;
    public final androidx.lifecycle.e0<String> E;
    public final LiveData<String> F;

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55396a = new androidx.lifecycle.e0<>("");

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55397b = new androidx.lifecycle.e0<>("");

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55398c = new androidx.lifecycle.e0<>(null);

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55399d = new androidx.lifecycle.e0<>(null);

    /* renamed from: e  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55400e = new androidx.lifecycle.e0<>(null);

    /* renamed from: f  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55401f;

    /* renamed from: g  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55402g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55403h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55404i;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55405j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55406k;

    /* renamed from: l  reason: collision with root package name */
    public final int f55407l;

    /* renamed from: m  reason: collision with root package name */
    public final androidx.lifecycle.e0<Long> f55408m;

    /* renamed from: n  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55409n;

    /* renamed from: o  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55410o;

    /* renamed from: p  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55411p;

    /* renamed from: q  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55412q;

    /* renamed from: r  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55413r;

    /* renamed from: s  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<String>> f55414s;

    /* renamed from: t  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55415t;

    /* renamed from: u  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55416u;

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55417v;

    /* renamed from: w  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55418w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55419x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55420y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55421z;

    public q3() {
        Boolean bool = Boolean.FALSE;
        this.f55401f = new androidx.lifecycle.e0<>(bool);
        this.f55402g = new androidx.lifecycle.e0<>(null);
        this.f55403h = new androidx.lifecycle.e0<>(null);
        this.f55404i = new androidx.lifecycle.e0<>(bool);
        this.f55405j = new androidx.lifecycle.e0<>(null);
        this.f55406k = new androidx.lifecycle.e0<>(null);
        this.f55407l = 2;
        this.f55408m = new androidx.lifecycle.e0<>(0L);
        this.f55409n = new androidx.lifecycle.e0<>(bool);
        this.f55410o = new androidx.lifecycle.e0<>(bool);
        this.f55411p = new androidx.lifecycle.e0<>(0);
        this.f55412q = new androidx.lifecycle.e0<>(0);
        this.f55413r = new androidx.lifecycle.e0<>("");
        this.f55414s = new androidx.lifecycle.e0<>(xn.s.k());
        this.f55415t = new androidx.lifecycle.e0<>(bool);
        this.f55416u = new androidx.lifecycle.e0<>(bool);
        this.f55417v = new androidx.lifecycle.e0<>(bool);
        this.f55418w = new androidx.lifecycle.e0<>(bool);
        this.f55419x = new androidx.lifecycle.e0<>(bool);
        this.f55420y = new androidx.lifecycle.e0<>(bool);
        this.f55421z = new androidx.lifecycle.e0<>(Boolean.TRUE);
        this.A = new androidx.lifecycle.e0<>(bool);
        this.B = new androidx.lifecycle.e0<>(bool);
        this.C = new androidx.lifecycle.e0<>("");
        this.D = new androidx.lifecycle.e0<>(bool);
        androidx.lifecycle.e0<String> e0Var = new androidx.lifecycle.e0<>("");
        this.E = e0Var;
        this.F = e0Var;
    }

    public final androidx.lifecycle.e0<Boolean> A() {
        return this.B;
    }

    public final androidx.lifecycle.e0<Boolean> B() {
        return this.A;
    }

    public final androidx.lifecycle.e0<Boolean> C() {
        return this.f55404i;
    }

    public final androidx.lifecycle.e0<Boolean> D() {
        return this.f55418w;
    }

    public final androidx.lifecycle.e0<Boolean> E() {
        return this.f55416u;
    }

    public final void a(Context context, UserProfile userProfile, boolean z10, String str) {
        jo.p.h(context, "context");
        jo.p.h(userProfile, MRLog.TARGET_TYPE_USER);
        jo.p.h(str, "birthdayText");
        this.f55397b.p(userProfile.getUserId());
        this.f55396a.p(userProfile.getName());
        this.f55399d.p(userProfile.getProfileImageUrl());
        this.f55400e.p(Integer.valueOf(z10 ? nd.y0.f42249e : nd.y0.f42252i));
        this.f55401f.p(Boolean.valueOf(z10));
        androidx.lifecycle.e0<String> e0Var = this.f55402g;
        UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) xn.a0.a0(userProfile.getBadges(), 0);
        e0Var.p(userBadgeImageUrl != null ? userBadgeImageUrl.getSmallImageUrl() : null);
        RibbonResponse ribbonResponse = (RibbonResponse) xn.a0.a0(userProfile.getRibbons(), 0);
        String imageUrl = ribbonResponse != null ? ribbonResponse.getImageUrl() : null;
        this.f55403h.p(imageUrl);
        this.f55404i.p(Boolean.valueOf(!(imageUrl == null || imageUrl.length() == 0)));
        this.f55406k.p(userProfile.getDescription());
        this.f55408m.p(Long.valueOf(userProfile.getRegisteredAt()));
        this.f55419x.p(Boolean.valueOf(userProfile.getDescription().length() > 0));
        this.f55413r.p(userProfile.getTwitterScreenName());
        this.f55416u.p(Boolean.valueOf((TextUtils.isEmpty(userProfile.getTwitterScreenName()) || userProfile.isBlocked()) ? false : true));
        this.f55411p.p(Integer.valueOf(userProfile.getFollowingNum()));
        this.f55412q.p(Integer.valueOf(userProfile.getFollowerNum()));
        this.f55409n.p(Boolean.valueOf(userProfile.isFollowing()));
        this.f55410o.p(Boolean.valueOf(userProfile.isFollower()));
        this.f55405j.p(userProfile.getAvatarBackgroundImageUrl());
        this.f55398c.p(userProfile.getAvatarBodyImageUrl());
        List<RibbonResponse> ribbons = userProfile.getRibbons();
        androidx.lifecycle.e0<List<String>> e0Var2 = this.f55414s;
        ArrayList arrayList = new ArrayList(xn.t.u(ribbons, 10));
        for (RibbonResponse ribbonResponse2 : ribbons) {
            arrayList.add(ribbonResponse2.getImageUrl());
        }
        e0Var2.p(arrayList);
        this.f55418w.p(Boolean.valueOf(!ribbons.isEmpty()));
        this.f55420y.p(Boolean.valueOf(userProfile.isBlocking()));
        this.f55421z.p(Boolean.FALSE);
        this.B.p(Boolean.valueOf(!jo.p.c(userProfile.getMutualFollowees(), new MutualFollowee(xn.s.k(), ""))));
        this.C.p(str);
        this.D.p(Boolean.valueOf(!TextUtils.isEmpty(userProfile.getBirthday())));
        this.E.p(context.getString(nd.f1.text_shooter_matching_confirmation_live_enter_title, userProfile.getName()));
    }

    public final androidx.lifecycle.e0<String> b() {
        return this.f55398c;
    }

    public final androidx.lifecycle.e0<String> c() {
        return this.f55405j;
    }

    public final androidx.lifecycle.e0<String> d() {
        return this.f55406k;
    }

    public final androidx.lifecycle.e0<String> e() {
        return this.C;
    }

    public final androidx.lifecycle.e0<String> f() {
        return this.f55402g;
    }

    public final androidx.lifecycle.e0<Integer> g() {
        return this.f55411p;
    }

    public final androidx.lifecycle.e0<Integer> h() {
        return this.f55412q;
    }

    public final LiveData<String> i() {
        return this.F;
    }

    public final int j() {
        return this.f55407l;
    }

    public final androidx.lifecycle.e0<Integer> k() {
        return this.f55400e;
    }

    public final androidx.lifecycle.e0<String> l() {
        return this.f55399d;
    }

    public final androidx.lifecycle.e0<Long> m() {
        return this.f55408m;
    }

    public final androidx.lifecycle.e0<String> n() {
        return this.f55403h;
    }

    public final androidx.lifecycle.e0<List<String>> o() {
        return this.f55414s;
    }

    public final androidx.lifecycle.e0<String> p() {
        return this.f55413r;
    }

    public final androidx.lifecycle.e0<String> q() {
        return this.f55397b;
    }

    public final androidx.lifecycle.e0<String> r() {
        return this.f55396a;
    }

    public final androidx.lifecycle.e0<Boolean> s() {
        return this.f55401f;
    }

    public final androidx.lifecycle.e0<Boolean> t() {
        return this.f55410o;
    }

    public final androidx.lifecycle.e0<Boolean> u() {
        return this.f55409n;
    }

    public final androidx.lifecycle.e0<Boolean> v() {
        return this.f55421z;
    }

    public final androidx.lifecycle.e0<Boolean> w() {
        return this.f55417v;
    }

    public final androidx.lifecycle.e0<Boolean> x() {
        return this.f55419x;
    }

    public final androidx.lifecycle.e0<Boolean> y() {
        return this.D;
    }

    public final androidx.lifecycle.e0<Boolean> z() {
        return this.f55415t;
    }
}
