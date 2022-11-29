package pi;

/* loaded from: classes3.dex */
public final class t7 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f48241w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ w7 f48242x;

    public t7(w7 w7Var, long j10) {
        this.f48242x = w7Var;
        this.f48241w = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48242x.f48285a.x().l(this.f48241w);
        this.f48242x.f48311e = null;
    }
}
