package ai;

/* loaded from: classes3.dex */
public final class k5 {

    /* renamed from: f  reason: collision with root package name */
    public static final k5 f6083f = new b5().c();

    /* renamed from: g  reason: collision with root package name */
    public static final x2<k5> f6084g = y4.f12441a;

    /* renamed from: a  reason: collision with root package name */
    public final String f6085a;

    /* renamed from: b  reason: collision with root package name */
    public final j5 f6086b;

    /* renamed from: c  reason: collision with root package name */
    public final h5 f6087c;

    /* renamed from: d  reason: collision with root package name */
    public final o5 f6088d;

    /* renamed from: e  reason: collision with root package name */
    public final d5 f6089e;

    public /* synthetic */ k5(String str, d5 d5Var, j5 j5Var, h5 h5Var, o5 o5Var, i5 i5Var) {
        this.f6085a = str;
        this.f6086b = j5Var;
        this.f6087c = h5Var;
        this.f6088d = o5Var;
        this.f6089e = d5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k5) {
            k5 k5Var = (k5) obj;
            return sb.H(this.f6085a, k5Var.f6085a) && this.f6089e.equals(k5Var.f6089e) && sb.H(this.f6086b, k5Var.f6086b) && sb.H(this.f6087c, k5Var.f6087c) && sb.H(this.f6088d, k5Var.f6088d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f6085a.hashCode() * 31;
        j5 j5Var = this.f6086b;
        return ((((((hashCode + (j5Var != null ? j5Var.hashCode() : 0)) * 31) + this.f6087c.hashCode()) * 31) + this.f6089e.hashCode()) * 31) + this.f6088d.hashCode();
    }
}
