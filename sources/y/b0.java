package y;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f60680a;

    /* renamed from: b  reason: collision with root package name */
    public final int f60681b;

    /* renamed from: c  reason: collision with root package name */
    public final int f60682c;

    /* renamed from: d  reason: collision with root package name */
    public final int f60683d;

    public b0(int i10, int i11, int i12, int i13) {
        this.f60680a = i10;
        this.f60681b = i11;
        this.f60682c = i12;
        this.f60683d = i13;
    }

    public final int a() {
        return this.f60683d;
    }

    public final int b() {
        return this.f60680a;
    }

    public final int c() {
        return this.f60682c;
    }

    public final int d() {
        return this.f60681b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            return this.f60680a == b0Var.f60680a && this.f60681b == b0Var.f60681b && this.f60682c == b0Var.f60682c && this.f60683d == b0Var.f60683d;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f60680a * 31) + this.f60681b) * 31) + this.f60682c) * 31) + this.f60683d;
    }

    public String toString() {
        return "InsetsValues(left=" + this.f60680a + ", top=" + this.f60681b + ", right=" + this.f60682c + ", bottom=" + this.f60683d + ')';
    }
}
