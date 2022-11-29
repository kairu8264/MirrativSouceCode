package ai;

import com.google.android.gms.internal.ads.zzftc;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class j43 extends l43 {
    public static <V> s43<V> a(V v10) {
        if (v10 == null) {
            return (s43<V>) n43.f7189x;
        }
        return new n43(v10);
    }

    public static s43<Void> b() {
        return n43.f7189x;
    }

    public static <V> s43<V> c(Throwable th2) {
        Objects.requireNonNull(th2);
        return new m43(th2);
    }

    public static <O> s43<O> d(Callable<O> callable, Executor executor) {
        i53 i53Var = new i53(callable);
        executor.execute(i53Var);
        return i53Var;
    }

    public static <O> s43<O> e(o33<O> o33Var, Executor executor) {
        i53 i53Var = new i53(o33Var);
        executor.execute(i53Var);
        return i53Var;
    }

    public static <V, X extends Throwable> s43<V> f(s43<? extends V> s43Var, Class<X> cls, bx2<? super X, ? extends V> bx2Var, Executor executor) {
        k23 k23Var = new k23(s43Var, cls, bx2Var);
        s43Var.c(k23Var, z43.c(executor, k23Var));
        return k23Var;
    }

    public static <V, X extends Throwable> s43<V> g(s43<? extends V> s43Var, Class<X> cls, p33<? super X, ? extends V> p33Var, Executor executor) {
        j23 j23Var = new j23(s43Var, cls, p33Var);
        s43Var.c(j23Var, z43.c(executor, j23Var));
        return j23Var;
    }

    public static <V> s43<V> h(s43<V> s43Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return s43Var.isDone() ? s43Var : e53.I(s43Var, j10, timeUnit, scheduledExecutorService);
    }

    public static <I, O> s43<O> i(s43<I> s43Var, p33<? super I, ? extends O> p33Var, Executor executor) {
        int i10 = f33.F;
        Objects.requireNonNull(executor);
        c33 c33Var = new c33(s43Var, p33Var);
        s43Var.c(c33Var, z43.c(executor, c33Var));
        return c33Var;
    }

    public static <I, O> s43<O> j(s43<I> s43Var, bx2<? super I, ? extends O> bx2Var, Executor executor) {
        int i10 = f33.F;
        Objects.requireNonNull(bx2Var);
        d33 d33Var = new d33(s43Var, bx2Var);
        s43Var.c(d33Var, z43.c(executor, d33Var));
        return d33Var;
    }

    public static <V> s43<List<V>> k(Iterable<? extends s43<? extends V>> iterable) {
        return new q33(zz2.y(iterable), true);
    }

    @SafeVarargs
    public static <V> h43<V> l(s43<? extends V>... s43VarArr) {
        return new h43<>(false, zz2.B(s43VarArr), null);
    }

    public static <V> h43<V> m(Iterable<? extends s43<? extends V>> iterable) {
        return new h43<>(false, zz2.y(iterable), null);
    }

    @SafeVarargs
    public static <V> h43<V> n(s43<? extends V>... s43VarArr) {
        return new h43<>(true, zz2.B(s43VarArr), null);
    }

    public static <V> h43<V> o(Iterable<? extends s43<? extends V>> iterable) {
        return new h43<>(true, zz2.y(iterable), null);
    }

    public static <V> void p(s43<V> s43Var, e43<? super V> e43Var, Executor executor) {
        Objects.requireNonNull(e43Var);
        s43Var.c(new g43(s43Var, e43Var), executor);
    }

    public static <V> V q(Future<V> future) throws ExecutionException {
        if (future.isDone()) {
            return (V) j53.a(future);
        }
        throw new IllegalStateException(xx2.d("Future was expected to be done: %s", future));
    }

    public static <V> V r(Future<V> future) {
        try {
            return (V) j53.a(future);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof Error) {
                throw new x33((Error) cause);
            }
            throw new zzftc(cause);
        }
    }
}
