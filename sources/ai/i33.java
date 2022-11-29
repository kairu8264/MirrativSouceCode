package ai;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class i33<InputT, OutputT> extends n33<OutputT> {
    public static final Logger K = Logger.getLogger(i33.class.getName());
    public uz2<? extends s43<? extends InputT>> H;
    public final boolean I;
    public final boolean J;

    public i33(uz2<? extends s43<? extends InputT>> uz2Var, boolean z10, boolean z11) {
        super(uz2Var.size());
        this.H = uz2Var;
        this.I = z10;
        this.J = z11;
    }

    public static void P(Throwable th2) {
        K.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th2 instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
    }

    public static boolean R(Set<Throwable> set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    public static /* synthetic */ void V(i33 i33Var, uz2 uz2Var) {
        int J = i33Var.J();
        int i10 = 0;
        lx2.b(J >= 0, "Less than 0 remaining futures");
        if (J == 0) {
            if (uz2Var != null) {
                b23 it = uz2Var.iterator();
                while (it.hasNext()) {
                    Future<? extends InputT> future = (Future) it.next();
                    if (!future.isCancelled()) {
                        i33Var.Q(i10, future);
                    }
                    i10++;
                }
            }
            i33Var.K();
            i33Var.M();
            i33Var.N(2);
        }
    }

    @Override // ai.n33
    public final void L(Set<Throwable> set) {
        Objects.requireNonNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable a10 = a();
        a10.getClass();
        R(set, a10);
    }

    public abstract void M();

    public void N(int i10) {
        this.H = null;
    }

    public final void O(Throwable th2) {
        Objects.requireNonNull(th2);
        if (this.I && !v(th2) && R(I(), th2)) {
            P(th2);
        } else if (th2 instanceof Error) {
            P(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(int i10, Future<? extends InputT> future) {
        try {
            W(i10, j43.q(future));
        } catch (ExecutionException e10) {
            O(e10.getCause());
        } catch (Throwable th2) {
            O(th2);
        }
    }

    public final void T() {
        uz2<? extends s43<? extends InputT>> uz2Var = this.H;
        uz2Var.getClass();
        if (uz2Var.isEmpty()) {
            M();
        } else if (this.I) {
            b23<? extends s43<? extends InputT>> it = this.H.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                s43<? extends InputT> next = it.next();
                next.c(new g33(this, next, i10), w33.INSTANCE);
                i10++;
            }
        } else {
            h33 h33Var = new h33(this, this.J ? this.H : null);
            b23<? extends s43<? extends InputT>> it2 = this.H.iterator();
            while (it2.hasNext()) {
                it2.next().c(h33Var, w33.INSTANCE);
            }
        }
    }

    public abstract void W(int i10, InputT inputt);

    @Override // ai.a33
    public final String h() {
        uz2<? extends s43<? extends InputT>> uz2Var = this.H;
        return uz2Var != null ? "futures=".concat(uz2Var.toString()) : super.h();
    }

    @Override // ai.a33
    public final void j() {
        uz2<? extends s43<? extends InputT>> uz2Var = this.H;
        N(1);
        if ((uz2Var != null) && isCancelled()) {
            boolean t10 = t();
            b23<? extends s43<? extends InputT>> it = uz2Var.iterator();
            while (it.hasNext()) {
                it.next().cancel(t10);
            }
        }
    }
}
