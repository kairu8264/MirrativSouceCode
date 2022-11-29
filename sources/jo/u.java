package jo;

/* loaded from: classes4.dex */
public final class u implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f38151a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38152b;

    public u(Class<?> cls, String str) {
        p.h(cls, "jClass");
        p.h(str, "moduleName");
        this.f38151a = cls;
        this.f38152b = str;
    }

    @Override // jo.e
    public Class<?> b() {
        return this.f38151a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && p.c(b(), ((u) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
