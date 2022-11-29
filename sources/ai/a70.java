package ai;

/* loaded from: classes3.dex */
public final class a70 implements ok0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j70 f1772a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k70 f1773b;

    public a70(k70 k70Var, j70 j70Var) {
        this.f1773b = k70Var;
        this.f1772a = j70Var;
    }

    @Override // ai.ok0
    public final void zza() {
        Object obj;
        obj = this.f1773b.f6106a;
        synchronized (obj) {
            this.f1773b.f6113h = 1;
            yg.p1.k("Failed loading new engine. Marking new engine destroyable.");
            this.f1772a.h();
        }
    }
}
