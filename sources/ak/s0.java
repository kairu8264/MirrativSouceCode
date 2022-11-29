package ak;

/* loaded from: classes3.dex */
public final class s0 extends a {

    /* renamed from: b  reason: collision with root package name */
    public final int f13631b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13632c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13633d;

    public s0(int i10, String str, String str2) {
        this.f13631b = i10;
        this.f13632c = str;
        this.f13633d = str2;
    }

    @Override // ak.a
    public final String a() {
        return this.f13633d;
    }

    @Override // ak.a
    public final int b() {
        return this.f13631b;
    }

    @Override // ak.a
    public final String c() {
        return this.f13632c;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f13631b == aVar.b() && ((str = this.f13632c) != null ? str.equals(aVar.c()) : aVar.c() == null) && ((str2 = this.f13633d) != null ? str2.equals(aVar.a()) : aVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f13631b ^ 1000003) * 1000003;
        String str = this.f13632c;
        int hashCode = (i10 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f13633d;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i10 = this.f13631b;
        String str = this.f13632c;
        String str2 = this.f13633d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb2.append("AssetPackLocation{packStorageMethod=");
        sb2.append(i10);
        sb2.append(", path=");
        sb2.append(str);
        sb2.append(", assetsPath=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
