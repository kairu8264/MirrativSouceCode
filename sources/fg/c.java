package fg;

/* loaded from: classes3.dex */
public final class c<T> implements b<T>, eg.a<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final c<Object> f31978b = new c<>(null);

    /* renamed from: a  reason: collision with root package name */
    public final T f31979a;

    public c(T t10) {
        this.f31979a = t10;
    }

    public static <T> b<T> a(T t10) {
        return new c(d.c(t10, "instance cannot be null"));
    }

    @Override // rn.a
    public T get() {
        return this.f31979a;
    }
}
