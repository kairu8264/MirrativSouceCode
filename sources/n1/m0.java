package n1;

/* loaded from: classes.dex */
public final class m0 implements io.l<Boolean, wn.v> {

    /* renamed from: w  reason: collision with root package name */
    public f0 f41461w;

    public void a(boolean z10) {
        f0 f0Var = this.f41461w;
        if (f0Var == null) {
            return;
        }
        f0Var.c(z10);
    }

    public final void b(f0 f0Var) {
        this.f41461w = f0Var;
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(Boolean bool) {
        a(bool.booleanValue());
        return wn.v.f59242a;
    }
}
