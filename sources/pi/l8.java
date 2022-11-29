package pi;

/* loaded from: classes3.dex */
public final class l8 implements Runnable {
    public final /* synthetic */ w8 A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ na f48027w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f48028x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ u f48029y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f48030z;

    public l8(w8 w8Var, boolean z10, na naVar, boolean z11, u uVar, String str) {
        this.A = w8Var;
        this.f48027w = naVar;
        this.f48028x = z11;
        this.f48029y = uVar;
        this.f48030z = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g3 g3Var;
        g3Var = this.A.f48322d;
        if (g3Var == null) {
            this.A.f48285a.r().p().a("Discarding data. Failed to send event to service");
            return;
        }
        rh.p.i(this.f48027w);
        this.A.p(g3Var, this.f48028x ? null : this.f48029y, this.f48027w);
        this.A.D();
    }
}
