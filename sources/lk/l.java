package lk;

import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class l<T> extends k0<T> implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final Comparator<T> f40324w;

    public l(Comparator<T> comparator) {
        this.f40324w = (Comparator) kk.j.i(comparator);
    }

    @Override // lk.k0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f40324w.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return this.f40324w.equals(((l) obj).f40324w);
        }
        return false;
    }

    public int hashCode() {
        return this.f40324w.hashCode();
    }

    public String toString() {
        return this.f40324w.toString();
    }
}
