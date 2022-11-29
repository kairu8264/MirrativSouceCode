package b0;

import b0.c;
import wn.v;

/* loaded from: classes.dex */
public final class o<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final m0.e<c.a<T>> f16710a = new m0.e<>(new c.a[16], 0);

    /* renamed from: b  reason: collision with root package name */
    public int f16711b;

    /* renamed from: c  reason: collision with root package name */
    public c.a<T> f16712c;

    @Override // b0.c
    public int a() {
        return this.f16711b;
    }

    @Override // b0.c
    public void b(int i10, int i11, io.l<? super c.a<T>, v> lVar) {
        int b10;
        jo.p.h(lVar, "block");
        d(i10);
        d(i11);
        if (i11 >= i10) {
            b10 = d.b(this.f16710a, i10);
            int b11 = this.f16710a.n()[b10].b();
            while (b11 <= i11) {
                c.a<T> aVar = this.f16710a.n()[b10];
                lVar.invoke(aVar);
                b11 += aVar.a();
                b10++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i11 + ") should be not smaller than fromIndex (" + i10 + ')').toString());
    }

    public final void c(int i10, T t10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("size should be >=0, but was " + i10).toString());
        } else if (i10 == 0) {
        } else {
            c.a<T> aVar = new c.a<>(a(), i10, t10);
            this.f16711b = a() + i10;
            this.f16710a.c(aVar);
        }
    }

    public final void d(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < a()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i10 + ", size " + a());
    }

    public final boolean e(c.a<T> aVar, int i10) {
        return i10 < aVar.b() + aVar.a() && aVar.b() <= i10;
    }

    public final c.a<T> f(int i10) {
        int b10;
        c.a<T> aVar = this.f16712c;
        if (aVar == null || !e(aVar, i10)) {
            m0.e<c.a<T>> eVar = this.f16710a;
            b10 = d.b(eVar, i10);
            c.a<T> aVar2 = eVar.n()[b10];
            this.f16712c = aVar2;
            return aVar2;
        }
        return aVar;
    }

    @Override // b0.c
    public c.a<T> get(int i10) {
        d(i10);
        return f(i10);
    }
}
