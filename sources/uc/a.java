package uc;

import jo.h;
import jo.p;
import ud.a;

/* loaded from: classes2.dex */
public final class a implements ud.a {

    /* renamed from: w  reason: collision with root package name */
    public final a.EnumC0862a f54720w;

    public a(a.EnumC0862a enumC0862a) {
        p.h(enumC0862a, "type");
        this.f54720w = enumC0862a;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54720w;
    }

    public /* synthetic */ a(a.EnumC0862a enumC0862a, int i10, h hVar) {
        this((i10 & 1) != 0 ? a.EnumC0862a.MY_CHAT_REQUEST_CONFIRMATION : enumC0862a);
    }
}
