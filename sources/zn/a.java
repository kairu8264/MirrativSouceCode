package zn;

import io.l;
import java.util.Comparator;
import jo.p;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: zn.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C1102a<T> implements Comparator {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l<T, Comparable<?>>[] f63268w;

        /* JADX WARN: Multi-variable type inference failed */
        public C1102a(l<? super T, ? extends Comparable<?>>[] lVarArr) {
            this.f63268w = lVarArr;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return a.d(t10, t11, this.f63268w);
        }
    }

    public static final <T> Comparator<T> b(l<? super T, ? extends Comparable<?>>... lVarArr) {
        p.h(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            return new C1102a(lVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final <T extends Comparable<?>> int c(T t10, T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    public static final <T> int d(T t10, T t11, l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int c10 = c(lVar.invoke(t10), lVar.invoke(t11));
            if (c10 != 0) {
                return c10;
            }
        }
        return 0;
    }

    public static final <T extends Comparable<? super T>> Comparator<T> e() {
        c cVar = c.f63269w;
        p.f(cVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return cVar;
    }
}
