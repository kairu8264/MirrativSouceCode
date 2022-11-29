package hi;

/* loaded from: classes3.dex */
public final class t6<T> extends v6<T> {

    /* renamed from: w  reason: collision with root package name */
    public static final t6<Object> f35999w = new t6<>();

    @Override // hi.v6
    public final T a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // hi.v6
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
