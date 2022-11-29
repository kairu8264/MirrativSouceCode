package xn;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class t0 extends s0 {
    public static final <T> Set<T> b() {
        return e0.f60441w;
    }

    public static final <T> Set<T> c(T... tArr) {
        jo.p.h(tArr, "elements");
        return (Set) o.b0(tArr, new LinkedHashSet(m0.b(tArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> d(Set<? extends T> set) {
        jo.p.h(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : s0.a(set.iterator().next());
        }
        return b();
    }

    public static final <T> Set<T> e(T... tArr) {
        jo.p.h(tArr, "elements");
        return tArr.length > 0 ? o.i0(tArr) : b();
    }
}
