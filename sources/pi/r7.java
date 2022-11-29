package pi;

/* loaded from: classes3.dex */
public final class r7 implements Runnable {
    public final /* synthetic */ w7 A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p7 f48194w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ p7 f48195x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f48196y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f48197z;

    public r7(w7 w7Var, p7 p7Var, p7 p7Var2, long j10, boolean z10) {
        this.A = w7Var;
        this.f48194w = p7Var;
        this.f48195x = p7Var2;
        this.f48196y = j10;
        this.f48197z = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A.n(this.f48194w, this.f48195x, this.f48196y, this.f48197z, null);
    }
}
