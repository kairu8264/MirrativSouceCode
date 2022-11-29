package pi;

/* loaded from: classes3.dex */
public final class b7 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ i7 B;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ h f47647w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f47648x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f47649y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f47650z;

    public b7(i7 i7Var, h hVar, long j10, int i10, long j11, boolean z10) {
        this.B = i7Var;
        this.f47647w = hVar;
        this.f47648x = j10;
        this.f47649y = i10;
        this.f47650z = j11;
        this.A = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.B.K(this.f47647w);
        this.B.y(this.f47648x, false);
        i7.d0(this.B, this.f47647w, this.f47649y, this.f47650z, true, this.A);
    }
}
