package ai;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class gy2<T> implements Iterator<T> {
    public final /* synthetic */ sy2 A;

    /* renamed from: w  reason: collision with root package name */
    public final Iterator<Map.Entry> f4647w;

    /* renamed from: x  reason: collision with root package name */
    public Object f4648x;

    /* renamed from: y  reason: collision with root package name */
    public Collection f4649y;

    /* renamed from: z  reason: collision with root package name */
    public Iterator f4650z;

    public gy2(sy2 sy2Var) {
        Map map;
        this.A = sy2Var;
        map = sy2Var.f10028z;
        this.f4647w = map.entrySet().iterator();
        this.f4648x = null;
        this.f4649y = null;
        this.f4650z = m03.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4647w.hasNext() || this.f4650z.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!this.f4650z.hasNext()) {
            Map.Entry next = this.f4647w.next();
            this.f4648x = next.getKey();
            Collection collection = (Collection) next.getValue();
            this.f4649y = collection;
            this.f4650z = collection.iterator();
        }
        return (T) this.f4650z.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        this.f4650z.remove();
        Collection collection = this.f4649y;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f4647w.remove();
        }
        sy2 sy2Var = this.A;
        i10 = sy2Var.A;
        sy2Var.A = i10 - 1;
    }
}
