package ai;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class jz2<T> extends l13<T> implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final Comparator<T> f5987w;

    public jz2(Comparator<T> comparator) {
        Objects.requireNonNull(comparator);
        this.f5987w = comparator;
    }

    @Override // ai.l13, java.util.Comparator
    public final int compare(T t10, T t11) {
        return this.f5987w.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jz2) {
            return this.f5987w.equals(((jz2) obj).f5987w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5987w.hashCode();
    }

    public final String toString() {
        return this.f5987w.toString();
    }
}
