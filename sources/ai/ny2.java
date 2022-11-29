package ai;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public class ny2 extends iy2 implements SortedSet {

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ sy2 f7575y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny2(sy2 sy2Var, SortedMap sortedMap) {
        super(sy2Var, sortedMap);
        this.f7575y = sy2Var;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f10543w;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return d().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new ny2(this.f7575y, d().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return d().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new ny2(this.f7575y, d().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new ny2(this.f7575y, d().tailMap(obj));
    }
}
