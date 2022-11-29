package v0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import n0.e;
import v0.h;

/* loaded from: classes.dex */
public final class s<T> implements List<T>, c0, ko.d {

    /* renamed from: w  reason: collision with root package name */
    public d0 f56524w = new a(n0.a.b());

    /* loaded from: classes.dex */
    public static final class a<T> extends d0 {

        /* renamed from: c  reason: collision with root package name */
        public n0.e<? extends T> f56525c;

        /* renamed from: d  reason: collision with root package name */
        public int f56526d;

        public a(n0.e<? extends T> eVar) {
            jo.p.h(eVar, "list");
            this.f56525c = eVar;
        }

        @Override // v0.d0
        public void a(d0 d0Var) {
            Object obj;
            jo.p.h(d0Var, "value");
            obj = t.f56530a;
            synchronized (obj) {
                this.f56525c = ((a) d0Var).f56525c;
                this.f56526d = ((a) d0Var).f56526d;
                wn.v vVar = wn.v.f59242a;
            }
        }

        @Override // v0.d0
        public d0 b() {
            return new a(this.f56525c);
        }

        public final n0.e<T> g() {
            return (n0.e<? extends T>) this.f56525c;
        }

        public final int h() {
            return this.f56526d;
        }

        public final void i(n0.e<? extends T> eVar) {
            jo.p.h(eVar, "<set-?>");
            this.f56525c = eVar;
        }

