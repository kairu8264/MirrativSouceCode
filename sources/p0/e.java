package p0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class e<K, V, T> implements Iterator<T>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public final u<K, V, T>[] f45654w;

    /* renamed from: x  reason: collision with root package name */
    public int f45655x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f45656y;

    public e(t<K, V> tVar, u<K, V, T>[] uVarArr) {
        jo.p.h(tVar, "node");
        jo.p.h(uVarArr, "path");
        this.f45654w = uVarArr;
        this.f45656y = true;
        uVarArr[0].k(tVar.p(), tVar.m() * 2);
        this.f45655x = 0;
        e();
    }

    public final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final K d() {
        b();
        return this.f45654w[this.f45655x].b();
    }

    public final void e() {
        if (this.f45654w[this.f45655x].g()) {
            return;
        }
        for (int i10 = this.f45655x; -1 < i10; i10--) {
            int g10 = g(i10);
            if (g10 == -1 && this.f45654w[i10].h()) {
                this.f45654w[i10].j();
                g10 = g(i10);
            }
            if (g10 != -1) {
                this.f45655x = g10;
                return;
            }
            if (i10 > 0) {
                this.f45654w[i10 - 1].j();
            }
            this.f45654w[i10].k(t.f45669e.a().p(), 0);
        }
        this.f45656y = false;
    }

    public final u<K, V, T>[] f() {
        return this.f45654w;
    }

    public final int g(int i10) {
        if (this.f45654w[i10].g()) {
            return i10;
        }
        if (this.f45654w[i10].h()) {
            t<? extends K, ? extends V> d10 = this.f45654w[i10].d();
            if (i10 == 6) {
                this.f45654w[i10 + 1].k(d10.p(), d10.p().length);
            } else {
                this.f45654w[i10 + 1].k(d10.p(), d10.m() * 2);
            }
            return g(i10 + 1);
        }
        return -1;
    }

    public final void h(int i10) {
        this.f45655x = i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f45656y;
    }

    @Override // java.util.Iterator
    public T next() {
        b();
        T next = this.f45654w[this.f45655x].next();
        e();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
