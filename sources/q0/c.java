package q0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import jo.p;

/* loaded from: classes.dex */
public class c<E> implements Iterator<E>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public Object f48513w;

    /* renamed from: x  reason: collision with root package name */
    public final Map<E, a> f48514x;

    /* renamed from: y  reason: collision with root package name */
    public int f48515y;

    public c(Object obj, Map<E, a> map) {
        p.h(map, "map");
        this.f48513w = obj;
        this.f48514x = map;
    }

    public final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f48515y < this.f48514x.size();
    }

    @Override // java.util.Iterator
    public E next() {
        b();
        E e10 = (E) this.f48513w;
        this.f48515y++;
        a aVar = this.f48514x.get(e10);
        if (aVar != null) {
            this.f48513w = aVar.c();
            return e10;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e10 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
