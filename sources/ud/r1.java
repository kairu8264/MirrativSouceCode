package ud;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import ud.a;

/* loaded from: classes2.dex */
public final class r1 implements a {
    public final androidx.lifecycle.e0<String> A;
    public final androidx.lifecycle.e0<String> B;
    public final androidx.lifecycle.e0<String> C;
    public final androidx.lifecycle.e0<String> D;
    public final androidx.lifecycle.e0<String> E;
    public final androidx.lifecycle.e0<String> F;
    public final androidx.lifecycle.e0<Boolean> G;
    public final androidx.lifecycle.e0<Boolean> H;
    public final androidx.lifecycle.e0<Boolean> I;
    public final androidx.lifecycle.e0<Integer> J;
    public final androidx.lifecycle.e0<Drawable> K;
    public final androidx.lifecycle.e0<Boolean> L;

    /* renamed from: w  reason: collision with root package name */
    public final a.EnumC0862a f55436w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55437x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55438y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55439z;

    public r1() {
        this(null, 1, null);
    }

    public r1(a.EnumC0862a enumC0862a) {
        jo.p.h(enumC0862a, "type");
        this.f55436w = enumC0862a;
        this.f55437x = new androidx.lifecycle.e0<>(0);
        this.f55438y = new androidx.lifecycle.e0<>(0);
        this.f55439z = new androidx.lifecycle.e0<>("");
        this.A = new androidx.lifecycle.e0<>("");
        this.B = new androidx.lifecycle.e0<>("");
        this.C = new androidx.lifecycle.e0<>("");
        this.D = new androidx.lifecycle.e0<>("");
        this.E = new androidx.lifecycle.e0<>("");
        this.F = new androidx.lifecycle.e0<>("");
        Boolean bool = Boolean.FALSE;
        this.G = new androidx.lifecycle.e0<>(bool);
        this.H = new androidx.lifecycle.e0<>(bool);
        this.I = new androidx.lifecycle.e0<>(bool);
        this.J = new androidx.lifecycle.e0<>(0);
        this.K = new androidx.lifecycle.e0<>(null);
        this.L = new androidx.lifecycle.e0<>(bool);
    }

    public final void a(int i10, int i11, String str, String str2, String str3, String str4, String str5, String str6, int i12, boolean z10, boolean z11, Drawable drawable) {
        jo.p.h(str, "liveId");
        jo.p.h(str2, "iconUrl");
        jo.p.h(str3, "badgeImageUrl");
        jo.p.h(str4, "labelImageUrl");
        jo.p.h(str5, "name");
        jo.p.h(str6, "pointText");
        this.f55437x.p(Integer.valueOf(i10));
        this.f55438y.p(Integer.valueOf(i11));
        this.f55439z.p(str);
        this.A.p(str2);
        this.B.p(str3);
        this.C.p(str4);
        this.D.p(String.valueOf(i10));
        this.E.p(str5);
        this.F.p(str6);
        androidx.lifecycle.e0<Boolean> e0Var = this.G;
        String f10 = this.B.f();
        boolean z12 = true;
        e0Var.p(f10 != null ? Boolean.valueOf(!so.n.r(f10)) : Boolean.FALSE);
        androidx.lifecycle.e0<Boolean> e0Var2 = this.H;
        String f11 = this.C.f();
        e0Var2.p(f11 != null ? Boolean.valueOf(!so.n.r(f11)) : Boolean.FALSE);
        this.I.p(Boolean.valueOf((!z10 || TextUtils.isEmpty(str)) ? false : false));
        this.J.p(Integer.valueOf(i12));
        this.L.p(Boolean.valueOf(z11));
        this.K.p(drawable);
    }

    public final androidx.lifecycle.e0<String> b() {
        return this.C;
    }

    public final androidx.lifecycle.e0<Drawable> c() {
        return this.K;
    }

    public final androidx.lifecycle.e0<String> d() {
        return this.f55439z;
    }

    public final androidx.lifecycle.e0<Integer> e() {
        return this.J;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1) && getType() == ((r1) obj).getType();
    }

    public final androidx.lifecycle.e0<String> f() {
        return this.B;
    }

    public final androidx.lifecycle.e0<String> g() {
        return this.A;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f55436w;
    }

    public final androidx.lifecycle.e0<String> h() {
        return this.E;
    }

    public int hashCode() {
        return getType().hashCode();
    }

    public final androidx.lifecycle.e0<String> i() {
        return this.F;
    }

    public final androidx.lifecycle.e0<String> j() {
        return this.D;
    }

    public final androidx.lifecycle.e0<Integer> k() {
        return this.f55438y;
    }

    public final androidx.lifecycle.e0<Boolean> l() {
        return this.H;
    }

    public final androidx.lifecycle.e0<Boolean> m() {
        return this.L;
    }

    public final androidx.lifecycle.e0<Boolean> n() {
        return this.I;
    }

    public final androidx.lifecycle.e0<Boolean> o() {
        return this.G;
    }

    public String toString() {
        return "LandingPageRankingUserBindModel(type=" + getType() + ')';
    }

    public /* synthetic */ r1(a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? a.EnumC0862a.LANDING_PAGE_RANKING_USER : enumC0862a);
    }
}
