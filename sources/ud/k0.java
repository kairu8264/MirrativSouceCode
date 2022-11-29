package ud;

/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f55078a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55079b;

    /* renamed from: c  reason: collision with root package name */
    public final String f55080c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f55081d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f55082e;

    /* renamed from: f  reason: collision with root package name */
    public final int f55083f;

    public k0(String str, String str2, String str3, boolean z10, boolean z11) {
        jo.p.h(str, "itemImageUrl");
        jo.p.h(str2, "profileImageUrl");
        jo.p.h(str3, "title");
        this.f55078a = str;
        this.f55079b = str2;
        this.f55080c = str3;
        this.f55081d = z10;
        this.f55082e = z11;
        this.f55083f = z10 ? nd.y0.gift_gacha_fever_profile_background : nd.y0.oval_whitethree;
    }

    public final String a() {
        return this.f55078a;
    }

    public final int b() {
        return this.f55083f;
    }

    public final String c() {
        return this.f55079b;
    }

    public final String d() {
        return this.f55080c;
    }

    public final boolean e() {
        return this.f55081d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            return jo.p.c(this.f55078a, k0Var.f55078a) && jo.p.c(this.f55079b, k0Var.f55079b) && jo.p.c(this.f55080c, k0Var.f55080c) && this.f55081d == k0Var.f55081d && this.f55082e == k0Var.f55082e;
        }
        return false;
    }

    public final boolean f() {
        return this.f55082e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f55078a.hashCode() * 31) + this.f55079b.hashCode()) * 31) + this.f55080c.hashCode()) * 31;
        boolean z10 = this.f55081d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f55082e;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "GiftGachaOpenResultHeaderBindModel(itemImageUrl=" + this.f55078a + ", profileImageUrl=" + this.f55079b + ", title=" + this.f55080c + ", isFever=" + this.f55081d + ", isVisibleProfileImage=" + this.f55082e + ')';
    }

    public /* synthetic */ k0(String str, String str2, String str3, boolean z10, boolean z11, int i10, jo.h hVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? true : z11);
    }
}
