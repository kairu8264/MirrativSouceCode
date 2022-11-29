package i8;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f36429a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f36430b;

    /* renamed from: c  reason: collision with root package name */
    public Class<?> f36431c;

    public i() {
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f36429a = cls;
        this.f36430b = cls2;
        this.f36431c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f36429a.equals(iVar.f36429a) && this.f36430b.equals(iVar.f36430b) && k.d(this.f36431c, iVar.f36431c);
    }

    public int hashCode() {
        int hashCode = ((this.f36429a.hashCode() * 31) + this.f36430b.hashCode()) * 31;
        Class<?> cls = this.f36431c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f36429a + ", second=" + this.f36430b + '}';
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}
