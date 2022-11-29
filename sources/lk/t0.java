package lk;

import com.google.errorprone.annotations.concurrent.LazyInit;

/* loaded from: classes3.dex */
public final class t0<E> extends v<E> {

    /* renamed from: y  reason: collision with root package name */
    public final transient E f40364y;
    @LazyInit

    /* renamed from: z  reason: collision with root package name */
    public transient int f40365z;

    public t0(E e10) {
        this.f40364y = (E) kk.j.i(e10);
    }

    @Override // lk.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f40364y.equals(obj);
    }

    @Override // lk.p
    public int f(Object[] objArr, int i10) {
        objArr[i10] = this.f40364y;
        return i10 + 1;
    }

    @Override // lk.v, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i10 = this.f40365z;
        if (i10 == 0) {
            int hashCode = this.f40364y.hashCode();
            this.f40365z = hashCode;
            return hashCode;
        }
        return i10;
    }

    @Override // lk.p
    public boolean l() {
        return false;
    }

    @Override // lk.v, lk.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public v0<E> iterator() {
        return x.k(this.f40364y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f40364y.toString() + ']';
    }

    @Override // lk.v
    public r<E> u() {
        return r.B(this.f40364y);
    }

    @Override // lk.v
    public boolean w() {
        return this.f40365z != 0;
    }

    public t0(E e10, int i10) {
        this.f40364y = e10;
        this.f40365z = i10;
    }
}
