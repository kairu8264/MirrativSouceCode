package p0;

import java.util.ConcurrentModificationException;
import jo.j0;

/* loaded from: classes.dex */
public class g<K, V, T> extends e<K, V, T> {
    public K A;
    public boolean B;
    public int C;

    /* renamed from: z  reason: collision with root package name */
    public final f<K, V> f45661z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f<K, V> fVar, u<K, V, T>[] uVarArr) {
        super(fVar.j(), uVarArr);
        jo.p.h(fVar, "builder");
        jo.p.h(uVarArr, "path");
        this.f45661z = fVar;
        this.C = fVar.i();
    }

    public final void i() {
        if (this.f45661z.i() != this.C) {
            throw new ConcurrentModificationException();
        }
    }

    public final void j() {
        if (!this.B) {
            throw new IllegalStateException();
        }
    }

    public final void k(int i10, t<?, ?> tVar, K k10, int i11) {
        int i12 = i11 * 5;
        if (i12 > 30) {
            f()[i11].m(tVar.p(), tVar.p().length, 0);
            while (!jo.p.c(f()[i11].b(), k10)) {
                f()[i11].i();
            }
            h(i11);
            return;
        }
        int f10 = 1 << x.f(i10, i12);
        if (tVar.q(f10)) {
            f()[i11].m(tVar.p(), tVar.m() * 2, tVar.n(f10));
            h(i11);
            return;
        }
        int O = tVar.O(f10);
        t<?, ?> N = tVar.N(O);
        f()[i11].m(tVar.p(), tVar.m() * 2, O);
        k(i10, N, k10, i11 + 1);
    }

    public final void m(K k10, V v10) {
        if (this.f45661z.containsKey(k10)) {
            if (hasNext()) {
                K d10 = d();
                this.f45661z.put(k10, v10);
                k(d10 != null ? d10.hashCode() : 0, this.f45661z.j(), d10, 0);
            } else {
                this.f45661z.put(k10, v10);
            }
            this.C = this.f45661z.i();
        }
    }

    @Override // p0.e, java.util.Iterator
    public T next() {
        i();
        this.A = d();
        this.B = true;
        return (T) super.next();
    }

    @Override // p0.e, java.util.Iterator
    public void remove() {
        j();
        if (hasNext()) {
            K d10 = d();
            j0.d(this.f45661z).remove(this.A);
            k(d10 != null ? d10.hashCode() : 0, this.f45661z.j(), d10, 0);
        } else {
            j0.d(this.f45661z).remove(this.A);
        }
        this.A = null;
        this.B = false;
        this.C = this.f45661z.i();
    }
}
