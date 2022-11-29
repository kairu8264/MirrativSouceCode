package pi;

/* loaded from: classes3.dex */
public final class c7 implements Runnable {
    public final /* synthetic */ i7 A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ h f47743w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f47744x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f47745y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f47746z;

    public c7(i7 i7Var, h hVar, int i10, long j10, boolean z10) {
        this.A = i7Var;
        this.f47743w = hVar;
        this.f47744x = i10;
        this.f47745y = j10;
        this.f47746z = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A.K(this.f47743w);
        i7.d0(this.A, this.f47743w, this.f47744x, this.f47745y, false, this.f47746z);
    }
}
