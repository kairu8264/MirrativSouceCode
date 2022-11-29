package ai;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class r03 {
    public static <E> ArrayList<E> a(int i10) {
        xy2.b(i10, "initialArraySize");
        return new ArrayList<>(i10);
    }

    public static <F, T> List<T> b(List<F> list, bx2<? super F, ? extends T> bx2Var) {
        return new q03(list, bx2Var);
    }
}
