package ro;

import java.util.Iterator;
import java.util.NoSuchElementException;
import jo.p;
import wn.l;
import wn.v;

/* loaded from: classes4.dex */
public final class h<T> extends i<T> implements Iterator<T>, ao.d<v>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public int f51624w;

    /* renamed from: x  reason: collision with root package name */
    public T f51625x;

    /* renamed from: y  reason: collision with root package name */
    public Iterator<? extends T> f51626y;

    /* renamed from: z  reason: collision with root package name */
    public ao.d<? super v> f51627z;

    @Override // ro.i
    public Object b(T t10, ao.d<? super v> dVar) {
        this.f51625x = t10;
        this.f51624w = 3;
        this.f51627z = dVar;
        Object c10 = bo.c.c();
        if (c10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return c10 == bo.c.c() ? c10 : v.f59242a;
    }

    public final Throwable e() {
        int i10 = this.f51624w;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f51624w);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final T f() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public final void g(ao.d<? super v> dVar) {
        this.f51627z = dVar;
    }

    @Override // ao.d
    public ao.g getContext() {
        return ao.h.f16651w;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i10 = this.f51624w;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw e();
                }
                Iterator<? extends T> it = this.f51626y;
                p.e(it);
                if (it.hasNext()) {
                    this.f51624w = 2;
                    return true;
                }
                this.f51626y = null;
            }
            this.f51624w = 5;
            ao.d<? super v> dVar = this.f51627z;
            p.e(dVar);
            this.f51627z = null;
            l.a aVar = wn.l.f59224w;
            dVar.resumeWith(wn.l.a(v.f59242a));
        }
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.f51624w;
        if (i10 == 0 || i10 == 1) {
            return f();
        }
        if (i10 == 2) {
            this.f51624w = 1;
            Iterator<? extends T> it = this.f51626y;
            p.e(it);
            return it.next();
        } else if (i10 == 3) {
            this.f51624w = 0;
            T t10 = this.f51625x;
            this.f51625x = null;
            return t10;
        } else {
            throw e();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // ao.d
    public void resumeWith(Object obj) {
        wn.m.b(obj);
        this.f51624w = 4;
    }
}
