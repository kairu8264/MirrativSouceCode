package ai;

/* loaded from: classes3.dex */
public final class h11 implements e43<u01> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e43 f4689a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i11 f4690b;

    public h11(i11 i11Var, e43 e43Var) {
        this.f4690b = i11Var;
        this.f4689a = e43Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        hk0.f4882e.execute(new Runnable(this.f4690b) { // from class: ai.f11

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
        this.f4689a.a(th2);
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(u01 u01Var) {
        hk0.f4882e.execute(new Runnable(this.f4690b) { // from class: ai.f11

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
        this.f4689a.b(u01Var);
    }
}
