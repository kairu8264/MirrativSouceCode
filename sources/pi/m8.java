package pi;

/* loaded from: classes3.dex */
public final class m8 implements Runnable {
    public final /* synthetic */ w8 A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ na f48044w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f48045x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ c f48046y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ c f48047z;

    public m8(w8 w8Var, boolean z10, na naVar, boolean z11, c cVar, c cVar2) {
        this.A = w8Var;
        this.f48044w = naVar;
        this.f48045x = z11;
        this.f48046y = cVar;
        this.f48047z = cVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g3 g3Var;
        g3Var = this.A.f48322d;
        if (g3Var == null) {
            this.A.f48285a.r().p().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        rh.p.i(this.f48044w);
        this.A.p(g3Var, this.f48045x ? null : this.f48046y, this.f48044w);
        this.A.D();
    }
}
