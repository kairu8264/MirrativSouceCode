package xn;

import java.util.Collection;

/* loaded from: classes4.dex */
public abstract class a<E> implements Collection<E>, ko.a {

    /* renamed from: xn.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C1012a extends jo.q implements io.l<E, CharSequence> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a<E> f60422w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1012a(a<? extends E> aVar) {
            super(1);
            this.f60422w = aVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final CharSequence invoke(E e10) {
            return e10 == this.f60422w ? "(this Collection)" : String.valueOf(e10);
        }
    }

    @Override // java.util.Collection, java.util.List, n0.e
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List, n0.e
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        for (E e11 : this) {
            if (jo.p.c(e11, e10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List
    public boolean containsAll(Collection<? extends Object> collection) {
        jo.p.h(collection, "elements");
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

    public abstract int d();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection, java.util.List, n0.e
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List, n0.e
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return jo.g.a(this);
    }

    public String toString() {
        return a0.g0(this, ", ", "[", "]", 0, null, new C1012a(this), 24, null);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        jo.p.h(tArr, "array");
        T[] tArr2 = (T[]) jo.g.b(this, tArr);
        jo.p.f(tArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt__CollectionsJVMKt.copyToArrayImpl>");
        return tArr2;
    }
}
