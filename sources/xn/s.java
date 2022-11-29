package xn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public class s extends r {
    public static final <T> ArrayList<T> e(T... tArr) {
        jo.p.h(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new j(tArr, true));
    }

    public static final <T> Collection<T> f(T[] tArr) {
        jo.p.h(tArr, "<this>");
        return new j(tArr, false);
    }

    public static final <T> int g(List<? extends T> list, int i10, int i11, io.l<? super T, Integer> lVar) {
        jo.p.h(list, "<this>");
        jo.p.h(lVar, "comparison");
        r(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int intValue = lVar.invoke((T) list.get(i13)).intValue();
            if (intValue < 0) {
                i10 = i13 + 1;
            } else if (intValue <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final <T extends Comparable<? super T>> int h(List<? extends T> list, T t10, int i10, int i11) {
        jo.p.h(list, "<this>");
        r(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int c10 = zn.a.c(list.get(i13), t10);
            if (c10 < 0) {
                i10 = i13 + 1;
            } else if (c10 <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int i(List list, int i10, int i11, io.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = list.size();
        }
        return g(list, i10, i11, lVar);
    }

    public static /* synthetic */ int j(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return h(list, comparable, i10, i11);
    }

    public static final <T> List<T> k() {
        return c0.f60437w;
    }

    public static final <T> int l(List<? extends T> list) {
        jo.p.h(list, "<this>");
        return list.size() - 1;
    }

    public static final <T> List<T> m(T... tArr) {
        jo.p.h(tArr, "elements");
        return tArr.length > 0 ? n.c(tArr) : k();
    }

    public static final <T> List<T> n(T t10) {
        return t10 != null ? r.d(t10) : k();
    }

    public static final <T> List<T> o(T... tArr) {
        jo.p.h(tArr, "elements");
        return o.D(tArr);
    }

    public static final <T> List<T> p(T... tArr) {
        jo.p.h(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new j(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> q(List<? extends T> list) {
        jo.p.h(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : r.d(list.get(0));
        }
        return k();
    }

    public static final void r(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        } else if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        } else if (i12 <= i10) {
        } else {
            throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
        }
    }

    public static final void s() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void t() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
