package uo;

/* loaded from: classes4.dex */
public final class a2 extends n {

    /* renamed from: w  reason: collision with root package name */
    public final io.l<Throwable, wn.v> f55989w;

    /* JADX WARN: Multi-variable type inference failed */
    public a2(io.l<? super Throwable, wn.v> lVar) {
        this.f55989w = lVar;
    }

    @Override // uo.o
    public void a(Throwable th2) {
        this.f55989w.invoke(th2);
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
        a(th2);
        return wn.v.f59242a;
    }

    public String toString() {
        return "InvokeOnCancel[" + v0.a(this.f55989w) + '@' + v0.b(this) + ']';
    }
}
