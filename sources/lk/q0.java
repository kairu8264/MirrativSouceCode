package lk;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class q0<T> extends k0<T> implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final k0<? super T> f40347w;

    public q0(k0<? super T> k0Var) {
        this.f40347w = (k0) kk.j.i(k0Var);
    }

    @Override // lk.k0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f40347w.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0) {
            return this.f40347w.equals(((q0) obj).f40347w);
        }
        return false;
    }

    @Override // lk.k0
    public <S extends T> k0<S> f() {
        return (k0<? super T>) this.f40347w;
    }

    public int hashCode() {
        return -this.f40347w.hashCode();
    }

    public String toString() {
        return this.f40347w + ".reverse()";
    }
}
