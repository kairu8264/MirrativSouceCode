package ud;

import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaItem;
import ud.i0;

/* loaded from: classes2.dex */
public final class j0 implements i0 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f55043i = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f55044a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55045b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55046c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f55047d;

    /* renamed from: e  reason: collision with root package name */
    public final int f55048e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f55049f;

    /* renamed from: g  reason: collision with root package name */
    public final long f55050g;

    /* renamed from: h  reason: collision with root package name */
    public final i0.a f55051h;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j0 a(GiftGachaItem giftGachaItem, String str, long j10) {
            jo.p.h(giftGachaItem, "giftGachaItem");
            jo.p.h(str, "gachaImageUrl");
            return new j0(giftGachaItem.getImageUrl(), str, giftGachaItem.getRarity(), giftGachaItem.isNew(), giftGachaItem.getDuplicatedPoint(), giftGachaItem.getDuplicatedPoint() > 0, j10, null, 128, null);
        }
    }

    public j0(String str, String str2, int i10, boolean z10, int i11, boolean z11, long j10, i0.a aVar) {
        jo.p.h(str, "itemImageUrl");
        jo.p.h(str2, "gachaImageUrl");
        jo.p.h(aVar, "type");
        this.f55044a = str;
        this.f55045b = str2;
        this.f55046c = i10;
        this.f55047d = z10;
        this.f55048e = i11;
        this.f55049f = z11;
        this.f55050g = j10;
        this.f55051h = aVar;
    }

    public final int a() {
        return this.f55048e;
    }

    public final String b() {
        return this.f55045b;
    }

    public final String c() {
        return this.f55044a;
    }

    public final long d() {
        return this.f55050g;
    }

    public final int e() {
        return this.f55046c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            return jo.p.c(this.f55044a, j0Var.f55044a) && jo.p.c(this.f55045b, j0Var.f55045b) && this.f55046c == j0Var.f55046c && this.f55047d == j0Var.f55047d && this.f55048e == j0Var.f55048e && this.f55049f == j0Var.f55049f && this.f55050g == j0Var.f55050g && getType() == j0Var.getType();
        }
        return false;
    }

    public final boolean f() {
        return this.f55049f;
    }

    public final boolean g() {
        return this.f55047d;
    }

    @Override // ud.i0
    public i0.a getType() {
        return this.f55051h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f55044a.hashCode() * 31) + this.f55045b.hashCode()) * 31) + Integer.hashCode(this.f55046c)) * 31;
        boolean z10 = this.f55047d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((hashCode + i10) * 31) + Integer.hashCode(this.f55048e)) * 31;
        boolean z11 = this.f55049f;
        return ((((hashCode2 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Long.hashCode(this.f55050g)) * 31) + getType().hashCode();
    }

    public String toString() {
        return "GiftGachaNormalItemBindModel(itemImageUrl=" + this.f55044a + ", gachaImageUrl=" + this.f55045b + ", rarity=" + this.f55046c + ", isNew=" + this.f55047d + ", duplicatedPoint=" + this.f55048e + ", isDuplicated=" + this.f55049f + ", openAt=" + this.f55050g + ", type=" + getType() + ')';
    }

    public /* synthetic */ j0(String str, String str2, int i10, boolean z10, int i11, boolean z11, long j10, i0.a aVar, int i12, jo.h hVar) {
        this(str, str2, i10, z10, i11, z11, j10, (i12 & 128) != 0 ? i0.a.NORMAL : aVar);
    }
}
