package ai;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public final class ky2 extends ny2 implements NavigableSet {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ sy2 f6407z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky2(sy2 sy2Var, NavigableMap navigableMap) {
        super(sy2Var, navigableMap);
        this.f6407z = sy2Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f10543w)).ceilingKey(obj);
    }

    @Override // ai.ny2
    public final /* bridge */ /* synthetic */ SortedMap d() {
        return (NavigableMap) ((SortedMap) this.f10543w);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new ky2(this.f6407z, ((NavigableMap) ((SortedMap) this.f10543w)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f10543w)).floorKey(obj);
    }

    @Override // ai.ny2, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f10543w)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f10543w)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return n03.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return n03.a(descendingIterator());
    }

    @Override // ai.ny2, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // ai.ny2, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        return new ky2(this.f6407z, ((NavigableMap) ((SortedMap) this.f10543w)).headMap(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new ky2(this.f6407z, ((NavigableMap) ((SortedMap) this.f10543w)).subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new ky2(this.f6407z, ((NavigableMap) ((SortedMap) this.f10543w)).tailMap(obj, z10));
    }
}
