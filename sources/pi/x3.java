package pi;

/* loaded from: classes3.dex */
public final class x3 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f48336w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ y3 f48337x;

    public x3(y3 y3Var, boolean z10) {
        this.f48337x = y3Var;
        this.f48336w = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ba baVar;
        baVar = this.f48337x.f48369a;
        baVar.l(this.f48336w);
    }
}
