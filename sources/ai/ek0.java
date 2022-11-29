package ai;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ek0 implements Executor {

    /* renamed from: w  reason: collision with root package name */
    public final Handler f3704w = new yg.q1(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
                return;
            } catch (Throwable th2) {
                wg.t.d();
                yg.d2.o(wg.t.h().q(), th2);
                throw th2;
            }
        }
        this.f3704w.post(runnable);
    }
}
