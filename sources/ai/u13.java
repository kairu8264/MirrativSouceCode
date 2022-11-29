package ai;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class u13 extends l13<Comparable<?>> implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public static final u13 f10561w = new u13();

    @Override // ai.l13
    public final <S extends Comparable> l13<S> a() {
        return j13.f5588w;
    }

    @Override // ai.l13, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
