package uo;

/* loaded from: classes4.dex */
public final class c2 extends j2 {
    public final io.l<Throwable, wn.v> A;

    /* JADX WARN: Multi-variable type inference failed */
    public c2(io.l<? super Throwable, wn.v> lVar) {
        this.A = lVar;
    }

    @Override // uo.f0
    public void Q(Throwable th2) {
        this.A.invoke(th2);
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
        Q(th2);
        return wn.v.f59242a;
    }
}
