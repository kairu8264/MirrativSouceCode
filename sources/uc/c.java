package uc;

import jo.h;
import jo.p;
import ud.a;

/* loaded from: classes2.dex */
public final class c implements ud.a {

    /* renamed from: w  reason: collision with root package name */
    public final a.EnumC0862a f54725w;

    public c(a.EnumC0862a enumC0862a) {
        p.h(enumC0862a, "type");
        this.f54725w = enumC0862a;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54725w;
    }

    public /* synthetic */ c(a.EnumC0862a enumC0862a, int i10, h hVar) {
        this((i10 & 1) != 0 ? a.EnumC0862a.MY_CHAT_TUTORIAL : enumC0862a);
    }
}
