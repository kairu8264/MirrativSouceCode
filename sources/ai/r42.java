package ai;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class r42 implements Executor {

    /* renamed from: w  reason: collision with root package name */
    public final Handler f9338w;

    public r42(Handler handler) {
        this.f9338w = handler;
    }

    public static Executor a(Handler handler) {
        return new r42(handler);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9338w.post(runnable);
    }
}
