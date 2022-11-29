package vi;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class g0 implements Executor {

    /* renamed from: w  reason: collision with root package name */
    public final Handler f57360w = new mi.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f57360w.post(runnable);
    }
}
