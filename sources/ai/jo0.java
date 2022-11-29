package ai;

/* loaded from: classes3.dex */
public final class jo0 extends fo0 {
    public jo0(em0 em0Var) {
        super(em0Var);
    }

    @Override // ai.fo0
    public final boolean f(String str) {
        String d10 = nj0.d(str);
        em0 em0Var = this.f4144y.get();
        if (em0Var != null && d10 != null) {
            em0Var.o(d10, this);
        }
        uj0.f("VideoStreamNoopCache is doing nothing.");
        s(str, d10, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // ai.fo0
    public final void m() {
    }
}
