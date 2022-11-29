package m0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import jo.g;
import jo.p;
import xn.n;
import xn.s;

/* loaded from: classes.dex */
public final class e<T> implements RandomAccess {

    /* renamed from: z  reason: collision with root package name */
    public static final int f40467z = 8;

    /* renamed from: w  reason: collision with root package name */
    public T[] f40468w;

    /* renamed from: x  reason: collision with root package name */
    public List<T> f40469x;

    /* renamed from: y  reason: collision with root package name */
    public int f40470y;

    /* loaded from: classes.dex */
    public static final class a<T> implements List<T>, ko.d {

        /* renamed from: w  reason: collision with root package name */
        public final e<T> f40471w;

        public a(e<T> eVar) {
            p.h(eVar, "vector");
            this.f40471w = eVar;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            return this.f40471w.c(t10);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends T> collection) {
            p.h(collection, "elements");
            return this.f40471w.d(i10, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f40471w.h();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f40471w.j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            p.h(collection, "elements");
            return this.f40471w.k(collection);
        }

        public int d() {
            return this.f40471w.p();
        }

        public T f(int i10) {
            f.c(this, i10);
            return this.f40471w.y(i10);
        }

        @Override // java.util.List
        public T get(int i10) {
            f.c(this, i10);
            return this.f40471w.n()[i10];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f40471w.q(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f40471w.r();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f40471w.t(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return f(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            p.h(collection, "elements");
            return this.f40471w.w(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            p.h(collection, "elements");
            return this.f40471w.A(collection);
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            f.c(this, i10);
            return this.f40471w.B(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.List
        public List<T> subList(int i10, int i11) {
            f.d(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return g.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            p.h(tArr, "array");
            return (T[]) g.b(this, tArr);
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.f40471w.a(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            p.h(collection, "elements");
            return this.f40471w.f(collection);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f40471w.u(obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements List<T>, ko.d {

        /* renamed from: w  reason: collision with root package name */
        public final List<T> f40472w;

        /* renamed from: x  reason: collision with root package name */
        public final int f40473x;

        /* renamed from: y  reason: collision with root package name */
        public int f40474y;

        public b(List<T> list, int i10, int i11) {
            p.h(list, "list");
            this.f40472w = list;
            this.f40473x = i10;
            this.f40474y = i11;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            List<T> list = this.f40472w;
            int i10 = this.f40474y;
            this.f40474y = i10 + 1;
            list.add(i10, t10);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends T> collection) {
            p.h(collection, "elements");
            this.f40472w.addAll(i10 + this.f40473x, collection);
            this.f40474y += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f40474y - 1;
            int i11 = this.f40473x;
            if (i11 <= i10) {
                while (true) {
                    this.f40472w.remove(i10);
                    if (i10 == i11) {
                        break;
                    }
                    i10--;
                }
            }
            this.f40474y = this.f40473x;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f40474y;
            for (int i11 = this.f40473x; i11 < i10; i11++) {
                if (p.c(this.f40472w.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            p.h(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int d() {
            return this.f40474y - this.f40473x;
        }

        public T f(int i10) {
            f.c(this, i10);
            this.f40474y--;
            return this.f40472w.remove(i10 + this.f40473x);
        }

        @Override // java.util.List
        public T get(int i10) {
            f.c(this, i10);
            return this.f40472w.get(i10 + this.f40473x);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f40474y;
            for (int i11 = this.f40473x; i11 < i10; i11++) {
                if (p.c(this.f40472w.get(i11), obj)) {
                    return i11 - this.f40473x;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f40474y == this.f40473x;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f40474y - 1;
            int i11 = this.f40473x;
            if (i11 <= i10) {
                while (!p.c(this.f40472w.get(i10), obj)) {
                    if (i10 == i11) {
                        return -1;
                    }
                    i10--;
                }
                return i10 - this.f40473x;
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return f(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            p.h(collection, "elements");
            int i10 = this.f40474y;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f40474y;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            p.h(collection, "elements");
            int i10 = this.f40474y;
            int i11 = i10 - 1;
            int i12 = this.f40473x;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.f40472w.get(i11))) {
                        this.f40472w.remove(i11);
                        this.f40474y--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f40474y;
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            f.c(this, i10);
            return this.f40472w.set(i10 + this.f40473x, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.List
        public List<T> subList(int i10, int i11) {
            f.d(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return g.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            p.h(tArr, "array");
            return (T[]) g.b(this, tArr);
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.f40472w.add(i10 + this.f40473x, t10);
            this.f40474y++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f40474y;
            for (int i11 = this.f40473x; i11 < i10; i11++) {
                if (p.c(this.f40472w.get(i11), obj)) {
                    this.f40472w.remove(i11);
                    this.f40474y--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            p.h(collection, "elements");
            this.f40472w.addAll(this.f40474y, collection);
            this.f40474y += collection.size();
            return collection.size() > 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements ListIterator<T>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public final List<T> f40475w;

        /* renamed from: x  reason: collision with root package name */
        public int f40476x;

        public c(List<T> list, int i10) {
            p.h(list, "list");
            this.f40475w = list;
            this.f40476x = i10;
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            this.f40475w.add(this.f40476x, t10);
            this.f40476x++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f40476x < this.f40475w.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f40476x > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.f40475w;
            int i10 = this.f40476x;
            this.f40476x = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f40476x;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.f40476x - 1;
            this.f40476x = i10;
            return this.f40475w.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f40476x - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f40476x - 1;
            this.f40476x = i10;
            this.f40475w.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            this.f40475w.set(this.f40476x, t10);
        }
    }

    public e(T[] tArr, int i10) {
        p.h(tArr, "content");
        this.f40468w = tArr;
        this.f40470y = i10;
    }

    public final boolean A(Collection<? extends T> collection) {
        p.h(collection, "elements");
        int i10 = this.f40470y;
        for (int p10 = p() - 1; -1 < p10; p10--) {
            if (!collection.contains(n()[p10])) {
                y(p10);
            }
        }
        return i10 != this.f40470y;
    }

    public final T B(int i10, T t10) {
        T[] tArr = this.f40468w;
        T t11 = tArr[i10];
        tArr[i10] = t10;
        return t11;
    }

    public final void D(Comparator<T> comparator) {
        p.h(comparator, "comparator");
        n.z(this.f40468w, comparator, 0, this.f40470y);
    }

    public final void a(int i10, T t10) {
        l(this.f40470y + 1);
        T[] tArr = this.f40468w;
        int i11 = this.f40470y;
        if (i10 != i11) {
            n.i(tArr, tArr, i10 + 1, i10, i11);
        }
        tArr[i10] = t10;
        this.f40470y++;
    }

    public final boolean c(T t10) {
        l(this.f40470y + 1);
        T[] tArr = this.f40468w;
        int i10 = this.f40470y;
        tArr[i10] = t10;
        this.f40470y = i10 + 1;
        return true;
    }

    public final boolean d(int i10, Collection<? extends T> collection) {
        p.h(collection, "elements");
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        l(this.f40470y + collection.size());
        T[] tArr = this.f40468w;
        if (i10 != this.f40470y) {
            n.i(tArr, tArr, collection.size() + i10, i10, this.f40470y);
        }
        for (T t10 : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                s.t();
            }
            tArr[i11 + i10] = t10;
            i11 = i12;
        }
        this.f40470y += collection.size();
        return true;
    }

    public final boolean e(int i10, e<T> eVar) {
        p.h(eVar, "elements");
        if (eVar.r()) {
            return false;
        }
        l(this.f40470y + eVar.f40470y);
        T[] tArr = this.f40468w;
        int i11 = this.f40470y;
        if (i10 != i11) {
            n.i(tArr, tArr, eVar.f40470y + i10, i10, i11);
        }
        n.i(eVar.f40468w, tArr, i10, 0, eVar.f40470y);
        this.f40470y += eVar.f40470y;
        return true;
    }

    public final boolean f(Collection<? extends T> collection) {
        p.h(collection, "elements");
        return d(this.f40470y, collection);
    }

    public final List<T> g() {
        List<T> list = this.f40469x;
        if (list == null) {
            a aVar = new a(this);
            this.f40469x = aVar;
            return aVar;
        }
        return list;
    }

    public final void h() {
        T[] tArr = this.f40468w;
        int p10 = p();
        while (true) {
            p10--;
            if (-1 < p10) {
                tArr[p10] = null;
            } else {
                this.f40470y = 0;
                return;
            }
        }
    }

    public final boolean j(T t10) {
        int p10 = p() - 1;
        if (p10 >= 0) {
            for (int i10 = 0; !p.c(n()[i10], t10); i10++) {
                if (i10 != p10) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean k(Collection<? extends T> collection) {
        p.h(collection, "elements");
        for (T t10 : collection) {
            if (!j(t10)) {
                return false;
            }
        }
        return true;
    }

    public final void l(int i10) {
        T[] tArr = this.f40468w;
        if (tArr.length < i10) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i10, tArr.length * 2));
            p.g(tArr2, "copyOf(this, newSize)");
            this.f40468w = tArr2;
        }
    }

    public final T m() {
        if (!r()) {
            return n()[0];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final T[] n() {
        return this.f40468w;
    }

    public final int p() {
        return this.f40470y;
    }

    public final int q(T t10) {
        int i10 = this.f40470y;
        if (i10 > 0) {
            int i11 = 0;
            T[] tArr = this.f40468w;
            while (!p.c(t10, tArr[i11])) {
                i11++;
                if (i11 >= i10) {
                    return -1;
                }
            }
            return i11;
        }
        return -1;
    }

    public final boolean r() {
        return this.f40470y == 0;
    }

    public final boolean s() {
        return this.f40470y != 0;
    }

    public final int t(T t10) {
        int i10 = this.f40470y;
        if (i10 > 0) {
            int i11 = i10 - 1;
            T[] tArr = this.f40468w;
            while (!p.c(t10, tArr[i11])) {
                i11--;
                if (i11 < 0) {
                    return -1;
                }
            }
            return i11;
        }
        return -1;
    }

    public final boolean u(T t10) {
        int q10 = q(t10);
        if (q10 >= 0) {
            y(q10);
            return true;
        }
        return false;
    }

    public final boolean w(Collection<? extends T> collection) {
        p.h(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.f40470y;
        for (T t10 : collection) {
            u(t10);
        }
        return i10 != this.f40470y;
    }

    public final boolean x(e<T> eVar) {
        p.h(eVar, "elements");
        int i10 = this.f40470y;
        int p10 = eVar.p() - 1;
        if (p10 >= 0) {
            int i11 = 0;
            while (true) {
                u(eVar.n()[i11]);
                if (i11 == p10) {
                    break;
                }
                i11++;
            }
        }
        return i10 != this.f40470y;
    }

    public final T y(int i10) {
        T[] tArr = this.f40468w;
        T t10 = tArr[i10];
        if (i10 != p() - 1) {
            n.i(tArr, tArr, i10, i10 + 1, this.f40470y);
        }
        int i11 = this.f40470y - 1;
        this.f40470y = i11;
        tArr[i11] = null;
        return t10;
    }

    public final void z(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f40470y;
            if (i11 < i12) {
                T[] tArr = this.f40468w;
                n.i(tArr, tArr, i10, i11, i12);
            }
            int i13 = this.f40470y - (i11 - i10);
            int p10 = p() - 1;
            if (i13 <= p10) {
                int i14 = i13;
                while (true) {
                    this.f40468w[i14] = null;
                    if (i14 == p10) {
                        break;
                    }
                    i14++;
                }
            }
            this.f40470y = i13;
        }
    }
}
