package ob;

import hb.v1;
import jf.u;
import jo.h;
import jo.p;
import ud.a;

/* loaded from: classes2.dex */
public final class c implements ud.a {
    public static final a J = new a(null);
    public final String A;
    public final String B;
    public final int C;
    public final int D;
    public final String E;
    public final String F;
    public final boolean G;
    public final boolean H;
    public final a.EnumC0862a I;

    /* renamed from: w  reason: collision with root package name */
    public final int f44595w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f44596x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f44597y;

    /* renamed from: z  reason: collision with root package name */
    public final int f44598z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(u uVar) {
            int i10;
            p.h(uVar, "event");
            int e10 = uVar.e();
            boolean o10 = uVar.o();
            boolean p10 = uVar.p();
            if (uVar.p()) {
                i10 = v1.bg_gift_ranking_user_event_focus;
            } else {
                i10 = v1.bg_gift_ranking_user_event_normal;
            }
            String f10 = uVar.f();
            String i11 = uVar.i();
            int length = uVar.i().length();
            return new c(e10, o10, p10, i10, f10, i11, (length == 1 || length == 2 || length == 3) ? 13 : length != 4 ? 9 : 10, uVar.j(), uVar.c(), uVar.d(), !uVar.o(), uVar.p(), null, 4096, null);
        }
    }

    public c(int i10, boolean z10, boolean z11, int i11, String str, String str2, int i12, int i13, String str3, String str4, boolean z12, boolean z13, a.EnumC0862a enumC0862a) {
        p.h(str, "eventTitleText");
        p.h(str2, "rankText");
        p.h(str3, "eventBannerImageUrl");
        p.h(str4, "eventBannerLinkUrl");
        p.h(enumC0862a, "type");
        this.f44595w = i10;
        this.f44596x = z10;
        this.f44597y = z11;
        this.f44598z = i11;
        this.A = str;
        this.B = str2;
        this.C = i12;
        this.D = i13;
        this.E = str3;
        this.F = str4;
        this.G = z12;
        this.H = z13;
        this.I = enumC0862a;
    }

    public final int a() {
        return this.f44598z;
    }

    public final String b() {
        return this.E;
    }

    public final String c() {
        return this.F;
    }

    public final int d() {
        return this.f44595w;
    }

    public final String e() {
        return this.B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f44595w == cVar.f44595w && this.f44596x == cVar.f44596x && this.f44597y == cVar.f44597y && this.f44598z == cVar.f44598z && p.c(this.A, cVar.A) && p.c(this.B, cVar.B) && this.C == cVar.C && this.D == cVar.D && p.c(this.E, cVar.E) && p.c(this.F, cVar.F) && this.G == cVar.G && this.H == cVar.H && getType() == cVar.getType();
        }
        return false;
    }

    public final int f() {
        return this.C;
    }

    public final int g() {
        return this.D;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.I;
    }

    public final boolean h() {
        return this.f44596x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f44595w) * 31;
        boolean z10 = this.f44596x;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f44597y;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int hashCode2 = (((((((((((((((i11 + i12) * 31) + Integer.hashCode(this.f44598z)) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + Integer.hashCode(this.C)) * 31) + Integer.hashCode(this.D)) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31;
        boolean z12 = this.G;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int i14 = (hashCode2 + i13) * 31;
        boolean z13 = this.H;
        return ((i14 + (z13 ? 1 : z13 ? 1 : 0)) * 31) + getType().hashCode();
    }

    public final boolean i() {
        return this.f44597y;
    }

    public final boolean j() {
        return this.H;
    }

    public String toString() {
        return "PlayerGiftRankingUserRankBindModel(eventId=" + this.f44595w + ", isAppEvent=" + this.f44596x + ", isFocusedEvent=" + this.f44597y + ", backgroundResourceId=" + this.f44598z + ", eventTitleText=" + this.A + ", rankText=" + this.B + ", rankTextSize=" + this.C + ", rankingPoint=" + this.D + ", eventBannerImageUrl=" + this.E + ", eventBannerLinkUrl=" + this.F + ", isVisibleGiftPointImage=" + this.G + ", isVisibleFocusedEventImage=" + this.H + ", type=" + getType() + ')';
    }

    public /* synthetic */ c(int i10, boolean z10, boolean z11, int i11, String str, String str2, int i12, int i13, String str3, String str4, boolean z12, boolean z13, a.EnumC0862a enumC0862a, int i14, h hVar) {
        this(i10, z10, z11, i11, str, str2, i12, i13, str3, str4, z12, z13, (i14 & 4096) != 0 ? a.EnumC0862a.GIFT_RANKING_CURRENT_USER_RANK : enumC0862a);
    }
}
