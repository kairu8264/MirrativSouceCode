package ud;

import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import com.dena.mirrorman.net.api.response.user.MutualFollowee;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class x4 extends androidx.databinding.a {
    public boolean A;
    public boolean D;
    public boolean F;

    /* renamed from: d  reason: collision with root package name */
    public String f55705d;

    /* renamed from: e  reason: collision with root package name */
    public String f55706e;

    /* renamed from: f  reason: collision with root package name */
    public String f55707f;

    /* renamed from: g  reason: collision with root package name */
    public String f55708g;

    /* renamed from: h  reason: collision with root package name */
    public String f55709h;

    /* renamed from: i  reason: collision with root package name */
    public String f55710i;

    /* renamed from: j  reason: collision with root package name */
    public long f55711j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f55712k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f55713l;

    /* renamed from: m  reason: collision with root package name */
    public int f55714m;

    /* renamed from: n  reason: collision with root package name */
    public int f55715n;

    /* renamed from: o  reason: collision with root package name */
    public String f55716o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f55717p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f55718q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f55719r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f55720s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f55721t;

    /* renamed from: v  reason: collision with root package name */
    public boolean f55723v;

    /* renamed from: x  reason: collision with root package name */
    public Integer f55725x;

    /* renamed from: y  reason: collision with root package name */
    public Integer f55726y;

    /* renamed from: z  reason: collision with root package name */
    public Integer f55727z;

    /* renamed from: b  reason: collision with root package name */
    public String f55703b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f55704c = "";

    /* renamed from: u  reason: collision with root package name */
    public int f55722u = 4;

    /* renamed from: w  reason: collision with root package name */
    public String f55724w = "";
    public Integer B = 0;
    public Integer C = 0;
    public String E = "";

    public final boolean A() {
        return this.f55721t;
    }

    public final int B() {
        return this.f55722u;
    }

    public final boolean C() {
        return this.A;
    }

    public final Integer D() {
        return this.B;
    }

    public final boolean E() {
        return this.D;
    }

    public final boolean F() {
        return this.f55723v;
    }

    public final boolean G() {
        return this.f55719r;
    }

    public final boolean H() {
        return this.f55717p;
    }

    public final void I(String str) {
        this.f55705d = str;
        c(nd.b.f41906b);
    }

    public final void J(String str) {
        this.f55709h = str;
        c(nd.b.f41907c);
    }

    public final void K(String str) {
        this.f55710i = str;
        c(nd.b.f41909e);
    }

    public final void L(String str) {
        jo.p.h(str, "value");
        this.E = str;
        c(nd.b.f41910f);
    }

    public final void M(String str) {
        this.f55708g = str;
        c(nd.b.f41911g);
    }

    public final void N(int i10) {
        this.f55714m = i10;
        c(nd.b.f41912h);
    }

    public final void O(boolean z10) {
        this.f55713l = z10;
        c(nd.b.f41913i);
    }

    public final void P(int i10) {
        this.f55715n = i10;
        c(nd.b.f41914j);
    }

    public final void Q(boolean z10) {
        this.f55712k = z10;
        c(nd.b.f41915k);
    }

    public final void R(Integer num) {
        this.f55726y = num;
        c(nd.b.f41917m);
    }

    public final void S(String str) {
        jo.p.h(str, "value");
        this.f55724w = str;
        c(nd.b.f41918n);
    }

    public final void T(Integer num) {
        this.f55725x = num;
        c(nd.b.f41919o);
    }

    public final void U(Integer num) {
        this.f55727z = num;
        c(nd.b.f41920p);
    }

    public final void V(Integer num) {
        this.C = num;
        c(nd.b.f41921q);
    }

    public final void W(String str) {
        this.f55706e = str;
        c(nd.b.f41922r);
    }

    public final void X(long j10) {
        this.f55711j = j10;
        c(nd.b.f41923s);
    }

    public final void Y(String str) {
        this.f55707f = str;
        c(nd.b.f41924t);
    }

    public final void Z(String str) {
        this.f55716o = str;
        c(nd.b.f41925u);
    }

    public final void a0(String str) {
        jo.p.h(str, "value");
        this.f55703b = str;
        c(nd.b.f41926v);
    }

    public final void b0(String str) {
        jo.p.h(str, "value");
        this.f55704c = str;
        c(nd.b.f41927w);
    }

    public final void c0(boolean z10) {
        this.f55718q = z10;
        c(nd.b.f41928x);
    }

    public final void d(UserProfile userProfile, String str, boolean z10, String str2) {
        List<RibbonResponse> ribbons;
        Object obj;
        jo.p.h(userProfile, MRLog.TARGET_TYPE_USER);
        jo.p.h(str, "birthdayText");
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
        Y(ribbonResponse != null ? ribbonResponse.getImageUrl() : null);
        l0(!ribbons.isEmpty());
        f0(userProfile.isBlocking());
        g0((jo.p.c(userProfile.getUserId(), str2) || userProfile.isBlocked()) ? 8 : 0);
        k0((jo.p.c(userProfile.getUserId(), str2) || z10) ? false : true);
        m0((TextUtils.isEmpty(userProfile.getTwitterScreenName()) || userProfile.isBlocked()) ? false : true);
        d0(userProfile.getDescription().length() > 0);
        a0(userProfile.getUserId());
        b0(userProfile.getName());
        W(userProfile.getProfileImageUrl());
        UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) xn.a0.a0(userProfile.getBadges(), 0);
        M(userBadgeImageUrl != null ? userBadgeImageUrl.getSmallImageUrl() : null);
        K(userProfile.getDescription());
        Z(userProfile.getTwitterScreenName());
        N(userProfile.getFollowingNum());
        P(userProfile.getFollowerNum());
        Q(userProfile.isFollowing());
        O(userProfile.isFollower());
        X(userProfile.getRegisteredAt());
        J(userProfile.getAvatarBackgroundImageUrl());
        I(userProfile.getAvatarBodyImageUrl());
        j0(!jo.p.c(userProfile.getMutualFollowees(), new MutualFollowee(xn.s.k(), "")));
        L(str);
        e0(!TextUtils.isEmpty(userProfile.getBirthday()));
        V(userProfile.isCheerleader() ? Integer.valueOf(nd.y0.f42247c) : null);
        h0(userProfile.isCheerleader());
        i0(userProfile.isCheerleader() ? Integer.valueOf(nd.y0.H1) : null);
    }

    public final void d0(boolean z10) {
        this.f55720s = z10;
        c(nd.b.f41929y);
    }

    public final String e() {
        return this.f55705d;
    }

    public final void e0(boolean z10) {
        this.F = z10;
        c(nd.b.f41930z);
    }

    public final String f() {
        return this.f55709h;
    }

    public final void f0(boolean z10) {
        this.f55721t = z10;
        c(nd.b.A);
    }

    public final String g() {
        return this.f55710i;
    }

    public final void g0(int i10) {
        this.f55722u = i10;
        c(nd.b.B);
    }

    public final String h() {
        return this.E;
    }

    public final void h0(boolean z10) {
        this.A = z10;
        c(nd.b.C);
    }

    public final String i() {
        return this.f55708g;
    }

    public final void i0(Integer num) {
        this.B = num;
        c(nd.b.D);
    }

    public final int j() {
        return this.f55714m;
    }

    public final void j0(boolean z10) {
        this.D = z10;
        c(nd.b.E);
    }

    public final boolean k() {
        return this.f55713l;
    }

    public final void k0(boolean z10) {
        this.f55723v = z10;
        c(nd.b.F);
    }

    public final int l() {
        return this.f55715n;
    }

    public final void l0(boolean z10) {
        this.f55719r = z10;
        c(nd.b.G);
    }

    public final boolean m() {
        return this.f55712k;
    }

    public final void m0(boolean z10) {
        this.f55717p = z10;
        c(nd.b.H);
    }

    public final Integer n() {
        return this.f55726y;
    }

    public final String o() {
        return this.f55724w;
    }

    public final Integer p() {
        return this.f55725x;
    }

    public final Integer q() {
        return this.f55727z;
    }

    public final Integer r() {
        return this.C;
    }

    public final String s() {
        return this.f55706e;
    }

    public final long t() {
        return this.f55711j;
    }

    public final String u() {
        return this.f55707f;
    }

    public final String v() {
        return this.f55703b;
    }

    public final String w() {
        return this.f55704c;
    }

    public final boolean x() {
        return this.f55718q;
    }

    public final boolean y() {
        return this.f55720s;
    }

    public final boolean z() {
        return this.F;
    }
}
