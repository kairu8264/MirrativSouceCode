package uo;

/* loaded from: classes4.dex */
public final class y2<T, R> extends j2 {
    public final cp.d<R> A;
    public final io.p<T, ao.d<? super R>, Object> B;

    /* JADX WARN: Multi-variable type inference failed */
    public y2(cp.d<? super R> dVar, io.p<? super T, ? super ao.d<? super R>, ? extends Object> pVar) {
        this.A = dVar;
        this.B = pVar;
    }

    @Override // uo.f0
    public void Q(Throwable th2) {
        if (this.A.m()) {
            S().J0(this.A, this.B);
        }
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
        Q(th2);
        return wn.v.f59242a;
    }
}
