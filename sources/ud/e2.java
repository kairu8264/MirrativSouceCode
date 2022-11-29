package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class e2 implements a {

    /* renamed from: w  reason: collision with root package name */
    public final int f54883w;

    /* renamed from: x  reason: collision with root package name */
    public final int f54884x;

    /* renamed from: y  reason: collision with root package name */
    public final a.EnumC0862a f54885y;

    public e2(int i10, int i11, a.EnumC0862a enumC0862a) {
        jo.p.h(enumC0862a, "type");
        this.f54883w = i10;
        this.f54884x = i11;
        this.f54885y = enumC0862a;
    }

    public final int a() {
        return this.f54883w;
    }

    public final int b() {
        return this.f54884x;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54885y;
    }

    public /* synthetic */ e2(int i10, int i11, a.EnumC0862a enumC0862a, int i12, jo.h hVar) {
        this(i10, i11, (i12 & 4) != 0 ? a.EnumC0862a.LIVE_VIEWERS_INFO : enumC0862a);
    }
}
