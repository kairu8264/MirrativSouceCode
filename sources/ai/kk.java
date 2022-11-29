package ai;

/* loaded from: classes3.dex */
public final class kk implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f6250w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f6251x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ ok f6252y;

    public kk(ok okVar, int i10, long j10) {
        this.f6252y = okVar;
        this.f6250w = i10;
        this.f6251x = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pk pkVar;
        pkVar = this.f6252y.f7837b;
        pkVar.z(this.f6250w, this.f6251x);
    }
}
