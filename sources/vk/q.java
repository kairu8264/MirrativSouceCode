package vk;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f57460a;

    /* renamed from: b  reason: collision with root package name */
    public final int f57461b;

    /* renamed from: c  reason: collision with root package name */
    public final int f57462c;

    public q(Class<?> cls, int i10, int i11) {
        this.f57460a = (Class) z.c(cls, "Null dependency anInterface.");
        this.f57461b = i10;
        this.f57462c = i11;
    }

    public static q a(Class<?> cls) {
        return new q(cls, 0, 2);
    }

    public static String b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i10);
            }
            return "provider";
        }
        return "direct";
    }

    @Deprecated
    public static q h(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    public static q i(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q j(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q k(Class<?> cls) {
        return new q(cls, 1, 1);
    }

    public static q l(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public Class<?> c() {
        return this.f57460a;
    }

    public boolean d() {
        return this.f57462c == 2;
    }

    public boolean e() {
        return this.f57462c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.f57460a == qVar.f57460a && this.f57461b == qVar.f57461b && this.f57462c == qVar.f57462c;
        }
        return false;
    }

    public boolean f() {
        return this.f57461b == 1;
    }

    public boolean g() {
        return this.f57461b == 2;
    }

    public int hashCode() {
        return ((((this.f57460a.hashCode() ^ 1000003) * 1000003) ^ this.f57461b) * 1000003) ^ this.f57462c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f57460a);
        sb2.append(", type=");
        int i10 = this.f57461b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(b(this.f57462c));
        sb2.append("}");
        return sb2.toString();
    }
}
