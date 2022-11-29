package vi;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class j0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ i0 f57371w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Callable f57372x;

    public j0(i0 i0Var, Callable callable) {
        this.f57371w = i0Var;
        this.f57372x = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f57371w.w(this.f57372x.call());
        } catch (Exception e10) {
            this.f57371w.v(e10);
        } catch (Throwable th2) {
            this.f57371w.v(new RuntimeException(th2));
        }
    }
}
