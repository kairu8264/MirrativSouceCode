package xn;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public class x extends w {
    public static final <T> boolean A(Iterable<? extends T> iterable, io.l<? super T, Boolean> lVar, boolean z10) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (lVar.invoke((T) it.next()).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static final <T> boolean B(List<T> list, io.l<? super T, Boolean> lVar, boolean z10) {
        if (!(list instanceof RandomAccess)) {
            jo.p.f(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return A(jo.j0.b(list), lVar, z10);
        }
        i0 it = new po.i(0, s.l(list)).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int b10 = it.b();
            T t10 = list.get(b10);
            if (lVar.invoke(t10).booleanValue() != z10) {
                if (i10 != b10) {
                    list.set(i10, t10);
                }
                i10++;
            }
        }
        if (i10 >= list.size()) {
            return false;
        }
        int l10 = s.l(list);
        if (i10 > l10) {
            return true;
        }
        while (true) {
            list.remove(l10);
            if (l10 == i10) {
                return true;
            }
            l10--;
        }
    }

    public static final <T> boolean C(List<T> list, io.l<? super T, Boolean> lVar) {
        jo.p.h(list, "<this>");
        jo.p.h(lVar, "predicate");
        return B(list, lVar, true);
    }

    public static final <T> T D(List<T> list) {
        jo.p.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static final <T> T E(List<T> list) {
        jo.p.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static final <T> T F(List<T> list) {
        jo.p.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(s.l(list));
    }

    public static final <T> T G(List<T> list) {
        jo.p.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(s.l(list));
    }

    public static final <T> boolean y(Collection<? super T> collection, Iterable<? extends T> iterable) {
        jo.p.h(collection, "<this>");
        jo.p.h(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static final <T> boolean z(Collection<? super T> collection, T[] tArr) {
        jo.p.h(collection, "<this>");
        jo.p.h(tArr, "elements");
        return collection.addAll(n.c(tArr));
    }
}
