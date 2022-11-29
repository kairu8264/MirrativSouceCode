package ai;

/* loaded from: classes3.dex */
public final class g11 implements e43<b11> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e43 f4277a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i11 f4278b;

    public g11(i11 i11Var, e43 e43Var) {
        this.f4278b = i11Var;
        this.f4277a = e43Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        this.f4277a.a(th2);
        hk0.f4882e.execute(new Runnable(this.f4278b) { // from class: ai.f11

            /* renamed from: w  reason: collision with root package name */
            public final i11 f3877w;

            {
                this.f3877w = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f3877w.e();
            }
        });
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(b11 b11Var) {
        i11.b(this.f4278b, b11Var.f2189a, this.f4277a);
    }
}
