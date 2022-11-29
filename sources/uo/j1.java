package uo;

/* loaded from: classes4.dex */
public final class j1 extends n {

    /* renamed from: w  reason: collision with root package name */
    public final i1 f56035w;

    public j1(i1 i1Var) {
        this.f56035w = i1Var;
    }

    @Override // uo.o
    public void a(Throwable th2) {
        this.f56035w.dispose();
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
        a(th2);
        return wn.v.f59242a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f56035w + ']';
    }
}
