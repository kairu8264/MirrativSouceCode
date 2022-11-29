package ud;

/* loaded from: classes2.dex */
public final class v1 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f55594e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f55595a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55596b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55597c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f55598d;

    public v1(String str, String str2, int i10, boolean z10) {
        jo.p.h(str, "giftId");
        jo.p.h(str2, "giftImageUrl");
        this.f55595a = str;
        this.f55596b = str2;
        this.f55597c = i10;
        this.f55598d = z10;
    }

    public final int a() {
        return this.f55597c;
    }

    public final String b() {
        return this.f55595a;
    }

    public final String c() {
        return this.f55596b;
    }

    public final boolean d() {
        return this.f55598d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            return jo.p.c(this.f55595a, v1Var.f55595a) && jo.p.c(this.f55596b, v1Var.f55596b) && this.f55597c == v1Var.f55597c && this.f55598d == v1Var.f55598d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f55595a.hashCode() * 31) + this.f55596b.hashCode()) * 31) + Integer.hashCode(this.f55597c)) * 31;
        boolean z10 = this.f55598d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "LiveGameGiftBindModel(giftId=" + this.f55595a + ", giftImageUrl=" + this.f55596b + ", coin=" + this.f55597c + ", isFeatureGift=" + this.f55598d + ')';
    }
}
