package uo;

/* loaded from: classes4.dex */
public final class k1 extends j2 {
    public final i1 A;

    public k1(i1 i1Var) {
        this.A = i1Var;
    }

    @Override // uo.f0
    public void Q(Throwable th2) {
        this.A.dispose();
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
        Q(th2);
        return wn.v.f59242a;
    }
}
