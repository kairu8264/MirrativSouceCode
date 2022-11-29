package cc;

import ud.a;

/* loaded from: classes2.dex */
public final class t0 implements ud.a {
    public static final a G = new a(null);
    public final int A;
    public final String B;
    public final String C;
    public final boolean D;
    public final boolean E;
    public final a.EnumC0862a F;

    /* renamed from: w  reason: collision with root package name */
    public final int f19136w;

    /* renamed from: x  reason: collision with root package name */
    public final int f19137x;

    /* renamed from: y  reason: collision with root package name */
    public final String f19138y;

    /* renamed from: z  reason: collision with root package name */
    public final String f19139z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final t0 a(jf.u uVar) {
            int i10;
            jo.p.h(uVar, "event");
            int e10 = uVar.e();
            if (uVar.p()) {
                i10 = xb.n.f59966u;
            } else {
                i10 = xb.n.O0;
            }
            return new t0(e10, i10, uVar.f(), uVar.i(), uVar.j(), uVar.c(), uVar.d(), !uVar.o(), uVar.p(), null, 512, null);
        }
    }

    public t0(int i10, int i11, String str, String str2, int i12, String str3, String str4, boolean z10, boolean z11, a.EnumC0862a enumC0862a) {
        jo.p.h(str, "eventTitleText");
        jo.p.h(str2, "rankText");
        jo.p.h(str3, "eventBannerImageUrl");
        jo.p.h(str4, "eventBannerLinkUrl");
        jo.p.h(enumC0862a, "type");
        this.f19136w = i10;
        this.f19137x = i11;
        this.f19138y = str;
        this.f19139z = str2;
        this.A = i12;
        this.B = str3;
        this.C = str4;
        this.D = z10;
        this.E = z11;
        this.F = enumC0862a;
    }

    public final int a() {
        return this.f19137x;
    }

    public final String b() {
        return this.B;
    }

    public final String c() {
        return this.C;
    }

    public final int d() {
        return this.f19136w;
    }

    public final String e() {
        return this.f19138y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            return this.f19136w == t0Var.f19136w && this.f19137x == t0Var.f19137x && jo.p.c(this.f19138y, t0Var.f19138y) && jo.p.c(this.f19139z, t0Var.f19139z) && this.A == t0Var.A && jo.p.c(this.B, t0Var.B) && jo.p.c(this.C, t0Var.C) && this.D == t0Var.D && this.E == t0Var.E && getType() == t0Var.getType();
        }
        return false;
    }

    public final String f() {
        return this.f19139z;
    }

    public final int g() {
        return this.A;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.F;
    }

    public final boolean h() {
        return this.E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.f19136w) * 31) + Integer.hashCode(this.f19137x)) * 31) + this.f19138y.hashCode()) * 31) + this.f19139z.hashCode()) * 31) + Integer.hashCode(this.A)) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31;
        boolean z10 = this.D;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.E;
        return ((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + getType().hashCode();
    }

    public final boolean i() {
        return this.D;
    }

    public String toString() {
        return "StreamingGiftRankingCurrentUserRankBindModel(eventId=" + this.f19136w + ", backgroundResourceId=" + this.f19137x + ", eventTitleText=" + this.f19138y + ", rankText=" + this.f19139z + ", rankingPoint=" + this.A + ", eventBannerImageUrl=" + this.B + ", eventBannerLinkUrl=" + this.C + ", isVisibleGiftPointImage=" + this.D + ", isVisibleFocusedEventImage=" + this.E + ", type=" + getType() + ')';
    }

    public /* synthetic */ t0(int i10, int i11, String str, String str2, int i12, String str3, String str4, boolean z10, boolean z11, a.EnumC0862a enumC0862a, int i13, jo.h hVar) {
        this(i10, i11, str, str2, i12, str3, str4, z10, z11, (i13 & 512) != 0 ? a.EnumC0862a.GIFT_RANKING_CURRENT_USER_RANK : enumC0862a);
    }
}
