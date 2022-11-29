package xn;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class i<E> extends xn.a<E> implements Set<E> {

    /* renamed from: w  reason: collision with root package name */
    public static final a f60447w = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final boolean a(Set<?> set, Set<?> set2) {
            jo.p.h(set, "c");
            jo.p.h(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        public final int b(Collection<?> collection) {
            jo.p.h(collection, "c");
            Iterator<?> it = collection.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                i10 += next != null ? next.hashCode() : 0;
            }
            return i10;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f60447w.a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f60447w.b(this);
    }
}
