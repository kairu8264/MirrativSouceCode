package pi;

/* loaded from: classes3.dex */
public final class d7 implements Runnable {
    public final /* synthetic */ i7 A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ h f47764w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f47765x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f47766y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f47767z;

    public d7(i7 i7Var, h hVar, int i10, long j10, boolean z10) {
        this.A = i7Var;
        this.f47764w = hVar;
        this.f47765x = i10;
        this.f47766y = j10;
        this.f47767z = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A.K(this.f47764w);
        i7.d0(this.A, this.f47764w, this.f47765x, this.f47766y, false, this.f47767z);
    }
}
