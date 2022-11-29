package pi;

/* loaded from: classes3.dex */
public final class f8 extends n {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ w8 f47814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(w8 w8Var, x5 x5Var) {
        super(x5Var);
        this.f47814e = w8Var;
    }

    @Override // pi.n
    public final void c() {
        w8 w8Var = this.f47814e;
        w8Var.f();
        if (w8Var.y()) {
            w8Var.f48285a.r().u().a("Inactivity, disconnecting from the service");
            w8Var.Q();
        }
    }
}
