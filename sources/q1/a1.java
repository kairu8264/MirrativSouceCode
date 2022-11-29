package q1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public interface a1 {
    void a(a aVar);

    boolean b(Object obj, Object obj2);

    /* loaded from: classes.dex */
    public static final class a implements Collection<Object>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public final Set<Object> f48548w;

        public a(Set<Object> set) {
            jo.p.h(set, "set");
            this.f48548w = set;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f48548w.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.f48548w.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            jo.p.h(collection, "elements");
            return this.f48548w.containsAll(collection);
        }

        @Override // java.util.Collection
        /* renamed from: d */
        public final boolean add(Object obj) {
            return this.f48548w.add(obj);
        }

        public int f() {
            return this.f48548w.size();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f48548w.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return this.f48548w.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f48548w.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            jo.p.h(collection, "slotIds");
            return this.f48548w.remove(collection);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            jo.p.h(collection, "slotIds");
            return this.f48548w.retainAll(collection);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return f();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return jo.g.a(this);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            jo.p.h(tArr, "array");
            return (T[]) jo.g.b(this, tArr);
        }

        public /* synthetic */ a(Set set, int i10, jo.h hVar) {
            this((i10 & 1) != 0 ? new LinkedHashSet() : set);
        }
    }
}
