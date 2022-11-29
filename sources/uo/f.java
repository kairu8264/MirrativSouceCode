package uo;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class f {
    public static final <T> Object a(Collection<? extends y0<? extends T>> collection, ao.d<? super List<? extends T>> dVar) {
        if (collection.isEmpty()) {
            return xn.s.k();
        }
        Object[] array = collection.toArray(new y0[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new e((y0[]) array).b(dVar);
    }

    public static final <T> Object b(y0<? extends T>[] y0VarArr, ao.d<? super List<? extends T>> dVar) {
        return y0VarArr.length == 0 ? xn.s.k() : new e(y0VarArr).b(dVar);
    }
}
