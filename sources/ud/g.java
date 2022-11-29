package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class g implements ud.a {

    /* renamed from: x  reason: collision with root package name */
    public static final a f54947x = new a(null);

    /* renamed from: w  reason: collision with root package name */
    public final a.EnumC0862a f54948w;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a() {
            return new g(null, 1, null);
        }
    }

    public g(a.EnumC0862a enumC0862a) {
        jo.p.h(enumC0862a, "type");
        this.f54948w = enumC0862a;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54948w;
    }

    public /* synthetic */ g(a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? a.EnumC0862a.APP_SETTING_FOOTER : enumC0862a);
    }
}
