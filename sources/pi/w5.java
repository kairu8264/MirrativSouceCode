package pi;

/* loaded from: classes3.dex */
public abstract class w5 extends v5 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f48306b;

    public w5(b5 b5Var) {
        super(b5Var);
        this.f48285a.g();
    }

    public void g() {
    }

    public abstract boolean h();

    public final void i() {
        if (!l()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (!this.f48306b) {
            if (h()) {
                return;
            }
            this.f48285a.e();
            this.f48306b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void k() {
        if (!this.f48306b) {
            g();
            this.f48285a.e();
            this.f48306b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean l() {
        return this.f48306b;
    }
}
