package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class b1 implements ud.a {

    /* renamed from: y  reason: collision with root package name */
    public static final a f54776y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f54777z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final jf.q f54778w;

    /* renamed from: x  reason: collision with root package name */
    public final a.EnumC0862a f54779x;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b1 a(jf.q qVar) {
            jo.p.h(qVar, "gift");
            return new b1(qVar, null, 2, null);
        }
    }

    public b1(jf.q qVar, a.EnumC0862a enumC0862a) {
        jo.p.h(qVar, "giftModel");
        jo.p.h(enumC0862a, "type");
        this.f54778w = qVar;
        this.f54779x = enumC0862a;
    }

    public final jf.q a() {
        return this.f54778w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            return jo.p.c(this.f54778w, b1Var.f54778w) && getType() == b1Var.getType();
        }
        return false;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54779x;
    }

    public int hashCode() {
        return (this.f54778w.hashCode() * 31) + getType().hashCode();
    }

    public String toString() {
        return "GiftPanelGiftBindModel(giftModel=" + this.f54778w + ", type=" + getType() + ')';
    }

    public /* synthetic */ b1(jf.q qVar, a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this(qVar, (i10 & 2) != 0 ? a.EnumC0862a.GIFT_PANEL_GIFT : enumC0862a);
    }
}
