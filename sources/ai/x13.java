package ai;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class x13 {
    public static int a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }

    public static boolean b(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }

    public static boolean c(Set<?> set, Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof i13) {
            collection = ((i13) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator<?> it = set.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        return b(set, collection.iterator());
    }
}