        public final void j(int i10) {
            this.f56526d = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<List<T>, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f56527w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Collection<T> f56528x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(int i10, Collection<? extends T> collection) {
            super(1);
            this.f56527w = i10;
            this.f56528x = collection;
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(List<T> list) {
            jo.p.h(list, "it");
            return Boolean.valueOf(list.addAll(this.f56527w, this.f56528x));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<List<T>, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Collection<T> f56529w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Collection<? extends T> collection) {
            super(1);
            this.f56529w = collection;
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(List<T> list) {
            jo.p.h(list, "it");
            return Boolean.valueOf(list.retainAll(this.f56529w));
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        Object obj;
        h.a aVar;
        int h10;
        n0.e<T> g10;
        boolean z10;
        Object obj2;
        h b10;
        do {
            obj = t.f56530a;
            synchronized (obj) {
                aVar = h.f56484e;
                a aVar2 = (a) m.A((a) d(), aVar.b());
                h10 = aVar2.h();
                g10 = aVar2.g();
                wn.v vVar = wn.v.f59242a;
            }
            jo.p.e(g10);
            n0.e<T> add = g10.add((n0.e<T>) t10);
            z10 = false;
            if (jo.p.c(add, g10)) {
                return false;
            }
            obj2 = t.f56530a;
            synchronized (obj2) {
                a aVar3 = (a) d();
                m.D();
                synchronized (m.C()) {
                    b10 = aVar.b();
                    a aVar4 = (a) m.Z(aVar3, this, b10);
                    if (aVar4.h() == h10) {
                        aVar4.i(add);
                        aVar4.j(aVar4.h() + 1);
                        z10 = true;
                    }
                }
                m.J(b10, this);
            }
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        jo.p.h(collection, "elements");
        return p(new b(i10, collection));
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Object obj;
        h b10;
        obj = t.f56530a;
        synchronized (obj) {
            a aVar = (a) d();
            m.D();
            synchronized (m.C()) {
                b10 = h.f56484e.b();
                a aVar2 = (a) m.Z(aVar, this, b10);
                aVar2.i(n0.a.b());
                aVar2.j(aVar2.h() + 1);
            }
            m.J(b10, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return g().g().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        jo.p.h(collection, "elements");
        return g().g().containsAll(collection);
    }

    @Override // v0.c0
    public d0 d() {
        return this.f56524w;
    }

    public final int f() {
        return ((a) m.A((a) d(), h.f56484e.b())).h();
    }

    public final a<T> g() {
        return (a) m.O((a) d(), this);
    }

    @Override // java.util.List
    public T get(int i10) {
        return g().g().get(i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return g().g().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return g().g().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // v0.c0
    public void j(d0 d0Var) {
        jo.p.h(d0Var, "value");
        d0Var.e(d());
        this.f56524w = (a) d0Var;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return g().g().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new x(this, 0);
    }

    public int m() {
        return g().g().size();
    }

    public final boolean p(io.l<? super List<T>, Boolean> lVar) {
        Object obj;
        h.a aVar;
        int h10;
        n0.e<T> g10;
        Boolean invoke;
        Object obj2;
        h b10;
        boolean z10;
        do {
            obj = t.f56530a;
            synchronized (obj) {
                aVar = h.f56484e;
                a aVar2 = (a) m.A((a) d(), aVar.b());
                h10 = aVar2.h();
                g10 = aVar2.g();
                wn.v vVar = wn.v.f59242a;
            }
            jo.p.e(g10);
            e.a<T> n10 = g10.n();
            invoke = lVar.invoke(n10);
            n0.e<T> a10 = n10.a();
            if (jo.p.c(a10, g10)) {
                break;
            }
            obj2 = t.f56530a;
            synchronized (obj2) {
                a aVar3 = (a) d();
                m.D();
                synchronized (m.C()) {
                    b10 = aVar.b();
                    a aVar4 = (a) m.Z(aVar3, this, b10);
                    z10 = true;
                    if (aVar4.h() == h10) {
                        aVar4.i(a10);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z10 = false;
                    }
                }
                m.J(b10, this);
            }
        } while (!z10);
        return invoke.booleanValue();
    }

    public T r(int i10) {
        Object obj;
        h.a aVar;
        int h10;
        n0.e<T> g10;
        Object obj2;
        h b10;
        boolean z10;
        T t10 = get(i10);
        do {
            obj = t.f56530a;
            synchronized (obj) {
                aVar = h.f56484e;
                a aVar2 = (a) m.A((a) d(), aVar.b());
                h10 = aVar2.h();
                g10 = aVar2.g();
                wn.v vVar = wn.v.f59242a;
            }
            jo.p.e(g10);
            n0.e<T> O = g10.O(i10);
            if (jo.p.c(O, g10)) {
                break;
            }
            obj2 = t.f56530a;
            synchronized (obj2) {
                a aVar3 = (a) d();
                m.D();
                synchronized (m.C()) {
                    b10 = aVar.b();
                    a aVar4 = (a) m.Z(aVar3, this, b10);
                    z10 = true;
                    if (aVar4.h() == h10) {
                        aVar4.i(O);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z10 = false;
                    }
                }
                m.J(b10, this);
            }
        } while (!z10);
        return t10;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return r(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        Object obj;
        h.a aVar;
        int h10;
        n0.e<T> g10;
        boolean z10;
        Object obj2;
        h b10;
        jo.p.h(collection, "elements");
        do {
            obj = t.f56530a;
            synchronized (obj) {
                aVar = h.f56484e;
                a aVar2 = (a) m.A((a) d(), aVar.b());
                h10 = aVar2.h();
                g10 = aVar2.g();
                wn.v vVar = wn.v.f59242a;
            }
            jo.p.e(g10);
            n0.e<T> removeAll = g10.removeAll((Collection<? extends T>) collection);
            z10 = false;
            if (jo.p.c(removeAll, g10)) {
                return false;
            }
            obj2 = t.f56530a;
            synchronized (obj2) {
                a aVar3 = (a) d();
                m.D();
                synchronized (m.C()) {
                    b10 = aVar.b();
                    a aVar4 = (a) m.Z(aVar3, this, b10);
                    if (aVar4.h() == h10) {
                        aVar4.i(removeAll);
                        aVar4.j(aVar4.h() + 1);
                        z10 = true;
                    }
                }
                m.J(b10, this);
            }
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        jo.p.h(collection, "elements");
        return p(new c(collection));
    }

    public final void s(int i10, int i11) {
        Object obj;
        h.a aVar;
        int h10;
        n0.e<T> g10;
        Object obj2;
        h b10;
        boolean z10;
        do {
            obj = t.f56530a;
            synchronized (obj) {
                aVar = h.f56484e;
                a aVar2 = (a) m.A((a) d(), aVar.b());
                h10 = aVar2.h();
                g10 = aVar2.g();
                wn.v vVar = wn.v.f59242a;
            }
            jo.p.e(g10);
            e.a<T> n10 = g10.n();
            n10.subList(i10, i11).clear();
            n0.e<T> a10 = n10.a();
            if (jo.p.c(a10, g10)) {
                return;
            }
            obj2 = t.f56530a;
            synchronized (obj2) {
                a aVar3 = (a) d();
                m.D();
                synchronized (m.C()) {
                    b10 = aVar.b();
                    a aVar4 = (a) m.Z(aVar3, this, b10);
                    z10 = true;
                    if (aVar4.h() == h10) {
                        aVar4.i(a10);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z10 = false;
                    }
                }
                m.J(b10, this);
            }
        } while (!z10);
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        Object obj;
        h.a aVar;
        int h10;
        n0.e<T> g10;
        Object obj2;
        h b10;
        boolean z10;
        T t11 = get(i10);
        do {
            obj = t.f56530a;
            synchronized (obj) {
                aVar = h.f56484e;
                a aVar2 = (a) m.A((a) d(), aVar.b());
                h10 = aVar2.h();
                g10 = aVar2.g();
                wn.v vVar = wn.v.f59242a;
            }
            jo.p.e(g10);
            n0.e<T> eVar = g10.set(i10, (int) t10);
            if (jo.p.c(eVar, g10)) {
                break;
            }
            obj2 = t.f56530a;
            synchronized (obj2) {
                a aVar3 = (a) d();
                m.D();
                synchronized (m.C()) {
                    b10 = aVar.b();
                    a aVar4 = (a) m.Z(aVar3, this, b10);
                    z10 = true;
                    if (aVar4.h() == h10) {
                        aVar4.i(eVar);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z10 = false;
                    }
                }
                m.J(b10, this);
            }
        } while (!z10);
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m();
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        boolean z10 = true;
        if (!(i10 >= 0 && i10 <= i11) || i11 > size()) {
            z10 = false;
        }
        if (z10) {
            return new e0(this, i10, i11);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final int t(Collection<? extends T> collection, int i10, int i11) {
        Object obj;
        h.a aVar;
        int h10;
        n0.e<T> g10;
        Object obj2;
        h b10;
        boolean z10;
        jo.p.h(collection, "elements");
        int size = size();
        do {
            obj = t.f56530a;
            synchronized (obj) {
                aVar = h.f56484e;
                a aVar2 = (a) m.A((a) d(), aVar.b());
                h10 = aVar2.h();
                g10 = aVar2.g();
                wn.v vVar = wn.v.f59242a;
            }
            jo.p.e(g10);
            e.a<T> n10 = g10.n();
            n10.subList(i10, i11).retainAll(collection);
            n0.e<T> a10 = n10.a();
            if (jo.p.c(a10, g10)) {
                break;
            }
            obj2 = t.f56530a;
            synchronized (obj2) {
                a aVar3 = (a) d();
                m.D();
                synchronized (m.C()) {
                    b10 = aVar.b();
                    a aVar4 = (a) m.Z(aVar3, this, b10);
                    z10 = true;
                    if (aVar4.h() == h10) {
                        aVar4.i(a10);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z10 = false;
                    }
                }
                m.J(b10, this);
            }
        } while (!z10);
        return size - size();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return jo.g.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        jo.p.h(tArr, "array");
        return (T[]) jo.g.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        Object obj;
        h.a aVar;
        int h10;
        n0.e<T> g10;
        boolean z10;
        Object obj2;
        h b10;
        jo.p.h(collection, "elements");
        do {
            obj = t.f56530a;
            synchronized (obj) {
                aVar = h.f56484e;
                a aVar2 = (a) m.A((a) d(), aVar.b());
                h10 = aVar2.h();
                g10 = aVar2.g();
                wn.v vVar = wn.v.f59242a;
            }
            jo.p.e(g10);
            n0.e<T> addAll = g10.addAll(collection);
            z10 = false;
            if (jo.p.c(addAll, g10)) {
                return false;
            }
            obj2 = t.f56530a;
            synchronized (obj2) {
                a aVar3 = (a) d();
                m.D();
                synchronized (m.C()) {
                    b10 = aVar.b();
                    a aVar4 = (a) m.Z(aVar3, this, b10);
                    if (aVar4.h() == h10) {
                        aVar4.i(addAll);
                        aVar4.j(aVar4.h() + 1);
                        z10 = true;
                    }
                }
                m.J(b10, this);
            }
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        return new x(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        Object obj2;
        h.a aVar;
        int h10;
        n0.e<T> g10;
        boolean z10;
        Object obj3;
        h b10;
        do {
            obj2 = t.f56530a;
            synchronized (obj2) {
                aVar = h.f56484e;
                a aVar2 = (a) m.A((a) d(), aVar.b());
                h10 = aVar2.h();
                g10 = aVar2.g();
                wn.v vVar = wn.v.f59242a;
            }
            jo.p.e(g10);
            n0.e<T> remove = g10.remove((n0.e<T>) obj);
            z10 = false;
            if (jo.p.c(remove, g10)) {
                return false;
            }
            obj3 = t.f56530a;
            synchronized (obj3) {
                a aVar3 = (a) d();
                m.D();
                synchronized (m.C()) {
                    b10 = aVar.b();
                    a aVar4 = (a) m.Z(aVar3, this, b10);
                    if (aVar4.h() == h10) {
                        aVar4.i(remove);
                        aVar4.j(aVar4.h() + 1);
                        z10 = true;
                    }
                }
                m.J(b10, this);
            }
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        Object obj;
        h.a aVar;
        int h10;
        n0.e<T> g10;
        Object obj2;
        h b10;
        boolean z10;
        do {
            obj = t.f56530a;
            synchronized (obj) {
                aVar = h.f56484e;
                a aVar2 = (a) m.A((a) d(), aVar.b());
                h10 = aVar2.h();
                g10 = aVar2.g();
                wn.v vVar = wn.v.f59242a;
            }
            jo.p.e(g10);
            n0.e<T> add = g10.add(i10, (int) t10);
            if (jo.p.c(add, g10)) {
                return;
            }
            obj2 = t.f56530a;
            synchronized (obj2) {
                a aVar3 = (a) d();
                m.D();
                synchronized (m.C()) {
                    b10 = aVar.b();
                    a aVar4 = (a) m.Z(aVar3, this, b10);
                    z10 = true;
                    if (aVar4.h() == h10) {
                        aVar4.i(add);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z10 = false;
                    }
                }
                m.J(b10, this);
            }
        } while (!z10);
    }
}
