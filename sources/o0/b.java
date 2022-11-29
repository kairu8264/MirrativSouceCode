package o0;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import jo.p;
import jo.q;
import n0.e;

/* loaded from: classes.dex */
public abstract class b<E> extends xn.c<E> implements n0.e<E> {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.l<E, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Collection<E> f43776w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends E> collection) {
            super(1);
            this.f43776w = collection;
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(E e10) {
            return Boolean.valueOf(this.f43776w.contains(e10));
        }
    }

    @Override // xn.a, java.util.Collection, java.util.List, n0.e
    public n0.e<E> addAll(Collection<? extends E> collection) {
        p.h(collection, "elements");
        e.a<E> n10 = n();
        n10.addAll(collection);
        return n10.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xn.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // xn.a, java.util.Collection, java.util.List
    public boolean containsAll(Collection<? extends Object> collection) {
        p.h(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // xn.c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // xn.c, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // xn.a, java.util.Collection, java.util.List, n0.e
    public n0.e<E> remove(E e10) {
        int indexOf = indexOf(e10);
        return indexOf != -1 ? O(indexOf) : this;
    }

    @Override // xn.a, java.util.Collection, java.util.List, n0.e
    public n0.e<E> removeAll(Collection<? extends E> collection) {
        p.h(collection, "elements");
        return u1(new a(collection));
    }

    @Override // xn.c, java.util.List, n0.c
    public n0.c<E> subList(int i10, int i11) {
        return super.subList(i10, i11);
    }
}
