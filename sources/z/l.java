package z;

import java.util.List;

/* loaded from: classes.dex */
public final class l {
    public static final b0 a(List<b0> list, j0 j0Var, List<Integer> list2, int i10, int i11, int i12) {
        jo.p.h(list, "composedVisibleItems");
        jo.p.h(j0Var, "itemProvider");
        jo.p.h(list2, "headerIndexes");
        int index = ((b0) xn.a0.X(list)).getIndex();
        int size = list2.size();
        int i13 = 0;
        int i14 = -1;
        int i15 = -1;
        while (i13 < size && list2.get(i13).intValue() <= index) {
            i14 = list2.get(i13).intValue();
            i13++;
            i15 = ((i13 < 0 || i13 > xn.s.l(list2)) ? -1 : list2.get(i13)).intValue();
        }
        int size2 = list.size();
        int i16 = Integer.MIN_VALUE;
        int i17 = Integer.MIN_VALUE;
        int i18 = -1;
        for (int i19 = 0; i19 < size2; i19++) {
            b0 b0Var = list.get(i19);
            if (b0Var.getIndex() == i14) {
                i16 = b0Var.b();
                i18 = i19;
            } else if (b0Var.getIndex() == i15) {
                i17 = b0Var.b();
            }
        }
        if (i14 == -1) {
            return null;
        }
        i0 a10 = j0Var.a(b.b(i14));
        int max = i16 != Integer.MIN_VALUE ? Math.max(-i10, i16) : -i10;
        if (i17 != Integer.MIN_VALUE) {
            max = Math.min(max, i17 - a10.d());
        }
        b0 f10 = a10.f(max, i11, i12);
        if (i18 != -1) {
            list.set(i18, f10);
        } else {
            list.add(0, f10);
        }
        return f10;
    }
}
