package ai;

/* loaded from: classes3.dex */
public final class ql0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f8998w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ rl0 f8999x;

    public ql0(rl0 rl0Var, boolean z10) {
        this.f8999x = rl0Var;
        this.f8998w = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8999x.r("windowVisibilityChanged", "isVisible", String.valueOf(this.f8998w));
    }
}
