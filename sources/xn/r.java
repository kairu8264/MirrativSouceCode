package xn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class r {
    public static final <E> List<E> a(List<E> list) {
        jo.p.h(list, "builder");
        return ((yn.a) list).r();
    }

    public static final <T> Object[] b(T[] tArr, boolean z10) {
        jo.p.h(tArr, "<this>");
        if (z10 && jo.p.c(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        jo.p.g(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static final <E> List<E> c(int i10) {
        return new yn.a(i10);
    }

    public static final <T> List<T> d(T t10) {
        List<T> singletonList = Collections.singletonList(t10);
        jo.p.g(singletonList, "singletonList(element)");
        return singletonList;
    }
}
