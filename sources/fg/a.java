package fg;

/* loaded from: classes3.dex */
public final class a<T> implements rn.a<T>, eg.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f31975c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile rn.a<T> f31976a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f31977b = f31975c;

    public a(rn.a<T> aVar) {
        this.f31976a = aVar;
    }

    public static <P extends rn.a<T>, T> eg.a<T> a(P p10) {
        if (p10 instanceof eg.a) {
            return (eg.a) p10;
        }
        return new a((rn.a) d.b(p10));
    }

    public static <P extends rn.a<T>, T> rn.a<T> b(P p10) {
        d.b(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    public static Object c(Object obj, Object obj2) {
        if (!(obj != f31975c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // rn.a
    public T get() {
        T t10 = (T) this.f31977b;
        Object obj = f31975c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f31977b;
                if (t10 == obj) {
                    t10 = this.f31976a.get();
                    this.f31977b = c(this.f31977b, t10);
                    this.f31976a = null;
                }
            }
        }
        return t10;
    }
}
