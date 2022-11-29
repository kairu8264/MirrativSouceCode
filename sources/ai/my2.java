package ai;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public class my2 extends fy2 implements SortedMap {
    public SortedSet A;
    public final /* synthetic */ sy2 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my2(sy2 sy2Var, SortedMap sortedMap) {
        super(sy2Var, sortedMap);
        this.B = sy2Var;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return h().comparator();
    }

    public SortedSet f() {
        return new ny2(this.B, h());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return h().firstKey();
    }

    @Override // ai.fy2, java.util.AbstractMap, java.util.Map
    /* renamed from: g */
    public SortedSet keySet() {
        SortedSet sortedSet = this.A;
        if (sortedSet == null) {
            SortedSet f10 = f();
            this.A = f10;
            return f10;
        }
        return sortedSet;
    }

    public SortedMap h() {
        return (SortedMap) this.f4251y;
    }

    public SortedMap headMap(Object obj) {
        return new my2(this.B, h().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return h().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new my2(this.B, h().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new my2(this.B, h().tailMap(obj));
    }
}
