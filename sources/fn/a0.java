package fn;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public class a0 extends AbstractList<String> implements i, RandomAccess {

    /* renamed from: w  reason: collision with root package name */
    public final i f32054w;

    /* loaded from: classes4.dex */
    public class a implements ListIterator<String> {

        /* renamed from: w  reason: collision with root package name */
        public ListIterator<String> f32055w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f32056x;

        public a(int i10) {
            this.f32056x = i10;
            this.f32055w = a0.this.f32054w.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b */
        public String next() {
            return this.f32055w.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d */
        public String previous() {
            return this.f32055w.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f32055w.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f32055w.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f32055w.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f32055w.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes4.dex */
    public class b implements Iterator<String> {

        /* renamed from: w  reason: collision with root package name */
        public Iterator<String> f32058w;

        public b() {
            this.f32058w = a0.this.f32054w.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            return this.f32058w.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32058w.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public a0(i iVar) {
        this.f32054w = iVar;
    }

    @Override // fn.i
    public i E1() {
        return this;
    }

    @Override // fn.i
    public void I(com.google.protobuf.f fVar) {
        throw new UnsupportedOperationException();
    }

    @Override // fn.i
    public Object L1(int i10) {
        return this.f32054w.L1(i10);
    }

    @Override // fn.i
    public List<?> X() {
        return this.f32054w.X();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public String get(int i10) {
        return (String) this.f32054w.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f32054w.size();
    }
}
