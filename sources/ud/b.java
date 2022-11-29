package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: w  reason: collision with root package name */
    public final boolean f54755w;

    /* renamed from: x  reason: collision with root package name */
    public final a.EnumC0862a f54756x;

    public b(boolean z10, a.EnumC0862a enumC0862a) {
        jo.p.h(enumC0862a, "type");
        this.f54755w = z10;
        this.f54756x = enumC0862a;
    }

    public final boolean a() {
        return this.f54755w;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54756x;
    }

    public /* synthetic */ b(boolean z10, a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this(z10, (i10 & 2) != 0 ? a.EnumC0862a.ADD_TO_MY_APP : enumC0862a);
    }
}
