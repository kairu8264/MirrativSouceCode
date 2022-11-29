package ud;

import com.dena.mirrorman.net.bcsvr.response.MutualGiftAchievedBcsvrResponse;
import ud.n0;

/* loaded from: classes2.dex */
public final class o0 implements n0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f55276f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f55277a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55278b;

    /* renamed from: c  reason: collision with root package name */
    public final String f55279c;

    /* renamed from: d  reason: collision with root package name */
    public final int f55280d;

    /* renamed from: e  reason: collision with root package name */
    public final n0.a f55281e;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final o0 a(MutualGiftAchievedBcsvrResponse mutualGiftAchievedBcsvrResponse) {
            jo.p.h(mutualGiftAchievedBcsvrResponse, "mutualGiftAchievedBcsvrResponse");
            return new o0(mutualGiftAchievedBcsvrResponse.getEventId(), mutualGiftAchievedBcsvrResponse.getViewer().getUserId(), mutualGiftAchievedBcsvrResponse.getViewer().getProfileImageUrl(), mutualGiftAchievedBcsvrResponse.getAchievedAt(), null, 16, null);
        }
    }

    public o0(int i10, String str, String str2, int i11, n0.a aVar) {
        jo.p.h(str, "senderId");
        jo.p.h(str2, "profileImageUrl");
        jo.p.h(aVar, "type");
        this.f55277a = i10;
        this.f55278b = str;
        this.f55279c = str2;
        this.f55280d = i11;
        this.f55281e = aVar;
    }

    @Override // ud.n0
    public int a() {
        return this.f55280d;
    }

    public final int b() {
        return this.f55277a;
    }

    public final String c() {
        return this.f55279c;
    }

    public final String d() {
        return this.f55278b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            return this.f55277a == o0Var.f55277a && jo.p.c(this.f55278b, o0Var.f55278b) && jo.p.c(this.f55279c, o0Var.f55279c) && a() == o0Var.a() && getType() == o0Var.getType();
        }
        return false;
    }

    @Override // ud.n0
    public n0.a getType() {
        return this.f55281e;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f55277a) * 31) + this.f55278b.hashCode()) * 31) + this.f55279c.hashCode()) * 31) + Integer.hashCode(a())) * 31) + getType().hashCode();
    }

    public String toString() {
        return "GiftGachaStockMutualGiftBindModel(giftEventId=" + this.f55277a + ", senderId=" + this.f55278b + ", profileImageUrl=" + this.f55279c + ", time=" + a() + ", type=" + getType() + ')';
    }

    public /* synthetic */ o0(int i10, String str, String str2, int i11, n0.a aVar, int i12, jo.h hVar) {
        this(i10, str, str2, i11, (i12 & 16) != 0 ? n0.a.GIFT_GACHA_STOCK_MUTUAL : aVar);
    }
}
