package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class c2 implements a {
    public final a.EnumC0862a A;

    /* renamed from: w  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54822w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54823x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54824y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f54825z;

    public c2() {
        this(null, null, null, null, null, 31, null);
    }

    public c2(androidx.lifecycle.e0<String> e0Var, androidx.lifecycle.e0<String> e0Var2, androidx.lifecycle.e0<String> e0Var3, androidx.lifecycle.e0<Boolean> e0Var4, a.EnumC0862a enumC0862a) {
        jo.p.h(e0Var, "appName");
        jo.p.h(e0Var2, "appImageUrl");
        jo.p.h(e0Var3, "liveTitle");
        jo.p.h(e0Var4, "isMyApp");
        jo.p.h(enumC0862a, "type");
        this.f54822w = e0Var;
        this.f54823x = e0Var2;
        this.f54824y = e0Var3;
        this.f54825z = e0Var4;
        this.A = enumC0862a;
    }

    public final androidx.lifecycle.e0<String> a() {
        return this.f54823x;
    }

    public final androidx.lifecycle.e0<String> b() {
        return this.f54822w;
    }

    public final androidx.lifecycle.e0<String> c() {
        return this.f54824y;
    }

    public final androidx.lifecycle.e0<Boolean> d() {
        return this.f54825z;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.A;
    }

    public /* synthetic */ c2(androidx.lifecycle.e0 e0Var, androidx.lifecycle.e0 e0Var2, androidx.lifecycle.e0 e0Var3, androidx.lifecycle.e0 e0Var4, a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? new androidx.lifecycle.e0(null) : e0Var, (i10 & 2) != 0 ? new androidx.lifecycle.e0(null) : e0Var2, (i10 & 4) != 0 ? new androidx.lifecycle.e0("") : e0Var3, (i10 & 8) != 0 ? new androidx.lifecycle.e0(Boolean.FALSE) : e0Var4, (i10 & 16) != 0 ? a.EnumC0862a.LIVE_INFO_WITH_APP : enumC0862a);
    }
}
