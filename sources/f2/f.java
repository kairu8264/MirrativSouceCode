package f2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import jo.p;

/* loaded from: classes.dex */
public final class f implements Collection<e>, ko.a {

    /* renamed from: y  reason: collision with root package name */
    public static final a f31707y = new a(null);

    /* renamed from: w  reason: collision with root package name */
    public final List<e> f31708w;

    /* renamed from: x  reason: collision with root package name */
    public final int f31709x;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f a() {
            List<g> a10 = i.a().a();
            ArrayList arrayList = new ArrayList(a10.size());
            int size = a10.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new e(a10.get(i10)));
            }
            return new f(arrayList);
        }
    }

    public f(List<e> list) {
        p.h(list, "localeList");
        this.f31708w = list;
        this.f31709x = list.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(e eVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof e) {
            return d((e) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        p.h(collection, "elements");
        return this.f31708w.containsAll(collection);
    }

    public boolean d(e eVar) {
        p.h(eVar, "element");
        return this.f31708w.contains(eVar);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && p.c(this.f31708w, ((f) obj).f31708w);
    }

    public final e f(int i10) {
        return this.f31708w.get(i10);
    }

    public final List<e> g() {
        return this.f31708w;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f31708w.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f31708w.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<e> iterator() {
        return this.f31708w.iterator();
    }

    public int j() {
        return this.f31709x;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super e> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return j();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return jo.g.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        p.h(tArr, "array");
        return (T[]) jo.g.b(this, tArr);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f31708w + ')';
    }
}
