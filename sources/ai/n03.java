package ai;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class n03 {
    public static <T> T a(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static void b(Iterator<?> it) {
        Objects.requireNonNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
