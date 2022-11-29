package lk;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class w {
    public static <E> Collection<E> a(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : z.g(iterable.iterator());
    }

    @NullableDecl
    public static <T> T b(Iterable<? extends T> iterable, @NullableDecl T t10) {
        return (T) x.h(iterable.iterator(), t10);
    }

    public static <T> T c(Iterable<T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return (T) d(list);
            }
            throw new NoSuchElementException();
        }
        return (T) x.g(iterable.iterator());
    }

    public static <T> T d(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static Object[] e(Iterable<?> iterable) {
        return a(iterable).toArray();
    }

    public static String f(Iterable<?> iterable) {
        return x.l(iterable.iterator());
    }
}
