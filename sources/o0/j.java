package o0;

import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import jo.p;
import n0.e;
import xn.n;
import xn.o;

/* loaded from: classes.dex */
public final class j<E> extends b<E> implements n0.c<E> {

    /* renamed from: y  reason: collision with root package name */
    public static final a f43792y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final j f43793z = new j(new Object[0]);

    /* renamed from: x  reason: collision with root package name */
    public final Object[] f43794x;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a() {
            return j.f43793z;
        }
    }

    public j(Object[] objArr) {
        p.h(objArr, "buffer");
        this.f43794x = objArr;
        r0.a.a(objArr.length <= 32);
    }

    @Override // n0.e
    public n0.e<E> O(int i10) {
        r0.d.a(i10, size());
        if (size() == 1) {
            return f43793z;
        }
        Object[] copyOf = Arrays.copyOf(this.f43794x, size() - 1);
        p.g(copyOf, "copyOf(this, newSize)");
        n.i(this.f43794x, copyOf, i10, i10 + 1, size());
        return new j(copyOf);
    }

    @Override // xn.a, java.util.Collection, java.util.List, n0.e
    public n0.e<E> add(E e10) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.f43794x, size() + 1);
            p.g(copyOf, "copyOf(this, newSize)");
            copyOf[size()] = e10;
            return new j(copyOf);
        }
        return new e(this.f43794x, l.c(e10), size() + 1, 0);
    }

    @Override // o0.b, xn.a, java.util.Collection, java.util.List, n0.e
    public n0.e<E> addAll(Collection<? extends E> collection) {
        p.h(collection, "elements");
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.f43794x, size() + collection.size());
            p.g(copyOf, "copyOf(this, newSize)");
            int size = size();
            for (E e10 : collection) {
                copyOf[size] = e10;
                size++;
            }
            return new j(copyOf);
        }
        e.a<E> n10 = n();
        n10.addAll(collection);
        return n10.a();
    }

    @Override // xn.a
    public int d() {
        return this.f43794x.length;
    }

    public final Object[] g(int i10) {
        return new Object[i10];
    }

    @Override // xn.c, java.util.List
    public E get(int i10) {
        r0.d.a(i10, size());
        return (E) this.f43794x[i10];
    }

    @Override // xn.c, java.util.List
    public int indexOf(Object obj) {
        return o.N(this.f43794x, obj);
    }

    @Override // xn.c, java.util.List
    public int lastIndexOf(Object obj) {
        return o.S(this.f43794x, obj);
    }

    @Override // xn.c, java.util.List
    public ListIterator<E> listIterator(int i10) {
        r0.d.b(i10, size());
        return new c(this.f43794x, i10, size());
    }

    @Override // n0.e
    public e.a<E> n() {
        return new f(this, null, this.f43794x, 0);
    }

    @Override // xn.c, java.util.List, n0.e
    public n0.e<E> set(int i10, E e10) {
        r0.d.a(i10, size());
        Object[] objArr = this.f43794x;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        p.g(copyOf, "copyOf(this, size)");
        copyOf[i10] = e10;
        return new j(copyOf);
    }

    @Override // n0.e
    public n0.e<E> u1(io.l<? super E, Boolean> lVar) {
        p.h(lVar, "predicate");
        Object[] objArr = this.f43794x;
        int size = size();
        int size2 = size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = this.f43794x[i10];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z10) {
                    Object[] objArr2 = this.f43794x;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    p.g(objArr, "copyOf(this, size)");
                    z10 = true;
                    size = i10;
                }
            } else if (z10) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return f43793z;
        }
        return new j(n.p(objArr, 0, size));
    }

    @Override // xn.c, java.util.List, n0.e
    public n0.e<E> add(int i10, E e10) {
        r0.d.b(i10, size());
        if (i10 == size()) {
            return add((j<E>) e10);
        }
        if (size() < 32) {
            Object[] g10 = g(size() + 1);
            n.m(this.f43794x, g10, 0, 0, i10, 6, null);
            n.i(this.f43794x, g10, i10 + 1, i10, size());
            g10[i10] = e10;
            return new j(g10);
        }
        Object[] objArr = this.f43794x;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        p.g(copyOf, "copyOf(this, size)");
        n.i(this.f43794x, copyOf, i10 + 1, i10, size() - 1);
        copyOf[i10] = e10;
        return new e(copyOf, l.c(this.f43794x[31]), size() + 1, 0);
    }
}
