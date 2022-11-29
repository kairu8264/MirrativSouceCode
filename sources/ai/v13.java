package ai;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class v13<T> extends l13<T> implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final l13<? super T> f10920w;

    public v13(l13<? super T> l13Var) {
        this.f10920w = l13Var;
    }

    @Override // ai.l13
    public final <S extends T> l13<S> a() {
        return (l13<? super T>) this.f10920w;
    }

    @Override // ai.l13, java.util.Comparator
    public final int compare(T t10, T t11) {
        return this.f10920w.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v13) {
            return this.f10920w.equals(((v13) obj).f10920w);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f10920w.hashCode();
    }

    public final String toString() {
        return this.f10920w.toString().concat(".reverse()");
    }
}
