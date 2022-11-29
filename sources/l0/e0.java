package l0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e0 implements Iterator<w0.b>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public final p1 f38975w;

    /* renamed from: x  reason: collision with root package name */
    public final int f38976x;

    /* renamed from: y  reason: collision with root package name */
    public int f38977y;

    /* renamed from: z  reason: collision with root package name */
    public final int f38978z;

    /* loaded from: classes.dex */
    public static final class a implements w0.b, Iterable<w0.b>, ko.a {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f38980x;

        public a(int i10) {
            this.f38980x = i10;
        }

        @Override // java.lang.Iterable
        public Iterator<w0.b> iterator() {
            int G;
            e0.this.f();
            p1 d10 = e0.this.d();
            int i10 = this.f38980x;
            G = q1.G(e0.this.d().k(), this.f38980x);
            return new e0(d10, i10 + 1, i10 + G);
        }
    }

    public e0(p1 p1Var, int i10, int i11) {
        jo.p.h(p1Var, "table");
        this.f38975w = p1Var;
        this.f38976x = i11;
        this.f38977y = i10;
        this.f38978z = p1Var.s();
        if (p1Var.t()) {
            throw new ConcurrentModificationException();
        }
    }

    public final p1 d() {
        return this.f38975w;
    }

    @Override // java.util.Iterator
    /* renamed from: e */
    public w0.b next() {
        int G;
        f();
        int i10 = this.f38977y;
        G = q1.G(this.f38975w.k(), i10);
        this.f38977y = G + i10;
        return new a(i10);
    }

    public final void f() {
        if (this.f38975w.s() != this.f38978z) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38977y < this.f38976x;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
