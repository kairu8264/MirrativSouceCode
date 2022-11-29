package pi;

/* loaded from: classes3.dex */
public abstract class r9 extends q9 {

    /* renamed from: c  reason: collision with root package name */
    public boolean f48200c;

    public r9(ba baVar) {
        super(baVar);
        this.f48179b.o();
    }

    public final void g() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void h() {
        if (!this.f48200c) {
            j();
            this.f48179b.j();
            this.f48200c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean i() {
        return this.f48200c;
    }

    public abstract boolean j();
}
