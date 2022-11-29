package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class n1 implements a {

    /* renamed from: w  reason: collision with root package name */
    public final a.EnumC0862a f55238w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55239x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55240y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55241z;

    public n1() {
        this(null, 1, null);
    }

    public n1(a.EnumC0862a enumC0862a) {
        jo.p.h(enumC0862a, "type");
        this.f55238w = enumC0862a;
        this.f55239x = new androidx.lifecycle.e0<>("");
        this.f55240y = new androidx.lifecycle.e0<>("");
        this.f55241z = new androidx.lifecycle.e0<>(0);
    }

    public final void a(String str, String str2, int i10) {
        jo.p.h(str, "title");
        jo.p.h(str2, "text");
        this.f55239x.p(str);
        this.f55240y.p(str2);
        this.f55241z.p(Integer.valueOf(i10));
    }

    public final androidx.lifecycle.e0<Integer> b() {
        return this.f55241z;
    }

    public final androidx.lifecycle.e0<String> c() {
        return this.f55240y;
    }

    public final androidx.lifecycle.e0<String> d() {
        return this.f55239x;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f55238w;
    }

    public /* synthetic */ n1(a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? a.EnumC0862a.LANDING_PAGE_DESCRIPTION : enumC0862a);
    }
}
