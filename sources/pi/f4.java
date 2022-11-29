package pi;

/* loaded from: classes3.dex */
public abstract class f4 extends e3 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f47799b;

    public f4(b5 b5Var) {
        super(b5Var);
        this.f48285a.g();
    }

    public final void g() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void h() {
        if (this.f47799b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (l()) {
            return;
        }
        this.f48285a.e();
        this.f47799b = true;
    }

    public final void i() {
        if (!this.f47799b) {
            j();
            this.f48285a.e();
            this.f47799b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public void j() {
    }

    public final boolean k() {
        return this.f47799b;
    }

    public abstract boolean l();
}
