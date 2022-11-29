package pn;

/* loaded from: classes4.dex */
public final class a<T> implements rn.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f48454c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile rn.a<T> f48455a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f48456b = f48454c;

    public a(rn.a<T> aVar) {
        this.f48455a = aVar;
    }

    public static <P extends rn.a<T>, T> rn.a<T> a(P p10) {
        b.b(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f48454c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // rn.a
    public T get() {
        T t10 = (T) this.f48456b;
        Object obj = f48454c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f48456b;
                if (t10 == obj) {
                    t10 = this.f48455a.get();
                    this.f48456b = b(this.f48456b, t10);
                    this.f48455a = null;
                }
            }
        }
        return t10;
    }
}
