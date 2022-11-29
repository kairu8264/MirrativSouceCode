package ai;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public class py2 extends AbstractCollection {
    public final /* synthetic */ sy2 A;

    /* renamed from: w  reason: collision with root package name */
    public final Object f8736w;

    /* renamed from: x  reason: collision with root package name */
    public Collection f8737x;

    /* renamed from: y  reason: collision with root package name */
    public final py2 f8738y;

    /* renamed from: z  reason: collision with root package name */
    public final Collection f8739z;

    public py2(sy2 sy2Var, Object obj, Collection collection, py2 py2Var) {
        this.A = sy2Var;
        this.f8736w = obj;
        this.f8737x = collection;
        this.f8738y = py2Var;
        this.f8739z = py2Var == null ? null : py2Var.f8737x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        d();
        boolean isEmpty = this.f8737x.isEmpty();
        boolean add = this.f8737x.add(obj);
        if (add) {
            sy2 sy2Var = this.A;
            i10 = sy2Var.A;
            sy2Var.A = i10 + 1;
            if (isEmpty) {
                f();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f8737x.addAll(collection);
        if (addAll) {
            int size2 = this.f8737x.size();
            sy2 sy2Var = this.A;
            i10 = sy2Var.A;
            sy2Var.A = i10 + (size2 - size);
            if (size == 0) {
                f();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i10;
        int size = size();
        if (size == 0) {
            return;
        }
        this.f8737x.clear();
        sy2 sy2Var = this.A;
        i10 = sy2Var.A;
        sy2Var.A = i10 - size;
        zzb();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        d();
        return this.f8737x.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        d();
        return this.f8737x.containsAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        Map map;
        py2 py2Var = this.f8738y;
        if (py2Var != null) {
            py2Var.d();
            if (this.f8738y.f8737x != this.f8739z) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f8737x.isEmpty()) {
            map = this.A.f10028z;
            Collection collection = (Collection) map.get(this.f8736w);
            if (collection != null) {
                this.f8737x = collection;
            }
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        d();
        return this.f8737x.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        Map map;
        py2 py2Var = this.f8738y;
        if (py2Var != null) {
            py2Var.f();
            return;
        }
        map = this.A.f10028z;
        map.put(this.f8736w, this.f8737x);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        d();
        return this.f8737x.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        d();
        return new oy2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        d();
        boolean remove = this.f8737x.remove(obj);
        if (remove) {
            sy2 sy2Var = this.A;
            i10 = sy2Var.A;
            sy2Var.A = i10 - 1;
            zzb();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int i10;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f8737x.removeAll(collection);
        if (removeAll) {
            int size2 = this.f8737x.size();
            sy2 sy2Var = this.A;
            i10 = sy2Var.A;
            sy2Var.A = i10 + (size2 - size);
            zzb();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i10;
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.f8737x.retainAll(collection);
        if (retainAll) {
            int size2 = this.f8737x.size();
            sy2 sy2Var = this.A;
            i10 = sy2Var.A;
            sy2Var.A = i10 + (size2 - size);
            zzb();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        d();
        return this.f8737x.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        d();
        return this.f8737x.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Map map;
        py2 py2Var = this.f8738y;
        if (py2Var != null) {
            py2Var.zzb();
        } else if (this.f8737x.isEmpty()) {
            map = this.A.f10028z;
            map.remove(this.f8736w);
        }
    }
}
