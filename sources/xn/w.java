package xn;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public class w extends v {
    public static final <T extends Comparable<? super T>> void w(List<T> list) {
        jo.p.h(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final <T> void x(List<T> list, Comparator<? super T> comparator) {
        jo.p.h(list, "<this>");
        jo.p.h(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
