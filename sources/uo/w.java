package uo;

/* loaded from: classes4.dex */
public final class w extends e2 implements v {
    public final x A;

    public w(x xVar) {
        this.A = xVar;
    }

    @Override // uo.f0
    public void Q(Throwable th2) {
        this.A.j(S());
    }

    @Override // uo.v
    public boolean c(Throwable th2) {
        return S().a0(th2);
    }

    @Override // uo.v
    public d2 getParent() {
        return S();
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
        Q(th2);
        return wn.v.f59242a;
    }
}
