package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class g2 implements a {

    /* renamed from: w  reason: collision with root package name */
    public final String f54963w;

    /* renamed from: x  reason: collision with root package name */
    public final a.EnumC0862a f54964x;

    public g2(String str, a.EnumC0862a enumC0862a) {
        jo.p.h(str, "message");
        jo.p.h(enumC0862a, "type");
        this.f54963w = str;
        this.f54964x = enumC0862a;
    }

    public final String a() {
        return this.f54963w;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54964x;
    }

    public /* synthetic */ g2(String str, a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this(str, (i10 & 2) != 0 ? a.EnumC0862a.MESSAGE : enumC0862a);
    }
}
