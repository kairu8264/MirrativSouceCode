package pi;

/* loaded from: classes3.dex */
public final class a7 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Boolean f47589w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i7 f47590x;

    public a7(i7 i7Var, Boolean bool) {
        this.f47590x = i7Var;
        this.f47589w = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47590x.Q(this.f47589w, true);
    }
}
