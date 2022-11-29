package ud;

import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaItem;
import ud.i0;

/* loaded from: classes2.dex */
public final class l0 implements i0 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f55109j = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f55110a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55111b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55112c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f55113d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f55114e;

    /* renamed from: f  reason: collision with root package name */
    public final int f55115f;

    /* renamed from: g  reason: collision with root package name */
    public final long f55116g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f55117h;

    /* renamed from: i  reason: collision with root package name */
    public final i0.a f55118i;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l0 a(GiftGachaItem giftGachaItem, String str, long j10, boolean z10) {
            jo.p.h(giftGachaItem, "giftGachaItem");
            jo.p.h(str, "gachaImageUrl");
            return new l0(giftGachaItem.getImageUrl(), str, giftGachaItem.getRarity(), giftGachaItem.isNew(), giftGachaItem.getDuplicatedPoint() > 0, giftGachaItem.getDuplicatedPoint(), j10, z10, null, 256, null);
        }
    }

    public l0(String str, String str2, int i10, boolean z10, boolean z11, int i11, long j10, boolean z12, i0.a aVar) {
        jo.p.h(str, "itemImageUrl");
        jo.p.h(str2, "gachaImageUrl");
        jo.p.h(aVar, "type");
        this.f55110a = str;
        this.f55111b = str2;
        this.f55112c = i10;
        this.f55113d = z10;
        this.f55114e = z11;
        this.f55115f = i11;
        this.f55116g = j10;
        this.f55117h = z12;
        this.f55118i = aVar;
    }

    public final int a() {
        return this.f55115f;
    }

    public final String b() {
        return this.f55111b;
    }

    public final String c() {
        return this.f55110a;
    }

    public final long d() {
        return this.f55116g;
    }

    public final int e() {
        return this.f55112c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            return jo.p.c(this.f55110a, l0Var.f55110a) && jo.p.c(this.f55111b, l0Var.f55111b) && this.f55112c == l0Var.f55112c && this.f55113d == l0Var.f55113d && this.f55114e == l0Var.f55114e && this.f55115f == l0Var.f55115f && this.f55116g == l0Var.f55116g && this.f55117h == l0Var.f55117h && getType() == l0Var.getType();
        }
        return false;
    }

    public final boolean f() {
        return this.f55114e;
    }

    public final boolean g() {
        return this.f55117h;
    }

    @Override // ud.i0
    public i0.a getType() {
        return this.f55118i;
    }

    public final boolean h() {
        return this.f55113d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f55110a.hashCode() * 31) + this.f55111b.hashCode()) * 31) + Integer.hashCode(this.f55112c)) * 31;
        boolean z10 = this.f55113d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f55114e;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int hashCode2 = (((((i11 + i12) * 31) + Integer.hashCode(this.f55115f)) * 31) + Long.hashCode(this.f55116g)) * 31;
        boolean z12 = this.f55117h;
        return ((hashCode2 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + getType().hashCode();
    }

    public String toString() {
        return "GiftGachaRareItemBindModel(itemImageUrl=" + this.f55110a + ", gachaImageUrl=" + this.f55111b + ", rarity=" + this.f55112c + ", isNew=" + this.f55113d + ", isDuplicated=" + this.f55114e + ", duplicatedPoint=" + this.f55115f + ", openAt=" + this.f55116g + ", isEnabledGachaAnimation=" + this.f55117h + ", type=" + getType() + ')';
    }

    public /* synthetic */ l0(String str, String str2, int i10, boolean z10, boolean z11, int i11, long j10, boolean z12, i0.a aVar, int i12, jo.h hVar) {
        this(str, str2, i10, z10, z11, i11, j10, z12, (i12 & 256) != 0 ? i0.a.RARE : aVar);
    }
}
