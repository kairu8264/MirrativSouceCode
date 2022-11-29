package xn;

/* loaded from: classes4.dex */
public final class f0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f60442a;

    /* renamed from: b  reason: collision with root package name */
    public final T f60443b;

    public f0(int i10, T t10) {
        this.f60442a = i10;
        this.f60443b = t10;
    }

    public final int a() {
        return this.f60442a;
    }

    public final T b() {
        return this.f60443b;
    }

    public final int c() {
        return this.f60442a;
    }

    public final T d() {
        return this.f60443b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return this.f60442a == f0Var.f60442a && jo.p.c(this.f60443b, f0Var.f60443b);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f60442a * 31;
        T t10 = this.f60443b;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f60442a + ", value=" + this.f60443b + ')';
    }
}
