package n3;

/* loaded from: classes.dex */
public class d<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f41559a;

    /* renamed from: b  reason: collision with root package name */
    public final S f41560b;

    public d(F f10, S s10) {
        this.f41559a = f10;
        this.f41560b = s10;
    }

    public static <A, B> d<A, B> a(A a10, B b10) {
        return new d<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return c.a(dVar.f41559a, this.f41559a) && c.a(dVar.f41560b, this.f41560b);
        }
        return false;
    }

    public int hashCode() {
        F f10 = this.f41559a;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f41560b;
        return hashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f41559a + " " + this.f41560b + "}";
    }
}
