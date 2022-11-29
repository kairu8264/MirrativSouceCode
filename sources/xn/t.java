package xn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public class t extends s {
    public static final <T> int u(Iterable<? extends T> iterable, int i10) {
        jo.p.h(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static final <T> List<T> v(Iterable<? extends Iterable<? extends T>> iterable) {
        jo.p.h(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Iterable<? extends T> iterable2 : iterable) {
            x.y(arrayList, iterable2);
        }
        return arrayList;
    }
}
