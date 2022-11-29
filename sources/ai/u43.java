package ai;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public final class u43 implements Executor {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Executor f10607w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ a33 f10608x;

    public u43(Executor executor, a33 a33Var) {
        this.f10607w = executor;
        this.f10608x = a33Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f10607w.execute(runnable);
        } catch (RejectedExecutionException e10) {
            this.f10608x.v(e10);
        }
    }
}
