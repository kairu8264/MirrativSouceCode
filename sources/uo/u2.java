package uo;

/* loaded from: classes4.dex */
public final class u2 extends g {

    /* renamed from: w  reason: collision with root package name */
    public final zo.u f56092w;

    public u2(zo.u uVar) {
        this.f56092w = uVar;
    }

    @Override // uo.o
    public void a(Throwable th2) {
        this.f56092w.K();
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
        a(th2);
        return wn.v.f59242a;
    }

    public String toString() {
        return "RemoveOnCancel[" + this.f56092w + ']';
    }
}
