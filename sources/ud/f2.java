package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class f2 implements a {

    /* renamed from: w  reason: collision with root package name */
    public final a.EnumC0862a f54928w;

    public f2() {
        this(null, 1, null);
    }

    public f2(a.EnumC0862a enumC0862a) {
        jo.p.h(enumC0862a, "type");
        this.f54928w = enumC0862a;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54928w;
    }

    public /* synthetic */ f2(a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? a.EnumC0862a.LOADING : enumC0862a);
    }
}
