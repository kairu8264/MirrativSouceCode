package ai;

import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class l13<T> implements Comparator<T> {
    public static <C extends Comparable> l13<C> b() {
        return j13.f5588w;
    }

    public static <T> l13<T> c(Comparator<T> comparator) {
        if (comparator instanceof l13) {
            return (l13) comparator;
        }
        return new jz2(comparator);
    }

    public <S extends T> l13<S> a() {
        return new v13(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);
}
