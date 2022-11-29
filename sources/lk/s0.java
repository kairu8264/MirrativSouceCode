package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class s0 {

    /* loaded from: classes3.dex */
    public static class a extends c<E> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Set f40352w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Set f40353x;

        /* renamed from: lk.s0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0583a extends lk.b<E> {

            /* renamed from: y  reason: collision with root package name */
            public final Iterator<E> f40354y;

            public C0583a() {
                this.f40354y = a.this.f40352w.iterator();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4, types: [E, java.lang.Object] */
            @Override // lk.b
            public E a() {
                while (this.f40354y.hasNext()) {
                    ?? next = this.f40354y.next();
                    if (a.this.f40353x.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f40352w = set;
            this.f40353x = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f40352w.contains(obj) && this.f40353x.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f40352w.containsAll(collection) && this.f40353x.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: d */
        public v0<E> iterator() {
            return new C0583a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f40353x, this.f40352w);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i10 = 0;
            for (Object obj : this.f40352w) {
                if (this.f40353x.contains(obj)) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return s0.g(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) kk.j.i(collection));
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class c<E> extends AbstractSet<E> {
        public /* synthetic */ c(r0 r0Var) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public c() {
        }
    }

    public static boolean a(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static int b(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static <E> c<E> c(Set<E> set, Set<?> set2) {
        kk.j.j(set, "set1");
        kk.j.j(set2, "set2");
        return new a(set, set2);
    }

    public static <E> HashSet<E> d() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> e(int i10) {
        return new HashSet<>(d0.a(i10));
    }

    public static <E> Set<E> f() {
        return Collections.newSetFromMap(d0.e());
    }

    public static boolean g(Set<?> set, Collection<?> collection) {
        kk.j.i(collection);
        if (collection instanceof h0) {
            collection = ((h0) collection).elementSet();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return x.j(set.iterator(), collection);
        }
        return h(set, collection.iterator());
    }

    public static boolean h(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
