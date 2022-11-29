package ai;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public abstract class u33<T> extends r43<T> {

    /* renamed from: y  reason: collision with root package name */
    public final Executor f10600y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ v33 f10601z;

    public u33(v33 v33Var, Executor executor) {
        this.f10601z = v33Var;
        Objects.requireNonNull(executor);
        this.f10600y = executor;
    }

    @Override // ai.r43
    public final boolean d() {
        return this.f10601z.isDone();
    }

    @Override // ai.r43
    public final void e(T t10) {
        this.f10601z.L = null;
        h(t10);
    }

    @Override // ai.r43
    public final void f(Throwable th2) {
        this.f10601z.L = null;
        if (th2 instanceof ExecutionException) {
            this.f10601z.v(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            this.f10601z.cancel(false);
        } else {
            this.f10601z.v(th2);
        }
    }

    public abstract void h(T t10);

    public final void i() {
        try {
            this.f10600y.execute(this);
        } catch (RejectedExecutionException e10) {
            this.f10601z.v(e10);
        }
    }
}
