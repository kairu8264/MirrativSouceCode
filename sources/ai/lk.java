package ai;

/* loaded from: classes3.dex */
public final class lk implements Runnable {
    public final /* synthetic */ ok A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f6585w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f6586x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f6587y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f6588z;

    public lk(ok okVar, int i10, int i11, int i12, float f10) {
        this.A = okVar;
        this.f6585w = i10;
        this.f6586x = i11;
        this.f6587y = i12;
        this.f6588z = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pk pkVar;
        pkVar = this.A.f7837b;
        pkVar.r(this.f6585w, this.f6586x, this.f6587y, this.f6588z);
    }
}
