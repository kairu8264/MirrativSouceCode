package ai;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class hn3<E> extends AbstractList<E> {

    /* renamed from: y  reason: collision with root package name */
    public static final in3 f4906y = in3.b(hn3.class);

    /* renamed from: w  reason: collision with root package name */
    public final List<E> f4907w;

    /* renamed from: x  reason: collision with root package name */
    public final Iterator<E> f4908x;

    public hn3(List<E> list, Iterator<E> it) {
        this.f4907w = list;
        this.f4908x = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        if (this.f4907w.size() > i10) {
            return this.f4907w.get(i10);
        }
        if (this.f4908x.hasNext()) {
            this.f4907w.add(this.f4908x.next());
            return get(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return new gn3(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        in3 in3Var = f4906y;
        in3Var.a("potentially expensive size() call");
        in3Var.a("blowup running");
        while (this.f4908x.hasNext()) {
            this.f4907w.add(this.f4908x.next());
        }
        return this.f4907w.size();
    }
}
