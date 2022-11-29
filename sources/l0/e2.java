package l0;

/* loaded from: classes.dex */
public final class e2<T> implements c2<T> {

    /* renamed from: w  reason: collision with root package name */
    public final T f38981w;

    public e2(T t10) {
        this.f38981w = t10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2) && jo.p.c(getValue(), ((e2) obj).getValue());
    }

    @Override // l0.c2
    public T getValue() {
        return this.f38981w;
    }

    public int hashCode() {
        if (getValue() == null) {
            return 0;
        }
        return getValue().hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + getValue() + ')';
    }
}
