package pi;

/* loaded from: classes3.dex */
public final class y7 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ na f48384w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f48385x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ ea f48386y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ w8 f48387z;

    public y7(w8 w8Var, na naVar, boolean z10, ea eaVar) {
        this.f48387z = w8Var;
        this.f48384w = naVar;
        this.f48385x = z10;
        this.f48386y = eaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g3 g3Var;
        g3Var = this.f48387z.f48322d;
        if (g3Var == null) {
            this.f48387z.f48285a.r().p().a("Discarding data. Failed to set user property");
            return;
        }
        rh.p.i(this.f48384w);
        this.f48387z.p(g3Var, this.f48385x ? null : this.f48386y, this.f48384w);
        this.f48387z.D();
    }
}
