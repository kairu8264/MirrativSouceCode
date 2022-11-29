package jk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class q implements Executor {

    /* renamed from: w  reason: collision with root package name */
    public final Handler f38089w = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f38089w.post(runnable);
    }
}
