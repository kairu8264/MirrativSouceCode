package ai;

/* loaded from: classes3.dex */
public final class i70 implements qk0<e60> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j70 f5129a;

    public i70(j70 j70Var) {
        this.f5129a = j70Var;
    }

    @Override // ai.qk0
    public final /* bridge */ /* synthetic */ void a(e60 e60Var) {
        final e60 e60Var2 = e60Var;
        hk0.f4882e.execute(new Runnable(this, e60Var2) { // from class: ai.h70

            /* renamed from: w  reason: collision with root package name */
            public final i70 f4767w;

            /* renamed from: x  reason: collision with root package name */
            public final e60 f4768x;

            {
                this.f4767w = this;
                this.f4768x = e60Var2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e60 e60Var3 = this.f4768x;
                e60Var3.z0("/result", q30.f8793o);
                e60Var3.h();
            }
        });
    }
}
