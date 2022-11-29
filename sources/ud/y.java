package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class y implements a {

    /* renamed from: w  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55728w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55729x;

    /* renamed from: y  reason: collision with root package name */
    public final a.EnumC0862a f55730y;

    public y(androidx.lifecycle.e0<String> e0Var, androidx.lifecycle.e0<Integer> e0Var2, a.EnumC0862a enumC0862a) {
        jo.p.h(e0Var, "text");
        jo.p.h(e0Var2, "liveStartTime");
        jo.p.h(enumC0862a, "type");
        this.f55728w = e0Var;
        this.f55729x = e0Var2;
        this.f55730y = enumC0862a;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f55730y;
    }

    public /* synthetic */ y(androidx.lifecycle.e0 e0Var, androidx.lifecycle.e0 e0Var2, a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? new androidx.lifecycle.e0("") : e0Var, (i10 & 2) != 0 ? new androidx.lifecycle.e0(0) : e0Var2, (i10 & 4) != 0 ? a.EnumC0862a.EDITABLE_NEXT_LIVE_ANNOUNCEMENT : enumC0862a);
    }
}
