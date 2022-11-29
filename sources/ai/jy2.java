package ai;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public final class jy2 extends my2 implements NavigableMap {
    public final /* synthetic */ sy2 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy2(sy2 sy2Var, NavigableMap navigableMap) {
        super(sy2Var, navigableMap);
        this.C = sy2Var;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.f4251y)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return e(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4251y)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new jy2(this.C, ((NavigableMap) ((SortedMap) this.f4251y)).descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.f4251y)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return e(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.f4251y)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return e(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4251y)).floorKey(obj);
    }

    @Override // ai.my2
    public final /* bridge */ /* synthetic */ SortedSet g() {
        return (NavigableSet) super.keySet();
    }

    @Override // ai.my2
    public final /* bridge */ /* synthetic */ SortedMap h() {
        return (NavigableMap) ((SortedMap) this.f4251y);
    }

    @Override // ai.my2, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.f4251y)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return e(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4251y)).higherKey(obj);
    }

    public final Map.Entry i(Iterator<Map.Entry> it) {
        if (it.hasNext()) {
            Map.Entry next = it.next();
            Collection l10 = this.C.l();
            l10.addAll((Collection) next.getValue());
            it.remove();
            return new vz2(next.getKey(), this.C.j(l10));
        }
        return null;
    }

    @Override // ai.my2
    /* renamed from: j */
    public final NavigableSet f() {
        return new ky2(this.C, (NavigableMap) ((SortedMap) this.f4251y));
    }

    @Override // ai.my2, ai.fy2, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.f4251y)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return e(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.f4251y)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return e(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4251y)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return i(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return i(descendingMap().entrySet().iterator());
    }

    @Override // ai.my2, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // ai.my2, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z10) {
        return new jy2(this.C, ((NavigableMap) ((SortedMap) this.f4251y)).headMap(obj, z10));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return new jy2(this.C, ((NavigableMap) ((SortedMap) this.f4251y)).subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z10) {
        return new jy2(this.C, ((NavigableMap) ((SortedMap) this.f4251y)).tailMap(obj, z10));
    }
}
