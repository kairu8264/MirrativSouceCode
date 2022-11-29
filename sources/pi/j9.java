package pi;

/* loaded from: classes3.dex */
public final class j9 extends n {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k9 f47978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(k9 k9Var, x5 x5Var) {
        super(x5Var);
        this.f47978e = k9Var;
    }

    @Override // pi.n
    public final void c() {
        k9 k9Var = this.f47978e;
        k9Var.f48009d.f();
        k9Var.d(false, false, k9Var.f48009d.f48285a.c().elapsedRealtime());
        k9Var.f48009d.f48285a.x().l(k9Var.f48009d.f48285a.c().elapsedRealtime());
    }
}
