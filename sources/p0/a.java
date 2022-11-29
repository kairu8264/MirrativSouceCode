package p0;

import java.util.Map;
import java.util.Map.Entry;

/* loaded from: classes.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends xn.h<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return f((Map.Entry) obj);
        }
        return false;
    }

    public final boolean f(E e10) {
        jo.p.h(e10, "element");
        if ((e10 instanceof Object ? e10 : null) instanceof Map.Entry) {
            return g(e10);
        }
        return false;
    }

    public abstract boolean g(Map.Entry<? extends K, ? extends V> entry);

    public final boolean j(E e10) {
        jo.p.h(e10, "element");
        if ((e10 instanceof Object ? e10 : null) instanceof Map.Entry) {
            return k(e10);
        }
        return false;
    }

    public abstract boolean k(Map.Entry<? extends K, ? extends V> entry);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return j((Map.Entry) obj);
        }
        return false;
    }
}
