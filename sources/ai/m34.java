package ai;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class m34 implements Executor {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Handler f6783w;

    public m34(o34 o34Var, Handler handler) {
        this.f6783w = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f6783w.post(runnable);
    }
}
