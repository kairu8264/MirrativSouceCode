package ud;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class g1 implements Serializable {
    public static final a I = new a(null);
    public final String A;
    public final String B;
    public final String C;
    public final int D;
    public final int E;
    public final int F;
    public final boolean G;
    public final boolean H;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f54959w;

    /* renamed from: x  reason: collision with root package name */
    public final String f54960x;

    /* renamed from: y  reason: collision with root package name */
    public final String f54961y;

    /* renamed from: z  reason: collision with root package name */
    public final String f54962z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g1 a(boolean z10, int i10, int i11, int i12, String str, String str2, String str3, String str4, String str5) {
            jo.p.h(str, "userId");
            jo.p.h(str2, "userName");
            String valueOf = String.valueOf(i11);
            boolean z11 = false;
            boolean z12 = !(str4 == null || str4.length() == 0);
            if (str5 == null || str5.length() == 0) {
                z11 = true;
            }
            return new g1(z10, valueOf, str, str3, str4, str5, str2, i11, i10, i12, z12, !z11);
        }
    }

    public g1(boolean z10, String str, String str2, String str3, String str4, String str5, String str6, int i10, int i11, int i12, boolean z11, boolean z12) {
        jo.p.h(str, "rankText");
        jo.p.h(str2, "userId");
        jo.p.h(str6, "profileNameText");
        this.f54959w = z10;
        this.f54960x = str;
        this.f54961y = str2;
        this.f54962z = str3;
        this.A = str4;
        this.B = str5;
        this.C = str6;
        this.D = i10;
        this.E = i11;
        this.F = i12;
        this.G = z11;
        this.H = z12;
    }

    public final int a() {
        return this.D;
    }

    public final int b() {
        return this.E;
    }

    public final String c() {
        return this.B;
    }

    public final String d() {
        return this.A;
    }

    public final int e() {
        return this.F;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            return this.f54959w == g1Var.f54959w && jo.p.c(this.f54960x, g1Var.f54960x) && jo.p.c(this.f54961y, g1Var.f54961y) && jo.p.c(this.f54962z, g1Var.f54962z) && jo.p.c(this.A, g1Var.A) && jo.p.c(this.B, g1Var.B) && jo.p.c(this.C, g1Var.C) && this.D == g1Var.D && this.E == g1Var.E && this.F == g1Var.F && this.G == g1Var.G && this.H == g1Var.H;
        }
        return false;
    }

    public final String f() {
        return this.f54962z;
    }

    public final String g() {
        return this.C;
    }

    public final String h() {
        return this.f54961y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f54959w;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int hashCode = ((((r02 * 31) + this.f54960x.hashCode()) * 31) + this.f54961y.hashCode()) * 31;
        String str = this.f54962z;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.B;
        int hashCode4 = (((((((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.C.hashCode()) * 31) + Integer.hashCode(this.D)) * 31) + Integer.hashCode(this.E)) * 31) + Integer.hashCode(this.F)) * 31;
        ?? r22 = this.G;
        int i10 = r22;
        if (r22 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode4 + i10) * 31;
        boolean z11 = this.H;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean i() {
        return this.H;
    }

    public final boolean j() {
        return this.G;
    }

    public final boolean k() {
        return this.f54959w;
    }

    public String toString() {
        return "GiftRankingRankUpUserBindModel(isVisibleProfileGiftBoxImage=" + this.f54959w + ", rankText=" + this.f54960x + ", userId=" + this.f54961y + ", profileImageUrl=" + this.f54962z + ", profileBadgeImageUrl=" + this.A + ", catalogLabelImageUrl=" + this.B + ", profileNameText=" + this.C + ", afterRank=" + this.D + ", beforeRank=" + this.E + ", profileGiftPoint=" + this.F + ", isVisibleProfileBadgeImage=" + this.G + ", isVisibleCatalogLabelImage=" + this.H + ')';
    }
}
