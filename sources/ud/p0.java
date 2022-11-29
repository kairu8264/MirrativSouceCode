package ud;

import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaItem;
import ud.i0;

/* loaded from: classes2.dex */
public final class p0 implements i0 {

    /* renamed from: h  reason: collision with root package name */
    public static final a f55309h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f55310i = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f55311a;

    /* renamed from: b  reason: collision with root package name */
    public final int f55312b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f55313c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f55314d;

    /* renamed from: e  reason: collision with root package name */
    public final int f55315e;

    /* renamed from: f  reason: collision with root package name */
    public long f55316f;

    /* renamed from: g  reason: collision with root package name */
    public final i0.a f55317g;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p0 a(GiftGachaItem giftGachaItem, long j10) {
            jo.p.h(giftGachaItem, "giftGachaItem");
            return new p0(giftGachaItem.getImageUrl(), giftGachaItem.getRarity(), giftGachaItem.isNew(), giftGachaItem.getDuplicatedPoint() > 0, giftGachaItem.getDuplicatedPoint(), j10, null, 64, null);
        }
    }

    public p0(String str, int i10, boolean z10, boolean z11, int i11, long j10, i0.a aVar) {
        jo.p.h(str, "itemImageUrl");
        jo.p.h(aVar, "type");
        this.f55311a = str;
        this.f55312b = i10;
        this.f55313c = z10;
        this.f55314d = z11;
        this.f55315e = i11;
        this.f55316f = j10;
        this.f55317g = aVar;
    }

    public final int a() {
        return this.f55315e;
    }

    public final long b() {
        return this.f55316f;
    }

    public final String c() {
        return this.f55311a;
    }

    public final int d() {
        return this.f55312b;
    }

    public final boolean e() {
        return this.f55314d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            return jo.p.c(this.f55311a, p0Var.f55311a) && this.f55312b == p0Var.f55312b && this.f55313c == p0Var.f55313c && this.f55314d == p0Var.f55314d && this.f55315e == p0Var.f55315e && this.f55316f == p0Var.f55316f && getType() == p0Var.getType();
        }
        return false;
    }

    public final boolean f() {
        return this.f55313c;
    }

    @Override // ud.i0
    public i0.a getType() {
        return this.f55317g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f55311a.hashCode() * 31) + Integer.hashCode(this.f55312b)) * 31;
        boolean z10 = this.f55313c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f55314d;
        return ((((((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Integer.hashCode(this.f55315e)) * 31) + Long.hashCode(this.f55316f)) * 31) + getType().hashCode();
    }

    public String toString() {
        return "GiftGachaStreamerRareItemBindModel(itemImageUrl=" + this.f55311a + ", rarity=" + this.f55312b + ", isNew=" + this.f55313c + ", isDuplicated=" + this.f55314d + ", duplicatedPoint=" + this.f55315e + ", duplicatedPointAnimationAt=" + this.f55316f + ", type=" + getType() + ')';
    }

    public /* synthetic */ p0(String str, int i10, boolean z10, boolean z11, int i11, long j10, i0.a aVar, int i12, jo.h hVar) {
        this(str, i10, z10, z11, i11, j10, (i12 & 64) != 0 ? i0.a.STREAMER_RARE : aVar);
    }
}
