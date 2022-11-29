package pi;

/* loaded from: classes3.dex */
public final class o6 implements Runnable {
    public final /* synthetic */ i7 A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f48101w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f48102x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f48103y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f48104z;

    public o6(i7 i7Var, String str, String str2, Object obj, long j10) {
        this.A = i7Var;
        this.f48101w = str;
        this.f48102x = str2;
        this.f48103y = obj;
        this.f48104z = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A.N(this.f48101w, this.f48102x, this.f48103y, this.f48104z);
    }
}
