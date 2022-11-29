package ud;

import android.graphics.drawable.Drawable;
import java.util.List;
import ud.a;

/* loaded from: classes2.dex */
public final class q1 implements a {
    public final androidx.lifecycle.e0<Drawable> A;
    public final androidx.lifecycle.e0<Integer> B;
    public final androidx.lifecycle.e0<Boolean> C;

    /* renamed from: w  reason: collision with root package name */
    public final a.EnumC0862a f55376w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55377x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<r1>> f55378y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55379z;

    public q1() {
        this(null, 1, null);
    }

    public q1(a.EnumC0862a enumC0862a) {
        jo.p.h(enumC0862a, "type");
        this.f55376w = enumC0862a;
        Boolean bool = Boolean.FALSE;
        this.f55377x = new androidx.lifecycle.e0<>(bool);
        this.f55378y = new androidx.lifecycle.e0<>(xn.s.k());
        this.f55379z = new androidx.lifecycle.e0<>("");
        this.A = new androidx.lifecycle.e0<>(null);
        this.B = new androidx.lifecycle.e0<>(0);
        this.C = new androidx.lifecycle.e0<>(bool);
    }

    public static /* synthetic */ void b(q1 q1Var, boolean z10, List list, String str, Drawable drawable, int i10, boolean z11, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            z11 = false;
        }
        q1Var.a(z10, list, str, drawable, i10, z11);
    }

    public final void a(boolean z10, List<r1> list, String str, Drawable drawable, int i10, boolean z11) {
        jo.p.h(list, "rankingUsers");
        jo.p.h(str, "rankingHeaderText");
        jo.p.h(drawable, "rankingHeaderBackground");
        this.f55377x.p(Boolean.valueOf(z10));
        this.f55378y.p(list);
        this.f55379z.p(str);
        this.A.p(drawable);
        this.B.p(Integer.valueOf(i10));
        this.C.p(Boolean.valueOf(z11));
    }

    public final androidx.lifecycle.e0<Boolean> c() {
        return this.f55377x;
    }

    public final androidx.lifecycle.e0<Boolean> d() {
        return this.C;
    }

    public final androidx.lifecycle.e0<Drawable> e() {
        return this.A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1) && getType() == ((q1) obj).getType();
    }

    public final androidx.lifecycle.e0<String> f() {
        return this.f55379z;
    }

    public final androidx.lifecycle.e0<Integer> g() {
        return this.B;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f55376w;
    }

    public final androidx.lifecycle.e0<List<r1>> h() {
        return this.f55378y;
    }

    public int hashCode() {
        return getType().hashCode();
    }

    public String toString() {
        return "LandingPageRankingListBindModel(type=" + getType() + ')';
    }

    public /* synthetic */ q1(a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? a.EnumC0862a.LANDING_PAGE_RANKING_LIST : enumC0862a);
    }
}
