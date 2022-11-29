package o0;

import java.util.ConcurrentModificationException;
import jo.p;
import po.n;

/* loaded from: classes.dex */
public final class h<T> extends a<T> {
    public k<? extends T> A;
    public int B;

    /* renamed from: y  reason: collision with root package name */
    public final f<T> f43789y;

    /* renamed from: z  reason: collision with root package name */
    public int f43790z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f<T> fVar, int i10) {
        super(i10, fVar.size());
        p.h(fVar, "builder");
        this.f43789y = fVar;
        this.f43790z = fVar.k();
        this.B = -1;
        m();
    }

    @Override // o0.a, java.util.ListIterator
    public void add(T t10) {
        i();
        this.f43789y.add(e(), t10);
        g(e() + 1);
        k();
    }

    public final void i() {
        if (this.f43790z != this.f43789y.k()) {
            throw new ConcurrentModificationException();
        }
    }

    public final void j() {
        if (this.B == -1) {
            throw new IllegalStateException();
        }
    }

    public final void k() {
        h(this.f43789y.size());
        this.f43790z = this.f43789y.k();
        this.B = -1;
        m();
    }

    public final void m() {
        Object[] m10 = this.f43789y.m();
        if (m10 == null) {
            this.A = null;
            return;
        }
        int d10 = l.d(this.f43789y.size());
        int i10 = n.i(e(), d10);
        int p10 = (this.f43789y.p() / 5) + 1;
        k<? extends T> kVar = this.A;
        if (kVar == null) {
            this.A = new k<>(m10, i10, d10, p10);
            return;
        }
        p.e(kVar);
        kVar.m(m10, i10, d10, p10);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        i();
        b();
        this.B = e();
        k<? extends T> kVar = this.A;
        if (kVar == null) {
            Object[] r10 = this.f43789y.r();
            int e10 = e();
            g(e10 + 1);
            return (T) r10[e10];
        } else if (kVar.hasNext()) {
            g(e() + 1);
            return kVar.next();
        } else {
            Object[] r11 = this.f43789y.r();
            int e11 = e();
            g(e11 + 1);
            return (T) r11[e11 - kVar.f()];
        }
    }

    @Override // java.util.ListIterator
    public T previous() {
        i();
        d();
        this.B = e() - 1;
        k<? extends T> kVar = this.A;
        if (kVar == null) {
            Object[] r10 = this.f43789y.r();
            g(e() - 1);
            return (T) r10[e()];
        } else if (e() > kVar.f()) {
            Object[] r11 = this.f43789y.r();
            g(e() - 1);
            return (T) r11[e() - kVar.f()];
        } else {
            g(e() - 1);
            return kVar.previous();
        }
    }

    @Override // o0.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        i();
        j();
        this.f43789y.remove(this.B);
        if (this.B < e()) {
            g(this.B);
        }
        k();
    }

    @Override // o0.a, java.util.ListIterator
    public void set(T t10) {
        i();
        j();
        this.f43789y.set(this.B, t10);
        this.f43790z = this.f43789y.k();
        m();
    }
}
