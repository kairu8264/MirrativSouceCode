package v0;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class p<K, V, E> implements Set<E>, ko.f {

    /* renamed from: w  reason: collision with root package name */
    public final u<K, V> f56523w;

    public p(u<K, V> uVar) {
        jo.p.h(uVar, "map");
        this.f56523w = uVar;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f56523w.clear();
    }

    public final u<K, V> d() {
        return this.f56523w;
    }

    public int f() {
        return this.f56523w.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f56523w.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return jo.g.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        jo.p.h(tArr, "array");
        return (T[]) jo.g.b(this, tArr);
    }
}
