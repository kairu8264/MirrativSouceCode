package ud;

import com.dena.mirrorman.net.api.response.GiftGachaStockType;
import com.dena.mirrorman.net.api.response.SimpleGiftGachaStock;
import ud.n0;

/* loaded from: classes2.dex */
public final class m0 implements n0 {

    /* renamed from: l  reason: collision with root package name */
    public static final a f55186l = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f55187a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55188b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55189c;

    /* renamed from: d  reason: collision with root package name */
    public final GiftGachaStockType f55190d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55191e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55192f;

    /* renamed from: g  reason: collision with root package name */
    public final int f55193g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f55194h;

    /* renamed from: i  reason: collision with root package name */
    public final int f55195i;

    /* renamed from: j  reason: collision with root package name */
    public final int f55196j;

    /* renamed from: k  reason: collision with root package name */
    public final n0.a f55197k;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m0 a(SimpleGiftGachaStock simpleGiftGachaStock) {
            jo.p.h(simpleGiftGachaStock, "giftGachaStock");
            return new m0(simpleGiftGachaStock.getGiftEventId(), simpleGiftGachaStock.getSenderId(), simpleGiftGachaStock.getCollabUserId(), simpleGiftGachaStock.getType(), simpleGiftGachaStock.getStockImageUrl(), simpleGiftGachaStock.getImageUrl(), simpleGiftGachaStock.getType().isFever() ? nd.y0.gift_gacha_fever_profile_background : nd.y0.oval_whitethree, simpleGiftGachaStock.getType().isFever(), simpleGiftGachaStock.getCount(), simpleGiftGachaStock.getTime(), null, 1024, null);
        }
    }

    public m0(int i10, String str, int i11, GiftGachaStockType giftGachaStockType, String str2, String str3, int i12, boolean z10, int i13, int i14, n0.a aVar) {
        jo.p.h(str, "senderId");
        jo.p.h(giftGachaStockType, "giftGachaStockType");
        jo.p.h(str2, "stockImageUrl");
        jo.p.h(str3, "profileImageUrl");
        jo.p.h(aVar, "type");
        this.f55187a = i10;
        this.f55188b = str;
        this.f55189c = i11;
        this.f55190d = giftGachaStockType;
        this.f55191e = str2;
        this.f55192f = str3;
        this.f55193g = i12;
        this.f55194h = z10;
        this.f55195i = i13;
        this.f55196j = i14;
        this.f55197k = aVar;
    }

    @Override // ud.n0
    public int a() {
        return this.f55196j;
    }

    public final int b() {
        return this.f55189c;
    }

    public final int c() {
        return this.f55195i;
    }

    public final int d() {
        return this.f55187a;
    }

    public final GiftGachaStockType e() {
        return this.f55190d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            return this.f55187a == m0Var.f55187a && jo.p.c(this.f55188b, m0Var.f55188b) && this.f55189c == m0Var.f55189c && this.f55190d == m0Var.f55190d && jo.p.c(this.f55191e, m0Var.f55191e) && jo.p.c(this.f55192f, m0Var.f55192f) && this.f55193g == m0Var.f55193g && this.f55194h == m0Var.f55194h && this.f55195i == m0Var.f55195i && a() == m0Var.a() && getType() == m0Var.getType();
        }
        return false;
    }

    public final int f() {
        return this.f55193g;
    }

    public final String g() {
        return this.f55192f;
    }

    @Override // ud.n0
    public n0.a getType() {
        return this.f55197k;
    }

    public final String h() {
        return this.f55188b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.f55187a) * 31) + this.f55188b.hashCode()) * 31) + Integer.hashCode(this.f55189c)) * 31) + this.f55190d.hashCode()) * 31) + this.f55191e.hashCode()) * 31) + this.f55192f.hashCode()) * 31) + Integer.hashCode(this.f55193g)) * 31;
        boolean z10 = this.f55194h;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((hashCode + i10) * 31) + Integer.hashCode(this.f55195i)) * 31) + Integer.hashCode(a())) * 31) + getType().hashCode();
    }

    public final String i() {
        return this.f55191e;
    }

    public final boolean j() {
        return this.f55194h;
    }

    public String toString() {
        return "GiftGachaStockBindModel(giftEventId=" + this.f55187a + ", senderId=" + this.f55188b + ", collabUserId=" + this.f55189c + ", giftGachaStockType=" + this.f55190d + ", stockImageUrl=" + this.f55191e + ", profileImageUrl=" + this.f55192f + ", profileBackgroundResId=" + this.f55193g + ", isVisibleFeverImageView=" + this.f55194h + ", count=" + this.f55195i + ", time=" + a() + ", type=" + getType() + ')';
    }

    public /* synthetic */ m0(int i10, String str, int i11, GiftGachaStockType giftGachaStockType, String str2, String str3, int i12, boolean z10, int i13, int i14, n0.a aVar, int i15, jo.h hVar) {
        this(i10, str, i11, giftGachaStockType, str2, str3, i12, z10, i13, i14, (i15 & 1024) != 0 ? n0.a.GIFT_GACHA_STOCK : aVar);
    }
}
