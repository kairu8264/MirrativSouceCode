package vi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class j {
    public static <TResult> TResult a(g<TResult> gVar) throws ExecutionException, InterruptedException {
        rh.p.g();
        rh.p.j(gVar, "Task must not be null");
        if (gVar.r()) {
            return (TResult) j(gVar);
        }
        m mVar = new m(null);
        k(gVar, mVar);
        mVar.b();
        return (TResult) j(gVar);
    }

    public static <TResult> TResult b(g<TResult> gVar, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        rh.p.g();
        rh.p.j(gVar, "Task must not be null");
        rh.p.j(timeUnit, "TimeUnit must not be null");
        if (gVar.r()) {
            return (TResult) j(gVar);
        }
        m mVar = new m(null);
        k(gVar, mVar);
        if (mVar.d(j10, timeUnit)) {
            return (TResult) j(gVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> g<TResult> c(Executor executor, Callable<TResult> callable) {
        rh.p.j(executor, "Executor must not be null");
        rh.p.j(callable, "Callback must not be null");
        i0 i0Var = new i0();
        executor.execute(new j0(i0Var, callable));
        return i0Var;
    }

    public static <TResult> g<TResult> d(Exception exc) {
        i0 i0Var = new i0();
        i0Var.v(exc);
        return i0Var;
    }

    public static <TResult> g<TResult> e(TResult tresult) {
        i0 i0Var = new i0();
        i0Var.w(tresult);
        return i0Var;
    }

    public static g<Void> f(Collection<? extends g<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            for (g<?> gVar : collection) {
                Objects.requireNonNull(gVar, "null tasks are not accepted");
            }
            i0 i0Var = new i0();
            o oVar = new o(collection.size(), i0Var);
            for (g<?> gVar2 : collection) {
                k(gVar2, oVar);
            }
            return i0Var;
        }
        return e(null);
    }

    public static g<Void> g(g<?>... gVarArr) {
        if (gVarArr != null && gVarArr.length != 0) {
            return f(Arrays.asList(gVarArr));
        }
        return e(null);
    }

    public static g<List<g<?>>> h(Collection<? extends g<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            return f(collection).l(i.f57363a, new k(collection));
        }
        return e(Collections.emptyList());
    }

    public static g<List<g<?>>> i(g<?>... gVarArr) {
        if (gVarArr != null && gVarArr.length != 0) {
            return h(Arrays.asList(gVarArr));
        }
        return e(Collections.emptyList());
    }

    public static <TResult> TResult j(g<TResult> gVar) throws ExecutionException {
        if (gVar.s()) {
            return gVar.o();
        }
        if (gVar.q()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(gVar.n());
    }

    public static <T> void k(g<T> gVar, n<? super T> nVar) {
        Executor executor = i.f57364b;
        gVar.h(executor, nVar);
        gVar.e(executor, nVar);
        gVar.a(executor, nVar);
    }
}
