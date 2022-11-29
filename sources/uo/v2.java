package uo;

import wn.l;

/* loaded from: classes4.dex */
public final class v2<T> extends j2 {
    public final q<T> A;

    /* JADX WARN: Multi-variable type inference failed */
    public v2(q<? super T> qVar) {
        this.A = qVar;
    }

    @Override // uo.f0
    public void Q(Throwable th2) {
        Object n02 = S().n0();
        if (u0.a() && !(!(n02 instanceof x1))) {
            throw new AssertionError();
        }
        if (n02 instanceof d0) {
            q<T> qVar = this.A;
            l.a aVar = wn.l.f59224w;
            qVar.resumeWith(wn.l.a(wn.m.a(((d0) n02).f55999a)));
            return;
        }
        q<T> qVar2 = this.A;
        l.a aVar2 = wn.l.f59224w;
        qVar2.resumeWith(wn.l.a(l2.h(n02)));
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
        Q(th2);
        return wn.v.f59242a;
    }
}
