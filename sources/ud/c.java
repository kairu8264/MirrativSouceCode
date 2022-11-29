package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class c implements a {

    /* renamed from: w  reason: collision with root package name */
    public final String f54804w;

    /* renamed from: x  reason: collision with root package name */
    public final String f54805x;

    /* renamed from: y  reason: collision with root package name */
    public final a.EnumC0862a f54806y;

    public c(String str, String str2, a.EnumC0862a enumC0862a) {
        jo.p.h(str, "appId");
        jo.p.h(str2, "imageUrl");
        jo.p.h(enumC0862a, "type");
        this.f54804w = str;
        this.f54805x = str2;
        this.f54806y = enumC0862a;
    }

    public final String a() {
        return this.f54805x;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54806y;
    }

    public /* synthetic */ c(String str, String str2, a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this(str, str2, (i10 & 4) != 0 ? a.EnumC0862a.APP : enumC0862a);
    }
}
