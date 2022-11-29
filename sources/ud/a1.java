package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class a1 implements ud.a {

    /* renamed from: y  reason: collision with root package name */
    public static final a f54731y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f54732z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final jf.q f54733w;

    /* renamed from: x  reason: collision with root package name */
    public final a.EnumC0862a f54734x;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final a1 a(jf.q qVar) {
            jo.p.h(qVar, "gift");
            return new a1(qVar, null, 2, null);
        }
    }

    public a1(jf.q qVar, a.EnumC0862a enumC0862a) {
        jo.p.h(qVar, "giftModel");
        jo.p.h(enumC0862a, "type");
        this.f54733w = qVar;
        this.f54734x = enumC0862a;
    }

    public final jf.q a() {
        return this.f54733w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a1) {
            a1 a1Var = (a1) obj;
            return jo.p.c(this.f54733w, a1Var.f54733w) && getType() == a1Var.getType();
        }
        return false;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54734x;
    }

    public int hashCode() {
        return (this.f54733w.hashCode() * 31) + getType().hashCode();
    }

    public String toString() {
        return "GiftPanelGachaTicketBindModel(giftModel=" + this.f54733w + ", type=" + getType() + ')';
    }

    public /* synthetic */ a1(jf.q qVar, a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this(qVar, (i10 & 2) != 0 ? a.EnumC0862a.GIFT_PANEL_GACHA_TICKET : enumC0862a);
    }
}
