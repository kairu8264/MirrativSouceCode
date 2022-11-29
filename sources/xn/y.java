package xn;

import java.util.List;

/* loaded from: classes4.dex */
public class y extends x {
    public static final <T> List<T> I(List<? extends T> list) {
        jo.p.h(list, "<this>");
        return new q0(list);
    }

    public static final int J(List<?> list, int i10) {
        if (new po.i(0, s.l(list)).t(i10)) {
            return s.l(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new po.i(0, s.l(list)) + "].");
    }
}
