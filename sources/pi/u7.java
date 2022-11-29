package pi;

/* loaded from: classes3.dex */
public final class u7 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p7 f48268w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f48269x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ w7 f48270y;

    public u7(w7 w7Var, p7 p7Var, long j10) {
        this.f48270y = w7Var;
        this.f48268w = p7Var;
        this.f48269x = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48270y.o(this.f48268w, false, this.f48269x);
        w7 w7Var = this.f48270y;
        w7Var.f48311e = null;
        w7Var.f48285a.L().t(null);
    }
}
