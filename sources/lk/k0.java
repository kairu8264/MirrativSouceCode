package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public abstract class k0<T> implements Comparator<T> {
    public static <T> k0<T> a(Comparator<T> comparator) {
        return comparator instanceof k0 ? (k0) comparator : new l(comparator);
    }

    public static <C extends Comparable> k0<C> c() {
        return i0.f40309w;
    }

    public <E extends T> r<E> b(Iterable<E> iterable) {
        return r.J(this, iterable);
    }

    @Override // java.util.Comparator
    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t10, @NullableDecl T t11);

    public <T2 extends T> k0<Map.Entry<T2, ?>> d() {
        return (k0<Map.Entry<T2, ?>>) e(d0.d());
    }

    public <F> k0<F> e(kk.g<F, ? extends T> gVar) {
        return new h(gVar, this);
    }

    public <S extends T> k0<S> f() {
        return new q0(this);
    }
}
