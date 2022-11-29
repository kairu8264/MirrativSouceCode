package y6;

/* loaded from: classes.dex */
public class i<T> {

    /* renamed from: a  reason: collision with root package name */
    public T f61277a;

    /* renamed from: b  reason: collision with root package name */
    public T f61278b;

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(T t10, T t11) {
        this.f61277a = t10;
        this.f61278b = t11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n3.d) {
            n3.d dVar = (n3.d) obj;
            return a(dVar.f41559a, this.f61277a) && a(dVar.f41560b, this.f61278b);
        }
        return false;
    }

    public int hashCode() {
        T t10 = this.f61277a;
        int hashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f61278b;
        return hashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f61277a + " " + this.f61278b + "}";
    }
}
