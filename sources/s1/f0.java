package s1;

import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class f0<E> extends TreeSet<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Comparator<? super E> comparator) {
        super(comparator);
        jo.p.h(comparator, "comparator");
    }

    public /* bridge */ int f() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return f();
    }
}
