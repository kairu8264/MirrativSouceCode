package n0;

import io.l;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public interface e<E> extends c<E>, b {

    /* loaded from: classes.dex */
    public interface a<E> extends List<E>, Collection, ko.b, ko.d {
        e<E> a();
    }

    e<E> O(int i10);

    @Override // java.util.List
    e<E> add(int i10, E e10);

    @Override // java.util.List, java.util.Collection
    e<E> add(E e10);

    @Override // java.util.List, java.util.Collection
    e<E> addAll(Collection<? extends E> collection);

    a<E> n();

    @Override // java.util.List, java.util.Collection
    e<E> remove(E e10);

    @Override // java.util.List, java.util.Collection
    e<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.List
    e<E> set(int i10, E e10);

    e<E> u1(l<? super E, Boolean> lVar);
}
