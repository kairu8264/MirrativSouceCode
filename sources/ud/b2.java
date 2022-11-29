package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class b2 implements a {

    /* renamed from: w  reason: collision with root package name */
    public final String f54780w;

    /* renamed from: x  reason: collision with root package name */
    public final a.EnumC0862a f54781x;

    public b2(String str, a.EnumC0862a enumC0862a) {
        jo.p.h(str, "liveTitle");
        jo.p.h(enumC0862a, "type");
        this.f54780w = str;
        this.f54781x = enumC0862a;
    }

    public final String a() {
        return this.f54780w;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54781x;
    }

    public /* synthetic */ b2(String str, a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this(str, (i10 & 2) != 0 ? a.EnumC0862a.LIVE_INFO_NO_APP : enumC0862a);
    }
}
